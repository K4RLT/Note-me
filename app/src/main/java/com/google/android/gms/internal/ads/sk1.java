package com.google.android.gms.internal.ads;
import a7.k;
import q.x;

import javax.crypto.AEADBadTagException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes.dex */
public final class sk1 implements o91 {
    public static final a7.k e = new a7.k(12);

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f10638a;

    /* renamed from: b, reason: collision with root package name */
    public final af1 f10639b;

    /* renamed from: c, reason: collision with root package name */
    public final SecretKeySpec f10640c;

    /* renamed from: d, reason: collision with root package name */
    public final int f10641d;

    public sk1(int i, byte[] bArr, byte[] bArr2) {
        if (ct.i(1)) {
            if (i != 12 && i != 16) {
                q.x.n("IV size should be either 12 or 16 bytes");
                throw null;
            }
            this.f10641d = i;
            int length = bArr.length;
            an1.f(length);
            this.f10640c = new SecretKeySpec(bArr, "AES");
            this.f10639b = x21.y(ye1.g0(ze1.b(length), new bl0(12, gl1.a(bArr))));
            this.f10638a = bArr2;
            return;
        }
        androidx.datastore.preferences.protobuf.s1.q("Can not use AES-EAX in FIPS-mode.");
        throw null;
    }

    public static sk1 b(la1 la1Var) {
        if (ct.i(1)) {
            la1Var.getClass();
            return new sk1(la1Var.P.f9069b, ((gl1) la1Var.Q.f4819v).b(), la1Var.R.b());
        }
        androidx.datastore.preferences.protobuf.s1.q("Can not use AES-EAX in FIPS-mode.");
        return null;
    }

    @Override // com.google.android.gms.internal.ads.o91
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        byte[] bArr3 = this.f10638a;
        int length2 = bArr3.length;
        int i = this.f10641d;
        int i10 = ((length - length2) - i) - 16;
        if (i10 >= 0) {
            if (fe1.c(bArr3, bArr)) {
                byte[] c10 = c(0, length2, i, bArr);
                if (bArr2 == null) {
                    bArr2 = new byte[0];
                }
                byte[] c11 = c(1, 0, bArr2.length, bArr2);
                byte[] c12 = c(2, length2 + i, i10, bArr);
                int i11 = length - 16;
                byte b10 = 0;
                for (int i12 = 0; i12 < 16; i12++) {
                    b10 = (byte) (b10 | (((bArr[i11 + i12] ^ c11[i12]) ^ c10[i12]) ^ c12[i12]));
                }
                if (b10 == 0) {
                    Cipher cipher = (Cipher) e.get();
                    cipher.init(1, this.f10640c, new IvParameterSpec(c10));
                    return cipher.doFinal(bArr, bArr3.length + i, i10);
                }
                throw new AEADBadTagException("tag mismatch");
            }
            androidx.datastore.preferences.protobuf.s1.q("Decryption failed (OutputPrefix mismatch).");
            return null;
        }
        androidx.datastore.preferences.protobuf.s1.q("ciphertext too short");
        return null;
    }

    public final byte[] c(int i, int i10, int i11, byte[] bArr) {
        byte[] bArr2 = new byte[i11 + 16];
        bArr2[15] = (byte) i;
        System.arraycopy(bArr, i10, bArr2, 16, i11);
        return this.f10639b.e(bArr2, 16);
    }
}
