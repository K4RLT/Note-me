package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public abstract class fc1 {

    /* renamed from: a, reason: collision with root package name */
    public static final nd1 f6019a;

    /* renamed from: b, reason: collision with root package name */
    public static final ld1 f6020b;

    /* renamed from: c, reason: collision with root package name */
    public static final wc1 f6021c;

    /* renamed from: d, reason: collision with root package name */
    public static final uc1 f6022d;

    static {
        gl1 a10 = fe1.a("type.googleapis.com/google.crypto.tink.XAesGcmKey");
        f6019a = new nd1(kb1.class, fb1.W);
        f6020b = new ld1(a10, fb1.T);
        f6021c = new wc1(ib1.class, fb1.U);
        f6022d = new uc1(a10, fb1.V);
    }

    public static x91 a(q91 q91Var) {
        if (q91Var.equals(q91.F)) {
            return x91.f12505d;
        }
        if (q91Var.equals(q91.G)) {
            return x91.f12506f;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(q91Var.f9792v));
    }
}
