package lf;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import q.x;

/* loaded from: classes.dex */
public final class a implements d {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference f20354a;

    public a(d dVar) {
        this.f20354a = new AtomicReference(dVar);
    }

    @Override // lf.d
    public final Iterator iterator() {
        d dVar = (d) this.f20354a.getAndSet(null);
        if (dVar != null) {
            return dVar.iterator();
        }
        x.o("This sequence can be consumed only once.");
        return null;
    }
}
