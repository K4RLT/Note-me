package g0;
import a0.k0;
import d1.a;
import d1.c;
import d1.o;
import d1.r;
import j2.k;
import k0.o;
import k0.v0;
import r0.l;
import r0.m;
import r0.q1;
import r0.r;
import x.b;
import z0.h;

/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static final float f17091a;

    /* renamed from: b, reason: collision with root package name */
    public static final float f17092b;

    static {
        float f10 = 25;
        f17091a = f10;
        f17092b = (f10 * 2.0f) / 2.4142137f;
    }

    public static final void a(o oVar, r rVar, long j10, m mVar, int i) {
        int i10;
        int i11;
        boolean z3;
        int i12;
        r rVar2 = (r) mVar;
        rVar2.c0(1776202187);
        if (rVar2.f(oVar)) {
            i10 = 4;
        } else {
            i10 = 2;
        }
        int i13 = i10 | i;
        if (rVar2.f(rVar)) {
            i11 = 32;
        } else {
            i11 = 16;
        }
        int i14 = i13 | i11 | 128;
        boolean z9 = true;
        if ((i14 & 147) != 146) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (rVar2.R(i14 & 1, z3)) {
            rVar2.W();
            if ((i & 1) != 0 && !rVar2.A()) {
                rVar2.U();
                i12 = i14 & (-897);
            } else {
                i12 = i14 & (-897);
                j10 = 9205357640488583168L;
            }
            rVar2.q();
            int i15 = i12 & 14;
            if (i15 != 4) {
                z9 = false;
            }
            Object O = rVar2.O();
            if (z9 || O == l.f24285a) {
                O = new k0(15, oVar);
                rVar2.k0(O);
            }
            v0.a(oVar, c.f15671v, h.d(-1653527038, new a(j10, k.a(rVar, false, (df.l) O)), rVar2), rVar2, i15 | 432);
        } else {
            rVar2.U();
        }
        long j11 = j10;
        q1 t3 = rVar2.t();
        if (t3 != null) {
            t3.f24332d = new b(oVar, rVar, j11, i);
        }
    }

    public static final void b(int i, int i10, r rVar, m mVar) {
        int i11;
        int i12;
        boolean z3;
        r rVar2 = (r) mVar;
        rVar2.c0(694251107);
        int i13 = i10 & 1;
        if (i13 != 0) {
            i11 = i | 6;
        } else if ((i & 6) == 0) {
            if (rVar2.f(rVar)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i11 = i12 | i;
        } else {
            i11 = i;
        }
        if ((i11 & 3) != 2) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (rVar2.R(i11 & 1, z3)) {
            if (i13 != 0) {
                rVar = o.f15687a;
            }
            b.b(a.a(androidx.compose.foundation.layout.d.l(rVar, f17092b, f17091a), e.f17052v), rVar2);
        } else {
            rVar2.U();
        }
        q1 t3 = rVar2.t();
        if (t3 != null) {
            t3.f24332d = new c(i, i10, rVar);
        }
    }
}
