package de;

import android.os.HandlerThread;
import android.os.Looper;
import com.google.android.gms.internal.ads.iv1;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: b, reason: collision with root package name */
    public static final Object f15836b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public static e f15837c;

    /* renamed from: a, reason: collision with root package name */
    public final bb.a f15838a;

    public e(Looper looper) {
        bb.a aVar = new bb.a(looper, 6, false);
        Looper.getMainLooper();
        this.f15838a = aVar;
    }

    public static e a() {
        e eVar;
        synchronized (f15836b) {
            try {
                if (f15837c == null) {
                    HandlerThread handlerThread = new HandlerThread("MLHandler", 9);
                    handlerThread.start();
                    f15837c = new e(handlerThread.getLooper());
                }
                eVar = f15837c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return eVar;
    }

    public static ib.o b(Callable callable) {
        ib.h hVar = new ib.h();
        m.f15854u.execute(new iv1(callable, 5, hVar));
        return hVar.f18363a;
    }
}
