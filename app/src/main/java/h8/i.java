package h8;

import pe.z;
import q.x;
import t.f0;
import t.k2;
import v1.w;

/* loaded from: classes.dex */
public final class i extends ve.i implements df.p {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f17948u;

    /* renamed from: v, reason: collision with root package name */
    public int f17949v;

    /* renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f17950w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ f f17951x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(f fVar, te.c cVar, int i) {
        super(2, cVar);
        this.f17948u = i;
        this.f17951x = fVar;
    }

    @Override // ve.a
    public final te.c create(Object obj, te.c cVar) {
        switch (this.f17948u) {
            case 0:
                i iVar = new i(this.f17951x, cVar, 0);
                iVar.f17950w = obj;
                return iVar;
            default:
                i iVar2 = new i(this.f17951x, cVar, 1);
                iVar2.f17950w = obj;
                return iVar2;
        }
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        w wVar = (w) obj;
        te.c cVar = (te.c) obj2;
        switch (this.f17948u) {
            case 0:
                return ((i) create(wVar, cVar)).invokeSuspend(z.f22715a);
            default:
                return ((i) create(wVar, cVar)).invokeSuspend(z.f22715a);
        }
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f17948u) {
            case 0:
                int i = this.f17949v;
                if (i != 0) {
                    if (i == 1) {
                        pe.a.e(obj);
                    } else {
                        x.o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    pe.a.e(obj);
                    w wVar = (w) this.f17950w;
                    a1.f fVar = new a1.f(14, this.f17951x);
                    this.f17949v = 1;
                    Object e = k2.e(wVar, null, null, null, fVar, this, 7);
                    ue.a aVar = ue.a.f27192u;
                    if (e == aVar) {
                        return aVar;
                    }
                }
                return z.f22715a;
            default:
                int i10 = this.f17949v;
                if (i10 != 0) {
                    if (i10 == 1) {
                        pe.a.e(obj);
                    } else {
                        x.o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    pe.a.e(obj);
                    w wVar2 = (w) this.f17950w;
                    j jVar = new j(this.f17951x, 0);
                    this.f17949v = 1;
                    Object g8 = f0.g(wVar2, null, null, jVar, this, 7);
                    ue.a aVar2 = ue.a.f27192u;
                    if (g8 == aVar2) {
                        return aVar2;
                    }
                }
                return z.f22715a;
        }
    }
}
