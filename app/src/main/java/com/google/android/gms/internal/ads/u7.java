package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* loaded from: classes.dex */
public final class u7 {

    /* renamed from: a, reason: collision with root package name */
    public final int f11560a;

    /* renamed from: b, reason: collision with root package name */
    public final int f11561b;

    /* renamed from: c, reason: collision with root package name */
    public final int f11562c;

    /* renamed from: d, reason: collision with root package name */
    public final int f11563d;
    public final int e;

    /* renamed from: f, reason: collision with root package name */
    public final int f11564f;

    public /* synthetic */ u7(int i, int i10, int i11, int i12, int i13, int i14) {
        this.f11560a = i;
        this.f11561b = i10;
        this.f11562c = i11;
        this.f11563d = i12;
        this.e = i13;
        this.f11564f = i14;
    }

    public static u7 a(String str) {
        b80.l(str.startsWith("Format:"));
        String[] split = TextUtils.split(str.substring(7), ",");
        int i = 0;
        int i10 = -1;
        int i11 = -1;
        int i12 = -1;
        int i13 = -1;
        int i14 = -1;
        while (true) {
            int length = split.length;
            if (i < length) {
                String h3 = ed1.h(split[i].trim());
                switch (h3.hashCode()) {
                    case 100571:
                        if (!h3.equals("end")) {
                            break;
                        } else {
                            i12 = i;
                            break;
                        }
                    case 3556653:
                        if (!h3.equals("text")) {
                            break;
                        } else {
                            i14 = i;
                            break;
                        }
                    case 102749521:
                        if (!h3.equals("layer")) {
                            break;
                        } else {
                            i10 = i;
                            break;
                        }
                    case 109757538:
                        if (!h3.equals("start")) {
                            break;
                        } else {
                            i11 = i;
                            break;
                        }
                    case 109780401:
                        if (!h3.equals("style")) {
                            break;
                        } else {
                            i13 = i;
                            break;
                        }
                }
                i++;
            } else {
                if (i11 != -1 && i12 != -1 && i14 != -1) {
                    return new u7(i10, i11, i12, i13, i14, length);
                }
                return null;
            }
        }
    }
}
