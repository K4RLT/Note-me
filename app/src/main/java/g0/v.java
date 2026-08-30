package g0;
import a1.i;
import d1.r;
import j0.j;
import m2.g;
import m2.q0;
import r0.m;
import r0.y;

import java.util.Map;

/* loaded from: classes.dex */
public final class v extends kotlin.jvm.internal.m implements df.p {
    public final /* synthetic */ int A;
    public final /* synthetic */ boolean B;
    public final /* synthetic */ int C;
    public final /* synthetic */ int D;
    public final /* synthetic */ q2.h E;
    public final /* synthetic */ j F;
    public final /* synthetic */ df.l G;
    public final /* synthetic */ int H;
    public final /* synthetic */ int I;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ r f17304u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ g f17305v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ df.l f17306w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ boolean f17307x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Map f17308y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ q0 f17309z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(r rVar, g gVar, df.l lVar, boolean z3, Map map, q0 q0Var, int i, boolean z9, int i10, int i11, q2.h hVar, j jVar, df.l lVar2, int i12, int i13) {
        super(2);
        this.f17304u = rVar;
        this.f17305v = gVar;
        this.f17306w = lVar;
        this.f17307x = z3;
        this.f17308y = map;
        this.f17309z = q0Var;
        this.A = i;
        this.B = z9;
        this.C = i10;
        this.D = i11;
        this.E = hVar;
        this.F = jVar;
        this.G = lVar2;
        this.H = i12;
        this.I = i13;
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int L = y.L(this.H | 1);
        int L2 = y.L(this.I);
        i(this.f17304u, this.f17305v, this.f17306w, this.f17307x, this.f17308y, this.f17309z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, (m) obj, L, L2);
        return pe.z.f22715a;
    }
}
