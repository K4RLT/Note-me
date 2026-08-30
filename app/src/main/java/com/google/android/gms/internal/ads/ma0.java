package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Set;

/* loaded from: classes.dex */
public final /* synthetic */ class ma0 implements Runnable {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f8290u = 1;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f8291v;

    /* renamed from: w, reason: collision with root package name */
    public final int f8292w;

    /* renamed from: x, reason: collision with root package name */
    public final Object f8293x;

    /* renamed from: y, reason: collision with root package name */
    public final Object f8294y;

    public ma0(b6.h hVar, b6.n nVar, boolean z3, int i) {
        hVar.getClass();
        nVar.getClass();
        this.f8293x = hVar;
        this.f8294y = nVar;
        this.f8291v = z3;
        this.f8292w = i;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [com.google.android.gms.internal.ads.ph, com.google.android.gms.internal.ads.mb0] */
    /* JADX WARN: Type inference failed for: r1v2, types: [com.google.android.gms.internal.ads.ph, com.google.android.gms.internal.ads.mb0] */
    /* JADX WARN: Type inference failed for: r1v3, types: [com.google.android.gms.internal.ads.ph, com.google.android.gms.internal.ads.mb0] */
    @Override // java.lang.Runnable
    public final void run() {
        boolean d2;
        b6.v b10;
        switch (this.f8290u) {
            case 0:
                na0 na0Var = (na0) this.f8293x;
                View view = (View) this.f8294y;
                boolean z3 = this.f8291v;
                int i = this.f8292w;
                Object r12 = na0Var.f8625w;
                if (r12 == 0) {
                    int i10 = k9.a0.f19634b;
                    l9.i.a("Ad should be associated with an ad view before calling performClickForCustomGesture()");
                    return;
                } else {
                    na0Var.f8616n.o(view, r12.M0(), na0Var.f8625w.d(), na0Var.f8625w.g(), z3, na0Var.k(), i);
                    return;
                }
            default:
                boolean z9 = this.f8291v;
                b6.h hVar = (b6.h) this.f8293x;
                b6.n nVar = (b6.n) this.f8294y;
                if (z9) {
                    int i11 = this.f8292w;
                    hVar.getClass();
                    String str = nVar.f1759a.f18928a;
                    synchronized (hVar.f1746k) {
                        b10 = hVar.b(str);
                    }
                    d2 = b6.h.d(str, b10, i11);
                } else {
                    int i12 = this.f8292w;
                    hVar.getClass();
                    String str2 = nVar.f1759a.f18928a;
                    synchronized (hVar.f1746k) {
                        try {
                            if (hVar.f1742f.get(str2) != null) {
                                a6.q.d().a(b6.h.f1737l, "Ignored stopWork. WorkerWrapper " + str2 + " is in foreground");
                            } else {
                                Set set = (Set) hVar.f1744h.get(str2);
                                if (set != null && set.contains(nVar)) {
                                    d2 = b6.h.d(str2, hVar.b(str2), i12);
                                }
                            }
                            d2 = false;
                        } finally {
                        }
                    }
                }
                a6.q.d().a(a6.q.f("StopWorkRunnable"), "StopWorkRunnable for " + ((b6.n) this.f8294y).f1759a.f18928a + "; Processor.stopWork = " + d2);
                return;
        }
    }

    public /* synthetic */ ma0(na0 na0Var, View view, boolean z3, int i) {
        this.f8293x = na0Var;
        this.f8294y = view;
        this.f8291v = z3;
        this.f8292w = i;
    }
}
