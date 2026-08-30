package j7;

import pe.z;
import q.x;
import ya.c0;

/* loaded from: classes.dex */
public final class b extends ve.i implements df.l {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f18987u;

    /* renamed from: v, reason: collision with root package name */
    public int f18988v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f18989w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f18990x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f18991y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(Object obj, String str, int i, te.c cVar, int i10) {
        super(1, cVar);
        this.f18987u = i10;
        this.f18991y = obj;
        this.f18989w = str;
        this.f18990x = i;
    }

    @Override // ve.a
    public final te.c create(te.c cVar) {
        switch (this.f18987u) {
            case 0:
                return new b((f) this.f18991y, this.f18989w, this.f18990x, cVar, 0);
            case 1:
                return new b((l) this.f18991y, this.f18989w, this.f18990x, cVar, 1);
            default:
                return new b((q) this.f18991y, this.f18989w, this.f18990x, cVar, 2);
        }
    }

    @Override // df.l
    public final Object invoke(Object obj) {
        te.c cVar = (te.c) obj;
        switch (this.f18987u) {
            case 0:
                return ((b) create(cVar)).invokeSuspend(z.f22715a);
            case 1:
                return ((b) create(cVar)).invokeSuspend(z.f22715a);
            default:
                return ((b) create(cVar)).invokeSuspend(z.f22715a);
        }
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f18987u) {
            case 0:
                int i = this.f18988v;
                if (i != 0) {
                    if (i == 1) {
                        pe.a.e(obj);
                        return obj;
                    }
                    x.o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                pe.a.e(obj);
                f fVar = (f) this.f18991y;
                this.f18988v = 1;
                Object c10 = c0.c(new c(this.f18989w, this.f18990x), fVar.f18999a, this, true, false);
                ue.a aVar = ue.a.f27192u;
                if (c10 == aVar) {
                    return aVar;
                }
                return c10;
            case 1:
                int i10 = this.f18988v;
                z zVar = z.f22715a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        pe.a.e(obj);
                        return zVar;
                    }
                    x.o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                pe.a.e(obj);
                l lVar = (l) this.f18991y;
                this.f18988v = 1;
                Object c11 = c0.c(new c(this.f18989w, this.f18990x, 1), lVar.f19018a, this, false, true);
                ue.a aVar2 = ue.a.f27192u;
                if (c11 != aVar2) {
                    c11 = zVar;
                }
                if (c11 == aVar2) {
                    return aVar2;
                }
                return zVar;
            default:
                int i11 = this.f18988v;
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
                q qVar = (q) this.f18991y;
                this.f18988v = 1;
                Object c12 = c0.c(new c(this.f18989w, this.f18990x, 2), qVar.f19034a, this, false, true);
                ue.a aVar3 = ue.a.f27192u;
                if (c12 != aVar3) {
                    c12 = zVar2;
                }
                if (c12 == aVar3) {
                    return aVar3;
                }
                return zVar2;
        }
    }
}
