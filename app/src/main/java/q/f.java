package q;
import a0.o;
import j1.c;
import l.a;
import r0.a1;
import r0.l;
import r0.m;
import r0.r;
import r0.y;

import b8.d5;
import r0.n2;
import ya.jb;

/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static final r0 f22889a = e.r(0.0f, 0.0f, null, 7);

    static {
        c cVar = t1.f23011a;
        Float.floatToRawIntBits(0.5f);
        Float.floatToRawIntBits(0.5f);
        Float.floatToRawIntBits(0.5f);
        Float.floatToRawIntBits(0.5f);
    }

    public static final n2 a(float f10, z zVar, String str, m mVar, int i, int i10) {
        z zVar2;
        Float valueOf = Float.valueOf(0.01f);
        if ((i10 & 8) != 0) {
            str = "FloatAnimation";
        }
        String str2 = str;
        if (zVar == f22889a) {
            r rVar = (r) mVar;
            rVar.a0(1125558999);
            boolean c10 = rVar.c(0.01f);
            Object O = rVar.O();
            if (c10 || O == l.f24285a) {
                O = e.r(0.0f, 0.0f, valueOf, 3);
                rVar.k0(O);
            }
            rVar.p(false);
            zVar2 = (r0) O;
        } else {
            r rVar2 = (r) mVar;
            rVar2.a0(1125668925);
            rVar2.p(false);
            zVar2 = zVar;
        }
        return b(Float.valueOf(f10), m1.f22948a, zVar2, valueOf, str2, mVar, (i & 14) | ((i << 3) & 57344), 0);
    }

    public static final n2 b(Object obj, l1 l1Var, k kVar, Float f10, String str, m mVar, int i, int i10) {
        boolean z3;
        if ((i10 & 8) != 0) {
            f10 = null;
        }
        r rVar = (r) mVar;
        Object O = rVar.O();
        Object obj2 = l.f24285a;
        if (O == obj2) {
            O = y.B(null);
            rVar.k0(O);
        }
        a1 a1Var = (a1) O;
        Object O2 = rVar.O();
        if (O2 == obj2) {
            O2 = new d(obj, l1Var, f10);
            rVar.k0(O2);
        }
        d dVar = (d) O2;
        a1 G = y.G(null, rVar);
        if (f10 != null && (kVar instanceof r0)) {
            r0 r0Var = (r0) kVar;
            if (!kotlin.jvm.internal.a(r0Var.f22976c, f10)) {
                kVar = new r0(r0Var.f22974a, r0Var.f22975b, f10);
            }
        }
        a1 G2 = y.G(kVar, rVar);
        Object O3 = rVar.O();
        if (O3 == obj2) {
            O3 = jb.a(-1, 6, null);
            rVar.k0(O3);
        }
        rf.l lVar = (rf.l) O3;
        boolean h3 = rVar.h(lVar);
        if ((((i & 14) ^ 6) > 4 && rVar.h(obj)) || (6 & i) == 4) {
            z3 = true;
        } else {
            z3 = false;
        }
        boolean z9 = h3 | z3;
        Object O4 = rVar.O();
        if (z9 || O4 == obj2) {
            O4 = new o(lVar, 18, obj);
            rVar.k0(O4);
        }
        y.j((df.a) O4, rVar);
        boolean h10 = rVar.h(lVar) | rVar.h(dVar) | rVar.f(G2) | rVar.f(G);
        Object O5 = rVar.O();
        if (h10 || O5 == obj2) {
            Object d5Var = new d5(lVar, dVar, G2, G, null);
            rVar.k0(d5Var);
            O5 = d5Var;
        }
        y.f((df.p) O5, lVar, rVar);
        n2 n2Var = (n2) a1Var.getValue();
        if (n2Var == null) {
            return dVar.f22865c;
        }
        return n2Var;
    }
}
