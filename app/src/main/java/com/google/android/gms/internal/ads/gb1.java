package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public abstract class gb1 {

    /* renamed from: a, reason: collision with root package name */
    public static final nd1 f6361a;

    /* renamed from: b, reason: collision with root package name */
    public static final ld1 f6362b;

    /* renamed from: c, reason: collision with root package name */
    public static final wc1 f6363c;

    /* renamed from: d, reason: collision with root package name */
    public static final uc1 f6364d;

    static {
        gl1 a10 = fe1.a("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey");
        f6361a = new nd1(eb1.class, fb1.f6005w);
        f6362b = new ld1(a10, ho0.P);
        f6363c = new wc1(db1.class, ho0.Q);
        f6364d = new uc1(a10, fb1.f6004v);
    }

    public static x91 a(ja1 ja1Var) {
        if (ja1.E.equals(ja1Var)) {
            return x91.f12505d;
        }
        if (ja1.F.equals(ja1Var)) {
            return x91.f12506f;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(ja1Var)));
    }

    public static zh1 b(eb1 eb1Var) {
        byte[] b10 = ((ih1) ((zd1) jd1.f7422b.h(eb1Var.f5643d)).f13143w).b();
        try {
            wm1 wm1Var = wm1.f12302a;
            int i = em1.f5727a;
            ih1 B = ih1.B(b10, wm1.f12303b);
            yh1 C = zh1.C();
            String str = eb1Var.f5641b;
            C.b();
            ((zh1) C.f4845v).E(str);
            C.b();
            ((zh1) C.f4845v).F(B);
            return (zh1) C.c();
        } catch (pn1 e) {
            throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKeyFormat failed: ", e);
        }
    }

    public static eb1 c(zh1 zh1Var, x91 x91Var) {
        x91 x91Var2;
        ja1 ja1Var = ja1.F;
        Object obj = x91.f12516q;
        x91 x91Var3 = x91.f12515p;
        x91 x91Var4 = x91.f12514o;
        x91 x91Var5 = x91.f12512m;
        x91 x91Var6 = x91.f12513n;
        x91 x91Var7 = x91.f12511l;
        hh1 C = ih1.C();
        String z3 = zh1Var.A().z();
        C.b();
        ((ih1) C.f4845v).E(z3);
        om1 A = zh1Var.A().A();
        C.b();
        ((ih1) C.f4845v).F(A);
        C.b();
        ((ih1) C.f4845v).H(5);
        v91 n10 = ay0.n(((ih1) C.c()).b());
        if (n10 instanceof ra1) {
            x91Var2 = x91Var7;
        } else if (n10 instanceof xa1) {
            x91Var2 = x91Var6;
        } else if (n10 instanceof nb1) {
            x91Var2 = x91Var5;
        } else if (n10 instanceof ka1) {
            x91Var2 = x91Var4;
        } else if (n10 instanceof oa1) {
            x91Var2 = x91Var3;
        } else if (n10 instanceof ua1) {
            x91Var2 = obj;
        } else {
            throw new GeneralSecurityException("Unsupported DEK parameters when parsing ".concat(n10.toString()));
        }
        if (x91Var.equals(x91.f12505d)) {
            ja1Var = ja1.E;
        } else if (!x91Var.equals(x91.f12506f)) {
            throw new GeneralSecurityException("Unable to parse OutputPrefixType: ".concat(x91Var.f12526b));
        }
        String z9 = zh1Var.z();
        da1 da1Var = (da1) n10;
        if (z9 != null) {
            if (da1Var != null) {
                if (!da1Var.a()) {
                    if ((x91Var2.equals(x91Var7) && (da1Var instanceof ra1)) || ((x91Var2.equals(x91Var6) && (da1Var instanceof xa1)) || ((x91Var2.equals(x91Var5) && (da1Var instanceof nb1)) || ((x91Var2.equals(x91Var4) && (da1Var instanceof ka1)) || ((x91Var2.equals(x91Var3) && (da1Var instanceof oa1)) || (x91Var2.equals(obj) && (da1Var instanceof ua1))))))) {
                        return new eb1(ja1Var, z9, x91Var2, da1Var);
                    }
                    String str = x91Var2.f12526b;
                    String valueOf = String.valueOf(da1Var);
                    StringBuilder sb2 = new StringBuilder(valueOf.length() + str.length() + 67 + 1);
                    g3.a.t(sb2, "Cannot use parsing strategy ", str, " when new keys are picked according to ", valueOf);
                    sb2.append(".");
                    throw new GeneralSecurityException(sb2.toString());
                }
                androidx.datastore.preferences.protobuf.s1.q("dekParametersForNewKeys must not have ID Requirements");
                return null;
            }
            androidx.datastore.preferences.protobuf.s1.q("dekParametersForNewKeys must be set");
            return null;
        }
        androidx.datastore.preferences.protobuf.s1.q("kekUri must be set");
        return null;
    }
}
