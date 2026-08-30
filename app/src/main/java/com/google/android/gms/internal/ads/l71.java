package com.google.android.gms.internal.ads;
import ac.b;

/* loaded from: classes.dex */
public final class l71 implements Runnable {

    /* renamed from: u, reason: collision with root package name */
    public final r71 f7966u;

    /* renamed from: v, reason: collision with root package name */
    public final ac.b f7967v;

    public l71(r71 r71Var, ac.b bVar) {
        this.f7966u = r71Var;
        this.f7967v = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f7966u.f13105u == this) {
            ac.b bVar = this.f7967v;
            if (z71.A.T(this.f7966u, this, r71.i(bVar))) {
                r71.q(this.f7966u, false);
            }
        }
    }
}
