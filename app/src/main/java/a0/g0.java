package a0;
import b0.l0;
import z.m;

import z1.a1;
import z1.z0;

/* loaded from: classes.dex */
public final class g0 extends kotlin.jvm.internal.m implements df.l {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f54u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f55v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f56w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g0(Object obj, int i, int i10) {
        super(1);
        this.f54u = i10;
        this.f56w = obj;
        this.f55v = i;
    }

    @Override // df.l
    public final Object invoke(Object obj) {
        df.l lVar;
        df.l lVar2;
        switch (this.f54u) {
            case 0:
                l0 l0Var = (l0) obj;
                a aVar = ((l0) this.f56w).f86a;
                b1.i d2 = b1.w.d();
                if (d2 != null) {
                    lVar = d2.e();
                } else {
                    lVar = null;
                }
                b1.w.j(d2, b1.w.g(d2), lVar);
                aVar.getClass();
                for (int i = 0; i < 2; i++) {
                    l0Var.a(this.f55v + i);
                }
                return pe.z.f22715a;
            case 1:
                kotlin.jvm.internal.y yVar = (kotlin.jvm.internal.y) this.f56w;
                Boolean valueOf = Boolean.valueOf(((i1.s) obj).c1(this.f55v));
                yVar.f19787u = valueOf;
                return valueOf;
            case 2:
                ((z0) obj).h((a1) this.f56w, 0, -this.f55v, 0.0f);
                return pe.z.f22715a;
            default:
                l0 l0Var2 = (l0) obj;
                a aVar2 = ((m) this.f56w).f31728a;
                b1.i d10 = b1.w.d();
                if (d10 != null) {
                    lVar2 = d10.e();
                } else {
                    lVar2 = null;
                }
                b1.w.j(d10, b1.w.g(d10), lVar2);
                aVar2.getClass();
                for (int i10 = 0; i10 < 2; i10++) {
                    l0Var2.a(this.f55v + i10);
                }
                return pe.z.f22715a;
        }
    }
}
