package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes.dex */
public final class ec1 implements o91 {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f5654a;

    /* renamed from: b, reason: collision with root package name */
    public final int f5655b;

    /* renamed from: c, reason: collision with root package name */
    public final af1 f5656c;

    public ec1(byte[] bArr, gl1 gl1Var, int i) {
        this.f5656c = x21.y(ye1.g0(ze1.b(bArr.length), new bl0(12, gl1.a(bArr))));
        this.f5654a = gl1Var.b();
        this.f5655b = i;
    }

    @Override // com.google.android.gms.internal.ads.o91
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        if (bArr != null) {
            int length = bArr.length;
            byte[] bArr3 = this.f5654a;
            int length2 = bArr3.length;
            int i = this.f5655b + length2;
            int i10 = i + 28;
            if (length >= i10) {
                if (fe1.c(bArr3, bArr)) {
                    byte[] copyOfRange = Arrays.copyOfRange(bArr, length2, i);
                    byte[] bArr4 = {0, 1, 88, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
                    byte[] bArr5 = {0, 2, 88, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
                    int length3 = copyOfRange.length;
                    if (length3 <= 12 && length3 >= 8) {
                        System.arraycopy(copyOfRange, 0, bArr4, 4, length3);
                        System.arraycopy(copyOfRange, 0, bArr5, 4, length3);
                        byte[] bArr6 = new byte[32];
                        af1 af1Var = this.f5656c;
                        System.arraycopy(af1Var.e(bArr4, 16), 0, bArr6, 0, 16);
                        System.arraycopy(af1Var.e(bArr5, 16), 0, bArr6, 16, 16);
                        if (ct.i(2)) {
                            a7.k kVar = rb1.f10198a;
                            an1.f(32);
                            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr6, "AES");
                            int i11 = i + 12;
                            byte[] copyOfRange2 = Arrays.copyOfRange(bArr, i, i11);
                            if (copyOfRange2.length == 12) {
                                if (length >= i10) {
                                    Objects.equals(System.getProperty("java.vendor"), "The Android Project");
                                    GCMParameterSpec gCMParameterSpec = new GCMParameterSpec(128, copyOfRange2, 0, 12);
                                    Cipher cipher = (Cipher) rb1.f10198a.get();
                                    cipher.init(2, secretKeySpec, gCMParameterSpec);
                                    if (bArr2 != null && bArr2.length != 0) {
                                        cipher.updateAAD(bArr2);
                                    }
                                    return cipher.doFinal(bArr, i11, length - i11);
                                }
                                androidx.datastore.preferences.protobuf.s1.q("ciphertext too short");
                                return null;
                            }
                            androidx.datastore.preferences.protobuf.s1.q("iv is wrong size");
                            return null;
                        }
                        androidx.datastore.preferences.protobuf.s1.q("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
                        return null;
                    }
                    androidx.datastore.preferences.protobuf.s1.q("invalid salt size");
                    return null;
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
