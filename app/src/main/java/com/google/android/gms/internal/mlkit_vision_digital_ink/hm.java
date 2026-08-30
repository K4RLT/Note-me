package com.google.android.gms.internal.mlkit_vision_digital_ink;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class hm implements ya {

    /* renamed from: u, reason: collision with root package name */
    public final WeakReference f14427u;

    /* renamed from: v, reason: collision with root package name */
    public final gm f14428v = new gm(this);

    public hm(fm fmVar) {
        this.f14427u = new WeakReference(fmVar);
    }

    public final boolean b(Throwable th) {
        zl zlVar = new zl(th);
        tl tlVar = em.f14257z;
        gm gmVar = this.f14428v;
        if (tlVar.v(gmVar, null, zlVar)) {
            em.c(gmVar);
            return true;
        }
        return false;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z3) {
        fm fmVar = (fm) this.f14427u.get();
        boolean cancel = this.f14428v.cancel(z3);
        if (cancel && fmVar != null) {
            fmVar.f14306a = null;
            fmVar.f14307b = null;
            fmVar.f14308c.i();
            return true;
        }
        return cancel;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.ya
    public final void g(Runnable runnable, Executor executor) {
        this.f14428v.g(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f14428v.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f14428v.f14258u instanceof xl;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f14428v.isDone();
    }

    public final String toString() {
        return this.f14428v.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j10, TimeUnit timeUnit) {
        return this.f14428v.get(j10, timeUnit);
    }
}
