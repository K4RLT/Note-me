package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public abstract class sb1 {

    /* renamed from: a, reason: collision with root package name */
    public static final nd1 f10585a;

    /* renamed from: b, reason: collision with root package name */
    public static final ld1 f10586b;

    /* renamed from: c, reason: collision with root package name */
    public static final wc1 f10587c;

    /* renamed from: d, reason: collision with root package name */
    public static final uc1 f10588d;

    static {
        gl1 a10 = fe1.a("type.googleapis.com/google.crypto.tink.AesGcmKey");
        f10585a = new nd1(ra1.class, fb1.K);
        f10586b = new ld1(a10, fb1.H);
        f10587c = new wc1(pa1.class, fb1.I);
        f10588d = new uc1(a10, fb1.J);
    }

    public static x91 a(x91 x91Var) {
        if (x91Var.equals(x91.i)) {
            return x91.f12505d;
        }
        if (x91Var.equals(x91.f12509j)) {
            return x91.f12507g;
        }
        if (x91Var.equals(x91.f12510k)) {
            return x91.f12506f;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(x91Var)));
    }

    public static x91 b(x91 x91Var) {
        if (x91Var == x91.f12505d) {
            return x91.i;
        }
        if (x91Var != x91.f12507g && x91Var != x91.e) {
            if (x91Var == x91.f12506f) {
                return x91.f12510k;
            }
            throw new GeneralSecurityException("Unable to parse OutputPrefixType: ".concat(x91Var.f12526b));
        }
        return x91.f12509j;
    }
}
