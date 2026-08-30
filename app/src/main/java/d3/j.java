package d3;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class j implements ac.b {

    /* renamed from: u, reason: collision with root package name */
    public final WeakReference f15722u;

    /* renamed from: v, reason: collision with root package name */
    public final i f15723v = new i(this);

    public j(h hVar) {
        this.f15722u = new WeakReference(hVar);
    }

    @Override // ac.b
    public final void a(Runnable runnable, Executor executor) {
        this.f15723v.a(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z3) {
        h hVar = (h) this.f15722u.get();
        boolean cancel = this.f15723v.cancel(z3);
        if (cancel && hVar != null) {
            hVar.f15718a = null;
            hVar.f15719b = null;
            hVar.f15720c.l(null);
        }
        return cancel;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f15723v.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f15723v.f15715u instanceof a;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f15723v.isDone();
    }

    public final String toString() {
        return this.f15723v.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j10, TimeUnit timeUnit) {
        return this.f15723v.get(j10, timeUnit);
    }
}
