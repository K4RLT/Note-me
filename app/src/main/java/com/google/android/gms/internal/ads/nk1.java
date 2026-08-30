package com.google.android.gms.internal.ads;
import j6.c;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* loaded from: classes.dex */
public abstract class nk1 {

    /* renamed from: a, reason: collision with root package name */
    public static final nd1 f8742a;

    /* renamed from: b, reason: collision with root package name */
    public static final ld1 f8743b;

    /* renamed from: c, reason: collision with root package name */
    public static final wc1 f8744c;

    /* renamed from: d, reason: collision with root package name */
    public static final uc1 f8745d;
    public static final wc1 e;

    /* renamed from: f, reason: collision with root package name */
    public static final uc1 f8746f;

    /* renamed from: g, reason: collision with root package name */
    public static final j6.c f8747g;

    static {
        gl1 a10 = fe1.a("type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey");
        gl1 a11 = fe1.a("type.googleapis.com/google.crypto.tink.RsaSsaPssPublicKey");
        f8742a = new nd1(vj1.class, ck1.Q);
        f8743b = new ld1(a10, ck1.L);
        f8744c = new wc1(xj1.class, ck1.M);
        f8745d = new uc1(a11, ck1.N);
        e = new wc1(wj1.class, ck1.O);
        f8746f = new uc1(a10, ck1.P);
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        yg1 yg1Var = yg1.SHA256;
        uj1 uj1Var = uj1.f11653b;
        hashMap.put(yg1Var, uj1Var);
        hashMap2.put(uj1Var, yg1Var);
        yg1 yg1Var2 = yg1.SHA384;
        uj1 uj1Var2 = uj1.f11654c;
        hashMap.put(yg1Var2, uj1Var2);
        hashMap2.put(uj1Var2, yg1Var2);
        yg1 yg1Var3 = yg1.SHA512;
        uj1 uj1Var3 = uj1.f11655d;
        hashMap.put(yg1Var3, uj1Var3);
        hashMap2.put(uj1Var3, yg1Var3);
        f8747g = new j6.c(8, (Object) Collections.unmodifiableMap(hashMap), (Object) Collections.unmodifiableMap(hashMap2), false);
    }

    public static x91 a(w91 w91Var) {
        if (w91Var.equals(w91.f12194u)) {
            return x91.f12506f;
        }
        if (w91Var.equals(w91.f12191r)) {
            return x91.f12505d;
        }
        if (w91Var.equals(w91.f12192s)) {
            return x91.f12507g;
        }
        if (w91Var.equals(w91.f12193t)) {
            return x91.e;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(w91Var)));
    }

    public static w91 b(x91 x91Var) {
        if (x91Var == x91.f12506f) {
            return w91.f12194u;
        }
        if (x91Var == x91.f12505d) {
            return w91.f12191r;
        }
        if (x91Var == x91.f12507g) {
            return w91.f12192s;
        }
        if (x91Var == x91.e) {
            return w91.f12193t;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: ".concat(x91Var.f12526b));
    }

    public static mi1 c(vj1 vj1Var) {
        li1 C = mi1.C();
        uj1 uj1Var = vj1Var.f11926d;
        j6.c cVar = f8747g;
        yg1 yg1Var = (yg1) cVar.m(uj1Var);
        C.b();
        ((mi1) C.f4845v).E(yg1Var);
        yg1 yg1Var2 = (yg1) cVar.m(vj1Var.e);
        C.b();
        ((mi1) C.f4845v).F(yg1Var2);
        int i = vj1Var.f11927f;
        C.b();
        ((mi1) C.f4845v).G(i);
        return (mi1) C.c();
    }

    public static qi1 d(xj1 xj1Var) {
        pi1 E = qi1.E();
        mi1 c10 = c(xj1Var.P);
        E.b();
        ((qi1) E.f4845v).I(c10);
        byte[] o10 = b80.o(xj1Var.Q);
        mm1 mm1Var = om1.f9167v;
        mm1 z3 = om1.z(o10, 0, o10.length);
        E.b();
        ((qi1) E.f4845v).J(z3);
        byte[] o11 = b80.o(xj1Var.P.f11924b);
        mm1 z9 = om1.z(o11, 0, o11.length);
        E.b();
        ((qi1) E.f4845v).K(z9);
        E.b();
        ((qi1) E.f4845v).H(0);
        return (qi1) E.c();
    }

    public static to0 e(om1 om1Var) {
        return new to0(8, new BigInteger(1, om1Var.a()));
    }
}
