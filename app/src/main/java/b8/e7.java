package b8;
import b0.j;
import r0.a1;
import u7.u0;

/* loaded from: classes.dex */
public final class e7 extends ve.i implements df.p {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f2030u;

    /* renamed from: v, reason: collision with root package name */
    public int f2031v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ a1 f2032w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e7(a1 a1Var, te.c cVar, int i) {
        super(2, cVar);
        this.f2030u = i;
        this.f2032w = a1Var;
    }

    @Override // ve.a
    public final te.c create(Object obj, te.c cVar) {
        switch (this.f2030u) {
            case 0:
                return new e7(this.f2032w, cVar, 0);
            case 1:
                return new e7(this.f2032w, cVar, 1);
            default:
                return new e7(this.f2032w, cVar, 2);
        }
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        pf.z zVar = (pf.z) obj;
        te.c cVar = (te.c) obj2;
        switch (this.f2030u) {
            case 0:
                return ((e7) create(zVar, cVar)).invokeSuspend(pe.z.f22715a);
            case 1:
                return ((e7) create(zVar, cVar)).invokeSuspend(pe.z.f22715a);
            default:
                return ((e7) create(zVar, cVar)).invokeSuspend(pe.z.f22715a);
        }
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        int i = this.f2030u;
        pe.z zVar = pe.z.f22715a;
        ue.a aVar = ue.a.f27192u;
        a1 a1Var = this.f2032w;
        switch (i) {
            case 0:
                int i10 = this.f2031v;
                if (i10 != 0) {
                    if (i10 == 1) {
                        pe.a.e(obj);
                    } else {
                        q.x.o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    pe.a.e(obj);
                    float f10 = f7.f2084a;
                    int intValue = ((Number) a1Var.getValue()).intValue();
                    if (intValue != 1) {
                        if (intValue == 2) {
                            sf.n0 n0Var = z6.f3087a;
                            z6.f3089c.setValue(Boolean.FALSE);
                            return zVar;
                        }
                        return zVar;
                    }
                    this.f2031v = 1;
                    if (pf.j(11000L, this) == aVar) {
                        return aVar;
                    }
                }
                float f11 = f7.f2084a;
                a1Var.setValue(2);
                return zVar;
            case 1:
                int i11 = this.f2031v;
                if (i11 != 0) {
                    if (i11 == 1) {
                        pe.a.e(obj);
                    } else {
                        q.x.o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    pe.a.e(obj);
                    float f12 = u0.f26903a;
                    if (((Boolean) a1Var.getValue()).booleanValue()) {
                        this.f2031v = 1;
                        if (pf.j(3500L, this) == aVar) {
                            return aVar;
                        }
                    } else {
                        return zVar;
                    }
                }
                float f13 = u0.f26903a;
                a1Var.setValue(Boolean.FALSE);
                return zVar;
            default:
                int i12 = this.f2031v;
                if (i12 != 0) {
                    if (i12 == 1) {
                        pe.a.e(obj);
                    } else {
                        q.x.o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    pe.a.e(obj);
                    float f14 = w7.j4.f28501a;
                    if (((Boolean) a1Var.getValue()).booleanValue()) {
                        this.f2031v = 1;
                        if (pf.j(450L, this) == aVar) {
                            return aVar;
                        }
                    } else {
                        return zVar;
                    }
                }
                float f15 = w7.j4.f28501a;
                a1Var.setValue(Boolean.FALSE);
                return zVar;
        }
    }
}
