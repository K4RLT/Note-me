package l6;

/* loaded from: classes.dex */
public final class j extends h {
    public final boolean j(Object obj) {
        if (obj == null) {
            obj = h.A;
        }
        if (h.f19961z.b(this, null, obj)) {
            h.c(this);
            return true;
        }
        return false;
    }

    public final boolean l(Throwable th) {
        if (h.f19961z.b(this, null, new b(th))) {
            h.c(this);
            return true;
        }
        return false;
    }

    public final boolean m(ac.b bVar) {
        b bVar2;
        bVar.getClass();
        Object obj = this.f19962u;
        if (obj == null) {
            if (bVar.isDone()) {
                if (h.f19961z.b(this, null, h.f(bVar))) {
                    h.c(this);
                    return true;
                }
                return false;
            }
            e eVar = new e(this, bVar);
            if (h.f19961z.b(this, null, eVar)) {
                try {
                    bVar.a(eVar, i.f19965u);
                    return true;
                } catch (Throwable th) {
                    try {
                        bVar2 = new b(th);
                    } catch (Throwable unused) {
                        bVar2 = b.f19944b;
                    }
                    h.f19961z.b(this, eVar, bVar2);
                    return true;
                }
            }
            obj = this.f19962u;
        }
        if (obj instanceof a) {
            bVar.cancel(((a) obj).f19942a);
        }
        return false;
    }
}
