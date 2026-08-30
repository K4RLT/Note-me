package tf;
import q.x;

import g0.a0;
import pf.z;

/* loaded from: classes.dex */
public final class h extends ve.i implements df.p {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f25723u = 0;

    /* renamed from: v, reason: collision with root package name */
    public int f25724v;

    /* renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f25725w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ j f25726x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ sf.h f25727y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(j jVar, sf.h hVar, Object obj, te.c cVar) {
        super(2, cVar);
        this.f25726x = jVar;
        this.f25727y = hVar;
        this.f25725w = obj;
    }

    @Override // ve.a
    public final te.c create(Object obj, te.c cVar) {
        switch (this.f25723u) {
            case 0:
                return new h(this.f25726x, this.f25727y, this.f25725w, cVar);
            default:
                h hVar = new h(this.f25726x, this.f25727y, cVar);
                hVar.f25725w = obj;
                return hVar;
        }
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        z zVar = (z) obj;
        te.c cVar = (te.c) obj2;
        switch (this.f25723u) {
            case 0:
                return ((h) create(zVar, cVar)).invokeSuspend(pe.z.f22715a);
            default:
                return ((h) create(zVar, cVar)).invokeSuspend(pe.z.f22715a);
        }
    }

    /* JADX WARN: Type inference failed for: r9v2, types: [df.q, ve.i] */
    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f25723u) {
            case 0:
                int i = this.f25724v;
                if (i != 0) {
                    if (i == 1) {
                        pe.a.e(obj);
                    } else {
                        x.o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    pe.a.e(obj);
                    Object r92 = this.f25726x.f25733y;
                    Object obj2 = this.f25725w;
                    this.f25724v = 1;
                    Object b10 = r92.b(this.f25727y, obj2, this);
                    ue.a aVar = ue.a.f27192u;
                    if (b10 == aVar) {
                        return aVar;
                    }
                }
                return pe.z.f22715a;
            default:
                int i10 = this.f25724v;
                if (i10 != 0) {
                    if (i10 == 1) {
                        pe.a.e(obj);
                    } else {
                        x.o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    pe.a.e(obj);
                    z zVar = (z) this.f25725w;
                    Object obj3 = new Object();
                    j jVar = this.f25726x;
                    sf.g gVar = jVar.f25722x;
                    a0 a0Var = new a0(obj3, zVar, jVar, this.f25727y, 3);
                    this.f25724v = 1;
                    Object b11 = gVar.b(a0Var, this);
                    ue.a aVar2 = ue.a.f27192u;
                    if (b11 == aVar2) {
                        return aVar2;
                    }
                }
                return pe.z.f22715a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(j jVar, sf.h hVar, te.c cVar) {
        super(2, cVar);
        this.f25726x = jVar;
        this.f25727y = hVar;
    }
}