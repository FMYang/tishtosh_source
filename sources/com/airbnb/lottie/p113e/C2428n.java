package com.airbnb.lottie.p113e;

import android.graphics.Color;
import android.graphics.PointF;
import android.util.JsonReader;
import android.util.JsonToken;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.airbnb.lottie.e.n */
final class C2428n {

    /* renamed from: com.airbnb.lottie.e.n$1 */
    static /* synthetic */ class C24291 {

        /* renamed from: a */
        static final /* synthetic */ int[] f7533a = new int[JsonToken.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        static {
            /*
                android.util.JsonToken[] r0 = android.util.JsonToken.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f7533a = r0
                int[] r0 = f7533a     // Catch:{ NoSuchFieldError -> 0x0014 }
                android.util.JsonToken r1 = android.util.JsonToken.NUMBER     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f7533a     // Catch:{ NoSuchFieldError -> 0x001f }
                android.util.JsonToken r1 = android.util.JsonToken.BEGIN_ARRAY     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f7533a     // Catch:{ NoSuchFieldError -> 0x002a }
                android.util.JsonToken r1 = android.util.JsonToken.BEGIN_OBJECT     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.p113e.C2428n.C24291.<clinit>():void");
        }
    }

    /* renamed from: a */
    static int m7102a(JsonReader jsonReader) throws IOException {
        jsonReader.beginArray();
        int nextDouble = (int) (jsonReader.nextDouble() * 255.0d);
        int nextDouble2 = (int) (jsonReader.nextDouble() * 255.0d);
        int nextDouble3 = (int) (jsonReader.nextDouble() * 255.0d);
        while (jsonReader.hasNext()) {
            jsonReader.skipValue();
        }
        jsonReader.endArray();
        return Color.argb(NormalGiftView.ALPHA_255, nextDouble, nextDouble2, nextDouble3);
    }

    /* renamed from: b */
    static float m7104b(JsonReader jsonReader) throws IOException {
        JsonToken peek = jsonReader.peek();
        switch (C24291.f7533a[peek.ordinal()]) {
            case 1:
                return (float) jsonReader.nextDouble();
            case 2:
                jsonReader.beginArray();
                float nextDouble = (float) jsonReader.nextDouble();
                while (jsonReader.hasNext()) {
                    jsonReader.skipValue();
                }
                jsonReader.endArray();
                return nextDouble;
            default:
                StringBuilder sb = new StringBuilder("Unknown value for token of type ");
                sb.append(peek);
                throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: c */
    private static PointF m7106c(JsonReader jsonReader, float f) throws IOException {
        float nextDouble = (float) jsonReader.nextDouble();
        float nextDouble2 = (float) jsonReader.nextDouble();
        while (jsonReader.hasNext()) {
            jsonReader.skipValue();
        }
        return new PointF(nextDouble * f, nextDouble2 * f);
    }

    /* renamed from: b */
    static PointF m7105b(JsonReader jsonReader, float f) throws IOException {
        switch (C24291.f7533a[jsonReader.peek().ordinal()]) {
            case 1:
                return m7106c(jsonReader, f);
            case 2:
                return m7107d(jsonReader, f);
            case 3:
                return m7108e(jsonReader, f);
            default:
                StringBuilder sb = new StringBuilder("Unknown point starts with ");
                sb.append(jsonReader.peek());
                throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: d */
    private static PointF m7107d(JsonReader jsonReader, float f) throws IOException {
        jsonReader.beginArray();
        float nextDouble = (float) jsonReader.nextDouble();
        float nextDouble2 = (float) jsonReader.nextDouble();
        while (jsonReader.peek() != JsonToken.END_ARRAY) {
            jsonReader.skipValue();
        }
        jsonReader.endArray();
        return new PointF(nextDouble * f, nextDouble2 * f);
    }

    /* renamed from: a */
    static List<PointF> m7103a(JsonReader jsonReader, float f) throws IOException {
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.peek() == JsonToken.BEGIN_ARRAY) {
            jsonReader.beginArray();
            arrayList.add(m7105b(jsonReader, f));
            jsonReader.endArray();
        }
        jsonReader.endArray();
        return arrayList;
    }

    /* renamed from: e */
    private static PointF m7108e(JsonReader jsonReader, float f) throws IOException {
        jsonReader.beginObject();
        float f2 = 0.0f;
        float f3 = 0.0f;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            char c = 65535;
            switch (nextName.hashCode()) {
                case 120:
                    if (nextName.equals("x")) {
                        c = 0;
                        break;
                    }
                    break;
                case 121:
                    if (nextName.equals("y")) {
                        c = 1;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    f2 = m7104b(jsonReader);
                    break;
                case 1:
                    f3 = m7104b(jsonReader);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return new PointF(f2 * f, f3 * f);
    }
}
