package j7;

import b8.w;
import pe.z;
import q.x;
import ya.c0;

/* loaded from: classes.dex */
public final class a extends ve.i implements df.l {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f18983u;

    /* renamed from: v, reason: collision with root package name */
    public int f18984v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ f f18985w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f18986x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(f fVar, String str, te.c cVar, int i) {
        super(1, cVar);
        this.f18983u = i;
        this.f18985w = fVar;
        this.f18986x = str;
    }

    @Override // ve.a
    public final te.c create(te.c cVar) {
        switch (this.f18983u) {
            case 0:
                return new a(this.f18985w, this.f18986x, cVar, 0);
            case 1:
                return new a(this.f18985w, this.f18986x, cVar, 1);
            default:
                return new a(this.f18985w, this.f18986x, cVar, 2);
        }
    }

    @Override // df.l
    public final Object invoke(Object obj) {
        te.c cVar = (te.c) obj;
        switch (this.f18983u) {
            case 0:
                return ((a) create(cVar)).invokeSuspend(z.f22715a);
            case 1:
                return ((a) create(cVar)).invokeSuspend(z.f22715a);
            default:
                return ((a) create(cVar)).invokeSuspend(z.f22715a);
        }
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f18983u) {
            case 0:
                int i = this.f18984v;
                if (i != 0) {
                    if (i == 1) {
                        pe.a.e(obj);
                        return obj;
                    }
                    x.o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                pe.a.e(obj);
                this.f18984v = 1;
                Object c10 = c0.c(new w(this.f18986x, 6), this.f18985w.f18999a, this, true, false);
                ue.a aVar = ue.a.f27192u;
                if (c10 == aVar) {
                    return aVar;
                }
                return c10;
            case 1:
                int i10 = this.f18984v;
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
                this.f18984v = 1;
                Object c11 = c0.c(new w(this.f18986x, 5), this.f18985w.f18999a, this, false, true);
                ue.a aVar2 = ue.a.f27192u;
                if (c11 != aVar2) {
                    c11 = zVar;
                }
                if (c11 == aVar2) {
                    return aVar2;
                }
                return zVar;
            default:
                int i11 = this.f18984v;
                if (i11 != 0) {
                    if (i11 == 1) {
                        pe.a.e(obj);
                        return obj;
                    }
                    x.o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                pe.a.e(obj);
                this.f18984v = 1;
                Object c12 = c0.c(new w(this.f18986x, 4), this.f18985w.f18999a, this, true, false);
                ue.a aVar3 = ue.a.f27192u;
                if (c12 == aVar3) {
                    return aVar3;
                }
                return c12;
        }
    }
}
