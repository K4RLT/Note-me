package g5;

import com.google.android.gms.internal.ads.pu1;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class d0 implements Executor {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f17428u;

    /* renamed from: v, reason: collision with root package name */
    public final Object f17429v;

    /* renamed from: w, reason: collision with root package name */
    public final Executor f17430w;

    /* renamed from: x, reason: collision with root package name */
    public Object f17431x;

    /* renamed from: y, reason: collision with root package name */
    public final Object f17432y;

    public d0(Executor executor, int i) {
        this.f17428u = i;
        switch (i) {
            case 1:
                this.f17430w = executor;
                this.f17429v = new ArrayDeque();
                this.f17432y = new Object();
                return;
            default:
                executor.getClass();
                this.f17430w = executor;
                this.f17429v = new ArrayDeque();
                this.f17432y = new Object();
                return;
        }
    }

    public void a() {
        switch (this.f17428u) {
            case 0:
                synchronized (this.f17432y) {
                    Object poll = ((ArrayDeque) this.f17429v).poll();
                    Runnable runnable = (Runnable) poll;
                    this.f17431x = runnable;
                    if (poll != null) {
                        this.f17430w.execute(runnable);
                    }
                }
                return;
            default:
                Runnable runnable2 = (Runnable) ((ArrayDeque) this.f17429v).poll();
                this.f17431x = runnable2;
                if (runnable2 != null) {
                    this.f17430w.execute(runnable2);
                    return;
                }
                return;
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f17428u) {
            case 0:
                runnable.getClass();
                synchronized (this.f17432y) {
                    ((ArrayDeque) this.f17429v).offer(new b6.g(runnable, 8, this));
                    if (((Runnable) this.f17431x) == null) {
                        a();
                    }
                }
                return;
            case 1:
                synchronized (this.f17432y) {
                    try {
                        ((ArrayDeque) this.f17429v).add(new pu1(this, 18, runnable));
                        if (((Runnable) this.f17431x) == null) {
                            a();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            default:
                try {
                    this.f17430w.execute(runnable);
                    return;
                } catch (RuntimeException e) {
                    if (((ib.o) ((pd.c) this.f17429v).f22681u).k()) {
                        ((pd.c) this.f17431x).h();
                    } else {
                        ((ib.h) this.f17432y).a(e);
                    }
                    throw e;
                }
        }
    }

    public /* synthetic */ d0(Executor executor, pd.c cVar, pd.c cVar2, ib.h hVar) {
        this.f17428u = 2;
        this.f17430w = executor;
        this.f17429v = cVar;
        this.f17431x = cVar2;
        this.f17432y = hVar;
    }
}
