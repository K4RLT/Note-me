package va;

import ya.xc;

/* loaded from: classes.dex */
public final class c extends d {

    /* renamed from: w, reason: collision with root package name */
    public final transient int f27474w;

    /* renamed from: x, reason: collision with root package name */
    public final transient int f27475x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ d f27476y;

    public c(d dVar, int i, int i10) {
        this.f27476y = dVar;
        this.f27474w = i;
        this.f27475x = i10;
    }

    @Override // va.a
    public final int b() {
        return this.f27476y.d() + this.f27474w + this.f27475x;
    }

    @Override // va.a
    public final int d() {
        return this.f27476y.d() + this.f27474w;
    }

    @Override // va.a
    public final Object[] g() {
        return this.f27476y.g();
    }

    @Override // java.util.List
    public final Object get(int i) {
        xc.a(i, this.f27475x);
        return this.f27476y.get(i + this.f27474w);
    }

    @Override // va.d, java.util.List
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public final d subList(int i, int i10) {
        xc.c(i, i10, this.f27475x);
        int i11 = this.f27474w;
        return this.f27476y.subList(i + i11, i10 + i11);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f27475x;
    }
}
