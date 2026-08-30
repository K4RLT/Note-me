package t0;

import java.util.List;
import java.util.ListIterator;

/* loaded from: classes.dex */
public final class d implements ListIterator, ef.a {

    /* renamed from: u, reason: collision with root package name */
    public final Object f25615u;

    /* renamed from: v, reason: collision with root package name */
    public int f25616v;

    public d(int i, List list) {
        this.f25615u = list;
        this.f25616v = i;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List, java.lang.Object] */
    @Override // java.util.ListIterator
    public final void add(Object obj) {
        this.f25615u.add(this.f25616v, obj);
        this.f25616v++;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.List, java.lang.Object] */
    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        if (this.f25616v < this.f25615u.size()) {
            return true;
        }
        return false;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        if (this.f25616v > 0) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.List, java.lang.Object] */
    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        int i = this.f25616v;
        this.f25616v = i + 1;
        return this.f25615u.get(i);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f25616v;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.List, java.lang.Object] */
    @Override // java.util.ListIterator
    public final Object previous() {
        int i = this.f25616v - 1;
        this.f25616v = i;
        return this.f25615u.get(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f25616v - 1;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.List, java.lang.Object] */
    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        int i = this.f25616v - 1;
        this.f25616v = i;
        this.f25615u.remove(i);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List, java.lang.Object] */
    @Override // java.util.ListIterator
    public final void set(Object obj) {
        this.f25615u.set(this.f25616v, obj);
    }
}
