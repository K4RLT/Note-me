package u7;
import d.c;
import q.d;
import q.r0;
import q.x;
import v1.f;

import wa.b9;

/* loaded from: classes.dex */
public final class r5 extends ve.i implements df.p {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f26792u;

    /* renamed from: v, reason: collision with root package name */
    public int f26793v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ o1 f26794w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ float f26795x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ float f26796y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r5(o1 o1Var, float f10, float f11, te.c cVar, int i) {
        super(2, cVar);
        this.f26792u = i;
        this.f26794w = o1Var;
        this.f26795x = f10;
        this.f26796y = f11;
    }

    @Override // ve.a
    public final te.c create(Object obj, te.c cVar) {
        switch (this.f26792u) {
            case 0:
                return new r5(this.f26794w, this.f26795x, this.f26796y, cVar, 0);
            case 1:
                return new r5(this.f26794w, this.f26795x, this.f26796y, cVar, 1);
            default:
                return new r5(this.f26794w, this.f26795x, this.f26796y, cVar, 2);
        }
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        pf.z zVar = (pf.z) obj;
        te.c cVar = (te.c) obj2;
        switch (this.f26792u) {
            case 0:
                return ((r5) create(zVar, cVar)).invokeSuspend(pe.z.f22715a);
            case 1:
                return ((r5) create(zVar, cVar)).invokeSuspend(pe.z.f22715a);
            default:
                return ((r5) create(zVar, cVar)).invokeSuspend(pe.z.f22715a);
        }
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f26792u) {
            case 0:
                int i = this.f26793v;
                if (i != 0) {
                    if (i == 1) {
                        pe.a.e(obj);
                    } else {
                        x.o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    pe.a.e(obj);
                    d dVar = this.f26794w.f26661q;
                    Float f10 = new Float(b9.d(((Number) dVar.e()).floatValue() + this.f26795x, 0.0f, this.f26796y));
                    this.f26793v = 1;
                    Object g8 = dVar.g(f10, this);
                    ue.a aVar = ue.a.f27192u;
                    if (g8 == aVar) {
                        return aVar;
                    }
                }
                return pe.z.f22715a;
            case 1:
                int i10 = this.f26793v;
                if (i10 != 0) {
                    if (i10 == 1) {
                        pe.a.e(obj);
                    } else {
                        x.o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    pe.a.e(obj);
                    d dVar2 = this.f26794w.f26661q;
                    Float f11 = new Float(this.f26795x);
                    r0 f12 = f(this.f26796y);
                    this.f26793v = 1;
                    Object c10 = d.c(dVar2, f11, f12, this);
                    ue.a aVar2 = ue.a.f27192u;
                    if (c10 == aVar2) {
                        return aVar2;
                    }
                }
                return pe.z.f22715a;
            default:
                int i11 = this.f26793v;
                if (i11 != 0) {
                    if (i11 == 1) {
                        pe.a.e(obj);
                    } else {
                        x.o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    pe.a.e(obj);
                    d dVar3 = this.f26794w.f26661q;
                    Float f13 = new Float(b9.d(((Number) dVar3.e()).floatValue() + this.f26795x, 0.0f, this.f26796y));
                    this.f26793v = 1;
                    Object g10 = dVar3.g(f13, this);
                    ue.a aVar3 = ue.a.f27192u;
                    if (g10 == aVar3) {
                        return aVar3;
                    }
                }
                return pe.z.f22715a;
        }
    }
}
