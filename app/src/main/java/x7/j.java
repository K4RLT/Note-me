package x7;
import a.a;
import c.a;
import f0.d;
import f0.e;
import j.a;
import j.b;
import j.f;
import j.g;
import j.i0;
import j.n;
import j.p;
import j.q;
import j.r;
import j.u;
import j.v;
import k.a;
import m.h;
import n.a;
import p.a;
import q.e;
import q.f;
import r.c;
import x.b;
import x.c;
import x.e;
import x.h;
import x.m;
import x.o0;
import x.p0;
import x.q0;
import x.q;
import x.r;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.SharedPreferences;
import android.widget.Toast;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import b8.f1;
import b8.fb;
import b8.i8;
import b8.n4;
import b8.q8;
import b8.t6;
import b8.x2;
import b8.x8;
import b8.z7;
import c2.p1;
import com.daren.scraply.R;
import g0.w1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import o0.x1;
import r0.a1;
import r0.e1;
import r0.n2;
import r0.q1;
import u7.o4;
import w7.c9;
import w7.i1;
import w7.kb;
import w7.m4;
import w7.r5;
import w7.u5;
import wa.b9;
import wa.j6;
import wa.j7;
import wa.m7;
import wa.n7;
import ya.ae;
import ya.sa;
import ya.ta;

/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static final z0.c f30208a = new z0.c(-422299921, new f1(3), false);

    static {
        new z0.c(-121754785, new f1(4), false);
    }

    public static final void a(final float f10, final float f11, final float f12, final df.l lVar, final d1.r rVar, df.a aVar, r0.m mVar, final int i, final int i10) {
        int i11;
        int i12;
        int i13;
        df.a aVar2;
        int i14;
        int i15;
        boolean z3;
        final df.a aVar3;
        df.a aVar4;
        boolean z9;
        boolean z10;
        Object kbVar;
        Float f13;
        Float f14;
        lVar.getClass();
        r0.r rVar2 = (r0.r) mVar;
        rVar2.c0(323666254);
        if (rVar2.c(f10)) {
            i11 = 4;
        } else {
            i11 = 2;
        }
        int i16 = i | i11;
        if (rVar2.h(lVar)) {
            i12 = 2048;
        } else {
            i12 = 1024;
        }
        int i17 = i16 | i12;
        if (rVar2.f(rVar)) {
            i13 = 16384;
        } else {
            i13 = 8192;
        }
        int i18 = i17 | i13;
        int i19 = i10 & 32;
        if (i19 != 0) {
            i15 = i18 | 196608;
            aVar2 = aVar;
        } else {
            aVar2 = aVar;
            if (rVar2.h(aVar2)) {
                i14 = 131072;
            } else {
                i14 = 65536;
            }
            i15 = i18 | i14;
        }
        if ((74899 & i15) != 74898) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (rVar2.R(i15 & 1, z3)) {
            if (i19 != 0) {
                aVar4 = null;
            } else {
                aVar4 = aVar2;
            }
            Object O = rVar2.O();
            r0.v0 v0Var = r0.l.f24285a;
            if (O == v0Var) {
                O = i1.g(1.0f, rVar2);
            }
            e1 e1Var = (e1) O;
            float d2 = b9.d((f10 - f11) / (f12 - f11), 0.0f, 1.0f);
            d1.r f15 = androidx.compose.foundation.layout.d.f(rVar, 36);
            Object O2 = rVar2.O();
            if (O2 == v0Var) {
                O2 = new u5(e1Var, 1);
                rVar2.k0(O2);
            }
            d1.r e = androidx.compose.ui.layout.a.e(f15, (df.l) O2);
            Float valueOf = Float.valueOf(f11);
            Float valueOf2 = Float.valueOf(f12);
            if ((i15 & 7168) == 2048) {
                z9 = true;
            } else {
                z9 = false;
            }
            if ((i15 & 458752) == 131072) {
                z10 = true;
            } else {
                z10 = false;
            }
            boolean z11 = z10 | z9;
            Object O3 = rVar2.O();
            if (!z11 && O3 != v0Var) {
                kbVar = O3;
                f13 = valueOf;
                f14 = valueOf2;
            } else {
                f13 = valueOf;
                f14 = valueOf2;
                kbVar = new kb(lVar, f11, f12, aVar4, e1Var);
                rVar2.k0(kbVar);
            }
            d1.r c10 = v1.d0.c(e, f13, f14, (PointerInputEventHandler) kbVar);
            z1.p0 d10 = m.d(d1.c.f15673x, false);
            int hashCode = Long.hashCode(rVar2.T);
            z0.g l10 = rVar2.l();
            d1.r c11 = d1.a.c(c10, rVar2);
            b2.h.f1471d.getClass();
            b2.b0 b0Var = b2.g.f1462b;
            rVar2.e0();
            if (rVar2.S) {
                rVar2.k(b0Var);
            } else {
                rVar2.n0();
            }
            r0.y.I(b2.g.e, d10, rVar2);
            r0.y.I(b2.g.f1464d, l10, rVar2);
            b2.f fVar = b2.g.f1465f;
            if (rVar2.S || !kotlin.jvm.internal.l.a(rVar2.O(), Integer.valueOf(hashCode))) {
                a.t(hashCode, rVar2, hashCode, fVar);
            }
            r0.y.I(b2.g.f1463c, c11, rVar2);
            FillElement fillElement = androidx.compose.foundation.layout.d.f506c;
            boolean c12 = rVar2.c(d2);
            Object O4 = rVar2.O();
            if (c12 || O4 == v0Var) {
                O4 = new n4(7, d2);
                rVar2.k0(O4);
            }
            ta.a(fillElement, (df.l) O4, rVar2, 6);
            rVar2.p(true);
            aVar3 = aVar4;
        } else {
            rVar2.U();
            aVar3 = aVar2;
        }
        q1 t3 = rVar2.t();
        if (t3 != null) {
            t3.f24332d = new df.p(f10, f11, f12, lVar, rVar, aVar3, i, i10) { // from class: x7.d
                public final /* synthetic */ int A;

                /* renamed from: u, reason: collision with root package name */
                public final /* synthetic */ float f30161u;

                /* renamed from: v, reason: collision with root package name */
                public final /* synthetic */ float f30162v;

                /* renamed from: w, reason: collision with root package name */
                public final /* synthetic */ float f30163w;

                /* renamed from: x, reason: collision with root package name */
                public final /* synthetic */ df.l f30164x;

                /* renamed from: y, reason: collision with root package name */
                public final /* synthetic */ d1.r f30165y;

                /* renamed from: z, reason: collision with root package name */
                public final /* synthetic */ df.a f30166z;

                {
                    this.A = i10;
                }

                @Override // df.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int L = r0.y.L(433);
                    a(this.f30161u, this.f30162v, this.f30163w, this.f30164x, this.f30165y, this.f30166z, (r0.m) obj, L, this.A);
                    return pe.z.f22715a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:77:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(final boolean r28, final long r29, final df.l r31, final df.a r32, df.a r33, r0.m r34, final int r35, final int r36) {
        /*
            Method dump skipped, instructions count: 532
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x7.b(boolean, long, df.l, df.a, df.a, r0.m, int, int):void");
    }

    public static final void c(boolean z3, final String str, final df.a aVar, df.a aVar2, r0.m mVar, int i) {
        int i10;
        int i11;
        boolean z9;
        q1 t3;
        k kVar;
        a1 a1Var;
        Object nVar;
        int i12;
        r0.v0 v0Var;
        int i13;
        str.getClass();
        aVar.getClass();
        aVar2.getClass();
        r0.r rVar = (r0.r) mVar;
        rVar.c0(-1085388713);
        if (rVar.g(z3)) {
            i10 = 4;
        } else {
            i10 = 2;
        }
        int i14 = i10 | i;
        if (rVar.f(str)) {
            i11 = 32;
        } else {
            i11 = 16;
        }
        int i15 = i14 | i11;
        if ((i & 384) == 0) {
            if (rVar.h(aVar)) {
                i13 = 256;
            } else {
                i13 = 128;
            }
            i15 |= i13;
        }
        boolean z10 = true;
        if ((i15 & 1171) != 1170) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (rVar.R(i15 & 1, z9)) {
            Object O = rVar.O();
            r0.v0 v0Var2 = r0.l.f24285a;
            if (O == v0Var2) {
                O = r0.y.B(Boolean.valueOf(z3));
                rVar.k0(O);
            }
            a1 a1Var2 = (a1) O;
            Object O2 = rVar.O();
            if (O2 == v0Var2) {
                O2 = r0.y.B(Boolean.FALSE);
                rVar.k0(O2);
            }
            final a1 a1Var3 = (a1) O2;
            Boolean valueOf = Boolean.valueOf(z3);
            if ((i15 & 14) != 4) {
                z10 = false;
            }
            Object O3 = rVar.O();
            te.c cVar = null;
            if (z10 || O3 == v0Var2) {
                a1Var = a1Var2;
                i12 = 14;
                v0Var = v0Var2;
                nVar = new n(z3, a1Var, a1Var3, cVar, 0);
                rVar.k0(nVar);
            } else {
                a1Var = a1Var2;
                v0Var = v0Var2;
                nVar = O3;
                i12 = 14;
            }
            r0.y.f((df.p) nVar, valueOf, rVar);
            if (!((Boolean) a1Var.getValue()).booleanValue()) {
                t3 = rVar.t();
                if (t3 != null) {
                    kVar = new k(z3, str, aVar, aVar2, i, 0);
                    t3.f24332d = kVar;
                }
                return;
            }
            final long d2 = k1.l0.d(4062323239L);
            y2.c cVar2 = (y2.c) rVar.j(p1.f3606h);
            final float l0 = cVar2.l0(16);
            int b10 = ff.a.b(cVar2.l0(8));
            int b11 = ff.a.b(cVar2.l0(2));
            Object O4 = rVar.O();
            if (O4 == v0Var) {
                O4 = r0.y.B(null);
                rVar.k0(O4);
            }
            final a1 a1Var4 = (a1) O4;
            Object O5 = rVar.O();
            if (O5 == v0Var) {
                O5 = r0.y.B(0);
                rVar.k0(O5);
            }
            final a1 a1Var5 = (a1) O5;
            boolean c10 = rVar.c(l0) | rVar.d(b10) | rVar.d(b11);
            Object O6 = rVar.O();
            if (c10 || O6 == v0Var) {
                O6 = new o(b10, b11, l0, a1Var4, a1Var5);
                rVar.k0(O6);
            }
            final a1 a1Var6 = a1Var;
            c3.a((o) O6, aVar2, new c3.b0(i12, false), z0.h.d(-574972299, new df.p() { // from class: x7.l
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r10v1, types: [r0.r, r0.m] */
                /* JADX WARN: Type inference failed for: r4v12, types: [d1.r] */
                /* JADX WARN: Type inference failed for: r4v20 */
                /* JADX WARN: Type inference failed for: r4v21 */
                @Override // df.p
                public final Object invoke(Object obj, Object obj2) {
                    boolean z11;
                    float f10;
                    a1 a1Var7;
                    Object r42;
                    r0.m mVar2 = (r0.m) obj;
                    int intValue = ((Integer) obj2).intValue();
                    if ((intValue & 3) != 2) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    Object r10 = (r0.r) mVar2;
                    if (r10.R(intValue & 1, z11)) {
                        a1 a1Var8 = a1.this;
                        float f11 = 1.0f;
                        if (((Boolean) a1Var8.getValue()).booleanValue()) {
                            f10 = 1.0f;
                        } else {
                            f10 = 0.2f;
                        }
                        n2 a10 = f.a(f10, e.r(0.6f, 400.0f, null, 4), null, r10, 48, 28);
                        if (!((Boolean) a1Var8.getValue()).booleanValue()) {
                            f11 = 0.0f;
                        }
                        n2 a11 = f.a(f11, e.s(150, 0, null, 6), null, r10, 48, 28);
                        a1 a1Var9 = a1Var4;
                        Float f12 = (Float) a1Var9.getValue();
                        float f13 = 0.5f;
                        if (f12 != null) {
                            float floatValue = f12.floatValue();
                            if (((Number) a1Var5.getValue()).intValue() > 0) {
                                f13 = floatValue / ((Number) r8.getValue()).intValue();
                            }
                        }
                        d1.h hVar = d1.c.G;
                        boolean c11 = r10.c(f13) | r10.f(a10) | r10.f(a11);
                        Object O7 = r10.O();
                        Object obj3 = r0.l.f24285a;
                        if (c11 || O7 == obj3) {
                            O7 = new m(f13, a10, a11, 0);
                            r10.k0(O7);
                        }
                        d1.o oVar = d1.o.f15687a;
                        d1.r a12 = androidx.compose.ui.graphics.a(oVar, (df.l) O7);
                        r a13 = q.a(h.f29962b, hVar, r10, 48);
                        int hashCode = Long.hashCode(r10.T);
                        z0.g l10 = r10.l();
                        d1.r c12 = d1.a.c(a12, r10);
                        b2.h.f1471d.getClass();
                        b2.b0 b0Var = b2.g.f1462b;
                        r10.e0();
                        if (r10.S) {
                            r10.k(b0Var);
                        } else {
                            r10.n0();
                        }
                        b2.f fVar = b2.g.e;
                        r0.y.I(fVar, a13, r10);
                        b2.f fVar2 = b2.g.f1464d;
                        r0.y.I(fVar2, l10, r10);
                        b2.f fVar3 = b2.g.f1465f;
                        if (r10.S || !kotlin.jvm.internal.l.a(r10.O(), Integer.valueOf(hashCode))) {
                            a.t(hashCode, r10, hashCode, fVar3);
                        }
                        b2.f fVar4 = b2.g.f1463c;
                        r0.y.I(fVar4, c12, r10);
                        d1.i iVar = d1.c.E;
                        com.google.android.filament.g gVar = h.f29963c;
                        float f14 = 12;
                        d1.r a14 = m7.a(oVar, 14, e.a(f14), 0L, k1.c(k1.r.f19513b, 0.45f), 12);
                        d a15 = e.a(f14);
                        long j10 = d2;
                        d1.r b12 = androidx.compose.foundation.a.b(a14, j10, a15);
                        df.a aVar3 = aVar;
                        boolean f15 = r10.f(aVar3);
                        Object O8 = r10.O();
                        if (!f15 && O8 != obj3) {
                            a1Var7 = a1Var9;
                        } else {
                            a1Var7 = a1Var9;
                            O8 = new o4(aVar3, a1Var6, 6);
                            r10.k0(O8);
                        }
                        df.a aVar4 = (df.a) O8;
                        Object O9 = r10.O();
                        if (O9 == obj3) {
                            O9 = a.r(r10);
                        }
                        float f16 = 16;
                        d1.r l11 = androidx.compose.foundation.layout.a.l(b12.d(androidx.compose.foundation.a.e(b12, (v.i) O9, null, false, null, aVar4, 28)), f16, f14);
                        p0 a16 = o0.a(gVar, iVar, r10, 54);
                        int hashCode2 = Long.hashCode(r10.T);
                        z0.g l12 = r10.l();
                        d1.r c13 = d1.a.c(l11, r10);
                        r10.e0();
                        if (r10.S) {
                            r10.k(b0Var);
                        } else {
                            r10.n0();
                        }
                        r0.y.I(fVar, a16, r10);
                        r0.y.I(fVar2, l12, r10);
                        if (r10.S || !kotlin.jvm.internal.l.a(r10.O(), Integer.valueOf(hashCode2))) {
                            a.t(hashCode2, r10, hashCode2, fVar3);
                        }
                        r0.y.I(fVar4, c13, r10);
                        x1.b(str, null, k1.l0.d(4294922834L), ae.e(12), null, q2.s.f23368z, null, 0L, null, 0L, 0, false, 0, 0, null, r10, 200064, 0, 131026);
                        r10.p(true);
                        Float f17 = (Float) a1Var7.getValue();
                        if (f17 != null) {
                            r10.a0(1110973276);
                            boolean f18 = r10.f(f17);
                            float f19 = l0;
                            boolean c14 = f18 | r10.c(f19);
                            Object O10 = r10.O();
                            if (c14 || O10 == obj3) {
                                O10 = new h(f17, f19, 1);
                                r10.k0(O10);
                            }
                            d1.r g8 = androidx.compose.foundation.layout.a.g((df.l) O10);
                            r10.p(false);
                            r42 = g8;
                        } else {
                            r10.a0(1111080567);
                            r10.p(false);
                            r42 = new Object();
                        }
                        d1.r l13 = androidx.compose.foundation.layout.d.l(r42, f16, 8);
                        Object O11 = r10.O();
                        if (O11 == obj3) {
                            O11 = new fb(j10, 8);
                            r10.k0(O11);
                        }
                        ta.a(l13, (df.l) O11, r10, 48);
                        r10.p(true);
                    } else {
                        r10.U();
                    }
                    return pe.z.f22715a;
                }
            }, rVar), rVar, 3504, 0);
        } else {
            rVar.U();
        }
        t3 = rVar.t();
        if (t3 != null) {
            kVar = new k(z3, str, aVar, aVar2, i, 1);
            t3.f24332d = kVar;
        }
    }

    public static final void d(int i, d1.r rVar, df.a aVar, String str, r0.m mVar, boolean z3) {
        int i10;
        int i11;
        int i12;
        int i13;
        boolean z9;
        r0.r rVar2;
        long c10;
        r0.r rVar3 = (r0.r) mVar;
        rVar3.c0(-1183170455);
        if (rVar3.f(str)) {
            i10 = 4;
        } else {
            i10 = 2;
        }
        int i14 = i | i10;
        if (rVar3.g(z3)) {
            i11 = 32;
        } else {
            i11 = 16;
        }
        int i15 = i14 | i11;
        if (rVar3.f(rVar)) {
            i12 = 256;
        } else {
            i12 = 128;
        }
        int i16 = i15 | i12;
        if (rVar3.h(aVar)) {
            i13 = 2048;
        } else {
            i13 = 1024;
        }
        int i17 = i16 | i13;
        if ((i17 & 1171) != 1170) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (rVar3.R(i17 & 1, z9)) {
            Object O = rVar3.O();
            r0.v0 v0Var = r0.l.f24285a;
            if (O == v0Var) {
                O = a.r(rVar3);
            }
            d1.r m4 = androidx.compose.foundation.layout.a.m(androidx.compose.foundation.a.e(rVar, (v.i) O, null, false, null, aVar, 28), 0.0f, 8, 1);
            z1.p0 d2 = m.d(d1.c.f15674y, false);
            int hashCode = Long.hashCode(rVar3.T);
            z0.g l10 = rVar3.l();
            d1.r c11 = d1.a.c(m4, rVar3);
            b2.h.f1471d.getClass();
            b2.b0 b0Var = b2.g.f1462b;
            rVar3.e0();
            if (rVar3.S) {
                rVar3.k(b0Var);
            } else {
                rVar3.n0();
            }
            r0.y.I(b2.g.e, d2, rVar3);
            r0.y.I(b2.g.f1464d, l10, rVar3);
            b2.f fVar = b2.g.f1465f;
            if (rVar3.S || !kotlin.jvm.internal.l.a(rVar3.O(), Integer.valueOf(hashCode))) {
                a.t(hashCode, rVar3, hashCode, fVar);
            }
            r0.y.I(b2.g.f1463c, c11, rVar3);
            long e = ae.e(12);
            q2.s sVar = q2.s.A;
            Object O2 = rVar3.O();
            if (O2 == v0Var) {
                O2 = new c9(5);
                rVar3.k0(O2);
            }
            int i18 = i17 & 14;
            x1.b(str, androidx.compose.ui.graphics.a(d1.o.f15687a, (df.l) O2), 0L, e, null, sVar, null, 0L, null, 0L, 0, false, 0, 0, null, rVar3, i18 | 199728, 0, 131028);
            if (z3) {
                c10 = k1.r.f19515d;
            } else {
                c10 = k1.c(k1.r.f19515d, 0.4f);
            }
            long j10 = c10;
            long e8 = ae.e(12);
            if (!z3) {
                sVar = q2.s.f23367y;
            }
            x1.b(str, null, j10, e8, null, sVar, null, 0L, new x2.k(3), 0L, 0, false, 0, 0, null, rVar3, i18 | 3072, 0, 130514);
            rVar2 = rVar3;
            rVar2.p(true);
        } else {
            rVar2 = rVar3;
            rVar2.U();
        }
        q1 t3 = rVar2.t();
        if (t3 != null) {
            t3.f24332d = new x8(str, z3, rVar, aVar, i);
        }
    }

    public static final void e(boolean z3, final boolean z9, final boolean z10, final df.l lVar, final df.a aVar, r0.m mVar, int i) {
        int i10;
        int i11;
        int i12;
        int i13;
        boolean z11;
        q1 t3;
        r rVar;
        Object nVar;
        r0.v0 v0Var;
        int i14;
        a1 a1Var;
        final a1 a1Var2;
        lVar.getClass();
        aVar.getClass();
        r0.r rVar2 = (r0.r) mVar;
        rVar2.c0(-1504086373);
        if (rVar2.g(z3)) {
            i10 = 4;
        } else {
            i10 = 2;
        }
        int i15 = i | i10;
        if (rVar2.g(z9)) {
            i11 = 32;
        } else {
            i11 = 16;
        }
        int i16 = i15 | i11;
        if (rVar2.g(z10)) {
            i12 = 256;
        } else {
            i12 = 128;
        }
        int i17 = i16 | i12;
        if (rVar2.h(lVar)) {
            i13 = 2048;
        } else {
            i13 = 1024;
        }
        int i18 = i17 | i13;
        boolean z12 = true;
        if ((i18 & 9363) != 9362) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (rVar2.R(i18 & 1, z11)) {
            Object O = rVar2.O();
            r0.v0 v0Var2 = r0.l.f24285a;
            if (O == v0Var2) {
                O = r0.y.B(Boolean.valueOf(z3));
                rVar2.k0(O);
            }
            a1 a1Var3 = (a1) O;
            Object O2 = rVar2.O();
            if (O2 == v0Var2) {
                O2 = r0.y.B(Boolean.FALSE);
                rVar2.k0(O2);
            }
            a1 a1Var4 = (a1) O2;
            Boolean valueOf = Boolean.valueOf(z3);
            if ((i18 & 14) != 4) {
                z12 = false;
            }
            Object O3 = rVar2.O();
            te.c cVar = null;
            if (!z12 && O3 != v0Var2) {
                a1Var = a1Var3;
                v0Var = v0Var2;
                a1Var2 = a1Var4;
                nVar = O3;
                i14 = 14;
            } else {
                v0Var = v0Var2;
                i14 = 14;
                a1Var = a1Var3;
                nVar = new n(z3, a1Var, a1Var4, cVar, 1);
                a1Var2 = a1Var4;
                rVar2.k0(nVar);
            }
            r0.y.f((df.p) nVar, valueOf, rVar2);
            if (!((Boolean) a1Var.getValue()).booleanValue()) {
                t3 = rVar2.t();
                if (t3 != null) {
                    rVar = new r(z3, z9, z10, lVar, aVar, i, 0);
                    t3.f24332d = rVar;
                }
                return;
            }
            final long d2 = k1.l0.d(4062323239L);
            y2.c cVar2 = (y2.c) rVar2.j(p1.f3606h);
            final float l0 = cVar2.l0(16);
            int b10 = ff.a.b(cVar2.l0(8));
            int b11 = ff.a.b(cVar2.l0(2));
            Object O4 = rVar2.O();
            if (O4 == v0Var) {
                O4 = r0.y.B(null);
                rVar2.k0(O4);
            }
            final a1 a1Var5 = (a1) O4;
            Object O5 = rVar2.O();
            if (O5 == v0Var) {
                O5 = r0.y.B(0);
                rVar2.k0(O5);
            }
            final a1 a1Var6 = (a1) O5;
            boolean c10 = rVar2.c(l0) | rVar2.d(b10) | rVar2.d(b11);
            Object O6 = rVar2.O();
            if (c10 || O6 == v0Var) {
                u uVar = new u(b10, b11, l0, a1Var5, a1Var6);
                rVar2.k0(uVar);
                O6 = uVar;
            }
            c3.a((u) O6, aVar, new c3.b0(i14, false), z0.h.d(127075261, new df.p() { // from class: x7.s
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r1v23, types: [d1.r] */
                /* JADX WARN: Type inference failed for: r1v26 */
                /* JADX WARN: Type inference failed for: r1v27 */
                @Override // df.p
                public final Object invoke(Object obj, Object obj2) {
                    boolean z13;
                    float f10;
                    float f11;
                    final int i19;
                    boolean z14;
                    Object r12;
                    r0.m mVar2 = (r0.m) obj;
                    int intValue = ((Integer) obj2).intValue();
                    if ((intValue & 3) != 2) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    r0.r rVar3 = (r0.r) mVar2;
                    if (rVar3.R(intValue & 1, z13)) {
                        a1 a1Var7 = a1.this;
                        if (((Boolean) a1Var7.getValue()).booleanValue()) {
                            f10 = 1.0f;
                        } else {
                            f10 = 0.2f;
                        }
                        n2 a10 = f.a(f10, e.r(0.6f, 400.0f, null, 4), null, rVar3, 48, 28);
                        if (((Boolean) a1Var7.getValue()).booleanValue()) {
                            f11 = 1.0f;
                        } else {
                            f11 = 0.0f;
                        }
                        n2 a11 = f.a(f11, e.s(150, 0, null, 6), null, rVar3, 48, 28);
                        a1 a1Var8 = a1Var5;
                        Float f12 = (Float) a1Var8.getValue();
                        float f13 = 0.5f;
                        if (f12 != null) {
                            float floatValue = f12.floatValue();
                            if (((Number) a1Var6.getValue()).intValue() > 0) {
                                f13 = floatValue / ((Number) r9.getValue()).intValue();
                            }
                        }
                        d1.h hVar = d1.c.G;
                        boolean c11 = rVar3.c(f13) | rVar3.f(a10) | rVar3.f(a11);
                        Object O7 = rVar3.O();
                        r0.v0 v0Var3 = r0.l.f24285a;
                        if (c11 || O7 == v0Var3) {
                            O7 = new m(f13, a10, a11, 1);
                            rVar3.k0(O7);
                        }
                        d1.o oVar = d1.o.f15687a;
                        d1.r a12 = androidx.compose.ui.graphics.a(oVar, (df.l) O7);
                        c cVar3 = h.f29962b;
                        r a13 = q.a(cVar3, hVar, rVar3, 48);
                        int hashCode = Long.hashCode(rVar3.T);
                        z0.g l10 = rVar3.l();
                        d1.r c12 = d1.a.c(a12, rVar3);
                        b2.h.f1471d.getClass();
                        b2.b0 b0Var = b2.g.f1462b;
                        rVar3.e0();
                        if (rVar3.S) {
                            rVar3.k(b0Var);
                        } else {
                            rVar3.n0();
                        }
                        b2.f fVar = b2.g.e;
                        r0.y.I(fVar, a13, rVar3);
                        b2.f fVar2 = b2.g.f1464d;
                        r0.y.I(fVar2, l10, rVar3);
                        b2.f fVar3 = b2.g.f1465f;
                        if (rVar3.S || !kotlin.jvm.internal.l.a(rVar3.O(), Integer.valueOf(hashCode))) {
                            a.t(hashCode, rVar3, hashCode, fVar3);
                        }
                        b2.f fVar4 = b2.g.f1463c;
                        r0.y.I(fVar4, c12, rVar3);
                        float f14 = 12;
                        d1.r a14 = m7.a(androidx.compose.foundation.layout.a.p(oVar), 14, e.a(f14), 0L, k1.c(k1.r.f19513b, 0.45f), 12);
                        d a15 = e.a(f14);
                        long j10 = d2;
                        d1.r m4 = androidx.compose.foundation.layout.a.m(androidx.compose.foundation.a.b(a14, j10, a15), 0.0f, 4, 1);
                        r a16 = q.a(cVar3, hVar, rVar3, 0);
                        int hashCode2 = Long.hashCode(rVar3.T);
                        z0.g l11 = rVar3.l();
                        d1.r c13 = d1.a.c(m4, rVar3);
                        rVar3.e0();
                        if (rVar3.S) {
                            rVar3.k(b0Var);
                        } else {
                            rVar3.n0();
                        }
                        r0.y.I(fVar, a16, rVar3);
                        r0.y.I(fVar2, l11, rVar3);
                        if (rVar3.S || !kotlin.jvm.internal.l.a(rVar3.O(), Integer.valueOf(hashCode2))) {
                            a.t(hashCode2, rVar3, hashCode2, fVar3);
                        }
                        r0.y.I(fVar4, c13, rVar3);
                        String b12 = n7.b(R.string.erase_ink_only, rVar3);
                        final df.l lVar2 = lVar;
                        boolean f15 = rVar3.f(lVar2);
                        final df.a aVar2 = aVar;
                        boolean f16 = f15 | rVar3.f(aVar2);
                        Object O8 = rVar3.O();
                        if (!f16 && O8 != v0Var3) {
                            i19 = 0;
                        } else {
                            i19 = 0;
                            O8 = new df.a() { // from class: x7.t
                                @Override // df.a
                                public final Object invoke() {
                                    switch (i19) {
                                        case 0:
                                            lVar2.invoke(q.INK);
                                            aVar2.invoke();
                                            break;
                                        case 1:
                                            lVar2.invoke(q.IMAGES);
                                            aVar2.invoke();
                                            break;
                                        default:
                                            lVar2.invoke(q.EVERYTHING);
                                            aVar2.invoke();
                                            break;
                                    }
                                    return pe.z.f22715a;
                                }
                            };
                            rVar3.k0(O8);
                        }
                        boolean z15 = z9;
                        f(b12, false, z15, (df.a) O8, rVar3, 0, 2);
                        r(i19, rVar3);
                        String b13 = n7.b(R.string.erase_images_only, rVar3);
                        boolean f17 = rVar3.f(lVar2) | rVar3.f(aVar2);
                        Object O9 = rVar3.O();
                        if (f17 || O9 == v0Var3) {
                            final int i20 = 1;
                            O9 = new df.a() { // from class: x7.t
                                @Override // df.a
                                public final Object invoke() {
                                    switch (i20) {
                                        case 0:
                                            lVar2.invoke(q.INK);
                                            aVar2.invoke();
                                            break;
                                        case 1:
                                            lVar2.invoke(q.IMAGES);
                                            aVar2.invoke();
                                            break;
                                        default:
                                            lVar2.invoke(q.EVERYTHING);
                                            aVar2.invoke();
                                            break;
                                    }
                                    return pe.z.f22715a;
                                }
                            };
                            rVar3.k0(O9);
                        }
                        boolean z16 = z10;
                        f(b13, false, z16, (df.a) O9, rVar3, 0, 2);
                        r(0, rVar3);
                        String b14 = n7.b(R.string.erase_everything, rVar3);
                        if (!z15 && !z16) {
                            z14 = false;
                        } else {
                            z14 = true;
                        }
                        boolean f18 = rVar3.f(lVar2) | rVar3.f(aVar2);
                        Object O10 = rVar3.O();
                        if (f18 || O10 == v0Var3) {
                            final int i21 = 2;
                            O10 = new df.a() { // from class: x7.t
                                @Override // df.a
                                public final Object invoke() {
                                    switch (i21) {
                                        case 0:
                                            lVar2.invoke(q.INK);
                                            aVar2.invoke();
                                            break;
                                        case 1:
                                            lVar2.invoke(q.IMAGES);
                                            aVar2.invoke();
                                            break;
                                        default:
                                            lVar2.invoke(q.EVERYTHING);
                                            aVar2.invoke();
                                            break;
                                    }
                                    return pe.z.f22715a;
                                }
                            };
                            rVar3.k0(O10);
                        }
                        f(b14, true, z14, (df.a) O10, rVar3, 48, 0);
                        rVar3.p(true);
                        Float f19 = (Float) a1Var8.getValue();
                        if (f19 != null) {
                            rVar3.a0(-1650969880);
                            boolean f20 = rVar3.f(f19);
                            float f21 = l0;
                            boolean c14 = f20 | rVar3.c(f21);
                            Object O11 = rVar3.O();
                            if (c14 || O11 == v0Var3) {
                                O11 = new h(f19, f21, 2);
                                rVar3.k0(O11);
                            }
                            d1.r g8 = androidx.compose.foundation.layout.a.g((df.l) O11);
                            rVar3.p(false);
                            r12 = g8;
                        } else {
                            rVar3.a0(-1650862589);
                            rVar3.p(false);
                            r12 = new Object();
                        }
                        d1.r l12 = androidx.compose.foundation.layout.d.l(r12, 16, 8);
                        Object O12 = rVar3.O();
                        if (O12 == v0Var3) {
                            O12 = new fb(j10, 9);
                            rVar3.k0(O12);
                        }
                        ta.a(l12, (df.l) O12, rVar3, 48);
                        rVar3.p(true);
                    } else {
                        rVar3.U();
                    }
                    return pe.z.f22715a;
                }
            }, rVar2), rVar2, 3504, 0);
        } else {
            rVar2.U();
        }
        t3 = rVar2.t();
        if (t3 != null) {
            rVar = new r(z3, z9, z10, lVar, aVar, i, 1);
            t3.f24332d = rVar;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void f(java.lang.String r29, boolean r30, boolean r31, df.a r32, r0.m r33, int r34, int r35) {
        /*
            Method dump skipped, instructions count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x7.f(java.lang.String, boolean, boolean, df.a, r0.m, int, int):void");
    }

    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v21 */
    public static final void g(final boolean z3, final df.a aVar, final df.a aVar2, final df.a aVar3, final df.a aVar4, final df.a aVar5, final df.a aVar6, final df.a aVar7, r0.m mVar, final int i) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        boolean z9;
        q1 t3;
        df.p pVar;
        boolean z10;
        Object w1Var;
        a1 a1Var;
        r0.v0 v0Var;
        Object r02;
        float f10;
        aVar.getClass();
        aVar2.getClass();
        aVar3.getClass();
        aVar4.getClass();
        aVar5.getClass();
        aVar6.getClass();
        aVar7.getClass();
        r0.r rVar = (r0.r) mVar;
        rVar.c0(680016328);
        if (rVar.g(z3)) {
            i10 = 4;
        } else {
            i10 = 2;
        }
        int i17 = i | i10;
        if (rVar.h(aVar)) {
            i11 = 32;
        } else {
            i11 = 16;
        }
        int i18 = i17 | i11;
        if (rVar.h(aVar2)) {
            i12 = 256;
        } else {
            i12 = 128;
        }
        int i19 = i18 | i12;
        if (rVar.h(aVar3)) {
            i13 = 2048;
        } else {
            i13 = 1024;
        }
        int i20 = i19 | i13;
        if (rVar.h(aVar4)) {
            i14 = 16384;
        } else {
            i14 = 8192;
        }
        int i21 = i20 | i14;
        if (rVar.h(aVar5)) {
            i15 = 131072;
        } else {
            i15 = 65536;
        }
        int i22 = i21 | i15;
        if (rVar.h(aVar6)) {
            i16 = 1048576;
        } else {
            i16 = 524288;
        }
        int i23 = i22 | i16;
        if ((4793491 & i23) != 4793490) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (rVar.R(i23 & 1, z9)) {
            Object O = rVar.O();
            r0.v0 v0Var2 = r0.l.f24285a;
            if (O == v0Var2) {
                O = r0.y.B(Boolean.valueOf(z3));
                rVar.k0(O);
            }
            a1 a1Var2 = (a1) O;
            Object O2 = rVar.O();
            if (O2 == v0Var2) {
                O2 = r0.y.B(a.NONE);
                rVar.k0(O2);
            }
            a1 a1Var3 = (a1) O2;
            Object O3 = rVar.O();
            if (O3 == v0Var2) {
                O3 = r0.y.B(Boolean.FALSE);
                rVar.k0(O3);
            }
            a1 a1Var4 = (a1) O3;
            Boolean valueOf = Boolean.valueOf(z3);
            if ((i23 & 14) == 4) {
                z10 = true;
            } else {
                z10 = false;
            }
            Object O4 = rVar.O();
            if (!z10 && O4 != v0Var2) {
                w1Var = O4;
                v0Var = v0Var2;
                a1Var = a1Var4;
                r02 = 0;
            } else {
                a1Var = a1Var4;
                v0Var = v0Var2;
                r02 = 0;
                w1Var = new w1(z3, a1Var2, a1Var, a1Var3, null);
                rVar.k0(w1Var);
            }
            r0.y.f((df.p) w1Var, valueOf, rVar);
            if (!((Boolean) a1Var2.getValue()).booleanValue()) {
                t3 = rVar.t();
                if (t3 != null) {
                    final int i24 = 0;
                    pVar = new df.p(z3, aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, i, i24) { // from class: x7.v
                        public final /* synthetic */ df.a A;
                        public final /* synthetic */ df.a B;
                        public final /* synthetic */ df.a C;

                        /* renamed from: u, reason: collision with root package name */
                        public final /* synthetic */ int f30307u;

                        /* renamed from: v, reason: collision with root package name */
                        public final /* synthetic */ boolean f30308v;

                        /* renamed from: w, reason: collision with root package name */
                        public final /* synthetic */ df.a f30309w;

                        /* renamed from: x, reason: collision with root package name */
                        public final /* synthetic */ df.a f30310x;

                        /* renamed from: y, reason: collision with root package name */
                        public final /* synthetic */ df.a f30311y;

                        /* renamed from: z, reason: collision with root package name */
                        public final /* synthetic */ df.a f30312z;

                        {
                            this.f30307u = i24;
                        }

                        @Override // df.p
                        public final Object invoke(Object obj, Object obj2) {
                            switch (this.f30307u) {
                                case 0:
                                    ((Integer) obj2).getClass();
                                    int L = r0.y.L(12582913);
                                    g(this.f30308v, this.f30309w, this.f30310x, this.f30311y, this.f30312z, this.A, this.B, this.C, (r0.m) obj, L);
                                    break;
                                default:
                                    ((Integer) obj2).getClass();
                                    int L2 = r0.y.L(12582913);
                                    g(this.f30308v, this.f30309w, this.f30310x, this.f30311y, this.f30312z, this.A, this.B, this.C, (r0.m) obj, L2);
                                    break;
                            }
                            return pe.z.f22715a;
                        }
                    };
                    t3.f24332d = pVar;
                }
                return;
            }
            long d2 = k1.l0.d(4062323239L);
            y2.c cVar = (y2.c) rVar.j(p1.f3606h);
            float l0 = cVar.l0(16);
            int b10 = ff.a.b(cVar.l0(8));
            int b11 = ff.a.b(cVar.l0(2));
            Object O5 = rVar.O();
            if (O5 == v0Var) {
                O5 = r0.y.B(null);
                rVar.k0(O5);
            }
            a1 a1Var5 = (a1) O5;
            Object O6 = rVar.O();
            if (O6 == v0Var) {
                O6 = r0.y.B(Integer.valueOf((int) r02));
                rVar.k0(O6);
            }
            a1 a1Var6 = (a1) O6;
            boolean c10 = rVar.c(l0) | rVar.d(b10) | rVar.d(b11);
            Object O7 = rVar.O();
            if (!c10 && O7 != v0Var) {
                f10 = l0;
            } else {
                f10 = l0;
                O7 = new x(b10, b11, f10, a1Var5, a1Var6);
                rVar.k0(O7);
            }
            c3.a((x) O7, aVar7, new c3.b0(14, r02), z0.h.d(99090026, new w(a1Var, a1Var5, a1Var6, d2, f10, aVar, aVar2, aVar3, aVar4, aVar5, aVar6, a1Var3, a1Var2), rVar), rVar, 3504, 0);
        } else {
            rVar.U();
        }
        t3 = rVar.t();
        if (t3 != null) {
            final int i25 = 1;
            pVar = new df.p(z3, aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, i, i25) { // from class: x7.v
                public final /* synthetic */ df.a A;
                public final /* synthetic */ df.a B;
                public final /* synthetic */ df.a C;

                /* renamed from: u, reason: collision with root package name */
                public final /* synthetic */ int f30307u;

                /* renamed from: v, reason: collision with root package name */
                public final /* synthetic */ boolean f30308v;

                /* renamed from: w, reason: collision with root package name */
                public final /* synthetic */ df.a f30309w;

                /* renamed from: x, reason: collision with root package name */
                public final /* synthetic */ df.a f30310x;

                /* renamed from: y, reason: collision with root package name */
                public final /* synthetic */ df.a f30311y;

                /* renamed from: z, reason: collision with root package name */
                public final /* synthetic */ df.a f30312z;

                {
                    this.f30307u = i25;
                }

                @Override // df.p
                public final Object invoke(Object obj, Object obj2) {
                    switch (this.f30307u) {
                        case 0:
                            ((Integer) obj2).getClass();
                            int L = r0.y.L(12582913);
                            g(this.f30308v, this.f30309w, this.f30310x, this.f30311y, this.f30312z, this.A, this.B, this.C, (r0.m) obj, L);
                            break;
                        default:
                            ((Integer) obj2).getClass();
                            int L2 = r0.y.L(12582913);
                            g(this.f30308v, this.f30309w, this.f30310x, this.f30311y, this.f30312z, this.A, this.B, this.C, (r0.m) obj, L2);
                            break;
                    }
                    return pe.z.f22715a;
                }
            };
            t3.f24332d = pVar;
        }
    }

    public static final void h(a1 a1Var, boolean z3) {
        a1Var.setValue(Boolean.valueOf(z3));
    }

    public static final void i(String str, String str2, boolean z3, Integer num, df.a aVar, df.a aVar2, df.a aVar3, r0.m mVar, int i, int i10) {
        int i11;
        int i12;
        int i13;
        Integer num2;
        int i14;
        int i15;
        int i16;
        int i17;
        boolean z9;
        Integer num3;
        Integer num4;
        float f10;
        b2.f fVar;
        d1.o oVar;
        boolean z10;
        boolean z11;
        r0.r rVar = (r0.r) mVar;
        rVar.c0(717770719);
        if (rVar.f(str)) {
            i11 = 4;
        } else {
            i11 = 2;
        }
        int i18 = i | i11;
        if (rVar.f(str2)) {
            i12 = 32;
        } else {
            i12 = 16;
        }
        int i19 = i18 | i12;
        if (rVar.g(z3)) {
            i13 = 256;
        } else {
            i13 = 128;
        }
        int i20 = i19 | i13;
        int i21 = i10 & 8;
        if (i21 != 0) {
            i15 = i20 | 3072;
            num2 = num;
        } else {
            num2 = num;
            if (rVar.f(num2)) {
                i14 = 2048;
            } else {
                i14 = 1024;
            }
            i15 = i20 | i14;
        }
        if (rVar.h(aVar2)) {
            i16 = 131072;
        } else {
            i16 = 65536;
        }
        int i22 = i15 | i16;
        if (rVar.h(aVar3)) {
            i17 = 1048576;
        } else {
            i17 = 524288;
        }
        int i23 = i22 | i17;
        if ((599187 & i23) != 599186) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (rVar.R(i23 & 1, z9)) {
            if (i21 != 0) {
                num4 = null;
            } else {
                num4 = num2;
            }
            float f11 = 1.0f;
            if (z3) {
                f11 = 0.0f;
            }
            n2 a10 = f.a(f11, e.s(200, 0, null, 6), "normalAlpha", rVar, 3120, 20);
            if (z3) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            n2 a11 = f.a(f10, e.s(200, 0, null, 6), "activeAlpha", rVar, 3120, 20);
            d1.o oVar2 = d1.o.f15687a;
            d1.r f12 = androidx.compose.foundation.a.f(null, !z3, androidx.compose.foundation.layout.d.d(oVar2, 1.0f), aVar, 6);
            z1.p0 d2 = m.d(d1.c.f15670u, false);
            int hashCode = Long.hashCode(rVar.T);
            z0.g l10 = rVar.l();
            d1.r c10 = d1.a.c(f12, rVar);
            b2.h.f1471d.getClass();
            b2.b0 b0Var = b2.g.f1462b;
            rVar.e0();
            if (rVar.S) {
                rVar.k(b0Var);
            } else {
                rVar.n0();
            }
            b2.f fVar2 = b2.g.e;
            r0.y.I(fVar2, d2, rVar);
            b2.f fVar3 = b2.g.f1464d;
            r0.y.I(fVar3, l10, rVar);
            b2.f fVar4 = b2.g.f1465f;
            if (rVar.S || !kotlin.jvm.internal.l.a(rVar.O(), Integer.valueOf(hashCode))) {
                a.t(hashCode, rVar, hashCode, fVar4);
            }
            b2.f fVar5 = b2.g.f1463c;
            r0.y.I(fVar5, c10, rVar);
            d1.i iVar = d1.c.E;
            float f13 = 20;
            Integer num5 = num4;
            float f14 = 10;
            d1.r n10 = androidx.compose.foundation.layout.a.n(androidx.compose.foundation.layout.d.d(oVar2, 1.0f), f13, f14, f13, f14);
            boolean f15 = rVar.f(a10);
            Object O = rVar.O();
            r0.v0 v0Var = r0.l.f24285a;
            if (f15 || O == v0Var) {
                O = new x2(a10, 7);
                rVar.k0(O);
            }
            d1.r a12 = androidx.compose.ui.graphics.a(n10, (df.l) O);
            p0 a13 = o0.a(h.f29961a, iVar, rVar, 48);
            int hashCode2 = Long.hashCode(rVar.T);
            z0.g l11 = rVar.l();
            d1.r c11 = d1.a.c(a12, rVar);
            rVar.e0();
            if (rVar.S) {
                rVar.k(b0Var);
            } else {
                rVar.n0();
            }
            r0.y.I(fVar2, a13, rVar);
            r0.y.I(fVar3, l11, rVar);
            if (rVar.S || !kotlin.jvm.internal.l.a(rVar.O(), Integer.valueOf(hashCode2))) {
                a.t(hashCode2, rVar, hashCode2, fVar4);
            }
            r0.y.I(fVar5, c11, rVar);
            d1.r g8 = q0.g(1.0f);
            r a14 = q.a(h.f29962b, d1.c.H, rVar, 48);
            int hashCode3 = Long.hashCode(rVar.T);
            z0.g l12 = rVar.l();
            d1.r c12 = d1.a.c(g8, rVar);
            rVar.e0();
            if (rVar.S) {
                rVar.k(b0Var);
            } else {
                rVar.n0();
            }
            r0.y.I(fVar2, a14, rVar);
            r0.y.I(fVar3, l12, rVar);
            if (rVar.S || !kotlin.jvm.internal.l.a(rVar.O(), Integer.valueOf(hashCode3))) {
                a.t(hashCode3, rVar, hashCode3, fVar4);
            }
            r0.y.I(fVar5, c12, rVar);
            long j10 = k1.r.f19515d;
            x1.b(str, null, j10, ae.e(14), null, null, null, 0L, new x2.k(3), 0L, 0, false, 0, 0, null, rVar, (i23 & 14) | 3456, 0, 130546);
            x1.b(str2, null, k1.c(j10, 0.5f), ae.e(11), null, null, null, 0L, new x2.k(3), 0L, 0, false, 0, 0, null, rVar, ((i23 >> 3) & 14) | 3456, 0, 130546);
            rVar = rVar;
            rVar.p(true);
            rVar.p(true);
            float floatValue = ((Number) a11.getValue()).floatValue();
            androidx.compose.foundation.layout.b bVar = androidx.compose.foundation.layout.b.f501a;
            if (floatValue > 0.0f) {
                rVar.a0(1744733881);
                com.google.android.filament.g gVar = h.f29964d;
                d1.r b10 = bVar.b();
                boolean f16 = rVar.f(a11);
                Object O2 = rVar.O();
                if (f16 || O2 == v0Var) {
                    O2 = new x2(a11, 8);
                    rVar.k0(O2);
                }
                d1.r a15 = androidx.compose.ui.graphics.a(b10, (df.l) O2);
                p0 a16 = o0.a(gVar, iVar, rVar, 54);
                int hashCode4 = Long.hashCode(rVar.T);
                z0.g l13 = rVar.l();
                d1.r c13 = d1.a.c(a15, rVar);
                rVar.e0();
                if (rVar.S) {
                    rVar.k(b0Var);
                } else {
                    rVar.n0();
                }
                r0.y.I(fVar2, a16, rVar);
                r0.y.I(fVar3, l13, rVar);
                if (rVar.S || !kotlin.jvm.internal.l.a(rVar.O(), Integer.valueOf(hashCode4))) {
                    a.t(hashCode4, rVar, hashCode4, fVar4);
                }
                fVar = fVar5;
                r0.y.I(fVar, c13, rVar);
                String b11 = n7.b(R.string.export_action_share, rVar);
                long e = ae.e(12);
                d1.r g10 = q0.g(1.0f);
                FillElement fillElement = androidx.compose.foundation.layout.d.f505b;
                z10 = false;
                x1.b(b11, androidx.compose.foundation.layout.d.p(androidx.compose.foundation.a.f(null, false, g10.d(fillElement), aVar2, 7), 2), j10, e, null, null, null, 0L, new x2.k(3), 0L, 0, false, 0, 0, null, rVar, 3456, 0, 130544);
                m.a(6, androidx.compose.foundation.a.b(androidx.compose.foundation.layout.d.f(androidx.compose.foundation.layout.d.n(oVar2, 1), 24), k1.c(j10, 0.08f), k1.l0.f19495a), rVar);
                oVar = oVar2;
                x1.b(n7.b(R.string.export_action_save, rVar), androidx.compose.foundation.layout.d.p(androidx.compose.foundation.a.f(null, false, q0.g(1.0f).d(fillElement), aVar3, 7), 2), j10, ae.e(12), null, null, null, 0L, new x2.k(3), 0L, 0, false, 0, 0, null, rVar, 3456, 0, 130544);
                rVar = rVar;
                rVar.p(true);
            } else {
                fVar = fVar5;
                oVar = oVar2;
                z10 = false;
                rVar.a0(1732478217);
            }
            rVar.p(z10);
            if (num5 != null) {
                rVar.a0(1747372043);
                d1.r b12 = bVar.b();
                z1.p0 d10 = m.d(d1.c.f15672w, z10);
                int hashCode5 = Long.hashCode(rVar.T);
                z0.g l14 = rVar.l();
                d1.r c14 = d1.a.c(b12, rVar);
                rVar.e0();
                if (rVar.S) {
                    rVar.k(b0Var);
                } else {
                    rVar.n0();
                }
                r0.y.I(fVar2, d10, rVar);
                r0.y.I(fVar3, l14, rVar);
                if (rVar.S || !kotlin.jvm.internal.l.a(rVar.O(), Integer.valueOf(hashCode5))) {
                    a.t(hashCode5, rVar, hashCode5, fVar4);
                }
                r0.y.I(fVar, c14, rVar);
                a(num5.intValue(), ((i23 >> 9) & 14) | 48, androidx.compose.foundation.layout.a.o(oVar, 0.0f, 5, 7, 0.0f, 9), rVar);
                z11 = true;
                rVar.p(true);
            } else {
                z11 = true;
                rVar.a0(1732478217);
            }
            rVar.p(z10);
            rVar.p(z11);
            num3 = num5;
        } else {
            rVar.U();
            num3 = num2;
        }
        q1 t3 = rVar.t();
        if (t3 != null) {
            t3.f24332d = new h8.h(str, str2, z3, num3, aVar, aVar2, aVar3, i, i10);
        }
    }

    public static final void j(int i, r0.m mVar) {
        boolean z3;
        r0.r rVar = (r0.r) mVar;
        rVar.c0(-1604197771);
        if (i != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (rVar.R(i & 1, z3)) {
            d1.r k3 = androidx.compose.foundation.layout.d.k(d1.o.f15687a, 24);
            Object O = rVar.O();
            if (O == r0.l.f24285a) {
                O = new c9(4);
                rVar.k0(O);
            }
            ta.a(k3, (df.l) O, rVar, 54);
        } else {
            rVar.U();
        }
        q1 t3 = rVar.t();
        if (t3 != null) {
            t3.f24332d = new r5(i, 16);
        }
    }

    public static final long k(long j10, float f10, float f11, float f12) {
        float intBitsToFloat = (f11 * f10) + Float.intBitsToFloat((int) (j10 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j10 & 4294967295L)) - (f12 * f10);
        return (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L);
    }

    public static final long l(long j10, long j11) {
        int i = (int) (j10 >> 32);
        float intBitsToFloat = Float.intBitsToFloat((int) (j11 >> 32)) - Float.intBitsToFloat(i);
        int i10 = (int) (j10 & 4294967295L);
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j11 & 4294967295L)) - Float.intBitsToFloat(i10);
        float intBitsToFloat3 = ((intBitsToFloat + intBitsToFloat2) * 0.70710677f) + Float.intBitsToFloat(i);
        float x9 = g3.a.x(intBitsToFloat2, intBitsToFloat, 0.70710677f, Float.intBitsToFloat(i10));
        return (Float.floatToRawIntBits(intBitsToFloat3) << 32) | (Float.floatToRawIntBits(x9) & 4294967295L);
    }

    public static final void m(int i, r0.m mVar) {
        boolean z3;
        q1 t3;
        r5 r5Var;
        r0.r rVar = (r0.r) mVar;
        rVar.c0(1323043349);
        if ((i & 3) != 2) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (rVar.R(i & 1, z3)) {
            t3 = rVar.t();
            if (t3 != null) {
                r5Var = new r5(i, 18);
            } else {
                return;
            }
        } else {
            rVar.U();
            t3 = rVar.t();
            if (t3 != null) {
                r5Var = new r5(i, 19);
            } else {
                return;
            }
        }
        t3.f24332d = r5Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void n(final boolean r25, final long r26, final d1.r r28, final boolean r29, float r30, final z0.c r31, r0.m r32, final int r33, final int r34) {
        /*
            Method dump skipped, instructions count: 358
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x7.n(boolean, long, d1.r, boolean, float, z0.c, r0.m, int, int):void");
    }

    public static final void o(String str, df.a aVar, Integer num, r0.m mVar, int i) {
        int i10;
        int i11;
        int i12;
        boolean z3;
        r0.r rVar;
        boolean z9;
        r0.r rVar2 = (r0.r) mVar;
        rVar2.c0(606926067);
        if (rVar2.f(str)) {
            i10 = 4;
        } else {
            i10 = 2;
        }
        int i13 = i | i10;
        if (rVar2.h(aVar)) {
            i11 = 32;
        } else {
            i11 = 16;
        }
        int i14 = i13 | i11;
        if (rVar2.f(num)) {
            i12 = 256;
        } else {
            i12 = 128;
        }
        int i15 = i14 | i12;
        if ((i15 & 147) != 146) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (rVar2.R(i15 & 1, z3)) {
            d1.o oVar = d1.o.f15687a;
            d1.r d2 = androidx.compose.foundation.layout.d.d(oVar, 1.0f);
            z1.p0 d10 = m.d(d1.c.f15670u, false);
            int hashCode = Long.hashCode(rVar2.T);
            z0.g l10 = rVar2.l();
            d1.r c10 = d1.a.c(d2, rVar2);
            b2.h.f1471d.getClass();
            b2.b0 b0Var = b2.g.f1462b;
            rVar2.e0();
            if (rVar2.S) {
                rVar2.k(b0Var);
            } else {
                rVar2.n0();
            }
            b2.f fVar = b2.g.e;
            r0.y.I(fVar, d10, rVar2);
            b2.f fVar2 = b2.g.f1464d;
            r0.y.I(fVar2, l10, rVar2);
            b2.f fVar3 = b2.g.f1465f;
            if (rVar2.S || !kotlin.jvm.internal.l.a(rVar2.O(), Integer.valueOf(hashCode))) {
                a.t(hashCode, rVar2, hashCode, fVar3);
            }
            b2.f fVar4 = b2.g.f1463c;
            r0.y.I(fVar4, c10, rVar2);
            x1.b(str, androidx.compose.foundation.layout.a.l(androidx.compose.foundation.a.f(null, false, androidx.compose.foundation.layout.d.d(oVar, 1.0f), aVar, 7), 16, 12), k1.r.f19515d, ae.e(14), null, null, null, 0L, new x2.k(3), 0L, 0, false, 0, 0, null, rVar2, (i15 & 14) | 3456, 0, 130544);
            rVar = rVar2;
            if (num != null) {
                rVar.a0(105899617);
                d1.r b10 = androidx.compose.foundation.layout.b.f501a.b();
                z1.p0 d11 = m.d(d1.c.f15672w, false);
                int hashCode2 = Long.hashCode(rVar.T);
                z0.g l11 = rVar.l();
                d1.r c11 = d1.a.c(b10, rVar);
                rVar.e0();
                if (rVar.S) {
                    rVar.k(b0Var);
                } else {
                    rVar.n0();
                }
                r0.y.I(fVar, d11, rVar);
                r0.y.I(fVar2, l11, rVar);
                if (rVar.S || !kotlin.jvm.internal.l.a(rVar.O(), Integer.valueOf(hashCode2))) {
                    a.t(hashCode2, rVar, hashCode2, fVar3);
                }
                r0.y.I(fVar4, c11, rVar);
                a(num.intValue(), ((i15 >> 6) & 14) | 48, androidx.compose.foundation.layout.a.o(oVar, 0.0f, 5, 7, 0.0f, 9), rVar);
                z9 = true;
                rVar.p(true);
            } else {
                z9 = true;
                rVar.a0(92341333);
            }
            rVar.p(false);
            rVar.p(z9);
        } else {
            rVar = rVar2;
            rVar.U();
        }
        q1 t3 = rVar.t();
        if (t3 != null) {
            t3.f24332d = new b8.g(str, aVar, num, i, 7);
        }
    }

    public static final void p(final boolean z3, final int i, final df.l lVar, final df.a aVar, final df.a aVar2, final df.a aVar3, r0.m mVar, final int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        boolean z9;
        q1 t3;
        df.p pVar;
        r0.v0 v0Var;
        Object nVar;
        lVar.getClass();
        aVar.getClass();
        aVar2.getClass();
        aVar3.getClass();
        r0.r rVar = (r0.r) mVar;
        rVar.c0(118056642);
        if (rVar.g(z3)) {
            i11 = 4;
        } else {
            i11 = 2;
        }
        int i15 = i10 | i11;
        if (rVar.d(i)) {
            i12 = 32;
        } else {
            i12 = 16;
        }
        int i16 = i15 | i12;
        if (rVar.h(aVar)) {
            i13 = 2048;
        } else {
            i13 = 1024;
        }
        int i17 = i16 | i13;
        if (rVar.h(aVar2)) {
            i14 = 16384;
        } else {
            i14 = 8192;
        }
        int i18 = i17 | i14;
        boolean z10 = true;
        if ((74899 & i18) != 74898) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (rVar.R(i18 & 1, z9)) {
            Object O = rVar.O();
            r0.v0 v0Var2 = r0.l.f24285a;
            if (O == v0Var2) {
                O = r0.y.B(Boolean.valueOf(z3));
                rVar.k0(O);
            }
            final a1 a1Var = (a1) O;
            Object O2 = rVar.O();
            if (O2 == v0Var2) {
                O2 = r0.y.B(Boolean.FALSE);
                rVar.k0(O2);
            }
            final a1 a1Var2 = (a1) O2;
            Boolean valueOf = Boolean.valueOf(z3);
            if ((i18 & 14) != 4) {
                z10 = false;
            }
            Object O3 = rVar.O();
            te.c cVar = null;
            if (z10 || O3 == v0Var2) {
                v0Var = v0Var2;
                nVar = new n(z3, a1Var, a1Var2, cVar, 2);
                rVar.k0(nVar);
            } else {
                nVar = O3;
                v0Var = v0Var2;
            }
            r0.y.f((df.p) nVar, valueOf, rVar);
            if (!((Boolean) a1Var.getValue()).booleanValue()) {
                t3 = rVar.t();
                if (t3 != null) {
                    final int i19 = 0;
                    pVar = new df.p(z3, i, lVar, aVar, aVar2, aVar3, i10, i19) { // from class: x7.a0
                        public final /* synthetic */ df.a A;

                        /* renamed from: u, reason: collision with root package name */
                        public final /* synthetic */ int f30140u;

                        /* renamed from: v, reason: collision with root package name */
                        public final /* synthetic */ boolean f30141v;

                        /* renamed from: w, reason: collision with root package name */
                        public final /* synthetic */ int f30142w;

                        /* renamed from: x, reason: collision with root package name */
                        public final /* synthetic */ df.l f30143x;

                        /* renamed from: y, reason: collision with root package name */
                        public final /* synthetic */ df.a f30144y;

                        /* renamed from: z, reason: collision with root package name */
                        public final /* synthetic */ df.a f30145z;

                        {
                            this.f30140u = i19;
                        }

                        @Override // df.p
                        public final Object invoke(Object obj, Object obj2) {
                            switch (this.f30140u) {
                                case 0:
                                    ((Integer) obj2).getClass();
                                    int L = r0.y.L(196993);
                                    p(this.f30141v, this.f30142w, this.f30143x, this.f30144y, this.f30145z, this.A, (r0.m) obj, L);
                                    break;
                                default:
                                    ((Integer) obj2).getClass();
                                    int L2 = r0.y.L(196993);
                                    p(this.f30141v, this.f30142w, this.f30143x, this.f30144y, this.f30145z, this.A, (r0.m) obj, L2);
                                    break;
                            }
                            return pe.z.f22715a;
                        }
                    };
                    t3.f24332d = pVar;
                }
                return;
            }
            final long d2 = k1.l0.d(4062323239L);
            y2.c cVar2 = (y2.c) rVar.j(p1.f3606h);
            final float l0 = cVar2.l0(16);
            int b10 = ff.a.b(cVar2.l0(8));
            int b11 = ff.a.b(cVar2.l0(2));
            Object O4 = rVar.O();
            if (O4 == v0Var) {
                O4 = r0.y.B(null);
                rVar.k0(O4);
            }
            final a1 a1Var3 = (a1) O4;
            Object O5 = rVar.O();
            if (O5 == v0Var) {
                O5 = r0.y.B(0);
                rVar.k0(O5);
            }
            final a1 a1Var4 = (a1) O5;
            boolean c10 = rVar.c(l0) | rVar.d(b10) | rVar.d(b11);
            Object O6 = rVar.O();
            if (c10 || O6 == v0Var) {
                O6 = new c0(b10, b11, l0, a1Var3, a1Var4);
                rVar.k0(O6);
            }
            c3.a((c0) O6, aVar3, new c3.b0(14, false), z0.h.d(-1311346332, new df.p() { // from class: x7.b0
                /* JADX WARN: Code restructure failed: missing block: B:57:0x02eb, code lost:
                
                    if (r6 == r5) goto L76;
                 */
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r10v1, types: [r0.r, r0.m] */
                /* JADX WARN: Type inference failed for: r1v31, types: [d1.r] */
                /* JADX WARN: Type inference failed for: r1v38 */
                /* JADX WARN: Type inference failed for: r1v39 */
                @Override // df.p
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object invoke(java.lang.Object r50, java.lang.Object r51) {
                    /*
                        Method dump skipped, instructions count: 1158
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: x7.b0.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
                }
            }, rVar), rVar, 3504, 0);
        } else {
            rVar.U();
        }
        t3 = rVar.t();
        if (t3 != null) {
            final int i20 = 1;
            pVar = new df.p(z3, i, lVar, aVar, aVar2, aVar3, i10, i20) { // from class: x7.a0
                public final /* synthetic */ df.a A;

                /* renamed from: u, reason: collision with root package name */
                public final /* synthetic */ int f30140u;

                /* renamed from: v, reason: collision with root package name */
                public final /* synthetic */ boolean f30141v;

                /* renamed from: w, reason: collision with root package name */
                public final /* synthetic */ int f30142w;

                /* renamed from: x, reason: collision with root package name */
                public final /* synthetic */ df.l f30143x;

                /* renamed from: y, reason: collision with root package name */
                public final /* synthetic */ df.a f30144y;

                /* renamed from: z, reason: collision with root package name */
                public final /* synthetic */ df.a f30145z;

                {
                    this.f30140u = i20;
                }

                @Override // df.p
                public final Object invoke(Object obj, Object obj2) {
                    switch (this.f30140u) {
                        case 0:
                            ((Integer) obj2).getClass();
                            int L = r0.y.L(196993);
                            p(this.f30141v, this.f30142w, this.f30143x, this.f30144y, this.f30145z, this.A, (r0.m) obj, L);
                            break;
                        default:
                            ((Integer) obj2).getClass();
                            int L2 = r0.y.L(196993);
                            p(this.f30141v, this.f30142w, this.f30143x, this.f30144y, this.f30145z, this.A, (r0.m) obj, L2);
                            break;
                    }
                    return pe.z.f22715a;
                }
            };
            t3.f24332d = pVar;
        }
    }

    public static final void q(final boolean z3, final String str, final Float f10, r0.m mVar, final int i) {
        int i10;
        int i11;
        int i12;
        boolean z9;
        q1 t3;
        df.p pVar;
        r0.v0 v0Var;
        boolean z10;
        char c10;
        boolean z11;
        boolean z12;
        boolean z13;
        str.getClass();
        r0.r rVar = (r0.r) mVar;
        rVar.c0(616080535);
        if (rVar.g(z3)) {
            i10 = 4;
        } else {
            i10 = 2;
        }
        int i13 = i | i10;
        if (rVar.f(str)) {
            i11 = 32;
        } else {
            i11 = 16;
        }
        int i14 = i13 | i11;
        if (rVar.f(f10)) {
            i12 = 256;
        } else {
            i12 = 128;
        }
        int i15 = i14 | i12;
        if ((i15 & 147) != 146) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (rVar.R(i15 & 1, z9)) {
            float f11 = 0.0f;
            if (z3) {
                f11 = 1.0f;
            }
            n2 a10 = f.a(f11, e.s(200, 0, null, 6), "loadingOverlay", rVar, 3120, 20);
            if (((Number) a10.getValue()).floatValue() <= 0.001f && !z3) {
                t3 = rVar.t();
                if (t3 != null) {
                    final int i16 = 0;
                    pVar = new df.p(z3, str, f10, i, i16) { // from class: x7.d0

                        /* renamed from: u, reason: collision with root package name */
                        public final /* synthetic */ int f30167u;

                        /* renamed from: v, reason: collision with root package name */
                        public final /* synthetic */ boolean f30168v;

                        /* renamed from: w, reason: collision with root package name */
                        public final /* synthetic */ String f30169w;

                        /* renamed from: x, reason: collision with root package name */
                        public final /* synthetic */ Float f30170x;

                        {
                            this.f30167u = i16;
                        }

                        @Override // df.p
                        public final Object invoke(Object obj, Object obj2) {
                            int i17 = this.f30167u;
                            r0.m mVar2 = (r0.m) obj;
                            ((Integer) obj2).getClass();
                            switch (i17) {
                                case 0:
                                    q(this.f30168v, this.f30169w, this.f30170x, mVar2, r0.y.L(1));
                                    break;
                                default:
                                    q(this.f30168v, this.f30169w, this.f30170x, mVar2, r0.y.L(1));
                                    break;
                            }
                            return pe.z.f22715a;
                        }
                    };
                    t3.f24332d = pVar;
                }
                return;
            }
            long d2 = k1.l0.d(4062323239L);
            long d10 = k1.l0.d(4290299135L);
            FillElement fillElement = androidx.compose.foundation.layout.d.f506c;
            boolean f12 = rVar.f(a10);
            Object O = rVar.O();
            r0.v0 v0Var2 = r0.l.f24285a;
            if (f12 || O == v0Var2) {
                O = new x2(a10, 9);
                rVar.k0(O);
            }
            d1.r b10 = androidx.compose.foundation.a.b(androidx.compose.ui.graphics.a(fillElement, (df.l) O), k1.c(k1.r.f19513b, 0.55f), k1.l0.f19495a);
            Object O2 = rVar.O();
            if (O2 == v0Var2) {
                O2 = e0.f30177a;
                rVar.k0(O2);
            }
            d1.r b11 = v1.d0.b(b10, pe.z.f22715a, (PointerInputEventHandler) O2);
            z1.p0 d11 = m.d(d1.c.f15674y, false);
            int hashCode = Long.hashCode(rVar.T);
            z0.g l10 = rVar.l();
            d1.r c11 = d1.a.c(b11, rVar);
            b2.h.f1471d.getClass();
            b2.b0 b0Var = b2.g.f1462b;
            rVar.e0();
            if (rVar.S) {
                rVar.k(b0Var);
            } else {
                rVar.n0();
            }
            b2.f fVar = b2.g.e;
            r0.y.I(fVar, d11, rVar);
            b2.f fVar2 = b2.g.f1464d;
            r0.y.I(fVar2, l10, rVar);
            b2.f fVar3 = b2.g.f1465f;
            if (rVar.S || !kotlin.jvm.internal.l.a(rVar.O(), Integer.valueOf(hashCode))) {
                a.t(hashCode, rVar, hashCode, fVar3);
            }
            b2.f fVar4 = b2.g.f1463c;
            r0.y.I(fVar4, c11, rVar);
            d1.h hVar = d1.c.H;
            float f13 = 18;
            d a11 = e.a(f13);
            d1.o oVar = d1.o.f15687a;
            d1.r l11 = androidx.compose.foundation.layout.a.l(androidx.compose.foundation.a.b(oVar, d2, a11), 34, 28);
            r a12 = q.a(h.f29962b, hVar, rVar, 48);
            long j10 = d10;
            int hashCode2 = Long.hashCode(rVar.T);
            z0.g l12 = rVar.l();
            d1.r c12 = d1.a.c(l11, rVar);
            rVar.e0();
            if (rVar.S) {
                rVar.k(b0Var);
            } else {
                rVar.n0();
            }
            r0.y.I(fVar, a12, rVar);
            r0.y.I(fVar2, l12, rVar);
            if (rVar.S || !kotlin.jvm.internal.l.a(rVar.O(), Integer.valueOf(hashCode2))) {
                a.t(hashCode2, rVar, hashCode2, fVar3);
            }
            r0.y.I(fVar4, c12, rVar);
            if (f10 != null) {
                rVar.a0(1722526666);
                long c13 = k1.c(k1.r.f19515d, 0.1f);
                float f14 = (float) 3.5d;
                d1.r k3 = androidx.compose.foundation.layout.d.k(oVar, 42);
                if ((i15 & 896) == 256) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                Object O3 = rVar.O();
                if (z13 || O3 == v0Var2) {
                    O3 = new m4(4, f10);
                    rVar.k0(O3);
                }
                c10 = 256;
                v0Var = v0Var2;
                z10 = false;
                o0.f1.a((df.a) O3, k3, j10, f14, c13, 1, 0.0f, rVar, 28080, 64);
                rVar = rVar;
                rVar.p(false);
            } else {
                v0Var = v0Var2;
                z10 = false;
                c10 = 256;
                rVar.a0(1722882019);
                o0.f1.b(androidx.compose.foundation.layout.d.k(oVar, 42), j10, 3, 0L, 0, rVar, 438, 24);
                j10 = j10;
                rVar.p(false);
            }
            b.b(androidx.compose.foundation.layout.d.f(oVar, f13), rVar);
            long j11 = k1.r.f19515d;
            r0.r rVar2 = rVar;
            r0.v0 v0Var3 = v0Var;
            x1.b(str, null, k1.c(j11, 0.9f), ae.e(13), null, q2.s.f23368z, null, 0L, null, 0L, 0, false, 0, 0, null, rVar2, ((i15 >> 3) & 14) | 200064, 0, 131026);
            rVar = rVar2;
            if (f10 != null) {
                rVar.a0(1723497524);
                b.b(androidx.compose.foundation.layout.d.f(oVar, 14), rVar);
                long c14 = k1.c(j11, 0.08f);
                d1.r a13 = j7.a(androidx.compose.foundation.layout.d.f(androidx.compose.foundation.layout.a.m(androidx.compose.foundation.layout.d.d(oVar, 1.0f), 4, 0.0f, 2), 5), e.a(3));
                if ((i15 & 896) == 256) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                Object O4 = rVar.O();
                if (z12 || O4 == v0Var3) {
                    O4 = new m4(4, f10);
                    rVar.k0(O4);
                }
                o0.f1.c((df.a) O4, a13, j10, c14, 1, 0.0f, null, rVar, 3456);
                b.b(androidx.compose.foundation.layout.d.f(oVar, 8), rVar);
                x1.b(((int) (f10.floatValue() * 100)) + " %", null, k1.c(j11, 0.55f), ae.e(11), null, q2.s.f23367y, null, 0L, null, 0L, 0, false, 0, 0, null, rVar, 200064, 0, 131026);
                rVar = rVar;
                z11 = false;
            } else {
                z11 = false;
                rVar.a0(1719201327);
            }
            rVar.p(z11);
            rVar.p(true);
            rVar.p(true);
        } else {
            rVar.U();
        }
        t3 = rVar.t();
        if (t3 != null) {
            final int i17 = 1;
            pVar = new df.p(z3, str, f10, i, i17) { // from class: x7.d0

                /* renamed from: u, reason: collision with root package name */
                public final /* synthetic */ int f30167u;

                /* renamed from: v, reason: collision with root package name */
                public final /* synthetic */ boolean f30168v;

                /* renamed from: w, reason: collision with root package name */
                public final /* synthetic */ String f30169w;

                /* renamed from: x, reason: collision with root package name */
                public final /* synthetic */ Float f30170x;

                {
                    this.f30167u = i17;
                }

                @Override // df.p
                public final Object invoke(Object obj, Object obj2) {
                    int i172 = this.f30167u;
                    r0.m mVar2 = (r0.m) obj;
                    ((Integer) obj2).getClass();
                    switch (i172) {
                        case 0:
                            q(this.f30168v, this.f30169w, this.f30170x, mVar2, r0.y.L(1));
                            break;
                        default:
                            q(this.f30168v, this.f30169w, this.f30170x, mVar2, r0.y.L(1));
                            break;
                    }
                    return pe.z.f22715a;
                }
            };
            t3.f24332d = pVar;
        }
    }

    public static final void r(int i, r0.m mVar) {
        boolean z3;
        r0.r rVar = (r0.r) mVar;
        rVar.c0(-929430053);
        if (i != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (rVar.R(i & 1, z3)) {
            m.a(6, androidx.compose.foundation.a.b(androidx.compose.foundation.layout.d.f(androidx.compose.foundation.layout.d.d(d1.o.f15687a, 1.0f), 1), k1.c(k1.r.f19515d, 0.1f), k1.l0.f19495a), rVar);
        } else {
            rVar.U();
        }
        q1 t3 = rVar.t();
        if (t3 != null) {
            t3.f24332d = new r5(i, 17);
        }
    }

    public static final void s(String str, String str2, String str3, df.a aVar, r0.m mVar, int i) {
        int i10;
        int i11;
        int i12;
        boolean z3;
        int i13;
        str.getClass();
        str2.getClass();
        aVar.getClass();
        r0.r rVar = (r0.r) mVar;
        rVar.c0(-1326500474);
        if (rVar.f(str)) {
            i10 = 4;
        } else {
            i10 = 2;
        }
        int i14 = i10 | i;
        if (rVar.f(str2)) {
            i11 = 32;
        } else {
            i11 = 16;
        }
        int i15 = i14 | i11;
        if (rVar.f(str3)) {
            i12 = 256;
        } else {
            i12 = 128;
        }
        int i16 = i15 | i12;
        if ((i & 3072) == 0) {
            if (rVar.h(aVar)) {
                i13 = 2048;
            } else {
                i13 = 1024;
            }
            i16 |= i13;
        }
        if ((i16 & 1171) != 1170) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (rVar.R(i16 & 1, z3)) {
            wa.a(aVar, new c3.u(true, false, false), z0.h.d(-254364003, new q8(str, str2, aVar, str3), rVar), rVar, ((i16 >> 9) & 14) | 432, 0);
        } else {
            rVar.U();
        }
        q1 t3 = rVar.t();
        if (t3 != null) {
            t3.f24332d = new z7(str, str2, str3, aVar, i, 2);
        }
    }

    public static final void t(df.a aVar, df.a aVar2, r0.m mVar, int i) {
        int i10;
        boolean z3;
        aVar.getClass();
        r0.r rVar = (r0.r) mVar;
        rVar.c0(261009669);
        if (rVar.h(aVar)) {
            i10 = 4;
        } else {
            i10 = 2;
        }
        int i11 = i10 | i;
        if ((i11 & 19) != 18) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (rVar.R(i11 & 1, z3)) {
            c3.u uVar = new c3.u(false, false, false);
            Object O = rVar.O();
            if (O == r0.l.f24285a) {
                O = new fg.o(19);
                rVar.k0(O);
            }
            wa.a((df.a) O, uVar, z0.h.d(-881241380, new t6(aVar, aVar2), rVar), rVar, 438, 0);
        } else {
            rVar.U();
        }
        q1 t3 = rVar.t();
        if (t3 != null) {
            t3.f24332d = new t6(aVar, aVar2, i, 3);
        }
    }

    public static final void u(final boolean z3, final int i, final df.l lVar, final df.a aVar, r0.m mVar, final int i10) {
        int i11;
        int i12;
        int i13;
        boolean z9;
        q1 t3;
        df.p pVar;
        Boolean bool;
        Object nVar;
        a1 a1Var;
        final a1 a1Var2;
        lVar.getClass();
        aVar.getClass();
        r0.r rVar = (r0.r) mVar;
        rVar.c0(-1007109702);
        if (rVar.g(z3)) {
            i11 = 4;
        } else {
            i11 = 2;
        }
        int i14 = i10 | i11;
        if (rVar.d(i)) {
            i12 = 32;
        } else {
            i12 = 16;
        }
        int i15 = i14 | i12;
        if (rVar.h(lVar)) {
            i13 = 256;
        } else {
            i13 = 128;
        }
        int i16 = i15 | i13;
        boolean z10 = true;
        if ((i16 & 1171) != 1170) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (rVar.R(i16 & 1, z9)) {
            Object O = rVar.O();
            r0.v0 v0Var = r0.l.f24285a;
            if (O == v0Var) {
                O = r0.y.B(Boolean.valueOf(z3));
                rVar.k0(O);
            }
            a1 a1Var3 = (a1) O;
            Object O2 = rVar.O();
            if (O2 == v0Var) {
                O2 = r0.y.B(Boolean.FALSE);
                rVar.k0(O2);
            }
            a1 a1Var4 = (a1) O2;
            Boolean valueOf = Boolean.valueOf(z3);
            if ((i16 & 14) != 4) {
                z10 = false;
            }
            Object O3 = rVar.O();
            te.c cVar = null;
            if (z10 || O3 == v0Var) {
                bool = valueOf;
                a1Var = a1Var3;
                nVar = new n(z3, a1Var, a1Var4, cVar, 3);
                a1Var2 = a1Var4;
                rVar.k0(nVar);
            } else {
                nVar = O3;
                bool = valueOf;
                a1Var = a1Var3;
                a1Var2 = a1Var4;
            }
            r0.y.f((df.p) nVar, bool, rVar);
            if (!((Boolean) a1Var.getValue()).booleanValue()) {
                t3 = rVar.t();
                if (t3 != null) {
                    final int i17 = 0;
                    pVar = new df.p(z3, i, lVar, aVar, i10, i17) { // from class: x7.o0

                        /* renamed from: u, reason: collision with root package name */
                        public final /* synthetic */ int f30251u;

                        /* renamed from: v, reason: collision with root package name */
                        public final /* synthetic */ boolean f30252v;

                        /* renamed from: w, reason: collision with root package name */
                        public final /* synthetic */ int f30253w;

                        /* renamed from: x, reason: collision with root package name */
                        public final /* synthetic */ df.l f30254x;

                        /* renamed from: y, reason: collision with root package name */
                        public final /* synthetic */ df.a f30255y;

                        {
                            this.f30251u = i17;
                        }

                        @Override // df.p
                        public final Object invoke(Object obj, Object obj2) {
                            switch (this.f30251u) {
                                case 0:
                                    ((Integer) obj2).getClass();
                                    int L = r0.y.L(3073);
                                    u(this.f30252v, this.f30253w, this.f30254x, this.f30255y, (r0.m) obj, L);
                                    break;
                                default:
                                    ((Integer) obj2).getClass();
                                    int L2 = r0.y.L(3073);
                                    u(this.f30252v, this.f30253w, this.f30254x, this.f30255y, (r0.m) obj, L2);
                                    break;
                            }
                            return pe.z.f22715a;
                        }
                    };
                    t3.f24332d = pVar;
                }
                return;
            }
            final long d2 = k1.l0.d(4062323239L);
            y2.c cVar2 = (y2.c) rVar.j(p1.f3606h);
            final float l0 = cVar2.l0(16);
            int b10 = ff.a.b(cVar2.l0(8));
            int b11 = ff.a.b(cVar2.l0(2));
            Object O4 = rVar.O();
            if (O4 == v0Var) {
                O4 = r0.y.B(null);
                rVar.k0(O4);
            }
            final a1 a1Var5 = (a1) O4;
            Object O5 = rVar.O();
            if (O5 == v0Var) {
                O5 = r0.y.B(0);
                rVar.k0(O5);
            }
            final a1 a1Var6 = (a1) O5;
            boolean c10 = rVar.c(l0) | rVar.d(b10) | rVar.d(b11);
            Object O6 = rVar.O();
            if (c10 || O6 == v0Var) {
                O6 = new q0(b10, b11, l0, a1Var5, a1Var6);
                rVar.k0(O6);
            }
            c3.a((q0) O6, aVar, new c3.b0(14, false), z0.h.d(441674204, new df.p() { // from class: x7.p0
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r1v23, types: [d1.r] */
                /* JADX WARN: Type inference failed for: r1v31 */
                /* JADX WARN: Type inference failed for: r1v32 */
                @Override // df.p
                public final Object invoke(Object obj, Object obj2) {
                    boolean z11;
                    float f10;
                    float f11;
                    Object r12;
                    boolean z12;
                    int i18;
                    float f12;
                    float f13;
                    r0.m mVar2 = (r0.m) obj;
                    int intValue = ((Integer) obj2).intValue();
                    if ((intValue & 3) != 2) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    r0.r rVar2 = (r0.r) mVar2;
                    if (rVar2.R(intValue & 1, z11)) {
                        a1 a1Var7 = a1.this;
                        if (((Boolean) a1Var7.getValue()).booleanValue()) {
                            f10 = 1.0f;
                        } else {
                            f10 = 0.2f;
                        }
                        n2 a10 = f.a(f10, e.r(0.6f, 400.0f, null, 4), null, rVar2, 48, 28);
                        if (((Boolean) a1Var7.getValue()).booleanValue()) {
                            f11 = 1.0f;
                        } else {
                            f11 = 0.0f;
                        }
                        n2 a11 = f.a(f11, e.s(150, 0, null, 6), null, rVar2, 48, 28);
                        a1 a1Var8 = a1Var5;
                        Float f14 = (Float) a1Var8.getValue();
                        float f15 = 0.5f;
                        if (f14 != null) {
                            float floatValue = f14.floatValue();
                            if (((Number) a1Var6.getValue()).intValue() > 0) {
                                f15 = floatValue / ((Number) r11.getValue()).intValue();
                            }
                        }
                        d1.h hVar = d1.c.G;
                        boolean c11 = rVar2.c(f15) | rVar2.f(a10) | rVar2.f(a11);
                        Object O7 = rVar2.O();
                        r0.v0 v0Var2 = r0.l.f24285a;
                        if (c11 || O7 == v0Var2) {
                            O7 = new m(f15, a10, a11, 4);
                            rVar2.k0(O7);
                        }
                        d1.o oVar = d1.o.f15687a;
                        d1.r a12 = androidx.compose.ui.graphics.a(oVar, (df.l) O7);
                        r a13 = q.a(h.f29962b, hVar, rVar2, 48);
                        int hashCode = Long.hashCode(rVar2.T);
                        z0.g l10 = rVar2.l();
                        d1.r c12 = d1.a.c(a12, rVar2);
                        b2.h.f1471d.getClass();
                        b2.b0 b0Var = b2.g.f1462b;
                        rVar2.e0();
                        if (rVar2.S) {
                            rVar2.k(b0Var);
                        } else {
                            rVar2.n0();
                        }
                        b2.f fVar = b2.g.e;
                        r0.y.I(fVar, a13, rVar2);
                        b2.f fVar2 = b2.g.f1464d;
                        r0.y.I(fVar2, l10, rVar2);
                        b2.f fVar3 = b2.g.f1465f;
                        if (rVar2.S || !kotlin.jvm.internal.l.a(rVar2.O(), Integer.valueOf(hashCode))) {
                            a.t(hashCode, rVar2, hashCode, fVar3);
                        }
                        b2.f fVar4 = b2.g.f1463c;
                        r0.y.I(fVar4, c12, rVar2);
                        List h3 = qe.h(4279769115L, 4294242536L, 4286072872L, 4280171640L, 4288028200L, 4280839750L, 4280953392L, 4279916236L, 4291574298L, 4291595290L, 4287310540L, 4291566190L);
                        float f16 = 12;
                        d1.r a14 = m7.a(oVar, 14, e.a(f16), 0L, k1.c(k1.r.f19513b, 0.45f), 12);
                        d a15 = e.a(f16);
                        long j10 = d2;
                        d1.r k3 = androidx.compose.foundation.layout.a.k(androidx.compose.foundation.a.b(a14, j10, a15), f16);
                        float f17 = 10;
                        r a16 = q.a(h.i(f17), hVar, rVar2, 6);
                        int hashCode2 = Long.hashCode(rVar2.T);
                        z0.g l11 = rVar2.l();
                        d1.r c13 = d1.a.c(k3, rVar2);
                        rVar2.e0();
                        if (rVar2.S) {
                            rVar2.k(b0Var);
                        } else {
                            rVar2.n0();
                        }
                        r0.y.I(fVar, a16, rVar2);
                        r0.y.I(fVar2, l11, rVar2);
                        if (rVar2.S || !kotlin.jvm.internal.l.a(rVar2.O(), Integer.valueOf(hashCode2))) {
                            a.t(hashCode2, rVar2, hashCode2, fVar3);
                        }
                        r0.y.I(fVar4, c13, rVar2);
                        rVar2.a0(-449471990);
                        int i19 = 6;
                        ArrayList r8 = qe.l.r(h3, 6);
                        int size = r8.size();
                        int i20 = 0;
                        while (i20 < size) {
                            Object obj3 = r8.get(i20);
                            i20++;
                            List list = (List) obj3;
                            p0 a17 = o0.a(h.i(f17), d1.c.D, rVar2, i19);
                            int hashCode3 = Long.hashCode(rVar2.T);
                            z0.g l12 = rVar2.l();
                            d1.r c14 = d1.a.c(oVar, rVar2);
                            b2.h.f1471d.getClass();
                            b2.b0 b0Var2 = b2.g.f1462b;
                            rVar2.e0();
                            if (rVar2.S) {
                                rVar2.k(b0Var2);
                            } else {
                                rVar2.n0();
                            }
                            r0.y.I(b2.g.e, a17, rVar2);
                            r0.y.I(b2.g.f1464d, l12, rVar2);
                            b2.f fVar5 = b2.g.f1465f;
                            if (rVar2.S || !kotlin.jvm.internal.l.a(rVar2.O(), Integer.valueOf(hashCode3))) {
                                a.t(hashCode3, rVar2, hashCode3, fVar5);
                            }
                            r0.y.I(b2.g.f1463c, c14, rVar2);
                            rVar2.a0(-1259290701);
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                int longValue = (int) ((Number) it.next()).longValue();
                                if (i == longValue) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                if (z12) {
                                    i18 = 30;
                                } else {
                                    i18 = 26;
                                }
                                d1.r k4 = androidx.compose.foundation.layout.d.k(oVar, i18);
                                d dVar = e.f16629a;
                                d1.r b12 = androidx.compose.foundation.a.b(j7.a(k4, dVar), k1.l0.c(longValue), k1.l0.f19495a);
                                if (z12) {
                                    f12 = 2;
                                } else {
                                    f12 = 1;
                                }
                                long j11 = k1.r.f19515d;
                                if (z12) {
                                    f13 = 1.0f;
                                } else {
                                    f13 = 0.3f;
                                }
                                d1.r a18 = sa.a(b12, f12, k1.c(j11, f13), dVar);
                                df.l lVar2 = lVar;
                                boolean f18 = rVar2.f(lVar2) | rVar2.d(longValue);
                                Object O8 = rVar2.O();
                                if (f18 || O8 == v0Var2) {
                                    O8 = new i8(longValue, 1, lVar2);
                                    rVar2.k0(O8);
                                }
                                m.a(0, androidx.compose.foundation.a.f(null, false, a18, (df.a) O8, 7), rVar2);
                            }
                            rVar2.p(false);
                            rVar2.p(true);
                            i19 = 6;
                        }
                        rVar2.p(false);
                        rVar2.p(true);
                        Float f19 = (Float) a1Var8.getValue();
                        if (f19 != null) {
                            rVar2.a0(-916680983);
                            boolean f20 = rVar2.f(f19);
                            float f21 = l0;
                            boolean c15 = f20 | rVar2.c(f21);
                            Object O9 = rVar2.O();
                            if (c15 || O9 == v0Var2) {
                                O9 = new h(f19, f21, 5);
                                rVar2.k0(O9);
                            }
                            d1.r g8 = androidx.compose.foundation.layout.a.g((df.l) O9);
                            rVar2.p(false);
                            r12 = g8;
                        } else {
                            rVar2.a0(-916573692);
                            rVar2.p(false);
                            r12 = new Object();
                        }
                        d1.r l13 = androidx.compose.foundation.layout.d.l(r12, 16, 8);
                        Object O10 = rVar2.O();
                        if (O10 == v0Var2) {
                            O10 = new fb(j10, 13);
                            rVar2.k0(O10);
                        }
                        ta.a(l13, (df.l) O10, rVar2, 48);
                        rVar2.p(true);
                    } else {
                        rVar2.U();
                    }
                    return pe.z.f22715a;
                }
            }, rVar), rVar, 3504, 0);
        } else {
            rVar.U();
        }
        t3 = rVar.t();
        if (t3 != null) {
            final int i18 = 1;
            pVar = new df.p(z3, i, lVar, aVar, i10, i18) { // from class: x7.o0

                /* renamed from: u, reason: collision with root package name */
                public final /* synthetic */ int f30251u;

                /* renamed from: v, reason: collision with root package name */
                public final /* synthetic */ boolean f30252v;

                /* renamed from: w, reason: collision with root package name */
                public final /* synthetic */ int f30253w;

                /* renamed from: x, reason: collision with root package name */
                public final /* synthetic */ df.l f30254x;

                /* renamed from: y, reason: collision with root package name */
                public final /* synthetic */ df.a f30255y;

                {
                    this.f30251u = i18;
                }

                @Override // df.p
                public final Object invoke(Object obj, Object obj2) {
                    switch (this.f30251u) {
                        case 0:
                            ((Integer) obj2).getClass();
                            int L = r0.y.L(3073);
                            u(this.f30252v, this.f30253w, this.f30254x, this.f30255y, (r0.m) obj, L);
                            break;
                        default:
                            ((Integer) obj2).getClass();
                            int L2 = r0.y.L(3073);
                            u(this.f30252v, this.f30253w, this.f30254x, this.f30255y, (r0.m) obj, L2);
                            break;
                    }
                    return pe.z.f22715a;
                }
            };
            t3.f24332d = pVar;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r40v1 */
    /* JADX WARN: Type inference failed for: r40v2, types: [int] */
    /* JADX WARN: Type inference failed for: r40v3 */
    public static final void v(final boolean z3, final float f10, final boolean z9, final long j10, final float f11, final float f12, final df.l lVar, final df.a aVar, final int i, r0.m mVar, final int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        boolean z10;
        q1 t3;
        df.p pVar;
        boolean z11;
        Object nVar;
        r0.v0 v0Var;
        y2.c cVar;
        boolean z12;
        boolean z13;
        final float f13;
        int i16;
        r0.r rVar = (r0.r) mVar;
        rVar.c0(1837812649);
        if (rVar.g(z3)) {
            i11 = 4;
        } else {
            i11 = 2;
        }
        int i17 = i10 | i11;
        if (rVar.c(f10)) {
            i12 = 32;
        } else {
            i12 = 16;
        }
        int i18 = i17 | i12;
        if (rVar.e(j10)) {
            i13 = 2048;
        } else {
            i13 = 1024;
        }
        int i19 = i18 | i13;
        if (rVar.h(lVar)) {
            i14 = 1048576;
        } else {
            i14 = 524288;
        }
        int i20 = i19 | i14;
        if (rVar.h(aVar)) {
            i15 = 8388608;
        } else {
            i15 = 4194304;
        }
        int i21 = i20 | i15;
        if ((i10 & 100663296) == 0) {
            if (rVar.d(i)) {
                i16 = 67108864;
            } else {
                i16 = 33554432;
            }
            i21 |= i16;
        }
        if ((38347923 & i21) != 38347922) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (rVar.R(i21 & 1, z10)) {
            final long d2 = k1.l0.d(4294967295L);
            final long d10 = k1.l0.d(4280032286L);
            final long c10 = k1.c(k1.l0.d(4278190080L), 0.06f);
            final long c11 = k1.c(k1.l0.d(4278190080L), 0.12f);
            y2.c cVar2 = (y2.c) rVar.j(p1.f3606h);
            Object O = rVar.O();
            r0.v0 v0Var2 = r0.l.f24285a;
            if (O == v0Var2) {
                O = r0.y.B(Boolean.valueOf(z3));
                rVar.k0(O);
            }
            a1 a1Var = (a1) O;
            Object O2 = rVar.O();
            if (O2 == v0Var2) {
                O2 = r0.y.B(Boolean.FALSE);
                rVar.k0(O2);
            }
            final a1 a1Var2 = (a1) O2;
            Boolean valueOf = Boolean.valueOf(z3);
            if ((i21 & 14) == 4) {
                z11 = true;
            } else {
                z11 = false;
            }
            Object O3 = rVar.O();
            te.c cVar3 = null;
            if (!z11 && O3 != v0Var2) {
                v0Var = v0Var2;
                nVar = O3;
                cVar = cVar2;
                z12 = 0;
            } else {
                v0Var = v0Var2;
                cVar = cVar2;
                z12 = 0;
                nVar = new n(z3, a1Var, a1Var2, cVar3, 4);
                rVar.k0(nVar);
            }
            r0.y.f((df.p) nVar, valueOf, rVar);
            if (!((Boolean) a1Var.getValue()).booleanValue()) {
                t3 = rVar.t();
                if (t3 != null) {
                    final int i22 = 0;
                    pVar = new df.p() { // from class: x7.r0
                        @Override // df.p
                        public final Object invoke(Object obj, Object obj2) {
                            switch (i22) {
                                case 0:
                                    ((Integer) obj2).getClass();
                                    v(z3, f10, z9, j10, f11, f12, lVar, aVar, i, (r0.m) obj, r0.y.L(i10 | 1));
                                    break;
                                default:
                                    ((Integer) obj2).getClass();
                                    v(z3, f10, z9, j10, f11, f12, lVar, aVar, i, (r0.m) obj, r0.y.L(i10 | 1));
                                    break;
                            }
                            return pe.z.f22715a;
                        }
                    };
                    t3.f24332d = pVar;
                }
                return;
            }
            float l0 = cVar.l0(16);
            int b10 = ff.a.b(cVar.l0(8));
            Object O4 = rVar.O();
            if (O4 == v0Var) {
                O4 = r0.y.B(null);
                rVar.k0(O4);
            }
            final a1 a1Var3 = (a1) O4;
            Object O5 = rVar.O();
            if (O5 == v0Var) {
                O5 = r0.y.B(Integer.valueOf((int) z12));
                rVar.k0(O5);
            }
            final a1 a1Var4 = (a1) O5;
            boolean c12 = rVar.c(l0) | rVar.d(b10);
            if ((234881024 & i21) == 67108864) {
                z13 = true;
            } else {
                z13 = z12;
            }
            boolean z14 = c12 | z13;
            Object O6 = rVar.O();
            if (!z14 && O6 != v0Var) {
                f13 = l0;
            } else {
                O6 = new w0(b10, i, l0, a1Var3, a1Var4);
                f13 = l0;
                rVar.k0(O6);
            }
            c3.a((w0) O6, aVar, new c3.b0(14, z12), z0.h.d(479695563, new df.p() { // from class: x7.s0
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r1v16, types: [d1.r] */
                /* JADX WARN: Type inference failed for: r1v19 */
                /* JADX WARN: Type inference failed for: r1v20 */
                @Override // df.p
                public final Object invoke(Object obj, Object obj2) {
                    boolean z15;
                    float f14;
                    long j11;
                    s0 s0Var;
                    Object r12;
                    r0.m mVar2 = (r0.m) obj;
                    int intValue = ((Integer) obj2).intValue();
                    if ((intValue & 3) != 2) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    r0.r rVar2 = (r0.r) mVar2;
                    boolean R = rVar2.R(intValue & 1, z15);
                    pe.z zVar = pe.z.f22715a;
                    if (R) {
                        a1 a1Var5 = a1.this;
                        float f15 = 1.0f;
                        if (((Boolean) a1Var5.getValue()).booleanValue()) {
                            f14 = 1.0f;
                        } else {
                            f14 = 0.2f;
                        }
                        n2 a10 = f.a(f14, e.r(0.6f, 400.0f, null, 4), null, rVar2, 48, 28);
                        if (!((Boolean) a1Var5.getValue()).booleanValue()) {
                            f15 = 0.0f;
                        }
                        n2 a11 = f.a(f15, e.s(150, 0, null, 6), null, rVar2, 48, 28);
                        a1 a1Var6 = a1Var3;
                        Float f16 = (Float) a1Var6.getValue();
                        float f17 = 0.5f;
                        if (f16 != null) {
                            float floatValue = f16.floatValue();
                            if (((Number) a1Var4.getValue()).intValue() > 0) {
                                f17 = floatValue / ((Number) r12.getValue()).intValue();
                            }
                        }
                        d1.h hVar = d1.c.G;
                        boolean c13 = rVar2.c(f17) | rVar2.f(a10) | rVar2.f(a11);
                        Object O7 = rVar2.O();
                        r0.v0 v0Var3 = r0.l.f24285a;
                        if (c13 || O7 == v0Var3) {
                            O7 = new m(f17, a10, a11, 5);
                            rVar2.k0(O7);
                        }
                        d1.o oVar = d1.o.f15687a;
                        d1.r a12 = androidx.compose.ui.graphics.a(oVar, (df.l) O7);
                        r a13 = q.a(h.f29962b, hVar, rVar2, 48);
                        int hashCode = Long.hashCode(rVar2.T);
                        z0.g l10 = rVar2.l();
                        d1.r c14 = d1.a.c(a12, rVar2);
                        b2.h.f1471d.getClass();
                        b2.b0 b0Var = b2.g.f1462b;
                        rVar2.e0();
                        if (rVar2.S) {
                            rVar2.k(b0Var);
                        } else {
                            rVar2.n0();
                        }
                        b2.f fVar = b2.g.e;
                        r0.y.I(fVar, a13, rVar2);
                        b2.f fVar2 = b2.g.f1464d;
                        r0.y.I(fVar2, l10, rVar2);
                        b2.f fVar3 = b2.g.f1465f;
                        if (rVar2.S || !kotlin.jvm.internal.l.a(rVar2.O(), Integer.valueOf(hashCode))) {
                            a.t(hashCode, rVar2, hashCode, fVar3);
                        }
                        b2.f fVar4 = b2.g.f1463c;
                        r0.y.I(fVar4, c14, rVar2);
                        d1.i iVar = d1.c.E;
                        float f18 = 16;
                        e i23 = h.i(f18);
                        float f19 = 12;
                        d a14 = e.a(f19);
                        long j12 = k1.r.f19513b;
                        d1.r a15 = m7.a(oVar, 18, a14, k1.c(j12, 0.35f), k1.c(j12, 0.55f), 4);
                        d a16 = e.a(f19);
                        long j13 = d2;
                        d1.r l11 = androidx.compose.foundation.layout.a.l(androidx.compose.foundation.a.b(a15, j13, a16), 20, f19);
                        p0 a17 = o0.a(i23, iVar, rVar2, 54);
                        int hashCode2 = Long.hashCode(rVar2.T);
                        z0.g l12 = rVar2.l();
                        d1.r c15 = d1.a.c(l11, rVar2);
                        rVar2.e0();
                        if (rVar2.S) {
                            rVar2.k(b0Var);
                        } else {
                            rVar2.n0();
                        }
                        r0.y.I(fVar, a17, rVar2);
                        r0.y.I(fVar2, l12, rVar2);
                        if (rVar2.S || !kotlin.jvm.internal.l.a(rVar2.O(), Integer.valueOf(hashCode2))) {
                            a.t(hashCode2, rVar2, hashCode2, fVar3);
                        }
                        r0.y.I(fVar4, c15, rVar2);
                        d1.r k3 = androidx.compose.foundation.layout.d.k(oVar, 48);
                        d dVar = e.f16629a;
                        d1.r k4 = androidx.compose.foundation.layout.a.k(androidx.compose.foundation.a.b(k3, c10, dVar), 4);
                        d1.j jVar = d1.c.f15674y;
                        z1.p0 d11 = m.d(jVar, false);
                        int hashCode3 = Long.hashCode(rVar2.T);
                        z0.g l13 = rVar2.l();
                        d1.r c16 = d1.a.c(k4, rVar2);
                        rVar2.e0();
                        if (rVar2.S) {
                            rVar2.k(b0Var);
                        } else {
                            rVar2.n0();
                        }
                        r0.y.I(fVar, d11, rVar2);
                        r0.y.I(fVar2, l13, rVar2);
                        if (rVar2.S || !kotlin.jvm.internal.l.a(rVar2.O(), Integer.valueOf(hashCode3))) {
                            a.t(hashCode3, rVar2, hashCode3, fVar3);
                        }
                        r0.y.I(fVar4, c16, rVar2);
                        final float f20 = f10;
                        d1.r a18 = j7.a(androidx.compose.foundation.layout.d.k(oVar, f20), dVar);
                        boolean z16 = z9;
                        final long j14 = d10;
                        if (z16) {
                            j11 = j14;
                        } else {
                            j11 = j10;
                        }
                        m.a(0, androidx.compose.foundation.a.b(a18, j11, k1.l0.f19495a), rVar2);
                        rVar2.p(true);
                        Object O8 = rVar2.O();
                        if (O8 == v0Var3) {
                            O8 = r0.y.B(Boolean.FALSE);
                            rVar2.k0(O8);
                        }
                        a1 a1Var7 = (a1) O8;
                        d1.r n10 = androidx.compose.foundation.layout.d.n(androidx.compose.foundation.layout.d.f(oVar, 32), 150);
                        df.l lVar2 = lVar;
                        boolean f21 = rVar2.f(lVar2);
                        final float f22 = f11;
                        boolean c17 = f21 | rVar2.c(f22);
                        final float f23 = f12;
                        boolean c18 = c17 | rVar2.c(f23);
                        Object O9 = rVar2.O();
                        if (c18 || O9 == v0Var3) {
                            O9 = new u0(a1Var7, lVar2, f22, f23);
                            rVar2.k0(O9);
                        }
                        d1.r b11 = v1.d0.b(n10, zVar, (PointerInputEventHandler) O9);
                        boolean f24 = rVar2.f(lVar2) | rVar2.c(f22) | rVar2.c(f23);
                        Object O10 = rVar2.O();
                        if (f24 || O10 == v0Var3) {
                            O10 = new u0(lVar2, f22, f23, a1Var7);
                            rVar2.k0(O10);
                        }
                        d1.r b12 = v1.d0.b(b11, zVar, (PointerInputEventHandler) O10);
                        z1.p0 d12 = m.d(jVar, false);
                        int hashCode4 = Long.hashCode(rVar2.T);
                        z0.g l14 = rVar2.l();
                        d1.r c19 = d1.a.c(b12, rVar2);
                        rVar2.e0();
                        if (rVar2.S) {
                            rVar2.k(b0Var);
                        } else {
                            rVar2.n0();
                        }
                        r0.y.I(fVar, d12, rVar2);
                        r0.y.I(fVar2, l14, rVar2);
                        if (rVar2.S || !kotlin.jvm.internal.l.a(rVar2.O(), Integer.valueOf(hashCode4))) {
                            a.t(hashCode4, rVar2, hashCode4, fVar3);
                        }
                        r0.y.I(fVar4, c19, rVar2);
                        FillElement fillElement = androidx.compose.foundation.layout.d.f506c;
                        boolean c20 = rVar2.c(f20) | rVar2.c(f22) | rVar2.c(f23);
                        Object O11 = rVar2.O();
                        if (!c20 && O11 != v0Var3) {
                            s0Var = this;
                        } else {
                            s0Var = this;
                            final long j15 = c11;
                            O11 = new df.l() { // from class: x7.t0
                                @Override // df.l
                                public final Object invoke(Object obj3) {
                                    long j16 = j14;
                                    m1.d dVar2 = (m1.d) obj3;
                                    dVar2.getClass();
                                    float l02 = dVar2.l0(20);
                                    float f25 = 2;
                                    float l03 = dVar2.l0(f25);
                                    float l04 = dVar2.l0(8);
                                    float intBitsToFloat = Float.intBitsToFloat((int) (dVar2.e() & 4294967295L)) / 2.0f;
                                    k1.h a19 = k1.a();
                                    float f26 = l03 / 2.0f;
                                    a19.h(l04, intBitsToFloat - f26);
                                    float f27 = l02 / 2.0f;
                                    a19.g(Float.intBitsToFloat((int) (dVar2.e() >> 32)) - l04, intBitsToFloat - f27);
                                    a19.g(Float.intBitsToFloat((int) (dVar2.e() >> 32)) - l04, f27 + intBitsToFloat);
                                    a19.g(l04, f26 + intBitsToFloat);
                                    a19.d();
                                    m1.d.o0(dVar2, a19, j15, null, 60);
                                    float f28 = f20;
                                    float f29 = f22;
                                    float intBitsToFloat2 = ((Float.intBitsToFloat((int) (dVar2.e() >> 32)) - (f25 * l04)) * b9.d((f28 - f29) / (f23 - f29), 0.0f, 1.0f)) + l04;
                                    float intBitsToFloat3 = Float.intBitsToFloat((int) (dVar2.e() & 4294967295L));
                                    i0 p02 = dVar2.p0();
                                    long r8 = p02.r();
                                    p02.j().l();
                                    try {
                                        ((ic.c) p02.f18636v).e(0.0f, 0.0f, intBitsToFloat2, intBitsToFloat3, 1);
                                        m1.d.o0(dVar2, a19, j16, null, 60);
                                        a.v(p02, r8);
                                        m1.d.D(dVar2, j16, dVar2.l0(6), (Float.floatToRawIntBits(intBitsToFloat2) << 32) | (Float.floatToRawIntBits(intBitsToFloat) & 4294967295L), null, 120);
                                        return pe.z.f22715a;
                                    } catch (Throwable th) {
                                        a.v(p02, r8);
                                        throw th;
                                    }
                                }
                            };
                            rVar2.k0(O11);
                        }
                        ta.a(fillElement, (df.l) O11, rVar2, 6);
                        rVar2.p(true);
                        rVar2.p(true);
                        Float f25 = (Float) a1Var6.getValue();
                        if (f25 != null) {
                            rVar2.a0(2082208410);
                            boolean f26 = rVar2.f(f25);
                            float f27 = f13;
                            boolean c21 = f26 | rVar2.c(f27);
                            Object O12 = rVar2.O();
                            if (c21 || O12 == v0Var3) {
                                O12 = new h(f25, f27, 6);
                                rVar2.k0(O12);
                            }
                            d1.r g8 = androidx.compose.foundation.layout.a.g((df.l) O12);
                            rVar2.p(false);
                            r12 = g8;
                        } else {
                            rVar2.a0(2082315701);
                            rVar2.p(false);
                            r12 = new Object();
                        }
                        d1.r l15 = androidx.compose.foundation.layout.d.l(r12, f18, 8);
                        Object O13 = rVar2.O();
                        if (O13 == v0Var3) {
                            O13 = new fb(j13, 14);
                            rVar2.k0(O13);
                        }
                        ta.a(l15, (df.l) O13, rVar2, 48);
                        rVar2.p(true);
                        return zVar;
                    }
                    rVar2.U();
                    return zVar;
                }
            }, rVar), rVar, ((i21 >> 18) & 112) | 3456, 0);
        } else {
            rVar.U();
        }
        t3 = rVar.t();
        if (t3 != null) {
            final int i23 = 1;
            pVar = new df.p() { // from class: x7.r0
                @Override // df.p
                public final Object invoke(Object obj, Object obj2) {
                    switch (i23) {
                        case 0:
                            ((Integer) obj2).getClass();
                            v(z3, f10, z9, j10, f11, f12, lVar, aVar, i, (r0.m) obj, r0.y.L(i10 | 1));
                            break;
                        default:
                            ((Integer) obj2).getClass();
                            v(z3, f10, z9, j10, f11, f12, lVar, aVar, i, (r0.m) obj, r0.y.L(i10 | 1));
                            break;
                    }
                    return pe.z.f22715a;
                }
            };
            t3.f24332d = pVar;
        }
    }

    public static final d1.r w(int i, d1.r rVar, df.a aVar, r0.m mVar) {
        rVar.getClass();
        int i10 = i & 1;
        r0.v0 v0Var = r0.l.f24285a;
        if (i10 != 0) {
            r0.r rVar2 = (r0.r) mVar;
            Object O = rVar2.O();
            if (O == v0Var) {
                O = new fg.o(19);
                rVar2.k0(O);
            }
            aVar = (df.a) O;
        }
        df.a aVar2 = aVar;
        r0.r rVar3 = (r0.r) mVar;
        Object O2 = rVar3.O();
        if (O2 == v0Var) {
            O2 = a.r(rVar3);
        }
        return androidx.compose.foundation.a.e(rVar, (v.i) O2, null, false, null, aVar2, 28);
    }

    public static final boolean x(j6 j6Var, Context context, String str) {
        j6Var.getClass();
        context.getClass();
        try {
            j6Var.a(str);
            return true;
        } catch (ActivityNotFoundException unused) {
            Toast.makeText(context, context.getString(R.string.error_no_file_picker), 1).show();
            return false;
        }
    }

    public static void y(Context context, String str) {
        Set<String> linkedHashSet;
        context.getClass();
        SharedPreferences sharedPreferences = context.getSharedPreferences("scraply_notices", 0);
        Set<String> stringSet = sharedPreferences.getStringSet("seen_notices", qe.u.f24025u);
        if (stringSet != null) {
            linkedHashSet = qe.l.T(stringSet);
        } else {
            linkedHashSet = new LinkedHashSet<>();
        }
        linkedHashSet.add(str);
        sharedPreferences.edit().putStringSet("seen_notices", linkedHashSet).apply();
    }
}