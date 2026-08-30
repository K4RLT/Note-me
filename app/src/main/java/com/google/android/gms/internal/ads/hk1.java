package com.google.android.gms.internal.ads;
import q.x;

import java.io.Serializable;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchProviderException;
import java.security.Provider;
import java.security.PublicKey;
import java.security.Signature;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.X509EncodedKeySpec;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class hk1 implements z91 {

    /* renamed from: f, reason: collision with root package name */
    public static final byte[] f6830f = {48, 42, 48, 5, 6, 3, 43, 101, 112, 3, 33, 0};

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6831a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f6832b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f6833c;

    /* renamed from: d, reason: collision with root package name */
    public final PublicKey f6834d;
    public final Serializable e;

    public hk1(byte[] bArr, byte[] bArr2, byte[] bArr3, Provider provider) {
        if (ct.i(1)) {
            if (bArr.length == 32) {
                this.f6834d = KeyFactory.getInstance("Ed25519", provider).generatePublic(new X509EncodedKeySpec(xy.z(f6830f, bArr)));
                this.f6832b = bArr2;
                this.f6833c = bArr3;
                this.e = provider;
                return;
            }
            q.x.n("Given public key's length is not 32.");
            throw null;
        }
        androidx.datastore.preferences.protobuf.s1.q("Can not use Ed25519 in FIPS-mode.");
        throw null;
    }

    public static hk1 b(jj1 jj1Var) {
        byte[] bArr;
        Provider h3 = x21.h();
        if (h3 != null) {
            if (ct.i(1)) {
                byte[] b10 = jj1Var.Q.b();
                byte[] b11 = jj1Var.R.b();
                if (jj1Var.P.f6417a.equals(ja1.M)) {
                    bArr = new byte[]{0};
                } else {
                    bArr = new byte[0];
                }
                return new hk1(b10, b11, bArr, h3);
            }
            androidx.datastore.preferences.protobuf.s1.q("Can not use Ed25519 in FIPS-mode.");
            return null;
        }
        throw new NoSuchProviderException("Ed25519VerifyJce requires the Conscrypt provider.");
    }

    @Override // com.google.android.gms.internal.ads.z91
    public final void a(byte[] bArr, byte[] bArr2) {
        switch (this.f6831a) {
            case 0:
                byte[] bArr3 = this.f6832b;
                int length = bArr3.length;
                if (bArr.length == length + 64) {
                    if (fe1.c(bArr3, bArr)) {
                        Signature signature = Signature.getInstance("Ed25519", (Provider) this.e);
                        signature.initVerify(this.f6834d);
                        signature.update(bArr2);
                        signature.update(this.f6833c);
                        try {
                            if (signature.verify(bArr, length, 64)) {
                                return;
                            }
                        } catch (RuntimeException unused) {
                        }
                        androidx.datastore.preferences.protobuf.s1.q("Signature check failed.");
                        return;
                    }
                    androidx.datastore.preferences.protobuf.s1.q("Invalid signature (output prefix mismatch)");
                    return;
                }
                androidx.datastore.preferences.protobuf.s1.q("Invalid signature length: 64");
                return;
            default:
                byte[] bArr4 = this.f6832b;
                int length2 = bArr4.length;
                if (length2 == 0) {
                    c(bArr, bArr2);
                    return;
                } else if (fe1.c(bArr4, bArr)) {
                    c(Arrays.copyOfRange(bArr, length2, bArr.length), bArr2);
                    return;
                } else {
                    androidx.datastore.preferences.protobuf.s1.q("Invalid signature (output prefix mismatch)");
                    return;
                }
        }
    }

    public void c(byte[] bArr, byte[] bArr2) {
        byte[] l10;
        int i;
        RSAPublicKey rSAPublicKey = (RSAPublicKey) this.f6834d;
        BigInteger publicExponent = rSAPublicKey.getPublicExponent();
        BigInteger modulus = rSAPublicKey.getModulus();
        int bitLength = (modulus.bitLength() + 7) / 8;
        if (bitLength == bArr.length) {
            BigInteger bigInteger = new BigInteger(1, bArr);
            if (bigInteger.compareTo(modulus) < 0) {
                byte[] x9 = b80.x(bigInteger.modPow(publicExponent, modulus), bitLength);
                zk1 zk1Var = (zk1) this.e;
                an1.t(zk1Var);
                MessageDigest messageDigest = (MessageDigest) yk1.e.f12905a.o(ed1.s(zk1Var));
                messageDigest.update(bArr2);
                byte[] bArr3 = this.f6833c;
                if (bArr3.length != 0) {
                    messageDigest.update(bArr3);
                }
                byte[] digest = messageDigest.digest();
                int ordinal = zk1Var.ordinal();
                int i10 = 2;
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        if (ordinal == 4) {
                            l10 = ay0.l("3051300d060960864801650304020305000440");
                        } else {
                            throw new GeneralSecurityException("Unsupported hash ".concat(zk1Var.toString()));
                        }
                    } else {
                        l10 = ay0.l("3041300d060960864801650304020205000430");
                    }
                } else {
                    l10 = ay0.l("3031300d060960864801650304020105000420");
                }
                if (bitLength >= l10.length + digest.length + 11) {
                    byte[] bArr4 = new byte[bitLength];
                    bArr4[0] = 0;
                    bArr4[1] = 1;
                    int i11 = 0;
                    while (true) {
                        i = i10 + 1;
                        if (i11 >= (bitLength - r5) - 3) {
                            break;
                        }
                        bArr4[i10] = -1;
                        i11++;
                        i10 = i;
                    }
                    bArr4[i10] = 0;
                    int length = l10.length;
                    System.arraycopy(l10, 0, bArr4, i, length);
                    System.arraycopy(digest, 0, bArr4, i + length, digest.length);
                    if (MessageDigest.isEqual(x9, bArr4)) {
                        return;
                    }
                    androidx.datastore.preferences.protobuf.s1.q("invalid signature");
                    return;
                }
                androidx.datastore.preferences.protobuf.s1.q("intended encoded message length too short");
                return;
            }
            androidx.datastore.preferences.protobuf.s1.q("signature out of range");
            return;
        }
        androidx.datastore.preferences.protobuf.s1.q("invalid signature's length");
    }

    public /* synthetic */ hk1(RSAPublicKey rSAPublicKey, zk1 zk1Var, byte[] bArr, byte[] bArr2) {
        if (!lc1.a()) {
            an1.t(zk1Var);
            an1.C(rSAPublicKey.getModulus().bitLength());
            an1.H(rSAPublicKey.getPublicExponent());
            this.f6834d = rSAPublicKey;
            this.e = zk1Var;
            this.f6832b = bArr;
            this.f6833c = bArr2;
            return;
        }
        androidx.datastore.preferences.protobuf.s1.q("Conscrypt is not available, and we cannot use Java Implementation of RSA-PKCS1.5 in FIPS-mode.");
        throw null;
    }
}
