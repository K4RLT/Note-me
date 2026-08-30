package wa;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public abstract class v5 {
    public static /* synthetic */ boolean a(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, com.google.android.gms.internal.play_billing.b4 b4Var, Object obj, Object obj2) {
        while (!atomicReferenceFieldUpdater.compareAndSet(b4Var, obj, obj2)) {
            if (atomicReferenceFieldUpdater.get(b4Var) != obj && atomicReferenceFieldUpdater.get(b4Var) != obj) {
                return false;
            }
        }
        return true;
    }
}
