package com.google.android.gms.internal.ads;

import java.security.spec.ECParameterSpec;

/* loaded from: classes.dex */
public final class aj1 {

    /* renamed from: c, reason: collision with root package name */
    public static final aj1 f4525c = new aj1("NIST_P256", qc1.f9814a);

    /* renamed from: d, reason: collision with root package name */
    public static final aj1 f4526d = new aj1("NIST_P384", qc1.f9815b);
    public static final aj1 e = new aj1("NIST_P521", qc1.f9816c);

    /* renamed from: a, reason: collision with root package name */
    public final String f4527a;

    /* renamed from: b, reason: collision with root package name */
    public final ECParameterSpec f4528b;

    public aj1(String str, ECParameterSpec eCParameterSpec) {
        this.f4527a = str;
        this.f4528b = eCParameterSpec;
    }

    public final String toString() {
        return this.f4527a;
    }
}
