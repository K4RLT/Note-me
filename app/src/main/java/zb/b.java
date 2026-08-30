package zb;

import com.google.android.gms.internal.play_billing.b0;
import java.util.ListIterator;
import ya.te;

/* loaded from: classes.dex */
public final class b extends b0 implements ListIterator {

    /* renamed from: v, reason: collision with root package name */
    public final int f32023v;

    /* renamed from: w, reason: collision with root package name */
    public int f32024w;

    /* renamed from: x, reason: collision with root package name */
    public final d f32025x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, int i) {
        super(5);
        int size = dVar.size();
        te.c(i, size);
        this.f32023v = size;
        this.f32024w = i;
        this.f32025x = dVar;
    }

    public final Object a(int i) {
        return this.f32025x.get(i);
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        if (this.f32024w < this.f32023v) {
            return true;
        }
        return false;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        if (this.f32024w > 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (hasNext()) {
            int i = this.f32024w;
            this.f32024w = i + 1;
            return a(i);
        }
        l4.a.c();
        return null;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f32024w;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (hasPrevious()) {
            int i = this.f32024w - 1;
            this.f32024w = i;
            return a(i);
        }
        l4.a.c();
        return null;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f32024w - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
