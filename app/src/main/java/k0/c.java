package k0;
import d1.r;
import r0.m;
import r0.y;
import z0.h;

import c2.r2;

/* loaded from: classes.dex */
public final class c extends kotlin.jvm.internal.m implements df.p {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ r2 f19237u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ long f19238v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ boolean f19239w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ r f19240x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ o f19241y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(r2 r2Var, long j10, boolean z3, r rVar, o oVar) {
        super(2);
        this.f19237u = r2Var;
        this.f19238v = j10;
        this.f19239w = z3;
        this.f19240x = rVar;
        this.f19241y = oVar;
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        boolean z3;
        m mVar = (m) obj;
        int intValue = ((Number) obj2).intValue();
        if ((intValue & 3) != 2) {
            z3 = true;
        } else {
            z3 = false;
        }
        r rVar = (r) mVar;
        if (rVar.R(intValue & 1, z3)) {
            y.a(c2.p1.f3616s.a(this.f19237u), h.d(1260045569, new b(this.f19238v, this.f19239w, this.f19240x, this.f19241y), rVar), rVar, 56);
        } else {
            rVar.U();
        }
        return pe.z.f22715a;
    }
}
