package j7;

import b8.b7;
import pe.z;
import q.x;
import ya.c0;

/* loaded from: classes.dex */
public final class h extends ve.i implements df.l {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f19005u;

    /* renamed from: v, reason: collision with root package name */
    public int f19006v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ l f19007w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(int i, l lVar, te.c cVar) {
        super(1, cVar);
        this.f19005u = i;
        this.f19007w = lVar;
    }

    @Override // ve.a
    public final te.c create(te.c cVar) {
        switch (this.f19005u) {
            case 0:
                return new h(0, this.f19007w, cVar);
            case 1:
                return new h(1, this.f19007w, cVar);
            default:
                return new h(2, this.f19007w, cVar);
        }
    }

    @Override // df.l
    public final Object invoke(Object obj) {
        te.c cVar = (te.c) obj;
        switch (this.f19005u) {
            case 0:
                return ((h) create(cVar)).invokeSuspend(z.f22715a);
            case 1:
                return ((h) create(cVar)).invokeSuspend(z.f22715a);
            default:
                return ((h) create(cVar)).invokeSuspend(z.f22715a);
        }
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f19005u) {
            case 0:
                int i = this.f19006v;
                if (i != 0) {
                    if (i == 1) {
                        pe.a.e(obj);
                        return obj;
                    }
                    x.o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                pe.a.e(obj);
                this.f19006v = 1;
                Object c10 = c0.c(new b7(28), this.f19007w.f19018a, this, true, false);
                ue.a aVar = ue.a.f27192u;
                if (c10 == aVar) {
                    return aVar;
                }
                return c10;
            case 1:
                int i10 = this.f19006v;
                if (i10 != 0) {
                    if (i10 == 1) {
                        pe.a.e(obj);
                        return obj;
                    }
                    x.o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                pe.a.e(obj);
                this.f19006v = 1;
                Object c11 = c0.c(new b7(29), this.f19007w.f19018a, this, true, false);
                ue.a aVar2 = ue.a.f27192u;
                if (c11 == aVar2) {
                    return aVar2;
                }
                return c11;
            default:
                int i11 = this.f19006v;
                if (i11 != 0) {
                    if (i11 == 1) {
                        pe.a.e(obj);
                        return obj;
                    }
                    x.o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                pe.a.e(obj);
                this.f19006v = 1;
                Object c12 = c0.c(new b7(27), this.f19007w.f19018a, this, true, false);
                ue.a aVar3 = ue.a.f27192u;
                if (c12 == aVar3) {
                    return aVar3;
                }
                return c12;
        }
    }
}
