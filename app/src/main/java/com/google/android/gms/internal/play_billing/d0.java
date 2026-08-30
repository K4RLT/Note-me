package com.google.android.gms.internal.play_billing;

/* loaded from: classes.dex */
public final class d0 implements Runnable {

    /* renamed from: u, reason: collision with root package name */
    public final t0 f15400u;

    /* renamed from: v, reason: collision with root package name */
    public final r0 f15401v;

    public d0(t0 t0Var, r0 r0Var) {
        this.f15400u = t0Var;
        this.f15401v = r0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f15400u.f15473u == this) {
            r0 r0Var = this.f15401v;
            if (k0.A.f(this.f15400u, this, t0.h(r0Var))) {
                t0.j(this.f15400u);
            }
        }
    }
}
