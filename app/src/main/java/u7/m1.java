package u7;
import d.c;
import q.d;
import q.e;
import q.r0;
import q.x;

import wa.b9;

/* loaded from: classes.dex */
public final class m1 extends ve.i implements df.p {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f26523u;

    /* renamed from: v, reason: collision with root package name */
    public int f26524v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ o1 f26525w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f26526x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m1(o1 o1Var, int i, te.c cVar, int i10) {
        super(2, cVar);
        this.f26523u = i10;
        this.f26525w = o1Var;
        this.f26526x = i;
    }

    @Override // ve.a
    public final te.c create(Object obj, te.c cVar) {
        switch (this.f26523u) {
            case 0:
                return new m1(this.f26525w, this.f26526x, cVar, 0);
            default:
                return new m1(this.f26525w, this.f26526x, cVar, 1);
        }
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        pf.z zVar = (pf.z) obj;
        te.c cVar = (te.c) obj2;
        switch (this.f26523u) {
            case 0:
                return ((m1) create(zVar, cVar)).invokeSuspend(pe.z.f22715a);
            default:
                return ((m1) create(zVar, cVar)).invokeSuspend(pe.z.f22715a);
        }
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f26523u) {
            case 0:
                int i = this.f26524v;
                if (i != 0) {
                    if (i == 1) {
                        pe.a.e(obj);
                    } else {
                        x.o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    pe.a.e(obj);
                    d dVar = this.f26525w.f26661q;
                    Float f10 = new Float(this.f26526x);
                    r0 r8 = e.r(0.75f, 200.0f, null, 4);
                    this.f26524v = 1;
                    Object c10 = d.c(dVar, f10, r8, this);
                    ue.a aVar = ue.a.f27192u;
                    if (c10 == aVar) {
                        return aVar;
                    }
                }
                return pe.z.f22715a;
            default:
                int i10 = this.f26524v;
                if (i10 != 0) {
                    if (i10 == 1) {
                        pe.a.e(obj);
                    } else {
                        x.o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    pe.a.e(obj);
                    d dVar2 = this.f26525w.f26661q;
                    Float f11 = new Float(b9.e(ff.a.b(((Number) dVar2.e()).floatValue()), 0, this.f26526x));
                    r0 r10 = e.r(0.85f, 1500.0f, null, 4);
                    this.f26524v = 1;
                    Object c11 = d.c(dVar2, f11, r10, this);
                    ue.a aVar2 = ue.a.f27192u;
                    if (c11 == aVar2) {
                        return aVar2;
                    }
                }
                return pe.z.f22715a;
        }
    }
}
