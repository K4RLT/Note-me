package tf;

/* loaded from: classes.dex */
public final class w implements te.c, ve.d {

    /* renamed from: u, reason: collision with root package name */
    public final te.c f25757u;

    /* renamed from: v, reason: collision with root package name */
    public final te.g f25758v;

    public w(te.c cVar, te.g gVar) {
        this.f25757u = cVar;
        this.f25758v = gVar;
    }

    @Override // ve.d
    public final ve.d getCallerFrame() {
        te.c cVar = this.f25757u;
        if (cVar instanceof ve.d) {
            return (ve.d) cVar;
        }
        return null;
    }

    @Override // te.c
    public final te.g getContext() {
        return this.f25758v;
    }

    @Override // te.c
    public final void resumeWith(Object obj) {
        this.f25757u.resumeWith(obj);
    }
}
