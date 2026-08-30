package wa;
import fa.y;
import g5.q;
import q.x;
import z5.h;

import android.os.Looper;
import com.google.android.gms.internal.ads.pu1;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
public abstract class h8 {
    public static Object a(ib.o oVar) {
        y.g("Must not be called on the main application thread");
        Looper myLooper = Looper.myLooper();
        if (myLooper != null && Objects.equals(myLooper.getThread().getName(), "GoogleApiHandler")) {
            x.o("Must not be called on GoogleApiHandler thread.");
            return null;
        }
        y.i(oVar, "Task must not be null");
        if (oVar.k()) {
            return h(oVar);
        }
        h hVar = new h(22);
        Executor executor = ib.i.f18365b;
        oVar.f(executor, hVar);
        oVar.e(executor, hVar);
        oVar.a(executor, hVar);
        ((CountDownLatch) hVar.f31922v).await();
        return h(oVar);
    }

    public static Object b(ib.o oVar, long j10, TimeUnit timeUnit) {
        y.g("Must not be called on the main application thread");
        Looper myLooper = Looper.myLooper();
        if (myLooper != null && Objects.equals(myLooper.getThread().getName(), "GoogleApiHandler")) {
            x.o("Must not be called on GoogleApiHandler thread.");
            return null;
        }
        y.i(oVar, "Task must not be null");
        y.i(timeUnit, "TimeUnit must not be null");
        if (oVar.k()) {
            return h(oVar);
        }
        h hVar = new h(22);
        Executor executor = ib.i.f18365b;
        oVar.f(executor, hVar);
        oVar.e(executor, hVar);
        oVar.a(executor, hVar);
        if (((CountDownLatch) hVar.f31922v).await(j10, timeUnit)) {
            return h(oVar);
        }
        throw new TimeoutException("Timed out waiting for Task");
    }

    public static ib.o c(Callable callable, Executor executor) {
        y.i(executor, "Executor must not be null");
        ib.o oVar = new ib.o();
        executor.execute(new pu1(oVar, 17, callable));
        return oVar;
    }

    public static ib.o d(Exception exc) {
        ib.o oVar = new ib.o();
        oVar.o(exc);
        return oVar;
    }

    public static ib.o e(Object obj) {
        ib.o oVar = new ib.o();
        oVar.p(obj);
        return oVar;
    }

    public static ib.o f(List list) {
        if (list != null && !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((ib.o) it.next()) == null) {
                    q.h("null tasks are not accepted");
                    return null;
                }
            }
            ib.o oVar = new ib.o();
            ib.j jVar = new ib.j(list.size(), oVar);
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                ib.o oVar2 = (ib.o) it2.next();
                fc.d dVar = ib.i.f18365b;
                oVar2.f(dVar, jVar);
                oVar2.e(dVar, jVar);
                oVar2.a(dVar, jVar);
            }
            return oVar;
        }
        return e(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, pd.c, ib.a] */
    public static ib.o g(ib.o... oVarArr) {
        if (oVarArr.length == 0) {
            return e(Collections.EMPTY_LIST);
        }
        List asList = Arrays.asList(oVarArr);
        eb.z1 z1Var = ib.i.f18364a;
        if (asList != null && !asList.isEmpty()) {
            List list = asList;
            ib.o f10 = f(list);
            Object obj = new Object();
            obj.f22681u = list;
            return f10.h(z1Var, obj);
        }
        return e(Collections.EMPTY_LIST);
    }

    public static Object h(ib.o oVar) {
        if (oVar.l()) {
            return oVar.j();
        }
        if (oVar.f18384d) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(oVar.i());
    }
}