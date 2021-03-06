package com.bytedance.sdk.account.p861f.p863b;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.common.utility.C9431p;
import com.bytedance.sdk.account.p844a.C12997b.C12998a;
import com.bytedance.sdk.account.p844a.p845a.C12990b;
import com.bytedance.sdk.account.p844a.p845a.C12993e;
import com.bytedance.sdk.account.p858c.C13073a;
import com.bytedance.sdk.account.p858c.C13073a.C13074a;
import com.bytedance.sdk.account.p858c.C13075b;
import com.bytedance.sdk.account.p859d.C13078b;
import com.bytedance.sdk.account.p859d.C13078b.C13079a;
import com.bytedance.sdk.account.p859d.C13090h;
import com.bytedance.sdk.account.p861f.p862a.C13107f;
import com.bytedance.sdk.account.p861f.p863b.p864a.C13129f;
import com.bytedance.sdk.account.p865g.C13168a;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.account.f.b.g */
public final class C13149g extends C13090h<C12993e<C13107f>> {

    /* renamed from: e */
    private C13107f f34347e;

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo24585a(C12990b bVar) {
        C13168a.m26527a("passport_email_register", "email", (String) null, (C12990b) (C12993e) bVar, this.f34211c);
    }

    /* renamed from: a */
    public final /* synthetic */ C12990b mo24584a(boolean z, C13075b bVar) {
        return new C12993e(z, 1009, this.f34347e);
    }

    /* renamed from: b */
    public final void mo24587b(JSONObject jSONObject, JSONObject jSONObject2) throws Exception {
        this.f34347e.f34257e = C13079a.m26266a(jSONObject, jSONObject2);
        this.f34347e.f34279l = jSONObject;
    }

    /* renamed from: a */
    public final void mo24586a(JSONObject jSONObject, JSONObject jSONObject2) {
        C13078b.m26263a(this.f34347e, jSONObject);
        this.f34347e.f34279l = jSONObject2;
    }

    private C13149g(Context context, C13073a aVar, C13107f fVar, C13129f fVar2) {
        super(context, aVar, fVar2);
        this.f34347e = fVar;
    }

    /* renamed from: a */
    public static C13149g m26438a(Context context, String str, String str2, String str3, String str4, C13129f fVar) {
        C13107f fVar2 = new C13107f(str, str2, str3, str4);
        C13074a a = new C13074a().mo24752a(C12998a.m26118a("/passport/email/register/v2/"));
        HashMap hashMap = new HashMap();
        hashMap.put("email", C9431p.m18668d(fVar2.f34253a));
        if (!TextUtils.isEmpty(fVar2.f34255c)) {
            hashMap.put("code", fVar2.f34255c);
        }
        hashMap.put("password", C9431p.m18668d(fVar2.f34254b));
        if (!TextUtils.isEmpty(fVar2.f34256d)) {
            hashMap.put("recaptcha_token", fVar2.f34256d);
        }
        hashMap.put("mix_mode", "1");
        return new C13149g(context, a.mo24754a((Map<String, String>) hashMap).mo24757c(), fVar2, fVar);
    }
}
