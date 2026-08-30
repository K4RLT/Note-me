package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public abstract class ob1 {

    /* renamed from: a, reason: collision with root package name */
    public static final nd1 f9084a;

    /* renamed from: b, reason: collision with root package name */
    public static final ld1 f9085b;

    /* renamed from: c, reason: collision with root package name */
    public static final wc1 f9086c;

    /* renamed from: d, reason: collision with root package name */
    public static final uc1 f9087d;

    static {
        gl1 a10 = fe1.a("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        f9084a = new nd1(ka1.class, fb1.C);
        f9085b = new ld1(a10, fb1.f6008z);
        f9086c = new wc1(fa1.class, fb1.A);
        f9087d = new uc1(a10, fb1.B);
    }

    public static x91 a(q91 q91Var) {
        if (q91Var.equals(q91.f9790z)) {
            return x91.f12505d;
        }
        if (q91Var.equals(q91.A)) {
            return x91.f12507g;
        }
        if (q91Var.equals(q91.B)) {
            return x91.f12506f;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(q91Var)));
    }

    public static q91 b(x91 x91Var) {
        if (x91Var == x91.f12505d) {
            return q91.f9790z;
        }
        if (x91Var != x91.f12507g && x91Var != x91.e) {
            if (x91Var == x91.f12506f) {
                return q91.B;
            }
            throw new GeneralSecurityException("Unable to parse OutputPrefixType: ".concat(x91Var.f12526b));
        }
        return q91.A;
    }

    public static ja1 c(yg1 yg1Var) {
        int ordinal = yg1Var.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 3) {
                    if (ordinal != 4) {
                        if (ordinal == 5) {
                            return ja1.f7386x;
                        }
                        int zza = yg1Var.zza();
                        throw new GeneralSecurityException(a5.a.f(zza, "Unable to parse HashType: ", new StringBuilder(String.valueOf(zza).length() + 26)));
                    }
                    return ja1.A;
                }
                return ja1.f7387y;
            }
            return ja1.f7388z;
        }
        return ja1.f7385w;
    }

    public static eh1 d(ka1 ka1Var) {
        yg1 yg1Var;
        dh1 B = eh1.B();
        int i = ka1Var.f7700d;
        B.b();
        ((eh1) B.f4845v).E(i);
        ja1 ja1Var = ka1Var.f7701f;
        if (ja1Var.equals(ja1.f7385w)) {
            yg1Var = yg1.SHA1;
        } else if (ja1Var.equals(ja1.f7386x)) {
            yg1Var = yg1.SHA224;
        } else if (ja1Var.equals(ja1.f7387y)) {
            yg1Var = yg1.SHA256;
        } else if (ja1Var.equals(ja1.f7388z)) {
            yg1Var = yg1.SHA384;
        } else if (ja1Var.equals(ja1.A)) {
            yg1Var = yg1.SHA512;
        } else {
            throw new GeneralSecurityException("Unable to serialize HashType ".concat(String.valueOf(ja1Var)));
        }
        B.b();
        ((eh1) B.f4845v).D(yg1Var);
        return (eh1) B.c();
    }
}
