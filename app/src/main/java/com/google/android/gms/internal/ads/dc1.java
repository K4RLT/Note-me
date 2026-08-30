package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class dc1 implements o91 {

    /* renamed from: a, reason: collision with root package name */
    public final rd1 f5401a;

    public /* synthetic */ dc1(rd1 rd1Var) {
        this.f5401a = rd1Var;
    }

    @Override // com.google.android.gms.internal.ads.o91
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        Iterator it = this.f5401a.a(bArr).iterator();
        while (it.hasNext()) {
            try {
                return ((cc1) it.next()).f5076a.a(bArr, bArr2);
            } catch (GeneralSecurityException unused) {
            }
        }
        androidx.datastore.preferences.protobuf.s1.q("decryption failed");
        return null;
    }
}
