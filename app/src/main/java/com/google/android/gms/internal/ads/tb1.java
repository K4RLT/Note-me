package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes.dex */
public final class tb1 implements o91 {

    /* renamed from: d, reason: collision with root package name */
    public static final byte[] f11307d = ay0.l("7a806c");
    public static final byte[] e = ay0.l("46bb91c3c5");

    /* renamed from: f, reason: collision with root package name */
    public static final byte[] f11308f = ay0.l("36864200e0eaf5284d884a0e77d31646");

    /* renamed from: g, reason: collision with root package name */
    public static final byte[] f11309g = ay0.l("bae8e37fc83441b16034566b");

    /* renamed from: h, reason: collision with root package name */
    public static final byte[] f11310h = ay0.l("af60eb711bd85bc1e4d3e0a462e074eea428a8");

    /* renamed from: a, reason: collision with root package name */
    public final hc1 f11311a;

    /* renamed from: b, reason: collision with root package name */
    public final SecretKeySpec f11312b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f11313c;

    public tb1(byte[] bArr, byte[] bArr2) {
        hc1 hc1Var = hc1.f6674x;
        this.f11313c = bArr2;
        an1.f(bArr.length);
        this.f11312b = new SecretKeySpec(bArr, "AES");
        this.f11311a = hc1Var;
    }

    public static boolean b(Cipher cipher) {
        try {
            byte[] bArr = f11309g;
            cipher.init(2, new SecretKeySpec(f11308f, "AES"), new GCMParameterSpec(128, bArr, 0, bArr.length));
            cipher.updateAAD(e);
            byte[] bArr2 = f11310h;
            return MessageDigest.isEqual(cipher.doFinal(bArr2, 0, bArr2.length), f11307d);
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.o91
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        byte[] bArr3 = this.f11313c;
        int length2 = bArr3.length;
        if (length >= length2 + 28) {
            if (fe1.c(bArr3, bArr)) {
                this.f11311a.getClass();
                Cipher e8 = hc1.e();
                e8.init(2, this.f11312b, new GCMParameterSpec(128, bArr, length2, 12));
                if (bArr2 != null && bArr2.length != 0) {
                    e8.updateAAD(bArr2);
                }
                return e8.doFinal(bArr, length2 + 12, (length - length2) - 12);
            }
            androidx.datastore.preferences.protobuf.s1.q("Decryption failed (OutputPrefix mismatch).");
            return null;
        }
        androidx.datastore.preferences.protobuf.s1.q("ciphertext too short");
        return null;
    }
}
