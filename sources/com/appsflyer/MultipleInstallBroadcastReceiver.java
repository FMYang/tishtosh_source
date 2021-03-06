package com.appsflyer;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import com.p683ss.android.ugc.aweme.keva.C35807d;

public class MultipleInstallBroadcastReceiver extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        String str;
        if (intent != null) {
            try {
                str = intent.getStringExtra("referrer");
            } catch (Throwable th) {
                AFLogger.afErrorLog("error in BroadcastReceiver ", th);
                str = null;
            }
            if (str != null) {
                if ("AppsFlyer_Test".equals(str) && intent.getStringExtra("TestIntegrationMode") != null) {
                    AppsFlyerLib.getInstance().mo6949(context, intent);
                    return;
                } else if (C35807d.m80935a(context, "appsflyer-data", 0).getString("referrer", null) != null) {
                    AppsFlyerLib.getInstance();
                    AppsFlyerLib.m7277(context, str);
                    return;
                }
            }
            AFLogger.afInfoLog("MultipleInstallBroadcastReceiver called");
            AppsFlyerLib.getInstance().mo6949(context, intent);
            for (ResolveInfo resolveInfo : context.getPackageManager().queryBroadcastReceivers(new Intent("com.android.vending.INSTALL_REFERRER"), 0)) {
                String action = intent.getAction();
                if (resolveInfo.activityInfo.packageName.equals(context.getPackageName()) && "com.android.vending.INSTALL_REFERRER".equals(action) && !getClass().getName().equals(resolveInfo.activityInfo.name)) {
                    StringBuilder sb = new StringBuilder("trigger onReceive: class: ");
                    sb.append(resolveInfo.activityInfo.name);
                    AFLogger.afInfoLog(sb.toString());
                    try {
                        ((BroadcastReceiver) Class.forName(resolveInfo.activityInfo.name).newInstance()).onReceive(context, intent);
                    } catch (Throwable th2) {
                        StringBuilder sb2 = new StringBuilder("error in BroadcastReceiver ");
                        sb2.append(resolveInfo.activityInfo.name);
                        AFLogger.afErrorLog(sb2.toString(), th2);
                    }
                }
            }
        }
    }
}
