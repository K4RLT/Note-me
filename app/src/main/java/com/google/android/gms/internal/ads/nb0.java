package com.google.android.gms.internal.ads;
import ac.b;
import g9.r;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class nb0 implements b70 {

    /* renamed from: u, reason: collision with root package name */
    public final ra0 f8637u;

    /* renamed from: v, reason: collision with root package name */
    public final sa0 f8638v;

    /* renamed from: w, reason: collision with root package name */
    public final Executor f8639w;

    /* renamed from: x, reason: collision with root package name */
    public final Executor f8640x;

    public nb0(ra0 ra0Var, sa0 sa0Var, Executor executor, wx wxVar) {
        this.f8637u = ra0Var;
        this.f8638v = sa0Var;
        this.f8639w = executor;
        this.f8640x = wxVar;
    }

    @Override // com.google.android.gms.internal.ads.b70
    public final void y() {
        b bVar;
        b bVar2;
        yx yxVar;
        if (this.f8638v.e) {
            ra0 ra0Var = this.f8637u;
            bi0 k3 = ra0Var.k();
            if (k3 == null) {
                synchronized (ra0Var) {
                    bVar = ra0Var.f10175m;
                }
                if (bVar != null && ((Boolean) r.e.f17698c.a(sl.f10871o6)).booleanValue()) {
                    synchronized (ra0Var) {
                        bVar2 = ra0Var.f10175m;
                    }
                    synchronized (ra0Var) {
                        yxVar = ra0Var.f10176n;
                    }
                    if (bVar2 != null && yxVar != null) {
                        k81 k81Var = new k81(d51.v(new b[]{bVar2, yxVar}), false);
                        k81Var.a(new t81(k81Var, 0, new jk0(18, this)), this.f8640x);
                        return;
                    }
                    return;
                }
            }
            if (k3 != null) {
                h00 j10 = ra0Var.j();
                h00 h3 = ra0Var.h();
                if (j10 == null) {
                    if (h3 == null) {
                        j10 = null;
                    } else {
                        j10 = h3;
                    }
                }
                if (j10 != null) {
                    this.f8639w.execute(new p00(j10, 5));
                }
            }
        }
    }
}
