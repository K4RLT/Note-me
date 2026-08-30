package com.google.android.gms.internal.measurement;

import android.os.SystemClock;

/* loaded from: classes.dex */
public abstract class c1 implements Runnable {

    /* renamed from: u, reason: collision with root package name */
    public final long f13668u;

    /* renamed from: v, reason: collision with root package name */
    public final long f13669v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f13670w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ f1 f13671x;

    public c1(f1 f1Var, boolean z3) {
        this.f13671x = f1Var;
        f1Var.f13747b.getClass();
        this.f13668u = System.currentTimeMillis();
        f1Var.f13747b.getClass();
        this.f13669v = SystemClock.elapsedRealtime();
        this.f13670w = z3;
    }

    public abstract void a();

    public void b() {
    }

    @Override // java.lang.Runnable
    public final void run() {
        f1 f1Var = this.f13671x;
        if (f1Var.f13751g) {
            b();
            return;
        }
        try {
            a();
        } catch (Exception e) {
            f1Var.f(e, false, this.f13670w);
            b();
        }
    }
}
