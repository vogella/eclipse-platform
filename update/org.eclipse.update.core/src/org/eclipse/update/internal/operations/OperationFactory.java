/*******************************************************************************
 * Copyright (c) 2000, 2003 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Common Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/cpl-v10.html
 * 
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.eclipse.update.internal.operations;

import org.eclipse.update.configuration.*;
import org.eclipse.update.core.*;
import org.eclipse.update.operations.*;

public class OperationFactory implements IOperationFactory {

	public OperationFactory() {
	}

	public IConfigFeatureOperation createConfigOperation(
		IInstallConfiguration config,
		IConfiguredSite targetSite,
		IFeature feature) {
		return new ConfigOperation(config, targetSite, feature);
	}

	public IBatchOperation createBatchInstallOperation(IInstallFeatureOperation[] operations) {
		return new BatchInstallOperation(operations);
	}

	public IInstallFeatureOperation createInstallOperation(
		IInstallConfiguration config,
		IConfiguredSite targetSite,
		IFeature feature,
		IFeatureReference[] optionalFeatures,
		IFeature[] unconfiguredOptionalFeatures,
		IVerificationListener verifier) {
		return new InstallOperation(
			config,
			targetSite,
			feature,
			optionalFeatures,
			unconfiguredOptionalFeatures,
			verifier);
	}

	public IUnconfigFeatureOperation createUnconfigOperation(
		IInstallConfiguration config,
		IConfiguredSite targetSite,
		IFeature feature) {
		return new UnconfigOperation(config, targetSite, feature);
	}

	public IUninstallFeatureOperation createUninstallOperation(
		IInstallConfiguration config,
		IConfiguredSite targetSite,
		IFeature feature) {
		return new UninstallOperation(config, targetSite, feature);
	}

	public IRevertConfigurationOperation createRevertConfigurationOperation(
		IInstallConfiguration config,
		IProblemHandler problemHandler) {
		return new RevertConfigurationOperation(
			config,
			problemHandler);
	}

	public IToggleSiteOperation createToggleSiteOperation(
		IConfiguredSite site) {
		return new ToggleSiteOperation(site);
	}
}
