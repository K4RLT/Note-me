package o6;
import d.b;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import q.x;

/* loaded from: classes.dex */
public final class p {
    public static final ExecutorService e = Executors.newCachedThreadPool(new a7.e());

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashSet f21835a = new LinkedHashSet(1);

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashSet f21836b = new LinkedHashSet(1);

    /* renamed from: c, reason: collision with root package name */
    public final Handler f21837c = new Handler(Looper.getMainLooper());

    /* renamed from: d, reason: collision with root package name */
    public volatile n f21838d = null;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.concurrent.FutureTask, o6.o, java.lang.Runnable] */
    public p(Callable callable) {
        ExecutorService executorService = e;
        FutureTask futureTask = new FutureTask(callable);
        futureTask.f21834u = this;
        executorService.execute(futureTask);
    }

    public final synchronized void a(m mVar) {
        Throwable th;
        try {
            n nVar = this.f21838d;
            if (nVar != null && (th = nVar.f21833b) != null) {
                mVar.onResult(th);
            }
            this.f21836b.add(mVar);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void b(m mVar) {
        a aVar;
        try {
            n nVar = this.f21838d;
            if (nVar != null && (aVar = nVar.f21832a) != null) {
                mVar.onResult(aVar);
            }
            this.f21835a.add(mVar);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void c() {
        n nVar = this.f21838d;
        if (nVar == null) {
            return;
        }
        a aVar = nVar.f21832a;
        int i = 0;
        if (aVar != null) {
            synchronized (this) {
                ArrayList arrayList = new ArrayList(this.f21835a);
                int size = arrayList.size();
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    ((m) obj).onResult(aVar);
                }
            }
            return;
        }
        Throwable th = nVar.f21833b;
        synchronized (this) {
            ArrayList arrayList2 = new ArrayList(this.f21836b);
            if (arrayList2.isEmpty()) {
                a7.b("Lottie encountered an error but no failure listener was added:", th);
                return;
            }
            int size2 = arrayList2.size();
            while (i < size2) {
                Object obj2 = arrayList2.get(i);
                i++;
                ((m) obj2).onResult(th);
            }
        }
    }

    public final void d(n nVar) {
        if (this.f21838d == null) {
            this.f21838d = nVar;
            if (Looper.myLooper() == Looper.getMainLooper()) {
                c();
                return;
            } else {
                this.f21837c.post(new a6.e(22, this));
                return;
            }
        }
        x.o("A task may only be set once.");
    }

    public p(a aVar) {
        d(new n(aVar));
    }
}