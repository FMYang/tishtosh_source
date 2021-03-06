package com.bytedance.android.livesdkapi.host.douyin;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.bytedance.android.live.base.C2952b;
import com.bytedance.android.livesdkapi.host.IHostAction.C8767a;
import com.bytedance.android.livesdkapi.host.p451a.C8778a;
import java.util.Map;

public interface IHostActionForDouyin extends C2952b, C8778a {
    public static final String BUNDLE_HIDE_MORE = "hide_more";
    public static final String BUNDLE_HIDE_NAV_BAR = "hide_nav_bar";
    public static final String BUNDLE_HIDE_STATUS_BAR = "hide_status_bar";
    public static final String BUNDLE_ROTATE = "bundle_rotate";
    public static final String BUNDLE_SHOW_PROGRESS = "show_progress";
    public static final String BUNDLE_TITLE = "title";
    public static final String BUNDLE_URL = "url";

    boolean handleSchema(Context context, String str, Bundle bundle);

    void openFeedBack(String str, Context context);

    boolean openHostBrowser(String str, Bundle bundle, Context context);

    boolean openHostBrowser(String str, boolean z, String str2, Context context);

    void openLiveBrowser(String str, Bundle bundle, Context context);

    void openLiveBrowser(String str, String str2, Context context);

    void openSignActivity(Context context, Intent intent);

    void openTaobaoApp(Context context, String str, C8767a aVar);

    void openUserProfilePage(long j, Map<String, String> map);

    boolean tryShowKoiRedPackageInLive(String str);
}
