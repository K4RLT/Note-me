package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public abstract class cb1 {

    /* renamed from: a, reason: collision with root package name */
    public static final nd1 f5070a;

    /* renamed from: b, reason: collision with root package name */
    public static final ld1 f5071b;

    /* renamed from: c, reason: collision with root package name */
    public static final wc1 f5072c;

    /* renamed from: d, reason: collision with root package name */
    public static final uc1 f5073d;

    static {
        gl1 a10 = fe1.a("type.googleapis.com/google.crypto.tink.KmsAeadKey");
        f5070a = new nd1(bb1.class, ho0.O);
        f5071b = new ld1(a10, ho0.L);
        f5072c = new wc1(ab1.class, ho0.M);
        f5073d = new uc1(a10, ho0.N);
    }

    public static x91 a(w91 w91Var) {
        if (w91Var.equals(w91.f12184k)) {
            return x91.f12505d;
        }
        if (w91Var.equals(w91.f12185l)) {
            return x91.f12506f;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(w91Var.f12196b));
    }
}
