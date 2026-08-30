package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes.dex */
public final class wk1 implements o91 {

    /* renamed from: a, reason: collision with root package name */
    public final rk1 f12266a;

    /* renamed from: b, reason: collision with root package name */
    public final bl1 f12267b;

    /* renamed from: c, reason: collision with root package name */
    public final int f12268c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f12269d;

    public wk1(rk1 rk1Var, bl1 bl1Var, int i, byte[] bArr) {
        this.f12266a = rk1Var;
        this.f12267b = bl1Var;
        this.f12268c = i;
        this.f12269d = bArr;
    }

    public static wk1 b(fa1 fa1Var) {
        byte[] b10 = ((gl1) fa1Var.Q.f4819v).b();
        ka1 ka1Var = fa1Var.P;
        rk1 rk1Var = new rk1(b10, ka1Var.f7699c);
        String valueOf = String.valueOf(ka1Var.f7701f);
        tc tcVar = new tc("HMAC".concat(valueOf), new SecretKeySpec(((gl1) fa1Var.R.f4819v).b(), "HMAC"));
        int i = ka1Var.f7700d;
        return new wk1(rk1Var, new bl1(tcVar, i), i, fa1Var.S.b());
    }

    @Override // com.google.android.gms.internal.ads.o91
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        byte[] z3;
        int length = bArr.length;
        byte[] bArr3 = this.f12269d;
        int length2 = bArr3.length;
        int i = this.f12268c;
        if (length >= i + length2) {
            if (fe1.c(bArr3, bArr)) {
                int i10 = length - i;
                byte[] copyOfRange = Arrays.copyOfRange(bArr, length2, i10);
                byte[] copyOfRange2 = Arrays.copyOfRange(bArr, i10, length);
                if (bArr2 == null) {
                    bArr2 = new byte[0];
                }
                byte[] z9 = xy.z(bArr2, copyOfRange, Arrays.copyOf(ByteBuffer.allocate(8).putLong(bArr2.length * 8).array(), 8));
                bl1 bl1Var = this.f12267b;
                int i11 = bl1Var.f4821b;
                af1 af1Var = bl1Var.f4820a;
                byte[] bArr4 = bl1Var.f4823d;
                int length3 = bArr4.length;
                byte[] bArr5 = bl1Var.f4822c;
                if (length3 > 0) {
                    z3 = xy.z(bArr5, af1Var.e(xy.z(z9, bArr4), i11));
                } else {
                    z3 = xy.z(bArr5, af1Var.e(z9, i11));
                }
                if (MessageDigest.isEqual(z3, copyOfRange2)) {
                    int length4 = copyOfRange.length;
                    rk1 rk1Var = this.f12266a;
                    int i12 = rk1Var.f10229b;
                    if (length4 >= i12) {
                        byte[] bArr6 = new byte[i12];
                        System.arraycopy(copyOfRange, 0, bArr6, 0, i12);
                        int i13 = length4 - i12;
                        byte[] bArr7 = new byte[i13];
                        Cipher cipher = (Cipher) rk1.f10227d.get();
                        byte[] bArr8 = new byte[rk1Var.f10230c];
                        System.arraycopy(bArr6, 0, bArr8, 0, i12);
                        cipher.init(2, rk1Var.f10228a, new IvParameterSpec(bArr8));
                        if (cipher.doFinal(copyOfRange, i12, i13, bArr7, 0) == i13) {
                            return bArr7;
                        }
                        androidx.datastore.preferences.protobuf.s1.q("stored output's length does not match input's length");
                        return null;
                    }
                    androidx.datastore.preferences.protobuf.s1.q("ciphertext too short");
                    return null;
                }
                androidx.datastore.preferences.protobuf.s1.q("invalid MAC");
                return null;
            }
            androidx.datastore.preferences.protobuf.s1.q("Decryption failed (OutputPrefix mismatch).");
            return null;
        }
        androidx.datastore.preferences.protobuf.s1.q("Decryption failed (ciphertext too short).");
        return null;
    }
}
