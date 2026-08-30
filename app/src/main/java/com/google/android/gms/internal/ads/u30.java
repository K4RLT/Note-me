package com.google.android.gms.internal.ads;
import ac.b;
import j9.m;
import k9.a0;
import la.a;

import android.content.Context;
import android.os.SystemClock;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class u30 implements ai, c70, m, b70 {

    /* renamed from: u, reason: collision with root package name */
    public final q30 f11524u;

    /* renamed from: v, reason: collision with root package name */
    public final r30 f11525v;

    /* renamed from: x, reason: collision with root package name */
    public final qr f11527x;

    /* renamed from: y, reason: collision with root package name */
    public final Executor f11528y;

    /* renamed from: z, reason: collision with root package name */
    public final a f11529z;

    /* renamed from: w, reason: collision with root package name */
    public final HashSet f11526w = new HashSet();
    public final AtomicBoolean A = new AtomicBoolean(false);
    public final t30 B = new t30();
    public boolean C = false;
    public WeakReference D = new WeakReference(this);

    public u30(pr prVar, r30 r30Var, Executor executor, q30 q30Var, a aVar) {
        this.f11524u = q30Var;
        prVar.a();
        this.f11527x = new qr(0, prVar.f9590b);
        this.f11525v = r30Var;
        this.f11528y = executor;
        this.f11529z = aVar;
    }

    @Override // m
    public final void R0() {
    }

    @Override // m
    public final synchronized void T1() {
        this.B.f11234b = true;
        h();
    }

    public final void a() {
        Iterator it = this.f11526w.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            String str = "/untrackActiveViewUnit";
            String str2 = "/updateActiveView";
            q30 q30Var = this.f11524u;
            if (hasNext) {
                h00 h00Var = (h00) it.next();
                h00Var.X0("/updateActiveView", q30Var.e);
                h00Var.X0("/untrackActiveViewUnit", q30Var.f9729f);
            } else {
                pr prVar = q30Var.f9726b;
                p30 p30Var = q30Var.e;
                b bVar = prVar.f9590b;
                nr nrVar = new nr(str2, 0, p30Var);
                wx wxVar = xx.f12657h;
                c81 d02 = ed1.d0(bVar, nrVar, wxVar);
                prVar.f9590b = d02;
                prVar.f9590b = ed1.d0(d02, new nr(str, 0, q30Var.f9729f), wxVar);
                return;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.c70
    public final synchronized void c(Context context) {
        this.B.f11236d = "u";
        h();
        a();
        this.C = true;
    }

    @Override // m
    public final void d() {
    }

    @Override // m
    public final void g2() {
    }

    public final synchronized void h() {
        try {
            if (this.D.get() != null) {
                if (!this.C && this.A.get()) {
                    try {
                        t30 t30Var = this.B;
                        this.f11529z.getClass();
                        t30Var.f11235c = SystemClock.elapsedRealtime();
                        JSONObject r8 = this.f11525v.r(t30Var);
                        Iterator it = this.f11526w.iterator();
                        while (it.hasNext()) {
                            this.f11528y.execute(new t81(r8, 14, (h00) it.next()));
                        }
                        qr qrVar = this.f11527x;
                        qrVar.getClass();
                        mr mrVar = new mr(qrVar, 1, r8);
                        b bVar = qrVar.f9979b;
                        wx wxVar = xx.f12657h;
                        b81 c02 = ed1.c0(bVar, mrVar, wxVar);
                        c02.a(new t81(c02, 0, new q91("ActiveViewListener.callActiveViewJs", 6)), wxVar);
                        return;
                    } catch (Exception e) {
                        a0.l("Failed to call ActiveViewJS", e);
                        return;
                    }
                }
                return;
            }
            synchronized (this) {
                a();
                this.C = true;
            }
            return;
        } catch (Throwable th) {
            throw th;
        }
        throw th;
    }

    @Override // m
    public final void i4(int i) {
    }

    @Override // com.google.android.gms.internal.ads.ai
    public final synchronized void k(zh zhVar) {
        t30 t30Var = this.B;
        t30Var.f11233a = zhVar.f13171j;
        t30Var.e = zhVar;
        h();
    }

    @Override // com.google.android.gms.internal.ads.c70
    public final synchronized void o(Context context) {
        this.B.f11234b = true;
        h();
    }

    @Override // m
    public final void o3() {
    }

    @Override // m
    public final void r0() {
    }

    @Override // m
    public final void t1() {
    }

    @Override // m
    public final void u2() {
    }

    @Override // m
    public final synchronized void v2() {
        this.B.f11234b = false;
        h();
    }

    @Override // com.google.android.gms.internal.ads.c70
    public final synchronized void w(Context context) {
        this.B.f11234b = false;
        h();
    }

    @Override // com.google.android.gms.internal.ads.b70
    public final synchronized void y() {
        if (this.A.compareAndSet(false, true)) {
            q30 q30Var = this.f11524u;
            pr prVar = q30Var.f9726b;
            p30 p30Var = q30Var.e;
            prVar.a();
            b bVar = prVar.f9590b;
            mr mrVar = new mr("/updateActiveView", 0, p30Var);
            wx wxVar = xx.f12657h;
            prVar.f9590b = ed1.c0(bVar, mrVar, wxVar);
            p30 p30Var2 = q30Var.f9729f;
            prVar.a();
            prVar.f9590b = ed1.c0(prVar.f9590b, new mr("/untrackActiveViewUnit", 0, p30Var2), wxVar);
            q30Var.f9728d = this;
            h();
        }
    }

    @Override // m
    public final void z1() {
    }
}
