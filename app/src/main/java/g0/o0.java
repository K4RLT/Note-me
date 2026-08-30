package g0;
import a1.r;
import c0.d0;
import q.x;
import t.f0;
import t.t1;
import v1.w;

/* loaded from: classes.dex */
public final class o0 extends ve.i implements df.p {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f17228u;

    /* renamed from: v, reason: collision with root package name */
    public int f17229v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ w f17230w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ p1 f17231x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o0(w wVar, p1 p1Var, te.c cVar, int i) {
        super(2, cVar);
        this.f17228u = i;
        this.f17230w = wVar;
        this.f17231x = p1Var;
    }

    @Override // ve.a
    public final te.c create(Object obj, te.c cVar) {
        switch (this.f17228u) {
            case 0:
                return new o0(this.f17230w, this.f17231x, cVar, 0);
            case 1:
                return new o0(this.f17230w, this.f17231x, cVar, 1);
            default:
                return new o0(this.f17230w, this.f17231x, cVar, 2);
        }
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        pf.z zVar = (pf.z) obj;
        te.c cVar = (te.c) obj2;
        switch (this.f17228u) {
            case 0:
                return ((o0) create(zVar, cVar)).invokeSuspend(pe.z.f22715a);
            case 1:
                return ((o0) create(zVar, cVar)).invokeSuspend(pe.z.f22715a);
            default:
                return ((o0) create(zVar, cVar)).invokeSuspend(pe.z.f22715a);
        }
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f17228u) {
            case 0:
                int i = this.f17229v;
                if (i != 0) {
                    if (i == 1) {
                        pe.a.e(obj);
                    } else {
                        x.o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    pe.a.e(obj);
                    this.f17229v = 1;
                    Object r8 = r(this.f17230w, this.f17231x, this);
                    ue.a aVar = ue.a.f27192u;
                    if (r8 == aVar) {
                        return aVar;
                    }
                }
                return pe.z.f22715a;
            case 1:
                int i10 = this.f17229v;
                pe.z zVar = pe.z.f22715a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        pe.a.e(obj);
                        return zVar;
                    }
                    x.o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                pe.a.e(obj);
                this.f17229v = 1;
                Object e = t1.e(this.f17230w, new j1(this.f17231x, (te.c) null, 0), this);
                ue.a aVar2 = ue.a.f27192u;
                if (e != aVar2) {
                    e = zVar;
                }
                if (e == aVar2) {
                    return aVar2;
                }
                return zVar;
            default:
                int i11 = this.f17229v;
                pe.z zVar2 = pe.z.f22715a;
                if (i11 != 0) {
                    if (i11 == 1) {
                        pe.a.e(obj);
                    } else {
                        x.o("call to 'resume' before 'invoke' with coroutine");
                        zVar2 = null;
                    }
                    return zVar2;
                }
                pe.a.e(obj);
                this.f17229v = 1;
                p1 p1Var = this.f17231x;
                Object f10 = f0.f(this.f17230w, new h1(p1Var, 0), new i1(p1Var, 0), new i1(p1Var, 1), new d0(10, p1Var), this);
                ue.a aVar3 = ue.a.f27192u;
                if (f10 != aVar3) {
                    f10 = zVar2;
                }
                if (f10 == aVar3) {
                    return aVar3;
                }
                return zVar2;
        }
    }
}
