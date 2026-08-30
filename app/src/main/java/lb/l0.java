package lb;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes.dex */
public final class l0 {

    /* renamed from: k, reason: collision with root package name */
    public static final c7.a f20183k = new c7.a("ExtractorLooper", 5);

    /* renamed from: a, reason: collision with root package name */
    public final t0 f20184a;

    /* renamed from: b, reason: collision with root package name */
    public final g0 f20185b;

    /* renamed from: c, reason: collision with root package name */
    public final p1 f20186c;

    /* renamed from: d, reason: collision with root package name */
    public final a1 f20187d;
    public final d1 e;

    /* renamed from: f, reason: collision with root package name */
    public final i1 f20188f;

    /* renamed from: g, reason: collision with root package name */
    public final k1 f20189g;

    /* renamed from: h, reason: collision with root package name */
    public final u0 f20190h;
    public final AtomicBoolean i = new AtomicBoolean(false);

    /* renamed from: j, reason: collision with root package name */
    public final mb.e f20191j;

    public l0(t0 t0Var, mb.e eVar, g0 g0Var, p1 p1Var, a1 a1Var, d1 d1Var, i1 i1Var, k1 k1Var, u0 u0Var) {
        this.f20184a = t0Var;
        this.f20191j = eVar;
        this.f20185b = g0Var;
        this.f20186c = p1Var;
        this.f20187d = a1Var;
        this.e = d1Var;
        this.f20188f = i1Var;
        this.f20189g = k1Var;
        this.f20190h = u0Var;
    }

    public final void a(int i, Exception exc) {
        t0 t0Var = this.f20184a;
        try {
            ReentrantLock reentrantLock = t0Var.f20282d;
            try {
                reentrantLock.lock();
                t0Var.a(i).f20236c.f6274b = 5;
                reentrantLock.unlock();
                t0Var.b(new c7.x(t0Var, i, 15));
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        } catch (k0 unused) {
            f20183k.c("Error during error handling: %s", exc.getMessage());
        }
    }
}
