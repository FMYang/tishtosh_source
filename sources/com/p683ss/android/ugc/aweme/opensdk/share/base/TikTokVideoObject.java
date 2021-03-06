package com.p683ss.android.ugc.aweme.opensdk.share.base;

import android.os.Bundle;
import java.util.ArrayList;

/* renamed from: com.ss.android.ugc.aweme.opensdk.share.base.TikTokVideoObject */
public class TikTokVideoObject implements C38522a {
    private static final String TAG = "TikTokVideoObject";
    public ArrayList<String> mVideoPaths;

    public boolean checkArgs() {
        return true;
    }

    public int type() {
        return 3;
    }

    public void serialize(Bundle bundle) {
        bundle.putStringArrayList("AWEME_EXTRA_VIDEO_MESSAGE_PATH", this.mVideoPaths);
    }

    public void unserialize(Bundle bundle) {
        this.mVideoPaths = bundle.getStringArrayList("AWEME_EXTRA_VIDEO_MESSAGE_PATH");
    }
}
