package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class x2 implements a3 {

    /* renamed from: a, reason: collision with root package name */
    public final yg0 f12426a;

    /* renamed from: b, reason: collision with root package name */
    public final yg0 f12427b;

    /* renamed from: c, reason: collision with root package name */
    public final long f12428c;

    public x2(long j10, long[] jArr, long[] jArr2) {
        boolean z3;
        int length = jArr.length;
        int length2 = jArr2.length;
        if (length == length2) {
            z3 = true;
        } else {
            z3 = false;
        }
        b80.l(z3);
        if (length2 > 0 && jArr2[0] > 0) {
            int i = length2 + 1;
            yg0 yg0Var = new yg0(i);
            this.f12426a = yg0Var;
            yg0 yg0Var2 = new yg0(i);
            this.f12427b = yg0Var2;
            yg0Var.d();
            yg0Var2.d();
        } else {
            this.f12426a = new yg0(length2);
            this.f12427b = new yg0(length2);
        }
        this.f12426a.e(jArr);
        this.f12427b.e(jArr2);
        this.f12428c = j10;
    }

    @Override // com.google.android.gms.internal.ads.a3
    public final z2 a(long j10) {
        yg0 yg0Var = this.f12427b;
        int i = yg0Var.f12866a;
        if (i == 0) {
            b3 b3Var = b3.f4701c;
            return new z2(b3Var, b3Var);
        }
        String str = bq0.f4860a;
        int i10 = i - 1;
        int i11 = 0;
        int i12 = 0;
        while (i12 <= i10) {
            int i13 = (i12 + i10) >>> 1;
            if (yg0Var.f(i13) < j10) {
                i12 = i13 + 1;
            } else {
                i10 = i13 - 1;
            }
        }
        int i14 = i10 + 1;
        if (i14 < yg0Var.f12866a && yg0Var.f(i14) == j10) {
            i11 = i14;
        } else if (i10 != -1) {
            i11 = i10;
        }
        long f10 = yg0Var.f(i11);
        yg0 yg0Var2 = this.f12426a;
        b3 b3Var2 = new b3(f10, yg0Var2.f(i11));
        if (f10 != j10 && i11 != yg0Var.f12866a - 1) {
            int i15 = i11 + 1;
            return new z2(b3Var2, new b3(yg0Var.f(i15), yg0Var2.f(i15)));
        }
        return new z2(b3Var2, b3Var2);
    }

    @Override // com.google.android.gms.internal.ads.a3
    public final long zza() {
        return this.f12428c;
    }

    @Override // com.google.android.gms.internal.ads.a3
    public final boolean zzb() {
        if (this.f12427b.f12866a > 0) {
            return true;
        }
        return false;
    }
}
