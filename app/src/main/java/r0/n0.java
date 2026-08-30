package r0;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class n0 implements Iterator, ef.a {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f24302u = 0;

    /* renamed from: v, reason: collision with root package name */
    public final b2 f24303v;

    /* renamed from: w, reason: collision with root package name */
    public final int f24304w;

    /* renamed from: x, reason: collision with root package name */
    public int f24305x;

    /* renamed from: y, reason: collision with root package name */
    public int f24306y;

    public n0(b2 b2Var, int i, int i10) {
        this.f24303v = b2Var;
        this.f24304w = i10;
        this.f24305x = i;
        this.f24306y = b2Var.B;
        if (b2Var.A) {
            d2.e();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f24302u) {
            case 0:
                if (this.f24305x < this.f24304w) {
                    return true;
                }
                return false;
            default:
                throw null;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f24302u) {
            case 0:
                b2 b2Var = this.f24303v;
                int i = b2Var.B;
                int i10 = this.f24306y;
                if (i != i10) {
                    d2.e();
                }
                int i11 = this.f24305x;
                this.f24305x = b2Var.f24191u[(i11 * 5) + 3] + i11;
                return new c2(b2Var, i11, i10);
            default:
                throw null;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f24302u) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public n0(b2 b2Var, int i, o0 o0Var, y yVar) {
        this.f24303v = b2Var;
        this.f24304w = i;
        this.f24305x = b2Var.B;
    }
}
