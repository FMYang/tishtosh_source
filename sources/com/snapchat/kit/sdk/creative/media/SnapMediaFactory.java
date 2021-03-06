package com.snapchat.kit.sdk.creative.media;

import android.media.MediaMetadataRetriever;
import com.snapchat.kit.sdk.creative.exceptions.SnapMediaSizeException;
import com.snapchat.kit.sdk.creative.exceptions.SnapStickerSizeException;
import com.snapchat.kit.sdk.creative.exceptions.SnapVideoLengthException;
import com.snapchat.kit.sdk.creative.p1093b.C18308b;
import java.io.File;

public class SnapMediaFactory {

    /* renamed from: a */
    private final C18308b f50527a;

    SnapMediaFactory(C18308b bVar) {
        this.f50527a = bVar;
    }

    public SnapPhotoFile getSnapPhotoFromFile(File file) throws SnapMediaSizeException {
        if (file.length() <= 15728640) {
            return new SnapPhotoFile(file);
        }
        this.f50527a.mo36707a("exceptionMediaSize", 1);
        throw new SnapMediaSizeException("Media file size should be <15MB");
    }

    public SnapSticker getSnapStickerFromFile(File file) throws SnapStickerSizeException {
        if (file.length() <= 1048576) {
            return new SnapSticker(file);
        }
        this.f50527a.mo36707a("exceptionStickerSize", 1);
        throw new SnapStickerSizeException("Sticker file size should be under 1MB");
    }

    public SnapVideoFile getSnapVideoFromFile(File file) throws SnapMediaSizeException, SnapVideoLengthException {
        long length = file.length();
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        mediaMetadataRetriever.setDataSource(file.getPath());
        String extractMetadata = mediaMetadataRetriever.extractMetadata(9);
        mediaMetadataRetriever.release();
        if (Integer.valueOf(extractMetadata).intValue() > 15000) {
            this.f50527a.mo36707a("exceptionVideoLength", 1);
            throw new SnapVideoLengthException("Video must be <15s long");
        } else if (length <= 15728640) {
            this.f50527a.mo36708b("videoLength", Long.valueOf(extractMetadata).longValue());
            return new SnapVideoFile(file);
        } else {
            this.f50527a.mo36707a("exceptionMediaSize", 1);
            throw new SnapMediaSizeException("Media file size should be <15MB");
        }
    }
}
