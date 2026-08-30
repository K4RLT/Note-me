package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes.dex */
public final class bc1 implements o91 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4764a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f4765b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f4766c;

    public bc1(byte[] bArr, gl1 gl1Var) {
        this.f4764a = 1;
        if (ct.i(2)) {
            a7.k kVar = rb1.f10198a;
            an1.f(bArr.length);
            this.f4766c = new SecretKeySpec(bArr, "AES");
            this.f4765b = gl1Var.b();
            return;
        }
        androidx.datastore.preferences.protobuf.s1.q("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.o91
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        int i = this.f4764a;
        Object obj = this.f4766c;
        byte[] bArr3 = this.f4765b;
        switch (i) {
            case 0:
                o91 o91Var = (o91) obj;
                if (bArr3.length == 0) {
                    return o91Var.a(bArr, bArr2);
                }
                if (fe1.c(bArr3, bArr)) {
                    return o91Var.a(Arrays.copyOfRange(bArr, 5, bArr.length), bArr2);
                }
                androidx.datastore.preferences.protobuf.s1.q("wrong prefix");
                return null;
            case 1:
                if (bArr != null) {
                    int length = bArr.length;
                    int length2 = bArr3.length;
                    if (length >= length2 + 28) {
                        if (fe1.c(bArr3, bArr)) {
                            a7.k kVar = rb1.f10198a;
                            Objects.equals(System.getProperty("java.vendor"), "The Android Project");
                            GCMParameterSpec gCMParameterSpec = new GCMParameterSpec(128, bArr, length2, 12);
                            Cipher cipher = (Cipher) rb1.f10198a.get();
                            cipher.init(2, (SecretKeySpec) obj, gCMParameterSpec);
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
            case 2:
                int length3 = bArr3.length;
                if (length3 == 0) {
                    return b(bArr, bArr2);
                }
                if (fe1.c(bArr3, bArr)) {
                    return b(Arrays.copyOfRange(bArr, length3, bArr.length), bArr2);
                }
                androidx.datastore.preferences.protobuf.s1.q("Decryption failed (OutputPrefix mismatch).");
                return null;
            default:
                int length4 = bArr3.length;
                if (length4 == 0) {
                    return c(bArr, bArr2);
                }
                if (fe1.c(bArr3, bArr)) {
                    return c(Arrays.copyOfRange(bArr, length4, bArr.length), bArr2);
                }
                androidx.datastore.preferences.protobuf.s1.q("Decryption failed (OutputPrefix mismatch).");
                return null;
        }
    }

    public byte[] b(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        if (length >= 28) {
            return ((ac1) this.f4766c).h(ByteBuffer.wrap(bArr, 12, length - 12), Arrays.copyOf(bArr, 12), bArr2);
        }
        androidx.datastore.preferences.protobuf.s1.q("ciphertext too short");
        return null;
    }

    public byte[] c(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        if (length >= 40) {
            return ((ac1) this.f4766c).h(ByteBuffer.wrap(bArr, 24, length - 24), Arrays.copyOf(bArr, 24), bArr2);
        }
        androidx.datastore.preferences.protobuf.s1.q("ciphertext too short");
        return null;
    }

    public bc1(o91 o91Var, byte[] bArr) {
        this.f4764a = 0;
        this.f4766c = o91Var;
        int length = bArr.length;
        if (length == 0 || length == 5) {
            this.f4765b = bArr;
        } else {
            q.x.n("identifier has an invalid length");
            throw null;
        }
    }

    public bc1(int i, byte[] bArr, byte[] bArr2) {
        this.f4764a = i;
        switch (i) {
            case 3:
                this.f4766c = new ac1(bArr, 1);
                this.f4765b = bArr2;
                return;
            default:
                this.f4766c = new ac1(bArr, 0);
                this.f4765b = bArr2;
                return;
        }
    }
}
