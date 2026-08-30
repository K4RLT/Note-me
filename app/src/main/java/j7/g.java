package j7;

import b8.w;
import pe.z;
import q.x;
import ya.c0;

/* loaded from: classes.dex */
public final class g extends ve.i implements df.l {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f19001u;

    /* renamed from: v, reason: collision with root package name */
    public int f19002v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ l f19003w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f19004x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(l lVar, String str, te.c cVar, int i) {
        super(1, cVar);
        this.f19001u = i;
        this.f19003w = lVar;
        this.f19004x = str;
    }

    @Override // ve.a
    public final te.c create(te.c cVar) {
        switch (this.f19001u) {
            case 0:
                return new g(this.f19003w, this.f19004x, cVar, 0);
            case 1:
                return new g(this.f19003w, this.f19004x, cVar, 1);
            case 2:
                return new g(this.f19003w, this.f19004x, cVar, 2);
            default:
                return new g(this.f19003w, this.f19004x, cVar, 3);
        }
    }

    @Override // df.l
    public final Object invoke(Object obj) {
        te.c cVar = (te.c) obj;
        switch (this.f19001u) {
            case 0:
                return ((g) create(cVar)).invokeSuspend(z.f22715a);
            case 1:
                return ((g) create(cVar)).invokeSuspend(z.f22715a);
            case 2:
                return ((g) create(cVar)).invokeSuspend(z.f22715a);
            default:
                return ((g) create(cVar)).invokeSuspend(z.f22715a);
        }
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f19001u) {
            case 0:
                int i = this.f19002v;
                z zVar = z.f22715a;
                if (i != 0) {
                    if (i == 1) {
                        pe.a.e(obj);
                        return zVar;
                    }
                    x.o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                pe.a.e(obj);
                this.f19002v = 1;
                Object c10 = c0.c(new w(this.f19004x, 7), this.f19003w.f19018a, this, false, true);
                ue.a aVar = ue.a.f27192u;
                if (c10 != aVar) {
                    c10 = zVar;
                }
                if (c10 == aVar) {
                    return aVar;
                }
                return zVar;
            case 1:
                int i10 = this.f19002v;
                if (i10 != 0) {
                    if (i10 == 1) {
                        pe.a.e(obj);
                        return obj;
                    }
                    x.o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                pe.a.e(obj);
                this.f19002v = 1;
                Object c11 = c0.c(new w(this.f19004x, 9), this.f19003w.f19018a, this, true, false);
                ue.a aVar2 = ue.a.f27192u;
                if (c11 == aVar2) {
                    return aVar2;
                }
                return c11;
            case 2:
                int i11 = this.f19002v;
                z zVar2 = z.f22715a;
                if (i11 != 0) {
                    if (i11 == 1) {
                        pe.a.e(obj);
                        return zVar2;
                    }
                    x.o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                pe.a.e(obj);
                this.f19002v = 1;
                Object c12 = c0.c(new w(this.f19004x, 8), this.f19003w.f19018a, this, false, true);
                ue.a aVar3 = ue.a.f27192u;
                if (c12 != aVar3) {
                    c12 = zVar2;
                }
                if (c12 == aVar3) {
                    return aVar3;
                }
                return zVar2;
            default:
                int i12 = this.f19002v;
                if (i12 != 0) {
                    if (i12 == 1) {
                        pe.a.e(obj);
                        return obj;
                    }
                    x.o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                pe.a.e(obj);
                this.f19002v = 1;
                Object c13 = c0.c(new w(this.f19004x, 10), this.f19003w.f19018a, this, true, false);
                ue.a aVar4 = ue.a.f27192u;
                if (c13 == aVar4) {
                    return aVar4;
                }
                return c13;
        }
    }
}
