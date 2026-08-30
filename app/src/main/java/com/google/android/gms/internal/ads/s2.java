package com.google.android.gms.internal.ads;

import java.nio.ByteOrder;
import java.util.Collections;

/* loaded from: classes.dex */
public final class s2 {

    /* renamed from: a, reason: collision with root package name */
    public final int f10455a;

    /* renamed from: b, reason: collision with root package name */
    public final int f10456b;

    /* renamed from: c, reason: collision with root package name */
    public final int f10457c;

    /* renamed from: d, reason: collision with root package name */
    public final int f10458d;
    public final int e;

    /* renamed from: f, reason: collision with root package name */
    public final int f10459f;

    /* renamed from: g, reason: collision with root package name */
    public final int f10460g;

    /* renamed from: h, reason: collision with root package name */
    public final int f10461h;
    public final int i;

    /* renamed from: j, reason: collision with root package name */
    public final long f10462j;

    /* renamed from: k, reason: collision with root package name */
    public final x90 f10463k;

    /* renamed from: l, reason: collision with root package name */
    public final m8 f10464l;

    public s2(byte[] bArr, int i) {
        tk0 tk0Var = new tk0(bArr, bArr.length);
        tk0Var.d(i * 8);
        this.f10455a = tk0Var.h(16);
        this.f10456b = tk0Var.h(16);
        this.f10457c = tk0Var.h(24);
        this.f10458d = tk0Var.h(24);
        int h3 = tk0Var.h(20);
        this.e = h3;
        this.f10459f = c(h3);
        this.f10460g = tk0Var.h(3) + 1;
        int h10 = tk0Var.h(5) + 1;
        this.f10461h = h10;
        this.i = d(h10);
        this.f10462j = tk0Var.i(36);
        this.f10463k = null;
        this.f10464l = null;
    }

    public static int c(int i) {
        switch (i) {
            case 8000:
                return 4;
            case 16000:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case 48000:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case 192000:
                return 3;
            default:
                return -1;
        }
    }

    public static int d(int i) {
        if (i == 8) {
            return 1;
        }
        if (i == 12) {
            return 2;
        }
        if (i == 16) {
            return 4;
        }
        if (i == 20) {
            return 5;
        }
        if (i != 24) {
            return i != 32 ? -1 : 7;
        }
        return 6;
    }

    public final long a() {
        long j10 = this.f10462j;
        if (j10 == 0) {
            return -9223372036854775807L;
        }
        return (j10 * 1000000) / this.e;
    }

    public final mw1 b(byte[] bArr, m8 m8Var) {
        bArr[4] = Byte.MIN_VALUE;
        m8 m8Var2 = this.f10464l;
        if (m8Var2 != null) {
            m8Var = m8Var2.b(m8Var);
        }
        rv1 rv1Var = new rv1();
        rv1Var.e("audio/flac");
        int i = this.f10458d;
        if (i <= 0) {
            i = -1;
        }
        rv1Var.f10308o = i;
        rv1Var.G = this.f10460g;
        rv1Var.I = this.e;
        rv1Var.J = bq0.b(this.f10461h, ByteOrder.LITTLE_ENDIAN);
        rv1Var.f10310q = Collections.singletonList(bArr);
        rv1Var.f10304k = m8Var;
        return new mw1(rv1Var);
    }

    public s2(int i, int i10, int i11, int i12, int i13, int i14, int i15, long j10, x90 x90Var, m8 m8Var) {
        this.f10455a = i;
        this.f10456b = i10;
        this.f10457c = i11;
        this.f10458d = i12;
        this.e = i13;
        this.f10459f = c(i13);
        this.f10460g = i14;
        this.f10461h = i15;
        this.i = d(i15);
        this.f10462j = j10;
        this.f10463k = x90Var;
        this.f10464l = m8Var;
    }
}
