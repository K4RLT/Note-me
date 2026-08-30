package b8;
import a.a;
import b2.b0;
import b2.f;
import b2.g;
import b2.h;
import c2.p1;
import d.d;
import d1.c;
import d1.o;
import d1.r;
import eb.w;
import eb.x;
import g7.e;
import j.i0;
import k1.h0;
import k1.j0;
import k1.k;
import k1.l0;
import k1.n;
import k1.o0;
import k1.p;
import m2.g0;
import m2.m0;
import m2.q0;
import m2.q;
import q2.i;
import q2.s;
import q2.u;
import r0.a1;
import r0.l;
import r0.m;
import r0.n2;
import r0.q1;
import r0.y;
import y2.b;

import android.graphics.Path;
import android.graphics.RectF;
import androidx.compose.foundation.layout.FillElement;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import ya.ae;
import ya.kd;

/* loaded from: classes.dex */
public abstract class v5 {

    /* renamed from: a, reason: collision with root package name */
    public static final ConcurrentHashMap f2878a = new ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    public static final pe.j[] f2879b;

    /* renamed from: c, reason: collision with root package name */
    public static final long f2880c;

    /* renamed from: d, reason: collision with root package name */
    public static final long f2881d;
    public static final long e;

    /* renamed from: f, reason: collision with root package name */
    public static final long f2882f;

    static {
        Float valueOf = Float.valueOf(0.0f);
        long j10 = r.f19513b;
        f2879b = new pe.j[]{new pe.j(valueOf, new r(r.c(j10, 0.4f))), new pe.j(Float.valueOf(0.16f), new r(r.c(j10, 0.1f))), new pe.j(Float.valueOf(0.36f), new r(r.c(r.f19515d, 0.22f))), new pe.j(Float.valueOf(0.62f), new r(r.f19520k)), new pe.j(Float.valueOf(0.88f), new r(r.c(j10, 0.2f))), new pe.j(Float.valueOf(1.0f), new r(r.c(j10, 0.44f)))};
        f2880c = l0.d(4294637294L);
        f2881d = l0.d(4281082909L);
        e = l0.d(4292266682L);
        f2882f = l0.d(4287394645L);
    }

    public static final void a(final String str, final w7.l9 l9Var, final float f10, r rVar, m mVar, int i) {
        int i10;
        int i11;
        int i12;
        boolean z3;
        r rVar2 = (r) mVar;
        rVar2.c0(-1627493914);
        if (rVar2.f(str)) {
            i10 = 4;
        } else {
            i10 = 2;
        }
        int i13 = i10 | i;
        if (rVar2.f(l9Var)) {
            i11 = 32;
        } else {
            i11 = 16;
        }
        int i14 = i13 | i11;
        if (rVar2.c(f10)) {
            i12 = 256;
        } else {
            i12 = 128;
        }
        int i15 = i14 | i12;
        if ((i15 & 1171) != 1170) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (rVar2.R(i15 & 1, z3)) {
            x.a(rVar, null, h.d(1588457808, new df.q() { // from class: b8.s5
                @Override // df.q
                public final Object b(Object obj, Object obj2, Object obj3) {
                    boolean z9;
                    float f11;
                    float f12;
                    int i16;
                    int i17;
                    androidx.compose.foundation.layout.c cVar = (androidx.compose.foundation.layout.c) obj;
                    m mVar2 = (m) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    cVar.getClass();
                    if ((intValue & 6) == 0) {
                        if (((r) mVar2).f(cVar)) {
                            i17 = 4;
                        } else {
                            i17 = 2;
                        }
                        intValue |= i17;
                    }
                    if ((intValue & 19) != 18) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    r rVar3 = (r) mVar2;
                    if (rVar3.R(intValue & 1, z9)) {
                        c cVar2 = (c) rVar3.j(p1.f3606h);
                        float l0 = cVar2.l0(cVar.b());
                        c cVar3 = cVar.f502a;
                        long j10 = cVar.f503b;
                        if (a.c(j10)) {
                            f11 = cVar3.Y(a.g(j10));
                        } else {
                            f11 = Float.POSITIVE_INFINITY;
                        }
                        float l02 = cVar2.l0(f11);
                        boolean c10 = rVar3.c(l0) | rVar3.c(l02);
                        Object O = rVar3.O();
                        Object obj4 = l.f24285a;
                        if (c10 || O == obj4) {
                            O = new t4(l0, l02);
                            rVar3.k0(O);
                        }
                        final t4 t4Var = (t4) O;
                        ConcurrentHashMap concurrentHashMap = v5.f2878a;
                        final w7.l9 l9Var2 = w7.l9.this;
                        Object obj5 = concurrentHashMap.get(v5.f(l9Var2, t4Var));
                        boolean f13 = rVar3.f(l9Var2) | rVar3.f(t4Var);
                        Object O2 = rVar3.O();
                        if (f13 || O2 == obj4) {
                            O2 = new l2(l9Var2, t4Var, (te.c) null, 3);
                            rVar3.k0(O2);
                        }
                        final a1 C = y.C(obj5, l9Var2, t4Var, (df.p) O2, rVar3, 0);
                        if (((f) C.getValue()) != null) {
                            f12 = 1.0f;
                        } else {
                            f12 = 0.0f;
                        }
                        final n2 a10 = q.a(f12, q.e.s(220, 0, null, 6), "tiraAlfa", rVar3, 3120, 20);
                        final o0 h3 = g0.h(rVar3);
                        String str2 = str;
                        boolean f14 = rVar3.f(str2);
                        Object O3 = rVar3.O();
                        if (f14 || O3 == obj4) {
                            O3 = new l1(str2);
                            rVar3.k0(O3);
                        }
                        final l1 l1Var = (l1) O3;
                        FillElement fillElement = androidx.compose.foundation.layout.d.f506c;
                        boolean f15 = rVar3.f(l9Var2) | rVar3.f(t4Var) | rVar3.f(C) | rVar3.f(a10) | rVar3.f(l1Var) | rVar3.f(h3);
                        final float f16 = f10;
                        boolean c11 = f15 | rVar3.c(f16);
                        Object O4 = rVar3.O();
                        if (!c11 && O4 != obj4) {
                            i16 = 6;
                        } else {
                            i16 = 6;
                            Object obj6 = new df.l() { // from class: b8.u5
                                @Override // df.l
                                public final Object invoke(Object obj7) {
                                    d dVar = (d) obj7;
                                    dVar.getClass();
                                    v5.e(dVar, w7.l9.this, t4Var, (f) C.getValue(), ((Number) a10.getValue()).floatValue(), l1Var, h3, f16);
                                    return pe.z.f22715a;
                                }
                            };
                            rVar3.k0(obj6);
                            O4 = obj6;
                        }
                        ya.a(fillElement, (df.l) O4, rVar3, i16);
                    } else {
                        rVar3.U();
                    }
                    return pe.z.f22715a;
                }
            }, rVar2), rVar2, 3078);
        } else {
            rVar2.U();
        }
        q1 t3 = rVar2.t();
        if (t3 != null) {
            t3.f24332d = new t5(str, l9Var, f10, rVar, i);
        }
    }

    public static final void b(final String str, final w7.l9 l9Var, final h hVar, final boolean z3, final boolean z9, final int i, final df.a aVar, final float f10, m mVar, final int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        boolean z10;
        q.d dVar;
        str.getClass();
        aVar.getClass();
        r rVar = (r) mVar;
        rVar.c0(2109406077);
        if (rVar.f(str)) {
            i11 = 4;
        } else {
            i11 = 2;
        }
        int i19 = i10 | i11;
        if (rVar.f(l9Var)) {
            i12 = 32;
        } else {
            i12 = 16;
        }
        int i20 = i19 | i12;
        if (rVar.f(hVar)) {
            i13 = 256;
        } else {
            i13 = 128;
        }
        int i21 = i20 | i13;
        if (rVar.g(z3)) {
            i14 = 2048;
        } else {
            i14 = 1024;
        }
        int i22 = i21 | i14;
        if (rVar.g(z9)) {
            i15 = 16384;
        } else {
            i15 = 8192;
        }
        int i23 = i22 | i15;
        if (rVar.d(i)) {
            i16 = 131072;
        } else {
            i16 = 65536;
        }
        int i24 = i23 | i16;
        if (rVar.h(aVar)) {
            i17 = 1048576;
        } else {
            i17 = 524288;
        }
        int i25 = i24 | i17;
        if (rVar.c(f10)) {
            i18 = 8388608;
        } else {
            i18 = 4194304;
        }
        int i26 = i25 | i18;
        if ((4793491 & i26) != 4793490) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (rVar.R(i26 & 1, z10)) {
            final boolean a10 = kotlin.jvm.internal.a(hVar, e.f17563a);
            Object O = rVar.O();
            Object obj = l.f24285a;
            if (O == obj) {
                O = q.e.a(1.0f);
                rVar.k0(O);
            }
            q.d dVar2 = (q.d) O;
            Object O2 = rVar.O();
            if (O2 == obj) {
                O2 = q.e.a(0.0f);
                rVar.k0(O2);
            }
            final q.d dVar3 = (q.d) O2;
            Object O3 = rVar.O();
            if (O3 == obj) {
                O3 = y.B(Boolean.valueOf(a10));
                rVar.k0(O3);
            }
            a1 a1Var = (a1) O3;
            Boolean valueOf = Boolean.valueOf(a10);
            boolean g8 = rVar.g(a10) | rVar.h(dVar2) | rVar.h(dVar3);
            Object O4 = rVar.O();
            if (!g8 && O4 != obj) {
                dVar = dVar2;
            } else {
                dVar = dVar2;
                O4 = new y2(a10, dVar3, a1Var, dVar, null, 1);
                rVar.k0(O4);
            }
            y.f((df.p) O4, valueOf, rVar);
            p1 p1Var = p1.f3606h;
            c cVar = (c) rVar.j(p1Var);
            final q.d dVar4 = dVar;
            y.a(p1Var.a(new d(cVar.a() * f10, cVar.i0())), h.d(-545644867, new df.p() { // from class: b8.q5
                @Override // df.p
                public final Object invoke(Object obj2, Object obj3) {
                    boolean z11;
                    c cVar2;
                    m mVar2 = (m) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    if ((intValue & 3) != 2) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    r rVar2 = (r) mVar2;
                    if (rVar2.R(intValue & 1, z11)) {
                        o oVar = o.f15687a;
                        r d2 = androidx.compose.foundation.layout.d(oVar, 1.0f);
                        q.d dVar5 = q.d.this;
                        boolean h3 = rVar2.h(dVar5);
                        Object O5 = rVar2.O();
                        if (h3 || O5 == l.f24285a) {
                            O5 = new w2(dVar5, 3);
                            rVar2.k0(O5);
                        }
                        r a11 = androidx.compose.ui.graphics.a(d2, (df.l) O5);
                        z1.p0 d10 = x.d(c.f15670u, false);
                        int hashCode = Long.hashCode(rVar2.T);
                        g l10 = rVar2.l();
                        r c10 = a.c(a11, rVar2);
                        h.f1471d.getClass();
                        b0 b0Var = g.f1462b;
                        rVar2.e0();
                        if (rVar2.S) {
                            rVar2.k(b0Var);
                        } else {
                            rVar2.n0();
                        }
                        y.I(g.e, d10, rVar2);
                        y.I(g.f1464d, l10, rVar2);
                        f fVar = g.f1465f;
                        if (rVar2.S || !kotlin.jvm.internal.a(rVar2.O(), Integer.valueOf(hashCode))) {
                            a.t(hashCode, rVar2, hashCode, fVar);
                        }
                        y.I(g.f1463c, c10, rVar2);
                        a(str, l9Var, ((Number) dVar3.e()).floatValue(), androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d(oVar, 1.0f), 0.84317034f), rVar2, 3072);
                        h hVar2 = hVar;
                        Float f11 = null;
                        if (hVar2 instanceof c) {
                            cVar2 = (c) hVar2;
                        } else {
                            cVar2 = null;
                        }
                        if (cVar2 != null) {
                            f11 = Float.valueOf(cVar2.f17561a);
                        }
                        g(a10, f11, z3, z9, i, aVar, androidx.compose.foundation.layout.a.o(androidx.compose.foundation.layout.b.f501a.a(oVar, c.C), 0.0f, 0.0f, 4, 2, 3), rVar2, 0);
                        rVar2.p(true);
                    } else {
                        rVar2.U();
                    }
                    return pe.z.f22715a;
                }
            }, rVar), rVar, 56);
        } else {
            rVar.U();
        }
        q1 t3 = rVar.t();
        if (t3 != null) {
            t3.f24332d = new df.p(str, l9Var, hVar, z3, z9, i, aVar, f10, i10) { // from class: b8.r5
                public final /* synthetic */ df.a A;
                public final /* synthetic */ float B;

                /* renamed from: u, reason: collision with root package name */
                public final /* synthetic */ String f2659u;

                /* renamed from: v, reason: collision with root package name */
                public final /* synthetic */ w7.l9 f2660v;

                /* renamed from: w, reason: collision with root package name */
                public final /* synthetic */ h f2661w;

                /* renamed from: x, reason: collision with root package name */
                public final /* synthetic */ boolean f2662x;

                /* renamed from: y, reason: collision with root package name */
                public final /* synthetic */ boolean f2663y;

                /* renamed from: z, reason: collision with root package name */
                public final /* synthetic */ int f2664z;

                @Override // df.p
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int L = y.L(1);
                    v5.b(this.f2659u, this.f2660v, this.f2661w, this.f2662x, this.f2663y, this.f2664z, this.A, this.B, (m) obj2, L);
                    return pe.z.f22715a;
                }
            };
        }
    }

    public static final void c(d dVar, o0 o0Var, long j10, float f10, float f11, float f12, List list) {
        long j11;
        int i;
        float f13;
        long j12;
        Throwable th;
        int i10;
        g3 g3Var;
        q0 q0Var;
        float f14 = 0.05f * f10;
        List<g3> list2 = list;
        ArrayList arrayList = new ArrayList(qe.d(list2, 10));
        for (g3 g3Var2 : list2) {
            arrayList.add(o0.a(o0Var, g3Var2.f2113a, g3Var2.f2114b, 0L, 996));
        }
        int size = arrayList.size();
        double d2 = 0.0d;
        int i11 = 0;
        while (true) {
            j11 = 4294967295L;
            if (i11 >= size) {
                break;
            }
            Object obj = arrayList.get(i11);
            i11++;
            d2 += (int) (((m0) obj).f20526c & 4294967295L);
        }
        int i12 = 1;
        float size2 = ((list.size() - 1) * f14) + ((float) d2);
        Throwable th2 = null;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            i = 0;
        } else {
            Iterator it = list2.iterator();
            i = 0;
            while (it.hasNext()) {
                if (((g3) it.next()).f2116d && (i = i + 1) < 0) {
                    qe.m.k();
                    throw null;
                }
            }
        }
        int i13 = (int) (j10 & 4294967295L);
        float f15 = 2.0f;
        float intBitsToFloat = (((f12 - f11) - ((i * f14) + size2)) / 2.0f) + Float.intBitsToFloat(i13) + f11;
        Iterator it2 = list2.iterator();
        int i14 = 0;
        while (it2.hasNext()) {
            Object next = it2.next();
            int i15 = i14 + 1;
            if (i14 >= 0) {
                g3 g3Var3 = (g3) next;
                if (g3Var3.f2116d) {
                    float d10 = wa.b9.d(Math.abs(intBitsToFloat - Float.intBitsToFloat(i13)) / f10, 0.0f, 1.0f);
                    j12 = j11;
                    float sqrt = f10 * f15 * ((float) Math.sqrt(1.0f - (d10 * d10)));
                    int i16 = (int) (j10 >> 32);
                    float f16 = sqrt * 0.28f;
                    float f17 = (0.5f * f14) + intBitsToFloat;
                    th = th2;
                    i10 = i13;
                    f13 = f15;
                    d.n0(dVar, r.c(f2881d, 0.3f), (Float.floatToRawIntBits(Float.intBitsToFloat(i16) - f16) << 32) | (Float.floatToRawIntBits(f17) & j12), (Float.floatToRawIntBits(Float.intBitsToFloat(i16) + f16) << 32) | (Float.floatToRawIntBits(f17) & j12), dVar.l0((float) 0.5d), 0, null, 496);
                    intBitsToFloat += f14;
                } else {
                    f13 = f15;
                    j12 = j11;
                    th = th2;
                    i10 = i13;
                }
                float f18 = intBitsToFloat;
                m0 m0Var = (m0) arrayList.get(i14);
                float f19 = (int) (m0Var.f20526c & j12);
                float d11 = wa.b9.d(Math.abs(Math.max(Math.abs(f18 - Float.intBitsToFloat(i10)), Math.abs((f18 + f19) - Float.intBitsToFloat(i10)))) / f10, 0.0f, 1.0f);
                float sqrt2 = f10 * f13 * ((float) Math.sqrt(1.0f - (d11 * d11)));
                q0 q0Var2 = g3Var3.f2114b;
                o oVar = g3Var3.f2115c;
                if (oVar != null) {
                    float c10 = o.c(q0Var2.f20555a.f20485b);
                    q0 q0Var3 = q0Var2;
                    while (((int) (m0Var.f20526c >> 32)) > sqrt2 && c10 > o.c(oVar.f30820a)) {
                        float f20 = c10 - 0.2f;
                        q0 a10 = q0.a(q0Var3, 0L, ae.f(4294967296L, f20), null, null, 0L, 0L, null, null, 16777213);
                        c10 = f20;
                        m0Var = o0.a(o0Var, g3Var3.f2113a, a10, 0L, 996);
                        q0Var3 = a10;
                        g3Var3 = g3Var3;
                    }
                    g3Var = g3Var3;
                    q0Var = q0Var3;
                } else {
                    g3Var = g3Var3;
                    q0Var = q0Var2;
                }
                String str = g3Var.f2113a;
                int i17 = (int) sqrt2;
                if (i17 < i12) {
                    i17 = i12;
                }
                m0 a11 = o0.a(o0Var, str, q0Var, b.b(i17, 0, 13), 960);
                q qVar = a11.f20525b;
                l0 l0Var = a11.f20524a;
                float f21 = (int) (a11.f20526c >> 32);
                long floatToRawIntBits = (Float.floatToRawIntBits(f18) & j12) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j10 >> 32)) - (f21 / f13)) << 32);
                long j13 = r.f19521l;
                h0 h0Var = l0Var.f20515b.f20555a;
                float f22 = f14;
                o0 o0Var2 = h0Var.f20495n;
                l lVar = h0Var.f20494m;
                e eVar = h0Var.f20497p;
                Iterator it3 = it2;
                i0 p02 = dVar.p0();
                ArrayList arrayList2 = arrayList;
                long r8 = p02.r();
                p02.j().l();
                try {
                    ic.c cVar = (ic.c) p02.f18636v;
                    cVar.D(Float.intBitsToFloat((int) (floatToRawIntBits >> 32)), Float.intBitsToFloat((int) (floatToRawIntBits & j12)));
                    if (a11.e() && l0Var.f20518f != 3) {
                        cVar.e(0.0f, 0.0f, f21, (int) (r7 & j12), 1);
                    }
                    q0 q0Var4 = l0Var.f20515b;
                    n c11 = q0Var4.f20555a.f20484a.c();
                    float f23 = Float.NaN;
                    if (c11 != null && j13 == 16) {
                        p j14 = dVar.p0().j();
                        if (Float.isNaN(Float.NaN)) {
                            f23 = q0Var4.f20555a.f20484a.a();
                        }
                        qVar.j(j14, c11, f23, o0Var2, lVar, eVar);
                    } else {
                        p j15 = dVar.p0().j();
                        if (j13 == 16) {
                            j13 = q0Var4.b();
                        }
                        qVar.i(j15, kd.a(j13, Float.NaN), o0Var2, lVar, eVar);
                    }
                    p02.j().s();
                    p02.I(r8);
                    intBitsToFloat = f19 + f22 + f18;
                    f15 = f13;
                    it2 = it3;
                    th2 = th;
                    i14 = i15;
                    j11 = j12;
                    f14 = f22;
                    arrayList = arrayList2;
                    i13 = i10;
                    i12 = 1;
                } catch (Throwable th3) {
                    a.v(p02, r8);
                    throw th3;
                }
            } else {
                Throwable th4 = th2;
                qe.m.l();
                throw th4;
            }
        }
    }

    public static final void d(d dVar, t4 t4Var, l1 l1Var, o0 o0Var) {
        i0 i0Var;
        float f10 = t4Var.f2764c * 0.93f;
        float f11 = t4Var.f2767g;
        float f12 = t4Var.f2768h;
        long floatToRawIntBits = (Float.floatToRawIntBits(f11) << 32) | (Float.floatToRawIntBits(f12) & 4294967295L);
        i0 p02 = dVar.p0();
        long r8 = p02.r();
        p02.j().l();
        try {
            ((ic.c) p02.f18636v).A(0.56f, 1.0f, floatToRawIntBits);
            long c10 = r.c(r.f19513b, 0.16f);
            float intBitsToFloat = (0.03f * f10) + Float.intBitsToFloat((int) (floatToRawIntBits >> 32));
            int i = (int) (floatToRawIntBits & 4294967295L);
            float intBitsToFloat2 = (0.035f * f10) + Float.intBitsToFloat(i);
            d.D(dVar, c10, f10, (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32), null, 120);
            d.y0(dVar, w.k(qe.h(new r(r.f19515d), new r(f2880c), new r(l0.d(4293912277L))), Float.intBitsToFloat(i) - f10, Float.intBitsToFloat(i) + f10, 8), f10, floatToRawIntBits, 0.0f, null, 120);
            d.D(dVar, e, f10, floatToRawIntBits, new h(dVar.l0((float) 0.7d), 0.0f, 0, 0, null, 30), FacebookMediationAdapter.ERROR_FACEBOOK_INITIALIZATION);
            long j10 = f2882f;
            try {
                d.D(dVar, r.c(j10, 0.4f), f10 * 0.9f, floatToRawIntBits, new h(dVar.l0((float) 0.45d), 0.0f, 0, 0, null, 30), FacebookMediationAdapter.ERROR_FACEBOOK_INITIALIZATION);
                long j11 = f2881d;
                d.D(dVar, r.c(j11, 0.22f), 0.85f * f10, floatToRawIntBits, new h(dVar.l0((float) 0.35d), 0.0f, 0, 0, null, 30), FacebookMediationAdapter.ERROR_FACEBOOK_INITIALIZATION);
                float f13 = f10 * 0.84f;
                float f14 = t4Var.f2766f * 1.06f;
                u uVar = i.f23349y;
                long d2 = ae.d(7.0d);
                s sVar = s.B;
                c(dVar, o0Var, floatToRawIntBits, f13, -f13, -f14, qe.h(new g3("Scraply", new q0(j11, d2, sVar, new o(1), uVar, ae.c(0.02d), 0, 0L, null, 16777040), new o(ae.d(4.8d)), false), new g3("JAPANESE WASHI TAPE", new q0(j10, ae.d(3.0d), sVar, null, null, ae.c(0.16d), 0, 0L, null, 16777080), new o(ae.d(2.4d)), false)));
                c(dVar, o0Var, floatToRawIntBits, f13, f14, f13, qe.h(new g3(l1Var.f2344a, new q0(j11, ae.d(7.2d), s.D, null, null, ae.c(0.04d), 0, 0L, null, 16777080), new o(ae.d(4.4d)), false), new g3(l1Var.f2345b, new q0(r.c(j11, 0.9f), ae.d(3.8d), sVar, null, null, ae.c(0.04d), 0, 0L, null, 16777080), new o(ae.d(3.0d)), true), new g3("ACID FREE • " + l1Var.f2346c, new q0(r.c(j10, 0.7f), ae.d(3.0d), s.A, null, null, ae.c(0.1d), 0, 0L, null, 16777080), new o(ae.d(2.4d)), false)));
                a.v(p02, r8);
            } catch (Throwable th) {
                th = th;
                i0Var = p02;
                a.v(i0Var, r8);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            i0Var = p02;
        }
    }

    public static final void e(d dVar, w7.l9 l9Var, t4 t4Var, f fVar, float f10, l1 l1Var, o0 o0Var, float f11) {
        long j10;
        i0 i0Var;
        int i;
        long j11;
        i0 i0Var2;
        long j12;
        float f12;
        int i10;
        long j13;
        i0 i0Var3;
        i0 i0Var4;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        Iterator it;
        int i11;
        float f19;
        long j14;
        float f20;
        float f21;
        int i12;
        float f22;
        Float f23;
        float f24;
        Float f25;
        float f26;
        long j15;
        int i13;
        Float f27;
        float f28;
        float f29;
        Float f30;
        int i14;
        t4 t4Var2 = t4Var;
        Float valueOf = Float.valueOf(0.38f);
        float f31 = t4Var2.f2780u;
        float f32 = t4Var2.f2765d;
        float f33 = t4Var2.f2779t;
        float f34 = t4Var2.f2777r;
        float f35 = t4Var2.f2766f;
        Float valueOf2 = Float.valueOf(0.0f);
        Float valueOf3 = Float.valueOf(1.0f);
        long e8 = l0.e(l9Var.c() / 255.0f, l9Var.b() / 255.0f, l9Var.a() / 255.0f, null, 24);
        int i15 = r.f19522m;
        List h3 = qe.h(r.a(r.c(x.d(), 0.34f)), r.a(x.f()));
        float f36 = t4Var2.f2769j;
        Float f37 = valueOf;
        j0 j0Var = new j0(h3, null, (Float.floatToRawIntBits(f36) << 32) | (Float.floatToRawIntBits((t4Var2.k() * 0.08f) + t4Var2.a()) & 4294967295L), t4Var2.j() * 1.3f, 0);
        float f38 = t4Var2.f() - (t4Var2.j() * 0.45f);
        float j16 = t4Var2.j() * 1.9f;
        float f39 = f32;
        long floatToRawIntBits = (Float.floatToRawIntBits(t4Var2.k() * 0.42f) & 4294967295L) | (Float.floatToRawIntBits(j16) << 32);
        float f40 = f36;
        Float f41 = valueOf2;
        Float f42 = valueOf3;
        d.C(dVar, j0Var, (Float.floatToRawIntBits(t4Var2.a() - (t4Var2.k() * 0.1f)) & 4294967295L) | (Float.floatToRawIntBits(f38) << 32), floatToRawIntBits, null, 120);
        long g8 = g(e8, x.d(), 0.42f);
        float g10 = t4Var2.g() - t4Var2.l();
        float f43 = 0.42f;
        d.d0(dVar, g8, (Float.floatToRawIntBits(t4Var2.d()) & 4294967295L) | (Float.floatToRawIntBits(g10) << 32), (Float.floatToRawIntBits(t4Var2.l() * 2.0f) << 32) | (Float.floatToRawIntBits(t4Var2.k() * 2.0f) & 4294967295L), null, 120);
        h a10 = k.a();
        Path path = a10.f19481a;
        a10.h(t4Var2.f(), t4Var2.d());
        a10.g(t4Var2.g(), t4Var2.d());
        float g11 = t4Var2.g() - t4Var2.l();
        float d2 = t4Var2.d();
        float l10 = t4Var2.l() + t4Var2.g();
        float a11 = t4Var2.a();
        if (a10.f19482b == null) {
            a10.f19482b = new RectF();
        }
        RectF rectF = a10.f19482b;
        rectF.getClass();
        rectF.set(g11, d2, l10, a11);
        RectF rectF2 = a10.f19482b;
        rectF2.getClass();
        path.arcTo(rectF2, -90.0f, 180.0f, false);
        a10.g(t4Var2.f(), t4Var2.a());
        float f44 = t4Var2.f() - t4Var2.l();
        float d10 = t4Var2.d();
        float l11 = t4Var2.l() + t4Var2.f();
        float a12 = t4Var2.a();
        if (a10.f19482b == null) {
            a10.f19482b = new RectF();
        }
        RectF rectF3 = a10.f19482b;
        rectF3.getClass();
        rectF3.set(f44, d10, l11, a12);
        RectF rectF4 = a10.f19482b;
        rectF4.getClass();
        path.arcTo(rectF4, 90.0f, 180.0f, false);
        a10.d();
        i0 p02 = dVar.p0();
        long r8 = p02.r();
        p02.j().l();
        try {
            i = 1;
            p02.s().d(a10, 1);
            j10 = r8;
            j11 = e8;
        } catch (Throwable th) {
            th = th;
            j10 = r8;
        }
        try {
            d.o0(dVar, a10, j11, null, 60);
            float d11 = t4Var2.d();
            int i16 = 0;
            while (i16 < 64 && fVar != null) {
                int i17 = i16 + 1;
                Float f45 = f41;
                i0Var2 = p02;
                double d12 = 64;
                try {
                    float k3 = (t4Var2.k() * ((float) Math.sin(((i17 * 3.141592653589793d) / d12) - 1.5707963267948966d))) + t4Var2.h();
                    int b10 = ff.a.b(d11);
                    if (ff.a.b(k3) > b10) {
                        float l12 = t4Var2.l() * ((float) Math.cos((((i16 + 0.5d) * 3.141592653589793d) / d12) - 1.5707963267948966d));
                        float f46 = 64;
                        long j17 = j11;
                        long j18 = (0 << 32) | (((int) (((i16 * t4Var2.f2781v) / f46) + 14.0f)) & 4294967295L);
                        long c10 = (fVar.c() << 32) | ((wa.b9.b((int) (((r5 * i17) / f46) + 14.0f), r2 + 1) - r2) & 4294967295L);
                        long b11 = (ff.a.b(t4Var2.f() + l12) << 32) | (b10 & 4294967295L);
                        long b12 = (ff.a.b(t4Var2.j()) << 32) | ((r9 - b10) & 4294967295L);
                        j12 = j10;
                        f28 = f33;
                        i13 = i17;
                        f27 = f42;
                        f29 = f43;
                        f30 = f37;
                        j15 = j17;
                        i14 = 1;
                        try {
                            d.I0(dVar, fVar, j18, c10, b11, b12, f10, null, 3, 448);
                        } catch (Throwable th2) {
                            th = th2;
                            i0Var = i0Var2;
                            j10 = j12;
                            a.v(i0Var, j10);
                            throw th;
                        }
                    } else {
                        j15 = j11;
                        i13 = i17;
                        f27 = f42;
                        j12 = j10;
                        f28 = f33;
                        f29 = f43;
                        f30 = f37;
                        i14 = 1;
                    }
                    f41 = f45;
                    f33 = f28;
                    f43 = f29;
                    i = i14;
                    p02 = i0Var2;
                    d11 = k3;
                    i16 = i13;
                    f37 = f30;
                    f42 = f27;
                    j11 = j15;
                    j10 = j12;
                    t4Var2 = t4Var;
                } catch (Throwable th3) {
                    th = th3;
                    i0Var = i0Var2;
                    a.v(i0Var, j10);
                    throw th;
                }
            }
            long j19 = j11;
            i0Var2 = p02;
            int i18 = i;
            Float f47 = f41;
            Float f48 = f42;
            j12 = j10;
            float f49 = f33;
            float f50 = f43;
            Float f51 = f37;
            pe.j[] jVarArr = f2879b;
            d.q(dVar, w.l((pe.j[]) Arrays.copyOf(jVarArr, jVarArr.length), t4Var.d(), t4Var.a(), 8), (Float.floatToRawIntBits(t4Var.f() - t4Var.l()) << 32) | (Float.floatToRawIntBits(t4Var.d()) & 4294967295L), (Float.floatToRawIntBits((t4Var.l() * 2.0f) + t4Var.j()) << 32) | (Float.floatToRawIntBits(t4Var.k() * 2.0f) & 4294967295L), 0.0f, null, 0, 120);
            i0Var2.j().s();
            i0Var2.I(j12);
            float f52 = t4Var.f() - t4Var.l();
            float d13 = t4Var.d();
            float l13 = t4Var.l() + t4Var.f();
            float a13 = t4Var.a();
            int i19 = r.f19522m;
            long j20 = j19;
            float f53 = l13 - f52;
            float f54 = a13 - d13;
            d dVar2 = dVar;
            d.C(dVar2, w.b(qe.h(r.a(g(j20, x.g(), 0.68f)), r.a(g(j20, x.g(), f50))), f52, l13, 8), (Float.floatToRawIntBits(f52) << 32) | (Float.floatToRawIntBits(d13) & 4294967295L), (Float.floatToRawIntBits(f53) << 32) | (Float.floatToRawIntBits(f54) & 4294967295L), null, 120);
            int i20 = i18;
            while (i20 < 3) {
                float k4 = ((i20 / 3.0f) * (t4Var.k() - f35)) + f35;
                int i21 = r.f19522m;
                float f55 = 0.56f * k4;
                d.d0(dVar2, r.c(x.d(), 0.06f), (Float.floatToRawIntBits(t4Var.f() - f55) << 32) | (Float.floatToRawIntBits(t4Var.h() - k4) & 4294967295L), (Float.floatToRawIntBits(k4 * 2.0f) & 4294967295L) | (Float.floatToRawIntBits(f55 * 2.0f) << 32), new h(dVar2.l0((float) 0.7d), 0.0f, 0, 0, null, 30), FacebookMediationAdapter.ERROR_FACEBOOK_INITIALIZATION);
                i20++;
                d13 = d13;
            }
            int i22 = r.f19522m;
            d.d0(dVar2, r.c(x.d(), 0.26f), (Float.floatToRawIntBits(f52) << 32) | (Float.floatToRawIntBits(d13) & 4294967295L), (Float.floatToRawIntBits(f53) << 32) | (Float.floatToRawIntBits(f54) & 4294967295L), new h(dVar2.l0((float) 0.8d), 0.0f, 0, 0, null, 30), FacebookMediationAdapter.ERROR_FACEBOOK_INITIALIZATION);
            if (t4Var.e() > t4Var.j() * 0.4f) {
                float n10 = t4Var.n() + f40;
                float o10 = t4Var.o() - f34;
                float p10 = t4Var.p() + f34;
                float f56 = o10 + p10;
                h a14 = k.a();
                int i23 = 0;
                while (true) {
                    f12 = f50;
                    f19 = 12;
                    float f57 = i23 / f19;
                    j14 = j20;
                    h(a14, a.c(f49, f57, f57, n10) - ((((f31 * f57) + 1.0f) * f39) * 0.5f), (f57 * p10) + o10, i23);
                    if (i23 == 12) {
                        break;
                    }
                    i23++;
                    f50 = f12;
                    j20 = j14;
                }
                for (i11 = 12; -1 < i11; i11--) {
                    float f58 = i11 / f19;
                    a14.g((((f31 * f58) + 1.0f) * f39 * 0.5f) + a.c(f49, f58, f58, n10), (f58 * p10) + o10);
                }
                a14.d();
                float d14 = wa.b9.d(1.0f - ((t4Var.i() * 1.8f) / p10), 0.05f, 0.98f);
                float l0 = dVar2.l0(3);
                float l02 = dVar2.l0(2);
                dVar2.p0().s().D(l0, l02);
                try {
                    int i24 = r.f19522m;
                    float f59 = 0.5f;
                    float f60 = n10;
                    try {
                        Float f61 = f48;
                        Float f62 = f47;
                        float f63 = f56;
                        float f64 = o10;
                        d.g0(dVar2, a14, w.l(new pe.j[]{pe.a.f(f47, r.a(x.f())), pe.a.f(Float.valueOf(wa.b9.d((t4Var.j() * 0.55f) / p10, 0.02f, 0.5f)), r.a(r.c(x.d(), 0.32f))), pe.a.f(Float.valueOf(d14), r.a(r.c(x.d(), 0.32f))), pe.a.f(f61, r.a(x.f()))}, o10, f56, 8), 0.0f, null, 60);
                        dVar.p0().s().D(-l0, -l02);
                        d.g0(dVar, a14, w.l(new pe.j[]{pe.a.f(f62, r.a(j14)), pe.a.f(Float.valueOf(d14), r.a(j14)), pe.a.f(f61, r.a(x.f()))}, f64, f63, 8), 0.0f, null, 60);
                        float f65 = f64;
                        int i25 = 0;
                        while (i25 < 120 && fVar != null) {
                            float f66 = 120;
                            float f67 = (i25 * p10) / f66;
                            int i26 = i25 + 1;
                            float f68 = (((i26 * p10) / f66) - f67) + f65;
                            int b13 = ff.a.b(f65);
                            if (ff.a.b(f68) > b13) {
                                float f69 = f67 / p10;
                                float f70 = f39;
                                float f71 = f60;
                                int b14 = ff.a.b(a.c(f49, f69, f69, f71) - (a.y(f31, f69, 1.0f, f70) * f59));
                                f21 = f49;
                                long b15 = (ff.a.b(r22) << 32) | ((r3 - b13) & 4294967295L);
                                f39 = f70;
                                f24 = f63;
                                i12 = i26;
                                f26 = f71;
                                f22 = f64;
                                f23 = f62;
                                f25 = f61;
                                d.I0(dVar, fVar, (0 << 32) | (wa.b9.e((int) (((t4Var.m() + 14.0f) - f34) + f67), 0, fVar.b() - 1) & 4294967295L), (fVar.c() << 32) | ((wa.b9.e((int) (r42 + r5), r4 + 1, fVar.b()) - r4) & 4294967295L), (b14 << 32) | (b13 & 4294967295L), b15, f10, null, 3, 448);
                            } else {
                                f21 = f49;
                                i12 = i26;
                                f22 = f64;
                                f23 = f62;
                                f24 = f63;
                                f25 = f61;
                                f26 = f60;
                            }
                            f61 = f25;
                            f62 = f23;
                            f60 = f26;
                            i25 = i12;
                            f49 = f21;
                            f65 = f68;
                            f64 = f22;
                            f63 = f24;
                            f59 = 0.5f;
                        }
                        int i27 = r.f19522m;
                        i10 = 8;
                        dVar2 = dVar;
                        d.g0(dVar2, a14, w.l(new pe.j[]{pe.a.f(f62, r.a(r.c(x.g(), 0.1f))), pe.a.f(Float.valueOf(wa.b9.d((t4Var.j() * 0.9f) / p10, 0.05f, 0.6f)), r.a(x.f())), pe.a.f(f61, r.a(x.f()))}, f64, f63, 8), 0.0f, null, 60);
                    } catch (Throwable th4) {
                        th = th4;
                        f20 = l02;
                        dVar2.p0().s().D(-l0, -f20);
                        throw th;
                    }
                } catch (Throwable th5) {
                    th = th5;
                    f20 = l02;
                }
            } else {
                f12 = f50;
                i10 = 8;
            }
            d(dVar2, t4Var, l1Var, o0Var);
            float f72 = f35 * 0.56f;
            float f73 = f35 - (f35 * 0.2f);
            float f74 = f73 * 0.56f;
            h a15 = k.a();
            float f75 = t4Var.f() - f74;
            float h10 = t4Var.h() - f73;
            float f76 = t4Var.f() + f74;
            float h11 = t4Var.h() + f73;
            if (a15.f19482b == null) {
                a15.f19482b = new RectF();
            }
            RectF rectF5 = a15.f19482b;
            rectF5.getClass();
            rectF5.set(f75, h10, f76, h11);
            Path path2 = a15.f19481a;
            RectF rectF6 = a15.f19482b;
            rectF6.getClass();
            h0 h0Var = h0.f19485u;
            path2.addOval(rectF6, k.b(h0Var));
            i0 p03 = dVar2.p0();
            long r10 = p03.r();
            p03.j().l();
            try {
                p03.s().d(a15, i18);
                try {
                    d.q(dVar2, w.b(qe.h(r.a(l0.d(4284103448L)), r.a(l0.d(4288575303L)), r.a(l0.d(4290680419L))), t4Var.f() - f74, t4Var.g() + f74, i10), 0L, 0L, 0.0f, null, 0, 126);
                    int i28 = r.f19522m;
                    d dVar3 = dVar;
                    d.q(dVar3, w.k(qe.h(r.a(r.c(x.d(), 0.82f)), r.a(r.c(x.d(), 0.2f)), r.a(x.f()), r.a(r.c(x.d(), 0.35f))), t4Var.h() - f73, t4Var.h() + f73, i10), 0L, 0L, 0.0f, null, 0, 126);
                    float g12 = ((t4Var.g() - t4Var.f()) + (f74 * 2.0f)) * 0.3f;
                    int i29 = -1;
                    while (i29 < 5) {
                        try {
                            float f77 = (i29 * g12) + (t4Var.f() - f74);
                            long c11 = r.c(l0.d(4282525706L), 0.45f);
                            long floatToRawIntBits2 = (Float.floatToRawIntBits(t4Var.h() - f73) & 4294967295L) | (Float.floatToRawIntBits(f77) << 32);
                            float h12 = t4Var.h() + f73;
                            long floatToRawIntBits3 = Float.floatToRawIntBits((g12 * 0.9f) + f77);
                            int i30 = i29;
                            i0Var4 = p03;
                            try {
                                d.n0(dVar3, c11, floatToRawIntBits2, (Float.floatToRawIntBits(h12) & 4294967295L) | (floatToRawIntBits3 << 32), dVar3.l0((float) 0.65d), 0, null, 496);
                                i29 = i30 + 1;
                                dVar3 = dVar;
                                p03 = i0Var4;
                            } catch (Throwable th6) {
                                th = th6;
                                i0Var3 = i0Var4;
                                j13 = r10;
                                a.v(i0Var3, j13);
                                throw th;
                            }
                        } catch (Throwable th7) {
                            th = th7;
                            i0Var4 = p03;
                            i0Var3 = i0Var4;
                            j13 = r10;
                            a.v(i0Var3, j13);
                            throw th;
                        }
                    }
                    i0Var4 = p03;
                    float f78 = f73 * 2.0f;
                    d.d0(dVar, kb.f2334a, (Float.floatToRawIntBits(t4Var.g() - f74) << 32) | (Float.floatToRawIntBits(t4Var.h() - f73) & 4294967295L), (Float.floatToRawIntBits(r26) << 32) | (Float.floatToRawIntBits(f78) & 4294967295L), null, 120);
                    int i31 = r.f19522m;
                    d.C(dVar, w.k(qe.h(r.a(r.c(x.d(), 0.65f)), r.a(x.f())), t4Var.h() - f73, (f73 * 0.35f) + t4Var.h(), i10), (Float.floatToRawIntBits(t4Var.g() - f74) << 32) | (Float.floatToRawIntBits(t4Var.h() - f73) & 4294967295L), (Float.floatToRawIntBits(r26) << 32) | (Float.floatToRawIntBits(f78) & 4294967295L), null, 120);
                    long c12 = r.c(l0.d(4281868811L), 0.5f);
                    float g13 = t4Var.g() - f74;
                    d.d0(dVar, c12, (Float.floatToRawIntBits(t4Var.h() - f73) & 4294967295L) | (Float.floatToRawIntBits(g13) << 32), (Float.floatToRawIntBits(r26) << 32) | (Float.floatToRawIntBits(f78) & 4294967295L), new h(dVar.l0((float) 0.5d), 0.0f, 0, 0, null, 30), FacebookMediationAdapter.ERROR_FACEBOOK_INITIALIZATION);
                    i0Var4.j().s();
                    i0Var4.I(r10);
                    h a16 = k.a();
                    float f79 = t4Var.f() - f72;
                    float h13 = t4Var.h() - f35;
                    float f80 = t4Var.f() + f72;
                    float h14 = t4Var.h() + f35;
                    if (a16.f19482b == null) {
                        a16.f19482b = new RectF();
                    }
                    RectF rectF7 = a16.f19482b;
                    rectF7.getClass();
                    rectF7.set(f79, h13, f80, h14);
                    Path path3 = a16.f19481a;
                    RectF rectF8 = a16.f19482b;
                    rectF8.getClass();
                    path3.addOval(rectF8, k.b(h0Var));
                    float f81 = t4Var.f() - f74;
                    float h15 = t4Var.h() - f73;
                    float f82 = t4Var.f() + f74;
                    float h16 = t4Var.h() + f73;
                    if (a16.f19482b == null) {
                        a16.f19482b = new RectF();
                    }
                    RectF rectF9 = a16.f19482b;
                    rectF9.getClass();
                    rectF9.set(f81, h15, f82, h16);
                    Path path4 = a16.f19481a;
                    RectF rectF10 = a16.f19482b;
                    rectF10.getClass();
                    path4.addOval(rectF10, k.b(h0Var));
                    a16.l(1);
                    d.g0(dVar, a16, w.k(qe.h(r.a(l0.d(4292392584L)), r.a(l0.d(4291075692L)), r.a(l0.d(4289101647L))), t4Var.h() - f35, t4Var.h() + f35, i10), 0.0f, null, 60);
                    long c13 = r.c(l0.d(4286404912L), 0.38f);
                    float f83 = t4Var.f() - (0.56f * ((f35 + f73) * 0.5f));
                    d.d0(dVar, c13, (Float.floatToRawIntBits(t4Var.h() - r2) & 4294967295L) | (Float.floatToRawIntBits(f83) << 32), (Float.floatToRawIntBits(r24 * 2.0f) << 32) | (Float.floatToRawIntBits(r2 * 2.0f) & 4294967295L), new h(dVar.l0((float) 0.4d), 0.0f, 0, 0, null, 30), FacebookMediationAdapter.ERROR_FACEBOOK_INITIALIZATION);
                    long c14 = r.c(l0.d(4284366620L), 0.55f);
                    float f84 = t4Var.f() - f72;
                    d.d0(dVar, c14, (Float.floatToRawIntBits(t4Var.h() - f35) & 4294967295L) | (Float.floatToRawIntBits(f84) << 32), (Float.floatToRawIntBits(f72 * 2.0f) << 32) | (Float.floatToRawIntBits(f35 * 2.0f) & 4294967295L), new h(dVar.l0((float) 0.6d), 0.0f, 0, 0, null, 30), FacebookMediationAdapter.ERROR_FACEBOOK_INITIALIZATION);
                    long c15 = r.c(l0.d(4283052051L), 0.65f);
                    float f85 = t4Var.f() - f74;
                    d.d0(dVar, c15, (Float.floatToRawIntBits(t4Var.h() - f73) & 4294967295L) | (Float.floatToRawIntBits(f85) << 32), (Float.floatToRawIntBits(r26) << 32) | (Float.floatToRawIntBits(f78) & 4294967295L), new h(dVar.l0((float) 0.55d), 0.0f, 0, 0, null, 30), FacebookMediationAdapter.ERROR_FACEBOOK_INITIALIZATION);
                    if (0.01f > f11 || f11 > 0.99f) {
                        return;
                    }
                    float d15 = wa.b9.d(1.0f - f11, 0.0f, 1.0f);
                    float c16 = t4Var.c();
                    float b16 = t4Var.b();
                    float h17 = t4Var.h();
                    float min = Math.min(c16, b16);
                    if (f11 < 0.45f) {
                        float d16 = wa.b9.d(((0.45f - f11) / 0.45f) * 0.32f, 0.0f, 0.32f);
                        float y10 = a.y(f11, 0.65f, 0.22f, min);
                        f14 = 0.22f;
                        f13 = min;
                        d.y0(dVar, w.i(qe.h(r.a(r.c(l0.d(4294959234L), d16)), r.a(r.c(l0.d(4294956367L), d16 * 0.4f)), r.a(x.f())), (Float.floatToRawIntBits(h17) & 4294967295L) | (Float.floatToRawIntBits(f40) << 32), y10), y10, (Float.floatToRawIntBits(f40) << 32) | (Float.floatToRawIntBits(h17) & 4294967295L), 0.0f, null, 120);
                    } else {
                        f13 = min;
                        f14 = 0.22f;
                    }
                    Iterator it2 = qe.h(new pe.o(Float.valueOf(-0.35f), Float.valueOf(-0.38f), r.a(l0.d(4294956800L))), new pe.o(f51, Float.valueOf(-0.35f), r.a(l0.d(4285458359L))), new pe.o(Float.valueOf(-0.42f), Float.valueOf(0.08f), r.a(l0.d(4292728574L))), new pe.o(Float.valueOf(0.4f), Float.valueOf(0.12f), r.a(l0.d(4294961831L))), new pe.o(Float.valueOf(-0.2f), Float.valueOf(-0.58f), r.a(l0.d(4294966250L))), new pe.o(Float.valueOf(f14), Float.valueOf(-0.55f), r.a(l0.d(4294956800L))), new pe.o(Float.valueOf(-0.15f), f51, r.a(l0.d(4291081725L))), new pe.o(Float.valueOf(0.28f), Float.valueOf(0.36f), r.a(l0.d(4289197008L))), new pe.o(Float.valueOf(-0.45f), Float.valueOf(-0.15f), r.a(l0.d(4294956367L))), new pe.o(Float.valueOf(0.44f), Float.valueOf(-0.12f), r.a(l0.d(4288280292L)))).iterator();
                    int i32 = 0;
                    while (it2.hasNext()) {
                        Object next = it2.next();
                        int i33 = i32 + 1;
                        if (i32 >= 0) {
                            pe.o oVar = (pe.o) next;
                            float floatValue = ((Number) oVar.f22703u).floatValue();
                            float floatValue2 = ((Number) oVar.f22704v).floatValue();
                            long j21 = ((r) oVar.f22705w).f19523a;
                            float f86 = f11 * f13;
                            float f87 = f86 * f12;
                            float f88 = f40;
                            float f89 = f12;
                            float c17 = (floatValue * f87) + a.c(floatValue, c16, f89, f88);
                            float c18 = ((floatValue2 * f87) + a.c(floatValue2, b16, f89, h17)) - (f86 * 0.2f);
                            float a17 = wa.a((1.0f - (f11 * 0.45f)) * (i32 % 2 == 0 ? 1.25f : 0.9f), 0.0f);
                            int i34 = i32 % 3;
                            if (i34 == 0) {
                                float f90 = 0.082f * f13 * a17;
                                h a18 = k.a();
                                float f91 = c18 - f90;
                                a18.h(c17, f91);
                                a18.j(c17, c18, c17 + f90, c18);
                                a18.j(c17, c18, c17, c18 + f90);
                                a18.j(c17, c18, c17 - f90, c18);
                                a18.j(c17, c18, c17, f91);
                                a18.d();
                                d.o0(dVar, a18, r.c(j21, d15), null, 60);
                                f15 = h17;
                                f16 = c16;
                                f17 = b16;
                                f18 = f89;
                                it = it2;
                            } else if (i34 == 1) {
                                float f92 = 0.054f * f13 * a17;
                                float f93 = f92 * 1.8f;
                                float a19 = wa.a(0.012f * f13, 1.2f);
                                it = it2;
                                d.D(dVar, r.c(j21, d15), f92, (Float.floatToRawIntBits(c17) << 32) | (Float.floatToRawIntBits(c18) & 4294967295L), null, 120);
                                int i35 = r.f19522m;
                                f15 = h17;
                                f18 = 0.42f;
                                f17 = b16;
                                f16 = c16;
                                d.n0(dVar, r.c(x.g(), d15), (Float.floatToRawIntBits(c17 - f93) << 32) | (Float.floatToRawIntBits(c18) & 4294967295L), (Float.floatToRawIntBits(c17 + f93) << 32) | (Float.floatToRawIntBits(c18) & 4294967295L), a19, 0, null, 496);
                                d.n0(dVar, r.c(x.g(), d15), (Float.floatToRawIntBits(c17) << 32) | (Float.floatToRawIntBits(c18 - f93) & 4294967295L), (Float.floatToRawIntBits(c17) << 32) | (Float.floatToRawIntBits(c18 + f93) & 4294967295L), a19, 0, null, 496);
                            } else {
                                f15 = h17;
                                f16 = c16;
                                f17 = b16;
                                f18 = f89;
                                it = it2;
                                d.D(dVar, r.c(j21, d15), 0.038f * f13 * a17, (Float.floatToRawIntBits(c17) << 32) | (Float.floatToRawIntBits(c18) & 4294967295L), null, 120);
                            }
                            it2 = it;
                            c16 = f16;
                            i32 = i33;
                            f40 = f88;
                            b16 = f17;
                            f12 = f18;
                            h17 = f15;
                        } else {
                            qe.m.l();
                            throw null;
                        }
                    }
                } catch (Throwable th8) {
                    th = th8;
                    i0Var3 = p03;
                }
            } catch (Throwable th9) {
                th = th9;
                j13 = r10;
                i0Var3 = p03;
            }
        } catch (Throwable th10) {
            th = th10;
            i0Var = p02;
            a.v(i0Var, j10);
            throw th;
        }
    }

    public static final String f(w7.l9 l9Var, t4 t4Var) {
        int e8 = wa.b9.e((int) Math.ceil(t4Var.f2774o + 14.0f + t4Var.f2776q), 16, 4096);
        int e10 = wa.b9.e((int) t4Var.f2765d, 4, 1024);
        int i = l9Var.f28653a;
        int i10 = l9Var.f28654b;
        int i11 = l9Var.f28655c;
        w7.k9 k9Var = l9Var.f28656d;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(i);
        sb2.append(",");
        sb2.append(i10);
        sb2.append(",");
        sb2.append(i11);
        sb2.append(",");
        sb2.append(k9Var);
        sb2.append(",");
        sb2.append(e8);
        return a.f(e10, ",", sb2);
    }

    public static final long g(long j10, long j11, float f10) {
        return l0.e(((r.h(j11) - r.h(j10)) * f10) + r.h(j10), ((r.g(j11) - r.g(j10)) * f10) + r.g(j10), ((r.e(j11) - r.e(j10)) * f10) + r.e(j10), null, 16);
    }

    public static final void h(h hVar, float f10, float f11, int i) {
        if (i == 0) {
            hVar.h(f10, f11);
        } else {
            hVar.g(f10, f11);
        }
    }
}
