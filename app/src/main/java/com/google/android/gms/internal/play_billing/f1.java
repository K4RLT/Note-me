package com.google.android.gms.internal.play_billing;
import g3.a;
import i1.c;
import q.x;
import w1.a;
import x.n;

/* loaded from: classes.dex */
public final class f1 extends g1 {

    /* renamed from: w, reason: collision with root package name */
    public final byte[] f15420w;

    /* renamed from: x, reason: collision with root package name */
    public final int f15421x;

    /* renamed from: y, reason: collision with root package name */
    public final int f15422y;

    public f1(byte[] bArr, int i, int i10) {
        g1.p(i, i + i10, bArr.length);
        this.f15420w = bArr;
        this.f15421x = i;
        this.f15422y = i10;
    }

    @Override // com.google.android.gms.internal.play_billing.g1
    public final byte a(int i) {
        int i10 = this.f15422y;
        if (((i10 - (i + 1)) | i) < 0) {
            if (i < 0) {
                throw new ArrayIndexOutOfBoundsException(g3.a.g(i, "Index < 0: "));
            }
            throw new ArrayIndexOutOfBoundsException(w7.i1.c("Index > length: ", i, i10, ", "));
        }
        return this.f15420w[this.f15421x + i];
    }

    @Override // com.google.android.gms.internal.play_billing.g1
    public final byte b(int i) {
        return this.f15420w[this.f15421x + i];
    }

    @Override // com.google.android.gms.internal.play_billing.g1
    public final int d(int i, int i10) {
        return w1.a(i, this.f15421x, i10, this.f15420w);
    }

    @Override // com.google.android.gms.internal.play_billing.g1
    public final int g() {
        return this.f15422y;
    }

    @Override // com.google.android.gms.internal.play_billing.g1
    public final g1 k(int i, int i10) {
        int p10 = g1.p(i, i10, this.f15422y);
        if (p10 == 0) {
            return g1.f15429v;
        }
        return new f1(this.f15420w, this.f15421x + i, p10);
    }

    @Override // com.google.android.gms.internal.play_billing.g1
    public final void n(i1 i1Var) {
        i1Var.b(this.f15420w, this.f15421x, this.f15422y);
    }

    @Override // com.google.android.gms.internal.play_billing.g1
    public final boolean o(g1 g1Var) {
        boolean z3 = g1Var instanceof h1;
        if (!z3 && !(g1Var instanceof f1)) {
            return g1Var.o(this);
        }
        int g8 = g1Var.g();
        int i = this.f15422y;
        if (i <= g8) {
            if (i <= g1Var.g()) {
                byte[] bArr = this.f15420w;
                int i10 = this.f15421x;
                if (z3) {
                    return g1.r(bArr, i10, ((h1) g1Var).f15435w, 0, i);
                }
                if (g1Var instanceof f1) {
                    f1 f1Var = (f1) g1Var;
                    return g1.r(bArr, i10, f1Var.f15420w, f1Var.f15421x, i);
                }
                return g1Var.k(0, i).equals(k(i10, i + i10));
            }
            q.x.n(w7.i1.c("Ran off end of other: 0, ", i, g1Var.g(), ", "));
            return false;
        }
        throw new IllegalArgumentException("Length too large: " + i + i);
    }
}
