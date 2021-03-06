package com.p683ss.android.ugc.aweme.p2271sp;

import android.app.Instrumentation;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build.VERSION;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.common.utility.p526f.C9407a;
import com.p683ss.android.ugc.aweme.p1341an.C22574a;
import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.sp.SharedPreferencesManager */
public class SharedPreferencesManager {
    private static final String TAG = "SharedPreferencesManage";
    private Constructor constructor;
    private boolean hasObtained;
    private HashMap lockMap;
    private Map<String, File> mOrignalSharedPrefsPaths;
    private File mPreferencesDir;
    private Map<String, File> mSharedPrefsPaths;
    private Map<File, SharedPreferences> sSharedPrefsCache;
    private Class<?> sharedPreferencesImplClass;

    /* renamed from: com.ss.android.ugc.aweme.sp.SharedPreferencesManager$a */
    static class C45656a {

        /* renamed from: a */
        public static SharedPreferencesManager f115450a = new SharedPreferencesManager();
    }

    public static SharedPreferencesManager getInstance() {
        return C45656a.f115450a;
    }

    private SharedPreferencesManager() {
        this.sSharedPrefsCache = Collections.synchronizedMap(new HashMap());
        this.mSharedPrefsPaths = Collections.synchronizedMap(new HashMap());
        this.lockMap = new HashMap();
    }

    public static void hookInstrumentation() {
        try {
            Method declaredMethod = Class.forName("android.app.ActivityThread").getDeclaredMethod("currentActivityThread", new Class[0]);
            if (declaredMethod != null) {
                declaredMethod.setAccessible(true);
                Object invoke = declaredMethod.invoke(null, new Object[0]);
                if (invoke != null) {
                    Field declaredField = invoke.getClass().getDeclaredField("mInstrumentation");
                    if (declaredField != null) {
                        declaredField.setAccessible(true);
                        Instrumentation instrumentation = (Instrumentation) declaredField.get(invoke);
                        if (instrumentation != null && !(instrumentation instanceof C45674g)) {
                            declaredField.set(invoke, new C45674g(instrumentation));
                        }
                    }
                }
            }
        } catch (Exception unused) {
        }
    }

    private File getDataDirAbove24(Context context) {
        return context.getDataDir();
    }

    private static File ensurePrivateDirExists(File file) {
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    private File getDataDir(Context context) {
        if (VERSION.SDK_INT >= 24) {
            return getDataDirAbove24(context);
        }
        return context.getFilesDir().getParentFile();
    }

    private File getPreferencesDir(Context context) {
        if (this.mPreferencesDir == null) {
            this.mPreferencesDir = new File(getDataDir(context), "shared_prefs");
        }
        return ensurePrivateDirExists(this.mPreferencesDir);
    }

    private File getSharedPreferencesPath(Context context, String str) {
        File preferencesDir = getPreferencesDir(context);
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(".xml");
        return makeFilename(preferencesDir, sb.toString());
    }

    private File makeFilename(File file, String str) {
        if (str.indexOf(File.separatorChar) < 0) {
            return new File(file, str);
        }
        StringBuilder sb = new StringBuilder("File ");
        sb.append(str);
        sb.append(" contains a path separator");
        throw new IllegalArgumentException(sb.toString());
    }

    public SharedPreferences getSharedPreferences(Context context, String str) {
        if (context == null || TextUtils.isEmpty(str)) {
            return null;
        }
        File file = (File) this.mSharedPrefsPaths.get(str);
        long j = 0;
        if (file == null) {
            j = SystemClock.uptimeMillis();
            Object obj = this.lockMap.get(str);
            if (obj == null) {
                synchronized (this.lockMap) {
                    obj = this.lockMap.get(str);
                    if (obj == null) {
                        obj = new Object();
                        this.lockMap.put(str, obj);
                    }
                }
            }
            synchronized (obj) {
                file = (File) this.mSharedPrefsPaths.get(str);
                if (file == null) {
                    file = getSharedPreferencesPath(context, str);
                    if (!this.hasObtained && this.mOrignalSharedPrefsPaths == null) {
                        Context context2 = (Context) C9407a.m18598a((Object) context, "mBase");
                        if (context2 != null) {
                            this.mOrignalSharedPrefsPaths = (Map) C9407a.m18598a((Object) context2, "mSharedPrefsPaths");
                        }
                        this.hasObtained = true;
                    }
                    if (this.mOrignalSharedPrefsPaths != null && this.mOrignalSharedPrefsPaths.containsValue(file)) {
                        return null;
                    }
                    this.mSharedPrefsPaths.put(str, file);
                }
            }
        }
        return getSharedPreferences(str, file, j);
    }

    public SharedPreferences getSharedPreferences(String str, File file, long j) {
        SharedPreferences sharedPreferences = (SharedPreferences) this.sSharedPrefsCache.get(file);
        if (sharedPreferences == null) {
            if (j == 0) {
                j = SystemClock.uptimeMillis();
            }
            synchronized (file) {
                sharedPreferences = (SharedPreferences) this.sSharedPrefsCache.get(file);
                if (sharedPreferences == null) {
                    sharedPreferences = new C45665e(str, file);
                    this.sSharedPrefsCache.put(file, sharedPreferences);
                }
            }
        }
        C22574a f = C22574a.m55738f();
        if (j > 0 && Looper.getMainLooper() == Looper.myLooper()) {
            f.f60709j.put(str, Long.valueOf(SystemClock.uptimeMillis() - j));
        }
        return sharedPreferences;
    }
}
