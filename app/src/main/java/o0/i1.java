package o0;
import f.a;
import k1.r;
import n0.d;
import n0.j;
import q.k1;
import r.l0;
import r0.a1;
import r0.c0;
import r0.l;
import r0.m;
import r0.p1;
import r0.y;

import r0.o2;

/* loaded from: classes.dex */
public abstract class i1 {

    /* renamed from: a, reason: collision with root package name */
    public static final o2 f21516a = new p1(n.C);

    /* renamed from: b, reason: collision with root package name */
    public static final c0 f21517b = new c0(n.B);

    /* renamed from: c, reason: collision with root package name */
    public static final j1 f21518c;

    /* renamed from: d, reason: collision with root package name */
    public static final j1 f21519d;

    /* JADX WARN: Type inference failed for: r1v0, types: [p1, o2] */
    static {
        long j10 = r.f19521l;
        f21518c = new j1(Float.NaN, j10, true);
        f21519d = new j1(Float.NaN, j10, false);
    }

    public static final l0 a(boolean z3, float f10, m mVar, int i, int i10) {
        l0 j1Var;
        j1 j1Var2;
        boolean z9;
        boolean z10 = true;
        if ((i10 & 1) != 0) {
            z3 = true;
        }
        if ((i10 & 2) != 0) {
            f10 = Float.NaN;
        }
        long j10 = r.f19521l;
        r rVar = (r) mVar;
        rVar.a0(-1280632857);
        if (((Boolean) rVar.j(f21516a)).booleanValue()) {
            k1 k1Var = j.f20992a;
            a1 G = y.G(new r(j10), rVar);
            if ((((i & 14) ^ 6) > 4 && rVar.g(z3)) || (i & 6) == 4) {
                z9 = true;
            } else {
                z9 = false;
            }
            if ((((i & 112) ^ 48) <= 32 || !rVar.c(f10)) && (i & 48) != 32) {
                z10 = false;
            }
            boolean z11 = z9 | z10;
            Object O = rVar.O();
            if (z11 || O == l.f24285a) {
                O = new d(z3, f10, G);
                rVar.k0(O);
            }
            j1Var = (d) O;
        } else if (y2.a(f10, Float.NaN) && pe.a(j10, j10)) {
            if (z3) {
                j1Var2 = f21518c;
            } else {
                j1Var2 = f21519d;
            }
            j1Var = j1Var2;
        } else {
            j1Var = new j1(f10, j10, z3);
        }
        rVar.p(false);
        return j1Var;
    }
}
