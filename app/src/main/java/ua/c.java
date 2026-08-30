package ua;

import ya.pc;

/* loaded from: classes.dex */
public final class c extends e {

    /* renamed from: w, reason: collision with root package name */
    public final transient e f27137w;

    public c(e eVar) {
        this.f27137w = eVar;
    }

    @Override // ua.e, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.f27137w.contains(obj);
    }

    @Override // java.util.List
    public final Object get(int i) {
        e eVar = this.f27137w;
        pc.a(i, eVar.size());
        return eVar.get((eVar.size() - 1) - i);
    }

    @Override // ua.e, java.util.List
    public final int indexOf(Object obj) {
        int lastIndexOf = this.f27137w.lastIndexOf(obj);
        if (lastIndexOf < 0) {
            return -1;
        }
        return (r0.size() - 1) - lastIndexOf;
    }

    @Override // ua.e
    public final e k() {
        return this.f27137w;
    }

    @Override // ua.e, java.util.List
    public final int lastIndexOf(Object obj) {
        int indexOf = this.f27137w.indexOf(obj);
        if (indexOf < 0) {
            return -1;
        }
        return (r0.size() - 1) - indexOf;
    }

    @Override // ua.e, java.util.List
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public final e subList(int i, int i10) {
        e eVar = this.f27137w;
        pc.b(i, i10, eVar.size());
        return eVar.subList(eVar.size() - i10, eVar.size() - i).k();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f27137w.size();
    }
}
