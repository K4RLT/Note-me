package com.google.android.gms.internal.ads;
import pf.b0;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class kd0 {

    /* renamed from: a, reason: collision with root package name */
    public final gx0 f7718a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f7719b = new AtomicBoolean(false);

    /* renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f7720c = new AtomicBoolean(false);

    public kd0(gx0 gx0Var) {
        this.f7718a = gx0Var;
    }

    public final void a(mf mfVar) {
        this.f7720c.set(true);
        synchronized (mfVar.f8337v) {
            try {
                if (((gi) mfVar.f8338w) == null) {
                    mfVar.f8338w = new gi();
                }
                gi giVar = (gi) mfVar.f8338w;
                synchronized (giVar.f6402w) {
                    giVar.A.add(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        gx0 gx0Var = this.f7718a;
        gx0Var.getClass();
        b0.x(gx0Var.f6491a, null, new ww0(gx0Var, null, 3), 3);
    }

    public final void b() {
        if (this.f7719b.get()) {
            gx0 gx0Var = this.f7718a;
            gx0Var.getClass();
            x21.n(gx0Var.f6491a, gx0Var.f6492b, new ww0(gx0Var, null, 5));
        }
    }

    public final void c() {
        if (this.f7719b.get()) {
            gx0 gx0Var = this.f7718a;
            gx0Var.getClass();
            x21.n(gx0Var.f6491a, gx0Var.f6492b, new ww0(gx0Var, null, 0));
        }
    }

    public final void d() {
        if (!this.f7719b.getAndSet(false)) {
            return;
        }
        gx0 gx0Var = this.f7718a;
        gx0Var.getClass();
        x21.n(gx0Var.f6491a, gx0Var.f6492b, new ww0(gx0Var, null, 4));
    }
}
