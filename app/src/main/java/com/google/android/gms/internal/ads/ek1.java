package com.google.android.gms.internal.ads;
import j6.c;

import java.security.Provider;
import java.security.interfaces.ECPublicKey;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class ek1 implements z91 {

    /* renamed from: g, reason: collision with root package name */
    public static final byte[] f5702g = new byte[0];

    /* renamed from: h, reason: collision with root package name */
    public static final byte[] f5703h = {0};
    public static final c i;

    /* renamed from: j, reason: collision with root package name */
    public static final c f5704j;

    /* renamed from: k, reason: collision with root package name */
    public static final c f5705k;

    /* renamed from: a, reason: collision with root package name */
    public final ECPublicKey f5706a;

    /* renamed from: b, reason: collision with root package name */
    public final String f5707b;

    /* renamed from: c, reason: collision with root package name */
    public final vk1 f5708c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f5709d;
    public final byte[] e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider f5710f;

    static {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        q91 q91Var = q91.H;
        zk1 zk1Var = zk1.f13181u;
        hashMap.put(zk1Var, q91Var);
        hashMap2.put(q91Var, zk1Var);
        q91 q91Var2 = q91.I;
        zk1 zk1Var2 = zk1.f13182v;
        hashMap.put(zk1Var2, q91Var2);
        hashMap2.put(q91Var2, zk1Var2);
        q91 q91Var3 = q91.J;
        zk1 zk1Var3 = zk1.f13183w;
        hashMap.put(zk1Var3, q91Var3);
        hashMap2.put(q91Var3, zk1Var3);
        i = new c(8, (Object) Collections.unmodifiableMap(hashMap), (Object) Collections.unmodifiableMap(hashMap2), false);
        HashMap hashMap3 = new HashMap();
        HashMap hashMap4 = new HashMap();
        w91 w91Var = w91.f12189p;
        vk1 vk1Var = vk1.f11929u;
        hashMap3.put(vk1Var, w91Var);
        hashMap4.put(w91Var, vk1Var);
        w91 w91Var2 = w91.f12190q;
        vk1 vk1Var2 = vk1.f11930v;
        hashMap3.put(vk1Var2, w91Var2);
        hashMap4.put(w91Var2, vk1Var2);
        f5704j = new c(8, (Object) Collections.unmodifiableMap(hashMap3), (Object) Collections.unmodifiableMap(hashMap4), false);
        HashMap hashMap5 = new HashMap();
        HashMap hashMap6 = new HashMap();
        aj1 aj1Var = aj1.f4525c;
        uk1 uk1Var = uk1.f11662u;
        hashMap5.put(uk1Var, aj1Var);
        hashMap6.put(aj1Var, uk1Var);
        aj1 aj1Var2 = aj1.f4526d;
        uk1 uk1Var2 = uk1.f11663v;
        hashMap5.put(uk1Var2, aj1Var2);
        hashMap6.put(aj1Var2, uk1Var2);
        aj1 aj1Var3 = aj1.e;
        uk1 uk1Var3 = uk1.f11664w;
        hashMap5.put(uk1Var3, aj1Var3);
        hashMap6.put(aj1Var3, uk1Var3);
        f5705k = new c(8, (Object) Collections.unmodifiableMap(hashMap5), (Object) Collections.unmodifiableMap(hashMap6), false);
    }

    public ek1(ECPublicKey eCPublicKey, zk1 zk1Var, vk1 vk1Var, byte[] bArr, byte[] bArr2, Provider provider) {
        if (ct.i(2)) {
            an1.t(zk1Var);
            this.f5707b = zk1Var.toString().concat("withECDSA");
            this.f5706a = eCPublicKey;
            this.f5708c = vk1Var;
            this.f5709d = bArr;
            this.e = bArr2;
            this.f5710f = provider;
            return;
        }
        androidx.datastore.preferences.protobuf.s1.q("Can not use ECDSA in FIPS-mode, as BoringCrypto is not available.");
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.z91
    public final void a(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = this.f5709d;
        int length = bArr3.length;
        if (length == 0) {
            b(bArr, bArr2);
        } else if (fe1.c(bArr3, bArr)) {
            b(Arrays.copyOfRange(bArr, length, bArr.length), bArr2);
        } else {
            androidx.datastore.preferences.protobuf.s1.q("Invalid signature (output prefix mismatch)");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0134 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0114  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(byte[] r18, byte[] r19) {
        /*
            Method dump skipped, instructions count: 317
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ek1.b(byte[], byte[]):void");
    }
}
