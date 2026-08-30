package u7;
import j6.n;
import o7.a;
import q.x;

/* loaded from: classes.dex */
public final class j3 extends ve.i implements df.p {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f26363u;

    /* renamed from: v, reason: collision with root package name */
    public int f26364v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ m3 f26365w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ a f26366x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j3(m3 m3Var, a aVar, te.c cVar, int i) {
        super(2, cVar);
        this.f26363u = i;
        this.f26365w = m3Var;
        this.f26366x = aVar;
    }

    @Override // ve.a
    public final te.c create(Object obj, te.c cVar) {
        switch (this.f26363u) {
            case 0:
                return new j3(this.f26365w, this.f26366x, cVar, 0);
            case 1:
                return new j3(this.f26365w, this.f26366x, cVar, 1);
            case 2:
                return new j3(this.f26365w, this.f26366x, cVar, 2);
            case 3:
                return new j3(this.f26365w, this.f26366x, cVar, 3);
            default:
                return new j3(this.f26365w, this.f26366x, cVar, 4);
        }
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        pf.z zVar = (pf.z) obj;
        te.c cVar = (te.c) obj2;
        switch (this.f26363u) {
            case 0:
                return ((j3) create(zVar, cVar)).invokeSuspend(pe.z.f22715a);
            case 1:
                return ((j3) create(zVar, cVar)).invokeSuspend(pe.z.f22715a);
            case 2:
                return ((j3) create(zVar, cVar)).invokeSuspend(pe.z.f22715a);
            case 3:
                return ((j3) create(zVar, cVar)).invokeSuspend(pe.z.f22715a);
            default:
                return ((j3) create(zVar, cVar)).invokeSuspend(pe.z.f22715a);
        }
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f26363u) {
            case 0:
                int i = this.f26364v;
                if (i != 0) {
                    if (i == 1) {
                        pe.a.e(obj);
                    } else {
                        x.o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    pe.a.e(obj);
                    n nVar = this.f26365w.f26530b;
                    this.f26364v = 1;
                    Object q10 = nVar.q(this.f26366x, this);
                    ue.a aVar = ue.a.f27192u;
                    if (q10 == aVar) {
                        return aVar;
                    }
                }
                return pe.z.f22715a;
            case 1:
                int i10 = this.f26364v;
                if (i10 != 0) {
                    if (i10 == 1) {
                        pe.a.e(obj);
                    } else {
                        x.o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    pe.a.e(obj);
                    n nVar2 = this.f26365w.f26530b;
                    this.f26364v = 1;
                    Object q11 = nVar2.q(this.f26366x, this);
                    ue.a aVar2 = ue.a.f27192u;
                    if (q11 == aVar2) {
                        return aVar2;
                    }
                }
                return pe.z.f22715a;
            case 2:
                int i11 = this.f26364v;
                if (i11 != 0) {
                    if (i11 == 1) {
                        pe.a.e(obj);
                    } else {
                        x.o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    pe.a.e(obj);
                    n nVar3 = this.f26365w.f26530b;
                    this.f26364v = 1;
                    Object q12 = nVar3.q(this.f26366x, this);
                    ue.a aVar3 = ue.a.f27192u;
                    if (q12 == aVar3) {
                        return aVar3;
                    }
                }
                return pe.z.f22715a;
            case 3:
                int i12 = this.f26364v;
                if (i12 != 0) {
                    if (i12 == 1) {
                        pe.a.e(obj);
                    } else {
                        x.o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    pe.a.e(obj);
                    n nVar4 = this.f26365w.f26530b;
                    this.f26364v = 1;
                    Object q13 = nVar4.q(this.f26366x, this);
                    ue.a aVar4 = ue.a.f27192u;
                    if (q13 == aVar4) {
                        return aVar4;
                    }
                }
                return pe.z.f22715a;
            default:
                int i13 = this.f26364v;
                if (i13 != 0) {
                    if (i13 == 1) {
                        pe.a.e(obj);
                    } else {
                        x.o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    pe.a.e(obj);
                    n nVar5 = this.f26365w.f26530b;
                    this.f26364v = 1;
                    Object q14 = nVar5.q(this.f26366x, this);
                    ue.a aVar5 = ue.a.f27192u;
                    if (q14 == aVar5) {
                        return aVar5;
                    }
                }
                return pe.z.f22715a;
        }
    }
}
