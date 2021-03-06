package com.bytedance.p702im.core.proto;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

/* renamed from: com.bytedance.im.core.proto.ConversationSetRoleResponseBody */
public final class ConversationSetRoleResponseBody extends Message<ConversationSetRoleResponseBody, Builder> {
    public static final ProtoAdapter<ConversationSetRoleResponseBody> ADAPTER = new ProtoAdapter_ConversationSetRoleResponseBody();
    public static final Long DEFAULT_CHECK_CODE = Long.valueOf(0);
    public static final Integer DEFAULT_STATUS = Integer.valueOf(0);
    private static final long serialVersionUID = 0;
    public final Long check_code;
    public final String check_message;
    public final String extra_info;
    public final List<Long> failed_participants;
    public final Integer status;
    public final List<Long> success_participants;

    /* renamed from: com.bytedance.im.core.proto.ConversationSetRoleResponseBody$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<ConversationSetRoleResponseBody, Builder> {
        public Long check_code;
        public String check_message;
        public String extra_info;
        public List<Long> failed_participants = Internal.newMutableList();
        public Integer status;
        public List<Long> success_participants = Internal.newMutableList();

        public final ConversationSetRoleResponseBody build() {
            ConversationSetRoleResponseBody conversationSetRoleResponseBody = new ConversationSetRoleResponseBody(this.success_participants, this.failed_participants, this.status, this.extra_info, this.check_code, this.check_message, super.buildUnknownFields());
            return conversationSetRoleResponseBody;
        }

        public final Builder check_code(Long l) {
            this.check_code = l;
            return this;
        }

        public final Builder check_message(String str) {
            this.check_message = str;
            return this;
        }

        public final Builder extra_info(String str) {
            this.extra_info = str;
            return this;
        }

        public final Builder status(Integer num) {
            this.status = num;
            return this;
        }

        public final Builder failed_participants(List<Long> list) {
            Internal.checkElementsNotNull(list);
            this.failed_participants = list;
            return this;
        }

        public final Builder success_participants(List<Long> list) {
            Internal.checkElementsNotNull(list);
            this.success_participants = list;
            return this;
        }
    }

    /* renamed from: com.bytedance.im.core.proto.ConversationSetRoleResponseBody$ProtoAdapter_ConversationSetRoleResponseBody */
    static final class ProtoAdapter_ConversationSetRoleResponseBody extends ProtoAdapter<ConversationSetRoleResponseBody> {
        public ProtoAdapter_ConversationSetRoleResponseBody() {
            super(FieldEncoding.LENGTH_DELIMITED, ConversationSetRoleResponseBody.class);
        }

        public final ConversationSetRoleResponseBody redact(ConversationSetRoleResponseBody conversationSetRoleResponseBody) {
            Builder newBuilder = conversationSetRoleResponseBody.newBuilder();
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }

        public final int encodedSize(ConversationSetRoleResponseBody conversationSetRoleResponseBody) {
            return ProtoAdapter.INT64.asRepeated().encodedSizeWithTag(1, conversationSetRoleResponseBody.success_participants) + ProtoAdapter.INT64.asRepeated().encodedSizeWithTag(2, conversationSetRoleResponseBody.failed_participants) + ProtoAdapter.INT32.encodedSizeWithTag(3, conversationSetRoleResponseBody.status) + ProtoAdapter.STRING.encodedSizeWithTag(4, conversationSetRoleResponseBody.extra_info) + ProtoAdapter.INT64.encodedSizeWithTag(5, conversationSetRoleResponseBody.check_code) + ProtoAdapter.STRING.encodedSizeWithTag(6, conversationSetRoleResponseBody.check_message) + conversationSetRoleResponseBody.unknownFields().size();
        }

        public final ConversationSetRoleResponseBody decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.success_participants.add(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 2:
                            builder.failed_participants.add(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 3:
                            builder.status((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 4:
                            builder.extra_info((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 5:
                            builder.check_code((Long) ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 6:
                            builder.check_message((String) ProtoAdapter.STRING.decode(protoReader));
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

        public final void encode(ProtoWriter protoWriter, ConversationSetRoleResponseBody conversationSetRoleResponseBody) throws IOException {
            ProtoAdapter.INT64.asRepeated().encodeWithTag(protoWriter, 1, conversationSetRoleResponseBody.success_participants);
            ProtoAdapter.INT64.asRepeated().encodeWithTag(protoWriter, 2, conversationSetRoleResponseBody.failed_participants);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, conversationSetRoleResponseBody.status);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, conversationSetRoleResponseBody.extra_info);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 5, conversationSetRoleResponseBody.check_code);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, conversationSetRoleResponseBody.check_message);
            protoWriter.writeBytes(conversationSetRoleResponseBody.unknownFields());
        }
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.success_participants = Internal.copyOf("success_participants", this.success_participants);
        builder.failed_participants = Internal.copyOf("failed_participants", this.failed_participants);
        builder.status = this.status;
        builder.extra_info = this.extra_info;
        builder.check_code = this.check_code;
        builder.check_message = this.check_message;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.success_participants.isEmpty()) {
            sb.append(", success_participants=");
            sb.append(this.success_participants);
        }
        if (!this.failed_participants.isEmpty()) {
            sb.append(", failed_participants=");
            sb.append(this.failed_participants);
        }
        if (this.status != null) {
            sb.append(", status=");
            sb.append(this.status);
        }
        if (this.extra_info != null) {
            sb.append(", extra_info=");
            sb.append(this.extra_info);
        }
        if (this.check_code != null) {
            sb.append(", check_code=");
            sb.append(this.check_code);
        }
        if (this.check_message != null) {
            sb.append(", check_message=");
            sb.append(this.check_message);
        }
        StringBuilder replace = sb.replace(0, 2, "ConversationSetRoleResponseBody{");
        replace.append('}');
        return replace.toString();
    }

    public ConversationSetRoleResponseBody(List<Long> list, List<Long> list2, Integer num, String str, Long l, String str2) {
        this(list, list2, num, str, l, str2, ByteString.EMPTY);
    }

    public ConversationSetRoleResponseBody(List<Long> list, List<Long> list2, Integer num, String str, Long l, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.success_participants = Internal.immutableCopyOf("success_participants", list);
        this.failed_participants = Internal.immutableCopyOf("failed_participants", list2);
        this.status = num;
        this.extra_info = str;
        this.check_code = l;
        this.check_message = str2;
    }
}
