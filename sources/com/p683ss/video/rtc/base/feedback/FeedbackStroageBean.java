package com.p683ss.video.rtc.base.feedback;

import android.content.Context;
import com.google.gson.C18086p;
import com.google.gson.p1076a.C17952c;
import com.p683ss.video.rtc.base.net.bean.FeedbackOptionsModel;
import com.p683ss.video.rtc.base.utils.JsonUtils;
import com.p683ss.video.rtc.base.utils.LocaleUtility;

/* renamed from: com.ss.video.rtc.base.feedback.FeedbackStroageBean */
public class FeedbackStroageBean {
    @C17952c(mo34828a = "language")
    private String language;
    @C17952c(mo34828a = "requestTime")
    private long requestTime;
    @C17952c(mo34828a = "response")
    private String response;

    public String toJson() {
        return JsonUtils.toJson(this);
    }

    public FeedbackOptionsModel getFeedbackOptionsModel() {
        try {
            return (FeedbackOptionsModel) JsonUtils.fromJson(this.response, FeedbackOptionsModel.class);
        } catch (C18086p unused) {
            return null;
        }
    }

    public boolean isExpired() {
        if (this.response == null || this.language == null || (System.currentTimeMillis() / 1000) - this.requestTime > 86400) {
            return true;
        }
        return false;
    }

    public FeedbackStroageBean setLanguage(String str) {
        this.language = str;
        return this;
    }

    public FeedbackStroageBean setResponse(String str) {
        this.response = str;
        return this;
    }

    public FeedbackStroageBean setRequestTime(Long l) {
        this.requestTime = l.longValue();
        return this;
    }

    static FeedbackStroageBean buildFromJson(String str) {
        try {
            return (FeedbackStroageBean) JsonUtils.fromJson(str, FeedbackStroageBean.class);
        } catch (C18086p unused) {
            return null;
        }
    }

    public boolean isSameLanguage(Context context) {
        return LocaleUtility.getLanguage(context).equals(this.language);
    }
}
