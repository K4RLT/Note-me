package wa;
import wa.i9;
import wa.qa;

import ya.hd;

/* loaded from: classes.dex */
public final class sa extends qa {

    /* renamed from: y, reason: collision with root package name */
    public static final sa f29813y = new sa(new Object[0], 0);

    /* renamed from: w, reason: collision with root package name */
    public final transient Object[] f29814w;

    /* renamed from: x, reason: collision with root package name */
    public final transient int f29815x;

    public sa(Object[] objArr, int i) {
        this.f29814w = objArr;
        this.f29815x = i;
    }

    @Override // qa, i9
    public final int a(Object[] objArr) {
        Object[] objArr2 = this.f29814w;
        int i = this.f29815x;
        System.arraycopy(objArr2, 0, objArr, 0, i);
        return i;
    }

    @Override // i9
    public final int b() {
        return this.f29815x;
    }

    @Override // i9
    public final int d() {
        return 0;
    }

    @Override // i9
    public final Object[] g() {
        return this.f29814w;
    }

    @Override // java.util.List
    public final Object get(int i) {
        hd.a(i, this.f29815x);
        Object obj = this.f29814w[i];
        obj.getClass();
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f29815x;
    }
}
