package com.google.android.gms.internal.ads;

import android.os.Trace;

/* loaded from: classes.dex */
public final class w0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ tw1 f12084a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f12085b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ y0 f12086c;

    public w0(y0 y0Var, tw1 tw1Var, int i, long j10) {
        this.f12084a = tw1Var;
        this.f12085b = i;
        this.f12086c = y0Var;
    }

    public final void a() {
        y0 y0Var = this.f12086c;
        y0Var.getClass();
        Trace.beginSection("dropVideoBuffer");
        this.f12084a.m(this.f12085b);
        Trace.endSection();
        y0Var.w0(0, 1);
    }
}
