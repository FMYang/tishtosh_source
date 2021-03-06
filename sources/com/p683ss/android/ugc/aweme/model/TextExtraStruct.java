package com.p683ss.android.ugc.aweme.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.model.TextExtraStruct */
public class TextExtraStruct implements Parcelable, Serializable, Cloneable {
    public static final Creator<TextExtraStruct> CREATOR = new Creator<TextExtraStruct>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new TextExtraStruct[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new TextExtraStruct(parcel);
        }
    };
    private static final int I_CONSTANTS_31 = 31;
    public static final int SUB_TYPE_COMMENT = 2;
    public static final int SUB_TYPE_DUET = 1;
    public static final int TYPE_AT = 0;
    public static final int TYPE_CUSTOM = 65281;
    public static final int TYPE_CUSTOM_COLOR_CLICK_SPAN = 65282;
    public static final int TYPE_CUSTOM_SEARCH_CAPTION = 65285;
    public static final int TYPE_FORWARD_USER = 2;
    public static final int TYPE_HASH_TAG = 1;
    public static final int TYPE_REPLY_USER = 3;
    public static final int TYPE_STICKER = 4;
    @C17952c(mo34828a = "at_user_type")
    public String atUserType;
    @C17952c(mo34828a = "aweme_id")
    public String awemeId;
    public boolean boldText;
    @C17952c(mo34828a = "hashtag_id")
    public String cid;
    @C17952c(mo34828a = "color")
    public int color;
    public Object customSpan;
    @C17952c(mo34828a = "end")
    public int end;
    @C17952c(mo34828a = "hashtag_name")
    public String hashTagName;
    public boolean isClickable = true;
    @C17952c(mo34828a = "is_commerce")
    public boolean isCommerce;
    @C17952c(mo34828a = "sec_uid")
    public String mSecUid;
    public String schema;
    @C17952c(mo34828a = "star_atlas_tag")
    public boolean starAtlasTag;
    @C17952c(mo34828a = "start")
    public int start;
    @C17952c(mo34828a = "sticker_id")
    public String stickerId;
    @C17952c(mo34828a = "sticker_source")
    public int stickerSource;
    @C17952c(mo34828a = "sticker_url")
    public UrlModel stickerUrl;
    @C17952c(mo34828a = "sub_type")
    public int subType;
    @C17952c(mo34828a = "type")
    public int type;
    @C17952c(mo34828a = "user_id")
    public String userId;

    public int describeContents() {
        return 0;
    }

    public String getAtUserType() {
        return this.atUserType;
    }

    public String getAwemeId() {
        return this.awemeId;
    }

    public String getCid() {
        return this.cid;
    }

    public int getColor() {
        return this.color;
    }

    public Object getCustomSpan() {
        return this.customSpan;
    }

    public int getEnd() {
        return this.end;
    }

    public String getHashTagName() {
        return this.hashTagName;
    }

    public String getSchema() {
        return this.schema;
    }

    public String getSecUid() {
        return this.mSecUid;
    }

    public int getStart() {
        return this.start;
    }

    public String getStickerId() {
        return this.stickerId;
    }

    public int getStickerSource() {
        return this.stickerSource;
    }

    public UrlModel getStickerUrl() {
        return this.stickerUrl;
    }

    public int getSubtype() {
        return this.subType;
    }

    public int getType() {
        return this.type;
    }

    public String getUserId() {
        return this.userId;
    }

    public boolean isBoldText() {
        return this.boldText;
    }

    public boolean isClickable() {
        return this.isClickable;
    }

    public boolean isCommerce() {
        return this.isCommerce;
    }

    public boolean isStarAtlasTag() {
        return this.starAtlasTag;
    }

    public TextExtraStruct() {
    }

    public TextExtraStruct clone() {
        try {
            return (TextExtraStruct) super.clone();
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    public int hashCode() {
        int i;
        int i2;
        int i3 = 0;
        if (this.userId != null) {
            i = this.userId.hashCode();
        } else {
            i = 0;
        }
        int i4 = (((i + 0) * 31) + this.type + this.subType) * 31;
        if (this.atUserType != null) {
            i2 = this.atUserType.hashCode();
        } else {
            i2 = 0;
        }
        int i5 = (i4 + i2) * 31;
        if (this.hashTagName != null) {
            i3 = this.hashTagName.hashCode();
        }
        return i5 + i3;
    }

    public void setAtUserType(String str) {
        this.atUserType = str;
    }

    public void setAwemeId(String str) {
        this.awemeId = str;
    }

    public void setBoldText(boolean z) {
        this.boldText = z;
    }

    public void setCid(String str) {
        this.cid = str;
    }

    public void setClickable(boolean z) {
        this.isClickable = z;
    }

    public void setColor(int i) {
        this.color = i;
    }

    public void setCommerce(boolean z) {
        this.isCommerce = z;
    }

    public void setCustomSpan(Object obj) {
        this.customSpan = obj;
    }

    public void setEnd(int i) {
        this.end = i;
    }

    public void setHashTagName(String str) {
        this.hashTagName = str;
    }

    public void setSchema(String str) {
        this.schema = str;
    }

    public void setSecUid(String str) {
        this.mSecUid = str;
    }

    public void setStarAtlasTag(boolean z) {
        this.starAtlasTag = z;
    }

    public void setStart(int i) {
        this.start = i;
    }

    public void setStickerId(String str) {
        this.stickerId = str;
    }

    public void setStickerSource(int i) {
        this.stickerSource = i;
    }

    public void setStickerUrl(UrlModel urlModel) {
        this.stickerUrl = urlModel;
    }

    public void setSubType(int i) {
        this.subType = i;
    }

    public void setType(int i) {
        this.type = i;
    }

    public void setUserId(String str) {
        this.userId = str;
    }

    protected TextExtraStruct(Parcel parcel) {
        this.start = parcel.readInt();
        this.end = parcel.readInt();
        this.userId = parcel.readString();
        this.mSecUid = parcel.readString();
        this.type = parcel.readInt();
        this.atUserType = parcel.readString();
        this.hashTagName = parcel.readString();
        this.awemeId = parcel.readString();
        this.schema = parcel.readString();
        this.subType = parcel.readInt();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextExtraStruct)) {
            return false;
        }
        TextExtraStruct textExtraStruct = (TextExtraStruct) obj;
        if (this.type != textExtraStruct.type || this.subType != textExtraStruct.subType) {
            return false;
        }
        if (this.userId == null ? textExtraStruct.userId != null : !this.userId.equals(textExtraStruct.userId)) {
            return false;
        }
        if (!TextUtils.equals(this.hashTagName, textExtraStruct.hashTagName)) {
            return false;
        }
        if (this.atUserType != null) {
            return this.atUserType.equals(textExtraStruct.atUserType);
        }
        if (textExtraStruct.atUserType == null) {
            return true;
        }
        return false;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.start);
        parcel.writeInt(this.end);
        parcel.writeString(this.userId);
        parcel.writeString(this.mSecUid);
        parcel.writeInt(this.type);
        parcel.writeString(this.atUserType);
        parcel.writeString(this.hashTagName);
        parcel.writeString(this.awemeId);
        parcel.writeString(this.schema);
        parcel.writeInt(this.subType);
    }
}
