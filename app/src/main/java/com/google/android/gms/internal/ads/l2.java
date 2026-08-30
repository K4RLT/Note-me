package com.google.android.gms.internal.ads;

import java.io.EOFException;

/* loaded from: classes.dex */
public final class l2 implements i3 {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f7921a = new byte[4096];

    @Override // com.google.android.gms.internal.ads.i3
    public final int b(fs1 fs1Var, int i, boolean z3) {
        int e = fs1Var.e(this.f7921a, 0, Math.min(4096, i));
        if (e == -1) {
            if (z3) {
                return -1;
            }
            throw new EOFException();
        }
        return e;
    }

    @Override // com.google.android.gms.internal.ads.i3
    public final void c(long j10, int i, int i10, int i11, h3 h3Var) {
    }

    @Override // com.google.android.gms.internal.ads.i3
    public final void e(mw1 mw1Var) {
    }

    @Override // com.google.android.gms.internal.ads.i3
    public final void f(xk0 xk0Var, int i, int i10) {
        xk0Var.G(i);
    }
}
