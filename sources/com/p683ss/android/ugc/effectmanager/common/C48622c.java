package com.p683ss.android.ugc.effectmanager.common;

import com.p683ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;

/* renamed from: com.ss.android.ugc.effectmanager.common.c */
public final class C48622c {
    /* renamed from: a */
    public static String m105226a(int i) {
        if (i == 1) {
            return "未知错误";
        }
        if (i == 10014) {
            return "无效的effect id";
        }
        if (i == 10016) {
            return "link-selector context is null";
        }
        switch (i) {
            case 1000:
                return "参数不合法（参数缺失或者错误）";
            case 1001:
                return "access_key不合法";
            case BaseNotice.CHECK_PROFILE /*1002*/:
                return "app_version不合法";
            case BaseNotice.COMMENT_REPLY_WITH_VIDEO /*1003*/:
                return "sdk_version不合法";
            case 1004:
                return "device_id不合法";
            case 1005:
                return "device_platform不合法";
            case 1006:
                return "device_type不合法";
            case 1007:
                return "channel不合法";
            case 1008:
                return "app_channel不合法";
            default:
                switch (i) {
                    case 1100:
                        return "当前应用不是测试应用";
                    case 1101:
                        return "access_key不存在";
                    default:
                        switch (i) {
                            case 2001:
                                return "内容没有发生变化";
                            case 2002:
                                return "Effect已下线";
                            case 2003:
                                return "不支持当前设备";
                            case 2004:
                                return "当前特效id不存在";
                            case 2005:
                                return "不在白名单";
                            case 2006:
                                return "需要更新app";
                            default:
                                switch (i) {
                                    case 10001:
                                        return "Cancel download";
                                    case 10002:
                                        return "Download error";
                                    case 10003:
                                        return "Sticker is null";
                                    case 10004:
                                        return "Invalid effect list cache !!!";
                                    case 10005:
                                        return "SDK error";
                                    case 10006:
                                        return "No Downloaded Effects";
                                    case 10007:
                                        return "panel is null";
                                    default:
                                        switch (i) {
                                            case 10009:
                                                return "没有本地 TAG 缓存";
                                            case 10010:
                                                return "MD5 error";
                                            case 10011:
                                                return "无网络";
                                            case 10012:
                                                return "io 错误";
                                            default:
                                                return "未知错误";
                                        }
                                }
                        }
                }
        }
    }
}
