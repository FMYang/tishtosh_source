package com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.controller;

import java.io.File;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.controller.b */
public final class C43559b extends C43570h {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo88739a(String str, int i) {
        String str2;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        if (str.endsWith(File.separator)) {
            str2 = "interact_sticker.png";
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(File.separator);
            sb2.append("interact_sticker.png");
            str2 = sb2.toString();
        }
        sb.append(str2);
        return sb.toString();
    }
}
