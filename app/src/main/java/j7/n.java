package j7;

import b8.w;
import pe.z;
import q.x;
import ya.c0;

/* loaded from: classes.dex */
public final class n extends ve.i implements df.l {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f19024u;

    /* renamed from: v, reason: collision with root package name */
    public int f19025v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ q f19026w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f19027x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(q qVar, String str, te.c cVar, int i) {
        super(1, cVar);
        this.f19024u = i;
        this.f19026w = qVar;
        this.f19027x = str;
    }

    @Override // ve.a
    public final te.c create(te.c cVar) {
        switch (this.f19024u) {
            case 0:
                return new n(this.f19026w, this.f19027x, cVar, 0);
            default:
                return new n(this.f19026w, this.f19027x, cVar, 1);
        }
    }

    @Override // df.l
    public final Object invoke(Object obj) {
        te.c cVar = (te.c) obj;
        switch (this.f19024u) {
            case 0:
                return ((n) create(cVar)).invokeSuspend(z.f22715a);
            default:
                return ((n) create(cVar)).invokeSuspend(z.f22715a);
        }
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f19024u) {
            case 0:
                int i = this.f19025v;
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
                this.f19025v = 1;
                Object c10 = c0.c(new w(this.f19027x, 12), this.f19026w.f19034a, this, false, true);
                ue.a aVar = ue.a.f27192u;
                if (c10 != aVar) {
                    c10 = zVar;
                }
                if (c10 == aVar) {
                    return aVar;
                }
                return zVar;
            default:
                int i10 = this.f19025v;
                if (i10 != 0) {
                    if (i10 == 1) {
                        pe.a.e(obj);
                        return obj;
                    }
                    x.o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                pe.a.e(obj);
                this.f19025v = 1;
                Object c11 = c0.c(new w(this.f19027x, 11), this.f19026w.f19034a, this, true, false);
                ue.a aVar2 = ue.a.f27192u;
                if (c11 == aVar2) {
                    return aVar2;
                }
                return c11;
        }
    }
}
