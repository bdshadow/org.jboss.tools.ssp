/*******************************************************************************
 * Copyright (c) 2018 Red Hat, Inc. Distributed under license by Red Hat, Inc.
 * All rights reserved. This program is made available under the terms of the
 * Eclipse Public License v1.0 which accompanies this distribution, and is
 * available at http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors: Red Hat, Inc.
 ******************************************************************************/
package org.jboss.tools.rsp.server.minishift.discovery;

import org.jboss.tools.rsp.server.minishift.discovery.MinishiftVersionLoader.MinishiftVersions;
import org.jboss.tools.rsp.server.minishift.servertype.impl.MinishiftServerTypes;

public class CDKBeanType extends MinishiftBeanType {
	
	protected CDKBeanType() {
		super("CDK", "CDK 3.x");
	}

	protected boolean isSupported(MinishiftVersions vers) {
		return vers.getCDKVersion() != null;
	}

	@Override
	public String getServerAdapterTypeId(String version) {
		return MinishiftServerTypes.CDK_3X_ID;
	}
	
	protected String getFullVersion(MinishiftVersions props) {
		if( props != null ) {
			if( isSupported(props) && props.getMinishiftVersion() != null && props.getCDKVersion() != null) {
				return props.getCDKVersion();
			}
		}
		return null;
	}
}
