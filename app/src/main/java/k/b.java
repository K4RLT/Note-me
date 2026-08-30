package k;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import f3.k;
import i7.c;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import wa.c9;

/* loaded from: classes.dex */
public final class b extends c9 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f19209a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final ExecutorService f19210b = Executors.newFixedThreadPool(4, new c(1));

    /* renamed from: c, reason: collision with root package name */
    public volatile Handler f19211c;

    public static Handler a(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return k.a(looper);
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (IllegalAccessException | InstantiationException | NoSuchMethodException unused) {
            return new Handler(looper);
        } catch (InvocationTargetException unused2) {
            return new Handler(looper);
        }
    }
}
