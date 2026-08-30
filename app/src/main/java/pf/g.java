package pf;
import l.a;

import java.util.concurrent.locks.LockSupport;

/* loaded from: classes.dex */
public final class g extends a {

    /* renamed from: x, reason: collision with root package name */
    public final Thread f22747x;

    /* renamed from: y, reason: collision with root package name */
    public final q0 f22748y;

    public g(te.g gVar, Thread thread, q0 q0Var) {
        super(gVar, true);
        this.f22747x = thread;
        this.f22748y = q0Var;
    }

    @Override // pf.k1
    public final void q(Object obj) {
        Thread currentThread = Thread.currentThread();
        Thread thread = this.f22747x;
        if (!kotlin.jvm.internal.a(currentThread, thread)) {
            LockSupport.unpark(thread);
        }
    }
}
