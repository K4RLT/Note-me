package com.google.android.gms.internal.ads;
import g3.a;
import va.a;

import java.math.RoundingMode;

/* loaded from: classes.dex */
public final class ka implements ja {

    /* renamed from: a, reason: collision with root package name */
    public final p2 f7688a;

    /* renamed from: b, reason: collision with root package name */
    public final i3 f7689b;

    /* renamed from: c, reason: collision with root package name */
    public final ma f7690c;

    /* renamed from: d, reason: collision with root package name */
    public final mw1 f7691d;
    public final int e;

    /* renamed from: f, reason: collision with root package name */
    public long f7692f;

    /* renamed from: g, reason: collision with root package name */
    public int f7693g;

    /* renamed from: h, reason: collision with root package name */
    public long f7694h;

    public ka(p2 p2Var, i3 i3Var, ma maVar, String str, int i) {
        int i10;
        this.f7688a = p2Var;
        this.f7689b = i3Var;
        this.f7690c = maVar;
        int i11 = maVar.f8285a;
        int i12 = maVar.f8286b;
        int i13 = maVar.f8288d * i11;
        int i14 = maVar.f8287c;
        int i15 = i13 / 8;
        if (i14 == i15) {
            int i16 = i12 * i15;
            int i17 = i16 * 8;
            int max = Math.max(i15, i16 / 10);
            this.e = max;
            rv1 rv1Var = new rv1();
            rv1Var.d("audio/wav");
            rv1Var.e(str);
            rv1Var.f10302h = i17;
            rv1Var.i = i17;
            rv1Var.f10308o = max;
            rv1Var.G = i11;
            int i18 = maVar.e;
            if (i18 == 0) {
                i10 = -1;
            } else {
                i10 = i18 << 2;
            }
            rv1Var.H = i10;
            rv1Var.I = i12;
            rv1Var.J = i;
            this.f7691d = new mw1(rv1Var);
            return;
        }
        throw va.a(null, g3.a.f(i15, i14, "Expected block size: ", "; got: ", new StringBuilder(String.valueOf(i15).length() + 28 + String.valueOf(i14).length())));
    }

    @Override // com.google.android.gms.internal.ads.ja
    public final void a(int i, long j10) {
        this.f7688a.B(new na(this.f7690c, 1, i, j10));
        this.f7689b.e(this.f7691d);
    }

    @Override // com.google.android.gms.internal.ads.ja
    public final boolean b(o2 o2Var, long j10) {
        int i;
        int i10;
        long j11 = j10;
        while (j11 > 0 && (i = this.f7693g) < (i10 = this.e)) {
            int d2 = this.f7689b.d(o2Var, (int) Math.min(i10 - i, j11), true);
            if (d2 == -1) {
                j11 = 0;
            } else {
                this.f7693g += d2;
                j11 -= d2;
            }
        }
        int i11 = this.f7693g;
        int i12 = this.f7690c.f8287c;
        int i13 = i11 / i12;
        if (i13 > 0) {
            long w10 = this.f7692f + bq0.w(this.f7694h, 1000000L, r2.f8286b, RoundingMode.DOWN);
            int i14 = i13 * i12;
            int i15 = this.f7693g - i14;
            this.f7689b.c(w10, 1, i14, i15, null);
            this.f7694h += i13;
            this.f7693g = i15;
        }
        if (j11 <= 0) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.ja
    public final void d(long j10) {
        this.f7692f = j10;
        this.f7693g = 0;
        this.f7694h = 0L;
    }
}
