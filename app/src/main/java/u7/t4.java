package u7;
import q.d;
import q.e;
import q.k1;
import q.r0;
import q.x;
import q.y;
import r0.a1;

/* loaded from: classes.dex */
public final class t4 extends ve.i implements df.p {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f26886u;

    /* renamed from: v, reason: collision with root package name */
    public int f26887v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ d f26888w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ a1 f26889x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t4(d dVar, a1 a1Var, te.c cVar, int i) {
        super(2, cVar);
        this.f26886u = i;
        this.f26888w = dVar;
        this.f26889x = a1Var;
    }

    @Override // ve.a
    public final te.c create(Object obj, te.c cVar) {
        switch (this.f26886u) {
            case 0:
                return new t4(this.f26888w, this.f26889x, cVar, 0);
            case 1:
                return new t4(this.f26888w, this.f26889x, cVar, 1);
            default:
                return new t4(this.f26888w, this.f26889x, cVar, 2);
        }
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        pf.z zVar = (pf.z) obj;
        te.c cVar = (te.c) obj2;
        switch (this.f26886u) {
            case 0:
                return ((t4) create(zVar, cVar)).invokeSuspend(pe.z.f22715a);
            case 1:
                return ((t4) create(zVar, cVar)).invokeSuspend(pe.z.f22715a);
            default:
                return ((t4) create(zVar, cVar)).invokeSuspend(pe.z.f22715a);
        }
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        int i = this.f26886u;
        pe.z zVar = pe.z.f22715a;
        a1 a1Var = this.f26889x;
        float f10 = 0.0f;
        d dVar = this.f26888w;
        ue.a aVar = ue.a.f27192u;
        switch (i) {
            case 0:
                int i10 = this.f26887v;
                if (i10 != 0) {
                    if (i10 == 1) {
                        pe.a.e(obj);
                        return zVar;
                    }
                    x.o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                pe.a.e(obj);
                float f11 = k6.f26414a;
                if (((Boolean) a1Var.getValue()).booleanValue()) {
                    f10 = 1.0f;
                }
                Float f12 = new Float(f10);
                k1 s10 = e.s(420, 0, y.f23031a, 2);
                this.f26887v = 1;
                if (d.c(dVar, f12, s10, this) == aVar) {
                    return aVar;
                }
                return zVar;
            case 1:
                int i11 = this.f26887v;
                if (i11 != 0) {
                    if (i11 == 1) {
                        pe.a.e(obj);
                    } else {
                        x.o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    pe.a.e(obj);
                    Float f13 = new Float(0.0f);
                    r0 r8 = e.r(0.55f, 320.0f, null, 4);
                    this.f26887v = 1;
                    if (d.c(dVar, f13, r8, this) == aVar) {
                        return aVar;
                    }
                }
                a1Var.setValue(null);
                return zVar;
            default:
                int i12 = this.f26887v;
                if (i12 != 0) {
                    if (i12 == 1) {
                        pe.a.e(obj);
                    } else {
                        x.o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    pe.a.e(obj);
                    Float f14 = new Float(0.0f);
                    r0 r10 = e.r(0.55f, 320.0f, null, 4);
                    this.f26887v = 1;
                    if (d.c(dVar, f14, r10, this) == aVar) {
                        return aVar;
                    }
                }
                a1Var.setValue(null);
                return zVar;
        }
    }
}
