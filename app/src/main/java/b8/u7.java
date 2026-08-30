package b8;
import b2.b0;
import b2.f;
import b2.g;
import b2.h;
import d1.a;
import d1.c;
import d1.o;
import d1.r;
import m.d;
import p.x;
import r0.l;
import r0.m;
import r0.v0;
import r0.y;
import z.b;

import com.daren.scraply.R;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final /* synthetic */ class u7 implements df.q {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f2832u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ o5 f2833v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ df.l f2834w;

    public /* synthetic */ u7(o5 o5Var, df.l lVar, int i) {
        this.f2832u = i;
        this.f2833v = o5Var;
        this.f2834w = lVar;
    }

    @Override // df.q
    public final Object b(Object obj, Object obj2, Object obj3) {
        boolean z3;
        boolean z9;
        boolean z10;
        int i = this.f2832u;
        pe.z zVar = pe.z.f22715a;
        v0 v0Var = l.f24285a;
        df.l lVar = this.f2834w;
        o5 o5Var = this.f2833v;
        boolean z11 = false;
        switch (i) {
            case 0:
                m mVar = (m) obj2;
                ((Integer) obj3).getClass();
                ((x) obj).getClass();
                r o10 = androidx.compose.foundation.layout.a.o(o.f15687a, 10, 0.0f, 0.0f, 0.0f, 14);
                z1.p0 d2 = x.d(c.f15670u, false);
                int t3 = y.t(mVar);
                r rVar = (r) mVar;
                g l10 = rVar.l();
                r c10 = a.c(o10, mVar);
                h.f1471d.getClass();
                b0 b0Var = g.f1462b;
                rVar.e0();
                if (rVar.S) {
                    rVar.k(b0Var);
                } else {
                    rVar.n0();
                }
                y.I(g.e, d2, mVar);
                y.I(g.f1464d, l10, mVar);
                f fVar = g.f1465f;
                if (rVar.S || !kotlin.jvm.internal.a(rVar.O(), Integer.valueOf(t3))) {
                    a.t(t3, rVar, t3, fVar);
                }
                y.I(g.f1463c, c10, mVar);
                o5 o5Var2 = o5.FRAMES;
                String b10 = wa.n7.b(R.string.universe_section_frames, mVar);
                if (o5Var == o5Var2) {
                    z11 = true;
                }
                boolean f10 = rVar.f(lVar);
                Object O = rVar.O();
                if (f10 || O == v0Var) {
                    O = new b8(2, lVar);
                    rVar.k0(O);
                }
                ConcurrentHashMap concurrentHashMap = ha.f2170a;
                ma maVar = ma.FRAMES;
                ConcurrentHashMap concurrentHashMap2 = ha.f2170a;
                a(o5Var2, b10, z11, (df.a) O, null, c(maVar, mVar), null, mVar, 6, 80);
                rVar.p(true);
                return zVar;
            case 1:
                m mVar2 = (m) obj2;
                ((Integer) obj3).getClass();
                ((x) obj).getClass();
                r o11 = androidx.compose.foundation.layout.a.o(o.f15687a, 10, 0.0f, 0.0f, 0.0f, 14);
                z1.p0 d10 = x.d(c.f15670u, false);
                int t10 = y.t(mVar2);
                r rVar2 = (r) mVar2;
                g l11 = rVar2.l();
                r c11 = a.c(o11, mVar2);
                h.f1471d.getClass();
                b0 b0Var2 = g.f1462b;
                rVar2.e0();
                if (rVar2.S) {
                    rVar2.k(b0Var2);
                } else {
                    rVar2.n0();
                }
                y.I(g.e, d10, mVar2);
                y.I(g.f1464d, l11, mVar2);
                f fVar2 = g.f1465f;
                if (rVar2.S || !kotlin.jvm.internal.a(rVar2.O(), Integer.valueOf(t10))) {
                    a.t(t10, rVar2, t10, fVar2);
                }
                y.I(g.f1463c, c11, mVar2);
                o5 o5Var3 = o5.TAPES;
                String b11 = wa.n7.b(R.string.universe_section_tapes, mVar2);
                if (o5Var == o5Var3) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                boolean f11 = rVar2.f(lVar);
                Object O2 = rVar2.O();
                if (f11 || O2 == v0Var) {
                    O2 = new b8(0, lVar);
                    rVar2.k0(O2);
                }
                ConcurrentHashMap concurrentHashMap3 = ha.f2170a;
                ma maVar2 = ma.TAPES;
                ConcurrentHashMap concurrentHashMap4 = ha.f2170a;
                a(o5Var3, b11, z3, (df.a) O2, null, c(maVar2, mVar2), null, mVar2, 6, 80);
                rVar2.p(true);
                return zVar;
            case 2:
                m mVar3 = (m) obj2;
                ((Integer) obj3).getClass();
                ((x) obj).getClass();
                r o12 = androidx.compose.foundation.layout.a.o(o.f15687a, 10, 0.0f, 0.0f, 0.0f, 14);
                z1.p0 d11 = x.d(c.f15670u, false);
                int t11 = y.t(mVar3);
                r rVar3 = (r) mVar3;
                g l12 = rVar3.l();
                r c12 = a.c(o12, mVar3);
                h.f1471d.getClass();
                b0 b0Var3 = g.f1462b;
                rVar3.e0();
                if (rVar3.S) {
                    rVar3.k(b0Var3);
                } else {
                    rVar3.n0();
                }
                y.I(g.e, d11, mVar3);
                y.I(g.f1464d, l12, mVar3);
                f fVar3 = g.f1465f;
                if (rVar3.S || !kotlin.jvm.internal.a(rVar3.O(), Integer.valueOf(t11))) {
                    a.t(t11, rVar3, t11, fVar3);
                }
                y.I(g.f1463c, c12, mVar3);
                o5 o5Var4 = o5.STICKERS;
                String b12 = wa.n7.b(R.string.universe_section_stickers, mVar3);
                if (o5Var == o5Var4) {
                    z11 = true;
                }
                boolean f12 = rVar3.f(lVar);
                Object O3 = rVar3.O();
                if (f12 || O3 == v0Var) {
                    O3 = new b8(3, lVar);
                    rVar3.k0(O3);
                }
                ConcurrentHashMap concurrentHashMap5 = ha.f2170a;
                ma maVar3 = ma.STICKERS;
                ConcurrentHashMap concurrentHashMap6 = ha.f2170a;
                a(o5Var4, b12, z11, (df.a) O3, null, c(maVar3, mVar3), null, mVar3, 6, 80);
                rVar3.p(true);
                return zVar;
            case 3:
                m mVar4 = (m) obj2;
                ((Integer) obj3).getClass();
                ((x) obj).getClass();
                r o13 = androidx.compose.foundation.layout.a.o(o.f15687a, 10, 0.0f, 0.0f, 0.0f, 14);
                z1.p0 d12 = x.d(c.f15670u, false);
                int t12 = y.t(mVar4);
                r rVar4 = (r) mVar4;
                g l13 = rVar4.l();
                r c13 = a.c(o13, mVar4);
                h.f1471d.getClass();
                b0 b0Var4 = g.f1462b;
                rVar4.e0();
                if (rVar4.S) {
                    rVar4.k(b0Var4);
                } else {
                    rVar4.n0();
                }
                y.I(g.e, d12, mVar4);
                y.I(g.f1464d, l13, mVar4);
                f fVar4 = g.f1465f;
                if (rVar4.S || !kotlin.jvm.internal.a(rVar4.O(), Integer.valueOf(t12))) {
                    a.t(t12, rVar4, t12, fVar4);
                }
                y.I(g.f1463c, c13, mVar4);
                o5 o5Var5 = o5.ACCESSORIES;
                String b13 = wa.n7.b(R.string.universe_section_accessories, mVar4);
                if (o5Var == o5Var5) {
                    z11 = true;
                }
                boolean f13 = rVar4.f(lVar);
                Object O4 = rVar4.O();
                if (f13 || O4 == v0Var) {
                    O4 = new b8(1, lVar);
                    rVar4.k0(O4);
                }
                ConcurrentHashMap concurrentHashMap7 = ha.f2170a;
                ma maVar4 = ma.ACCESSORIES;
                ConcurrentHashMap concurrentHashMap8 = ha.f2170a;
                a(o5Var5, b13, z11, (df.a) O4, null, c(maVar4, mVar4), null, mVar4, 6, 80);
                rVar4.p(true);
                return zVar;
            default:
                m mVar5 = (m) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((b) obj).getClass();
                if ((intValue & 17) != 16) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                r rVar5 = (r) mVar5;
                if (rVar5.R(intValue & 1, z9)) {
                    o5 o5Var6 = o5.NOTEBOOKS;
                    String b14 = wa.n7.b(R.string.universe_section_notebooks, rVar5);
                    if (o5Var == o5Var6) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    ConcurrentHashMap concurrentHashMap9 = ha.f2170a;
                    ma maVar5 = ma.NOTEBOOKS;
                    ConcurrentHashMap concurrentHashMap10 = ha.f2170a;
                    boolean c14 = c(maVar5, rVar5);
                    boolean f14 = rVar5.f(lVar);
                    Object O5 = rVar5.O();
                    if (f14 || O5 == v0Var) {
                        O5 = new b8(4, lVar);
                        rVar5.k0(O5);
                    }
                    a(o5Var6, b14, z10, (df.a) O5, null, c14, null, rVar5, 6, 16);
                } else {
                    rVar5.U();
                }
                return zVar;
        }
    }
}
