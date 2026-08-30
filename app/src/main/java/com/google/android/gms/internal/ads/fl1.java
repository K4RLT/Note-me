package com.google.android.gms.internal.ads;
import j6.c;

import java.util.Collections;
import java.util.HashMap;

/* loaded from: classes.dex */
public abstract class fl1 implements z91 {

    /* renamed from: a, reason: collision with root package name */
    public static final j6.c f6104a;

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f6105b;

    /* renamed from: c, reason: collision with root package name */
    public static final byte[] f6106c;

    static {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        zk1 zk1Var = zk1.f13181u;
        uj1 uj1Var = uj1.f11653b;
        hashMap.put(zk1Var, uj1Var);
        hashMap2.put(uj1Var, zk1Var);
        zk1 zk1Var2 = zk1.f13182v;
        uj1 uj1Var2 = uj1.f11654c;
        hashMap.put(zk1Var2, uj1Var2);
        hashMap2.put(uj1Var2, zk1Var2);
        zk1 zk1Var3 = zk1.f13183w;
        uj1 uj1Var3 = uj1.f11655d;
        hashMap.put(zk1Var3, uj1Var3);
        hashMap2.put(uj1Var3, zk1Var3);
        f6104a = new j6.c(8, (Object) Collections.unmodifiableMap(hashMap), (Object) Collections.unmodifiableMap(hashMap2), false);
        f6105b = new byte[0];
        f6106c = new byte[]{0};
    }
}
