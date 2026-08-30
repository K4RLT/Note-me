package a0;
import m.a;
import b0.i;
import c0.o;
import c0.u;
import c0.y;
import x.m;
import z.d;
import z.f;

import b0.e1;

/* loaded from: classes.dex */
public final class k extends kotlin.jvm.internal.m implements df.p {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f77u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f78v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f79w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(Object obj, int i, int i10) {
        super(2);
        this.f77u = i10;
        this.f79w = obj;
        this.f78v = i;
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        boolean z3;
        boolean z9;
        boolean z10;
        switch (this.f77u) {
            case 0:
                r0.m mVar = (r0.m) obj;
                int intValue = ((Number) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                r0.r rVar = (r0.r) mVar;
                if (rVar.R(intValue & 1, z3)) {
                    e1 e1Var = ((l) this.f79w).f83b.f73c;
                    int i = this.f78v;
                    i c10 = e1Var.c(i);
                    ((h) c10.f1198c).f60d.d(p.f114a, Integer.valueOf(i - c10.f1196a), rVar, 6);
                } else {
                    rVar.U();
                }
                return pe.z.f22715a;
            case 1:
                r0.m mVar2 = (r0.m) obj;
                int intValue2 = ((Number) obj2).intValue();
                if ((intValue2 & 3) != 2) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                r0.r rVar2 = (r0.r) mVar2;
                if (rVar2.R(intValue2 & 1, z9)) {
                    e1 k3 = ((u) this.f79w).f3405b.k();
                    int i10 = this.f78v;
                    i c11 = k3.c(i10);
                    ((o) c11.f1198c).f3385b.d(y.f3435a, Integer.valueOf(i10 - c11.f1196a), rVar2, 0);
                } else {
                    rVar2.U();
                }
                return pe.z.f22715a;
            case 2:
                ((Number) obj2).intValue();
                m.a(r0.y.L(this.f78v | 1), (d1.r) this.f79w, (r0.m) obj);
                return pe.z.f22715a;
            default:
                r0.m mVar3 = (r0.m) obj;
                int intValue3 = ((Number) obj2).intValue();
                if ((intValue3 & 3) != 2) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                r0.r rVar3 = (r0.r) mVar3;
                if (rVar3.R(intValue3 & 1, z10)) {
                    f fVar = (f) this.f79w;
                    e1 e1Var2 = fVar.f31671b.f31669b;
                    int i11 = this.f78v;
                    i c12 = e1Var2.c(i11);
                    ((d) c12.f1198c).f31668c.d(fVar.f31672c, Integer.valueOf(i11 - c12.f1196a), rVar3, 0);
                } else {
                    rVar3.U();
                }
                return pe.z.f22715a;
        }
    }
}
