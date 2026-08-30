package com.google.android.gms.internal.play_billing;
import i1.c;
import q.x;
import w1.a;
import x.n;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class h1 extends g1 {

    /* renamed from: w, reason: collision with root package name */
    public final byte[] f15435w;

    public h1(byte[] bArr) {
        bArr.getClass();
        this.f15435w = bArr;
    }

    @Override // com.google.android.gms.internal.play_billing.g1
    public final byte a(int i) {
        return this.f15435w[i];
    }

    @Override // com.google.android.gms.internal.play_billing.g1
    public final byte b(int i) {
        return this.f15435w[i];
    }

    @Override // com.google.android.gms.internal.play_billing.g1
    public final int d(int i, int i10) {
        return w1.a(i, 0, i10, this.f15435w);
    }

    @Override // com.google.android.gms.internal.play_billing.g1
    public final int g() {
        return this.f15435w.length;
    }

    @Override // com.google.android.gms.internal.play_billing.g1
    public final g1 k(int i, int i10) {
        byte[] bArr = this.f15435w;
        int p10 = g1.p(0, i10, bArr.length);
        if (p10 == 0) {
            return g1.f15429v;
        }
        return new f1(bArr, 0, p10);
    }

    @Override // com.google.android.gms.internal.play_billing.g1
    public final void n(i1 i1Var) {
        byte[] bArr = this.f15435w;
        i1Var.b(bArr, 0, bArr.length);
    }

    @Override // com.google.android.gms.internal.play_billing.g1
    public final boolean o(g1 g1Var) {
        boolean z3 = g1Var instanceof h1;
        byte[] bArr = this.f15435w;
        if (z3) {
            return Arrays.equals(bArr, ((h1) g1Var).f15435w);
        }
        boolean z9 = g1Var instanceof f1;
        if (z9) {
            f1 f1Var = (f1) g1Var;
            int i = f1Var.f15422y;
            int length = bArr.length;
            if (length <= i) {
                if (length <= i) {
                    if (z3) {
                        return g1.r(bArr, 0, ((h1) g1Var).f15435w, 0, length);
                    }
                    if (z9) {
                        return g1.r(bArr, 0, f1Var.f15420w, f1Var.f15421x, length);
                    }
                    return g1Var.k(0, length).equals(k(0, length));
                }
                q.x.n(w7.i1.c("Ran off end of other: 0, ", length, i, ", "));
                return false;
            }
            throw new IllegalArgumentException("Length too large: " + length + length);
        }
        return g1Var.o(this);
    }
}
