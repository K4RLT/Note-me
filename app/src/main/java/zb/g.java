package zb;

import java.util.Objects;
import ya.te;

/* loaded from: classes.dex */
public final class g extends d {

    /* renamed from: y, reason: collision with root package name */
    public static final g f32034y = new g(new Object[0], 0);

    /* renamed from: w, reason: collision with root package name */
    public final transient Object[] f32035w;

    /* renamed from: x, reason: collision with root package name */
    public final transient int f32036x;

    public g(Object[] objArr, int i) {
        this.f32035w = objArr;
        this.f32036x = i;
    }

    @Override // zb.d, zb.a
    public final int a(Object[] objArr) {
        Object[] objArr2 = this.f32035w;
        int i = this.f32036x;
        System.arraycopy(objArr2, 0, objArr, 0, i);
        return i;
    }

    @Override // zb.a
    public final Object[] b() {
        return this.f32035w;
    }

    @Override // zb.a
    public final int d() {
        return this.f32036x;
    }

    @Override // zb.a
    public final int g() {
        return 0;
    }

    @Override // java.util.List
    public final Object get(int i) {
        te.b(i, this.f32036x);
        Object obj = this.f32035w[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f32036x;
    }
}
