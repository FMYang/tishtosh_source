package com.p683ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.ies.C10174a;
import com.bytedance.ies.p659c.C10617a;
import com.bytedance.ies.p659c.C10618b;
import com.squareup.wire.DefaultValueProtoAdapter;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireFieldNoEnum;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.com_ss_android_ugc_aweme_protection_gradientpunish_GradientPunishWarning */
public final class C32852x5d1ca36c extends Message<C32852x5d1ca36c, Builder> {
    public static final DefaultValueProtoAdapter<C32852x5d1ca36c> ADAPTER = new C32853xf6f84844();
    private static final long serialVersionUID = 0;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 230654850)
    public final String detail_url;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 204050990)
    public final String popup_confirm;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 31844135)
    public final String popup_text;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 166385596)
    public final String toast_text;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 137471667)
    public final Integer warn_type;

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.com_ss_android_ugc_aweme_protection_gradientpunish_GradientPunishWarning$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<C32852x5d1ca36c, Builder> {
        public String detail_url;
        public String popup_confirm;
        public String popup_text;
        public String toast_text;
        public Integer warn_type;

        public final C32852x5d1ca36c build() {
            C32852x5d1ca36c com_ss_android_ugc_aweme_protection_gradientpunish_gradientpunishwarning = new C32852x5d1ca36c(this.popup_text, this.popup_confirm, this.toast_text, this.warn_type, this.detail_url, super.buildUnknownFields());
            return com_ss_android_ugc_aweme_protection_gradientpunish_gradientpunishwarning;
        }

        public final Builder detail_url(String str) {
            this.detail_url = str;
            return this;
        }

        public final Builder popup_confirm(String str) {
            this.popup_confirm = str;
            return this;
        }

        public final Builder popup_text(String str) {
            this.popup_text = str;
            return this;
        }

        public final Builder toast_text(String str) {
            this.toast_text = str;
            return this;
        }

        public final Builder warn_type(Integer num) {
            this.warn_type = num;
            return this;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.com_ss_android_ugc_aweme_protection_gradientpunish_GradientPunishWarning$ProtoAdapter_com_ss_android_ugc_aweme_protection_gradientpunish_GradientPunishWarning */
    static final class C32853xf6f84844 extends DefaultValueProtoAdapter<C32852x5d1ca36c> {
        public final C32852x5d1ca36c redact(C32852x5d1ca36c com_ss_android_ugc_aweme_protection_gradientpunish_gradientpunishwarning) {
            return com_ss_android_ugc_aweme_protection_gradientpunish_gradientpunishwarning;
        }

        public C32853xf6f84844() {
            super(FieldEncoding.LENGTH_DELIMITED, C32852x5d1ca36c.class);
        }

        public final C32852x5d1ca36c decode(ProtoReader protoReader) throws IOException {
            return decode(protoReader, (C32852x5d1ca36c) null);
        }

        public final int encodedSize(C32852x5d1ca36c com_ss_android_ugc_aweme_protection_gradientpunish_gradientpunishwarning) {
            return ProtoAdapter.STRING.encodedSizeWithTag(31844135, com_ss_android_ugc_aweme_protection_gradientpunish_gradientpunishwarning.popup_text) + ProtoAdapter.STRING.encodedSizeWithTag(204050990, com_ss_android_ugc_aweme_protection_gradientpunish_gradientpunishwarning.popup_confirm) + ProtoAdapter.STRING.encodedSizeWithTag(166385596, com_ss_android_ugc_aweme_protection_gradientpunish_gradientpunishwarning.toast_text) + ProtoAdapter.INT32.encodedSizeWithTag(137471667, com_ss_android_ugc_aweme_protection_gradientpunish_gradientpunishwarning.warn_type) + ProtoAdapter.STRING.encodedSizeWithTag(230654850, com_ss_android_ugc_aweme_protection_gradientpunish_gradientpunishwarning.detail_url) + com_ss_android_ugc_aweme_protection_gradientpunish_gradientpunishwarning.unknownFields().size();
        }

        public final void encode(ProtoWriter protoWriter, C32852x5d1ca36c com_ss_android_ugc_aweme_protection_gradientpunish_gradientpunishwarning) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 31844135, com_ss_android_ugc_aweme_protection_gradientpunish_gradientpunishwarning.popup_text);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 204050990, com_ss_android_ugc_aweme_protection_gradientpunish_gradientpunishwarning.popup_confirm);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 166385596, com_ss_android_ugc_aweme_protection_gradientpunish_gradientpunishwarning.toast_text);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 137471667, com_ss_android_ugc_aweme_protection_gradientpunish_gradientpunishwarning.warn_type);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 230654850, com_ss_android_ugc_aweme_protection_gradientpunish_gradientpunishwarning.detail_url);
            protoWriter.writeBytes(com_ss_android_ugc_aweme_protection_gradientpunish_gradientpunishwarning.unknownFields());
        }

        public final C32852x5d1ca36c decode(ProtoReader protoReader, C32852x5d1ca36c com_ss_android_ugc_aweme_protection_gradientpunish_gradientpunishwarning) throws IOException {
            Builder builder;
            C32852x5d1ca36c com_ss_android_ugc_aweme_protection_gradientpunish_gradientpunishwarning2 = (C32852x5d1ca36c) C10617a.m21405a().mo18840a(C32852x5d1ca36c.class, com_ss_android_ugc_aweme_protection_gradientpunish_gradientpunishwarning);
            if (com_ss_android_ugc_aweme_protection_gradientpunish_gradientpunishwarning2 != null) {
                builder = com_ss_android_ugc_aweme_protection_gradientpunish_gradientpunishwarning2.newBuilder();
            } else {
                builder = new Builder();
            }
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 31844135:
                            builder.popup_text((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 137471667:
                            builder.warn_type((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 166385596:
                            builder.toast_text((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 204050990:
                            builder.popup_confirm((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 230654850:
                            builder.detail_url((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        default:
                            try {
                                FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                break;
                            } catch (C10618b e) {
                                if (com_ss_android_ugc_aweme_protection_gradientpunish_gradientpunishwarning2 != null) {
                                    break;
                                } else {
                                    throw e;
                                }
                            }
                    }
                } else {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                }
            }
        }
    }

    public final String getDetailUrl() throws C10174a {
        if (this.detail_url != null) {
            return this.detail_url;
        }
        throw new C10174a();
    }

    public final String getPopupConfirm() throws C10174a {
        if (this.popup_confirm != null) {
            return this.popup_confirm;
        }
        throw new C10174a();
    }

    public final String getPopupText() throws C10174a {
        if (this.popup_text != null) {
            return this.popup_text;
        }
        throw new C10174a();
    }

    public final String getToastText() throws C10174a {
        if (this.toast_text != null) {
            return this.toast_text;
        }
        throw new C10174a();
    }

    public final Integer getWarnType() throws C10174a {
        if (this.warn_type != null) {
            return this.warn_type;
        }
        throw new C10174a();
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.popup_text = this.popup_text;
        builder.popup_confirm = this.popup_confirm;
        builder.toast_text = this.toast_text;
        builder.warn_type = this.warn_type;
        builder.detail_url = this.detail_url;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5 = this.hashCode;
        if (i5 != 0) {
            return i5;
        }
        int hashCode = unknownFields().hashCode() * 37;
        int i6 = 0;
        if (this.popup_text != null) {
            i = this.popup_text.hashCode();
        } else {
            i = 0;
        }
        int i7 = (hashCode + i) * 37;
        if (this.popup_confirm != null) {
            i2 = this.popup_confirm.hashCode();
        } else {
            i2 = 0;
        }
        int i8 = (i7 + i2) * 37;
        if (this.toast_text != null) {
            i3 = this.toast_text.hashCode();
        } else {
            i3 = 0;
        }
        int i9 = (i8 + i3) * 37;
        if (this.warn_type != null) {
            i4 = this.warn_type.hashCode();
        } else {
            i4 = 0;
        }
        int i10 = (i9 + i4) * 37;
        if (this.detail_url != null) {
            i6 = this.detail_url.hashCode();
        }
        int i11 = i10 + i6;
        this.hashCode = i11;
        return i11;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.popup_text != null) {
            sb.append(", popup_text=");
            sb.append(this.popup_text);
        }
        if (this.popup_confirm != null) {
            sb.append(", popup_confirm=");
            sb.append(this.popup_confirm);
        }
        if (this.toast_text != null) {
            sb.append(", toast_text=");
            sb.append(this.toast_text);
        }
        if (this.warn_type != null) {
            sb.append(", warn_type=");
            sb.append(this.warn_type);
        }
        if (this.detail_url != null) {
            sb.append(", detail_url=");
            sb.append(this.detail_url);
        }
        StringBuilder replace = sb.replace(0, 2, "com_ss_android_ugc_aweme_protection_gradientpunish_GradientPunishWarning{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C32852x5d1ca36c)) {
            return false;
        }
        C32852x5d1ca36c com_ss_android_ugc_aweme_protection_gradientpunish_gradientpunishwarning = (C32852x5d1ca36c) obj;
        if (!unknownFields().equals(com_ss_android_ugc_aweme_protection_gradientpunish_gradientpunishwarning.unknownFields()) || !Internal.equals(this.popup_text, com_ss_android_ugc_aweme_protection_gradientpunish_gradientpunishwarning.popup_text) || !Internal.equals(this.popup_confirm, com_ss_android_ugc_aweme_protection_gradientpunish_gradientpunishwarning.popup_confirm) || !Internal.equals(this.toast_text, com_ss_android_ugc_aweme_protection_gradientpunish_gradientpunishwarning.toast_text) || !Internal.equals(this.warn_type, com_ss_android_ugc_aweme_protection_gradientpunish_gradientpunishwarning.warn_type) || !Internal.equals(this.detail_url, com_ss_android_ugc_aweme_protection_gradientpunish_gradientpunishwarning.detail_url)) {
            return false;
        }
        return true;
    }

    public C32852x5d1ca36c(String str, String str2, String str3, Integer num, String str4) {
        this(str, str2, str3, num, str4, ByteString.EMPTY);
    }

    public C32852x5d1ca36c(String str, String str2, String str3, Integer num, String str4, ByteString byteString) {
        super(ADAPTER, byteString);
        this.popup_text = str;
        this.popup_confirm = str2;
        this.toast_text = str3;
        this.warn_type = num;
        this.detail_url = str4;
    }
}
