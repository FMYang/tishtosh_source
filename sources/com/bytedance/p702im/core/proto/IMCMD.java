package com.bytedance.p702im.core.proto;

import com.p683ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.p683ss.ttm.player.MediaPlayer;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* renamed from: com.bytedance.im.core.proto.IMCMD */
public enum IMCMD implements WireEnum {
    IMCMD_NOT_USED(0),
    SEND_MESSAGE(100),
    GET_MESSAGES_BY_USER(200),
    GET_MESSAGES_BY_USER_INIT(201),
    REPORT_GET_MESSAGES_CURSOR(202),
    GET_MESSAGES_BY_USER_INIT_V2(203),
    CHECK_MESSAGES_BY_USER(210),
    GET_CONVERSATION_LIST(300),
    GET_MESSAGES_BY_CONVERSATION(301),
    GET_MESSAGES_CHECKINFO_IN_CONVERSATION(302),
    SEND_ONLINE(MediaPlayer.MEDIA_PLAYER_OPTION_USE_CODEC_POOL),
    SEND_OFFLINE(401),
    SEND_CLIENT_FOREGROUND(402),
    SEND_CLIENT_BACKGROUND(403),
    SEND_USER_ACTION(410),
    SEND_INPUT_STATUS(411),
    NEW_MSG_NOTIFY(500),
    MARK_READ_NOTIFY(501),
    CONVERSATION_INFO_UPDATED_NOTIFY(502),
    GET_CONVERSATION_INFO(600),
    SET_CONVERSATION_INFO(601),
    CREATE_CONVERSATION(602),
    MARK_CONVERSATION_DELETE(603),
    MARK_CONVERSATION_READ(604),
    GET_CONVERSATION_INFO_LIST(607),
    GET_CONVERSATION_INFO_V2(608),
    CREATE_CONVERSATION_V2(609),
    GET_CONVERSATION_INFO_LIST_V2(610),
    GET_CONVERSATION_INFO_LIST_BY_FAVORITE_V2(611),
    GET_CONVERSATION_INFO_LIST_BY_TOP_V2(612),
    BATCH_MARK_CONVERSATION_READ(613),
    DISSOLVE_CONVERSATION(614),
    GET_CONVERSATIONS_CHECKINFO(615),
    CONVERSATION_PARTICIPANTS_LIST(605),
    ADD_CONVERSATION_PARTICIPANTS(650),
    REMOVE_CONVERSATION_PARTICIPANTS(651),
    LEAVE_CONVERSATION(652),
    CONVERSATION_SET_ROLE(653),
    MGET_CONVERSATION_PARTICIPANTS(654),
    UPDATE_CONVERSATION_PARTICIPANT(655),
    DELETE_MESSAGE(701),
    RECALL_MESSAGE(702),
    REACTION_MESSAGE(703),
    SYNC_MESSAGE(704),
    SET_MESSAGE_PROPERTY(705),
    GET_GROUP_INFO(801),
    SET_GROUP_INFO(802),
    GET_GROUP_INFO_LIST(803),
    GET_CONVERSATION_CORE_INFO(901),
    SET_CONVERSATION_CORE_INFO(902),
    GET_CONVERSATION_CORE_INFO_LIST(903),
    UPSERT_CONVERSATION_CORE_EXT_INFO(904),
    GET_CONVERSATION_SETTING_INFO(920),
    SET_CONVERSATION_SETTING_INFO(921),
    UPSERT_CONVERSATION_SETTING_EXT_INFO(922),
    GET_STRANGER_CONVERSATION_LIST(1001),
    GET_STRANGER_MESSAGES_IN_CONVERSATION(BaseNotice.CHECK_PROFILE),
    DELETE_STRANGER_MESSAGE(BaseNotice.COMMENT_REPLY_WITH_VIDEO),
    DELETE_STRANGER_CONVERSATION(1004),
    DELETE_ALL_STRANGER_CONVERSATIONS(1005),
    MARK_STRANGER_CONVERSATION_READ(1006),
    MARK_ALL_STRANGER_CONVERSATIONS_READ(1007),
    STRANGER_NEW_MSG_NOTIFY(1099),
    GET_CONVERSATION_PARTICIPANTS_READ_INDEX_V3(2000),
    GET_CONVERSATION_PARTICIPANTS_MIN_INDEX_V3(2001),
    MARK_CONVERSATION_READ_V3(2002),
    GET_USER_CONVERSATION_LIST(2006),
    CLIENT_ACK(2010),
    REPORT_CLIENT_METRICS(2016),
    GET_CONFIGS(2017);
    
    public static final ProtoAdapter<IMCMD> ADAPTER = null;
    private final int value;

    /* renamed from: com.bytedance.im.core.proto.IMCMD$ProtoAdapter_IMCMD */
    static final class ProtoAdapter_IMCMD extends EnumAdapter<IMCMD> {
        ProtoAdapter_IMCMD() {
            super(IMCMD.class);
        }

        /* access modifiers changed from: protected */
        public final IMCMD fromValue(int i) {
            return IMCMD.fromValue(i);
        }
    }

    public final int getValue() {
        return this.value;
    }

    static {
        ADAPTER = new ProtoAdapter_IMCMD();
    }

    public static IMCMD fromValue(int i) {
        switch (i) {
            case 200:
                return GET_MESSAGES_BY_USER;
            case 201:
                return GET_MESSAGES_BY_USER_INIT;
            case 202:
                return REPORT_GET_MESSAGES_CURSOR;
            case 203:
                return GET_MESSAGES_BY_USER_INIT_V2;
            default:
                switch (i) {
                    case 300:
                        return GET_CONVERSATION_LIST;
                    case 301:
                        return GET_MESSAGES_BY_CONVERSATION;
                    case 302:
                        return GET_MESSAGES_CHECKINFO_IN_CONVERSATION;
                    default:
                        switch (i) {
                            case MediaPlayer.MEDIA_PLAYER_OPTION_USE_CODEC_POOL /*400*/:
                                return SEND_ONLINE;
                            case 401:
                                return SEND_OFFLINE;
                            case 402:
                                return SEND_CLIENT_FOREGROUND;
                            case 403:
                                return SEND_CLIENT_BACKGROUND;
                            default:
                                switch (i) {
                                    case 410:
                                        return SEND_USER_ACTION;
                                    case 411:
                                        return SEND_INPUT_STATUS;
                                    default:
                                        switch (i) {
                                            case 500:
                                                return NEW_MSG_NOTIFY;
                                            case 501:
                                                return MARK_READ_NOTIFY;
                                            case 502:
                                                return CONVERSATION_INFO_UPDATED_NOTIFY;
                                            default:
                                                switch (i) {
                                                    case 600:
                                                        return GET_CONVERSATION_INFO;
                                                    case 601:
                                                        return SET_CONVERSATION_INFO;
                                                    case 602:
                                                        return CREATE_CONVERSATION;
                                                    case 603:
                                                        return MARK_CONVERSATION_DELETE;
                                                    case 604:
                                                        return MARK_CONVERSATION_READ;
                                                    case 605:
                                                        return CONVERSATION_PARTICIPANTS_LIST;
                                                    default:
                                                        switch (i) {
                                                            case 607:
                                                                return GET_CONVERSATION_INFO_LIST;
                                                            case 608:
                                                                return GET_CONVERSATION_INFO_V2;
                                                            case 609:
                                                                return CREATE_CONVERSATION_V2;
                                                            case 610:
                                                                return GET_CONVERSATION_INFO_LIST_V2;
                                                            case 611:
                                                                return GET_CONVERSATION_INFO_LIST_BY_FAVORITE_V2;
                                                            case 612:
                                                                return GET_CONVERSATION_INFO_LIST_BY_TOP_V2;
                                                            case 613:
                                                                return BATCH_MARK_CONVERSATION_READ;
                                                            case 614:
                                                                return DISSOLVE_CONVERSATION;
                                                            case 615:
                                                                return GET_CONVERSATIONS_CHECKINFO;
                                                            default:
                                                                switch (i) {
                                                                    case 650:
                                                                        return ADD_CONVERSATION_PARTICIPANTS;
                                                                    case 651:
                                                                        return REMOVE_CONVERSATION_PARTICIPANTS;
                                                                    case 652:
                                                                        return LEAVE_CONVERSATION;
                                                                    case 653:
                                                                        return CONVERSATION_SET_ROLE;
                                                                    case 654:
                                                                        return MGET_CONVERSATION_PARTICIPANTS;
                                                                    case 655:
                                                                        return UPDATE_CONVERSATION_PARTICIPANT;
                                                                    default:
                                                                        switch (i) {
                                                                            case 701:
                                                                                return DELETE_MESSAGE;
                                                                            case 702:
                                                                                return RECALL_MESSAGE;
                                                                            case 703:
                                                                                return REACTION_MESSAGE;
                                                                            case 704:
                                                                                return SYNC_MESSAGE;
                                                                            case 705:
                                                                                return SET_MESSAGE_PROPERTY;
                                                                            default:
                                                                                switch (i) {
                                                                                    case 801:
                                                                                        return GET_GROUP_INFO;
                                                                                    case 802:
                                                                                        return SET_GROUP_INFO;
                                                                                    case 803:
                                                                                        return GET_GROUP_INFO_LIST;
                                                                                    default:
                                                                                        switch (i) {
                                                                                            case 901:
                                                                                                return GET_CONVERSATION_CORE_INFO;
                                                                                            case 902:
                                                                                                return SET_CONVERSATION_CORE_INFO;
                                                                                            case 903:
                                                                                                return GET_CONVERSATION_CORE_INFO_LIST;
                                                                                            case 904:
                                                                                                return UPSERT_CONVERSATION_CORE_EXT_INFO;
                                                                                            default:
                                                                                                switch (i) {
                                                                                                    case 920:
                                                                                                        return GET_CONVERSATION_SETTING_INFO;
                                                                                                    case 921:
                                                                                                        return SET_CONVERSATION_SETTING_INFO;
                                                                                                    case 922:
                                                                                                        return UPSERT_CONVERSATION_SETTING_EXT_INFO;
                                                                                                    default:
                                                                                                        switch (i) {
                                                                                                            case 1001:
                                                                                                                return GET_STRANGER_CONVERSATION_LIST;
                                                                                                            case BaseNotice.CHECK_PROFILE /*1002*/:
                                                                                                                return GET_STRANGER_MESSAGES_IN_CONVERSATION;
                                                                                                            case BaseNotice.COMMENT_REPLY_WITH_VIDEO /*1003*/:
                                                                                                                return DELETE_STRANGER_MESSAGE;
                                                                                                            case 1004:
                                                                                                                return DELETE_STRANGER_CONVERSATION;
                                                                                                            case 1005:
                                                                                                                return DELETE_ALL_STRANGER_CONVERSATIONS;
                                                                                                            case 1006:
                                                                                                                return MARK_STRANGER_CONVERSATION_READ;
                                                                                                            case 1007:
                                                                                                                return MARK_ALL_STRANGER_CONVERSATIONS_READ;
                                                                                                            default:
                                                                                                                switch (i) {
                                                                                                                    case 2000:
                                                                                                                        return GET_CONVERSATION_PARTICIPANTS_READ_INDEX_V3;
                                                                                                                    case 2001:
                                                                                                                        return GET_CONVERSATION_PARTICIPANTS_MIN_INDEX_V3;
                                                                                                                    case 2002:
                                                                                                                        return MARK_CONVERSATION_READ_V3;
                                                                                                                    default:
                                                                                                                        switch (i) {
                                                                                                                            case 2016:
                                                                                                                                return REPORT_CLIENT_METRICS;
                                                                                                                            case 2017:
                                                                                                                                return GET_CONFIGS;
                                                                                                                            default:
                                                                                                                                switch (i) {
                                                                                                                                    case 0:
                                                                                                                                        return IMCMD_NOT_USED;
                                                                                                                                    case 100:
                                                                                                                                        return SEND_MESSAGE;
                                                                                                                                    case 210:
                                                                                                                                        return CHECK_MESSAGES_BY_USER;
                                                                                                                                    case 1099:
                                                                                                                                        return STRANGER_NEW_MSG_NOTIFY;
                                                                                                                                    case 2006:
                                                                                                                                        return GET_USER_CONVERSATION_LIST;
                                                                                                                                    case 2010:
                                                                                                                                        return CLIENT_ACK;
                                                                                                                                    default:
                                                                                                                                        return null;
                                                                                                                                }
                                                                                                                        }
                                                                                                                }
                                                                                                        }
                                                                                                }
                                                                                        }
                                                                                }
                                                                        }
                                                                }
                                                        }
                                                }
                                        }
                                }
                        }
                }
        }
    }

    private IMCMD(int i) {
        this.value = i;
    }
}
