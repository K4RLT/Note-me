package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.KeyFactory;
import java.security.Provider;
import java.security.Signature;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.RSAPublicKeySpec;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class lk1 implements z91 {

    /* renamed from: f, reason: collision with root package name */
    public static final byte[] f8049f = new byte[0];

    /* renamed from: g, reason: collision with root package name */
    public static final byte[] f8050g = {0};

    /* renamed from: a, reason: collision with root package name */
    public final RSAPublicKey f8051a;

    /* renamed from: b, reason: collision with root package name */
    public final String f8052b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f8053c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f8054d;
    public final Provider e;

    public lk1(RSAPublicKey rSAPublicKey, oj1 oj1Var, byte[] bArr, byte[] bArr2, Provider provider) {
        if (ct.i(2)) {
            an1.C(rSAPublicKey.getModulus().bitLength());
            an1.H(rSAPublicKey.getPublicExponent());
            this.f8051a = rSAPublicKey;
            this.f8052b = b(oj1Var);
            this.f8053c = bArr;
            this.f8054d = bArr2;
            this.e = provider;
            return;
        }
        androidx.datastore.preferences.protobuf.s1.q("Can not use RSA-PKCS1.5 in FIPS-mode, as BoringCrypto module is not available.");
        throw null;
    }

    public static String b(oj1 oj1Var) {
        if (oj1Var == oj1.f9138b) {
            return "SHA256withRSA";
        }
        if (oj1Var == oj1.f9139c) {
            return "SHA384withRSA";
        }
        if (oj1Var == oj1.f9140d) {
            return "SHA512withRSA";
        }
        androidx.datastore.preferences.protobuf.s1.q("unknown hash type");
        return null;
    }

    public static lk1 c(rj1 rj1Var, Provider provider) {
        byte[] bArr;
        KeyFactory keyFactory = KeyFactory.getInstance("RSA", provider);
        BigInteger bigInteger = rj1Var.Q;
        pj1 pj1Var = rj1Var.P;
        RSAPublicKey rSAPublicKey = (RSAPublicKey) keyFactory.generatePublic(new RSAPublicKeySpec(bigInteger, pj1Var.f9534b));
        oj1 oj1Var = pj1Var.f9536d;
        byte[] b10 = rj1Var.R.b();
        if (pj1Var.f9535c.equals(q91.M)) {
            bArr = f8050g;
        } else {
            bArr = f8049f;
        }
        return new lk1(rSAPublicKey, oj1Var, b10, bArr, provider);
    }

    @Override // com.google.android.gms.internal.ads.z91
    public final void a(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = this.f8053c;
        if (fe1.c(bArr3, bArr)) {
            Signature signature = Signature.getInstance(this.f8052b, this.e);
            signature.initVerify(this.f8051a);
            signature.update(bArr2);
            byte[] bArr4 = this.f8054d;
            if (bArr4.length > 0) {
                signature.update(bArr4);
            }
            try {
                if (signature.verify(Arrays.copyOfRange(bArr, bArr3.length, bArr.length))) {
                    return;
                }
            } catch (RuntimeException unused) {
            }
            androidx.datastore.preferences.protobuf.s1.q("Invalid signature");
            return;
        }
        androidx.datastore.preferences.protobuf.s1.q("Invalid signature (output prefix mismatch)");
    }
}
