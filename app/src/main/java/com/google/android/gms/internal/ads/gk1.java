package com.google.android.gms.internal.ads;

import java.security.KeyFactory;
import java.security.NoSuchProviderException;
import java.security.Provider;
import java.security.spec.PKCS8EncodedKeySpec;

/* loaded from: classes.dex */
public final class gk1 implements y91 {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f6424a = {48, 46, 2, 1, 0, 48, 5, 6, 3, 43, 101, 112, 4, 34, 4, 32};

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, com.google.android.gms.internal.ads.gk1] */
    public static gk1 a(hj1 hj1Var) {
        Provider h3 = x21.h();
        if (h3 != null) {
            bl0 bl0Var = hj1Var.Q;
            jj1 jj1Var = hj1Var.P;
            byte[] b10 = ((gl1) bl0Var.f4819v).b();
            jj1Var.R.b();
            ?? obj = new Object();
            if (ct.i(1)) {
                if (b10.length == 32) {
                    KeyFactory.getInstance("Ed25519", h3).generatePrivate(new PKCS8EncodedKeySpec(xy.z(f6424a, b10)));
                    return obj;
                }
                q.x.n("Given private key's length is not 32");
                return null;
            }
            androidx.datastore.preferences.protobuf.s1.q("Can not use Ed25519 in FIPS-mode.");
            return null;
        }
        throw new NoSuchProviderException("Ed25519SignJce requires the Conscrypt provider.");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00a7  */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, com.google.android.gms.internal.ads.gk1] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.internal.ads.gk1 b(com.google.android.gms.internal.ads.wj1 r13) {
        /*
            int r0 = com.google.android.gms.internal.ads.fe1.f6052a
            java.lang.String r0 = "java.vendor"
            java.lang.String r1 = java.lang.System.getProperty(r0)
            java.lang.String r2 = "The Android Project"
            boolean r1 = java.util.Objects.equals(r1, r2)
            r3 = 0
            if (r1 == 0) goto L2d
            java.lang.String r0 = java.lang.System.getProperty(r0)
            boolean r0 = java.util.Objects.equals(r0, r2)
            if (r0 != 0) goto L1d
            r0 = r3
            goto L23
        L1d:
            int r0 = android.os.Build.VERSION.SDK_INT
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L23:
            int r0 = r0.intValue()
            r1 = 23
            if (r0 > r1) goto L2d
            r0 = r3
            goto L31
        L2d:
            java.security.Provider r0 = com.google.android.gms.internal.ads.x21.h()
        L31:
            if (r0 == 0) goto La7
            java.lang.String r1 = "RSA"
            java.security.KeyFactory r0 = java.security.KeyFactory.getInstance(r1, r0)
            com.google.android.gms.internal.ads.xj1 r1 = r13.P
            com.google.android.gms.internal.ads.vj1 r2 = r1.P
            java.security.spec.RSAPrivateCrtKeySpec r4 = new java.security.spec.RSAPrivateCrtKeySpec
            java.math.BigInteger r5 = r1.Q
            java.math.BigInteger r6 = r2.f11924b
            com.google.android.gms.internal.ads.to0 r7 = r13.Q
            java.lang.Object r7 = r7.f11406v
            java.math.BigInteger r7 = (java.math.BigInteger) r7
            com.google.android.gms.internal.ads.to0 r8 = r13.R
            java.lang.Object r8 = r8.f11406v
            java.math.BigInteger r8 = (java.math.BigInteger) r8
            com.google.android.gms.internal.ads.to0 r9 = r13.S
            java.lang.Object r9 = r9.f11406v
            java.math.BigInteger r9 = (java.math.BigInteger) r9
            com.google.android.gms.internal.ads.to0 r10 = r13.T
            java.lang.Object r10 = r10.f11406v
            java.math.BigInteger r10 = (java.math.BigInteger) r10
            com.google.android.gms.internal.ads.to0 r11 = r13.U
            java.lang.Object r11 = r11.f11406v
            java.math.BigInteger r11 = (java.math.BigInteger) r11
            com.google.android.gms.internal.ads.to0 r13 = r13.V
            java.lang.Object r13 = r13.f11406v
            r12 = r13
            java.math.BigInteger r12 = (java.math.BigInteger) r12
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)
            java.security.PrivateKey r13 = r0.generatePrivate(r4)
            java.security.interfaces.RSAPrivateCrtKey r13 = (java.security.interfaces.RSAPrivateCrtKey) r13
            com.google.android.gms.internal.ads.gk1 r0 = new com.google.android.gms.internal.ads.gk1
            com.google.android.gms.internal.ads.uj1 r4 = r2.f11926d
            com.google.android.gms.internal.ads.uj1 r5 = r2.e
            int r2 = r2.f11927f
            com.google.android.gms.internal.ads.gl1 r1 = r1.R
            r1.b()
            r0.<init>()
            r1 = 2
            boolean r1 = com.google.android.gms.internal.ads.ct.i(r1)
            if (r1 == 0) goto La1
            java.math.BigInteger r1 = r13.getModulus()
            int r1 = r1.bitLength()
            com.google.android.gms.internal.ads.an1.C(r1)
            java.math.BigInteger r13 = r13.getPublicExponent()
            com.google.android.gms.internal.ads.an1.H(r13)
            com.google.android.gms.internal.ads.ok1.b(r4)
            com.google.android.gms.internal.ads.ok1.c(r4, r5, r2)
            return r0
        La1:
            java.lang.String r13 = "Cannot use RSA PSS in FIPS-mode, as BoringCrypto module is not available."
            androidx.datastore.preferences.protobuf.s1.q(r13)
            return r3
        La7:
            java.security.NoSuchProviderException r13 = new java.security.NoSuchProviderException
            java.lang.String r0 = "RSA SSA PSS using Conscrypt is not supported."
            r13.<init>(r0)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.gk1.b(com.google.android.gms.internal.ads.wj1):com.google.android.gms.internal.ads.gk1");
    }
}
