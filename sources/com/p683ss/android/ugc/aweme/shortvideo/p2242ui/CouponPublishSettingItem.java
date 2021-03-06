package com.p683ss.android.ugc.aweme.shortvideo.p2242ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p683ss.android.ugc.aweme.base.C23515d;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.miniapp.anchor.C36811b;
import com.ss.android.ugc.trill.R;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.CouponPublishSettingItem */
public final class CouponPublishSettingItem extends PublishSettingItem {

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.CouponPublishSettingItem$a */
    static final class C44901a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ CouponPublishSettingItem f113632a;

        /* renamed from: b */
        final /* synthetic */ C52670a f113633b;

        C44901a(CouponPublishSettingItem couponPublishSettingItem, C52670a aVar) {
            this.f113632a = couponPublishSettingItem;
            this.f113633b = aVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            if (this.f113632a.f113683j) {
                ImageView imageView = this.f113632a.f113681h;
                C52711k.m112236a((Object) imageView, "mIconRight");
                if (imageView.getVisibility() == 0) {
                    this.f113633b.invoke();
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo91047a() {
        setDrawableLeft((int) R.drawable.d47);
        setTagText("");
        setTitle((int) R.string.fzw);
        setSingleLine(true);
        setSubtitle("");
        setDrawableRight((int) R.drawable.avm);
        mo91061b();
    }

    public CouponPublishSettingItem(Context context, AttributeSet attributeSet) {
        C52711k.m112240b(context, "context");
        super(context, attributeSet);
        mo91047a();
    }

    /* renamed from: a */
    public final void mo91048a(UrlModel urlModel, String str, int i, String str2, C52670a<C52860x> aVar) {
        C52711k.m112240b(urlModel, "addIcon");
        C52711k.m112240b(str, "title");
        C52711k.m112240b(str2, "tag");
        C52711k.m112240b(aVar, "clearAction");
        C23515d.m57669a(getLeftDrawableView(), urlModel);
        setDrawableRight((int) R.drawable.aiy);
        setRightIconListener(new C44901a(this, aVar));
        setTagText(str2);
        setTitle(str);
        setSubtitle("");
        ImageView imageView = this.f113681h;
        C52711k.m112236a((Object) imageView, "mIconRight");
        boolean a = C36811b.m82845a(Integer.valueOf(i));
        int i2 = 0;
        if (a) {
            setEnable(false);
            i2 = 8;
        } else {
            setEnable(true);
        }
        imageView.setVisibility(i2);
    }
}
