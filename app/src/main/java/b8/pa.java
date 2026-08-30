package b8;
import a.a;
import b2.b0;
import b2.f;
import b2.g;
import b2.h;
import d1.a;
import d1.c;
import d1.j;
import d1.o;
import d1.r;
import eb.w;
import f.a;
import f0.d;
import f0.e;
import j2.k;
import j7.a;
import k1.l0;
import k1.r;
import kb.h;
import l.a;
import m.d;
import m.h;
import p.a;
import p.n1;
import pa.a;
import r0.l;
import r0.m;
import r0.n2;
import r0.q1;
import r0.r;
import r0.v0;
import r0.y;
import sa.b;
import v.i;
import x7.h0;
import z0.g;

/* loaded from: classes.dex */
public abstract class pa {

    /* renamed from: a, reason: collision with root package name */
    public static final float f2541a = 46;

    /* renamed from: b, reason: collision with root package name */
    public static final float f2542b = 24;

    /* renamed from: c, reason: collision with root package name */
    public static final d f2543c = e.a(14);

    /* renamed from: d, reason: collision with root package name */
    public static final long f2544d = l0.d(4294953295L);
    public static final long e = l0.d(4294087680L);

    /* renamed from: f, reason: collision with root package name */
    public static final long f2545f = r.c(l0.d(4279505190L), 0.55f);

    /* renamed from: g, reason: collision with root package name */
    public static final long f2546g = l0.d(4280490496L);

    /* renamed from: h, reason: collision with root package name */
    public static final long f2547h = r.c(r.f19515d, 0.8f);

    public static final void a(final o5 o5Var, final String str, final boolean z3, final df.a aVar, r rVar, final boolean z9, df.a aVar2, m mVar, final int i, final int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        final df.a aVar3;
        int i15;
        int i16;
        boolean z10;
        final r rVar2;
        float f10;
        long j10;
        boolean z11;
        boolean z12;
        df.a aVar4;
        v0 v0Var;
        r h3;
        boolean z13;
        o5Var.getClass();
        str.getClass();
        aVar.getClass();
        r rVar3 = (r) mVar;
        rVar3.c0(839658607);
        if (rVar3.f(str)) {
            i11 = 32;
        } else {
            i11 = 16;
        }
        int i17 = i | i11;
        if (rVar3.g(z3)) {
            i12 = 256;
        } else {
            i12 = 128;
        }
        int i18 = i17 | i12;
        if (rVar3.h(aVar)) {
            i13 = 2048;
        } else {
            i13 = 1024;
        }
        int i19 = i18 | i13 | 24576;
        if (rVar3.g(z9)) {
            i14 = 131072;
        } else {
            i14 = 65536;
        }
        int i20 = i19 | i14;
        int i21 = i10 & 64;
        if (i21 != 0) {
            i16 = i20 | 1572864;
            aVar3 = aVar2;
        } else {
            aVar3 = aVar2;
            if (rVar3.h(aVar3)) {
                i15 = 1048576;
            } else {
                i15 = 524288;
            }
            i16 = i20 | i15;
        }
        if ((599187 & i16) != 599186) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (rVar3.R(i16 & 1, z10)) {
            if (i21 != 0) {
                aVar3 = null;
            }
            Object O = rVar3.O();
            v0 v0Var2 = l.f24285a;
            if (O == v0Var2) {
                O = a.r(rVar3);
            }
            i iVar = (i) O;
            float f11 = 1.0f;
            if (((Boolean) h(iVar, rVar3).getValue()).booleanValue()) {
                f10 = 0.92f;
            } else {
                f10 = 1.0f;
            }
            df.a aVar5 = aVar3;
            n2 a10 = q.a(f10, q.e.r(0.55f, 400.0f, null, 4), "shelfChipPress", rVar3, 3120, 20);
            if (!z3) {
                f11 = 0.0f;
            }
            q.t tVar = z9.f3099a;
            n2 a11 = q.a(f11, q.e.s(260, 0, tVar, 2), "shelfChipSelect", rVar3, 3120, 20);
            if (z3) {
                j10 = f2546g;
            } else {
                j10 = f2547h;
            }
            n2 a12 = n1.a(j10, q.e.s(260, 0, tVar, 2), "shelfChipInk", rVar3, 432, 8);
            rVar3 = rVar3;
            o oVar = o.f15687a;
            float f12 = f2541a;
            r k3 = androidx.compose.foundation.layout.d.k(oVar, f12);
            boolean f13 = rVar3.f(a10);
            Object O2 = rVar3.O();
            if (f13 || O2 == v0Var2) {
                O2 = new x2(a10, 2);
                rVar3.k0(O2);
            }
            r a13 = androidx.compose.ui.graphics.a(k3, (df.l) O2);
            if ((i16 & 112) == 32) {
                z11 = true;
            } else {
                z11 = false;
            }
            if ((i16 & 896) == 256) {
                z12 = true;
            } else {
                z12 = false;
            }
            boolean z14 = z12 | z11;
            Object O3 = rVar3.O();
            if (z14 || O3 == v0Var2) {
                O3 = new na(0, str, z3);
                rVar3.k0(O3);
            }
            r a14 = k.a(a13, false, (df.l) O3);
            if (aVar5 == null) {
                v0Var = v0Var2;
                aVar4 = aVar5;
                h3 = androidx.compose.foundation.a.e(oVar, iVar, null, false, null, aVar, 28);
            } else {
                aVar4 = aVar5;
                v0Var = v0Var2;
                h3 = androidx.compose.foundation.a.h(oVar, iVar, aVar4, aVar, 444);
            }
            r d2 = a14.d(h3);
            boolean f14 = rVar3.f(a11);
            Object O4 = rVar3.O();
            if (f14 || O4 == v0Var) {
                O4 = new x2(a11, 3);
                rVar3.k0(O4);
            }
            r a15 = androidx.compose.ui.draw.a(d2, (df.l) O4);
            j jVar = c.f15674y;
            z1.p0 d10 = x.d(jVar, false);
            int hashCode = Long.hashCode(rVar3.T);
            g l10 = rVar3.l();
            r c10 = a.c(a15, rVar3);
            h.f1471d.getClass();
            b0 b0Var = g.f1462b;
            rVar3.e0();
            if (rVar3.S) {
                rVar3.k(b0Var);
            } else {
                rVar3.n0();
            }
            f fVar = g.e;
            y.I(fVar, d10, rVar3);
            f fVar2 = g.f1464d;
            y.I(fVar2, l10, rVar3);
            f fVar3 = g.f1465f;
            if (rVar3.S || !kotlin.jvm.internal.a(rVar3.O(), Integer.valueOf(hashCode))) {
                a.t(hashCode, rVar3, hashCode, fVar3);
            }
            f fVar4 = g.f1463c;
            y.I(fVar4, c10, rVar3);
            r k4 = androidx.compose.foundation.layout.d.k(oVar, f12);
            d dVar = f2543c;
            r b10 = androidx.compose.foundation.a.b(wa.a(k4, dVar), f2545f, l0.f19495a);
            boolean f15 = rVar3.f(a11);
            Object O5 = rVar3.O();
            if (f15 || O5 == v0Var) {
                O5 = new x2(a11, 4);
                rVar3.k0(O5);
            }
            df.a aVar6 = aVar4;
            r b11 = ya.b(androidx.compose.ui.draw.a(b10, (df.l) O5), 1, w.k(qe.h(new r(l0.t(r.c(r.f19515d, 0.22f), r.c(l0.d(4294961320L), 0.9f), ((Number) a11.getValue()).floatValue())), new r(l0.t(r.c(l0.d(4286267364L), 0.35f), r.c(e, 0.7f), ((Number) a11.getValue()).floatValue()))), 0.0f, 0.0f, 14), dVar);
            z1.p0 d11 = x.d(jVar, false);
            int hashCode2 = Long.hashCode(rVar3.T);
            g l11 = rVar3.l();
            r c11 = a.c(b11, rVar3);
            rVar3.e0();
            if (rVar3.S) {
                rVar3.k(b0Var);
            } else {
                rVar3.n0();
            }
            y.I(fVar, d11, rVar3);
            y.I(fVar2, l11, rVar3);
            if (rVar3.S || !kotlin.jvm.internal.a(rVar3.O(), Integer.valueOf(hashCode2))) {
                a.t(hashCode2, rVar3, hashCode2, fVar3);
            }
            y.I(fVar4, c11, rVar3);
            e1.n(o5Var, ((r) a12.getValue()).f19523a, androidx.compose.foundation.layout.d.k(oVar, f2542b), rVar3, 390);
            rVar3.p(true);
            if (z9) {
                rVar3.a0(-976754948);
                z13 = false;
                h0.b(0, androidx.compose.foundation.layout.a.h(androidx.compose.foundation.layout.b.f501a.a(oVar, c.f15672w), 2, -2), rVar3);
            } else {
                z13 = false;
                rVar3.a0(-984821427);
            }
            rVar3.p(z13);
            rVar3.p(true);
            rVar2 = oVar;
            aVar3 = aVar6;
        } else {
            rVar3.U();
            rVar2 = rVar;
        }
        q1 t3 = rVar3.t();
        if (t3 != null) {
            t3.f24332d = new df.p(str, z3, aVar, rVar2, z9, aVar3, i, i10) { // from class: b8.oa
                public final /* synthetic */ df.a A;
                public final /* synthetic */ int B;

                /* renamed from: v, reason: collision with root package name */
                public final /* synthetic */ String f2498v;

                /* renamed from: w, reason: collision with root package name */
                public final /* synthetic */ boolean f2499w;

                /* renamed from: x, reason: collision with root package name */
                public final /* synthetic */ df.a f2500x;

                /* renamed from: y, reason: collision with root package name */
                public final /* synthetic */ r f2501y;

                /* renamed from: z, reason: collision with root package name */
                public final /* synthetic */ boolean f2502z;

                {
                    this.B = i10;
                }

                @Override // df.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int L = y.L(7);
                    a(o5.this, this.f2498v, this.f2499w, this.f2500x, this.f2501y, this.f2502z, this.A, (m) obj, L, this.B);
                    return pe.z.f22715a;
                }
            };
        }
    }
}
