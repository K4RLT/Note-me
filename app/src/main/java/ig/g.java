package ig;

import java.lang.ref.Reference;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: g, reason: collision with root package name */
    public static final ThreadPoolExecutor f18497g;

    /* renamed from: f, reason: collision with root package name */
    public boolean f18502f;

    /* renamed from: c, reason: collision with root package name */
    public final a6.x f18500c = new a6.x(22, this);

    /* renamed from: d, reason: collision with root package name */
    public final ArrayDeque f18501d = new ArrayDeque();
    public final k6.i e = new k6.i(7);

    /* renamed from: a, reason: collision with root package name */
    public final int f18498a = 5;

    /* renamed from: b, reason: collision with root package name */
    public final long f18499b = 300000000000L;

    static {
        SynchronousQueue synchronousQueue = new SynchronousQueue();
        byte[] bArr = jg.b.f19199a;
        f18497g = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, synchronousQueue, new a6.b("OkHttp ConnectionPool", true));
    }

    public final int a(lg.b bVar, long j10) {
        ArrayList arrayList = bVar.f20382n;
        int i = 0;
        while (i < arrayList.size()) {
            Reference reference = (Reference) arrayList.get(i);
            if (reference.get() != null) {
                i++;
            } else {
                pg.h.f22833a.m(((lg.d) reference).f20386a, "A connection to " + bVar.f20373c.f18605a.f18445a + " was leaked. Did you forget to close a response body?");
                arrayList.remove(i);
                bVar.f20379k = true;
                if (arrayList.isEmpty()) {
                    bVar.f20383o = j10 - this.f18499b;
                    return 0;
                }
            }
        }
        return arrayList.size();
    }
}
