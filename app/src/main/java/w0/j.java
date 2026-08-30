package w0;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class j extends qe.a {

    /* renamed from: u, reason: collision with root package name */
    public final b f27678u;

    public j(b bVar) {
        this.f27678u = bVar;
    }

    @Override // qe.a
    public final int a() {
        b bVar = this.f27678u;
        bVar.getClass();
        return bVar.f27661v;
    }

    @Override // qe.a, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f27678u.containsValue(obj);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        k kVar = this.f27678u.f27660u;
        l[] lVarArr = new l[8];
        for (int i = 0; i < 8; i++) {
            lVarArr[i] = new m(2);
        }
        return new c(kVar, lVarArr);
    }
}
