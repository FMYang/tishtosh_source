package com.p683ss.android.ugc.aweme.opensdk.share.base;

/* renamed from: com.ss.android.ugc.aweme.opensdk.share.base.TikTokMediaContent */
public class TikTokMediaContent {
    private static final String TAG = "AWEME.SDK.TikTokMediaContent";
    public C38522a mMediaObject;

    public TikTokMediaContent() {
    }

    public final boolean checkArgs() {
        return this.mMediaObject.checkArgs();
    }

    public final int getType() {
        if (this.mMediaObject == null) {
            return 0;
        }
        return this.mMediaObject.type();
    }

    public TikTokMediaContent(C38522a aVar) {
        this.mMediaObject = aVar;
    }
}
