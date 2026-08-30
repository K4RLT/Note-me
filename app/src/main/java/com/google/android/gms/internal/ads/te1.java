package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public abstract class te1 {

    /* renamed from: a, reason: collision with root package name */
    public static final nd1 f11333a;

    /* renamed from: b, reason: collision with root package name */
    public static final ld1 f11334b;

    /* renamed from: c, reason: collision with root package name */
    public static final wc1 f11335c;

    /* renamed from: d, reason: collision with root package name */
    public static final uc1 f11336d;

    static {
        gl1 a10 = fe1.a("type.googleapis.com/google.crypto.tink.AesCmacKey");
        f11333a = new nd1(ie1.class, hc1.H);
        f11334b = new ld1(a10, hc1.E);
        f11335c = new wc1(ge1.class, hc1.F);
        f11336d = new uc1(a10, hc1.G);
    }

    public static x91 a(x91 x91Var) {
        if (x91Var.equals(x91.f12517r)) {
            return x91.f12505d;
        }
        if (x91Var.equals(x91.f12518s)) {
            return x91.f12507g;
        }
        if (x91Var.equals(x91.f12520u)) {
            return x91.f12506f;
        }
        if (x91Var.equals(x91.f12519t)) {
            return x91.e;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(x91Var)));
    }

    public static x91 b(x91 x91Var) {
        if (x91Var == x91.f12505d) {
            return x91.f12517r;
        }
        if (x91Var == x91.f12507g) {
            return x91.f12518s;
        }
        if (x91Var == x91.e) {
            return x91.f12519t;
        }
        if (x91Var == x91.f12506f) {
            return x91.f12520u;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: ".concat(x91Var.f12526b));
    }
}
