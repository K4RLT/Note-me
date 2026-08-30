package j7;

import pe.z;
import q.x;
import ya.c0;

/* loaded from: classes.dex */
public final class m extends ve.i implements df.l {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f19021u;

    /* renamed from: v, reason: collision with root package name */
    public int f19022v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ q f19023w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(q qVar, te.c cVar, int i) {
        super(1, cVar);
        this.f19021u = i;
        this.f19023w = qVar;
    }

    @Override // ve.a
    public final te.c create(te.c cVar) {
        switch (this.f19021u) {
            case 0:
                return new m(this.f19023w, cVar, 0);
            case 1:
                return new m(this.f19023w, cVar, 1);
            default:
                return new m(this.f19023w, cVar, 2);
        }
    }

    @Override // df.l
    public final Object invoke(Object obj) {
        te.c cVar = (te.c) obj;
        switch (this.f19021u) {
            case 0:
                return ((m) create(cVar)).invokeSuspend(z.f22715a);
            case 1:
                return ((m) create(cVar)).invokeSuspend(z.f22715a);
            default:
                return ((m) create(cVar)).invokeSuspend(z.f22715a);
        }
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f19021u) {
            case 0:
                int i = this.f19022v;
                if (i != 0) {
                    if (i == 1) {
                        pe.a.e(obj);
                        return obj;
                    }
                    x.o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                pe.a.e(obj);
                this.f19022v = 1;
                Object c10 = c0.c(new p(1), this.f19023w.f19034a, this, true, false);
                ue.a aVar = ue.a.f27192u;
                if (c10 == aVar) {
                    return aVar;
                }
                return c10;
            case 1:
                int i10 = this.f19022v;
                if (i10 != 0) {
                    if (i10 == 1) {
                        pe.a.e(obj);
                        return obj;
                    }
                    x.o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                pe.a.e(obj);
                this.f19022v = 1;
                Object c11 = c0.c(new p(0), this.f19023w.f19034a, this, true, false);
                ue.a aVar2 = ue.a.f27192u;
                if (c11 == aVar2) {
                    return aVar2;
                }
                return c11;
            default:
                int i11 = this.f19022v;
                if (i11 != 0) {
                    if (i11 == 1) {
                        pe.a.e(obj);
                        return obj;
                    }
                    x.o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                pe.a.e(obj);
                this.f19022v = 1;
                Object c12 = c0.c(new p(3), this.f19023w.f19034a, this, true, false);
                ue.a aVar3 = ue.a.f27192u;
                if (c12 == aVar3) {
                    return aVar3;
                }
                return c12;
        }
    }
}
