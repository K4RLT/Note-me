package o0;
import f1.a;
import f1.b;
import d1.o;
import d1.r;
import j1.e;
import k.a;
import k0.x0;
import m1.d;
import m1.h;
import o0.f1;
import q.t;
import q0.j;
import r0.l;
import r0.m;
import r0.q1;
import r0.v0;

import wa.b9;
import wa.r8;
import wa.u8;
import ya.ta;

/* loaded from: classes.dex */
public abstract class f1 {

    /* renamed from: a, reason: collision with root package name */
    public static final float f21481a;

    /* renamed from: b, reason: collision with root package name */
    public static final r f21482b;

    /* renamed from: c, reason: collision with root package name */
    public static final float f21483c = 240;

    /* renamed from: d, reason: collision with root package name */
    public static final float f21484d;
    public static final float e;

    /* renamed from: f, reason: collision with root package name */
    public static final t f21485f;

    static {
        float f10 = 10;
        f21481a = f10;
        f21482b = androidx.compose.foundation.layout.a.m(j2.a(androidx.compose.ui.layout.a.b(o.f15687a, b1.f21415u), true, k0.f21538w), 0.0f, f10, 1);
        float f11 = j.f23139c;
        f21484d = f11;
        e = j.f23140d - (f11 * 2);
        new t(0.2f, 0.0f, 0.8f, 1.0f);
        new t(0.4f, 0.0f, 1.0f, 1.0f);
        new t(0.0f, 0.0f, 0.65f, 1.0f);
        new t(0.1f, 0.0f, 0.45f, 1.0f);
        f21485f = new t(0.4f, 0.0f, 0.2f, 1.0f);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x007d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(df.a r19, r r20, long r21, float r23, long r24, int r26, float r27, m r28, int r29, int r30) {
        /*
            Method dump skipped, instructions count: 325
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o0.f1.a(df.a, r, long, float, long, int, float, m, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(r r29, long r30, float r32, long r33, int r35, m r36, int r37, int r38) {
        /*
            Method dump skipped, instructions count: 575
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o0.f1.b(r, long, float, long, int, m, int, int):void");
    }

    public static final void c(df.a aVar, r rVar, long j10, long j11, int i, float f10, df.l lVar, m mVar, int i10) {
        int i11;
        int i12;
        int i13;
        float f11;
        boolean z3;
        int i14;
        int i15;
        long j12;
        df.l lVar2;
        int i16;
        boolean z9;
        df.l lVar3;
        float f12;
        df.l lVar4;
        r rVar2 = (r) mVar;
        rVar2.c0(-339970038);
        if (rVar2.h(aVar)) {
            i11 = 4;
        } else {
            i11 = 2;
        }
        int i17 = i10 | i11;
        if (rVar2.f(rVar)) {
            i12 = 32;
        } else {
            i12 = 16;
        }
        int i18 = i17 | i12;
        if (rVar2.d(i)) {
            i13 = 16384;
        } else {
            i13 = 8192;
        }
        int i19 = i18 | i13 | 720896;
        if ((599187 & i19) == 599186 && rVar2.D()) {
            rVar2.U();
            f12 = f10;
            lVar4 = lVar;
        } else {
            rVar2.W();
            int i20 = i10 & 1;
            v0 v0Var = l.f24285a;
            boolean z10 = true;
            if (i20 != 0 && !rVar2.A()) {
                rVar2.U();
                i16 = i19 & (-3670017);
                f11 = f10;
                lVar2 = lVar;
                i14 = 57344;
                j12 = j10;
            } else {
                f11 = e;
                if ((i19 & 57344) == 16384) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                Object O = rVar2.O();
                if (!z3 && O != v0Var) {
                    i14 = 57344;
                    i15 = -3670017;
                    j12 = j10;
                } else {
                    i14 = 57344;
                    i15 = -3670017;
                    j12 = j10;
                    O = new c1(j12, i);
                    rVar2.k0(O);
                }
                lVar2 = (df.l) O;
                i16 = i19 & i15;
            }
            rVar2.q();
            if ((i16 & 14) == 4) {
                z9 = true;
            } else {
                z9 = false;
            }
            Object O2 = rVar2.O();
            if (z9 || O2 == v0Var) {
                O2 = new a1(1, aVar);
                rVar2.k0(O2);
            }
            df.a aVar2 = (df.a) O2;
            r d2 = rVar.d(f21482b);
            boolean f13 = rVar2.f(aVar2);
            Object O3 = rVar2.O();
            if (f13 || O3 == v0Var) {
                O3 = new x0(3, aVar2);
                rVar2.k0(O3);
            }
            r l10 = androidx.compose.foundation.layout.d.l(j2.a(d2, true, (df.l) O3), f21483c, f21484d);
            if ((i16 & i14) != 16384) {
                z10 = false;
            }
            boolean f14 = rVar2.f(aVar2) | z10 | rVar2.f(lVar2);
            Object O4 = rVar2.O();
            if (!f14 && O4 != v0Var) {
                lVar3 = lVar2;
            } else {
                lVar3 = lVar2;
                d1 d1Var = new d1(i, f11, aVar2, j11, j12, lVar3);
                rVar2.k0(d1Var);
                O4 = d1Var;
            }
            ta.a(l10, (df.l) O4, rVar2, 0);
            f12 = f11;
            lVar4 = lVar3;
        }
        q1 t3 = rVar2.t();
        if (t3 != null) {
            t3.f24332d = new e1(aVar, rVar, j10, j11, i, f12, lVar4, i10);
        }
    }

    public static final void d(d dVar, float f10, float f11, long j10, float f12, int i) {
        boolean z3;
        float f13;
        float f14;
        float d2 = e.d(dVar.e());
        float b10 = e.b(dVar.e());
        float f15 = 2;
        float f16 = b10 / f15;
        if (dVar.getLayoutDirection() == y2.m.f30814u) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            f13 = f10;
        } else {
            f13 = 1.0f - f11;
        }
        float f17 = f13 * d2;
        if (z3) {
            f14 = f11;
        } else {
            f14 = 1.0f - f10;
        }
        float f18 = f14 * d2;
        if (i == 0 || b10 > d2) {
            d.n0(dVar, j10, r8.a(f17, f16), r8.a(f18, f16), f12, 0, null, 496);
            return;
        }
        float f19 = f12 / f15;
        jf.a aVar = new jf.a(f19, d2 - f19);
        float floatValue = ((Number) b9.g(Float.valueOf(f17), aVar)).floatValue();
        float floatValue2 = ((Number) b9.g(Float.valueOf(f18), aVar)).floatValue();
        if (Math.abs(f11 - f10) > 0.0f) {
            d.n0(dVar, j10, r8.a(floatValue, f16), r8.a(floatValue2, f16), f12, i, null, 480);
        }
    }

    public static final void e(d dVar, float f10, float f11, long j10, h hVar) {
        float f12 = 2;
        float f13 = hVar.f20430a / f12;
        float d2 = e.d(dVar.e()) - (f12 * f13);
        dVar.N(j10, f10, f11, r8.a(f13, f13), u8.a(d2, d2), hVar);
    }
}
