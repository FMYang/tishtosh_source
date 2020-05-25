package com.p683ss.android.ugc.aweme.shortvideo.cut.stickingpoint;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.p683ss.android.ugc.aweme.shortvideo.C43852fu;
import com.p683ss.android.ugc.aweme.shortvideo.upload.C45252b;
import com.p683ss.android.ugc.tools.utils.C50200d;
import com.p683ss.ttuploader.TTVideoInfo;
import com.p683ss.ttuploader.TTVideoUploader;
import com.p683ss.ttuploader.TTVideoUploaderListener;
import p001a.C0013i;
import p001a.C0027j;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.StickPointUploadTask */
public final class StickPointUploadTask implements Parcelable {
    public static final C42985a CREATOR = new C42985a(null);

    /* renamed from: a */
    public String f108563a;

    /* renamed from: b */
    public final String f108564b;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.StickPointUploadTask$a */
    public static final class C42985a implements Creator<StickPointUploadTask> {
        private C42985a() {
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new StickPointUploadTask[i];
        }

        public /* synthetic */ C42985a(C52707g gVar) {
            this();
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            C52711k.m112240b(parcel, "parcel");
            return new StickPointUploadTask(parcel);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.StickPointUploadTask$b */
    public static final class C42986b implements TTVideoUploaderListener {

        /* renamed from: a */
        final /* synthetic */ StickPointUploadTask f108565a;

        /* renamed from: b */
        final /* synthetic */ C43852fu f108566b;

        /* renamed from: c */
        final /* synthetic */ TTVideoUploader f108567c;

        /* renamed from: d */
        final /* synthetic */ C0027j f108568d;

        public final String getStringFromExtern(int i) {
            return null;
        }

        public final void onLog(int i, int i2, String str) {
        }

        public final void onUploadVideoStage(int i, long j) {
        }

        public final int videoUploadCheckNetState(int i, int i2) {
            return C45252b.m98738a(this.f108566b, "StickPointUpload");
        }

        public final void onNotify(int i, long j, TTVideoInfo tTVideoInfo) {
            if (i != 0) {
                if (i == 2) {
                    this.f108567c.close();
                    C0027j jVar = this.f108568d;
                    StringBuilder sb = new StringBuilder("upload failed ");
                    sb.append(j);
                    sb.append('.');
                    jVar.mo46b((Exception) new IllegalArgumentException(sb.toString()));
                }
                return;
            }
            StickPointUploadTask stickPointUploadTask = this.f108565a;
            if (tTVideoInfo == null) {
                C52711k.m112234a();
            }
            stickPointUploadTask.f108563a = tTVideoInfo.mTosKey;
            this.f108567c.close();
            this.f108568d.mo47b(this.f108565a);
        }

        C42986b(StickPointUploadTask stickPointUploadTask, C43852fu fuVar, TTVideoUploader tTVideoUploader, C0027j jVar) {
            this.f108565a = stickPointUploadTask;
            this.f108566b = fuVar;
            this.f108567c = tTVideoUploader;
            this.f108568d = jVar;
        }
    }

    public final int describeContents() {
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r1.f108564b, (java.lang.Object) ((com.p683ss.android.ugc.aweme.shortvideo.cut.stickingpoint.StickPointUploadTask) r2).f108564b) != false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r2) {
        /*
            r1 = this;
            if (r1 == r2) goto L_0x0015
            boolean r0 = r2 instanceof com.p683ss.android.ugc.aweme.shortvideo.cut.stickingpoint.StickPointUploadTask
            if (r0 == 0) goto L_0x0013
            com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.StickPointUploadTask r2 = (com.p683ss.android.ugc.aweme.shortvideo.cut.stickingpoint.StickPointUploadTask) r2
            java.lang.String r0 = r1.f108564b
            java.lang.String r2 = r2.f108564b
            boolean r2 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r2)
            if (r2 == 0) goto L_0x0013
            goto L_0x0015
        L_0x0013:
            r2 = 0
            return r2
        L_0x0015:
            r2 = 1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.shortvideo.cut.stickingpoint.StickPointUploadTask.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        String str = this.f108564b;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StickPointUploadTask(originalPath=");
        sb.append(this.f108564b);
        sb.append(")");
        return sb.toString();
    }

    public StickPointUploadTask(String str) {
        C52711k.m112240b(str, "originalPath");
        this.f108564b = str;
    }

    public StickPointUploadTask(Parcel parcel) {
        C52711k.m112240b(parcel, "parcel");
        String readString = parcel.readString();
        if (readString == null) {
            C52711k.m112234a();
        }
        this(readString);
        this.f108563a = parcel.readString();
    }

    /* renamed from: a */
    public final C0013i<StickPointUploadTask> mo87370a(C43852fu fuVar) {
        C52711k.m112240b(fuVar, "config");
        if (!C50200d.m108346a(this.f108564b)) {
            StringBuilder sb = new StringBuilder("file not exist, ");
            sb.append(this.f108564b);
            C0013i<StickPointUploadTask> a = C0013i.m13a((Exception) new IllegalStateException(sb.toString()));
            C52711k.m112236a((Object) a, "Task.forError(IllegalSta…exist, ${originalPath}\"))");
            return a;
        }
        C0027j jVar = new C0027j();
        TTVideoUploader tTVideoUploader = new TTVideoUploader();
        try {
            tTVideoUploader.setListener(new C42986b(this, fuVar, tTVideoUploader, jVar));
            tTVideoUploader.setMaxFailTime(fuVar.f111072h);
            tTVideoUploader.setSliceSize(fuVar.f111070f);
            tTVideoUploader.setFileUploadDomain(fuVar.f111066b);
            tTVideoUploader.setVideoUploadDomain(fuVar.f111067c);
            tTVideoUploader.setSliceTimeout(fuVar.f111068d);
            tTVideoUploader.setPathName(this.f108564b);
            tTVideoUploader.setFileRetryCount(1);
            tTVideoUploader.setUserKey(fuVar.f111064E);
            tTVideoUploader.setAuthorization(fuVar.f111063D);
            tTVideoUploader.setSocketNum(1);
            tTVideoUploader.start();
        } catch (Exception unused) {
            tTVideoUploader.close();
        }
        C0013i<TResult> iVar = jVar.f77a;
        C52711k.m112236a((Object) iVar, "taskCompletionSource.task");
        return iVar;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C52711k.m112240b(parcel, "parcel");
        parcel.writeString(this.f108564b);
        parcel.writeString(this.f108563a);
    }
}
