/*******************************************************************************
 * Copyright (c) 2014 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Obeo - initial API and implementation
 *******************************************************************************/
package org.obeonetwork.dsl.uml2.design.utils;

import org.eclipse.emf.common.util.URI;
import org.eclipse.sirius.business.api.componentization.ViewpointRegistry;
import org.eclipse.sirius.viewpoint.description.Viewpoint;

/**
 * UML Viewpoints.
 *
 * @author Melanie Bats <a href="mailto:melanie.bats@obeo.fr">melanie.bats@obeo.fr</a>
 */
public class UmlViewpoints {

	/**
	 * UML viewpoints from viewpoint registry.
	 *
	 * @return UML viewpoints from viewpoint registry
	 */
	public static UmlViewpoints fromViewpointRegistry() {
		return new UmlViewpoints(ViewpointRegistry.getInstance());
	}

	private final ViewpointRegistry registry;

	/**
	 * Constructor.
	 *
	 * @param registry
	 *            Viewpoint registry
	 */
	public UmlViewpoints(ViewpointRegistry registry) {
		this.registry = registry;
	}

	/**
	 * Capture.
	 *
	 * @return viewpoint
	 */
	public Viewpoint capture() {
		return registry.getViewpoint(URI.createURI("viewpoint:/org.obeonetwork.dsl.uml2.design/Capture")); //$NON-NLS-1$
	}

	/**
	 * Dashboard.
	 *
	 * @return viewpoint
	 */
	public Viewpoint dashboard() {
		return registry.getViewpoint(URI.createURI("viewpoint:/org.obeonetwork.dsl.uml2.design/Dashboard")); //$NON-NLS-1$
	}

	/**
	 * Design.
	 *
	 * @return viewpoint
	 */
	public Viewpoint design() {
		return registry.getViewpoint(URI.createURI("viewpoint:/org.obeonetwork.dsl.uml2.design/Design")); //$NON-NLS-1$
	}

	/**
	 * Extend.
	 *
	 * @return viewpoint
	 */
	public Viewpoint extend() {
		return registry.getViewpoint(URI.createURI("viewpoint:/org.obeonetwork.dsl.uml2.design/Extend")); //$NON-NLS-1$
	}

	/**
	 * Review.
	 *
	 * @return viewpoint
	 */
	public Viewpoint review() {
		return registry.getViewpoint(URI.createURI("viewpoint:/org.obeonetwork.dsl.uml2.design/Review")); //$NON-NLS-1$
	}
}
