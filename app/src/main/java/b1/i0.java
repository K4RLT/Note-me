package b1;

import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public abstract class i0 implements h0 {

    /* renamed from: u, reason: collision with root package name */
    public final z0.a f1349u = new AtomicInteger(0);

    public final boolean e(int i) {
        if ((i & this.f1349u.get()) != 0) {
            return true;
        }
        return false;
    }

    public final void f(int i) {
        z0.a aVar;
        int i10;
        do {
            aVar = this.f1349u;
            i10 = aVar.get();
            if ((i10 & i) != 0) {
                return;
            }
        } while (!aVar.compareAndSet(i10, i10 | i));
    }
}
