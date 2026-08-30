package com.google.android.gms.internal.ads;
import a5.a;
import q.x;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class km1 extends lm1 {

    /* renamed from: w, reason: collision with root package name */
    public final byte[] f7808w;

    /* renamed from: x, reason: collision with root package name */
    public final int f7809x;

    /* renamed from: y, reason: collision with root package name */
    public final int f7810y;

    public km1(byte[] bArr, int i, int i10) {
        om1.b(i, i + i10, bArr.length);
        this.f7808w = bArr;
        this.f7809x = i;
        this.f7810y = i10;
    }

    @Override // com.google.android.gms.internal.ads.lm1
    public final boolean D(om1 om1Var, int i, int i10) {
        if (i10 <= om1Var.k()) {
            int i11 = i + i10;
            if (i11 <= om1Var.k()) {
                boolean z3 = om1Var instanceof mm1;
                byte[] bArr = this.f7808w;
                int i12 = this.f7809x;
                if (z3) {
                    return om1.d(bArr, i12, ((mm1) om1Var).f8380w, i, i10);
                }
                if (om1Var instanceof km1) {
                    km1 km1Var = (km1) om1Var;
                    return om1.d(bArr, i12, km1Var.f7808w, km1Var.f7809x + i, i10);
                }
                return om1Var.o(i, i11).equals(o(i12, i10 + i12));
            }
            int k3 = om1Var.k();
            int length = String.valueOf(i).length();
            StringBuilder sb2 = new StringBuilder(length + 24 + String.valueOf(i10).length() + 2 + String.valueOf(k3).length());
            g3.a.r(i, i10, "Ran off end of other: ", ", ", sb2);
            q.x.n(a5.a.f(k3, ", ", sb2));
            return false;
        }
        int length2 = String.valueOf(i10).length();
        int i13 = this.f7810y;
        StringBuilder sb3 = new StringBuilder(length2 + 18 + String.valueOf(i13).length());
        sb3.append("Length too large: ");
        sb3.append(i10);
        sb3.append(i13);
        throw new IllegalArgumentException(sb3.toString());
    }

    @Override // com.google.android.gms.internal.ads.om1
    public final byte g(int i) {
        return this.f7808w[this.f7809x + i];
    }

    @Override // com.google.android.gms.internal.ads.om1
    public final int k() {
        return this.f7810y;
    }

    @Override // com.google.android.gms.internal.ads.om1
    public final om1 n(int i, int i10) {
        int b10 = om1.b(i, i10, this.f7810y);
        if (b10 == 0) {
            return om1.f9167v;
        }
        return new km1(this.f7808w, this.f7809x + i, b10);
    }

    @Override // com.google.android.gms.internal.ads.om1
    public final om1 o(int i, int i10) {
        int b10 = om1.b(i, i10, this.f7810y);
        if (b10 == 0) {
            return om1.f9167v;
        }
        return new km1(this.f7808w, this.f7809x + i, b10);
    }

    @Override // com.google.android.gms.internal.ads.om1
    public final void p(int i, int i10, int i11, byte[] bArr) {
        System.arraycopy(this.f7808w, this.f7809x + i, bArr, i10, i11);
    }

    @Override // com.google.android.gms.internal.ads.om1
    public final ByteBuffer q() {
        return ByteBuffer.wrap(this.f7808w, this.f7809x, this.f7810y).asReadOnlyBuffer();
    }

    @Override // com.google.android.gms.internal.ads.om1
    public final void r(um1 um1Var) {
        um1Var.X(this.f7808w, this.f7809x, this.f7810y);
    }

    @Override // com.google.android.gms.internal.ads.om1
    public final boolean s(om1 om1Var) {
        if (!(om1Var instanceof mm1) && !(om1Var instanceof km1)) {
            return om1Var.s(this);
        }
        return D(om1Var, 0, this.f7810y);
    }

    @Override // com.google.android.gms.internal.ads.om1
    public final int u(int i, int i10, int i11) {
        return ln1.b(i, this.f7809x + i10, i11, this.f7808w);
    }

    @Override // com.google.android.gms.internal.ads.om1
    public final rm1 v() {
        return rm1.k(this.f7808w, this.f7809x, this.f7810y);
    }
}
