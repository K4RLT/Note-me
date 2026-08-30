package va;

import java.util.Objects;
import ya.xc;

/* loaded from: classes.dex */
public final class g extends d {

    /* renamed from: y, reason: collision with root package name */
    public static final g f27482y = new g(new Object[0], 0);

    /* renamed from: w, reason: collision with root package name */
    public final transient Object[] f27483w;

    /* renamed from: x, reason: collision with root package name */
    public final transient int f27484x;

    public g(Object[] objArr, int i) {
        this.f27483w = objArr;
        this.f27484x = i;
    }

    @Override // va.d, va.a
    public final int a(Object[] objArr) {
        Object[] objArr2 = this.f27483w;
        int i = this.f27484x;
        System.arraycopy(objArr2, 0, objArr, 0, i);
        return i;
    }

    @Override // va.a
    public final int b() {
        return this.f27484x;
    }

    @Override // va.a
    public final int d() {
        return 0;
    }

    @Override // va.a
    public final Object[] g() {
        return this.f27483w;
    }

    @Override // java.util.List
    public final Object get(int i) {
        xc.a(i, this.f27484x);
        Object obj = this.f27483w[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f27484x;
    }
}
