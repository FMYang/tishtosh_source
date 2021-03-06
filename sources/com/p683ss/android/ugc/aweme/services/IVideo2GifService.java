package com.p683ss.android.ugc.aweme.services;

import android.support.p030v4.app.Fragment;
import com.p683ss.android.ugc.aweme.share.gif.VideoShare2GifEditContext;
import com.p683ss.android.ugc.aweme.shortvideo.cut.gif.p2180a.C42636a;

/* renamed from: com.ss.android.ugc.aweme.services.IVideo2GifService */
public interface IVideo2GifService {

    /* renamed from: com.ss.android.ugc.aweme.services.IVideo2GifService$ConvertListener */
    public interface ConvertListener {
        void onConfigured(C42636a aVar);

        void onDone(boolean z);

        void onStart();

        void onUpdateProgress(int i);
    }

    void convert2Gif(VideoShare2GifEditContext videoShare2GifEditContext, ConvertListener convertListener);

    Fragment getGifCutVideoFragment(VideoShare2GifEditContext videoShare2GifEditContext);
}
