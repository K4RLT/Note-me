package fg;
import l.a;

import b8.b7;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;

/* loaded from: classes.dex */
public final class z extends m implements Map<String, m>, ef.a {
    public static final y Companion = new Object();

    /* renamed from: u, reason: collision with root package name */
    public final Map f17001u;

    public z(Map map) {
        map.getClass();
        this.f17001u = map;
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ m compute(String str, BiFunction<? super String, ? super m, ? extends m> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ m computeIfAbsent(String str, Function<? super String, ? extends m> function) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ m computeIfPresent(String str, BiFunction<? super String, ? super m, ? extends m> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        if (!(obj instanceof String)) {
            return false;
        }
        return this.f17001u.containsKey((String) obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        if (!(obj instanceof m)) {
            return false;
        }
        return this.f17001u.containsValue((m) obj);
    }

    @Override // java.util.Map
    public final Set<Map.Entry<String, m>> entrySet() {
        return this.f17001u.entrySet();
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return kotlin.jvm.internal.a(this.f17001u, obj);
    }

    @Override // java.util.Map
    public final m get(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        return (m) this.f17001u.get((String) obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return this.f17001u.hashCode();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f17001u.isEmpty();
    }

    @Override // java.util.Map
    public final Set<String> keySet() {
        return this.f17001u.keySet();
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ m merge(String str, m mVar, BiFunction<? super m, ? super m, ? extends m> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ m put(String str, m mVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void putAll(Map<? extends String, ? extends m> map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ m putIfAbsent(String str, m mVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final m remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ m replace(String str, m mVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void replaceAll(BiFunction<? super String, ? super m, ? extends m> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final int size() {
        return this.f17001u.size();
    }

    public final String toString() {
        return qe.l.B(this.f17001u.entrySet(), ",", "{", "}", new b7(18), 24);
    }

    @Override // java.util.Map
    public final Collection<m> values() {
        return this.f17001u.values();
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ boolean replace(String str, m mVar, m mVar2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
