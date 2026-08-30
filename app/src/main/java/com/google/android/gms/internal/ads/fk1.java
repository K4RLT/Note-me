package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public abstract class fk1 {

    /* renamed from: a, reason: collision with root package name */
    public static final nd1 f6099a;

    /* renamed from: b, reason: collision with root package name */
    public static final ld1 f6100b;

    /* renamed from: c, reason: collision with root package name */
    public static final wc1 f6101c;

    /* renamed from: d, reason: collision with root package name */
    public static final uc1 f6102d;
    public static final wc1 e;

    /* renamed from: f, reason: collision with root package name */
    public static final uc1 f6103f;

    static {
        gl1 a10 = fe1.a("type.googleapis.com/google.crypto.tink.Ed25519PrivateKey");
        gl1 a11 = fe1.a("type.googleapis.com/google.crypto.tink.Ed25519PublicKey");
        f6099a = new nd1(gj1.class, ck1.E);
        f6100b = new ld1(a10, ck1.f5107z);
        f6101c = new wc1(jj1.class, ck1.A);
        f6102d = new uc1(a11, ck1.B);
        e = new wc1(hj1.class, ck1.C);
        f6103f = new uc1(a10, ck1.D);
    }

    public static x91 a(ja1 ja1Var) {
        if (ja1Var.equals(ja1.N)) {
            return x91.f12506f;
        }
        if (ja1Var.equals(ja1.K)) {
            return x91.f12505d;
        }
        if (ja1Var.equals(ja1.L)) {
            return x91.f12507g;
        }
        if (ja1Var.equals(ja1.M)) {
            return x91.e;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(ja1Var.f7390v));
    }

    public static ja1 b(x91 x91Var) {
        if (x91Var == x91.f12506f) {
            return ja1.N;
        }
        if (x91Var == x91.f12505d) {
            return ja1.K;
        }
        if (x91Var == x91.f12507g) {
            return ja1.L;
        }
        if (x91Var == x91.e) {
            return ja1.M;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: ".concat(x91Var.f12526b));
    }

    public static xg1 c(jj1 jj1Var) {
        wg1 C = xg1.C();
        byte[] b10 = jj1Var.Q.b();
        mm1 z3 = om1.z(b10, 0, b10.length);
        C.b();
        ((xg1) C.f4845v).F(z3);
        return (xg1) C.c();
    }
}
