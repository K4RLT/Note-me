package l5;

import df.l;
import df.p;
import g5.v;
import pf.z;
import q.x;

/* loaded from: classes.dex */
public final class b extends ve.i implements p {

    /* renamed from: u, reason: collision with root package name */
    public int f19901u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ v f19902v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ boolean f19903w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ boolean f19904x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ l f19905y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(l lVar, v vVar, te.c cVar, boolean z3, boolean z9) {
        super(2, cVar);
        this.f19902v = vVar;
        this.f19903w = z3;
        this.f19904x = z9;
        this.f19905y = lVar;
    }

    @Override // ve.a
    public final te.c create(Object obj, te.c cVar) {
        return new b(this.f19905y, this.f19902v, cVar, this.f19903w, this.f19904x);
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((z) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        int i = this.f19901u;
        if (i != 0) {
            if (i == 1) {
                pe.a.e(obj);
                return obj;
            }
            x.o("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        pe.a.e(obj);
        l lVar = this.f19905y;
        v vVar = this.f19902v;
        boolean z3 = this.f19904x;
        boolean z9 = this.f19903w;
        d dVar = new d(lVar, vVar, null, z3, z9);
        this.f19901u = 1;
        Object w10 = vVar.w(z9, dVar, this);
        ue.a aVar = ue.a.f27192u;
        if (w10 == aVar) {
            return aVar;
        }
        return w10;
    }
}
