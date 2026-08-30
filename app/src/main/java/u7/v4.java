package u7;
import k6.t;
import q.d;
import q.x;
import r0.f1;

/* loaded from: classes.dex */
public final class v4 extends ve.i implements df.p {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f26956u;

    /* renamed from: v, reason: collision with root package name */
    public int f26957v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ l2 f26958w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ d f26959x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ f1 f26960y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v4(l2 l2Var, d dVar, f1 f1Var, te.c cVar, int i) {
        super(2, cVar);
        this.f26956u = i;
        this.f26958w = l2Var;
        this.f26959x = dVar;
        this.f26960y = f1Var;
    }

    @Override // ve.a
    public final te.c create(Object obj, te.c cVar) {
        switch (this.f26956u) {
            case 0:
                return new v4(this.f26958w, this.f26959x, this.f26960y, cVar, 0);
            case 1:
                return new v4(this.f26958w, this.f26959x, this.f26960y, cVar, 1);
            case 2:
                return new v4(this.f26958w, this.f26959x, this.f26960y, cVar, 2);
            default:
                return new v4(this.f26958w, this.f26959x, this.f26960y, cVar, 3);
        }
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        pf.z zVar = (pf.z) obj;
        te.c cVar = (te.c) obj2;
        switch (this.f26956u) {
            case 0:
                return ((v4) create(zVar, cVar)).invokeSuspend(pe.z.f22715a);
            case 1:
                return ((v4) create(zVar, cVar)).invokeSuspend(pe.z.f22715a);
            case 2:
                return ((v4) create(zVar, cVar)).invokeSuspend(pe.z.f22715a);
            default:
                return ((v4) create(zVar, cVar)).invokeSuspend(pe.z.f22715a);
        }
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        int i = this.f26956u;
        pe.z zVar = pe.z.f22715a;
        f1 f1Var = this.f26960y;
        d dVar = this.f26959x;
        l2 l2Var = this.f26958w;
        ue.a aVar = ue.a.f27192u;
        switch (i) {
            case 0:
                int i10 = this.f26957v;
                if (i10 != 0) {
                    if (i10 == 1) {
                        pe.a.e(obj);
                        return zVar;
                    }
                    x.o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                pe.a.e(obj);
                float f10 = k6.f26414a;
                int h3 = f1Var.h();
                this.f26957v = 1;
                if (t(l2Var, dVar, h3, this) == aVar) {
                    return aVar;
                }
                return zVar;
            case 1:
                int i11 = this.f26957v;
                if (i11 != 0) {
                    if (i11 == 1) {
                        pe.a.e(obj);
                        return zVar;
                    }
                    x.o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                pe.a.e(obj);
                float f11 = k6.f26414a;
                int h10 = f1Var.h();
                this.f26957v = 1;
                if (t(l2Var, dVar, h10, this) == aVar) {
                    return aVar;
                }
                return zVar;
            case 2:
                int i12 = this.f26957v;
                if (i12 != 0) {
                    if (i12 == 1) {
                        pe.a.e(obj);
                        return zVar;
                    }
                    x.o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                pe.a.e(obj);
                float f12 = k6.f26414a;
                int h11 = f1Var.h();
                this.f26957v = 1;
                if (t(l2Var, dVar, h11, this) == aVar) {
                    return aVar;
                }
                return zVar;
            default:
                int i13 = this.f26957v;
                if (i13 != 0) {
                    if (i13 == 1) {
                        pe.a.e(obj);
                        return zVar;
                    }
                    x.o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                pe.a.e(obj);
                float f13 = k6.f26414a;
                int h12 = f1Var.h();
                this.f26957v = 1;
                if (t(l2Var, dVar, h12, this) == aVar) {
                    return aVar;
                }
                return zVar;
        }
    }
}
