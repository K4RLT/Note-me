package n;
import l.a;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;

/* loaded from: classes.dex */
public final class t implements Map, ef.a {

    /* renamed from: u, reason: collision with root package name */
    public final i0 f20941u;

    /* renamed from: v, reason: collision with root package name */
    public h f20942v;

    /* renamed from: w, reason: collision with root package name */
    public h f20943w;

    /* renamed from: x, reason: collision with root package name */
    public t0 f20944x;

    public t(i0 i0Var) {
        i0Var.getClass();
        this.f20941u = i0Var;
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object compute(Object obj, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object computeIfAbsent(Object obj, Function function) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object computeIfPresent(Object obj, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return this.f20941u.c(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return this.f20941u.d(obj);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        h hVar = this.f20942v;
        if (hVar != null) {
            return hVar;
        }
        h hVar2 = new h(this.f20941u, 0);
        this.f20942v = hVar2;
        return hVar2;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && t.class == obj.getClass()) {
            return kotlin.jvm.internal.a(this.f20941u, ((t) obj).f20941u);
        }
        return false;
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        return this.f20941u.g(obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return this.f20941u.hashCode();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f20941u.i();
    }

    @Override // java.util.Map
    public final Set keySet() {
        h hVar = this.f20943w;
        if (hVar != null) {
            return hVar;
        }
        h hVar2 = new h(this.f20941u, 1);
        this.f20943w = hVar2;
        return hVar2;
    }

    @Override // java.util.Map
    public final Object merge(Object obj, Object obj2, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object putIfAbsent(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object replace(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void replaceAll(BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final int size() {
        return this.f20941u.e;
    }

    public final String toString() {
        return this.f20941u.toString();
    }

    @Override // java.util.Map
    public final Collection values() {
        t0 t0Var = this.f20944x;
        if (t0Var != null) {
            return t0Var;
        }
        t0 t0Var2 = new t0(this.f20941u);
        this.f20944x = t0Var2;
        return t0Var2;
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final boolean replace(Object obj, Object obj2, Object obj3) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
