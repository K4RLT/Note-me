package b8;
import d.c;

/* loaded from: classes.dex */
public final class fa extends ve.i implements df.p {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f2093u;

    /* renamed from: v, reason: collision with root package name */
    public int f2094v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ q.d f2095w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ float f2096x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fa(float f10, int i, q.d dVar, te.c cVar) {
        super(2, cVar);
        this.f2093u = i;
        this.f2095w = dVar;
        this.f2096x = f10;
    }

    @Override // ve.a
    public final te.c create(Object obj, te.c cVar) {
        switch (this.f2093u) {
            case 0:
                return new fa(this.f2096x, 0, this.f2095w, cVar);
            case 1:
                return new fa(this.f2096x, 1, this.f2095w, cVar);
            case 2:
                return new fa(this.f2096x, 2, this.f2095w, cVar);
            case 3:
                return new fa(this.f2096x, 3, this.f2095w, cVar);
            case 4:
                return new fa(this.f2096x, 4, this.f2095w, cVar);
            case 5:
                return new fa(this.f2096x, 5, this.f2095w, cVar);
            case 6:
                return new fa(this.f2096x, 6, this.f2095w, cVar);
            case 7:
                return new fa(this.f2096x, 7, this.f2095w, cVar);
            default:
                return new fa(this.f2096x, 8, this.f2095w, cVar);
        }
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        pf.z zVar = (pf.z) obj;
        te.c cVar = (te.c) obj2;
        switch (this.f2093u) {
            case 0:
                return ((fa) create(zVar, cVar)).invokeSuspend(pe.z.f22715a);
            case 1:
                return ((fa) create(zVar, cVar)).invokeSuspend(pe.z.f22715a);
            case 2:
                return ((fa) create(zVar, cVar)).invokeSuspend(pe.z.f22715a);
            case 3:
                return ((fa) create(zVar, cVar)).invokeSuspend(pe.z.f22715a);
            case 4:
                return ((fa) create(zVar, cVar)).invokeSuspend(pe.z.f22715a);
            case 5:
                return ((fa) create(zVar, cVar)).invokeSuspend(pe.z.f22715a);
            case 6:
                return ((fa) create(zVar, cVar)).invokeSuspend(pe.z.f22715a);
            case 7:
                return ((fa) create(zVar, cVar)).invokeSuspend(pe.z.f22715a);
            default:
                return ((fa) create(zVar, cVar)).invokeSuspend(pe.z.f22715a);
        }
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f2093u) {
            case 0:
                int i = this.f2094v;
                if (i != 0) {
                    if (i == 1) {
                        pe.a.e(obj);
                    } else {
                        q.x.o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    pe.a.e(obj);
                    Float f10 = new Float(this.f2096x);
                    q.k1 s10 = q.e.s(220, 0, null, 6);
                    this.f2094v = 1;
                    Object c10 = q.c(this.f2095w, f10, s10, this);
                    ue.a aVar = ue.a.f27192u;
                    if (c10 == aVar) {
                        return aVar;
                    }
                }
                return pe.z.f22715a;
            case 1:
                int i10 = this.f2094v;
                if (i10 != 0) {
                    if (i10 == 1) {
                        pe.a.e(obj);
                    } else {
                        q.x.o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    pe.a.e(obj);
                    Float f11 = new Float(this.f2096x);
                    q.k1 s11 = q.e.s(1600, 0, q.y.f23031a, 2);
                    this.f2094v = 1;
                    Object c11 = q.c(this.f2095w, f11, s11, this);
                    ue.a aVar2 = ue.a.f27192u;
                    if (c11 == aVar2) {
                        return aVar2;
                    }
                }
                return pe.z.f22715a;
            case 2:
                int i11 = this.f2094v;
                if (i11 != 0) {
                    if (i11 == 1) {
                        pe.a.e(obj);
                    } else {
                        q.x.o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    pe.a.e(obj);
                    Float f12 = new Float(this.f2096x);
                    q.k1 s12 = q.e.s(400, 0, q.y.f23031a, 2);
                    this.f2094v = 1;
                    Object c12 = q.c(this.f2095w, f12, s12, this);
                    ue.a aVar3 = ue.a.f27192u;
                    if (c12 == aVar3) {
                        return aVar3;
                    }
                }
                return pe.z.f22715a;
            case 3:
                int i12 = this.f2094v;
                if (i12 != 0) {
                    if (i12 == 1) {
                        pe.a.e(obj);
                    } else {
                        q.x.o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    pe.a.e(obj);
                    Float f13 = new Float(this.f2096x);
                    q.r0 r8 = q.e.r(0.65f, 400.0f, null, 4);
                    this.f2094v = 1;
                    Object c13 = q.c(this.f2095w, f13, r8, this);
                    ue.a aVar4 = ue.a.f27192u;
                    if (c13 == aVar4) {
                        return aVar4;
                    }
                }
                return pe.z.f22715a;
            case 4:
                int i13 = this.f2094v;
                if (i13 != 0) {
                    if (i13 == 1) {
                        pe.a.e(obj);
                    } else {
                        q.x.o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    pe.a.e(obj);
                    Float f14 = new Float(this.f2096x);
                    this.f2094v = 1;
                    Object g8 = this.f2095w.g(f14, this);
                    ue.a aVar5 = ue.a.f27192u;
                    if (g8 == aVar5) {
                        return aVar5;
                    }
                }
                return pe.z.f22715a;
            case 5:
                int i14 = this.f2094v;
                if (i14 != 0) {
                    if (i14 == 1) {
                        pe.a.e(obj);
                    } else {
                        q.x.o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    pe.a.e(obj);
                    Float f15 = new Float(this.f2096x);
                    this.f2094v = 1;
                    Object g10 = this.f2095w.g(f15, this);
                    ue.a aVar6 = ue.a.f27192u;
                    if (g10 == aVar6) {
                        return aVar6;
                    }
                }
                return pe.z.f22715a;
            case 6:
                int i15 = this.f2094v;
                if (i15 != 0) {
                    if (i15 == 1) {
                        pe.a.e(obj);
                    } else {
                        q.x.o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    pe.a.e(obj);
                    Float f16 = new Float(this.f2096x);
                    this.f2094v = 1;
                    Object g11 = this.f2095w.g(f16, this);
                    ue.a aVar7 = ue.a.f27192u;
                    if (g11 == aVar7) {
                        return aVar7;
                    }
                }
                return pe.z.f22715a;
            case 7:
                int i16 = this.f2094v;
                if (i16 != 0) {
                    if (i16 == 1) {
                        pe.a.e(obj);
                    } else {
                        q.x.o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    pe.a.e(obj);
                    Float f17 = new Float(this.f2096x);
                    this.f2094v = 1;
                    Object g12 = this.f2095w.g(f17, this);
                    ue.a aVar8 = ue.a.f27192u;
                    if (g12 == aVar8) {
                        return aVar8;
                    }
                }
                return pe.z.f22715a;
            default:
                int i17 = this.f2094v;
                if (i17 != 0) {
                    if (i17 == 1) {
                        pe.a.e(obj);
                    } else {
                        q.x.o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    pe.a.e(obj);
                    Float f18 = new Float(this.f2096x);
                    q.k1 s13 = q.e.s(330, 0, q.y.f23032b, 2);
                    this.f2094v = 1;
                    Object c14 = q.c(this.f2095w, f18, s13, this);
                    ue.a aVar9 = ue.a.f27192u;
                    if (c14 == aVar9) {
                        return aVar9;
                    }
                }
                return pe.z.f22715a;
        }
    }
}
