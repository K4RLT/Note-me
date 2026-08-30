package pe;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class m implements g, Serializable {

    /* renamed from: w, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f22697w = AtomicReferenceFieldUpdater.newUpdater(m.class, Object.class, "v");

    /* renamed from: u, reason: collision with root package name */
    public volatile df.a f22698u;

    /* renamed from: v, reason: collision with root package name */
    public volatile Object f22699v;

    @Override // pe.g
    public final Object getValue() {
        Object obj = this.f22699v;
        w wVar = w.f22712a;
        if (obj != wVar) {
            return obj;
        }
        df.a aVar = this.f22698u;
        if (aVar != null) {
            Object invoke = aVar.invoke();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f22697w;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, wVar, invoke)) {
                if (atomicReferenceFieldUpdater.get(this) != wVar) {
                }
            }
            this.f22698u = null;
            return invoke;
        }
        return this.f22699v;
    }

    public final String toString() {
        if (this.f22699v != w.f22712a) {
            return String.valueOf(getValue());
        }
        return "Lazy value not initialized yet.";
    }
}
