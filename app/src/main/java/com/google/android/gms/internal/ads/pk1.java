package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class pk1 implements z91 {

    /* renamed from: a, reason: collision with root package name */
    public final rd1 f9539a;

    public pk1(rd1 rd1Var) {
        this.f9539a = rd1Var;
    }

    @Override // com.google.android.gms.internal.ads.z91
    public final void a(byte[] bArr, byte[] bArr2) {
        Iterator it = this.f9539a.a(bArr).iterator();
        while (it.hasNext()) {
            try {
                ((qk1) it.next()).f9865a.a(bArr, bArr2);
                return;
            } catch (GeneralSecurityException unused) {
            }
        }
        androidx.datastore.preferences.protobuf.s1.q("invalid signature");
    }
}
