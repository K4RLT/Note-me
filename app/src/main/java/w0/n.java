package w0;

import q1.y;

/* loaded from: classes.dex */
public final class n extends l {

    /* renamed from: x, reason: collision with root package name */
    public final y f27687x;

    public n(y yVar) {
        this.f27687x = yVar;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f27685w;
        this.f27685w = i + 2;
        Object[] objArr = this.f27683u;
        return new a(this.f27687x, objArr[i], objArr[i + 1]);
    }
}
