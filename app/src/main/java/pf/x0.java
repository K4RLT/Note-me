package pf;
import b0.h;

import com.google.android.gms.internal.ads.ou1;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class x0 extends w0 implements g0 {

    /* renamed from: w, reason: collision with root package name */
    public final Executor f22805w;

    public x0(Executor executor) {
        this.f22805w = executor;
        if (executor instanceof ScheduledThreadPoolExecutor) {
            ((ScheduledThreadPoolExecutor) executor).setRemoveOnCancelPolicy(true);
        }
    }

    @Override // pf.g0
    public final n0 A(long j10, Runnable runnable, te.g gVar) {
        ScheduledExecutorService scheduledExecutorService;
        Executor executor = this.f22805w;
        ScheduledFuture<?> scheduledFuture = null;
        if (executor instanceof ScheduledExecutorService) {
            scheduledExecutorService = (ScheduledExecutorService) executor;
        } else {
            scheduledExecutorService = null;
        }
        if (scheduledExecutorService != null) {
            try {
                scheduledFuture = scheduledExecutorService.schedule(runnable, j10, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e) {
                CancellationException cancellationException = new CancellationException("The task was rejected");
                cancellationException.initCause(e);
                h(gVar, cancellationException);
            }
        }
        if (scheduledFuture != null) {
            return new m0(scheduledFuture);
        }
        return c0.D.A(j10, runnable, gVar);
    }

    @Override // pf.g0
    public final void K(long j10, l lVar) {
        ScheduledExecutorService scheduledExecutorService;
        Executor executor = this.f22805w;
        ScheduledFuture<?> scheduledFuture = null;
        if (executor instanceof ScheduledExecutorService) {
            scheduledExecutorService = (ScheduledExecutorService) executor;
        } else {
            scheduledExecutorService = null;
        }
        if (scheduledExecutorService != null) {
            ou1 ou1Var = new ou1(this, 25, lVar);
            te.g gVar = lVar.f22766y;
            try {
                scheduledFuture = scheduledExecutorService.schedule(ou1Var, j10, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e) {
                CancellationException cancellationException = new CancellationException("The task was rejected");
                cancellationException.initCause(e);
                h(gVar, cancellationException);
            }
        }
        if (scheduledFuture != null) {
            lVar.v(new i(0, scheduledFuture));
        } else {
            c0.D.K(j10, lVar);
        }
    }

    @Override // pf.v
    public final void W(te.g gVar, Runnable runnable) {
        try {
            this.f22805w.execute(runnable);
        } catch (RejectedExecutionException e) {
            CancellationException cancellationException = new CancellationException("The task was rejected");
            cancellationException.initCause(e);
            h(gVar, cancellationException);
            wf.e eVar = l0.f22767a;
            wf.d.f29913w.W(gVar, runnable);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ExecutorService executorService;
        Executor executor = this.f22805w;
        if (executor instanceof ExecutorService) {
            executorService = (ExecutorService) executor;
        } else {
            executorService = null;
        }
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof x0) && ((x0) obj).f22805w == this.f22805w) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f22805w);
    }

    @Override // pf.v
    public final String toString() {
        return this.f22805w.toString();
    }
}
