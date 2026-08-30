package com.google.android.gms.internal.ads;
import g9.r;
import r.e;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class o40 implements ai {

    /* renamed from: u, reason: collision with root package name */
    public final h00 f8953u;

    /* renamed from: v, reason: collision with root package name */
    public final Executor f8954v;

    /* renamed from: w, reason: collision with root package name */
    public final AtomicReference f8955w = new AtomicReference();

    public o40(h00 h00Var, Executor executor) {
        this.f8953u = h00Var;
        this.f8954v = executor;
    }

    @Override // com.google.android.gms.internal.ads.ai
    public final synchronized void k(zh zhVar) {
        h00 h00Var = this.f8953u;
        if (h00Var != null) {
            if (((Boolean) g9.r.e.f17698c.a(sl.f10673be)).booleanValue()) {
                boolean z3 = zhVar.f13171j;
                AtomicReference atomicReference = this.f8955w;
                if (z3) {
                    Boolean bool = Boolean.TRUE;
                    if (!bool.equals(atomicReference.getAndSet(bool))) {
                        this.f8954v.execute(new p00(h00Var, 3));
                    }
                } else {
                    Boolean bool2 = Boolean.FALSE;
                    if (!bool2.equals(atomicReference.getAndSet(bool2))) {
                        this.f8954v.execute(new p00(h00Var, 2));
                    }
                }
            }
        }
    }
}
