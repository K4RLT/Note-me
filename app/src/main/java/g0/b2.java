package g0;
import a0.k0;
import c2.p0;
import c2.p1;
import d1.o;
import d1.r;
import p.a;
import r.l0;
import r.q0;
import r0.a1;
import r0.i1;
import r0.l;
import r0.m;
import r0.r;
import r0.v0;
import r0.y;
import t.l;
import t.s1;
import t.z0;
import v.i;

/* loaded from: classes.dex */
public final class b2 extends kotlin.jvm.internal.m implements df.q {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f17025u = 0;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ boolean f17026v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f17027w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f17028x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2(d2 d2Var, boolean z3, i iVar) {
        super(3);
        this.f17027w = d2Var;
        this.f17026v = z3;
        this.f17028x = iVar;
    }

    @Override // df.q
    public final Object b(Object obj, Object obj2, Object obj3) {
        boolean z3;
        boolean z9;
        i iVar;
        switch (this.f17025u) {
            case 0:
                ((Number) obj3).intValue();
                d2 d2Var = (d2) this.f17027w;
                i1 i1Var = d2Var.f17051f;
                r rVar = (r) ((m) obj2);
                rVar.a0(805428266);
                boolean z10 = true;
                if (rVar.j(p1.f3611n) == y2.m.f30815v) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (((z0) i1Var.getValue()) != z0.f25597u && z3) {
                    z9 = false;
                } else {
                    z9 = true;
                }
                boolean f10 = rVar.f(d2Var);
                Object O = rVar.O();
                v0 v0Var = l.f24285a;
                if (f10 || O == v0Var) {
                    O = new k0(17, d2Var);
                    rVar.k0(O);
                }
                a1 G = y.G((df.l) O, rVar);
                Object O2 = rVar.O();
                if (O2 == v0Var) {
                    l lVar = new l(new p0(G, 5));
                    rVar.k0(lVar);
                    O2 = lVar;
                }
                s1 s1Var = (s1) O2;
                boolean f11 = rVar.f(s1Var) | rVar.f(d2Var);
                Object O3 = rVar.O();
                if (f11 || O3 == v0Var) {
                    O3 = new a2(s1Var, d2Var);
                    rVar.k0(O3);
                }
                a2 a2Var = (a2) O3;
                z0 z0Var = (z0) i1Var.getValue();
                if (!this.f17026v || d2Var.f17048b.h() == 0.0f) {
                    z10 = false;
                }
                r b10 = androidx.compose.foundation.gestures.a.b(a2Var, z0Var, z10, z9, (i) this.f17028x);
                rVar.p(false);
                return b10;
            default:
                ((Number) obj3).intValue();
                r rVar2 = (r) ((m) obj2);
                rVar2.a0(-756081143);
                l0 l0Var = (l0) rVar2.j(androidx.compose.foundation.d.f469a);
                if (l0Var instanceof q0) {
                    rVar2.a0(617653824);
                    rVar2.p(false);
                    iVar = null;
                } else {
                    rVar2.a0(617786442);
                    Object O4 = rVar2.O();
                    if (O4 == l.f24285a) {
                        O4 = a.r(rVar2);
                    }
                    iVar = (i) O4;
                    rVar2.p(false);
                }
                r d2 = androidx.compose.foundation.a.d(o.f15687a, iVar, l0Var, this.f17026v, (String) this.f17027w, null, (df.a) this.f17028x);
                rVar2.p(false);
                return d2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2(boolean z3, String str, df.a aVar) {
        super(3);
        this.f17026v = z3;
        this.f17027w = str;
        this.f17028x = aVar;
    }
}
