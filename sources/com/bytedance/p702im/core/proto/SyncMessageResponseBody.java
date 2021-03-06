package com.bytedance.p702im.core.proto;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoAdapter.EnumConstantNotFoundException;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

/* renamed from: com.bytedance.im.core.proto.SyncMessageResponseBody */
public final class SyncMessageResponseBody extends Message<SyncMessageResponseBody, Builder> {
    public static final ProtoAdapter<SyncMessageResponseBody> ADAPTER = new ProtoAdapter_SyncMessageResponseBody();
    public static final Long DEFAULT_SERVER_MESSAGE_ID = Long.valueOf(0);
    public static final SendMessageStatus DEFAULT_STATUS = SendMessageStatus.SEND_SUCCEED;
    private static final long serialVersionUID = 0;
    public final String client_message_id;
    public final Long server_message_id;
    public final SendMessageStatus status;

    /* renamed from: com.bytedance.im.core.proto.SyncMessageResponseBody$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<SyncMessageResponseBody, Builder> {
        public String client_message_id;
        public Long server_message_id;
        public SendMessageStatus status;

        public final SyncMessageResponseBody build() {
            return new SyncMessageResponseBody(this.server_message_id, this.client_message_id, this.status, super.buildUnknownFields());
        }

        public final Builder client_message_id(String str) {
            this.client_message_id = str;
            return this;
        }

        public final Builder server_message_id(Long l) {
            this.server_message_id = l;
            return this;
        }

        public final Builder status(SendMessageStatus sendMessageStatus) {
            this.status = sendMessageStatus;
            return this;
        }
    }

    /* renamed from: com.bytedance.im.core.proto.SyncMessageResponseBody$ProtoAdapter_SyncMessageResponseBody */
    static final class ProtoAdapter_SyncMessageResponseBody extends ProtoAdapter<SyncMessageResponseBody> {
        public ProtoAdapter_SyncMessageResponseBody() {
            super(FieldEncoding.LENGTH_DELIMITED, SyncMessageResponseBody.class);
        }

        public final SyncMessageResponseBody redact(SyncMessageResponseBody syncMessageResponseBody) {
            Builder newBuilder = syncMessageResponseBody.newBuilder();
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final int encodedSize(SyncMessageResponseBody syncMessageResponseBody) {
            return ProtoAdapter.INT64.encodedSizeWithTag(1, syncMessageResponseBody.server_message_id) + ProtoAdapter.STRING.encodedSizeWithTag(2, syncMessageResponseBody.client_message_id) + SendMessageStatus.ADAPTER.encodedSizeWithTag(3, syncMessageResponseBody.status) + syncMessageResponseBody.unknownFields().size();
        }

        public final SyncMessageResponseBody decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.server_message_id((Long) ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 2:
                            builder.client_message_id((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 3:
                            try {
                                builder.status((SendMessageStatus) SendMessageStatus.ADAPTER.decode(protoReader));
                                break;
                            } catch (EnumConstantNotFoundException e) {
                                builder.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
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

        public final void encode(ProtoWriter protoWriter, SyncMessageResponseBody syncMessageResponseBody) throws IOException {
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, syncMessageResponseBody.server_message_id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, syncMessageResponseBody.client_message_id);
            SendMessageStatus.ADAPTER.encodeWithTag(protoWriter, 3, syncMessageResponseBody.status);
            protoWriter.writeBytes(syncMessageResponseBody.unknownFields());
        }
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.server_message_id = this.server_message_id;
        builder.client_message_id = this.client_message_id;
        builder.status = this.status;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.server_message_id != null) {
            sb.append(", server_message_id=");
            sb.append(this.server_message_id);
        }
        if (this.client_message_id != null) {
            sb.append(", client_message_id=");
            sb.append(this.client_message_id);
        }
        if (this.status != null) {
            sb.append(", status=");
            sb.append(this.status);
        }
        StringBuilder replace = sb.replace(0, 2, "SyncMessageResponseBody{");
        replace.append('}');
        return replace.toString();
    }

    public SyncMessageResponseBody(Long l, String str, SendMessageStatus sendMessageStatus) {
        this(l, str, sendMessageStatus, ByteString.EMPTY);
    }

    public SyncMessageResponseBody(Long l, String str, SendMessageStatus sendMessageStatus, ByteString byteString) {
        super(ADAPTER, byteString);
        this.server_message_id = l;
        this.client_message_id = str;
        this.status = sendMessageStatus;
    }
}
