package com.p683ss.android.ugc.aweme.captcha.p1489a;

import com.p683ss.android.ugc.aweme.base.C23566n;
import com.p683ss.android.ugc.aweme.captcha.api.VerifyCaptchaApi;
import com.p683ss.android.ugc.aweme.captcha.p1491c.C24500a;
import com.p683ss.android.ugc.aweme.common.C26832a;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.captcha.a.f */
public final class C24490f extends C26832a<C24489e> {
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
                return VerifyCaptchaApi.m59878a(C24500a.m59893a((String) objArr[0]));
            }
        }, 0);
        return true;
    }
}
