package u7;
import d.c;
import q.d;
import q.e;
import q.k1;
import q.r0;
import q.x;
import q.y;

/* loaded from: classes.dex */
public final class l1 extends ve.i implements df.p {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f26428u;

    /* renamed from: v, reason: collision with root package name */
    public int f26429v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ o1 f26430w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ float f26431x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l1(o1 o1Var, float f10, te.c cVar, int i) {
        super(2, cVar);
        this.f26428u = i;
        this.f26430w = o1Var;
        this.f26431x = f10;
    }

    @Override // ve.a
    public final te.c create(Object obj, te.c cVar) {
        switch (this.f26428u) {
            case 0:
                return new l1(this.f26430w, this.f26431x, cVar, 0);
            default:
                return new l1(this.f26430w, this.f26431x, cVar, 1);
        }
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        pf.z zVar = (pf.z) obj;
        te.c cVar = (te.c) obj2;
        switch (this.f26428u) {
            case 0:
                return ((l1) create(zVar, cVar)).invokeSuspend(pe.z.f22715a);
            default:
                return ((l1) create(zVar, cVar)).invokeSuspend(pe.z.f22715a);
        }
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f26428u) {
            case 0:
                int i = this.f26429v;
                if (i != 0) {
                    if (i == 1) {
                        pe.a.e(obj);
                    } else {
                        x.o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    pe.a.e(obj);
                    d dVar = this.f26430w.f26661q;
                    Float f10 = new Float(this.f26431x);
                    r0 r8 = e.r(0.85f, 400.0f, null, 4);
                    this.f26429v = 1;
                    Object c10 = d.c(dVar, f10, r8, this);
                    ue.a aVar = ue.a.f27192u;
                    if (c10 == aVar) {
                        return aVar;
                    }
                }
                return pe.z.f22715a;
            default:
                int i10 = this.f26429v;
                if (i10 != 0) {
                    if (i10 == 1) {
                        pe.a.e(obj);
                    } else {
                        x.o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    pe.a.e(obj);
                    d dVar2 = this.f26430w.f26661q;
                    Float f11 = new Float(this.f26431x);
                    k1 s10 = e.s(400, 0, y.f23031a, 2);
                    this.f26429v = 1;
                    Object c11 = d.c(dVar2, f11, s10, this);
                    ue.a aVar2 = ue.a.f27192u;
                    if (c11 == aVar2) {
                        return aVar2;
                    }
                }
                return pe.z.f22715a;
        }
    }
}
