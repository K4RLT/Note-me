package x0;

import java.util.Collection;
import java.util.Iterator;
import lf.c;
import qe.h;

/* loaded from: classes.dex */
public final class b extends h implements u0.b, Collection, ef.a {

    /* renamed from: x, reason: collision with root package name */
    public static final b f30038x;

    /* renamed from: u, reason: collision with root package name */
    public final Object f30039u;

    /* renamed from: v, reason: collision with root package name */
    public final Object f30040v;

    /* renamed from: w, reason: collision with root package name */
    public final w0.b f30041w;

    static {
        y0.b bVar = y0.b.f30796a;
        f30038x = new b(bVar, bVar, w0.b.f27659w);
    }

    public b(Object obj, Object obj2, w0.b bVar) {
        this.f30039u = obj;
        this.f30040v = obj2;
        this.f30041w = bVar;
    }

    @Override // qe.a
    public final int a() {
        return this.f30041w.f27661v;
    }

    @Override // qe.a, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f30041w.containsKey(obj);
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new c(this.f30039u, this.f30041w);
    }
}
