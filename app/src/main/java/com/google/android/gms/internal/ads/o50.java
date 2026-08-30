package com.google.android.gms.internal.ads;

import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class o50 implements g9.a {

    /* renamed from: u, reason: collision with root package name */
    public final q50 f8985u;

    /* renamed from: v, reason: collision with root package name */
    public final aq0 f8986v;

    public o50(q50 q50Var, aq0 aq0Var) {
        this.f8985u = q50Var;
        this.f8986v = aq0Var;
    }

    @Override // g9.a
    public final void L() {
        int valueOf;
        aq0 aq0Var = this.f8986v;
        q50 q50Var = this.f8985u;
        String str = aq0Var.f4583g;
        synchronized (q50Var.f9754a) {
            try {
                ConcurrentHashMap concurrentHashMap = q50Var.f9755b;
                Integer num = (Integer) concurrentHashMap.get(str);
                if (num == null) {
                    valueOf = 1;
                } else {
                    valueOf = Integer.valueOf(num.intValue() + 1);
                }
                concurrentHashMap.put(str, valueOf);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
