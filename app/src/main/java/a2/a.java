package a2;

import x.a0;
import x.v0;
import x.y0;

/* loaded from: classes.dex */
public final class a extends bc.b {

    /* renamed from: a, reason: collision with root package name */
    public a0 f225a;

    @Override // bc.b
    public final boolean a(g gVar) {
        this.f225a.getClass();
        if (gVar == y0.f30031a) {
            return true;
        }
        return false;
    }

    @Override // bc.b
    public final Object b(g gVar) {
        this.f225a.getClass();
        if (gVar != y0.f30031a) {
            y1.a.b("Check failed.");
        }
        return (v0) this.f225a.f29937c.getValue();
    }
}
