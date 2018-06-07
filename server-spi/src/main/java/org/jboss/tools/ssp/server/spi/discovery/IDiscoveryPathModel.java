/*******************************************************************************
 * Copyright (c) 2018 Red Hat, Inc. Distributed under license by Red Hat, Inc.
 * All rights reserved. This program is made available under the terms of the
 * Eclipse Public License v1.0 which accompanies this distribution, and is
 * available at http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors: Red Hat, Inc.
 ******************************************************************************/
package org.jboss.tools.ssp.server.spi.discovery;

import java.util.List;

import org.jboss.tools.ssp.api.dao.DiscoveryPath;

public interface IDiscoveryPathModel {

	public void addListener(IDiscoveryPathListener l);

	public void removeListener(IDiscoveryPathListener l);

	public List<DiscoveryPath> getPaths();
	
	public void addPath(DiscoveryPath path);
	
	public void removePath(DiscoveryPath path);
	
	public boolean containsPath(DiscoveryPath path);
}
