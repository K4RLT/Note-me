package jc;

import com.google.android.gms.internal.ads.ou1;
import fa.y;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class k implements Executor {

    /* renamed from: z, reason: collision with root package name */
    public static final Logger f19151z = Logger.getLogger(k.class.getName());

    /* renamed from: u, reason: collision with root package name */
    public final Executor f19152u;

    /* renamed from: v, reason: collision with root package name */
    public final ArrayDeque f19153v = new ArrayDeque();

    /* renamed from: w, reason: collision with root package name */
    public int f19154w = 1;

    /* renamed from: x, reason: collision with root package name */
    public long f19155x = 0;

    /* renamed from: y, reason: collision with root package name */
    public final ou1 f19156y = new ou1(this, 20);

    public k(Executor executor) {
        y.h(executor);
        this.f19152u = executor;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        y.h(runnable);
        synchronized (this.f19153v) {
            int i = this.f19154w;
            if (i != 4 && i != 3) {
                long j10 = this.f19155x;
                j jVar = new j(0, runnable);
                this.f19153v.add(jVar);
                this.f19154w = 2;
                try {
                    this.f19152u.execute(this.f19156y);
                    if (this.f19154w == 2) {
                        synchronized (this.f19153v) {
                            try {
                                if (this.f19155x == j10 && this.f19154w == 2) {
                                    this.f19154w = 3;
                                }
                            } finally {
                            }
                        }
                        return;
                    }
                    return;
                } catch (Error | RuntimeException e) {
                    synchronized (this.f19153v) {
                        try {
                            int i10 = this.f19154w;
                            boolean z3 = true;
                            if ((i10 != 1 && i10 != 2) || !this.f19153v.removeLastOccurrence(jVar)) {
                                z3 = false;
                            }
                            if (!(e instanceof RejectedExecutionException) || z3) {
                                throw e;
                            }
                        } finally {
                        }
                    }
                    return;
                }
            }
            this.f19153v.add(runnable);
        }
    }

    public final String toString() {
        return "SequentialExecutor@" + System.identityHashCode(this) + "{" + this.f19152u + "}";
    }
}
