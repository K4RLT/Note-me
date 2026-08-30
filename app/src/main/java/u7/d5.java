package u7;
import q.d;
import q.x;

import java.util.List;

/* loaded from: classes.dex */
public final class d5 extends ve.i implements df.p {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f26070u;

    /* renamed from: v, reason: collision with root package name */
    public int f26071v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ o1 f26072w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ List f26073x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d5(int i, List list, te.c cVar, o1 o1Var) {
        super(2, cVar);
        this.f26070u = i;
        this.f26072w = o1Var;
        this.f26073x = list;
    }

    @Override // ve.a
    public final te.c create(Object obj, te.c cVar) {
        switch (this.f26070u) {
            case 0:
                return new d5(0, this.f26073x, cVar, this.f26072w);
            default:
                return new d5(1, this.f26073x, cVar, this.f26072w);
        }
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        pf.z zVar = (pf.z) obj;
        te.c cVar = (te.c) obj2;
        switch (this.f26070u) {
            case 0:
                return ((d5) create(zVar, cVar)).invokeSuspend(pe.z.f22715a);
            default:
                return ((d5) create(zVar, cVar)).invokeSuspend(pe.z.f22715a);
        }
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f26070u) {
            case 0:
                int i = this.f26071v;
                if (i != 0) {
                    if (i == 1) {
                        pe.a.e(obj);
                    } else {
                        x.o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    pe.a.e(obj);
                    int size = this.f26073x.size();
                    this.f26071v = 1;
                    Object c10 = this.f26072w.c(size, this);
                    ue.a aVar = ue.a.f27192u;
                    if (c10 == aVar) {
                        return aVar;
                    }
                }
                return pe.z.f22715a;
            default:
                int i10 = this.f26071v;
                pe.z zVar = pe.z.f22715a;
                boolean z3 = true;
                if (i10 != 0) {
                    if (i10 == 1) {
                        pe.a.e(obj);
                        return zVar;
                    }
                    x.o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                pe.a.e(obj);
                int size2 = this.f26073x.size();
                this.f26071v = 1;
                o1 o1Var = this.f26072w;
                d dVar = o1Var.f26660p;
                boolean z9 = o1Var.f26658n;
                ue.a aVar2 = ue.a.f27192u;
                if (z9) {
                    if (!dVar.f()) {
                        if (((Number) dVar.e()).floatValue() <= 0.5f) {
                            z3 = false;
                        }
                        if (z3 != o1Var.m()) {
                            o1Var.q(z3);
                            o1Var.f26647a.edit().putBoolean("stack_view", z3).apply();
                        }
                    }
                    if (!o1Var.m()) {
                        break;
                    } else {
                        break;
                    }
                }
                Object c11 = zVar;
                if (c11 == aVar2) {
                    return aVar2;
                }
                return zVar;
        }
    }
}
