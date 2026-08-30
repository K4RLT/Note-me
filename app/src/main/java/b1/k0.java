package b1;
import w.a;

import java.util.List;
import java.util.ListIterator;

/* loaded from: classes.dex */
public final class k0 implements ListIterator, ef.a {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f1353u = 0;

    /* renamed from: v, reason: collision with root package name */
    public final Object f1354v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f1355w;

    public k0(qe.y yVar, int i) {
        this.f1355w = yVar;
        List list = yVar.f24028u;
        if (i >= 0 && i <= yVar.a()) {
            this.f1354v = list.listIterator(yVar.a() - i);
            return;
        }
        StringBuilder m4 = g3.a.m("Position index ", i, " must be in range [");
        m4.append(new jf.b(0, yVar.a(), 1));
        m4.append("].");
        throw new IndexOutOfBoundsException(m4.toString());
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        switch (this.f1353u) {
            case 0:
                throw new IllegalStateException("Cannot modify a state list through an iterator");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        switch (this.f1353u) {
            case 0:
                if (((kotlin.jvm.internal.w) this.f1354v).f19785u < ((l0) this.f1355w).f1365x - 1) {
                    return true;
                }
                return false;
            default:
                return ((ListIterator) this.f1354v).hasPrevious();
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.f1353u) {
            case 0:
                if (((kotlin.jvm.internal.w) this.f1354v).f19785u >= 0) {
                    return true;
                }
                return false;
            default:
                return ((ListIterator) this.f1354v).hasNext();
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        switch (this.f1353u) {
            case 0:
                kotlin.jvm.internal.w wVar = (kotlin.jvm.internal.w) this.f1354v;
                int i = wVar.f19785u + 1;
                l0 l0Var = (l0) this.f1355w;
                a(i, l0Var.f1365x);
                wVar.f19785u = i;
                return l0Var.get(i);
            default:
                return ((ListIterator) this.f1354v).previous();
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.f1353u) {
            case 0:
                return ((kotlin.jvm.internal.w) this.f1354v).f19785u + 1;
            default:
                qe.y yVar = (qe.y) this.f1355w;
                return (yVar.size() - 1) - ((ListIterator) this.f1354v).previousIndex();
        }
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        switch (this.f1353u) {
            case 0:
                kotlin.jvm.internal.w wVar = (kotlin.jvm.internal.w) this.f1354v;
                int i = wVar.f19785u;
                l0 l0Var = (l0) this.f1355w;
                a(i, l0Var.f1365x);
                wVar.f19785u = i - 1;
                return l0Var.get(i);
            default:
                return ((ListIterator) this.f1354v).next();
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        switch (this.f1353u) {
            case 0:
                return ((kotlin.jvm.internal.w) this.f1354v).f19785u;
            default:
                qe.y yVar = (qe.y) this.f1355w;
                return (yVar.size() - 1) - ((ListIterator) this.f1354v).nextIndex();
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        switch (this.f1353u) {
            case 0:
                throw new IllegalStateException("Cannot modify a state list through an iterator");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        switch (this.f1353u) {
            case 0:
                throw new IllegalStateException("Cannot modify a state list through an iterator");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public k0(kotlin.jvm.internal.w wVar, l0 l0Var) {
        this.f1354v = wVar;
        this.f1355w = l0Var;
    }
}
