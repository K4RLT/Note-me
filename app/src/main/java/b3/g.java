package b3;

import pf.b0;
import pf.z;
import q.x;
import r0.a1;

/* loaded from: classes.dex */
public final class g extends ve.i implements df.p {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f1655u = 1;

    /* renamed from: v, reason: collision with root package name */
    public int f1656v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ boolean f1657w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ long f1658x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f1659y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(boolean z3, long j10, a1 a1Var, te.c cVar) {
        super(2, cVar);
        this.f1657w = z3;
        this.f1658x = j10;
        this.f1659y = a1Var;
    }

    @Override // ve.a
    public final te.c create(Object obj, te.c cVar) {
        switch (this.f1655u) {
            case 0:
                return new g(this.f1657w, (k) this.f1659y, this.f1658x, cVar);
            default:
                return new g(this.f1657w, this.f1658x, (a1) this.f1659y, cVar);
        }
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        z zVar = (z) obj;
        te.c cVar = (te.c) obj2;
        switch (this.f1655u) {
            case 0:
                return ((g) create(zVar, cVar)).invokeSuspend(pe.z.f22715a);
            default:
                return ((g) create(zVar, cVar)).invokeSuspend(pe.z.f22715a);
        }
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f1655u) {
            case 0:
                int i = this.f1656v;
                if (i != 0) {
                    if (i != 1) {
                        if (i == 2) {
                            pe.a.e(obj);
                            ((y2.q) obj).getClass();
                        } else {
                            x.o("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    } else {
                        pe.a.e(obj);
                        ((y2.q) obj).getClass();
                    }
                } else {
                    pe.a.e(obj);
                    u1.d dVar = ((k) this.f1659y).f1670u;
                    ue.a aVar = ue.a.f27192u;
                    if (!this.f1657w) {
                        this.f1656v = 1;
                        Object a10 = dVar.a(0L, this.f1658x, this);
                        if (a10 != aVar) {
                            obj = a10;
                            ((y2.q) obj).getClass();
                        } else {
                            return aVar;
                        }
                    } else {
                        this.f1656v = 2;
                        Object a11 = dVar.a(this.f1658x, 0L, this);
                        if (a11 != aVar) {
                            obj = a11;
                            ((y2.q) obj).getClass();
                        } else {
                            return aVar;
                        }
                    }
                }
                return pe.z.f22715a;
            default:
                a1 a1Var = (a1) this.f1659y;
                int i10 = this.f1656v;
                if (i10 != 0) {
                    if (i10 == 1) {
                        pe.a.e(obj);
                    } else {
                        x.o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    pe.a.e(obj);
                    if (!this.f1657w) {
                        a1Var.setValue(Boolean.FALSE);
                        return pe.z.f22715a;
                    }
                    this.f1656v = 1;
                    Object j10 = b0.j(this.f1658x, this);
                    ue.a aVar2 = ue.a.f27192u;
                    if (j10 == aVar2) {
                        return aVar2;
                    }
                }
                a1Var.setValue(Boolean.TRUE);
                return pe.z.f22715a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(boolean z3, k kVar, long j10, te.c cVar) {
        super(2, cVar);
        this.f1657w = z3;
        this.f1659y = kVar;
        this.f1658x = j10;
    }
}
