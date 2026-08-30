package u7;
import d.c;
import c2.a3;
import f6.h;
import q.d;
import q.e;
import q.r0;
import q.x;
import r0.y;

/* loaded from: classes.dex */
public final class s4 extends ve.i implements df.p {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f26836u;

    /* renamed from: v, reason: collision with root package name */
    public int f26837v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ d f26838w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ o1 f26839x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s4(d dVar, o1 o1Var, te.c cVar, int i) {
        super(2, cVar);
        this.f26836u = i;
        this.f26838w = dVar;
        this.f26839x = o1Var;
    }

    @Override // ve.a
    public final te.c create(Object obj, te.c cVar) {
        switch (this.f26836u) {
            case 0:
                return new s4(this.f26838w, this.f26839x, cVar, 0);
            case 1:
                return new s4(this.f26838w, this.f26839x, cVar, 1);
            default:
                return new s4(this.f26838w, this.f26839x, cVar, 2);
        }
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        pf.z zVar = (pf.z) obj;
        te.c cVar = (te.c) obj2;
        switch (this.f26836u) {
            case 0:
                return ((s4) create(zVar, cVar)).invokeSuspend(pe.z.f22715a);
            case 1:
                return ((s4) create(zVar, cVar)).invokeSuspend(pe.z.f22715a);
            default:
                return ((s4) create(zVar, cVar)).invokeSuspend(pe.z.f22715a);
        }
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f26836u) {
            case 0:
                int i = this.f26837v;
                if (i != 0) {
                    if (i == 1) {
                        pe.a.e(obj);
                    } else {
                        x.o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    pe.a.e(obj);
                    d dVar = this.f26838w;
                    o1 o1Var = this.f26839x;
                    h J = y.J(new r4(dVar, o1Var));
                    a3 a3Var = new a3(4, o1Var);
                    this.f26837v = 1;
                    Object b10 = J.b(a3Var, this);
                    ue.a aVar = ue.a.f27192u;
                    if (b10 == aVar) {
                        return aVar;
                    }
                }
                return pe.z.f22715a;
            case 1:
                int i10 = this.f26837v;
                if (i10 != 0) {
                    if (i10 == 1) {
                        pe.a.e(obj);
                    } else {
                        x.o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    pe.a.e(obj);
                    d dVar2 = this.f26838w;
                    Float f10 = new Float(this.f26839x.b(ff.a.b(((Number) dVar2.e()).floatValue())));
                    r0 r8 = e.r(0.85f, 300.0f, null, 4);
                    this.f26837v = 1;
                    Object c10 = d.c(dVar2, f10, r8, this);
                    ue.a aVar2 = ue.a.f27192u;
                    if (c10 == aVar2) {
                        return aVar2;
                    }
                }
                return pe.z.f22715a;
            default:
                int i11 = this.f26837v;
                if (i11 != 0) {
                    if (i11 == 1) {
                        pe.a.e(obj);
                    } else {
                        x.o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    pe.a.e(obj);
                    d dVar3 = this.f26838w;
                    Float f11 = new Float(this.f26839x.b(ff.a.b(((Number) dVar3.e()).floatValue())));
                    r0 r10 = e.r(0.85f, 300.0f, null, 4);
                    this.f26837v = 1;
                    Object c11 = d.c(dVar3, f11, r10, this);
                    ue.a aVar3 = ue.a.f27192u;
                    if (c11 == aVar3) {
                        return aVar3;
                    }
                }
                return pe.z.f22715a;
        }
    }
}
