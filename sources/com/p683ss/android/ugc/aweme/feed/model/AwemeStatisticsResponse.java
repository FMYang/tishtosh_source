package com.p683ss.android.ugc.aweme.feed.model;

import com.google.gson.p1076a.C17952c;
import java.io.Serializable;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.feed.model.AwemeStatisticsResponse */
public final class AwemeStatisticsResponse implements Serializable {
    @C17952c(mo34828a = "status_msg")
    private String message;
    @C17952c(mo34828a = "statistics_list")
    private List<AwemeStatisticsBackup> statisticsList;
    @C17952c(mo34828a = "status_code")
    private Integer status = Integer.valueOf(0);

    public final String getMessage() {
        return this.message;
    }

    public final List<AwemeStatisticsBackup> getStatisticsList() {
        return this.statisticsList;
    }

    public final Integer getStatus() {
        return this.status;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AwemeStatisticsResponse(status=");
        sb.append(this.status);
        sb.append(", message=");
        sb.append(this.message);
        sb.append(", statisticsList=");
        sb.append(this.statisticsList);
        sb.append(')');
        return sb.toString();
    }

    public final void setMessage(String str) {
        this.message = str;
    }

    public final void setStatisticsList(List<AwemeStatisticsBackup> list) {
        this.statisticsList = list;
    }

    public final void setStatus(Integer num) {
        this.status = num;
    }
}
