package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public abstract class ub1 {

    /* renamed from: a, reason: collision with root package name */
    public static final nd1 f11609a;

    /* renamed from: b, reason: collision with root package name */
    public static final ld1 f11610b;

    /* renamed from: c, reason: collision with root package name */
    public static final wc1 f11611c;

    /* renamed from: d, reason: collision with root package name */
    public static final uc1 f11612d;

    static {
        gl1 a10 = fe1.a("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
        f11609a = new nd1(ua1.class, fb1.O);
        f11610b = new ld1(a10, fb1.L);
        f11611c = new wc1(sa1.class, fb1.M);
        f11612d = new uc1(a10, fb1.N);
    }

    public static x91 a(ja1 ja1Var) {
        if (ja1Var.equals(ja1.B)) {
            return x91.f12505d;
        }
        if (ja1Var.equals(ja1.C)) {
            return x91.f12507g;
        }
        if (ja1Var.equals(ja1.D)) {
            return x91.f12506f;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(ja1Var)));
    }

    public static ja1 b(x91 x91Var) {
        if (x91Var == x91.f12505d) {
            return ja1.B;
        }
        if (x91Var != x91.f12507g && x91Var != x91.e) {
            if (x91Var == x91.f12506f) {
                return ja1.D;
            }
            throw new GeneralSecurityException("Unable to parse OutputPrefixType: ".concat(x91Var.f12526b));
        }
        return ja1.C;
    }
}
