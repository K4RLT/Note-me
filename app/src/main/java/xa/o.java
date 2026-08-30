package xa;

import java.util.Objects;

/* loaded from: classes.dex */
public final class o extends i {

    /* renamed from: y, reason: collision with root package name */
    public static final o f30481y = new o(new Object[0], 0);

    /* renamed from: w, reason: collision with root package name */
    public final transient Object[] f30482w;

    /* renamed from: x, reason: collision with root package name */
    public final transient int f30483x;

    public o(Object[] objArr, int i) {
        this.f30482w = objArr;
        this.f30483x = i;
    }

    @Override // xa.i, xa.f
    public final int a(Object[] objArr) {
        Object[] objArr2 = this.f30482w;
        int i = this.f30483x;
        System.arraycopy(objArr2, 0, objArr, 0, i);
        return i;
    }

    @Override // xa.f
    public final int b() {
        return this.f30483x;
    }

    @Override // xa.f
    public final int d() {
        return 0;
    }

    @Override // java.util.List
    public final Object get(int i) {
        u0.h(i, this.f30483x);
        Object obj = this.f30482w[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // xa.f
    public final Object[] k() {
        return this.f30482w;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f30483x;
    }
}
