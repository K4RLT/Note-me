package pf;
import b0.o;

import java.util.concurrent.ScheduledFuture;

/* loaded from: classes.dex */
public final class i implements j {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f22752u;

    /* renamed from: v, reason: collision with root package name */
    public final Object f22753v;

    public /* synthetic */ i(int i, Object obj) {
        this.f22752u = i;
        this.f22753v = obj;
    }

    @Override // pf.j
    public final void b(Throwable th) {
        switch (this.f22752u) {
            case 0:
                ((ScheduledFuture) this.f22753v).cancel(false);
                return;
            case 1:
                ((df.l) this.f22753v).invoke(th);
                return;
            default:
                ((n0) this.f22753v).a();
                return;
        }
    }

    public final String toString() {
        switch (this.f22752u) {
            case 0:
                return "CancelFutureOnCancel[" + ((ScheduledFuture) this.f22753v) + ']';
            case 1:
                return "CancelHandler.UserSupplied[" + ((df.l) this.f22753v).getClass().getSimpleName() + '@' + o(this) + ']';
            default:
                return "DisposeOnCancel[" + ((n0) this.f22753v) + ']';
        }
    }
}
