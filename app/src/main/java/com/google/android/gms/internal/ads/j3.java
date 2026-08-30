package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class j3 {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f7301a = new byte[10];

    /* renamed from: b, reason: collision with root package name */
    public boolean f7302b;

    /* renamed from: c, reason: collision with root package name */
    public int f7303c;

    /* renamed from: d, reason: collision with root package name */
    public long f7304d;
    public int e;

    /* renamed from: f, reason: collision with root package name */
    public int f7305f;

    /* renamed from: g, reason: collision with root package name */
    public int f7306g;

    public final void a(o2 o2Var) {
        if (!this.f7302b) {
            byte[] bArr = this.f7301a;
            o2Var.y(bArr, 0, 10);
            o2Var.h();
            if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111 && (bArr[7] & 254) == 186) {
                this.f7302b = true;
            }
        }
    }

    public final void b(i3 i3Var, long j10, int i, int i10, int i11, h3 h3Var) {
        boolean z3;
        if (this.f7306g <= i10 + i11) {
            z3 = true;
        } else {
            z3 = false;
        }
        b80.L("TrueHD chunk samples must be contiguous in the sample queue.", z3);
        if (this.f7302b) {
            int i12 = this.f7303c;
            int i13 = i12 + 1;
            this.f7303c = i13;
            if (i12 == 0) {
                this.f7304d = j10;
                this.e = i;
                this.f7305f = 0;
            }
            this.f7305f += i10;
            this.f7306g = i11;
            if (i13 >= 16) {
                c(i3Var, h3Var);
            }
        }
    }

    public final void c(i3 i3Var, h3 h3Var) {
        if (this.f7303c > 0) {
            i3Var.c(this.f7304d, this.e, this.f7305f, this.f7306g, h3Var);
            this.f7303c = 0;
        }
    }
}
