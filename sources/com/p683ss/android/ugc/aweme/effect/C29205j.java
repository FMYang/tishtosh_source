package com.p683ss.android.ugc.aweme.effect;

import com.p683ss.android.medialib.model.EffectFileInfo;
import com.p683ss.android.medialib.model.EffectModel;
import com.p683ss.android.medialib.player.EffectConfig;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.shortvideo.edit.model.VideoCutInfo;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: com.ss.android.ugc.aweme.effect.j */
public final class C29205j {

    /* renamed from: a */
    private static final File f76509a = new File(C39629l.m88233b().getFilesDir(), "effect");

    /* renamed from: a */
    private static String m68773a() {
        return f76509a.getAbsolutePath();
    }

    /* renamed from: a */
    public static EffectConfig m68772a(List<EffectPointModel> list, VideoCutInfo videoCutInfo, boolean z, long[] jArr) {
        int i;
        float f;
        long j;
        List<EffectPointModel> list2 = list;
        EffectConfig effectConfig = new EffectConfig();
        char c = 0;
        if (list2 == null) {
            i = 0;
        } else {
            i = list.size();
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (!z) {
            int i2 = 0;
            while (i2 < i) {
                EffectPointModel effectPointModel = (EffectPointModel) list2.get(i2);
                String key = effectPointModel.getKey();
                if ("4".equals(key)) {
                    effectPointModel.setKey("7778");
                    StringBuilder sb = new StringBuilder();
                    sb.append(m68773a());
                    sb.append(File.separator);
                    sb.append("1affdb4d5f33b7e99a052b66ec941819");
                    effectPointModel.setResDir(sb.toString());
                } else if ("5".equals(key)) {
                    effectPointModel.setKey("7779");
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(m68773a());
                    sb2.append(File.separator);
                    sb2.append("53d18e52dc34ba68a72a6c8dcb4d7038");
                    effectPointModel.setResDir(sb2.toString());
                } else if ("6".equals(key)) {
                    effectPointModel.setKey("7780");
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(m68773a());
                    sb3.append(File.separator);
                    sb3.append("53899e5b1044d0e96b075d8ac8f99f00");
                    effectPointModel.setResDir(sb3.toString());
                } else if ("7".equals(key)) {
                    effectPointModel.setKey("7781");
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(m68773a());
                    sb4.append(File.separator);
                    sb4.append("a0e184d4d6bf7e32a629d425f8b37f69");
                    effectPointModel.setResDir(sb4.toString());
                } else if ("8".equals(key)) {
                    effectPointModel.setKey("7782");
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append(m68773a());
                    sb5.append(File.separator);
                    sb5.append("f5836e3fe6c59ee1da264e768903b713");
                    effectPointModel.setResDir(sb5.toString());
                } else if ("9".equals(key)) {
                    effectPointModel.setKey("7783");
                    StringBuilder sb6 = new StringBuilder();
                    sb6.append(m68773a());
                    sb6.append(File.separator);
                    sb6.append("d492b66348b9dde8509ee382f61d89c9");
                    effectPointModel.setResDir(sb6.toString());
                }
                try {
                    int parseInt = Integer.parseInt(effectPointModel.getKey());
                    if (videoCutInfo == null) {
                        f = 1.0f;
                    } else {
                        f = videoCutInfo.getSpeed();
                    }
                    if (videoCutInfo == null) {
                        j = 0;
                    } else {
                        j = videoCutInfo.getStart();
                    }
                    long startPoint = (long) ((((float) (((long) effectPointModel.getStartPoint()) - jArr[c])) * f) + ((float) j));
                    arrayList.add(new EffectModel(parseInt, (int) TimeUnit.MILLISECONDS.toMicros(startPoint), (int) TimeUnit.MILLISECONDS.toMicros((long) (((float) startPoint) + (((float) (effectPointModel.getEndPoint() - effectPointModel.getStartPoint())) * f)))));
                    arrayList2.add(new EffectFileInfo(parseInt, effectPointModel.getResDir()));
                } catch (NumberFormatException unused) {
                }
                i2++;
                c = 0;
            }
        }
        EffectFileInfo[] effectFileInfoArr = new EffectFileInfo[arrayList2.size()];
        effectConfig.setEffectType(1).setEffectFileInfos((EffectFileInfo[]) arrayList2.toArray(effectFileInfoArr)).setEffectModels((EffectModel[]) arrayList.toArray(new EffectModel[arrayList.size()])).setEffectBuildChainType(1);
        return effectConfig;
    }
}
