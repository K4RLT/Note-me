package g0;
import a1.m;
import m2.m0;
import t.z0;
import x.n0;
import x.p0;
import x.t;
import z1.a1;
import z1.r0;
import z1.z;

/* loaded from: classes.dex */
public final class u0 extends kotlin.jvm.internal.m implements df.l {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f17298u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f17299v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f17300w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f17301x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f17302y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(a1[] a1VarArr, p0 p0Var, int i, int[] iArr) {
        super(1);
        this.f17298u = 2;
        this.f17299v = a1VarArr;
        this.f17302y = p0Var;
        this.f17301x = i;
        this.f17300w = iArr;
    }

    @Override // df.l
    public final Object invoke(Object obj) {
        m0 m0Var;
        boolean z3;
        m0 m0Var2;
        n0 n0Var;
        int a10;
        switch (this.f17298u) {
            case 0:
                z0 z0Var = (z0) obj;
                a1 a1Var = (a1) this.f17300w;
                r0 r0Var = (r0) this.f17299v;
                v0 v0Var = (v0) this.f17302y;
                int i = v0Var.f17311b;
                d2 d2Var = v0Var.f17310a;
                r2.c0 c0Var = v0Var.f17312c;
                g2 g2Var = (g2) v0Var.f17313d.invoke();
                if (g2Var != null) {
                    m0Var = g2Var.f17113a;
                } else {
                    m0Var = null;
                }
                m0 m0Var3 = m0Var;
                if (r0Var.getLayoutDirection() == y2.m.f30815v) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                d2Var.a(z0.f25598v, m(r0Var, i, c0Var, m0Var3, z3, a1Var.f31769u), this.f17301x, a1Var.f31769u);
                z0.k(z0Var, a1Var, Math.round(-d2Var.f17047a.h()), 0);
                return pe.z.f22715a;
            case 1:
                z0 z0Var2 = (z0) obj;
                a1 a1Var2 = (a1) this.f17300w;
                r0 r0Var2 = (r0) this.f17299v;
                m2 m2Var = (m2) this.f17302y;
                int i10 = m2Var.f17212b;
                d2 d2Var2 = m2Var.f17211a;
                r2.c0 c0Var2 = m2Var.f17213c;
                g2 g2Var2 = (g2) m2Var.f17214d.invoke();
                if (g2Var2 != null) {
                    m0Var2 = g2Var2.f17113a;
                } else {
                    m0Var2 = null;
                }
                d2Var2.a(z0.f25597u, m(r0Var2, i10, c0Var2, m0Var2, false, a1Var2.f31769u), this.f17301x, a1Var2.f31770v);
                z0.k(z0Var2, a1Var2, 0, Math.round(-d2Var2.f17047a.h()));
                return pe.z.f22715a;
            default:
                z0 z0Var3 = (z0) obj;
                a1[] a1VarArr = (a1[]) this.f17299v;
                p0 p0Var = (p0) this.f17302y;
                int[] iArr = (int[]) this.f17300w;
                int length = a1VarArr.length;
                int i11 = 0;
                int i12 = 0;
                while (i11 < length) {
                    a1 a1Var3 = a1VarArr[i11];
                    int i13 = i12 + 1;
                    a1Var3.getClass();
                    Object H = a1Var3.H();
                    t tVar = null;
                    if (H instanceof n0) {
                        n0Var = (n0) H;
                    } else {
                        n0Var = null;
                    }
                    if (n0Var != null) {
                        tVar = n0Var.f29988c;
                    }
                    int i14 = this.f17301x;
                    if (tVar != null) {
                        a10 = tVar.a(i14 - a1Var3.f31770v, y2.m.f30814u);
                    } else {
                        a10 = p0Var.f29993b.a(0, i14 - a1Var3.f31770v);
                    }
                    z0Var3.h(a1Var3, iArr[i12], a10, 0.0f);
                    i11++;
                    i12 = i13;
                }
                return pe.z.f22715a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u0(r0 r0Var, z zVar, a1 a1Var, int i, int i10) {
        super(1);
        this.f17298u = i10;
        this.f17299v = r0Var;
        this.f17302y = zVar;
        this.f17300w = a1Var;
        this.f17301x = i;
    }
}
