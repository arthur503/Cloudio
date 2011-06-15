/*******************************************************************************
 * Copyright (c) 2011 Department of Computational Linguistics, University of Cologne, Germany.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Department of Computational Linguistics, University of Cologne, Germany - initial API and implementation
 ******************************************************************************/
package org.schwiebert.cloudio.application.actions;

import org.eclipse.jface.action.IAction;

/**
 * 
 * @author sschwieb
 *
 */
public class ZoomFitAction extends AbstractTagCloudAction {

	@Override
	public void run(IAction action) {
		getViewer().zoomFit();
	}

}
