package pf;

import java.util.concurrent.ScheduledFuture;

/* loaded from: classes.dex */
public final class m0 implements n0 {

    /* renamed from: u, reason: collision with root package name */
    public final ScheduledFuture f22770u;

    public m0(ScheduledFuture scheduledFuture) {
        this.f22770u = scheduledFuture;
    }

    @Override // pf.n0
    public final void a() {
        this.f22770u.cancel(false);
    }

    public final String toString() {
        return "DisposableFutureHandle[" + this.f22770u + ']';
    }
}
