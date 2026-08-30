package com.google.android.gms.internal.mlkit_vision_digital_ink;
import g2.a;
import g9.n;
import j6.c;
import q1.b;
import y2.b;

import com.google.android.gms.internal.ads.iv1;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class s0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f14945a;

    /* renamed from: b, reason: collision with root package name */
    public final w9 f14946b;

    /* renamed from: c, reason: collision with root package name */
    public final com.google.android.gms.internal.consent_sdk.c f14947c;

    /* renamed from: d, reason: collision with root package name */
    public final c f14948d;
    public final n e;

    /* renamed from: f, reason: collision with root package name */
    public final n f14949f = new n(new gw(this));

    /* renamed from: g, reason: collision with root package name */
    public final Object f14950g;

    /* renamed from: h, reason: collision with root package name */
    public final jm f14951h;
    public List i;

    public s0(com.google.android.gms.internal.consent_sdk.c cVar, w9 w9Var) {
        Object obj = new Object();
        this.f14950g = obj;
        this.i = new ArrayList();
        this.f14947c = cVar;
        this.f14946b = w9Var;
        this.f14945a = (String) cVar.f13371v;
        this.e = new n(new z0(cVar, 0));
        this.f14948d = new c(11);
        this.f14951h = new jm(12);
        e1 e1Var = new e1(this, 0);
        synchronized (obj) {
            this.i.add(e1Var);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8, types: [com.google.android.gms.internal.mlkit_vision_digital_ink.ya] */
    public final ya a() {
        w9 w9Var;
        b(i2.f14454a);
        n nVar = this.f14949f;
        if (((fb) nVar.A).isDone()) {
            w9Var = this.f14947c.g();
        } else {
            String concat = "Get ".concat(String.valueOf(this.f14945a));
            this.f14951h.getClass();
            x1 e = jm.e(concat);
            try {
                n9 z3 = nVar.z();
                e1 e1Var = new e1(this, 1);
                int i = g2.f14354a;
                w9 q10 = n5.q(z3, new r0(b(), 3, e1Var), ia.f14473u);
                e.f(q10);
                e.close();
                w9Var = q10;
            } catch (Throwable th) {
                try {
                    e.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        n5.n(this.f14946b);
        return n5.n(w9Var);
    }

    /* JADX WARN: Type inference failed for: r0v18, types: [com.google.android.gms.internal.mlkit_vision_digital_ink.m2, java.lang.Object] */
    public final x9 b(m2 m2Var, Executor executor) {
        p0 p0Var = new p0(1, m2Var);
        int i = g2.f14354a;
        int i10 = 3;
        r0 r0Var = new r0(b(), i10, p0Var);
        b(i2.f14454a);
        String concat = "Update ".concat(String.valueOf(this.f14945a));
        this.f14951h.getClass();
        x1 e = jm.e(concat);
        try {
            n9 z3 = this.f14949f.z();
            c cVar = this.f14948d;
            s5 s5Var = new s5(5, z3);
            ia iaVar = ia.f14473u;
            cVar.p(s5Var, iaVar);
            try {
                ya p10 = cVar.p(a(new b1(this, z3, r0Var, executor, 1)), iaVar);
                if (!z3.isDone()) {
                    if (p10.isDone()) {
                        if (p10 instanceof n9) {
                            ((n9) p10).l(z3);
                        } else if (p10.isCancelled()) {
                            z3.cancel(false);
                        }
                    } else {
                        iv1 iv1Var = new iv1(i10);
                        iv1Var.f7236v = p10;
                        iv1Var.f7237w = z3;
                        p10.g(iv1Var, iaVar);
                        z3.g(iv1Var, iaVar);
                    }
                }
                n5.n(this.f14946b);
                x9 p11 = n5.p(p10, new Object(), iaVar);
                e.f(p11);
                e.close();
                return p11;
            } catch (Throwable th) {
                th = th;
                Throwable th2 = th;
                try {
                    e.close();
                    throw th2;
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                    throw th2;
                }
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }
}
