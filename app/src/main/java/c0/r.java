package c0;

/* loaded from: classes.dex */
public final class r extends kotlin.jvm.internal.m implements df.l {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ boolean f3397u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ d f3398v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ pf.z f3399w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(boolean z3, d dVar, pf.z zVar) {
        super(1);
        this.f3397u = z3;
        this.f3398v = dVar;
        this.f3399w = zVar;
    }

    @Override // df.l
    public final Object invoke(Object obj) {
        j2.j jVar = (j2.j) obj;
        pf.z zVar = this.f3399w;
        boolean z3 = this.f3397u;
        d dVar = this.f3398v;
        if (z3) {
            q qVar = new q(dVar, zVar, 0);
            kf.g[] gVarArr = j2.u.f18865a;
            jVar.k(j2.i.f18810x, new j2.a(null, qVar));
            jVar.k(j2.i.f18812z, new j2.a(null, new q(dVar, zVar, 1)));
        } else {
            q qVar2 = new q(dVar, zVar, 2);
            kf.g[] gVarArr2 = j2.u.f18865a;
            jVar.k(j2.i.f18811y, new j2.a(null, qVar2));
            jVar.k(j2.i.A, new j2.a(null, new q(dVar, zVar, 3)));
        }
        return pe.z.f22715a;
    }
}
