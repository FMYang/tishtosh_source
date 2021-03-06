package com.p683ss.android.ugc.aweme.feed.model;

import com.google.gson.p1076a.C17952c;
import java.io.Serializable;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.feed.model.BannerTip */
public final class BannerTip implements Serializable {
    public static final Companion Companion = new Companion(null);
    @C17952c(mo34828a = "banner_txt")
    public String bannerTxt;
    @C17952c(mo34828a = "banner_type")
    public int bannerType;
    @C17952c(mo34828a = "link_txt")
    public String linkTxt;
    @C17952c(mo34828a = "link_type")
    public int linkType;
    @C17952c(mo34828a = "link_url")
    public String linkUrl;

    /* renamed from: com.ss.android.ugc.aweme.feed.model.BannerTip$Companion */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C52707g gVar) {
            this();
        }
    }

    public BannerTip() {
    }

    public static /* synthetic */ BannerTip copy$default(BannerTip bannerTip, int i, String str, int i2, String str2, String str3, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = bannerTip.bannerType;
        }
        if ((i3 & 2) != 0) {
            str = bannerTip.bannerTxt;
        }
        String str4 = str;
        if ((i3 & 4) != 0) {
            i2 = bannerTip.linkType;
        }
        int i4 = i2;
        if ((i3 & 8) != 0) {
            str2 = bannerTip.linkUrl;
        }
        String str5 = str2;
        if ((i3 & 16) != 0) {
            str3 = bannerTip.linkTxt;
        }
        return bannerTip.copy(i, str4, i4, str5, str3);
    }

    public final int component1() {
        return this.bannerType;
    }

    public final String component2() {
        return this.bannerTxt;
    }

    public final int component3() {
        return this.linkType;
    }

    public final String component4() {
        return this.linkUrl;
    }

    public final String component5() {
        return this.linkTxt;
    }

    public final BannerTip copy(int i, String str, int i2, String str2, String str3) {
        C52711k.m112240b(str, "bannerTxt");
        C52711k.m112240b(str2, "linkUrl");
        C52711k.m112240b(str3, "linkTxt");
        BannerTip bannerTip = new BannerTip(i, str, i2, str2, str3);
        return bannerTip;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BannerTip) {
                BannerTip bannerTip = (BannerTip) obj;
                if ((this.bannerType == bannerTip.bannerType) && C52711k.m112239a((Object) this.bannerTxt, (Object) bannerTip.bannerTxt)) {
                    if (!(this.linkType == bannerTip.linkType) || !C52711k.m112239a((Object) this.linkUrl, (Object) bannerTip.linkUrl) || !C52711k.m112239a((Object) this.linkTxt, (Object) bannerTip.linkTxt)) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final String getBannerTxt() {
        return this.bannerTxt;
    }

    public final int getBannerType() {
        return this.bannerType;
    }

    public final String getLinkTxt() {
        return this.linkTxt;
    }

    public final int getLinkType() {
        return this.linkType;
    }

    public final String getLinkUrl() {
        return this.linkUrl;
    }

    public final int hashCode() {
        int i = this.bannerType * 31;
        String str = this.bannerTxt;
        int i2 = 0;
        int hashCode = (((i + (str != null ? str.hashCode() : 0)) * 31) + this.linkType) * 31;
        String str2 = this.linkUrl;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.linkTxt;
        if (str3 != null) {
            i2 = str3.hashCode();
        }
        return hashCode2 + i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BannerTip(bannerType=");
        sb.append(this.bannerType);
        sb.append(", bannerTxt=");
        sb.append(this.bannerTxt);
        sb.append(", linkType=");
        sb.append(this.linkType);
        sb.append(", linkUrl=");
        sb.append(this.linkUrl);
        sb.append(", linkTxt=");
        sb.append(this.linkTxt);
        sb.append(")");
        return sb.toString();
    }

    public BannerTip(int i, String str, int i2, String str2, String str3) {
        C52711k.m112240b(str, "bannerTxt");
        C52711k.m112240b(str2, "linkUrl");
        C52711k.m112240b(str3, "linkTxt");
        this.bannerType = i;
        this.bannerTxt = str;
        this.linkType = i2;
        this.linkUrl = str2;
        this.linkTxt = str3;
    }

    public /* synthetic */ BannerTip(int i, String str, int i2, String str2, String str3, int i3, C52707g gVar) {
        if ((i3 & 2) != 0) {
            str = "";
        }
        String str4 = str;
        if ((i3 & 8) != 0) {
            str2 = "";
        }
        String str5 = str2;
        if ((i3 & 16) != 0) {
            str3 = "";
        }
        this(i, str4, i2, str5, str3);
    }
}
