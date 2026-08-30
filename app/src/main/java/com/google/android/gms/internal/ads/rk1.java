package com.google.android.gms.internal.ads;
import a7.k;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes.dex */
public final class rk1 {

    /* renamed from: d, reason: collision with root package name */
    public static final k f10227d = new k(11);

    /* renamed from: a, reason: collision with root package name */
    public final SecretKeySpec f10228a;

    /* renamed from: b, reason: collision with root package name */
    public final int f10229b;

    /* renamed from: c, reason: collision with root package name */
    public final int f10230c;

    public rk1(byte[] bArr, int i) {
        if (ct.i(2)) {
            an1.f(bArr.length);
            this.f10228a = new SecretKeySpec(bArr, "AES");
            int blockSize = ((Cipher) f10227d.get()).getBlockSize();
            this.f10230c = blockSize;
            if (i <= blockSize) {
                this.f10229b = i;
                return;
            } else {
                androidx.datastore.preferences.protobuf.s1.q("invalid IV size");
                throw null;
            }
        }
        androidx.datastore.preferences.protobuf.s1.q("Can not use AES-CTR in FIPS-mode, as BoringCrypto module is not available.");
        throw null;
    }
}
