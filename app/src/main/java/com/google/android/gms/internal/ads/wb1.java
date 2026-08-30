package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public abstract class wb1 {

    /* renamed from: a, reason: collision with root package name */
    public static final nd1 f12210a;

    /* renamed from: b, reason: collision with root package name */
    public static final ld1 f12211b;

    /* renamed from: c, reason: collision with root package name */
    public static final wc1 f12212c;

    /* renamed from: d, reason: collision with root package name */
    public static final uc1 f12213d;

    static {
        gl1 a10 = fe1.a("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        f12210a = new nd1(xa1.class, fb1.S);
        f12211b = new ld1(a10, fb1.P);
        f12212c = new wc1(va1.class, fb1.Q);
        f12213d = new uc1(a10, fb1.R);
    }

    public static x91 a(q91 q91Var) {
        if (q91Var.equals(q91.C)) {
            return x91.f12505d;
        }
        if (q91Var.equals(q91.D)) {
            return x91.f12507g;
        }
        if (q91Var.equals(q91.E)) {
            return x91.f12506f;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(q91Var.f9792v));
    }

    public static q91 b(x91 x91Var) {
        if (x91Var == x91.f12505d) {
            return q91.C;
        }
        if (x91Var != x91.f12507g && x91Var != x91.e) {
            if (x91Var == x91.f12506f) {
                return q91.E;
            }
            throw new GeneralSecurityException("Unable to parse OutputPrefixType: ".concat(x91Var.f12526b));
        }
        return q91.D;
    }
}
