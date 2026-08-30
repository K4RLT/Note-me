package b4;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import q.x;
import qe.l;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f1699a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f1700b;

    public b(LinkedHashMap linkedHashMap, boolean z3) {
        this.f1699a = linkedHashMap;
        this.f1700b = new AtomicBoolean(z3);
    }

    public final Object a(e eVar) {
        eVar.getClass();
        return this.f1699a.get(eVar);
    }

    public final void b(e eVar, Object obj) {
        eVar.getClass();
        AtomicBoolean atomicBoolean = this.f1700b;
        if (!atomicBoolean.get()) {
            LinkedHashMap linkedHashMap = this.f1699a;
            if (obj == null) {
                if (!atomicBoolean.get()) {
                    linkedHashMap.remove(eVar);
                    return;
                } else {
                    x.o("Do mutate preferences once returned to DataStore.");
                    return;
                }
            }
            if (obj instanceof Set) {
                Set unmodifiableSet = Collections.unmodifiableSet(l.U((Iterable) obj));
                unmodifiableSet.getClass();
                linkedHashMap.put(eVar, unmodifiableSet);
                return;
            }
            linkedHashMap.put(eVar, obj);
            return;
        }
        x.o("Do mutate preferences once returned to DataStore.");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof b) {
            return kotlin.jvm.internal.l.a(this.f1699a, ((b) obj).f1699a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f1699a.hashCode();
    }

    public final String toString() {
        return l.B(this.f1699a.entrySet(), ",\n", "{\n", "\n}", a.f1698u, 24);
    }

    public /* synthetic */ b(boolean z3) {
        this(new LinkedHashMap(), z3);
    }
}
