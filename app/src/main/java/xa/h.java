package xa;

/* loaded from: classes.dex */
public final class h extends i {

    /* renamed from: w, reason: collision with root package name */
    public final transient int f30420w;

    /* renamed from: x, reason: collision with root package name */
    public final transient int f30421x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ i f30422y;

    public h(i iVar, int i, int i10) {
        this.f30422y = iVar;
        this.f30420w = i;
        this.f30421x = i10;
    }

    @Override // xa.f
    public final int b() {
        return this.f30422y.d() + this.f30420w + this.f30421x;
    }

    @Override // xa.f
    public final int d() {
        return this.f30422y.d() + this.f30420w;
    }

    @Override // java.util.List
    public final Object get(int i) {
        u0.h(i, this.f30421x);
        return this.f30422y.get(i + this.f30420w);
    }

    @Override // xa.f
    public final Object[] k() {
        return this.f30422y.k();
    }

    @Override // xa.i, java.util.List
    /* renamed from: n */
    public final i subList(int i, int i10) {
        u0.w(i, i10, this.f30421x);
        int i11 = this.f30420w;
        return this.f30422y.subList(i + i11, i10 + i11);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f30421x;
    }
}
