package com.google.android.gms.internal.ads;
import p.a;

import android.graphics.Color;

/* loaded from: classes.dex */
public final class f8 {

    /* renamed from: a, reason: collision with root package name */
    public final String f5963a;

    /* renamed from: b, reason: collision with root package name */
    public final int f5964b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f5965c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f5966d;
    public final float e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f5967f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f5968g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f5969h;
    public final boolean i;

    /* renamed from: j, reason: collision with root package name */
    public final int f5970j;

    public f8(String str, int i, Integer num, Integer num2, float f10, boolean z3, boolean z9, boolean z10, boolean z11, int i10) {
        this.f5963a = str;
        this.f5964b = i;
        this.f5965c = num;
        this.f5966d = num2;
        this.e = f10;
        this.f5967f = z3;
        this.f5968g = z9;
        this.f5969h = z10;
        this.i = z11;
        this.f5970j = i10;
    }

    public static Integer a(String str) {
        long parseLong;
        boolean z3;
        try {
            if (str.startsWith("&H")) {
                parseLong = Long.parseLong(str.substring(2), 16);
            } else {
                parseLong = Long.parseLong(str);
            }
            if (parseLong <= 4294967295L) {
                z3 = true;
            } else {
                z3 = false;
            }
            b80.l(z3);
            int a10 = ct.a(((parseLong >> 24) & 255) ^ 255);
            int a11 = ct.a((parseLong >> 16) & 255);
            return Integer.valueOf(Color.argb(a10, ct.a(parseLong & 255), ct.a((parseLong >> 8) & 255), a11));
        } catch (IllegalArgumentException e) {
            x21.K("SsaStyle", a.o(new StringBuilder(String.valueOf(str).length() + 36), "Failed to parse color expression: '", str, "'"), e);
            return null;
        }
    }

    public static boolean b(String str) {
        try {
            int parseInt = Integer.parseInt(str);
            if (parseInt != 1 && parseInt != -1) {
                return false;
            }
            return true;
        } catch (NumberFormatException e) {
            x21.K("SsaStyle", a.o(new StringBuilder(String.valueOf(str).length() + 33), "Failed to parse boolean value: '", str, "'"), e);
            return false;
        }
    }
}
