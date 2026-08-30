package o6;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/* loaded from: classes.dex */
public final class o extends FutureTask {

    /* renamed from: u, reason: collision with root package name */
    public p f21834u;

    @Override // java.util.concurrent.FutureTask
    public final void done() {
        try {
            if (isCancelled()) {
                return;
            }
            try {
                this.f21834u.d((n) get());
            } catch (InterruptedException | ExecutionException e) {
                this.f21834u.d(new n(e));
            }
        } finally {
            this.f21834u = null;
        }
    }
}
