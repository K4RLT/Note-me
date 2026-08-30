package lb;

import java.util.HashMap;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes.dex */
public final class t0 {

    /* renamed from: f, reason: collision with root package name */
    public static final c7.a f20278f = new c7.a("ExtractorSessionStoreView", 5);

    /* renamed from: a, reason: collision with root package name */
    public final v f20279a;

    /* renamed from: b, reason: collision with root package name */
    public final n0 f20280b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f20281c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final ReentrantLock f20282d = new ReentrantLock();
    public final mb.e e;

    public t0(v vVar, mb.e eVar, n0 n0Var) {
        this.f20279a = vVar;
        this.e = eVar;
        this.f20280b = n0Var;
    }

    public final q0 a(int i) {
        Integer valueOf = Integer.valueOf(i);
        q0 q0Var = (q0) this.f20281c.get(valueOf);
        if (q0Var != null) {
            return q0Var;
        }
        throw new k0(String.format("Could not find session %d while trying to get it", valueOf), i);
    }

    public final Object b(s0 s0Var) {
        ReentrantLock reentrantLock = this.f20282d;
        try {
            reentrantLock.lock();
            return s0Var.b();
        } finally {
            reentrantLock.unlock();
        }
    }
}
