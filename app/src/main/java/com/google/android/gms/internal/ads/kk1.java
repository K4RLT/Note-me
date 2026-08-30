package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.interfaces.RSAPrivateCrtKey;

/* loaded from: classes.dex */
public final class kk1 implements y91 {

    /* renamed from: g, reason: collision with root package name */
    public static final byte[] f7787g = new byte[0];

    /* renamed from: h, reason: collision with root package name */
    public static final byte[] f7788h = {0};
    public static final byte[] i = {1, 2, 3};

    /* renamed from: a, reason: collision with root package name */
    public final RSAPrivateCrtKey f7789a;

    /* renamed from: b, reason: collision with root package name */
    public final String f7790b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f7791c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f7792d;
    public final z91 e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider f7793f;

    public kk1(RSAPrivateCrtKey rSAPrivateCrtKey, oj1 oj1Var, byte[] bArr, byte[] bArr2, z91 z91Var, Provider provider) {
        if (ct.i(2)) {
            if (oj1Var != oj1.f9138b && oj1Var != oj1.f9139c && oj1Var != oj1.f9140d) {
                throw new GeneralSecurityException("Unsupported hash: ".concat(String.valueOf(oj1Var)));
            }
            an1.C(rSAPrivateCrtKey.getModulus().bitLength());
            an1.H(rSAPrivateCrtKey.getPublicExponent());
            this.f7789a = rSAPrivateCrtKey;
            this.f7790b = lk1.b(oj1Var);
            this.f7791c = bArr;
            this.f7792d = bArr2;
            this.e = z91Var;
            this.f7793f = provider;
            return;
        }
        androidx.datastore.preferences.protobuf.s1.q("Can not use RSA PKCS1.5 in FIPS-mode, as BoringCrypto module is not available.");
        throw null;
    }
}
