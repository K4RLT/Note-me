package com.google.android.gms.internal.ads;
import j6.c;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* loaded from: classes.dex */
public abstract class jk1 {

    /* renamed from: a, reason: collision with root package name */
    public static final nd1 f7467a;

    /* renamed from: b, reason: collision with root package name */
    public static final ld1 f7468b;

    /* renamed from: c, reason: collision with root package name */
    public static final wc1 f7469c;

    /* renamed from: d, reason: collision with root package name */
    public static final uc1 f7470d;
    public static final wc1 e;

    /* renamed from: f, reason: collision with root package name */
    public static final uc1 f7471f;

    /* renamed from: g, reason: collision with root package name */
    public static final j6.c f7472g;

    static {
        gl1 a10 = fe1.a("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey");
        gl1 a11 = fe1.a("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PublicKey");
        f7467a = new nd1(pj1.class, ck1.K);
        f7468b = new ld1(a10, ck1.F);
        f7469c = new wc1(rj1.class, ck1.G);
        f7470d = new uc1(a11, ck1.H);
        e = new wc1(qj1.class, ck1.I);
        f7471f = new uc1(a10, ck1.J);
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        yg1 yg1Var = yg1.SHA256;
        oj1 oj1Var = oj1.f9138b;
        hashMap.put(yg1Var, oj1Var);
        hashMap2.put(oj1Var, yg1Var);
        yg1 yg1Var2 = yg1.SHA384;
        oj1 oj1Var2 = oj1.f9139c;
        hashMap.put(yg1Var2, oj1Var2);
        hashMap2.put(oj1Var2, yg1Var2);
        yg1 yg1Var3 = yg1.SHA512;
        oj1 oj1Var3 = oj1.f9140d;
        hashMap.put(yg1Var3, oj1Var3);
        hashMap2.put(oj1Var3, yg1Var3);
        f7472g = new j6.c(8, (Object) Collections.unmodifiableMap(hashMap), (Object) Collections.unmodifiableMap(hashMap2), false);
    }

    public static x91 a(q91 q91Var) {
        if (q91Var.equals(q91.N)) {
            return x91.f12506f;
        }
        if (q91Var.equals(q91.K)) {
            return x91.f12505d;
        }
        if (q91Var.equals(q91.L)) {
            return x91.f12507g;
        }
        if (q91Var.equals(q91.M)) {
            return x91.e;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(q91Var)));
    }

    public static q91 b(x91 x91Var) {
        if (x91Var == x91.f12506f) {
            return q91.N;
        }
        if (x91Var == x91.f12505d) {
            return q91.K;
        }
        if (x91Var == x91.f12507g) {
            return q91.L;
        }
        if (x91Var == x91.e) {
            return q91.M;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: ".concat(x91Var.f12526b));
    }

    public static ii1 c(rj1 rj1Var) {
        hi1 E = ii1.E();
        pj1 pj1Var = rj1Var.P;
        di1 A = ei1.A();
        yg1 yg1Var = (yg1) f7472g.m(pj1Var.f9536d);
        A.b();
        ((ei1) A.f4845v).C(yg1Var);
        ei1 ei1Var = (ei1) A.c();
        E.b();
        ((ii1) E.f4845v).H(ei1Var);
        byte[] o10 = b80.o(rj1Var.Q);
        mm1 mm1Var = om1.f9167v;
        mm1 z3 = om1.z(o10, 0, o10.length);
        E.b();
        ((ii1) E.f4845v).I(z3);
        byte[] o11 = b80.o(rj1Var.P.f9534b);
        mm1 z9 = om1.z(o11, 0, o11.length);
        E.b();
        ((ii1) E.f4845v).J(z9);
        return (ii1) E.c();
    }

    public static to0 d(om1 om1Var) {
        return new to0(8, new BigInteger(1, om1Var.a()));
    }
}
