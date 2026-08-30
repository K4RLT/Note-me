package r;
import d.a;
import q.k0;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class w0 {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference f24157a = new AtomicReference(null);

    /* renamed from: b, reason: collision with root package name */
    public final yf.c f24158b = yf.a();

    public static final void a(w0 w0Var, v0 v0Var) {
        AtomicReference atomicReference = w0Var.f24157a;
        while (true) {
            v0 v0Var2 = (v0) atomicReference.get();
            if (v0Var2 != null && v0Var.f24155a.compareTo(v0Var2.f24155a) < 0) {
                throw new CancellationException("Current mutation had a higher priority");
            }
            while (!atomicReference.compareAndSet(v0Var2, v0Var)) {
                if (atomicReference.get() != v0Var2) {
                    break;
                }
            }
            if (v0Var2 != null) {
                v0Var2.f24156b.j(new k0("Mutation interrupted", 1));
                return;
            }
            return;
        }
    }
}
