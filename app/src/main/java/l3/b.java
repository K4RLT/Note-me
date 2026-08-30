package l3;

import android.os.OutcomeReceiver;
import java.util.concurrent.atomic.AtomicBoolean;
import pf.l;

/* loaded from: classes.dex */
public final class b extends AtomicBoolean implements OutcomeReceiver {

    /* renamed from: u, reason: collision with root package name */
    public final l f19884u;

    public b(l lVar) {
        super(false);
        this.f19884u = lVar;
    }

    public final void onError(Throwable th) {
        if (compareAndSet(false, true)) {
            this.f19884u.resumeWith(pe.a.b(th));
        }
    }

    public final void onResult(Object obj) {
        if (compareAndSet(false, true)) {
            this.f19884u.resumeWith(obj);
        }
    }

    @Override // java.util.concurrent.atomic.AtomicBoolean
    public final String toString() {
        return "ContinuationOutcomeReceiver(outcomeReceived = " + get() + ')';
    }
}
