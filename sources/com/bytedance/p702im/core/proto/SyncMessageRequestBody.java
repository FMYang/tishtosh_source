package com.bytedance.p702im.core.proto;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.io.IOException;
import okio.ByteString;

/* renamed from: com.bytedance.im.core.proto.SyncMessageRequestBody */
public final class SyncMessageRequestBody extends Message<SyncMessageRequestBody, Builder> {
    public static final ProtoAdapter<SyncMessageRequestBody> ADAPTER = new ProtoAdapter_SyncMessageRequestBody();
    public static final Long DEFAULT_CONVERSATION_SHORT_ID = Long.valueOf(0);
    public static final Integer DEFAULT_CONVERSATION_TYPE = Integer.valueOf(0);
    public static final Integer DEFAULT_MESSAGE_TYPE = Integer.valueOf(0);
    public static final Long DEFAULT_TARGET_MESSAGE_SENDER = Long.valueOf(0);
    private static final long serialVersionUID = 0;
    public final String client_message_id;
    public final String conversation_id;
    public final Long conversation_short_id;
    public final Integer conversation_type;
    public final Integer message_type;
    public final SyncContent sync_content;
    public final Long target_message_sender;
    public final String ticket;

    /* renamed from: com.bytedance.im.core.proto.SyncMessageRequestBody$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<SyncMessageRequestBody, Builder> {
        public String client_message_id;
        public String conversation_id;
        public Long conversation_short_id;
        public Integer conversation_type;
        public Integer message_type;
        public SyncContent sync_content;
        public Long target_message_sender;
        public String ticket;

        public final SyncMessageRequestBody build() {
            SyncMessageRequestBody syncMessageRequestBody = new SyncMessageRequestBody(this.conversation_id, this.conversation_type, this.conversation_short_id, this.sync_content, this.message_type, this.ticket, this.client_message_id, this.target_message_sender, super.buildUnknownFields());
            return syncMessageRequestBody;
        }

        public final Builder client_message_id(String str) {
            this.client_message_id = str;
            return this;
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

        public final Builder message_type(Integer num) {
            this.message_type = num;
            return this;
        }

        public final Builder sync_content(SyncContent syncContent) {
            this.sync_content = syncContent;
            return this;
        }

        public final Builder target_message_sender(Long l) {
            this.target_message_sender = l;
            return this;
        }

        public final Builder ticket(String str) {
            this.ticket = str;
            return this;
        }
    }

    /* renamed from: com.bytedance.im.core.proto.SyncMessageRequestBody$ProtoAdapter_SyncMessageRequestBody */
    static final class ProtoAdapter_SyncMessageRequestBody extends ProtoAdapter<SyncMessageRequestBody> {
        public ProtoAdapter_SyncMessageRequestBody() {
            super(FieldEncoding.LENGTH_DELIMITED, SyncMessageRequestBody.class);
        }

        public final SyncMessageRequestBody redact(SyncMessageRequestBody syncMessageRequestBody) {
            Builder newBuilder = syncMessageRequestBody.newBuilder();
            if (newBuilder.sync_content != null) {
                newBuilder.sync_content = (SyncContent) SyncContent.ADAPTER.redact(newBuilder.sync_content);
            }
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final int encodedSize(SyncMessageRequestBody syncMessageRequestBody) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, syncMessageRequestBody.conversation_id) + ProtoAdapter.INT32.encodedSizeWithTag(2, syncMessageRequestBody.conversation_type) + ProtoAdapter.INT64.encodedSizeWithTag(3, syncMessageRequestBody.conversation_short_id) + SyncContent.ADAPTER.encodedSizeWithTag(4, syncMessageRequestBody.sync_content) + ProtoAdapter.INT32.encodedSizeWithTag(6, syncMessageRequestBody.message_type) + ProtoAdapter.STRING.encodedSizeWithTag(7, syncMessageRequestBody.ticket) + ProtoAdapter.STRING.encodedSizeWithTag(8, syncMessageRequestBody.client_message_id) + ProtoAdapter.INT64.encodedSizeWithTag(9, syncMessageRequestBody.target_message_sender) + syncMessageRequestBody.unknownFields().size();
        }

        public final SyncMessageRequestBody decode(ProtoReader protoReader) throws IOException {
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
                            builder.sync_content((SyncContent) SyncContent.ADAPTER.decode(protoReader));
                            break;
                        case 6:
                            builder.message_type((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 7:
                            builder.ticket((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 8:
                            builder.client_message_id((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 9:
                            builder.target_message_sender((Long) ProtoAdapter.INT64.decode(protoReader));
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

        public final void encode(ProtoWriter protoWriter, SyncMessageRequestBody syncMessageRequestBody) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, syncMessageRequestBody.conversation_id);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, syncMessageRequestBody.conversation_type);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, syncMessageRequestBody.conversation_short_id);
            SyncContent.ADAPTER.encodeWithTag(protoWriter, 4, syncMessageRequestBody.sync_content);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 6, syncMessageRequestBody.message_type);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 7, syncMessageRequestBody.ticket);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 8, syncMessageRequestBody.client_message_id);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 9, syncMessageRequestBody.target_message_sender);
            protoWriter.writeBytes(syncMessageRequestBody.unknownFields());
        }
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.conversation_id = this.conversation_id;
        builder.conversation_type = this.conversation_type;
        builder.conversation_short_id = this.conversation_short_id;
        builder.sync_content = this.sync_content;
        builder.message_type = this.message_type;
        builder.ticket = this.ticket;
        builder.client_message_id = this.client_message_id;
        builder.target_message_sender = this.target_message_sender;
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
        if (this.sync_content != null) {
            sb.append(", sync_content=");
            sb.append(this.sync_content);
        }
        if (this.message_type != null) {
            sb.append(", message_type=");
            sb.append(this.message_type);
        }
        if (this.ticket != null) {
            sb.append(", ticket=");
            sb.append(this.ticket);
        }
        if (this.client_message_id != null) {
            sb.append(", client_message_id=");
            sb.append(this.client_message_id);
        }
        if (this.target_message_sender != null) {
            sb.append(", target_message_sender=");
            sb.append(this.target_message_sender);
        }
        StringBuilder replace = sb.replace(0, 2, "SyncMessageRequestBody{");
        replace.append('}');
        return replace.toString();
    }

    public SyncMessageRequestBody(String str, Integer num, Long l, SyncContent syncContent, Integer num2, String str2, String str3, Long l2) {
        this(str, num, l, syncContent, num2, str2, str3, l2, ByteString.EMPTY);
    }

    public SyncMessageRequestBody(String str, Integer num, Long l, SyncContent syncContent, Integer num2, String str2, String str3, Long l2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.conversation_id = str;
        this.conversation_type = num;
        this.conversation_short_id = l;
        this.sync_content = syncContent;
        this.message_type = num2;
        this.ticket = str2;
        this.client_message_id = str3;
        this.target_message_sender = l2;
    }
}
