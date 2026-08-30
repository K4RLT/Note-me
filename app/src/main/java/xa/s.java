package xa;

import java.util.Objects;

/* loaded from: classes.dex */
public final class s extends i {

    /* renamed from: w, reason: collision with root package name */
    public final transient Object[] f30515w;

    /* renamed from: x, reason: collision with root package name */
    public final transient int f30516x;

    /* renamed from: y, reason: collision with root package name */
    public final transient int f30517y;

    public s(Object[] objArr, int i, int i10) {
        this.f30515w = objArr;
        this.f30516x = i;
        this.f30517y = i10;
    }

    @Override // java.util.List
    public final Object get(int i) {
        u0.h(i, this.f30517y);
        Object obj = this.f30515w[i + i + this.f30516x];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f30517y;
    }
}
