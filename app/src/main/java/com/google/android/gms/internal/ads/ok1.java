package com.google.android.gms.internal.ads;
import q.x;
import r3.e;

import java.security.Provider;
import java.security.Signature;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.MGF1ParameterSpec;
import java.security.spec.PSSParameterSpec;

/* loaded from: classes.dex */
public final class ok1 implements z91 {

    /* renamed from: g, reason: collision with root package name */
    public static final byte[] f9148g = new byte[0];

    /* renamed from: h, reason: collision with root package name */
    public static final byte[] f9149h = {0};

    /* renamed from: a, reason: collision with root package name */
    public final RSAPublicKey f9150a;

    /* renamed from: b, reason: collision with root package name */
    public final String f9151b;

    /* renamed from: c, reason: collision with root package name */
    public final PSSParameterSpec f9152c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f9153d;
    public final byte[] e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider f9154f;

    public ok1(RSAPublicKey rSAPublicKey, uj1 uj1Var, uj1 uj1Var2, int i, byte[] bArr, byte[] bArr2, Provider provider) {
        if (ct.i(2)) {
            if (uj1Var.equals(uj1Var2)) {
                an1.C(rSAPublicKey.getModulus().bitLength());
                an1.H(rSAPublicKey.getPublicExponent());
                this.f9150a = rSAPublicKey;
                this.f9151b = b(uj1Var);
                this.f9152c = c(uj1Var, uj1Var2, i);
                this.f9153d = bArr;
                this.e = bArr2;
                this.f9154f = provider;
                return;
            }
            androidx.datastore.preferences.protobuf.s1.q("sigHash and mgf1Hash must be the same");
            throw null;
        }
        androidx.datastore.preferences.protobuf.s1.q("Cannot use RSA SSA PSS in FIPS-mode, as BoringCrypto module is not available.");
        throw null;
    }

    public static String b(uj1 uj1Var) {
        if (uj1Var == uj1.f11653b) {
            return "SHA256withRSA/PSS";
        }
        if (uj1Var == uj1.f11654c) {
            return "SHA384withRSA/PSS";
        }
        if (uj1Var == uj1.f11655d) {
            return "SHA512withRSA/PSS";
        }
        x.n("Unsupported hash: ".concat(String.valueOf(uj1Var)));
        return null;
    }

    public static PSSParameterSpec c(uj1 uj1Var, uj1 uj1Var2, int i) {
        String str;
        MGF1ParameterSpec mGF1ParameterSpec;
        uj1 uj1Var3 = uj1.f11655d;
        uj1 uj1Var4 = uj1.f11654c;
        uj1 uj1Var5 = uj1.f11653b;
        if (uj1Var == uj1Var5) {
            str = "SHA-256";
        } else if (uj1Var == uj1Var4) {
            str = "SHA-384";
        } else if (uj1Var == uj1Var3) {
            str = "SHA-512";
        } else {
            x.n("Unsupported MD hash: ".concat(String.valueOf(uj1Var)));
            return null;
        }
        if (uj1Var2 == uj1Var5) {
            mGF1ParameterSpec = MGF1ParameterSpec.SHA256;
        } else if (uj1Var2 == uj1Var4) {
            mGF1ParameterSpec = MGF1ParameterSpec.SHA384;
        } else if (uj1Var2 == uj1Var3) {
            mGF1ParameterSpec = MGF1ParameterSpec.SHA512;
        } else {
            x.n("Unsupported MGF1 hash: ".concat(String.valueOf(uj1Var2)));
            return null;
        }
        return new PSSParameterSpec(str, "MGF1", mGF1ParameterSpec, i, 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0029, code lost:
    
        if (r0.intValue() <= 23) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.internal.ads.ok1 d(com.google.android.gms.internal.ads.xj1 r10) {
        /*
            int r0 = com.google.android.gms.internal.ads.fe1.f6052a
            java.lang.String r0 = "java.vendor"
            java.lang.String r1 = java.lang.System.getProperty(r0)
            java.lang.String r2 = "The Android Project"
            boolean r1 = java.util.Objects.equals(r1, r2)
            if (r1 == 0) goto L2d
            java.lang.String r0 = java.lang.System.getProperty(r0)
            boolean r0 = java.util.Objects.equals(r0, r2)
            r1 = 0
            if (r0 != 0) goto L1d
            r0 = r1
            goto L23
        L1d:
            int r0 = android.os.Build.VERSION.SDK_INT
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L23:
            int r0 = r0.intValue()
            r2 = 23
            if (r0 > r2) goto L2d
        L2b:
            r9 = r1
            goto L32
        L2d:
            java.security.Provider r1 = com.google.android.gms.internal.ads.x21.h()
            goto L2b
        L32:
            if (r9 == 0) goto L6f
            java.lang.String r0 = "RSA"
            java.security.KeyFactory r0 = java.security.KeyFactory.getInstance(r0, r9)
            java.security.spec.RSAPublicKeySpec r1 = new java.security.spec.RSAPublicKeySpec
            java.math.BigInteger r2 = r10.Q
            com.google.android.gms.internal.ads.vj1 r3 = r10.P
            java.math.BigInteger r4 = r3.f11924b
            r1.<init>(r2, r4)
            java.security.PublicKey r0 = r0.generatePublic(r1)
            java.security.interfaces.RSAPublicKey r0 = (java.security.interfaces.RSAPublicKey) r0
            com.google.android.gms.internal.ads.ok1 r2 = new com.google.android.gms.internal.ads.ok1
            com.google.android.gms.internal.ads.uj1 r4 = r3.f11926d
            com.google.android.gms.internal.ads.uj1 r5 = e
            int r6 = r3.f11927f
            com.google.android.gms.internal.ads.gl1 r10 = r10.R
            byte[] r7 = r10.b()
            com.google.android.gms.internal.ads.w91 r10 = r3.f11925c
            com.google.android.gms.internal.ads.w91 r1 = com.google.android.gms.internal.ads.w91.f12193t
            boolean r10 = r10.equals(r1)
            if (r10 == 0) goto L68
            byte[] r10 = com.google.android.gms.internal.ads.ok1.f9149h
        L65:
            r8 = r10
            r3 = r0
            goto L6b
        L68:
            byte[] r10 = com.google.android.gms.internal.ads.ok1.f9148g
            goto L65
        L6b:
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            return r2
        L6f:
            java.security.NoSuchProviderException r10 = new java.security.NoSuchProviderException
            java.lang.String r0 = "RSA SSA PSS using Conscrypt is not supported."
            r10.<init>(r0)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ok1.d(com.google.android.gms.internal.ads.xj1):com.google.android.gms.internal.ads.ok1");
    }

    @Override // com.google.android.gms.internal.ads.z91
    public final void a(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = this.f9153d;
        if (fe1.c(bArr3, bArr)) {
            Signature signature = Signature.getInstance(this.f9151b, this.f9154f);
            signature.initVerify(this.f9150a);
            signature.setParameter(this.f9152c);
            signature.update(bArr2);
            byte[] bArr4 = this.e;
            if (bArr4.length > 0) {
                signature.update(bArr4);
            }
            int length = bArr.length;
            int length2 = bArr3.length;
            if (signature.verify(bArr, length2, length - length2)) {
                return;
            }
            androidx.datastore.preferences.protobuf.s1.q("signature verification failed");
            return;
        }
        androidx.datastore.preferences.protobuf.s1.q("Invalid signature (output prefix mismatch)");
    }
}
