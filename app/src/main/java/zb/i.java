package zb;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class i extends e {

    /* renamed from: x, reason: collision with root package name */
    public final transient Object f32040x;

    public i(Object obj) {
        this.f32040x = obj;
    }

    @Override // zb.a
    public final int a(Object[] objArr) {
        objArr[0] = this.f32040x;
        return 1;
    }

    @Override // zb.a, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f32040x.equals(obj);
    }

    @Override // zb.e, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f32040x.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new f(this.f32040x);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        String obj = this.f32040x.toString();
        StringBuilder sb2 = new StringBuilder(String.valueOf(obj).length() + 2);
        sb2.append('[');
        sb2.append(obj);
        sb2.append(']');
        return sb2.toString();
    }
}
