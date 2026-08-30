package ug;
import a.a;

import android.content.res.TypedArray;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import p5.c;
import q.x;

/* loaded from: classes.dex */
public abstract class a {
    public static Object a(Class cls, InvocationHandler invocationHandler) {
        if (invocationHandler == null) {
            return null;
        }
        return cls.cast(Proxy.newProxyInstance(a.class.getClassLoader(), new Class[]{cls}, invocationHandler));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(c cVar, Throwable th) {
        boolean isTerminated;
        if (cVar != 0) {
            if (th == null) {
                if (cVar instanceof AutoCloseable) {
                    cVar.close();
                    return;
                }
                if (cVar instanceof ExecutorService) {
                    ExecutorService executorService = (ExecutorService) cVar;
                    if (executorService != ForkJoinPool.commonPool() && !(isTerminated = executorService.isTerminated())) {
                        executorService.shutdown();
                        boolean z3 = false;
                        while (!isTerminated) {
                            try {
                                isTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                            } catch (InterruptedException unused) {
                                if (!z3) {
                                    executorService.shutdownNow();
                                    z3 = true;
                                }
                            }
                        }
                        if (z3) {
                            Thread.currentThread().interrupt();
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (cVar instanceof TypedArray) {
                    ((TypedArray) cVar).recycle();
                    return;
                }
                if (cVar instanceof MediaMetadataRetriever) {
                    ((MediaMetadataRetriever) cVar).release();
                    return;
                } else if (cVar instanceof MediaDrm) {
                    ((MediaDrm) cVar).release();
                    return;
                } else {
                    x.m();
                    return;
                }
            }
            try {
                a5.a.v(cVar);
            } catch (Throwable th2) {
                pe.a.a(th, th2);
            }
        }
    }
}
