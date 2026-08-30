package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;

/* loaded from: classes.dex */
public final class k5 {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f7651a = new byte[8];

    /* renamed from: b, reason: collision with root package name */
    public final ArrayDeque f7652b = new ArrayDeque();

    /* renamed from: c, reason: collision with root package name */
    public final q5 f7653c = new q5(0);

    /* renamed from: d, reason: collision with root package name */
    public tf f7654d;
    public int e;

    /* renamed from: f, reason: collision with root package name */
    public int f7655f;

    /* renamed from: g, reason: collision with root package name */
    public long f7656g;

    public final long a(o2 o2Var, int i) {
        o2Var.v(this.f7651a, 0, i);
        long j10 = 0;
        for (int i10 = 0; i10 < i; i10++) {
            j10 = (j10 << 8) | (r0[i10] & 255);
        }
        return j10;
    }
}
