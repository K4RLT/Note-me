package a6;

import a0.k0;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import pf.f1;

/* loaded from: classes.dex */
public final class k implements ac.b {

    /* renamed from: u, reason: collision with root package name */
    public final l6.j f279u = new Object();

    /* JADX WARN: Type inference failed for: r0v0, types: [l6.j, java.lang.Object] */
    public k(f1 f1Var) {
        f1Var.p(new k0(1, this));
    }

    @Override // ac.b
    public final void a(Runnable runnable, Executor executor) {
        this.f279u.a(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z3) {
        return this.f279u.cancel(z3);
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f279u.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f279u.f19962u instanceof l6.a;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f279u.isDone();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j10, TimeUnit timeUnit) {
        return this.f279u.get(j10, timeUnit);
    }
}
