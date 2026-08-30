package hd;

import g5.q;

/* loaded from: classes.dex */
public final class g implements j {

    /* renamed from: a, reason: collision with root package name */
    public final k f18021a;

    /* renamed from: b, reason: collision with root package name */
    public final ib.h f18022b;

    public g(k kVar, ib.h hVar) {
        this.f18021a = kVar;
        this.f18022b = hVar;
    }

    @Override // hd.j
    public final boolean a(id.a aVar) {
        if (aVar.f18425b == 4 && !this.f18021a.a(aVar)) {
            String str = aVar.f18426c;
            if (str != null) {
                this.f18022b.b(new a(aVar.e, aVar.f18428f, str));
                return true;
            }
            q.h("Null token");
            return false;
        }
        return false;
    }

    @Override // hd.j
    public final boolean b(Exception exc) {
        this.f18022b.c(exc);
        return true;
    }
}
