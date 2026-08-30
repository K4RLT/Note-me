package com.google.android.gms.internal.mlkit_vision_digital_ink;

/* loaded from: classes.dex */
public final class i9 implements Runnable {

    /* renamed from: u, reason: collision with root package name */
    public final n9 f14471u;

    /* renamed from: v, reason: collision with root package name */
    public final ya f14472v;

    public i9(n9 n9Var, ya yaVar) {
        this.f14471u = n9Var;
        this.f14472v = yaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f14471u.f14968u == this) {
            ya yaVar = this.f14472v;
            if (s9.A.y(this.f14471u, this, n9.h(yaVar))) {
                n9.r(this.f14471u, false);
            }
        }
    }
}
