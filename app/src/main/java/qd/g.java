package qd;

import java.util.Iterator;
import java.util.Random;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class g implements ea.b {

    /* renamed from: a, reason: collision with root package name */
    public static final AtomicReference f23990a = new AtomicReference();

    @Override // ea.b
    public final void a(boolean z3) {
        Random random = h.f23991j;
        synchronized (h.class) {
            Iterator it = h.f23992k.values().iterator();
            while (it.hasNext()) {
                ((a) it.next()).d(z3);
            }
        }
    }
}
