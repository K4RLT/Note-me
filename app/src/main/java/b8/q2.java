package b8;
import c2.d;
import u7.m3;

import java.util.List;

/* loaded from: classes.dex */
public final class q2 extends ve.i implements df.p {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ m3 f2572u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f2573v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f2574w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f2575x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ m1 f2576y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ List f2577z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q2(m3 m3Var, int i, int i10, int i11, m1 m1Var, List list, te.c cVar) {
        super(2, cVar);
        this.f2572u = m3Var;
        this.f2573v = i;
        this.f2574w = i10;
        this.f2575x = i11;
        this.f2576y = m1Var;
        this.f2577z = list;
    }

    @Override // ve.a
    public final te.c create(Object obj, te.c cVar) {
        return new q2(this.f2572u, this.f2573v, this.f2574w, this.f2575x, this.f2576y, this.f2577z, cVar);
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        return ((q2) create((pf.z) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        pe.a.e(obj);
        d2 d2Var = this.f2576y.f2391l;
        i4 i4Var = new i4(this.f2572u, this.f2573v, this.f2574w, this.f2575x, d2Var, false);
        ((h4) this.f2577z.get((this.f2574w * 2) + this.f2575x)).a(i4Var);
        i4.t(i4Var, "Scraply", i4Var.i(), 0.958f, 0.0145f, d(d2Var.f1964a, 79), "serif", null, 832);
        return new Integer(i4Var.f2201g);
    }
}
