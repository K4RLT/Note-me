package s6;

import pe.z;

/* loaded from: classes.dex */
public final class f extends ve.i implements df.l {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ g f24944u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ o6.a f24945v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ float f24946w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ boolean f24947x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, o6.a aVar, float f10, boolean z3, te.c cVar) {
        super(1, cVar);
        this.f24944u = gVar;
        this.f24945v = aVar;
        this.f24946w = f10;
        this.f24947x = z3;
    }

    @Override // ve.a
    public final te.c create(te.c cVar) {
        return new f(this.f24944u, this.f24945v, this.f24946w, this.f24947x, cVar);
    }

    @Override // df.l
    public final Object invoke(Object obj) {
        f fVar = (f) create((te.c) obj);
        z zVar = z.f22715a;
        fVar.invokeSuspend(zVar);
        return zVar;
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        pe.a.e(obj);
        o6.a aVar = this.f24945v;
        g gVar = this.f24944u;
        gVar.C.setValue(aVar);
        gVar.h(this.f24946w);
        gVar.g(1);
        gVar.f24948u.setValue(Boolean.FALSE);
        if (this.f24947x) {
            gVar.F.setValue(Long.MIN_VALUE);
        }
        return z.f22715a;
    }
}
