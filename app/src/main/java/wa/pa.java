package wa;
import wa.i9;
import wa.qa;

import ya.hd;

/* loaded from: classes.dex */
public final class pa extends qa {

    /* renamed from: w, reason: collision with root package name */
    public final transient int f29787w;

    /* renamed from: x, reason: collision with root package name */
    public final transient int f29788x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ qa f29789y;

    public pa(qa qaVar, int i, int i10) {
        this.f29789y = qaVar;
        this.f29787w = i;
        this.f29788x = i10;
    }

    @Override // i9
    public final int b() {
        return this.f29789y.d() + this.f29787w + this.f29788x;
    }

    @Override // i9
    public final int d() {
        return this.f29789y.d() + this.f29787w;
    }

    @Override // i9
    public final Object[] g() {
        return this.f29789y.g();
    }

    @Override // java.util.List
    public final Object get(int i) {
        hd.a(i, this.f29788x);
        return this.f29789y.get(i + this.f29787w);
    }

    @Override // qa, java.util.List
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public final qa subList(int i, int i10) {
        hd.b(i, i10, this.f29788x);
        int i11 = this.f29787w;
        return this.f29789y.subList(i + i11, i10 + i11);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f29788x;
    }
}
