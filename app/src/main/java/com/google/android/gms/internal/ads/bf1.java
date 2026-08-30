package com.google.android.gms.internal.ads;
import a7.k;
import q.x;

import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes.dex */
public final class bf1 implements af1 {

    /* renamed from: x, reason: collision with root package name */
    public static final k f4785x = new k(10);

    /* renamed from: u, reason: collision with root package name */
    public final SecretKeySpec f4786u;

    /* renamed from: v, reason: collision with root package name */
    public final byte[] f4787v;

    /* renamed from: w, reason: collision with root package name */
    public final byte[] f4788w;

    public bf1(byte[] bArr) {
        an1.f(bArr.length);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        this.f4786u = secretKeySpec;
        if (ct.i(1)) {
            Cipher cipher = (Cipher) f4785x.get();
            cipher.init(1, secretKeySpec);
            byte[] o10 = an1.o(cipher.doFinal(new byte[16]));
            this.f4787v = o10;
            this.f4788w = an1.o(o10);
            return;
        }
        androidx.datastore.preferences.protobuf.s1.q("Can not use AES-CMAC in FIPS-mode.");
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.af1
    public final byte[] e(byte[] bArr, int i) {
        byte[] H;
        if (i <= 16) {
            int i10 = 1;
            if (ct.i(1)) {
                Cipher cipher = (Cipher) f4785x.get();
                cipher.init(1, this.f4786u);
                int length = bArr.length;
                if (length != 0) {
                    i10 = 1 + ((length - 1) >> 4);
                }
                int i11 = i10 - 1;
                int i12 = i11 * 16;
                if (i10 * 16 == length) {
                    H = xy.H(i12, bArr, this.f4787v);
                } else {
                    byte[] copyOfRange = Arrays.copyOfRange(bArr, i12, length);
                    int length2 = copyOfRange.length;
                    if (length2 < 16) {
                        byte[] copyOf = Arrays.copyOf(copyOfRange, 16);
                        copyOf[length2] = Byte.MIN_VALUE;
                        if (copyOf.length == 16) {
                            H = xy.H(0, copyOf, this.f4788w);
                        } else {
                            x.n("The lengths of x and y should match.");
                            return null;
                        }
                    } else {
                        x.n("x must be smaller than a block.");
                        return null;
                    }
                }
                byte[] bArr2 = new byte[16];
                byte[] bArr3 = new byte[16];
                for (int i13 = 0; i13 < i11; i13++) {
                    int i14 = i13 * 16;
                    for (int i15 = 0; i15 < 16; i15++) {
                        bArr3[i15] = (byte) (bArr2[i15] ^ bArr[i15 + i14]);
                    }
                    if (cipher.doFinal(bArr3, 0, 16, bArr2) != 16) {
                        x.o("Cipher didn't write full block");
                        return null;
                    }
                }
                for (int i16 = 0; i16 < 16; i16++) {
                    bArr3[i16] = (byte) (bArr2[i16] ^ H[i16]);
                }
                if (cipher.doFinal(bArr3, 0, 16, bArr2) == 16) {
                    if (i == 16) {
                        return bArr2;
                    }
                    return Arrays.copyOf(bArr2, i);
                }
                x.o("Cipher didn't write full block");
                return null;
            }
            androidx.datastore.preferences.protobuf.s1.q("Can not use AES-CMAC in FIPS-mode.");
            return null;
        }
        throw new InvalidAlgorithmParameterException("outputLength too large, max is 16 bytes");
    }
}
