package b8;
import r0.a1;
import v.i;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class ib extends ve.i implements df.p {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f2227u;

    /* renamed from: v, reason: collision with root package name */
    public int f2228v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ i f2229w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ a1 f2230x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ib(i iVar, a1 a1Var, te.c cVar, int i) {
        super(2, cVar);
        this.f2227u = i;
        this.f2229w = iVar;
        this.f2230x = a1Var;
    }

    @Override // ve.a
    public final te.c create(Object obj, te.c cVar) {
        switch (this.f2227u) {
            case 0:
                return new ib(this.f2229w, this.f2230x, cVar, 0);
            default:
                return new ib(this.f2229w, this.f2230x, cVar, 1);
        }
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        pf.z zVar = (pf.z) obj;
        te.c cVar = (te.c) obj2;
        switch (this.f2227u) {
            case 0:
                return ((ib) create(zVar, cVar)).invokeSuspend(pe.z.f22715a);
            default:
                return ((ib) create(zVar, cVar)).invokeSuspend(pe.z.f22715a);
        }
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f2227u) {
            case 0:
                int i = this.f2228v;
                if (i != 0) {
                    if (i == 1) {
                        pe.a.e(obj);
                        return pe.z.f22715a;
                    }
                    q.x.o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                pe.a.e(obj);
                ArrayList arrayList = new ArrayList();
                sf.d0 d0Var = this.f2229w.f27257a;
                hb hbVar = new hb(arrayList, this.f2230x, 0);
                this.f2228v = 1;
                d0Var.getClass();
                sf.d0.k(d0Var, hbVar, this);
                return ue.a.f27192u;
            default:
                int i10 = this.f2228v;
                if (i10 != 0) {
                    if (i10 == 1) {
                        pe.a.e(obj);
                        return pe.z.f22715a;
                    }
                    q.x.o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                pe.a.e(obj);
                ArrayList arrayList2 = new ArrayList();
                sf.d0 d0Var2 = this.f2229w.f27257a;
                hb hbVar2 = new hb(arrayList2, this.f2230x, 1);
                this.f2228v = 1;
                d0Var2.getClass();
                sf.d0.k(d0Var2, hbVar2, this);
                return ue.a.f27192u;
        }
    }
}
