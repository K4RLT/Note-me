package i5;

/* loaded from: classes.dex */
public final class k implements sf.g {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ sf.g f18257u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ g5.v f18258v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ df.l f18259w;

    public k(sf.g gVar, g5.v vVar, df.l lVar) {
        this.f18257u = gVar;
        this.f18258v = vVar;
        this.f18259w = lVar;
    }

    @Override // sf.g
    public final Object b(sf.h hVar, te.c cVar) {
        Object b10 = this.f18257u.b(new j(0, hVar, this.f18258v, this.f18259w), cVar);
        if (b10 == ue.a.f27192u) {
            return b10;
        }
        return pe.z.f22715a;
    }
}
