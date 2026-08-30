package jf;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class c implements Iterator, ef.a {

    /* renamed from: u, reason: collision with root package name */
    public final int f19192u;

    /* renamed from: v, reason: collision with root package name */
    public final int f19193v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f19194w;

    /* renamed from: x, reason: collision with root package name */
    public int f19195x;

    public c(int i, int i10, int i11) {
        this.f19192u = i11;
        this.f19193v = i10;
        boolean z3 = false;
        if (i11 <= 0 ? i >= i10 : i <= i10) {
            z3 = true;
        }
        this.f19194w = z3;
        this.f19195x = z3 ? i : i10;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f19194w;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return Integer.valueOf(nextInt());
    }

    public final int nextInt() {
        int i = this.f19195x;
        if (i == this.f19193v) {
            if (this.f19194w) {
                this.f19194w = false;
                return i;
            }
            l4.a.c();
            return 0;
        }
        this.f19195x = this.f19192u + i;
        return i;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
