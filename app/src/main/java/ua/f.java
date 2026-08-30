package ua;

import java.util.Objects;
import ya.pc;

/* loaded from: classes.dex */
public final class f extends e {

    /* renamed from: y, reason: collision with root package name */
    public static final f f27142y = new f(new Object[0], 0);

    /* renamed from: w, reason: collision with root package name */
    public final transient Object[] f27143w;

    /* renamed from: x, reason: collision with root package name */
    public final transient int f27144x;

    public f(Object[] objArr, int i) {
        this.f27143w = objArr;
        this.f27144x = i;
    }

    @Override // ua.a
    public final Object[] a() {
        return this.f27143w;
    }

    @Override // ua.a
    public final int b() {
        return 0;
    }

    @Override // ua.a
    public final int d() {
        return this.f27144x;
    }

    @Override // ua.e, ua.a
    public final int g(Object[] objArr) {
        Object[] objArr2 = this.f27143w;
        int i = this.f27144x;
        System.arraycopy(objArr2, 0, objArr, 0, i);
        return i;
    }

    @Override // java.util.List
    public final Object get(int i) {
        pc.a(i, this.f27144x);
        Object obj = this.f27143w[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f27144x;
    }
}
