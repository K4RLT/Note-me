package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public abstract class lx1 extends hx1 {
    public final HashMap i = new HashMap();

    /* renamed from: j, reason: collision with root package name */
    public Handler f8178j;

    @Override // com.google.android.gms.internal.ads.hx1
    public final void g() {
        for (kx1 kx1Var : this.i.values()) {
            kx1Var.f7897a.o(kx1Var.f7898b);
        }
    }

    @Override // com.google.android.gms.internal.ads.hx1
    public final void i() {
        for (kx1 kx1Var : this.i.values()) {
            kx1Var.f7897a.p(kx1Var.f7898b);
        }
    }

    @Override // com.google.android.gms.internal.ads.hx1
    public void j() {
        HashMap hashMap = this.i;
        for (kx1 kx1Var : hashMap.values()) {
            hx1 hx1Var = kx1Var.f7897a;
            hx1Var.q(kx1Var.f7898b);
            jx1 jx1Var = kx1Var.f7899c;
            hx1Var.l(jx1Var);
            hx1Var.m(jx1Var);
        }
        hashMap.clear();
    }

    @Override // com.google.android.gms.internal.ads.hx1
    public void r() {
        Iterator it = this.i.values().iterator();
        while (it.hasNext()) {
            ((kx1) it.next()).f7897a.r();
        }
    }

    public abstract void s(Object obj, hx1 hx1Var, uh uhVar);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [com.google.android.gms.internal.ads.ix1, com.google.android.gms.internal.ads.zx1] */
    public final void t(final Integer num, hx1 hx1Var) {
        HashMap hashMap = this.i;
        b80.l(!hashMap.containsKey(num));
        com.google.android.gms.internal.ads.zx1 r12 = new zx1() { // from class: com.google.android.gms.internal.ads.ix1
            @Override // com.google.android.gms.internal.ads.zx1
            public final /* synthetic */ void a(hx1 hx1Var2, uh uhVar) {
                lx1.this.s(num, hx1Var2, uhVar);
            }
        };
        jx1 jx1Var = new jx1(this, num);
        hashMap.put(num, new kx1(hx1Var, r12, jx1Var));
        Handler handler = this.f8178j;
        handler.getClass();
        i0.m mVar = hx1Var.f6917c;
        mVar.getClass();
        ((CopyOnWriteArrayList) mVar.f18054v).add(new ay1(handler, jx1Var));
        this.f8178j.getClass();
        z11 z11Var = hx1Var.f6918d;
        z11Var.getClass();
        ((CopyOnWriteArrayList) z11Var.f13047w).add(new jw1(jx1Var));
        tu1 tu1Var = this.f6920g;
        tu1Var.getClass();
        a0 a0Var = this.f6921h;
        a0Var.getClass();
        hx1Var.n(r12, tu1Var, a0Var);
        if (this.f6916b.isEmpty()) {
            hx1Var.p(r12);
        }
    }

    public abstract yx1 v(Object obj, yx1 yx1Var);

    public void u(Object obj) {
    }

    public void w(long j10, Object obj) {
    }
}
