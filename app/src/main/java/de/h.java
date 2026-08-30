package de;

import com.google.android.gms.internal.ads.ou1;
import com.google.android.gms.internal.consent_sdk.g7;
import fa.y;
import g5.d0;
import g5.v;
import java.io.Serializable;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f15844a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f15845b;

    /* renamed from: c, reason: collision with root package name */
    public final Serializable f15846c;

    public h(v vVar) {
        vVar.getClass();
        this.f15845b = vVar;
        this.f15844a = new AtomicBoolean(false);
        this.f15846c = new pe.n(new a1.c(19, this));
    }

    public r5.j a() {
        v vVar = (v) this.f15845b;
        vVar.a();
        if (this.f15844a.compareAndSet(false, true)) {
            return (r5.j) ((pe.n) this.f15846c).getValue();
        }
        String c10 = c();
        vVar.getClass();
        vVar.a();
        vVar.b();
        return vVar.k().y().k(c10);
    }

    public ib.o b(Executor executor, Callable callable, pd.c cVar) {
        boolean z3;
        if (((AtomicInteger) this.f15846c).get() > 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        y.k(z3);
        if (((ib.o) cVar.f22681u).k()) {
            ib.o oVar = new ib.o();
            oVar.q();
            return oVar;
        }
        pd.c cVar2 = new pd.c(27, false);
        ib.h hVar = new ib.h((pd.c) cVar2.f22681u);
        ((com.google.android.gms.internal.ads.d) this.f15845b).e(new g7(this, cVar, cVar2, callable, hVar, 2), new d0(executor, cVar, cVar2, hVar));
        return hVar.f18363a;
    }

    public abstract String c();

    public abstract void d();

    public abstract void e();

    public void f(r5.j jVar) {
        jVar.getClass();
        if (jVar == ((r5.j) ((pe.n) this.f15846c).getValue())) {
            this.f15844a.set(false);
        }
    }

    public void g(Executor executor) {
        boolean z3;
        if (((AtomicInteger) this.f15846c).get() > 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        y.k(z3);
        ((com.google.android.gms.internal.ads.d) this.f15845b).e(new ou1(this, 7, new ib.h()), executor);
    }

    public h() {
        this.f15846c = new AtomicInteger(0);
        this.f15844a = new AtomicBoolean(false);
        this.f15845b = new com.google.android.gms.internal.ads.d(5);
    }
}
