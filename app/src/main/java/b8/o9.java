package b8;
import r0.a1;
import z5.d;

/* loaded from: classes.dex */
public final class o9 extends ve.i implements df.p {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f2492u;

    /* renamed from: v, reason: collision with root package name */
    public int f2493v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ u6 f2494w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ ca f2495x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ a1 f2496y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o9(u6 u6Var, ca caVar, a1 a1Var, te.c cVar, int i) {
        super(2, cVar);
        this.f2492u = i;
        this.f2494w = u6Var;
        this.f2495x = caVar;
        this.f2496y = a1Var;
    }

    @Override // ve.a
    public final te.c create(Object obj, te.c cVar) {
        switch (this.f2492u) {
            case 0:
                return new o9(this.f2494w, this.f2495x, this.f2496y, cVar, 0);
            default:
                return new o9(this.f2494w, this.f2495x, this.f2496y, cVar, 1);
        }
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        pf.z zVar = (pf.z) obj;
        te.c cVar = (te.c) obj2;
        switch (this.f2492u) {
            case 0:
                return ((o9) create(zVar, cVar)).invokeSuspend(pe.z.f22715a);
            default:
                return ((o9) create(zVar, cVar)).invokeSuspend(pe.z.f22715a);
        }
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        int i = this.f2492u;
        pe.z zVar = pe.z.f22715a;
        a1 a1Var = this.f2496y;
        ca caVar = this.f2495x;
        u6 u6Var = this.f2494w;
        ue.a aVar = ue.a.f27192u;
        switch (i) {
            case 0:
                int i10 = this.f2493v;
                if (i10 != 0) {
                    if (i10 == 1) {
                        pe.a.e(obj);
                    } else {
                        q.x.o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    pe.a.e(obj);
                    String str = caVar.f1935a;
                    this.f2493v = 1;
                    obj = u6Var.h(str, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                ca caVar2 = (ca) obj;
                if (caVar2 != null) {
                    q.t tVar = z9.f3099a;
                    a1Var.setValue(caVar2);
                }
                z5 z5Var = z5.f3075a;
                d();
                return zVar;
            default:
                int i11 = this.f2493v;
                if (i11 != 0) {
                    if (i11 == 1) {
                        pe.a.e(obj);
                    } else {
                        q.x.o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    pe.a.e(obj);
                    String str2 = caVar.f1935a;
                    this.f2493v = 1;
                    if (u6Var.a(str2, this) == aVar) {
                        return aVar;
                    }
                }
                z5 z5Var2 = z5.f3075a;
                d();
                la laVar = la.EXPLORE;
                q.t tVar2 = z9.f3099a;
                a1Var.setValue(laVar);
                return zVar;
        }
    }
}
