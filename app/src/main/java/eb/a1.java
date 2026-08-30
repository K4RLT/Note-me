package eb;

import android.os.Process;
import java.util.concurrent.BlockingQueue;

/* loaded from: classes.dex */
public final class a1 extends Thread {

    /* renamed from: u, reason: collision with root package name */
    public final Object f16052u;

    /* renamed from: v, reason: collision with root package name */
    public final BlockingQueue f16053v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f16054w = false;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ y0 f16055x;

    public a1(y0 y0Var, String str, BlockingQueue blockingQueue) {
        this.f16055x = y0Var;
        fa.y.h(blockingQueue);
        this.f16052u = new Object();
        this.f16053v = blockingQueue;
        setName(str);
    }

    public final void a(InterruptedException interruptedException) {
        this.f16055x.f().D.f(interruptedException, getName() + " was interrupted");
    }

    public final void b() {
        synchronized (this.f16055x.D) {
            try {
                if (!this.f16054w) {
                    this.f16055x.E.release();
                    this.f16055x.D.notifyAll();
                    y0 y0Var = this.f16055x;
                    if (this == y0Var.f16458x) {
                        y0Var.f16458x = null;
                    } else if (this == y0Var.f16459y) {
                        y0Var.f16459y = null;
                    } else {
                        y0Var.f().A.g("Current scheduler thread is neither worker nor network");
                    }
                    this.f16054w = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        int i;
        boolean z3 = false;
        while (!z3) {
            try {
                this.f16055x.E.acquire();
                z3 = true;
            } catch (InterruptedException e) {
                a(e);
            }
        }
        try {
            int threadPriority = Process.getThreadPriority(Process.myTid());
            while (true) {
                b1 b1Var = (b1) this.f16053v.poll();
                if (b1Var != null) {
                    if (b1Var.f16064v) {
                        i = threadPriority;
                    } else {
                        i = 10;
                    }
                    Process.setThreadPriority(i);
                    b1Var.run();
                } else {
                    synchronized (this.f16052u) {
                        if (this.f16053v.peek() == null) {
                            try {
                                this.f16052u.wait(30000L);
                            } catch (InterruptedException e8) {
                                a(e8);
                            }
                        }
                    }
                    synchronized (this.f16055x.D) {
                        if (this.f16053v.peek() == null) {
                            b();
                            b();
                            return;
                        }
                    }
                }
            }
        } catch (Throwable th) {
            b();
            throw th;
        }
    }
}
