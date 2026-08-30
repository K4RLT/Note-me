package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class rp0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f10269a;

    /* renamed from: b, reason: collision with root package name */
    public final int f10270b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f10271c;

    public rp0(int i, int i10, boolean z3) {
        this.f10269a = i;
        this.f10270b = i10;
        this.f10271c = z3;
    }

    public static ArrayList a(JsonReader jsonReader) {
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            jsonReader.beginObject();
            int i = 0;
            int i10 = 0;
            boolean z3 = false;
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                if ("width".equals(nextName)) {
                    i = jsonReader.nextInt();
                } else if ("height".equals(nextName)) {
                    i10 = jsonReader.nextInt();
                } else if ("is_fluid_height".equals(nextName)) {
                    z3 = jsonReader.nextBoolean();
                } else {
                    jsonReader.skipValue();
                }
            }
            jsonReader.endObject();
            arrayList.add(new rp0(i, i10, z3));
        }
        jsonReader.endArray();
        return arrayList;
    }
}
