package wa;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public abstract class f0 {
    public static /* synthetic */ boolean a(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, com.google.android.gms.internal.play_billing.k0 k0Var, Object obj, Object obj2) {
        while (!atomicReferenceFieldUpdater.compareAndSet(k0Var, obj, obj2)) {
            if (atomicReferenceFieldUpdater.get(k0Var) != obj && atomicReferenceFieldUpdater.get(k0Var) != obj) {
                return false;
            }
        }
        return true;
    }
}
