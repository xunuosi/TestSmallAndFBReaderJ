package com.paragon.dictionary.fbreader.application;

import android.app.Application;
import android.content.Context;

import org.geometerplus.android.fbreader.config.ConfigShadow;
import org.geometerplus.zlibrary.ui.android.image.ZLAndroidImageManager;
import org.geometerplus.zlibrary.ui.android.library.ZLAndroidLibrary;

/**
 * Created by xns on 2017/4/11.
 */

public class StubApplication {
    private ZLAndroidLibrary myLibrary;
    private ConfigShadow myConfig;
    private Application mContext;

    public StubApplication() {

    }

    public void onCreate() {

        // this is a workaround for strange issue on some devices:
        //    NoClassDefFoundError for android.os.AsyncTask
        try {
            Class.forName("android.os.AsyncTask");
        } catch (Throwable t) {
        }

        myConfig = new ConfigShadow(mContext);
        new ZLAndroidImageManager();
        myLibrary = new ZLAndroidLibrary(mContext);
    }

    private static class HolderClass  {
        private final static StubApplication instance = new StubApplication();
    }

    public static StubApplication getInstance() {
        return HolderClass.instance;
    }

    public StubApplication setContext(Application context) {
        mContext = context;
        return this;
    }

    public final ZLAndroidLibrary library() {
        return myLibrary;
    }

    public Application getApplication() {
        return mContext;
    }
}
