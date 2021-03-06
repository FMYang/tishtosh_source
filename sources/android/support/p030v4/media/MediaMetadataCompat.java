package android.support.p030v4.media;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.p030v4.media.session.MediaSessionCompat;
import android.support.p030v4.p038f.C0777a;

/* renamed from: android.support.v4.media.MediaMetadataCompat */
public final class MediaMetadataCompat implements Parcelable {
    public static final Creator<MediaMetadataCompat> CREATOR = new Creator<MediaMetadataCompat>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new MediaMetadataCompat[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new MediaMetadataCompat(parcel);
        }
    };

    /* renamed from: a */
    static final C0777a<String, Integer> f2942a;

    /* renamed from: d */
    private static final String[] f2943d = {"android.media.metadata.TITLE", "android.media.metadata.ARTIST", "android.media.metadata.ALBUM", "android.media.metadata.ALBUM_ARTIST", "android.media.metadata.WRITER", "android.media.metadata.AUTHOR", "android.media.metadata.COMPOSER"};

    /* renamed from: e */
    private static final String[] f2944e = {"android.media.metadata.DISPLAY_ICON", "android.media.metadata.ART", "android.media.metadata.ALBUM_ART"};

    /* renamed from: f */
    private static final String[] f2945f = {"android.media.metadata.DISPLAY_ICON_URI", "android.media.metadata.ART_URI", "android.media.metadata.ALBUM_ART_URI"};

    /* renamed from: b */
    public final Bundle f2946b;

    /* renamed from: c */
    public Object f2947c;

    public final int describeContents() {
        return 0;
    }

    static {
        C0777a<String, Integer> aVar = new C0777a<>();
        f2942a = aVar;
        aVar.put("android.media.metadata.TITLE", Integer.valueOf(1));
        f2942a.put("android.media.metadata.ARTIST", Integer.valueOf(1));
        f2942a.put("android.media.metadata.DURATION", Integer.valueOf(0));
        f2942a.put("android.media.metadata.ALBUM", Integer.valueOf(1));
        f2942a.put("android.media.metadata.AUTHOR", Integer.valueOf(1));
        f2942a.put("android.media.metadata.WRITER", Integer.valueOf(1));
        f2942a.put("android.media.metadata.COMPOSER", Integer.valueOf(1));
        f2942a.put("android.media.metadata.COMPILATION", Integer.valueOf(1));
        f2942a.put("android.media.metadata.DATE", Integer.valueOf(1));
        f2942a.put("android.media.metadata.YEAR", Integer.valueOf(0));
        f2942a.put("android.media.metadata.GENRE", Integer.valueOf(1));
        f2942a.put("android.media.metadata.TRACK_NUMBER", Integer.valueOf(0));
        f2942a.put("android.media.metadata.NUM_TRACKS", Integer.valueOf(0));
        f2942a.put("android.media.metadata.DISC_NUMBER", Integer.valueOf(0));
        f2942a.put("android.media.metadata.ALBUM_ARTIST", Integer.valueOf(1));
        f2942a.put("android.media.metadata.ART", Integer.valueOf(2));
        f2942a.put("android.media.metadata.ART_URI", Integer.valueOf(1));
        f2942a.put("android.media.metadata.ALBUM_ART", Integer.valueOf(2));
        f2942a.put("android.media.metadata.ALBUM_ART_URI", Integer.valueOf(1));
        f2942a.put("android.media.metadata.USER_RATING", Integer.valueOf(3));
        f2942a.put("android.media.metadata.RATING", Integer.valueOf(3));
        f2942a.put("android.media.metadata.DISPLAY_TITLE", Integer.valueOf(1));
        f2942a.put("android.media.metadata.DISPLAY_SUBTITLE", Integer.valueOf(1));
        f2942a.put("android.media.metadata.DISPLAY_DESCRIPTION", Integer.valueOf(1));
        f2942a.put("android.media.metadata.DISPLAY_ICON", Integer.valueOf(2));
        f2942a.put("android.media.metadata.DISPLAY_ICON_URI", Integer.valueOf(1));
        f2942a.put("android.media.metadata.MEDIA_ID", Integer.valueOf(1));
        f2942a.put("android.media.metadata.BT_FOLDER_TYPE", Integer.valueOf(0));
        f2942a.put("android.media.metadata.MEDIA_URI", Integer.valueOf(1));
        f2942a.put("android.media.metadata.ADVERTISEMENT", Integer.valueOf(0));
        f2942a.put("android.media.metadata.DOWNLOAD_STATUS", Integer.valueOf(0));
    }

    MediaMetadataCompat(Parcel parcel) {
        this.f2946b = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.f2946b);
    }
}
