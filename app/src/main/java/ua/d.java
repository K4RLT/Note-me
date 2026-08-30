package ua;

import ya.pc;

/* loaded from: classes.dex */
public final class d extends e {

    /* renamed from: w, reason: collision with root package name */
    public final transient int f27138w;

    /* renamed from: x, reason: collision with root package name */
    public final transient int f27139x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ e f27140y;

    public d(e eVar, int i, int i10) {
        this.f27140y = eVar;
        this.f27138w = i;
        this.f27139x = i10;
    }

    @Override // ua.a
    public final Object[] a() {
        return this.f27140y.a();
    }

    @Override // ua.a
    public final int b() {
        return this.f27140y.b() + this.f27138w;
    }

    @Override // ua.a
    public final int d() {
        return this.f27140y.b() + this.f27138w + this.f27139x;
    }

    @Override // java.util.List
    public final Object get(int i) {
        pc.a(i, this.f27139x);
        return this.f27140y.get(i + this.f27138w);
    }

    @Override // ua.e, java.util.List
    /* renamed from: n */
    public final e subList(int i, int i10) {
        pc.b(i, i10, this.f27139x);
        int i11 = this.f27138w;
        return this.f27140y.subList(i + i11, i10 + i11);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f27139x;
    }
}
