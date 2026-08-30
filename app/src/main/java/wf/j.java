package wf;

import java.util.concurrent.TimeUnit;
import uf.t;

/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static final String f29921a;

    /* renamed from: b, reason: collision with root package name */
    public static final long f29922b;

    /* renamed from: c, reason: collision with root package name */
    public static final int f29923c;

    /* renamed from: d, reason: collision with root package name */
    public static final int f29924d;
    public static final long e;

    /* renamed from: f, reason: collision with root package name */
    public static final g f29925f;

    static {
        String str;
        int i = t.f27241a;
        try {
            str = System.getProperty("kotlinx.coroutines.scheduler.default.name");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str == null) {
            str = "DefaultDispatcher";
        }
        f29921a = str;
        f29922b = uf.a.i(100000L, "kotlinx.coroutines.scheduler.resolution.ns", 1L, Long.MAX_VALUE);
        int i10 = t.f27241a;
        if (i10 < 2) {
            i10 = 2;
        }
        f29923c = uf.a.j("kotlinx.coroutines.scheduler.core.pool.size", i10, 8);
        f29924d = uf.a.j("kotlinx.coroutines.scheduler.max.pool.size", 2097150, 4);
        e = TimeUnit.SECONDS.toNanos(uf.a.i(60L, "kotlinx.coroutines.scheduler.keep.alive.sec", 1L, Long.MAX_VALUE));
        f29925f = g.f29917a;
    }
}
