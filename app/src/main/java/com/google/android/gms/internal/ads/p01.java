package com.google.android.gms.internal.ads;

import com.facebook.ads.AdError;
import java.util.Objects;

/* loaded from: classes.dex */
public final class p01 {

    /* renamed from: a, reason: collision with root package name */
    public final t11 f9304a;

    /* renamed from: b, reason: collision with root package name */
    public final d11 f9305b;

    /* renamed from: c, reason: collision with root package name */
    public final k11 f9306c;

    /* renamed from: d, reason: collision with root package name */
    public final h21 f9307d;
    public final dy0 e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f9308f;

    /* renamed from: g, reason: collision with root package name */
    public final long f9309g;

    /* renamed from: h, reason: collision with root package name */
    public final long f9310h;

    public p01(t11 t11Var, d11 d11Var, k11 k11Var, h21 h21Var, dy0 dy0Var, boolean z3, long j10, long j11) {
        this.f9304a = t11Var;
        this.f9305b = d11Var;
        this.f9306c = k11Var;
        this.f9307d = h21Var;
        this.e = dy0Var;
        this.f9308f = z3;
        this.f9309g = j10;
        this.f9310h = j11;
    }

    public final q81 a() {
        q81 t3 = q81.t(this.f9306c.zzb());
        i6 i6Var = i6.f7019x;
        o81 o81Var = o81.f9033u;
        i71 S = ed1.S(t3, Throwable.class, i6Var, o81Var);
        t11 t11Var = this.f9304a;
        Objects.requireNonNull(t11Var);
        return ed1.c0(ed1.d0(S, new cv(10, t11Var), o81Var), new m01(this, 0), o81Var);
    }

    public final q81 b(final int i) {
        q81 t3 = q81.t(this.f9305b.zza());
        cv cvVar = new cv(11, this);
        o81 o81Var = o81.f9033u;
        i71 S = ed1.S(ed1.S(ed1.S(ed1.d0(ed1.c0(ed1.d0(t3, cvVar, o81Var), new m01(this, 1), o81Var), i6.f7020y, o81Var), k01.class, i6.f7021z, o81Var), l01.class, i6.A, o81Var), j01.class, new f31() { // from class: com.google.android.gms.internal.ads.n01
            @Override // com.google.android.gms.internal.ads.f31
            public final /* synthetic */ Object apply(Object obj) {
                p01 p01Var = p01.this;
                if (p01Var.f9308f) {
                    int i10 = i;
                    if (i10 < p01Var.f9309g) {
                        p01Var.e.a(new c4.i(p01Var, i10, 6), p01Var.f9310h * ((long) Math.pow(2.0d, i10)));
                    }
                }
                return o01.f8906z;
            }
        }, o81Var);
        this.f9307d.e(AdError.LOAD_TOO_FREQUENTLY_ERROR_CODE, S);
        return S;
    }
}
