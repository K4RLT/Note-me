package b8;
import a.a;
import a0.p;
import b2.b0;
import b2.f;
import b2.g;
import b2.h;
import d1.c;
import d1.o;
import d1.r;
import m.d;
import r0.l;
import r0.m;
import r0.n2;
import r0.v0;
import r0.y;

import java.util.ArrayList;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class l9 extends kotlin.jvm.internal.m implements df.r {
    public final /* synthetic */ float A;
    public final /* synthetic */ n2 B;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ ArrayList f2371u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f2372v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Set f2373w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ n2 f2374x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Map f2375y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ df.l f2376z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l9(ArrayList arrayList, int i, Set set, n2 n2Var, Map map, df.l lVar, float f10, n2 n2Var2) {
        super(4);
        this.f2371u = arrayList;
        this.f2372v = i;
        this.f2373w = set;
        this.f2374x = n2Var;
        this.f2375y = map;
        this.f2376z = lVar;
        this.A = f10;
        this.B = n2Var2;
    }

    @Override // df.r
    public final Object d(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        boolean z3;
        boolean z9;
        float f10;
        boolean z10;
        float f11;
        ma maVar;
        int i10;
        int i11;
        p pVar = (p) obj;
        int intValue = ((Number) obj2).intValue();
        m mVar = (m) obj3;
        int intValue2 = ((Number) obj4).intValue();
        if ((intValue2 & 6) == 0) {
            if (((r) mVar).f(pVar)) {
                i11 = 4;
            } else {
                i11 = 2;
            }
            i = i11 | intValue2;
        } else {
            i = intValue2;
        }
        if ((intValue2 & 48) == 0) {
            if (((r) mVar).d(intValue)) {
                i10 = 32;
            } else {
                i10 = 16;
            }
            i |= i10;
        }
        if ((i & 147) != 146) {
            z3 = true;
        } else {
            z3 = false;
        }
        r rVar = (r) mVar;
        if (rVar.R(i & 1, z3)) {
            w7.s9 s9Var = (w7.s9) this.f2371u.get(intValue);
            rVar.a0(1227267836);
            String str = s9Var.f29080a;
            boolean f12 = rVar.f(str);
            Object O = rVar.O();
            v0 v0Var = l.f24285a;
            if (f12 || O == v0Var) {
                Set set = this.f2373w;
                if (set != null && !set.add(str)) {
                    z9 = false;
                } else {
                    z9 = true;
                }
                O = Boolean.valueOf(z9);
                rVar.k0(O);
            }
            boolean booleanValue = ((Boolean) O).booleanValue();
            boolean f13 = rVar.f(str);
            Object O2 = rVar.O();
            if (f13 || O2 == v0Var) {
                if (booleanValue) {
                    f10 = 0.0f;
                } else {
                    f10 = 1.0f;
                }
                O2 = q.e.a(f10);
                rVar.k0(O2);
            }
            q.d dVar = (q.d) O2;
            boolean f14 = rVar.f(str);
            Object O3 = rVar.O();
            if (f14 || O3 == v0Var) {
                O3 = Float.valueOf(((str.hashCode() % 36) - 18) / 10.0f);
                rVar.k0(O3);
            }
            float floatValue = ((Number) O3).floatValue();
            boolean g8 = rVar.g(booleanValue);
            if ((((i & 112) ^ 48) > 32 && rVar.d(intValue)) || (i & 48) == 32) {
                z10 = true;
            } else {
                z10 = false;
            }
            boolean d2 = z10 | g8 | rVar.d(this.f2372v) | rVar.h(dVar);
            Object O4 = rVar.O();
            if (!d2 && O4 != v0Var) {
                f11 = floatValue;
            } else {
                f11 = floatValue;
                f9 f9Var = new f9(booleanValue, intValue, this.f2372v, dVar, null);
                rVar.k0(f9Var);
                O4 = f9Var;
            }
            y.f((df.p) O4, str, rVar);
            float floatValue2 = ((Number) dVar.e()).floatValue();
            r rVar2 = o.f15687a;
            if (floatValue2 == 1.0f && !dVar.f()) {
                rVar.a0(-2038582596);
            } else {
                rVar.a0(-2038581458);
                boolean h3 = rVar.h(dVar) | rVar.c(f11);
                Object O5 = rVar.O();
                if (h3 || O5 == v0Var) {
                    O5 = new g9(dVar, f11);
                    rVar.k0(O5);
                }
                rVar2 = androidx.compose.ui.graphics.a(rVar2, (df.l) O5);
            }
            rVar.p(false);
            z1.p0 d10 = x.d(c.f15670u, false);
            int hashCode = Long.hashCode(rVar.T);
            g l10 = rVar.l();
            r c10 = a.c(rVar2, rVar);
            h.f1471d.getClass();
            b0 b0Var = g.f1462b;
            rVar.e0();
            if (rVar.S) {
                rVar.k(b0Var);
            } else {
                rVar.n0();
            }
            y.I(g.e, d10, rVar);
            y.I(g.f1464d, l10, rVar);
            f fVar = g.f1465f;
            if (rVar.S || !kotlin.jvm.internal.a(rVar.O(), Integer.valueOf(hashCode))) {
                a.t(hashCode, rVar, hashCode, fVar);
            }
            y.I(g.f1463c, c10, rVar);
            if (s9Var.f29083d) {
                maVar = ma.TAPES;
            } else if (!s9Var.f29087j.isEmpty()) {
                maVar = ma.FRAMES;
            } else if (!s9Var.f29089l.isEmpty()) {
                maVar = ma.ACCESSORIES;
            } else {
                maVar = ma.STICKERS;
            }
            z9.b(s9Var.f29090m, h.d(-1049991190, new j9(maVar, s9Var, this.f2374x, this.f2375y, this.f2376z, this.A, this.B), rVar), rVar, 48);
            rVar.p(true);
            rVar.p(false);
        } else {
            rVar.U();
        }
        return pe.z.f22715a;
    }
}
