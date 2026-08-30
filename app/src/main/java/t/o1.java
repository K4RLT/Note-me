package t;
import a.a;
import j1.b;
import q.x;
import r.u0;

/* loaded from: classes.dex */
public final class o1 extends ve.i implements df.p {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f25485u;

    /* renamed from: v, reason: collision with root package name */
    public int f25486v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ r1 f25487w;

    /* renamed from: x, reason: collision with root package name */
    public /* synthetic */ long f25488x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o1(r1 r1Var, long j10, te.c cVar, int i) {
        super(2, cVar);
        this.f25485u = i;
        this.f25487w = r1Var;
        this.f25488x = j10;
    }

    @Override // ve.a
    public final te.c create(Object obj, te.c cVar) {
        switch (this.f25485u) {
            case 0:
                return new o1(this.f25487w, this.f25488x, cVar, 0);
            case 1:
                return new o1(this.f25487w, this.f25488x, cVar, 1);
            case 2:
                return new o1(this.f25487w, this.f25488x, cVar, 2);
            default:
                o1 o1Var = new o1(this.f25487w, cVar);
                o1Var.f25488x = ((b) obj).f18762a;
                return o1Var;
        }
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f25485u) {
            case 0:
                return ((o1) create((pf.z) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
            case 1:
                return ((o1) create((pf.z) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
            case 2:
                return ((o1) create((pf.z) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
            default:
                long j10 = ((b) obj).f18762a;
                o1 o1Var = new o1(this.f25487w, (te.c) obj2);
                o1Var.f25488x = j10;
                return o1Var.invokeSuspend(pe.z.f22715a);
        }
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f25485u) {
            case 0:
                int i = this.f25486v;
                if (i != 0) {
                    if (i == 1) {
                        pe.a.e(obj);
                    } else {
                        x.o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    pe.a.e(obj);
                    z1 z1Var = this.f25487w.X;
                    long j10 = this.f25488x;
                    this.f25486v = 1;
                    Object c10 = z1Var.c(j10, false, this);
                    ue.a aVar = ue.a.f27192u;
                    if (c10 == aVar) {
                        return aVar;
                    }
                }
                return pe.z.f22715a;
            case 1:
                int i10 = this.f25486v;
                if (i10 != 0) {
                    if (i10 == 1) {
                        pe.a.e(obj);
                    } else {
                        x.o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    pe.a.e(obj);
                    z1 z1Var2 = this.f25487w.X;
                    p1 p1Var = new p1(this.f25488x, null);
                    this.f25486v = 1;
                    Object f10 = z1Var2.f(u0.f24149v, p1Var, this);
                    ue.a aVar2 = ue.a.f27192u;
                    if (f10 == aVar2) {
                        return aVar2;
                    }
                }
                return pe.z.f22715a;
            case 2:
                int i11 = this.f25486v;
                if (i11 != 0) {
                    if (i11 == 1) {
                        pe.a.e(obj);
                    } else {
                        x.o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    pe.a.e(obj);
                    z1 z1Var3 = this.f25487w.X;
                    long j11 = this.f25488x;
                    this.f25486v = 1;
                    Object c11 = z1Var3.c(j11, true, this);
                    ue.a aVar3 = ue.a.f27192u;
                    if (c11 == aVar3) {
                        return aVar3;
                    }
                }
                return pe.z.f22715a;
            default:
                int i12 = this.f25486v;
                if (i12 != 0) {
                    if (i12 == 1) {
                        pe.a.e(obj);
                        return obj;
                    }
                    x.o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                pe.a.e(obj);
                long j12 = this.f25488x;
                z1 z1Var4 = this.f25487w.X;
                this.f25486v = 1;
                Object a10 = androidx.compose.foundation.gestures.a(z1Var4, j12, this);
                ue.a aVar4 = ue.a.f27192u;
                if (a10 == aVar4) {
                    return aVar4;
                }
                return a10;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o1(r1 r1Var, te.c cVar) {
        super(2, cVar);
        this.f25485u = 3;
        this.f25487w = r1Var;
    }
}
