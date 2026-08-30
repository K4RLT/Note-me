package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes.dex */
public class mc1 {

    /* renamed from: a, reason: collision with root package name */
    public final long[] f8323a;

    /* renamed from: b, reason: collision with root package name */
    public final long[] f8324b;

    /* renamed from: c, reason: collision with root package name */
    public final long[] f8325c;

    public mc1() {
        mc1 mc1Var = ed1.K;
        this.f8323a = Arrays.copyOf(mc1Var.f8323a, 10);
        this.f8324b = Arrays.copyOf(mc1Var.f8324b, 10);
        this.f8325c = Arrays.copyOf(mc1Var.f8325c, 10);
    }

    public void a(long[] jArr, long[] jArr2) {
        System.arraycopy(jArr2, 0, jArr, 0, 10);
    }

    public final void b(mc1 mc1Var, int i) {
        ay0.k(this.f8323a, mc1Var.f8323a, i);
        ay0.k(this.f8324b, mc1Var.f8324b, i);
        ay0.k(this.f8325c, mc1Var.f8325c, i);
    }

    public mc1(long[] jArr, long[] jArr2, long[] jArr3) {
        this.f8323a = jArr;
        this.f8324b = jArr2;
        this.f8325c = jArr3;
    }
}
