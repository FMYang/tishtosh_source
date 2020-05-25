package com.p683ss.android.ugc.aweme.notification.newstyle.p2022b;

import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.p683ss.android.ugc.aweme.notification.newstyle.p2022b.C38276d.C38277a;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.notification.newstyle.b.o */
public final class C38295o extends C38275c {

    /* renamed from: com.ss.android.ugc.aweme.notification.newstyle.b.o$a */
    public static final class C38296a implements C38276d {
        C38296a() {
        }

        /* renamed from: b */
        public final String mo78250b() {
            return C38277a.m85522a(this);
        }

        /* renamed from: c */
        public final String mo78251c() {
            return C38277a.m85523b(this);
        }

        /* renamed from: a */
        public final String mo78247a() {
            String string = C11010c.m22280a().getString(R.string.gj4);
            C52711k.m112236a((Object) string, "AppContextManager.getApp…R.string.im_monetization)");
            return string;
        }

        /* renamed from: a */
        public final List<BaseNotice> mo78248a(List<BaseNotice> list) {
            C52711k.m112240b(list, "list");
            List<BaseNotice> arrayList = new ArrayList<>();
            for (BaseNotice baseNotice : list) {
                if (baseNotice.getTcmNotice() != null) {
                    arrayList.add(baseNotice);
                }
            }
            return arrayList;
        }

        /* renamed from: a */
        public final C1352v mo78246a(ViewGroup viewGroup, int i) {
            C52711k.m112240b(viewGroup, "parent");
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.b2v, viewGroup, false);
            C52711k.m112236a((Object) inflate, "view");
            return new C38288k(inflate);
        }

        /* renamed from: a */
        public final void mo78249a(C1352v vVar, BaseNotice baseNotice, int i, HashMap<String, BaseNotice> hashMap, boolean z) {
            C52711k.m112240b(vVar, "holder");
            C52711k.m112240b(baseNotice, "notice");
            C52711k.m112240b(hashMap, "readNoticeMap");
            if (vVar instanceof C38288k) {
                ((C38288k) vVar).mo78255a(baseNotice, z);
            }
        }
    }

    /* renamed from: a */
    public final C38276d mo78245a() {
        return new C38296a();
    }
}
