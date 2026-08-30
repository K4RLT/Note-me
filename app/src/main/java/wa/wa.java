package wa;

import ya.hd;

/* loaded from: classes.dex */
public final class wa extends qa {

    /* renamed from: w, reason: collision with root package name */
    public final transient Object[] f29851w;

    /* renamed from: x, reason: collision with root package name */
    public final transient int f29852x;

    /* renamed from: y, reason: collision with root package name */
    public final transient int f29853y = 1;

    public wa(Object[] objArr, int i) {
        this.f29851w = objArr;
        this.f29852x = i;
    }

    @Override // java.util.List
    public final Object get(int i) {
        hd.a(i, this.f29853y);
        Object obj = this.f29851w[i + i + this.f29852x];
        obj.getClass();
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f29853y;
    }
}
