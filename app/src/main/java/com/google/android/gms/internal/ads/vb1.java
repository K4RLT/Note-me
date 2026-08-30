package com.google.android.gms.internal.ads;
import g5.q;
import q.h;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.Provider;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes.dex */
public final class vb1 implements o91 {

    /* renamed from: d, reason: collision with root package name */
    public static final byte[] f11877d = ay0.l("808182838485868788898a8b8c8d8e8f909192939495969798999a9b9c9d9e9f");
    public static final byte[] e = ay0.l("070000004041424344454647");

    /* renamed from: f, reason: collision with root package name */
    public static final byte[] f11878f = ay0.l("a0784d7a4716f3feb4f64e7f4b39bf04");

    /* renamed from: a, reason: collision with root package name */
    public final SecretKeySpec f11879a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f11880b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider f11881c;

    public vb1(byte[] bArr, byte[] bArr2, Provider provider) {
        if (ct.i(1)) {
            if (bArr.length == 32) {
                this.f11879a = new SecretKeySpec(bArr, "ChaCha20");
                this.f11880b = bArr2;
                this.f11881c = provider;
                return;
            }
            throw new InvalidKeyException("The key length in bytes must be 32.");
        }
        androidx.datastore.preferences.protobuf.s1.q("Can not use ChaCha20Poly1305 in FIPS-mode.");
        throw null;
    }

    public static Cipher b() {
        Cipher cipher = (Cipher) yk1.f12900b.f12905a.o("ChaCha20-Poly1305");
        try {
            IvParameterSpec ivParameterSpec = new IvParameterSpec(e);
            byte[] bArr = f11877d;
            cipher.init(2, new SecretKeySpec(bArr, "ChaCha20"), ivParameterSpec);
            byte[] bArr2 = f11878f;
            if (cipher.doFinal(bArr2).length == 0) {
                cipher.init(2, new SecretKeySpec(bArr, "ChaCha20"), ivParameterSpec);
                if (cipher.doFinal(bArr2).length == 0) {
                    return cipher;
                }
            }
        } catch (GeneralSecurityException unused) {
        }
        androidx.datastore.preferences.protobuf.s1.q("JCE does not support algorithm: ChaCha20-Poly1305");
        return null;
    }

    @Override // com.google.android.gms.internal.ads.o91
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        if (bArr != null) {
            int length = bArr.length;
            byte[] bArr3 = this.f11880b;
            int length2 = bArr3.length;
            if (length >= length2 + 28) {
                if (fe1.c(bArr3, bArr)) {
                    byte[] bArr4 = new byte[12];
                    System.arraycopy(bArr, length2, bArr4, 0, 12);
                    IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr4);
                    Cipher cipher = Cipher.getInstance("ChaCha20-Poly1305", this.f11881c);
                    cipher.init(2, this.f11879a, ivParameterSpec);
                    if (bArr2 != null && bArr2.length != 0) {
                        cipher.updateAAD(bArr2);
                    }
                    return cipher.doFinal(bArr, length2 + 12, (length - length2) - 12);
                }
                androidx.datastore.preferences.protobuf.s1.q("Decryption failed (OutputPrefix mismatch).");
                return null;
            }
            androidx.datastore.preferences.protobuf.s1.q("ciphertext too short");
            return null;
        }
        g5.q.h("ciphertext is null");
        return null;
    }
}
