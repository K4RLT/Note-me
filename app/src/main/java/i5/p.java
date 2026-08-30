package i5;
import x.o;
import q.x;

import g5.e0;

/* loaded from: classes.dex */
public final class p extends ve.i implements df.l {

    /* renamed from: u, reason: collision with root package name */
    public int f18274u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ q f18275v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ e0 f18276w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ ve.i f18277x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public p(q qVar, e0 e0Var, df.p pVar, te.c cVar) {
        super(1, cVar);
        this.f18275v = qVar;
        this.f18276w = e0Var;
        this.f18277x = (ve.i) pVar;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [df.p, ve.i] */
    @Override // ve.a
    public final te.c create(te.c cVar) {
        return new p(this.f18275v, this.f18276w, this.f18277x, cVar);
    }

    @Override // df.l
    public final Object invoke(Object obj) {
        return ((p) create((te.c) obj)).invokeSuspend(pe.z.f22715a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [df.p, ve.i] */
    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        int i = this.f18274u;
        if (i != 0) {
            if (i == 1) {
                pe.a.e(obj);
                return obj;
            }
            x.o("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        pe.a.e(obj);
        this.f18274u = 1;
        Object e = this.f18275v.e(this.f18276w, this.f18277x, this);
        ue.a aVar = ue.a.f27192u;
        if (e == aVar) {
            return aVar;
        }
        return e;
    }
}
