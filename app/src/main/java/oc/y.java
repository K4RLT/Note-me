package oc;
import g.a;

import android.os.Looper;
import androidx.datastore.preferences.protobuf.s1;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
public abstract class y {

    /* renamed from: a, reason: collision with root package name */
    public static final ExecutorService f21955a = a("awaitEvenIfOnMainThread task continuation executor");

    public static Object a(ib.o oVar) {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        oVar.g(f21955a, new b1.h(17, countDownLatch));
        Looper mainLooper = Looper.getMainLooper();
        Looper myLooper = Looper.myLooper();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        if (mainLooper == myLooper) {
            countDownLatch.await(3L, timeUnit);
        } else {
            countDownLatch.await(4L, timeUnit);
        }
        if (oVar.l()) {
            return oVar.j();
        }
        if (!oVar.f18384d) {
            if (oVar.k()) {
                s1.r(oVar.i());
                return null;
            }
            throw new TimeoutException();
        }
        throw new CancellationException("Task is already canceled");
    }
}
