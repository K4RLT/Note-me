package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public abstract class ic1 {

    /* renamed from: a, reason: collision with root package name */
    public static final nd1 f7103a;

    /* renamed from: b, reason: collision with root package name */
    public static final ld1 f7104b;

    /* renamed from: c, reason: collision with root package name */
    public static final wc1 f7105c;

    /* renamed from: d, reason: collision with root package name */
    public static final uc1 f7106d;

    static {
        gl1 a10 = fe1.a("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        f7103a = new nd1(nb1.class, hc1.f6673w);
        f7104b = new ld1(a10, fb1.X);
        f7105c = new wc1(lb1.class, fb1.Y);
        f7106d = new uc1(a10, hc1.f6672v);
    }

    public static x91 a(w91 w91Var) {
        if (w91Var.equals(w91.f12186m)) {
            return x91.f12505d;
        }
        if (w91Var.equals(w91.f12187n)) {
            return x91.f12507g;
        }
        if (w91Var.equals(w91.f12188o)) {
            return x91.f12506f;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(w91Var.f12196b));
    }

    public static w91 b(x91 x91Var) {
        if (x91Var == x91.f12505d) {
            return w91.f12186m;
        }
        if (x91Var != x91.f12507g && x91Var != x91.e) {
            if (x91Var == x91.f12506f) {
                return w91.f12188o;
            }
            throw new GeneralSecurityException("Unable to parse OutputPrefixType: ".concat(x91Var.f12526b));
        }
        return w91.f12187n;
    }
}
