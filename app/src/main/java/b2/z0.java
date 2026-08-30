package b2;
import c2.x;
import j.c;
import t0.e;
import z1.z0;

/* loaded from: classes.dex */
public final class z0 extends kotlin.jvm.internal.m implements df.a {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f1635u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ a1 f1636v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z0(a1 a1Var, int i) {
        super(0);
        this.f1635u = i;
        this.f1636v = a1Var;
    }

    @Override // df.a
    public final Object invoke() {
        z1.z0 placementScope;
        switch (this.f1635u) {
            case 0:
                a1 a1Var = this.f1636v;
                n0 n0Var = a1Var.f1420z;
                n0Var.i = 0;
                e z3 = n0Var.f1545a.z();
                Object[] objArr = z3.f25617u;
                int i = z3.f25619w;
                for (int i10 = 0; i10 < i; i10++) {
                    a1 a1Var2 = ((i0) objArr[i10]).f1478a0.f1558p;
                    a1Var2.B = a1Var2.C;
                    a1Var2.C = Integer.MAX_VALUE;
                    a1Var2.M = false;
                    if (a1Var2.F == g0.f1467v) {
                        a1Var2.F = g0.f1468w;
                    }
                }
                i0 i0Var = n0Var.f1545a;
                i0 i0Var2 = n0Var.f1545a;
                e z9 = i0Var.z();
                Object[] objArr2 = z9.f25617u;
                int i11 = z9.f25619w;
                for (int i12 = 0; i12 < i11; i12++) {
                    ((i0) objArr2[i12]).f1478a0.f1558p.Q.getClass();
                }
                a1Var.g().P0().a();
                e z10 = i0Var2.z();
                Object[] objArr3 = z10.f25617u;
                int i13 = z10.f25619w;
                for (int i14 = 0; i14 < i13; i14++) {
                    i0 i0Var3 = (i0) objArr3[i14];
                    n0 n0Var2 = i0Var3.f1478a0;
                    if (n0Var2.f1558p.B != i0Var3.w()) {
                        i0Var2.O();
                        i0Var2.C();
                        if (i0Var3.w() == Integer.MAX_VALUE) {
                            if (n0Var2.f1547c) {
                                w0 w0Var = n0Var2.f1559q;
                                w0Var.getClass();
                                w0Var.C0(false);
                            }
                            n0Var2.f1558p.G0();
                        }
                    }
                }
                e z11 = i0Var2.z();
                Object[] objArr4 = z11.f25617u;
                int i15 = z11.f25619w;
                for (int i16 = 0; i16 < i15; i16++) {
                    j0 j0Var = ((i0) objArr4[i16]).f1478a0.f1558p.Q;
                    j0Var.getClass();
                    j0Var.f1507c = false;
                }
                return pe.z.f22715a;
            case 1:
                a1 a1Var3 = this.f1636v;
                a1Var3.f1420z.a().z(a1Var3.U);
                return pe.z.f22715a;
            default:
                a1 a1Var4 = this.f1636v;
                n0 n0Var3 = a1Var4.f1420z;
                k1 k1Var = n0Var3.a().M;
                if (k1Var == null || (placementScope = k1Var.F) == null) {
                    placementScope = ((x) m0.a(n0Var3.f1545a)).getPlacementScope();
                }
                df.l lVar = a1Var4.Z;
                if (lVar == null) {
                    k1 a10 = n0Var3.a();
                    long j10 = a1Var4.f1416a0;
                    float f10 = a1Var4.f1417b0;
                    placementScope.getClass();
                    z1.z0.b(placementScope, a10);
                    a10.r0(y2.c(j10, a10.f31773y), f10, null);
                } else {
                    k1 a11 = n0Var3.a();
                    long j11 = a1Var4.f1416a0;
                    float f11 = a1Var4.f1417b0;
                    placementScope.getClass();
                    z1.z0.b(placementScope, a11);
                    a11.r0(y2.c(j11, a11.f31773y), f11, lVar);
                }
                return pe.z.f22715a;
        }
    }
}
