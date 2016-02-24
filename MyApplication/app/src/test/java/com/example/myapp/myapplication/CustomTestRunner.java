package com.example.myapp.myapplication;

import org.junit.runners.model.InitializationError;
import org.robolectric.RobolectricGradleTestRunner;
import org.robolectric.annotation.Config;
import org.robolectric.manifest.AndroidManifest;
import org.robolectric.res.FsFile;

public class CustomTestRunner extends RobolectricGradleTestRunner {

    public CustomTestRunner(Class<?> klass) throws InitializationError {
        super(klass);
    }

    protected AndroidManifest getAppManifest(Config config) {
        AndroidManifest appManifest = super.getAppManifest(config);
        FsFile androidManifestFile = appManifest.getAndroidManifestFile();
        return new AndroidManifest(androidManifestFile, appManifest.getResDirectory(), appManifest.getAssetsDirectory(),
                                   appManifest.getPackageName());
    }
}
