/**********************************************************************
 * Copyright (c) 2005, 2009 IBM Corporation and others. All rights reserved. This
 * program and the accompanying materials are made available under the terms of
 * the Eclipse Public License v1.0 which accompanies this distribution, and is
 * available at http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors: 
 * IBM - Initial API and implementation
 **********************************************************************/
package org.eclipse.ant.internal.launching.debug;

import org.eclipse.osgi.util.NLS;

public class AntDebugMessages extends NLS {
	private static final String BUNDLE_NAME = "org.eclipse.ant.internal.launching.debug.AntDebugMessages";//$NON-NLS-1$
    
	public static String AntSourceContainer_0;

	static {
		// load message values from bundle file
		NLS.initializeMessages(BUNDLE_NAME, AntDebugMessages.class);
	}
}