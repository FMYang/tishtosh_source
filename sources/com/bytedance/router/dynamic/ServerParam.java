package com.bytedance.router.dynamic;

import android.text.TextUtils;
import com.bytedance.router.util.Logger;

public class ServerParam {
    private int mAid;
    private String mChannel = "";
    private String mDeviceId = "";

    public int getAid() {
        return this.mAid;
    }

    public String getChannel() {
        return this.mChannel;
    }

    public String getDeviceId() {
        return this.mDeviceId;
    }

    public boolean isAvailable() {
        if (this.mAid <= 0) {
            Logger.m25716e("aid <= 0, ServerParam is unavailable!!!");
            return false;
        } else if (!TextUtils.isEmpty(this.mDeviceId)) {
            return true;
        } else {
            Logger.m25716e("device id is empty, ServerParam is unavailable!!!");
            return false;
        }
    }

    public ServerParam(int i, String str, String str2) {
        this.mAid = i;
        this.mDeviceId = str;
        this.mChannel = str2;
        if (this.mAid <= 0) {
            Logger.m25716e("aid must > 0, it can request server!!!");
        }
        if (TextUtils.isEmpty(this.mDeviceId)) {
            Logger.m25716e("deviceId must be nut null, it can request server!!!");
        }
        if (this.mChannel == null) {
            this.mChannel = "";
        }
    }
}
