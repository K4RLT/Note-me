package zb;

import java.util.Iterator;
import java.util.ListIterator;
import ya.te;

/* loaded from: classes.dex */
public final class c extends d {

    /* renamed from: w, reason: collision with root package name */
    public final transient int f32026w;

    /* renamed from: x, reason: collision with root package name */
    public final transient int f32027x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ d f32028y;

    public c(d dVar, int i, int i10) {
        this.f32028y = dVar;
        this.f32026w = i;
        this.f32027x = i10;
    }

    @Override // zb.a
    public final Object[] b() {
        return this.f32028y.b();
    }

    @Override // zb.a
    public final int d() {
        return this.f32028y.g() + this.f32026w + this.f32027x;
    }

    @Override // zb.a
    public final int g() {
        return this.f32028y.g() + this.f32026w;
    }

    @Override // java.util.List
    public final Object get(int i) {
        te.b(i, this.f32027x);
        return this.f32028y.get(i + this.f32026w);
    }

    @Override // zb.d, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // zb.d, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // zb.d, java.util.List
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public final d subList(int i, int i10) {
        te.d(i, i10, this.f32027x);
        int i11 = this.f32026w;
        return this.f32028y.subList(i + i11, i10 + i11);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f32027x;
    }

    @Override // zb.d, java.util.List
    public final /* bridge */ /* synthetic */ ListIterator listIterator(int i) {
        return listIterator(i);
    }
}
