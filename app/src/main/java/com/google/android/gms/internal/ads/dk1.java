package com.google.android.gms.internal.ads;
import a5.a;

import java.security.GeneralSecurityException;
import java.security.spec.ECPoint;

/* loaded from: classes.dex */
public abstract class dk1 {

    /* renamed from: a, reason: collision with root package name */
    public static final nd1 f5448a;

    /* renamed from: b, reason: collision with root package name */
    public static final ld1 f5449b;

    /* renamed from: c, reason: collision with root package name */
    public static final wc1 f5450c;

    /* renamed from: d, reason: collision with root package name */
    public static final uc1 f5451d;
    public static final wc1 e;

    /* renamed from: f, reason: collision with root package name */
    public static final uc1 f5452f;

    static {
        gl1 a10 = fe1.a("type.googleapis.com/google.crypto.tink.EcdsaPrivateKey");
        gl1 a11 = fe1.a("type.googleapis.com/google.crypto.tink.EcdsaPublicKey");
        f5448a = new nd1(bj1.class, ck1.f5106y);
        f5449b = new ld1(a10, hc1.W);
        f5450c = new wc1(ej1.class, hc1.X);
        f5451d = new uc1(a11, ck1.f5103v);
        e = new wc1(cj1.class, ck1.f5104w);
        f5452f = new uc1(a10, ck1.f5105x);
    }

    public static x91 a(x91 x91Var) {
        if (x91Var.equals(x91.f12521v)) {
            return x91.f12505d;
        }
        if (x91Var.equals(x91.f12522w)) {
            return x91.f12507g;
        }
        if (x91Var.equals(x91.f12524y)) {
            return x91.f12506f;
        }
        if (x91Var.equals(x91.f12523x)) {
            return x91.e;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(x91Var.f12526b));
    }

    public static q91 b(yg1 yg1Var) {
        int ordinal = yg1Var.ordinal();
        if (ordinal != 2) {
            if (ordinal != 3) {
                if (ordinal == 4) {
                    return q91.J;
                }
                int zza = yg1Var.zza();
                throw new GeneralSecurityException(a.f(zza, "Unable to parse HashType: ", new StringBuilder(String.valueOf(zza).length() + 26)));
            }
            return q91.H;
        }
        return q91.I;
    }

    public static x91 c(x91 x91Var) {
        if (x91Var.equals(x91.f12505d)) {
            return x91.f12521v;
        }
        if (x91Var.equals(x91.f12507g)) {
            return x91.f12522w;
        }
        if (x91Var.equals(x91.e)) {
            return x91.f12523x;
        }
        if (x91Var.equals(x91.f12506f)) {
            return x91.f12524y;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: ".concat(x91Var.f12526b));
    }

    public static int d(aj1 aj1Var) {
        if (aj1Var.equals(aj1.f4525c)) {
            return 33;
        }
        if (aj1Var.equals(aj1.f4526d)) {
            return 49;
        }
        if (aj1Var.equals(aj1.e)) {
            return 67;
        }
        throw new GeneralSecurityException("Unable to serialize CurveType ".concat(aj1Var.f4527a));
    }

    public static ng1 e(bj1 bj1Var) {
        yg1 yg1Var;
        int i;
        mg1 A = ng1.A();
        q91 q91Var = bj1Var.f4812c;
        if (q91Var.equals(q91.H)) {
            yg1Var = yg1.SHA256;
        } else if (q91Var.equals(q91.I)) {
            yg1Var = yg1.SHA384;
        } else if (q91Var.equals(q91.J)) {
            yg1Var = yg1.SHA512;
        } else {
            throw new GeneralSecurityException("Unable to serialize HashType ".concat(q91Var.f9792v));
        }
        A.b();
        ((ng1) A.f4845v).C(yg1Var);
        aj1 aj1Var = bj1Var.f4811b;
        int i10 = 4;
        if (aj1Var.equals(aj1.f4525c)) {
            i = 4;
        } else if (aj1Var.equals(aj1.f4526d)) {
            i = 5;
        } else if (aj1Var.equals(aj1.e)) {
            i = 6;
        } else {
            throw new GeneralSecurityException("Unable to serialize CurveType ".concat(aj1Var.f4527a));
        }
        A.b();
        ((ng1) A.f4845v).F(i);
        w91 w91Var = bj1Var.f4810a;
        if (w91Var.equals(w91.f12189p)) {
            i10 = 3;
        } else if (!w91Var.equals(w91.f12190q)) {
            throw new GeneralSecurityException("Unable to serialize SignatureEncoding ".concat(w91Var.f12196b));
        }
        A.b();
        ((ng1) A.f4845v).G(i10);
        return (ng1) A.c();
    }

    public static sg1 f(ej1 ej1Var) {
        int d2 = d(ej1Var.P.f4811b);
        ECPoint eCPoint = ej1Var.Q;
        rg1 E = sg1.E();
        ng1 e8 = e(ej1Var.P);
        E.b();
        ((sg1) E.f4845v).H(e8);
        byte[] x9 = b80.x(eCPoint.getAffineX(), d2);
        mm1 mm1Var = om1.f9167v;
        mm1 z3 = om1.z(x9, 0, x9.length);
        E.b();
        ((sg1) E.f4845v).I(z3);
        byte[] x10 = b80.x(eCPoint.getAffineY(), d2);
        mm1 z9 = om1.z(x10, 0, x10.length);
        E.b();
        ((sg1) E.f4845v).J(z9);
        return (sg1) E.c();
    }

    public static aj1 g(int i) {
        int i10 = i - 2;
        if (i10 != 2) {
            if (i10 != 3) {
                if (i10 == 4) {
                    return aj1.e;
                }
                if (i != 1) {
                    throw new GeneralSecurityException(a.f(i10, "Unable to parse EllipticCurveType: ", new StringBuilder(String.valueOf(i10).length() + 35)));
                }
                ln1.a();
                throw null;
            }
            return aj1.f4526d;
        }
        return aj1.f4525c;
    }

    public static w91 h(int i) {
        int i10 = i - 2;
        if (i10 != 1) {
            if (i10 == 2) {
                return w91.f12190q;
            }
            if (i != 1) {
                throw new GeneralSecurityException(a.f(i10, "Unable to parse EcdsaSignatureEncoding: ", new StringBuilder(String.valueOf(i10).length() + 40)));
            }
            ln1.a();
            throw null;
        }
        return w91.f12189p;
    }
}
