package org.obeonetwork.dsl.uml2.design.utils;

import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.ui.business.api.viewpoint.ViewpointSelectionCallback;
import org.eclipse.sirius.viewpoint.description.Viewpoint;

/**
 * Set of utilities to manage UML projects.
 *
 * @author Melanie Bats <a href="mailto:melanie.bats@obeo.fr">melanie.bats@obeo.fr</a>
 */
public class UmlProjectUtils {

	/**
	 * Enable UML viewpoints.
	 *
	 * @param session
	 *            Session
	 */
	public static void enableUMLViewpoints(final Session session) {
		if (session != null) {
			session.getTransactionalEditingDomain().getCommandStack()
			.execute(new RecordingCommand(session.getTransactionalEditingDomain()) {
				@Override
				protected void doExecute() {
					final ViewpointSelectionCallback selection = new ViewpointSelectionCallback();
					for (final Viewpoint previouslySelected : session.getSelectedViewpoints(false)) {
						selection.deselectViewpoint(previouslySelected, session,
								new NullProgressMonitor());
					}
					selection.selectViewpoint(UmlViewpoints.fromViewpointRegistry().capture(),
							session, new NullProgressMonitor());
					selection.selectViewpoint(UmlViewpoints.fromViewpointRegistry().design(),
							session, new NullProgressMonitor());
					selection.selectViewpoint(UmlViewpoints.fromViewpointRegistry().review(),
							session, new NullProgressMonitor());
					selection.selectViewpoint(UmlViewpoints.fromViewpointRegistry().dashboard(),
							session, new NullProgressMonitor());
					selection.selectViewpoint(UmlViewpoints.fromViewpointRegistry().extend(),
							session, new NullProgressMonitor());
				}
			});
		}
	}

}
