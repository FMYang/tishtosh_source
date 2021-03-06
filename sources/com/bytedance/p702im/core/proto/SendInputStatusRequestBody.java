package com.bytedance.p702im.core.proto;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoAdapter.EnumConstantNotFoundException;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.Map;
import okio.ByteString;

/* renamed from: com.bytedance.im.core.proto.SendInputStatusRequestBody */
public final class SendInputStatusRequestBody extends Message<SendInputStatusRequestBody, Builder> {
    public static final ProtoAdapter<SendInputStatusRequestBody> ADAPTER = new ProtoAdapter_SendInputStatusRequestBody();
    public static final Long DEFAULT_CONVERSATION_SHORT_ID = Long.valueOf(0);
    public static final Integer DEFAULT_CONVERSATION_TYPE = Integer.valueOf(0);
    public static final InputStatus DEFAULT_STATUS = InputStatus.TYPING;
    private static final long serialVersionUID = 0;
    public final String conversation_id;
    public final Long conversation_short_id;
    public final Integer conversation_type;
    public final Map<String, String> extra;
    public final InputStatus status;

    /* renamed from: com.bytedance.im.core.proto.SendInputStatusRequestBody$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<SendInputStatusRequestBody, Builder> {
        public String conversation_id;
        public Long conversation_short_id;
        public Integer conversation_type;
        public Map<String, String> extra = Internal.newMutableMap();
        public InputStatus status;

        public final SendInputStatusRequestBody build() {
            SendInputStatusRequestBody sendInputStatusRequestBody = new SendInputStatusRequestBody(this.conversation_id, this.conversation_type, this.conversation_short_id, this.status, this.extra, super.buildUnknownFields());
            return sendInputStatusRequestBody;
        }

        public final Builder conversation_id(String str) {
            this.conversation_id = str;
            return this;
        }

        public final Builder conversation_short_id(Long l) {
            this.conversation_short_id = l;
            return this;
        }

        public final Builder conversation_type(Integer num) {
            this.conversation_type = num;
            return this;
        }

        public final Builder status(InputStatus inputStatus) {
            this.status = inputStatus;
            return this;
        }

        public final Builder extra(Map<String, String> map) {
            Internal.checkElementsNotNull(map);
            this.extra = map;
            return this;
        }
    }

    /* renamed from: com.bytedance.im.core.proto.SendInputStatusRequestBody$ProtoAdapter_SendInputStatusRequestBody */
    static final class ProtoAdapter_SendInputStatusRequestBody extends ProtoAdapter<SendInputStatusRequestBody> {
        private final ProtoAdapter<Map<String, String>> extra;

        public ProtoAdapter_SendInputStatusRequestBody() {
            super(FieldEncoding.LENGTH_DELIMITED, SendInputStatusRequestBody.class);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            this.extra = ProtoAdapter.newMapAdapter(protoAdapter, protoAdapter);
        }

        public final SendInputStatusRequestBody redact(SendInputStatusRequestBody sendInputStatusRequestBody) {
            Builder newBuilder = sendInputStatusRequestBody.newBuilder();
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final int encodedSize(SendInputStatusRequestBody sendInputStatusRequestBody) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, sendInputStatusRequestBody.conversation_id) + ProtoAdapter.INT32.encodedSizeWithTag(2, sendInputStatusRequestBody.conversation_type) + ProtoAdapter.INT64.encodedSizeWithTag(3, sendInputStatusRequestBody.conversation_short_id) + InputStatus.ADAPTER.encodedSizeWithTag(4, sendInputStatusRequestBody.status) + this.extra.encodedSizeWithTag(5, sendInputStatusRequestBody.extra) + sendInputStatusRequestBody.unknownFields().size();
        }

        public final SendInputStatusRequestBody decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.conversation_id((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 2:
                            builder.conversation_type((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 3:
                            builder.conversation_short_id((Long) ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 4:
                            try {
                                builder.status((InputStatus) InputStatus.ADAPTER.decode(protoReader));
                                break;
                            } catch (EnumConstantNotFoundException e) {
                                builder.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 5:
                            builder.extra.putAll((Map) this.extra.decode(protoReader));
                            break;
                        default:
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, SendInputStatusRequestBody sendInputStatusRequestBody) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, sendInputStatusRequestBody.conversation_id);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, sendInputStatusRequestBody.conversation_type);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, sendInputStatusRequestBody.conversation_short_id);
            InputStatus.ADAPTER.encodeWithTag(protoWriter, 4, sendInputStatusRequestBody.status);
            this.extra.encodeWithTag(protoWriter, 5, sendInputStatusRequestBody.extra);
            protoWriter.writeBytes(sendInputStatusRequestBody.unknownFields());
        }
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.conversation_id = this.conversation_id;
        builder.conversation_type = this.conversation_type;
        builder.conversation_short_id = this.conversation_short_id;
        builder.status = this.status;
        builder.extra = Internal.copyOf("extra", this.extra);
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.conversation_id != null) {
            sb.append(", conversation_id=");
            sb.append(this.conversation_id);
        }
        if (this.conversation_type != null) {
            sb.append(", conversation_type=");
            sb.append(this.conversation_type);
        }
        if (this.conversation_short_id != null) {
            sb.append(", conversation_short_id=");
            sb.append(this.conversation_short_id);
        }
        if (this.status != null) {
            sb.append(", status=");
            sb.append(this.status);
        }
        if (!this.extra.isEmpty()) {
            sb.append(", extra=");
            sb.append(this.extra);
        }
        StringBuilder replace = sb.replace(0, 2, "SendInputStatusRequestBody{");
        replace.append('}');
        return replace.toString();
    }

    public SendInputStatusRequestBody(String str, Integer num, Long l, InputStatus inputStatus, Map<String, String> map) {
        this(str, num, l, inputStatus, map, ByteString.EMPTY);
    }

    public SendInputStatusRequestBody(String str, Integer num, Long l, InputStatus inputStatus, Map<String, String> map, ByteString byteString) {
        super(ADAPTER, byteString);
        this.conversation_id = str;
        this.conversation_type = num;
        this.conversation_short_id = l;
        this.status = inputStatus;
        this.extra = Internal.immutableCopyOf("extra", map);
    }
}
