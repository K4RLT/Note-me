package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import java.io.File;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.Objects;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public final class g11 implements d11 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f6255a;

    /* renamed from: b, reason: collision with root package name */
    public final pr1 f6256b;

    /* renamed from: c, reason: collision with root package name */
    public final k11 f6257c;

    /* renamed from: d, reason: collision with root package name */
    public final h21 f6258d;
    public final ExecutorService e;

    /* renamed from: f, reason: collision with root package name */
    public final v01 f6259f;

    /* renamed from: g, reason: collision with root package name */
    public final cv0 f6260g;

    public g11(Context context, pr1 pr1Var, k11 k11Var, h21 h21Var, ExecutorService executorService, v01 v01Var, cv0 cv0Var) {
        this.f6255a = context;
        this.f6256b = pr1Var;
        this.f6257c = k11Var;
        this.f6258d = h21Var;
        this.e = executorService;
        this.f6259f = v01Var;
        this.f6260g = cv0Var;
    }

    public static ty0 a(int i) {
        sy0 C = ty0.C();
        C.b();
        ((ty0) C.f4845v).H(i);
        return (ty0) C.c();
    }

    @Override // com.google.android.gms.internal.ads.d11
    public final q81 zza() {
        pr1 pr1Var = this.f6256b;
        Objects.requireNonNull(pr1Var);
        bo0 bo0Var = new bo0(6, pr1Var);
        ExecutorService executorService = this.e;
        q81 t3 = q81.t(ed1.E(bo0Var, executorService));
        final int i = 1;
        f31 f31Var = new f31(this) { // from class: com.google.android.gms.internal.ads.f11

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g11 f5883b;

            {
                this.f5883b = this;
            }

            /* JADX WARN: Finally extract failed */
            @Override // com.google.android.gms.internal.ads.f31
            public final Object apply(Object obj) {
                boolean z3;
                switch (i) {
                    case 0:
                        vy0 vy0Var = (vy0) obj;
                        g11 g11Var = this.f5883b;
                        pr1 pr1Var2 = g11Var.f6256b;
                        String z9 = vy0Var.z().z();
                        String A = vy0Var.z().A();
                        h21 h21Var = g11Var.f6258d;
                        g21 a10 = h21Var.a(15203);
                        try {
                            a10.a();
                            wv0 d2 = ed1.d(g11Var.f6255a, (hh) pr1Var2.zzb(), z9, A, g11Var.f6260g);
                            int i10 = d2.f12339w;
                            a10.c();
                            int i11 = 2;
                            if (i10 == 2) {
                                h21Var.b(15208);
                                return g11.a(4);
                            }
                            byte[] bArr = d2.f12338v;
                            if (bArr != null && bArr.length != 0) {
                                try {
                                    ih D = ih.D(bArr, wm1.a());
                                    if (!D.z().z().isEmpty() && !D.z().A().isEmpty() && D.B().a().length != 0) {
                                        if (!vy0Var.equals(vy0.F()) && TextUtils.equals(vy0Var.z().z(), D.z().z()) && TextUtils.equals(vy0Var.z().A(), D.z().A())) {
                                            h21Var.b(15209);
                                        } else {
                                            if (i10 == 4) {
                                                v01 v01Var = g11Var.f6259f;
                                                byte[] a11 = D.A().a();
                                                File file = v01Var.f11767a;
                                                try {
                                                    b80.v(file);
                                                    b80.j(file, a11);
                                                    v01Var.f11768b.getClass();
                                                    z3 = bv0.a(file);
                                                } catch (IOException | GeneralSecurityException e) {
                                                    v01Var.f11769c.d(2027, e);
                                                    z3 = false;
                                                }
                                                try {
                                                    file.delete();
                                                } catch (SecurityException unused) {
                                                }
                                                if (!z3) {
                                                    h21Var.b(15206);
                                                    return g11.a(12);
                                                }
                                                i10 = 4;
                                            }
                                            sy0 C = ty0.C();
                                            if (i10 != 2) {
                                                if (i10 != 3) {
                                                    if (i10 != 4) {
                                                        if (i10 != 6) {
                                                            i11 = 1;
                                                        } else {
                                                            i11 = 5;
                                                        }
                                                    } else {
                                                        i11 = 3;
                                                    }
                                                }
                                            } else {
                                                i11 = 4;
                                            }
                                            C.b();
                                            ((ty0) C.f4845v).H(i11);
                                            uy0 E = vy0.E();
                                            mh z10 = D.z();
                                            E.b();
                                            ((vy0) E.f4845v).G(z10);
                                            hh hhVar = (hh) pr1Var2.zzb();
                                            E.b();
                                            ((vy0) E.f4845v).I(hhVar);
                                            vy0 vy0Var2 = (vy0) E.c();
                                            C.b();
                                            ((ty0) C.f4845v).D(vy0Var2);
                                            om1 A2 = D.A();
                                            C.b();
                                            ((ty0) C.f4845v).F(A2);
                                            om1 B = D.B();
                                            C.b();
                                            ((ty0) C.f4845v).E(B);
                                            return (ty0) C.c();
                                        }
                                    } else {
                                        h21Var.b(15207);
                                    }
                                    return g11.a(11);
                                } catch (pn1 e8) {
                                    h21Var.d(15205, e8);
                                    return g11.a(9);
                                } catch (NullPointerException unused2) {
                                    h21Var.b(15210);
                                    return g11.a(10);
                                }
                            }
                            h21Var.b(5010);
                            return g11.a(8);
                        } catch (Throwable th) {
                            try {
                                a10.b(th);
                                throw th;
                            } catch (Throwable th2) {
                                a10.c();
                                throw th2;
                            }
                        }
                    default:
                        hh hhVar2 = (hh) obj;
                        if (an1.m(hhVar2)) {
                            return new Integer(0);
                        }
                        this.f5883b.f6258d.c(15204, hhVar2.name());
                        throw new RuntimeException();
                }
            }
        };
        o81 o81Var = o81.f9033u;
        final int i10 = 0;
        i71 S = ed1.S(ed1.d0(ed1.c0(ed1.d0(t3, f31Var, o81Var), new dq(16, this), o81Var), new f31(this) { // from class: com.google.android.gms.internal.ads.f11

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g11 f5883b;

            {
                this.f5883b = this;
            }

            /* JADX WARN: Finally extract failed */
            @Override // com.google.android.gms.internal.ads.f31
            public final Object apply(Object obj) {
                boolean z3;
                switch (i10) {
                    case 0:
                        vy0 vy0Var = (vy0) obj;
                        g11 g11Var = this.f5883b;
                        pr1 pr1Var2 = g11Var.f6256b;
                        String z9 = vy0Var.z().z();
                        String A = vy0Var.z().A();
                        h21 h21Var = g11Var.f6258d;
                        g21 a10 = h21Var.a(15203);
                        try {
                            a10.a();
                            wv0 d2 = ed1.d(g11Var.f6255a, (hh) pr1Var2.zzb(), z9, A, g11Var.f6260g);
                            int i102 = d2.f12339w;
                            a10.c();
                            int i11 = 2;
                            if (i102 == 2) {
                                h21Var.b(15208);
                                return g11.a(4);
                            }
                            byte[] bArr = d2.f12338v;
                            if (bArr != null && bArr.length != 0) {
                                try {
                                    ih D = ih.D(bArr, wm1.a());
                                    if (!D.z().z().isEmpty() && !D.z().A().isEmpty() && D.B().a().length != 0) {
                                        if (!vy0Var.equals(vy0.F()) && TextUtils.equals(vy0Var.z().z(), D.z().z()) && TextUtils.equals(vy0Var.z().A(), D.z().A())) {
                                            h21Var.b(15209);
                                        } else {
                                            if (i102 == 4) {
                                                v01 v01Var = g11Var.f6259f;
                                                byte[] a11 = D.A().a();
                                                File file = v01Var.f11767a;
                                                try {
                                                    b80.v(file);
                                                    b80.j(file, a11);
                                                    v01Var.f11768b.getClass();
                                                    z3 = bv0.a(file);
                                                } catch (IOException | GeneralSecurityException e) {
                                                    v01Var.f11769c.d(2027, e);
                                                    z3 = false;
                                                }
                                                try {
                                                    file.delete();
                                                } catch (SecurityException unused) {
                                                }
                                                if (!z3) {
                                                    h21Var.b(15206);
                                                    return g11.a(12);
                                                }
                                                i102 = 4;
                                            }
                                            sy0 C = ty0.C();
                                            if (i102 != 2) {
                                                if (i102 != 3) {
                                                    if (i102 != 4) {
                                                        if (i102 != 6) {
                                                            i11 = 1;
                                                        } else {
                                                            i11 = 5;
                                                        }
                                                    } else {
                                                        i11 = 3;
                                                    }
                                                }
                                            } else {
                                                i11 = 4;
                                            }
                                            C.b();
                                            ((ty0) C.f4845v).H(i11);
                                            uy0 E = vy0.E();
                                            mh z10 = D.z();
                                            E.b();
                                            ((vy0) E.f4845v).G(z10);
                                            hh hhVar = (hh) pr1Var2.zzb();
                                            E.b();
                                            ((vy0) E.f4845v).I(hhVar);
                                            vy0 vy0Var2 = (vy0) E.c();
                                            C.b();
                                            ((ty0) C.f4845v).D(vy0Var2);
                                            om1 A2 = D.A();
                                            C.b();
                                            ((ty0) C.f4845v).F(A2);
                                            om1 B = D.B();
                                            C.b();
                                            ((ty0) C.f4845v).E(B);
                                            return (ty0) C.c();
                                        }
                                    } else {
                                        h21Var.b(15207);
                                    }
                                    return g11.a(11);
                                } catch (pn1 e8) {
                                    h21Var.d(15205, e8);
                                    return g11.a(9);
                                } catch (NullPointerException unused2) {
                                    h21Var.b(15210);
                                    return g11.a(10);
                                }
                            }
                            h21Var.b(5010);
                            return g11.a(8);
                        } catch (Throwable th) {
                            try {
                                a10.b(th);
                                throw th;
                            } catch (Throwable th2) {
                                a10.c();
                                throw th2;
                            }
                        }
                    default:
                        hh hhVar2 = (hh) obj;
                        if (an1.m(hhVar2)) {
                            return new Integer(0);
                        }
                        this.f5883b.f6258d.c(15204, hhVar2.name());
                        throw new RuntimeException();
                }
            }
        }, executorService), e11.class, b11.f4659c, o81Var);
        this.f6258d.e(15202, S);
        return S;
    }
}
