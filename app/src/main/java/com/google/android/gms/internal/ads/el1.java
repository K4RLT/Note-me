package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.interfaces.RSAPublicKey;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class el1 implements z91 {

    /* renamed from: a, reason: collision with root package name */
    public final RSAPublicKey f5711a;

    /* renamed from: b, reason: collision with root package name */
    public final zk1 f5712b;

    /* renamed from: c, reason: collision with root package name */
    public final zk1 f5713c;

    /* renamed from: d, reason: collision with root package name */
    public final int f5714d;
    public final byte[] e;

    /* renamed from: f, reason: collision with root package name */
    public final byte[] f5715f;

    public /* synthetic */ el1(RSAPublicKey rSAPublicKey, zk1 zk1Var, zk1 zk1Var2, int i, byte[] bArr, byte[] bArr2) {
        if (!lc1.a()) {
            an1.t(zk1Var);
            if (zk1Var.equals(zk1Var2)) {
                an1.C(rSAPublicKey.getModulus().bitLength());
                an1.H(rSAPublicKey.getPublicExponent());
                this.f5711a = rSAPublicKey;
                this.f5712b = zk1Var;
                this.f5713c = zk1Var2;
                this.f5714d = i;
                this.e = bArr;
                this.f5715f = bArr2;
                return;
            }
            androidx.datastore.preferences.protobuf.s1.q("sigHash and mgf1Hash must be the same");
            throw null;
        }
        androidx.datastore.preferences.protobuf.s1.q("Can not use RSA PSS in FIPS-mode, as BoringCrypto module is not available.");
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.z91
    public final void a(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = this.e;
        int length = bArr3.length;
        if (length == 0) {
            b(bArr, bArr2);
        } else if (fe1.c(bArr3, bArr)) {
            b(Arrays.copyOfRange(bArr, length, bArr.length), bArr2);
        } else {
            androidx.datastore.preferences.protobuf.s1.q("Invalid signature (output prefix mismatch)");
        }
    }

    public final void b(byte[] bArr, byte[] bArr2) {
        RSAPublicKey rSAPublicKey = this.f5711a;
        BigInteger publicExponent = rSAPublicKey.getPublicExponent();
        BigInteger modulus = rSAPublicKey.getModulus();
        int bitLength = modulus.bitLength() + 7;
        int bitLength2 = modulus.bitLength() + 6;
        if (bitLength / 8 == bArr.length) {
            BigInteger bigInteger = new BigInteger(1, bArr);
            if (bigInteger.compareTo(modulus) < 0) {
                byte[] x9 = b80.x(bigInteger.modPow(publicExponent, modulus), bitLength2 / 8);
                int bitLength3 = modulus.bitLength() - 1;
                zk1 zk1Var = this.f5712b;
                an1.t(zk1Var);
                yk1 yk1Var = yk1.e;
                MessageDigest messageDigest = (MessageDigest) yk1Var.f12905a.o(ed1.s(zk1Var));
                messageDigest.update(bArr2);
                byte[] bArr3 = this.f5715f;
                if (bArr3.length != 0) {
                    messageDigest.update(bArr3);
                }
                byte[] digest = messageDigest.digest();
                int digestLength = messageDigest.getDigestLength();
                int length = x9.length;
                int i = this.f5714d;
                if (length >= digestLength + i + 2) {
                    if (x9[length - 1] == -68) {
                        int i10 = length - digestLength;
                        int i11 = i10 - 1;
                        byte[] copyOf = Arrays.copyOf(x9, i11);
                        int length2 = copyOf.length;
                        byte[] copyOfRange = Arrays.copyOfRange(x9, length2, length2 + digestLength);
                        int i12 = 0;
                        while (true) {
                            long j10 = (length * 8) - bitLength3;
                            if (i12 < j10) {
                                if (((copyOf[i12 / 8] >> (7 - (i12 % 8))) & 1) == 0) {
                                    i12++;
                                } else {
                                    androidx.datastore.preferences.protobuf.s1.q("inconsistent");
                                    return;
                                }
                            } else {
                                MessageDigest messageDigest2 = (MessageDigest) yk1Var.f12905a.o(ed1.s(this.f5713c));
                                int digestLength2 = messageDigest2.getDigestLength();
                                byte[] bArr4 = new byte[i11];
                                int i13 = 0;
                                int i14 = 0;
                                while (i13 <= (i10 - 2) / digestLength2) {
                                    messageDigest2.reset();
                                    messageDigest2.update(copyOfRange);
                                    int i15 = i;
                                    messageDigest2.update(b80.x(BigInteger.valueOf(i13), 4));
                                    byte[] digest2 = messageDigest2.digest();
                                    int length3 = digest2.length;
                                    System.arraycopy(digest2, 0, bArr4, i14, Math.min(length3, i11 - i14));
                                    i14 += length3;
                                    i13++;
                                    i = i15;
                                    messageDigest2 = messageDigest2;
                                }
                                int i16 = i;
                                byte[] bArr5 = new byte[i11];
                                for (int i17 = 0; i17 < i11; i17++) {
                                    bArr5[i17] = (byte) (bArr4[i17] ^ copyOf[i17]);
                                }
                                for (int i18 = 0; i18 <= j10; i18++) {
                                    int i19 = i18 / 8;
                                    bArr5[i19] = (byte) ((~(1 << (7 - (i18 % 8)))) & bArr5[i19]);
                                }
                                int i20 = 0;
                                while (true) {
                                    int i21 = (i10 - i16) - 2;
                                    if (i20 < i21) {
                                        if (bArr5[i20] == 0) {
                                            i20++;
                                        } else {
                                            androidx.datastore.preferences.protobuf.s1.q("inconsistent");
                                            return;
                                        }
                                    } else {
                                        if (bArr5[i21] == 1) {
                                            byte[] copyOfRange2 = Arrays.copyOfRange(bArr5, i11 - i16, i11);
                                            int i22 = digestLength + 8;
                                            byte[] bArr6 = new byte[i22 + i16];
                                            System.arraycopy(digest, 0, bArr6, 8, digest.length);
                                            System.arraycopy(copyOfRange2, 0, bArr6, i22, copyOfRange2.length);
                                            if (MessageDigest.isEqual(messageDigest.digest(bArr6), copyOfRange)) {
                                                return;
                                            }
                                            androidx.datastore.preferences.protobuf.s1.q("inconsistent");
                                            return;
                                        }
                                        androidx.datastore.preferences.protobuf.s1.q("inconsistent");
                                        return;
                                    }
                                }
                            }
                        }
                    } else {
                        androidx.datastore.preferences.protobuf.s1.q("inconsistent");
                    }
                } else {
                    androidx.datastore.preferences.protobuf.s1.q("inconsistent");
                }
            } else {
                androidx.datastore.preferences.protobuf.s1.q("signature out of range");
            }
        } else {
            androidx.datastore.preferences.protobuf.s1.q("invalid signature's length");
        }
    }
}
