package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.InvalidKeyException;
import java.security.Provider;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes.dex */
public final class gc1 implements o91 {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f6366a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f6367b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider f6368c;

    public gc1(byte[] bArr, byte[] bArr2, Provider provider) {
        if (ct.i(1)) {
            if (bArr.length == 32) {
                this.f6366a = bArr;
                this.f6367b = bArr2;
                this.f6368c = provider;
                return;
            }
            throw new InvalidKeyException("The key length in bytes must be 32.");
        }
        androidx.datastore.preferences.protobuf.s1.q("Can not use ChaCha20Poly1305 in FIPS-mode.");
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.o91
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        if (bArr != null) {
            int length = bArr.length;
            byte[] bArr3 = this.f6367b;
            int length2 = bArr3.length;
            if (length >= length2 + 40) {
                if (fe1.c(bArr3, bArr)) {
                    byte[] bArr4 = new byte[24];
                    System.arraycopy(bArr, length2, bArr4, 0, 24);
                    int[] d2 = xb1.d(xb1.c(this.f6366a), xb1.c(bArr4));
                    ByteBuffer order = ByteBuffer.allocate(d2.length * 4).order(ByteOrder.LITTLE_ENDIAN);
                    order.asIntBuffer().put(d2);
                    SecretKeySpec secretKeySpec = new SecretKeySpec(order.array(), "ChaCha20");
                    byte[] bArr5 = new byte[12];
                    System.arraycopy(bArr4, 16, bArr5, 4, 8);
                    IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr5);
                    byte[] bArr6 = vb1.f11877d;
                    Cipher cipher = Cipher.getInstance("ChaCha20-Poly1305", this.f6368c);
                    cipher.init(2, secretKeySpec, ivParameterSpec);
                    if (bArr2 != null && bArr2.length != 0) {
                        cipher.updateAAD(bArr2);
                    }
                    return cipher.doFinal(bArr, length2 + 24, (length - length2) - 24);
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
