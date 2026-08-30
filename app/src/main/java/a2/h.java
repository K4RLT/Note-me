package a2;

import r0.i1;
import r0.y;

/* loaded from: classes.dex */
public final class h extends bc.b {

    /* renamed from: a, reason: collision with root package name */
    public final g f235a;

    /* renamed from: b, reason: collision with root package name */
    public final i1 f236b = y.B(null);

    public h(g gVar) {
        this.f235a = gVar;
    }

    @Override // bc.b
    public final boolean a(g gVar) {
        if (gVar == this.f235a) {
            return true;
        }
        return false;
    }

    @Override // bc.b
    public final Object b(g gVar) {
        if (gVar != this.f235a) {
            y1.a.b("Check failed.");
        }
        Object value = this.f236b.getValue();
        if (value == null) {
            return null;
        }
        return value;
    }

    public final void c(g gVar, Object obj) {
        if (gVar != this.f235a) {
            y1.a.b("Check failed.");
        }
        this.f236b.setValue(obj);
    }
}
