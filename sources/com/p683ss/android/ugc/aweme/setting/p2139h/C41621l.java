package com.p683ss.android.ugc.aweme.setting.p2139h;

import com.p683ss.android.ugc.aweme.app.api.Api;
import com.p683ss.android.ugc.aweme.base.C23566n;
import com.p683ss.android.ugc.aweme.common.C26832a;
import com.p683ss.android.ugc.aweme.net.CommonApi;
import com.p683ss.android.ugc.aweme.services.RetrofitService;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.setting.h.l */
public final class C41621l extends C26832a {

    /* renamed from: a */
    public static final String f105341a;

    /* renamed from: b */
    public CommonApi f105342b = ((CommonApi) RetrofitService.createIRetrofitServicebyMonsterPlugin().createNewRetrofit(Api.f61282b).create(CommonApi.class));

    static {
        StringBuilder sb = new StringBuilder();
        sb.append(Api.f61282b);
        sb.append("/aweme/v1/contact/shield/");
        f105341a = sb.toString();
    }

    public final boolean checkParams(Object... objArr) {
        if (objArr == null || objArr.length != 1) {
            return false;
        }
        return true;
    }

    public final boolean sendRequest(final Object... objArr) {
        if (!super.sendRequest(objArr)) {
            return false;
        }
        C23566n.m57766a().mo48750a(this.mHandler, new Callable() {
            public final Object call() throws Exception {
                HashMap hashMap = new HashMap();
                hashMap.put("type", String.valueOf(objArr[0]));
                String str = (String) C41621l.this.f105342b.doGet(C41621l.f105341a, (Map<String, String>) hashMap).execute().f33552b;
                Api.m56468a(str, C41621l.f105341a);
                return str;
            }
        }, 0);
        return true;
    }
}
