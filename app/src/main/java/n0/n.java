package n0;
import d.c;

import pf.b0;
import pf.z;
import q.g1;
import q.x;
import r0.y;
import u7.o1;

/* loaded from: classes.dex */
public final class n extends ve.i implements df.p {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f20997u = 0;

    /* renamed from: v, reason: collision with root package name */
    public float f20998v;

    /* renamed from: w, reason: collision with root package name */
    public int f20999w;

    /* renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f21000x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f21001y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(o oVar, float f10, q.k kVar, te.c cVar) {
        super(2, cVar);
        this.f21000x = oVar;
        this.f20998v = f10;
        this.f21001y = kVar;
    }

    @Override // ve.a
    public final te.c create(Object obj, te.c cVar) {
        switch (this.f20997u) {
            case 0:
                return new n((o) this.f21000x, this.f20998v, (q.k) this.f21001y, cVar);
            case 1:
                n nVar = new n((g1) this.f21001y, cVar);
                nVar.f21000x = obj;
                return nVar;
            default:
                return new n((q.d) this.f21000x, (o1) this.f21001y, this.f20998v, cVar);
        }
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        z zVar = (z) obj;
        te.c cVar = (te.c) obj2;
        switch (this.f20997u) {
            case 0:
                return ((n) create(zVar, cVar)).invokeSuspend(pe.z.f22715a);
            case 1:
                return ((n) create(zVar, cVar)).invokeSuspend(pe.z.f22715a);
            default:
                return ((n) create(zVar, cVar)).invokeSuspend(pe.z.f22715a);
        }
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        float m4;
        z zVar;
        switch (this.f20997u) {
            case 0:
                int i = this.f20999w;
                if (i != 0) {
                    if (i == 1) {
                        pe.a.e(obj);
                    } else {
                        x.o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    pe.a.e(obj);
                    q.d dVar = (q.d) ((o) this.f21000x).f21004c;
                    Float f10 = new Float(this.f20998v);
                    q.k kVar = (q.k) this.f21001y;
                    this.f20999w = 1;
                    Object c10 = q.c(dVar, f10, kVar, this);
                    ue.a aVar = ue.a.f27192u;
                    if (c10 == aVar) {
                        return aVar;
                    }
                }
                return pe.z.f22715a;
            case 1:
                int i10 = this.f20999w;
                if (i10 != 0) {
                    if (i10 == 1) {
                        m4 = this.f20998v;
                        zVar = (z) this.f21000x;
                        pe.a.e(obj);
                    } else {
                        x.o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    pe.a.e(obj);
                    z zVar2 = (z) this.f21000x;
                    m4 = q.e.m(zVar2.A());
                    zVar = zVar2;
                }
                while (b0.t(zVar)) {
                    p0.i iVar = new p0.i((g1) this.f21001y, m4);
                    this.f21000x = zVar;
                    this.f20998v = m4;
                    this.f20999w = 1;
                    Object R = y.u(getContext()).R(iVar, this);
                    ue.a aVar2 = ue.a.f27192u;
                    if (R == aVar2) {
                        return aVar2;
                    }
                }
                return pe.z.f22715a;
            default:
                int i11 = this.f20999w;
                if (i11 != 0) {
                    if (i11 == 1) {
                        pe.a.e(obj);
                    } else {
                        x.o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    pe.a.e(obj);
                    q.d dVar2 = (q.d) this.f21000x;
                    Float f11 = new Float(((o1) this.f21001y).a(((Number) dVar2.e()).floatValue() + this.f20998v));
                    this.f20999w = 1;
                    Object g8 = dVar2.g(f11, this);
                    ue.a aVar3 = ue.a.f27192u;
                    if (g8 == aVar3) {
                        return aVar3;
                    }
                }
                return pe.z.f22715a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(q.d dVar, o1 o1Var, float f10, te.c cVar) {
        super(2, cVar);
        this.f21000x = dVar;
        this.f21001y = o1Var;
        this.f20998v = f10;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(g1 g1Var, te.c cVar) {
        super(2, cVar);
        this.f21001y = g1Var;
    }
}
