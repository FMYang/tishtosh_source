package com.p683ss.android.ugc.aweme.notice.api.bean;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.base.api.BaseResponse;
import com.p683ss.android.ugc.aweme.feed.model.LogPbBean;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.notice.api.bean.NoticeList */
public final class NoticeList extends BaseResponse {
    @C17952c(mo34828a = "follow_tab_channel_count")
    private List<Object> followTabChannelCounts;
    @C17952c(mo34828a = "notice_count")
    private List<NoticeCount> items;
    @C17952c(mo34828a = "log_pb")
    private LogPbBean logPb;
    @C17952c(mo34828a = "user_id")
    private Long userId;

    public final List<Object> getFollowTabChannelCounts() {
        return this.followTabChannelCounts;
    }

    public final List<NoticeCount> getItems() {
        return this.items;
    }

    public final LogPbBean getLogPb() {
        return this.logPb;
    }

    public final Long getUserId() {
        return this.userId;
    }

    public final void setFollowTabChannelCounts(List<Object> list) {
        this.followTabChannelCounts = list;
    }

    public final void setItems(List<NoticeCount> list) {
        this.items = list;
    }

    public final void setLogPb(LogPbBean logPbBean) {
        this.logPb = logPbBean;
    }

    public final void setUserId(Long l) {
        this.userId = l;
    }

    public NoticeList(Long l, List<NoticeCount> list, LogPbBean logPbBean, List<Object> list2) {
        this.userId = l;
        this.items = list;
        this.logPb = logPbBean;
        this.followTabChannelCounts = list2;
    }
}
