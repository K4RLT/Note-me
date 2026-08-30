package com.google.android.gms.internal.ads;
import a5.a;
import g3.a;
import q.x;

import java.nio.ByteBuffer;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class mm1 extends lm1 {

    /* renamed from: w, reason: collision with root package name */
    public final byte[] f8380w;

    public mm1(byte[] bArr) {
        bArr.getClass();
        this.f8380w = bArr;
    }

    @Override // com.google.android.gms.internal.ads.lm1
    public final boolean D(om1 om1Var, int i, int i10) {
        int k3 = om1Var.k();
        byte[] bArr = this.f8380w;
        if (i10 <= k3) {
            int i11 = i + i10;
            if (i11 <= om1Var.k()) {
                if (om1Var instanceof mm1) {
                    return om1.d(bArr, 0, ((mm1) om1Var).f8380w, i, i10);
                }
                if (om1Var instanceof km1) {
                    km1 km1Var = (km1) om1Var;
                    return om1.d(bArr, 0, km1Var.f7808w, km1Var.f7809x + i, i10);
                }
                return om1Var.o(i, i11).equals(o(0, i10));
            }
            int k4 = om1Var.k();
            int length = String.valueOf(i).length();
            StringBuilder sb2 = new StringBuilder(length + 24 + String.valueOf(i10).length() + 2 + String.valueOf(k4).length());
            g3.a.r(i, i10, "Ran off end of other: ", ", ", sb2);
            q.x.n(a5.a.f(k4, ", ", sb2));
            return false;
        }
        int length2 = String.valueOf(i10).length();
        int length3 = bArr.length;
        StringBuilder sb3 = new StringBuilder(length2 + 18 + String.valueOf(length3).length());
        sb3.append("Length too large: ");
        sb3.append(i10);
        sb3.append(length3);
        throw new IllegalArgumentException(sb3.toString());
    }

    @Override // com.google.android.gms.internal.ads.om1
    public final byte g(int i) {
        return this.f8380w[i];
    }

    @Override // com.google.android.gms.internal.ads.om1
    public final int k() {
        return this.f8380w.length;
    }

    @Override // com.google.android.gms.internal.ads.om1
    public final om1 n(int i, int i10) {
        byte[] bArr = this.f8380w;
        int b10 = om1.b(i, i10, bArr.length);
        if (b10 == 0) {
            return om1.f9167v;
        }
        return new km1(bArr, i, b10);
    }

    @Override // com.google.android.gms.internal.ads.om1
    public final om1 o(int i, int i10) {
        byte[] bArr = this.f8380w;
        int b10 = om1.b(i, i10, bArr.length);
        if (b10 == 0) {
            return om1.f9167v;
        }
        return new km1(bArr, i, b10);
    }

    @Override // com.google.android.gms.internal.ads.om1
    public final void p(int i, int i10, int i11, byte[] bArr) {
        System.arraycopy(this.f8380w, i, bArr, i10, i11);
    }

    @Override // com.google.android.gms.internal.ads.om1
    public final ByteBuffer q() {
        return ByteBuffer.wrap(this.f8380w).asReadOnlyBuffer();
    }

    @Override // com.google.android.gms.internal.ads.om1
    public final void r(um1 um1Var) {
        byte[] bArr = this.f8380w;
        um1Var.X(bArr, 0, bArr.length);
    }

    @Override // com.google.android.gms.internal.ads.om1
    public final boolean s(om1 om1Var) {
        boolean z3 = om1Var instanceof mm1;
        byte[] bArr = this.f8380w;
        if (z3) {
            return Arrays.equals(bArr, ((mm1) om1Var).f8380w);
        }
        if (om1Var instanceof km1) {
            return D(om1Var, 0, bArr.length);
        }
        return om1Var.s(this);
    }

    @Override // com.google.android.gms.internal.ads.om1
    public final int u(int i, int i10, int i11) {
        return ln1.b(i, i10, i11, this.f8380w);
    }

    @Override // com.google.android.gms.internal.ads.om1
    public final rm1 v() {
        byte[] bArr = this.f8380w;
        return rm1.k(bArr, 0, bArr.length);
    }
}
