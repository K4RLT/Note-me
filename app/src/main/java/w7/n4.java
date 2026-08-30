package w7;
import a.a;
import a1.c;
import b2.b0;
import b2.f;
import b2.g;
import b2.h;
import ba.j;
import c.d;
import c.i;
import c.k;
import c.m;
import d1.o;
import d1.r;
import eb.w;
import eb.z1;
import j.b;
import k1.c0;
import k1.k0;
import k1.l0;
import k1.n;
import k1.p;
import k1.r0;
import lb.r1;
import m2.f0;
import o0.h1;
import o0.x1;
import o0.y;
import p.p0;
import p7.e;
import p7.o0;
import p7.q0;
import p7.x0;
import p7.y0;
import q2.s;
import r0.a1;
import r0.e1;
import r0.g1;
import r0.i1;
import r0.l;
import r0.n2;
import r0.o2;
import r0.q1;
import r0.v0;
import v1.d0;
import v1.g0;
import v1.t;
import w7.a5;
import w7.b5;
import w7.c3;
import w7.d5;
import w7.e3;
import w7.f5;
import w7.h0;
import w7.i5;
import w7.j5;
import w7.n4;
import w7.r2;
import w7.u2;
import w7.v2;
import w7.z0;
import x.q;
import z1.x;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import android.util.LruCache;
import android.view.View;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.daren.scraply.R;
import com.daren.scraply.ui.canvas.CameraKeepAliveService;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Executor;
import ya.ae;
import ya.we;

/* loaded from: classes.dex */
public abstract class n4 {
    public static final c A;
    public static final c B;
    public static volatile b C;
    public static volatile long D;
    public static volatile e3 E;

    /* renamed from: a, reason: collision with root package name */
    public static final c f28764a = new c(883237738, new uf.u(2), false);

    /* renamed from: b, reason: collision with root package name */
    public static final c f28765b = new c(2110567873, new uf.u(3), false);

    /* renamed from: c, reason: collision with root package name */
    public static final c f28766c = new c(-1690145078, new uf.u(4), false);

    /* renamed from: d, reason: collision with root package name */
    public static final c f28767d;
    public static final c e;

    /* renamed from: f, reason: collision with root package name */
    public static final c f28768f;

    /* renamed from: g, reason: collision with root package name */
    public static final c f28769g;

    /* renamed from: h, reason: collision with root package name */
    public static final c f28770h;
    public static final c i;

    /* renamed from: j, reason: collision with root package name */
    public static final c f28771j;

    /* renamed from: k, reason: collision with root package name */
    public static final c f28772k;

    /* renamed from: l, reason: collision with root package name */
    public static final c f28773l;

    /* renamed from: m, reason: collision with root package name */
    public static final c f28774m;

    /* renamed from: n, reason: collision with root package name */
    public static final c f28775n;

    /* renamed from: o, reason: collision with root package name */
    public static final c f28776o;

    /* renamed from: p, reason: collision with root package name */
    public static final c f28777p;

    /* renamed from: q, reason: collision with root package name */
    public static final c f28778q;

    /* renamed from: r, reason: collision with root package name */
    public static final c f28779r;

    /* renamed from: s, reason: collision with root package name */
    public static final c f28780s;

    /* renamed from: t, reason: collision with root package name */
    public static final c f28781t;

    /* renamed from: u, reason: collision with root package name */
    public static final c f28782u;

    /* renamed from: v, reason: collision with root package name */
    public static final c f28783v;

    /* renamed from: w, reason: collision with root package name */
    public static final c f28784w;

    /* renamed from: x, reason: collision with root package name */
    public static final c f28785x;

    /* renamed from: y, reason: collision with root package name */
    public static final c f28786y;

    /* renamed from: z, reason: collision with root package name */
    public static final c f28787z;

    static {
        new c(873076901, new uf.u(5), false);
        f28767d = new c(-1796240052, new uf.u(6), false);
        e = new c(-937530053, new uf.u(7), false);
        f28768f = new c(-2023243587, new uf.u(8), false);
        f28769g = new c(1728866942, new uf.u(9), false);
        f28770h = new c(1186010175, new uf.u(10), false);
        i = new c(-591032814, new Object(), false);
        f28771j = new c(1507630282, new b8.f1(1), false);
        f28772k = new c(-1620516688, new b8.f1(2), false);
        f28773l = new c(666634686, new uf.u(11), false);
        f28774m = new c(-1737037145, new uf.u(12), false);
        f28775n = new c(1131141986, new uf.u(13), false);
        f28776o = new c(988862145, new uf.u(14), false);
        f28777p = new c(-1879316986, new uf.u(15), false);
        f28778q = new c(1288663286, new uf.u(16), false);
        f28779r = new c(-326705363, new uf.u(17), false);
        f28780s = new c(-1288204260, new uf.u(18), false);
        f28781t = new c(665240709, new uf.u(19), false);
        f28782u = new c(1521890852, new uf.u(20), false);
        f28783v = new c(-801485343, new uf.u(21), false);
        f28784w = new c(250684682, new uf.u(22), false);
        f28785x = new c(138492515, new uf.u(23), false);
        f28786y = new c(1963984968, new uf.u(24), false);
        f28787z = new c(739174193, new uf.u(25), false);
        A = new c(-875419189, new uf.u(26), false);
        B = new c(-1916426301, new uf.u(27), false);
    }

    public static final boolean A(n2 n2Var) {
        return ((Boolean) n2Var.getValue()).booleanValue();
    }

    public static final void A0(String str, m mVar, int i10) {
        int i11;
        boolean z3;
        r rVar;
        r rVar2 = (r) mVar;
        rVar2.c0(-1627166546);
        if (rVar2.f(str)) {
            i11 = 4;
        } else {
            i11 = 2;
        }
        int i12 = i10 | i11;
        if ((i12 & 3) != 2) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (rVar2.R(i12 & 1, z3)) {
            rVar = rVar2;
            x1.b(str, androidx.compose.foundation.layout.a.o(androidx.compose.foundation.layout.d(o.f15687a, 1.0f), 16, 0.0f, 0.0f, 6, 6), r.c(r.f19515d, 0.6f), ae.e(11), null, s.f23368z, null, 0L, null, 0L, 0, false, 0, 0, null, rVar, (i12 & 14) | 200112, 0, 131024);
        } else {
            rVar = rVar2;
            rVar.U();
        }
        q1 t3 = rVar.t();
        if (t3 != null) {
            t3.f24332d = new b9(str, i10, 0);
        }
    }

    public static final pe.j B(List list, float f10, float f11, float f12, List list2) {
        float[] fArr;
        if (f11 > 0.0f) {
            fArr = new float[]{0.0f, -f11, f11};
        } else {
            fArr = new float[]{0.0f};
        }
        Iterator it = list.iterator();
        pe.j jVar = null;
        while (it.hasNext()) {
            float floatValue = ((Number) it.next()).floatValue();
            for (float f13 : fArr) {
                float abs = Math.abs((f10 + f13) - floatValue);
                if (abs < f12) {
                    jVar = new pe.j(Float.valueOf(floatValue - f13), Float.valueOf(floatValue));
                    f12 = abs;
                }
            }
        }
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            float floatValue2 = ((Number) it2.next()).floatValue();
            float abs2 = Math.abs(f10 - floatValue2);
            if (abs2 < f12) {
                jVar = new pe.j(Float.valueOf(floatValue2), Float.valueOf(floatValue2));
                f12 = abs2;
            }
        }
        return jVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void B0(df.a r22, boolean r23, boolean r24, df.p r25, m r26, int r27, int r28) {
        /*
            Method dump skipped, instructions count: 380
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w7.n4.B0(df.a, boolean, boolean, df.p, m, int, int):void");
    }

    public static final void C(a1 a1Var, boolean z3) {
        a1Var.setValue(Boolean.valueOf(z3));
    }

    /* JADX WARN: Code restructure failed: missing block: B:124:0x020d, code lost:
    
        if (r4 == true) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x0605, code lost:
    
        if (r10 == r4) goto L288;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:136:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x0448  */
    /* JADX WARN: Removed duplicated region for block: B:361:0x0473 A[LOOP:3: B:359:0x046d->B:361:0x0473, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:365:0x0489  */
    /* JADX WARN: Removed duplicated region for block: B:368:0x0495  */
    /* JADX WARN: Removed duplicated region for block: B:371:0x0520  */
    /* JADX WARN: Removed duplicated region for block: B:382:0x057c  */
    /* JADX WARN: Removed duplicated region for block: B:385:0x0587  */
    /* JADX WARN: Removed duplicated region for block: B:388:0x0498  */
    /* JADX WARN: Removed duplicated region for block: B:389:0x048c  */
    /* JADX WARN: Removed duplicated region for block: B:390:0x044b  */
    /* JADX WARN: Removed duplicated region for block: B:392:0x043c  */
    /* JADX WARN: Removed duplicated region for block: B:393:0x043f  */
    /* JADX WARN: Removed duplicated region for block: B:402:0x0b34  */
    /* JADX WARN: Removed duplicated region for block: B:403:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:404:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:406:0x023d  */
    /* JADX WARN: Type inference failed for: r0v102 */
    /* JADX WARN: Type inference failed for: r0v77 */
    /* JADX WARN: Type inference failed for: r0v78, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r10v18, types: [kotlin.jvm.internal.u, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v16, types: [java.lang.Object, kotlin.jvm.internal.y] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void C0(final p r50, final u7.m3 r51, final int r52, final int r53, final boolean r54, final x r55, final float r56, final float r57, final float r58, final a1 r59, final a1 r60, final a1 r61, final float r62, final df.l r63, final df.p r64, final df.l r65, df.l r66, df.l r67, df.a r68, final df.a r69, m r70, final int r71) {
        /*
            Method dump skipped, instructions count: 2952
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w7.n4.C0(p, u7.m3, int, int, boolean, x, float, float, float, a1, a1, a1, float, df.l, df.p, df.l, df.l, df.l, df.a, df.a, m, int):void");
    }

    public static final boolean D(e3 e3Var) {
        return e3Var.j();
    }

    public static final void D0(u4 u4Var, df.a aVar, df.l lVar, float f10, m mVar, int i10) {
        int i11;
        float f11;
        boolean z3;
        e1 e1Var;
        boolean z9;
        float f12;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        a1 a1Var;
        o oVar;
        r rVar;
        r rVar2;
        int i12;
        a1 a1Var2;
        float f13;
        u4 u4Var2;
        float f14;
        long j10;
        float f15;
        o oVar2;
        r b10;
        o oVar3;
        boolean z16;
        boolean z17;
        int i13;
        int i14;
        int i15;
        int i16;
        u4Var.getClass();
        r rVar3 = u4Var.f29212d;
        String str = u4Var.f29209a;
        aVar.getClass();
        lVar.getClass();
        r rVar4 = (r) mVar;
        rVar4.c0(244329514);
        if ((i10 & 6) == 0) {
            if (rVar4.f(u4Var)) {
                i16 = 4;
            } else {
                i16 = 2;
            }
            i11 = i16 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if (rVar4.h(aVar)) {
                i15 = 32;
            } else {
                i15 = 16;
            }
            i11 |= i15;
        }
        if ((i10 & 384) == 0) {
            if (rVar4.h(lVar)) {
                i14 = 256;
            } else {
                i14 = 128;
            }
            i11 |= i14;
        }
        if ((i10 & 3072) == 0) {
            f11 = f10;
            if (rVar4.c(f11)) {
                i13 = 2048;
            } else {
                i13 = 1024;
            }
            i11 |= i13;
        } else {
            f11 = f10;
        }
        if ((i11 & 1171) != 1170) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (rVar4.R(i11 & 1, z3)) {
            Object O = rVar4.O();
            v0 v0Var = l.f24285a;
            if (O == v0Var) {
                O = y.B(Boolean.FALSE);
                rVar4.k0(O);
            }
            a1 a1Var3 = (a1) O;
            Object O2 = rVar4.O();
            if (O2 == v0Var) {
                O2 = g(0.0f, rVar4);
            }
            e1 e1Var2 = (e1) O2;
            Object O3 = rVar4.O();
            if (O3 == v0Var) {
                O3 = y.B(Boolean.FALSE);
                rVar4.k0(O3);
            }
            a1 a1Var4 = (a1) O3;
            Object O4 = rVar4.O();
            if (O4 == v0Var) {
                e1Var = e1Var2;
                O4 = y.B(new b(0L));
                rVar4.k0(O4);
            } else {
                e1Var = e1Var2;
            }
            a1 a1Var5 = (a1) O4;
            if (((Boolean) a1Var3.getValue()).booleanValue() && !((Boolean) a1Var4.getValue()).booleanValue()) {
                z9 = true;
            } else {
                z9 = false;
            }
            float t12 = t1(z9, rVar4, 0, 6);
            if (((Boolean) a1Var3.getValue()).booleanValue() && !((Boolean) a1Var4.getValue()).booleanValue()) {
                f12 = 1.04f;
            } else {
                f12 = 1.0f;
            }
            float f16 = FacebookMediationAdapter.ERROR_FAILED_TO_PRESENT_AD;
            o oVar4 = o.f15687a;
            r l10 = androidx.compose.foundation.layout.d.l(oVar4, 88, f16);
            Object O5 = rVar4.O();
            if (O5 == v0Var) {
                O5 = new b8.a0(a1Var5, 18);
                rVar4.k0(O5);
            }
            r d2 = androidx.compose.ui.layout.a.d(l10, (df.l) O5);
            int i17 = i11 & 112;
            if (i17 == 32) {
                z10 = true;
            } else {
                z10 = false;
            }
            Object O6 = rVar4.O();
            if (z10 || O6 == v0Var) {
                O6 = new u7.q0(2, aVar);
                rVar4.k0(O6);
            }
            r b11 = d0.b(d2, str, (PointerInputEventHandler) O6);
            if ((i11 & 7168) == 2048) {
                z11 = true;
            } else {
                z11 = false;
            }
            int i18 = i11;
            if ((i11 & 896) == 256) {
                z12 = true;
            } else {
                z12 = false;
            }
            boolean z18 = z12 | z11;
            if (i17 == 32) {
                z13 = true;
            } else {
                z13 = false;
            }
            boolean z19 = z18 | z13;
            if ((i18 & 14) == 4) {
                z14 = true;
            } else {
                z14 = false;
            }
            boolean z20 = z19 | z14;
            Object O7 = rVar4.O();
            if (!z20 && O7 != v0Var) {
                z15 = 4;
                a1Var = a1Var4;
                oVar = oVar4;
                rVar = rVar3;
                f13 = t12;
                rVar2 = b11;
                i12 = 14;
                a1Var2 = a1Var3;
                u4Var2 = u4Var;
            } else {
                z15 = 4;
                a1Var = a1Var4;
                oVar = oVar4;
                rVar = rVar3;
                rVar2 = b11;
                i12 = 14;
                a1Var2 = a1Var3;
                f13 = t12;
                o6 o6Var = new o6(a1Var2, f11, lVar, aVar, a1Var, e1Var, u4Var, a1Var5);
                u4Var2 = u4Var;
                rVar4.k0(o6Var);
                O7 = o6Var;
            }
            r b12 = d0.b(rVar2, str, (PointerInputEventHandler) O7);
            boolean c10 = rVar4.c(f13) | rVar4.c(f12);
            Object O8 = rVar4.O();
            if (c10 || O8 == v0Var) {
                O8 = new i6(f13, f12, a1Var, 0);
                rVar4.k0(O8);
            }
            float f17 = i12;
            r a10 = wa.j7.a(androidx.compose.ui.graphics.a(b12, (df.l) O8), f0.e.a(f17));
            if (((Boolean) a1Var2.getValue()).booleanValue()) {
                f14 = 2;
            } else {
                f14 = 1;
            }
            if (((Boolean) a1Var2.getValue()).booleanValue()) {
                j10 = r.f19515d;
                f15 = 0.85f;
            } else {
                j10 = r.f19515d;
                f15 = 0.12f;
            }
            r a11 = ya.a(a10, f14, r.c(j10, f15), f0.e.a(f17));
            long j11 = u4Var2.f29211c;
            k0 k0Var = l0.f19495a;
            if (rVar != null) {
                oVar2 = oVar;
                b10 = androidx.compose.foundation.a(oVar2, w.k(qe.m.h(new r(j11), rVar), 0.0f, 0.0f, i12), 6);
            } else {
                oVar2 = oVar;
                b10 = androidx.compose.foundation.a.b(oVar2, j11, k0Var);
            }
            r d10 = a11.d(b10);
            p0 d11 = m.d(c.B, false);
            int hashCode = Long.hashCode(rVar4.T);
            g l11 = rVar4.l();
            r c11 = a.c(d10, rVar4);
            h.f1471d.getClass();
            b0 b0Var = g.f1462b;
            rVar4.e0();
            if (rVar4.S) {
                rVar4.k(b0Var);
            } else {
                rVar4.n0();
            }
            f fVar = g.e;
            y.I(fVar, d11, rVar4);
            f fVar2 = g.f1464d;
            y.I(fVar2, l11, rVar4);
            f fVar3 = g.f1465f;
            if (rVar4.S || !kotlin.jvm.internal.l.a(rVar4.O(), Integer.valueOf(hashCode))) {
                a.t(hashCode, rVar4, hashCode, fVar3);
            }
            f fVar4 = g.f1463c;
            y.I(fVar4, c11, rVar4);
            r d12 = androidx.compose.foundation.layout.d(oVar2, 1.0f);
            long j12 = r.f19513b;
            o oVar5 = oVar2;
            float f18 = 5;
            r m4 = androidx.compose.foundation.layout.a.m(androidx.compose.foundation.a.b(d12, r.c(j12, 0.35f), k0Var), 0.0f, f18, 1);
            j jVar = c.f15674y;
            a1 a1Var6 = a1Var2;
            p0 d13 = m.d(jVar, false);
            int hashCode2 = Long.hashCode(rVar4.T);
            g l12 = rVar4.l();
            r c12 = a.c(m4, rVar4);
            rVar4.e0();
            a1 a1Var7 = a1Var;
            if (rVar4.S) {
                rVar4.k(b0Var);
            } else {
                rVar4.n0();
            }
            y.I(fVar, d13, rVar4);
            y.I(fVar2, l12, rVar4);
            if (rVar4.S || !kotlin.jvm.internal.l.a(rVar4.O(), Integer.valueOf(hashCode2))) {
                a.t(hashCode2, rVar4, hashCode2, fVar3);
            }
            y.I(fVar4, c12, rVar4);
            String b13 = wa.n7.b(u4Var.f29210b, rVar4);
            long j13 = r.f19515d;
            x1.b(b13, null, j13, ae.f(4294967296L, 9.5f), null, s.A, null, 0L, null, 0L, 0, false, 0, 0, null, rVar4, 196992, 0, 131026);
            rVar4 = rVar4;
            rVar4.p(true);
            Set set = x7.g0.f30195a;
            if (x7.g0.a("fill:" + str)) {
                rVar4.a0(1868579593);
                oVar3 = oVar5;
                x7.a(0, androidx.compose.foundation.layout.a.k(androidx.compose.foundation.layout.b.f501a.a(oVar3, c.f15672w), f18), rVar4);
            } else {
                oVar3 = oVar5;
                rVar4.a0(1840389278);
            }
            rVar4.p(false);
            if (((Boolean) a1Var6.getValue()).booleanValue() && !((Boolean) a1Var7.getValue()).booleanValue()) {
                rVar4.a0(1868826198);
                r b14 = androidx.compose.foundation.a.b(androidx.compose.foundation.layout.d.f506c, r.c(j12, 0.35f), k0Var);
                p0 d14 = m.d(jVar, false);
                int hashCode3 = Long.hashCode(rVar4.T);
                g l13 = rVar4.l();
                r c13 = a.c(b14, rVar4);
                rVar4.e0();
                if (rVar4.S) {
                    rVar4.k(b0Var);
                } else {
                    rVar4.n0();
                }
                y.I(fVar, d14, rVar4);
                y.I(fVar2, l13, rVar4);
                if (rVar4.S || !kotlin.jvm.internal.l.a(rVar4.O(), Integer.valueOf(hashCode3))) {
                    a.t(hashCode3, rVar4, hashCode3, fVar3);
                }
                y.I(fVar4, c13, rVar4);
                r a12 = q.a(h.i(4), c.H, rVar4, 54);
                int hashCode4 = Long.hashCode(rVar4.T);
                g l14 = rVar4.l();
                r c14 = a.c(oVar3, rVar4);
                rVar4.e0();
                if (rVar4.S) {
                    rVar4.k(b0Var);
                } else {
                    rVar4.n0();
                }
                y.I(fVar, a12, rVar4);
                y.I(fVar2, l14, rVar4);
                if (rVar4.S || !kotlin.jvm.internal.l.a(rVar4.O(), Integer.valueOf(hashCode4))) {
                    a.t(hashCode4, rVar4, hashCode4, fVar3);
                }
                y.I(fVar4, c14, rVar4);
                e a13 = wa.a();
                r k3 = androidx.compose.foundation.layout.d.k(oVar3, 20);
                z16 = false;
                z17 = true;
                y.b(a13, null, k3, j13, rVar4, 3504, 0);
                x1.b("Arrastra", null, j13, ae.f(4294967296L, 9.0f), null, s.B, null, 0L, null, 0L, 0, false, 0, 0, null, rVar4, 196998, 0, 131026);
                rVar4 = rVar4;
                rVar4.p(true);
                rVar4.p(true);
            } else {
                z16 = false;
                z17 = true;
                rVar4.a0(1840389278);
            }
            rVar4.p(z16);
            rVar4.p(z17);
        } else {
            rVar4.U();
        }
        q1 t3 = rVar4.t();
        if (t3 != null) {
            t3.f24332d = new j6(u4Var, aVar, lVar, f10, i10, 0);
        }
    }

    public static final boolean E(e3 e3Var) {
        return e3Var.i();
    }

    /* JADX WARN: Code restructure failed: missing block: B:97:0x029f, code lost:
    
        if (kotlin.jvm.internal.l.a(r12.O(), java.lang.Integer.valueOf(r3)) == false) goto L128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void E0(final d5 r42, final java.lang.String r43, final df.p r44, final df.l r45, final float r46, df.a r47, m r48, final int r49, final int r50) {
        /*
            Method dump skipped, instructions count: 1493
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w7.n4.E0(d5, java.lang.String, df.p, df.l, float, df.a, m, int, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x068e  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0758  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0940  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x09bb  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0ac9  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0b5c  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0ba6  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0caf  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0d28  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0d7b  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0dac  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0f32  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x1116  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x1509  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x1520  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x153f  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x167f  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x182a  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x1859  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x187e  */
    /* JADX WARN: Removed duplicated region for block: B:365:0x1976  */
    /* JADX WARN: Removed duplicated region for block: B:367:0x185b  */
    /* JADX WARN: Removed duplicated region for block: B:371:0x1850  */
    /* JADX WARN: Removed duplicated region for block: B:377:0x1818  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x154c  */
    /* JADX WARN: Removed duplicated region for block: B:381:0x1530  */
    /* JADX WARN: Removed duplicated region for block: B:382:0x1516  */
    /* JADX WARN: Removed duplicated region for block: B:385:0x1129  */
    /* JADX WARN: Removed duplicated region for block: B:478:0x0f92  */
    /* JADX WARN: Removed duplicated region for block: B:483:0x0d86  */
    /* JADX WARN: Removed duplicated region for block: B:484:0x0d46  */
    /* JADX WARN: Removed duplicated region for block: B:486:0x0cb9  */
    /* JADX WARN: Removed duplicated region for block: B:488:0x0bb1  */
    /* JADX WARN: Removed duplicated region for block: B:491:0x0b60  */
    /* JADX WARN: Removed duplicated region for block: B:493:0x0b00  */
    /* JADX WARN: Removed duplicated region for block: B:494:0x09d2  */
    /* JADX WARN: Removed duplicated region for block: B:515:0x09a9  */
    /* JADX WARN: Removed duplicated region for block: B:535:0x092c  */
    /* JADX WARN: Removed duplicated region for block: B:537:0x0692  */
    /* JADX WARN: Removed duplicated region for block: B:538:0x05c6  */
    /* JADX WARN: Removed duplicated region for block: B:539:0x05b9  */
    /* JADX WARN: Removed duplicated region for block: B:542:0x0457  */
    /* JADX WARN: Removed duplicated region for block: B:544:0x03c1  */
    /* JADX WARN: Removed duplicated region for block: B:545:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:547:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:549:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:558:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:572:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:585:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:595:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x03bd  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x03ec  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x04e8  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x05b7  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x05c4  */
    /* JADX WARN: Type inference failed for: r19v16, types: [w7.f0] */
    /* JADX WARN: Type inference failed for: r24v6, types: [w7.f0] */
    /* JADX WARN: Type inference failed for: r5v119 */
    /* JADX WARN: Type inference failed for: r5v32 */
    /* JADX WARN: Type inference failed for: r5v33, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v69 */
    /* JADX WARN: Type inference failed for: r5v70, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v71 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void F(final boolean r120, final int r121, final int r122, final int r123, final pf.z r124, final android.view.View r125, final q.d r126, final df.l r127, final float r128, final e3 r129, df.a r130, final u7.m3 r131, a1 r132, a1 r133, a1 r134, c3 r135, a1 r136, a1 r137, a1 r138, h0 r139, final a1 r140, a1 r141, a1 r142, a1 r143, final b1.v r144, b1.v r145, a1 r146, a r147, a1 r148, final df.l r149, final b1.v r150, df.l r151, final e3 r152, final a1 r153, final a1 r154, final kotlin.jvm.internal.y r155, float r156, final e3 r157, final e3 r158, final e3 r159, e3 r160, final e3 r161, final e3 r162, a1 r163, final a1 r164, final a1 r165, final a1 r166, final a1 r167, final e1 r168, final a1 r169, int r170, final e1 r171, e1 r172, e1 r173, final a1 r174, df.l r175, df.l r176, e1 r177, final b1.v r178, final b1.v r179, final b1.v r180, final b1.v r181, final a1 r182, final a1 r183, final e3 r184, int r185, int r186, a1 r187, a1 r188, final b1.v r189, final a1 r190, a1 r191, final e3 r192, final e3 r193, final e3 r194, final e3 r195, final e3 r196, final e3 r197, df.v r198, a1 r199, final a1 r200, final a1 r201, a1 r202, final a1 r203, final float r204, final a1 r205, final a1 r206, final e1 r207, final a1 r208, final e1 r209, final a1 r210, b1.y r211, a1 r212, final float r213, e3 r214, g1 r215, e3 r216, final e3 r217, final e3 r218, final e3 r219, final e3 r220, final java.lang.Integer r221, final n2 r222, final d r223, final java.lang.String r224, final pe.j r225, final a1 r226, final n2 r227, e3 r228, float r229, n2 r230, n2 r231, a1 r232, i r233, a1 r234, final a1 r235, a1 r236, a1 r237, pf.z r238, final androidx.compose.foundation.layout.c r239, m r240, int r241) {
        /*
            Method dump skipped, instructions count: 6536
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w7.n4.F(boolean, int, int, int, pf.z, android.view.View, q.d, df.l, float, e3, df.a, u7.m3, a1, a1, a1, c3, a1, a1, a1, h0, a1, a1, a1, a1, b1.v, b1.v, a1, a, a1, df.l, b1.v, df.l, e3, a1, a1, kotlin.jvm.internal.y, float, e3, e3, e3, e3, e3, e3, a1, a1, a1, a1, a1, e1, a1, int, e1, e1, e1, a1, df.l, df.l, e1, b1.v, b1.v, b1.v, b1.v, a1, a1, e3, int, int, a1, a1, b1.v, a1, a1, e3, e3, e3, e3, e3, e3, df.v, a1, a1, a1, a1, a1, float, a1, a1, e1, a1, e1, a1, b1.y, a1, float, e3, g1, e3, e3, e3, e3, e3, java.lang.Integer, n2, d, java.lang.String, pe.j, a1, n2, e3, float, n2, n2, a1, i, a1, a1, a1, a1, pf.z, androidx.compose.foundation.layout.c, m, int):void");
    }

    public static final void F0(Uri uri, LruCache lruCache, df.p pVar, df.l lVar, float f10, m mVar, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        boolean z3;
        Uri uri2;
        r rVar;
        Object v6Var;
        int i15;
        a1 a1Var;
        boolean z9;
        boolean z10;
        float f11;
        a1 a1Var2;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        o oVar;
        Object obj;
        float f12;
        a1 a1Var3;
        float f13;
        long j10;
        float f14;
        k0 k0Var;
        f fVar;
        boolean z15;
        boolean z16;
        int i16;
        Uri uri3 = uri;
        uri3.getClass();
        lruCache.getClass();
        pVar.getClass();
        lVar.getClass();
        r rVar2 = (r) mVar;
        rVar2.c0(173974908);
        if (rVar2.h(uri3)) {
            i11 = 4;
        } else {
            i11 = 2;
        }
        int i17 = i11 | i10;
        if (rVar2.h(lruCache)) {
            i12 = 32;
        } else {
            i12 = 16;
        }
        int i18 = i17 | i12;
        if (rVar2.h(pVar)) {
            i13 = 256;
        } else {
            i13 = 128;
        }
        int i19 = i18 | i13;
        if (rVar2.h(lVar)) {
            i14 = 2048;
        } else {
            i14 = 1024;
        }
        int i20 = i19 | i14;
        if ((i10 & 24576) == 0) {
            if (rVar2.c(f10)) {
                i16 = 16384;
            } else {
                i16 = 8192;
            }
            i20 |= i16;
        }
        if ((i20 & 9363) != 9362) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (rVar2.R(i20 & 1, z3)) {
            Context context = (Context) rVar2.j(AndroidCompositionLocals_androidKt.f642b);
            boolean f15 = rVar2.f(uri3);
            Object O = rVar2.O();
            Object obj2 = l.f24285a;
            if (f15 || O == obj2) {
                O = y.B(lruCache.get(uri3));
                rVar2.k0(O);
            }
            a1 a1Var4 = (a1) O;
            boolean f16 = rVar2.f(a1Var4) | rVar2.h(context) | rVar2.h(uri3) | rVar2.h(lruCache);
            Object O2 = rVar2.O();
            if (!f16 && O2 != obj2) {
                i15 = i20;
                v6Var = O2;
                a1Var = a1Var4;
                z9 = true;
            } else {
                i15 = i20;
                a1Var = a1Var4;
                z9 = true;
                v6Var = new v6(context, uri, lruCache, a1Var, null, 0);
                uri3 = uri;
                rVar2.k0(v6Var);
            }
            y.f((df.p) v6Var, uri3, rVar2);
            Object O3 = rVar2.O();
            if (O3 == obj2) {
                O3 = y.B(Boolean.FALSE);
                rVar2.k0(O3);
            }
            a1 a1Var5 = (a1) O3;
            Object O4 = rVar2.O();
            if (O4 == obj2) {
                O4 = y.B(Boolean.FALSE);
                rVar2.k0(O4);
            }
            a1 a1Var6 = (a1) O4;
            Object O5 = rVar2.O();
            if (O5 == obj2) {
                O5 = g(0.0f, rVar2);
            }
            e1 e1Var = (e1) O5;
            Object O6 = rVar2.O();
            if (O6 == obj2) {
                O6 = g(0.0f, rVar2);
            }
            e1 e1Var2 = (e1) O6;
            Object O7 = rVar2.O();
            if (O7 == obj2) {
                O7 = y.B(new b(0L));
                rVar2.k0(O7);
            }
            a1 a1Var7 = (a1) O7;
            if (((Boolean) a1Var5.getValue()).booleanValue() && !((Boolean) a1Var6.getValue()).booleanValue()) {
                z10 = z9;
            } else {
                z10 = false;
            }
            float t12 = t1(z10, rVar2, 0, 6);
            if (((Boolean) a1Var5.getValue()).booleanValue() && !((Boolean) a1Var6.getValue()).booleanValue()) {
                f11 = 1.04f;
            } else {
                f11 = 1.0f;
            }
            float f17 = f11;
            float f18 = FacebookMediationAdapter.ERROR_FAILED_TO_PRESENT_AD;
            o oVar2 = o.f15687a;
            r l10 = androidx.compose.foundation.layout.d.l(oVar2, 88, f18);
            Object O8 = rVar2.O();
            if (O8 == obj2) {
                a1Var2 = a1Var5;
                O8 = new b8.a0(a1Var7, 19);
                rVar2.k0(O8);
            } else {
                a1Var2 = a1Var5;
            }
            r d2 = androidx.compose.ui.layout.a.d(l10, (df.l) O8);
            int i21 = i15 & 896;
            if (i21 == 256) {
                z11 = z9;
            } else {
                z11 = false;
            }
            Object O9 = rVar2.O();
            if (z11 || O9 == obj2) {
                O9 = new q6(1, pVar);
                rVar2.k0(O9);
            }
            r b10 = d0.b(d2, uri3, (PointerInputEventHandler) O9);
            if ((57344 & i15) == 16384) {
                z12 = z9;
            } else {
                z12 = false;
            }
            if ((i15 & 7168) == 2048) {
                z13 = z9;
            } else {
                z13 = false;
            }
            boolean z17 = z12 | z13;
            if (i21 == 256) {
                z14 = z9;
            } else {
                z14 = false;
            }
            boolean f19 = z17 | z14 | rVar2.f(a1Var);
            Object O10 = rVar2.O();
            if (!f19 && O10 != obj2) {
                a1Var3 = a1Var6;
                oVar = oVar2;
                obj = obj2;
                uri2 = uri3;
                f12 = t12;
            } else {
                a1 a1Var8 = a1Var;
                oVar = oVar2;
                obj = obj2;
                uri2 = uri3;
                f12 = t12;
                Object x6Var = new x6(a1Var2, f10, lVar, pVar, a1Var6, e1Var2, e1Var, a1Var7, a1Var8, 0);
                a1Var3 = a1Var6;
                a1Var = a1Var8;
                rVar2.k0(x6Var);
                O10 = x6Var;
            }
            r b11 = d0.b(b10, uri2, (PointerInputEventHandler) O10);
            boolean c10 = rVar2.c(f12) | rVar2.c(f17);
            Object O11 = rVar2.O();
            if (c10 || O11 == obj) {
                O11 = new i6(f12, f17, a1Var3, 1);
                rVar2.k0(O11);
            }
            float f20 = 14;
            r a10 = wa.j7.a(androidx.compose.ui.graphics.a(b11, (df.l) O11), f0.e.a(f20));
            if (((Boolean) a1Var2.getValue()).booleanValue()) {
                f13 = 2;
            } else {
                f13 = 1;
            }
            if (((Boolean) a1Var2.getValue()).booleanValue()) {
                j10 = r.f19515d;
                f14 = 0.85f;
            } else {
                j10 = r.f19515d;
                f14 = 0.12f;
            }
            r a11 = ya.a(a10, f13, r.c(j10, f14), f0.e.a(f20));
            j jVar = c.f15674y;
            p0 d10 = m.d(jVar, false);
            int hashCode = Long.hashCode(rVar2.T);
            g l11 = rVar2.l();
            r c11 = a.c(a11, rVar2);
            h.f1471d.getClass();
            df.a aVar = g.f1462b;
            rVar2.e0();
            if (rVar2.S) {
                rVar2.k(aVar);
            } else {
                rVar2.n0();
            }
            f fVar2 = g.e;
            y.I(fVar2, d10, rVar2);
            f fVar3 = g.f1464d;
            y.I(fVar3, l11, rVar2);
            f fVar4 = g.f1465f;
            if (rVar2.S || !kotlin.jvm.internal.l.a(rVar2.O(), Integer.valueOf(hashCode))) {
                a.t(hashCode, rVar2, hashCode, fVar4);
            }
            f fVar5 = g.f1463c;
            y.I(fVar5, c11, rVar2);
            f fVar6 = (f) a1Var.getValue();
            k0 k0Var2 = l0.f19495a;
            if (fVar6 != null) {
                rVar2.a0(-1246755341);
                f fVar7 = (f) a1Var.getValue();
                fVar7.getClass();
                fVar = fVar5;
                rVar = rVar2;
                k0Var = k0Var2;
                ya.wa.b(fVar7, null, androidx.compose.foundation.layout.d.f506c, n.f31848a, rVar, 25008, 232);
                rVar.p(false);
            } else {
                k0Var = k0Var2;
                rVar = rVar2;
                fVar = fVar5;
                rVar.a0(-1246650995);
                m.a(6, androidx.compose.foundation.a.b(androidx.compose.foundation.layout.d.f506c, r.c(r.f19515d, 0.05f), k0Var), rVar);
                rVar.p(false);
            }
            if (((Boolean) a1Var2.getValue()).booleanValue() && !((Boolean) a1Var3.getValue()).booleanValue()) {
                rVar.a0(-1246423858);
                r b12 = androidx.compose.foundation.a.b(androidx.compose.foundation.layout.d.f506c, r.c(r.f19513b, 0.38f), k0Var);
                p0 d11 = m.d(jVar, false);
                int hashCode2 = Long.hashCode(rVar.T);
                g l12 = rVar.l();
                r c12 = a.c(b12, rVar);
                rVar.e0();
                if (rVar.S) {
                    rVar.k(aVar);
                } else {
                    rVar.n0();
                }
                y.I(fVar2, d11, rVar);
                y.I(fVar3, l12, rVar);
                if (rVar.S || !kotlin.jvm.internal.l.a(rVar.O(), Integer.valueOf(hashCode2))) {
                    a.t(hashCode2, rVar, hashCode2, fVar4);
                }
                y.I(fVar, c12, rVar);
                r a12 = q.a(h.i(4), c.H, rVar, 54);
                int hashCode3 = Long.hashCode(rVar.T);
                g l13 = rVar.l();
                o oVar3 = oVar;
                r c13 = a.c(oVar3, rVar);
                rVar.e0();
                if (rVar.S) {
                    rVar.k(aVar);
                } else {
                    rVar.n0();
                }
                y.I(fVar2, a12, rVar);
                y.I(fVar3, l13, rVar);
                if (rVar.S || !kotlin.jvm.internal.l.a(rVar.O(), Integer.valueOf(hashCode3))) {
                    a.t(hashCode3, rVar, hashCode3, fVar4);
                }
                y.I(fVar, c13, rVar);
                e a13 = wa.a();
                long j11 = r.f19515d;
                r rVar3 = rVar;
                y.b(a13, null, androidx.compose.foundation.layout.d.k(oVar3, 20), j11, rVar3, 3504, 0);
                rVar = rVar3;
                z15 = false;
                x1.b("Arrastra", null, j11, ae.f(4294967296L, 9.0f), null, s.B, null, 0L, null, 0L, 0, false, 0, 0, null, rVar, 196998, 0, 131026);
                z16 = true;
                rVar.p(true);
                rVar.p(true);
            } else {
                z15 = false;
                z16 = true;
                rVar.a0(-1263550676);
            }
            rVar.p(z15);
            rVar.p(z16);
        } else {
            uri2 = uri3;
            rVar = rVar2;
            rVar.U();
        }
        q1 t3 = rVar.t();
        if (t3 != null) {
            t3.f24332d = new b8.p4(uri2, lruCache, pVar, lVar, f10, i10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0844  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0890  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x091f  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x092d  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x095d  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0990  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x09ca  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0b0c  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0a09  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0987  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0954  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0cbc  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x0e00  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0e68  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0e88 A[LOOP:12: B:286:0x0e86->B:287:0x0e88, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:291:0x0e9e  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x0ed8 A[LOOP:13: B:294:0x0ed6->B:295:0x0ed8, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:305:0x0f68  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x0ff5  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x1010  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x102b  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x1042  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x1082  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x1094  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x11b7  */
    /* JADX WARN: Removed duplicated region for block: B:397:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:398:0x1085  */
    /* JADX WARN: Removed duplicated region for block: B:403:0x104e  */
    /* JADX WARN: Type inference failed for: r12v38 */
    /* JADX WARN: Type inference failed for: r12v39 */
    /* JADX WARN: Type inference failed for: r12v40, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v16 */
    /* JADX WARN: Type inference failed for: r13v17 */
    /* JADX WARN: Type inference failed for: r13v18, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v60 */
    /* JADX WARN: Type inference failed for: r6v61 */
    /* JADX WARN: Type inference failed for: r6v62, types: [java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void G(u7.m3 r41, int r42, int r43, boolean r44, boolean r45, b1.v r46, b1.v r47, b1.v r48, java.lang.Integer r49, b1.v r50, df.l r51, kotlin.jvm.internal.y r52, float r53, float r54, b1.v r55, b1.v r56, n2 r57, d r58, e3 r59, e3 r60, e3 r61, e3 r62, e3 r63, e3 r64, e3 r65, e3 r66, e3 r67, e3 r68, e3 r69, int r70, a1 r71, java.lang.String r72, pe.j r73, a1 r74, a1 r75, a1 r76, a1 r77, e1 r78, a1 r79, b1.v r80, e3 r81, a1 r82, a1 r83, a1 r84, a1 r85, a1 r86, e1 r87, e1 r88, n2 r89, float r90, a1 r91, a1 r92, a1 r93, a1 r94, a1 r95, e3 r96, e3 r97, e3 r98, e3 r99, d r100) {
        /*
            Method dump skipped, instructions count: 4900
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w7.n4.G(u7.m3, int, int, boolean, boolean, b1.v, b1.v, b1.v, java.lang.Integer, b1.v, df.l, kotlin.jvm.internal.y, float, float, b1.v, b1.v, n2, d, e3, e3, e3, e3, e3, e3, e3, e3, e3, e3, e3, int, a1, java.lang.String, pe.j, a1, a1, a1, a1, e1, a1, b1.v, e3, a1, a1, a1, a1, a1, e1, e1, n2, float, a1, a1, a1, a1, a1, e3, e3, e3, e3, d):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:99:0x026a, code lost:
    
        if (kotlin.jvm.internal.l.a(r11.O(), java.lang.Integer.valueOf(r3)) == false) goto L125;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void G0(java.lang.String r41, df.p r42, df.l r43, float r44, m r45, int r46) {
        /*
            Method dump skipped, instructions count: 1240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w7.n4.G0(java.lang.String, df.p, df.l, float, m, int):void");
    }

    public static final void H(float f10, float f11, Canvas canvas, Paint paint, float f12, float f13, boolean z3) {
        float f14;
        if (z3) {
            f14 = f10;
        } else {
            f14 = f11;
        }
        if (z3) {
            f10 = f11;
        }
        float f15 = f14 / 2.0f;
        float f16 = f10 / 2.0f;
        canvas.drawRoundRect(new RectF(f12 - f15, f13 - f16, f12 + f15, f13 + f16), Math.min(f14, f10) / 2.0f, Math.min(f14, f10) / 2.0f, paint);
    }

    public static final void H0(ma maVar, df.p pVar, df.l lVar, float f10, m mVar, int i10) {
        int i11;
        boolean z3;
        r rVar;
        boolean z9;
        boolean z10;
        int i12;
        a1 a1Var;
        boolean z11;
        float f11;
        e1 e1Var;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        ma maVar2;
        o oVar;
        r rVar2;
        float f12;
        a1 a1Var2;
        float f13;
        float f14;
        f fVar;
        df.a aVar;
        a1 a1Var3;
        f fVar2;
        f fVar3;
        boolean z16;
        boolean z17;
        int i13;
        int i14;
        int i15;
        int i16;
        ma maVar3 = maVar;
        maVar3.getClass();
        pVar.getClass();
        lVar.getClass();
        r rVar3 = (r) mVar;
        rVar3.c0(1363389021);
        if ((i10 & 6) == 0) {
            if (rVar3.f(maVar3)) {
                i16 = 4;
            } else {
                i16 = 2;
            }
            i11 = i16 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if (rVar3.h(pVar)) {
                i15 = 32;
            } else {
                i15 = 16;
            }
            i11 |= i15;
        }
        if ((i10 & 384) == 0) {
            if (rVar3.h(lVar)) {
                i14 = 256;
            } else {
                i14 = 128;
            }
            i11 |= i14;
        }
        if ((i10 & 3072) == 0) {
            if (rVar3.c(f10)) {
                i13 = 2048;
            } else {
                i13 = 1024;
            }
            i11 |= i13;
        }
        if ((i11 & 1171) != 1170) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (rVar3.R(i11 & 1, z3)) {
            Context context = (Context) rVar3.j(AndroidCompositionLocals_androidKt.f642b);
            int i17 = i11 & 14;
            if (i17 == 4) {
                z9 = true;
            } else {
                z9 = false;
            }
            Object O = rVar3.O();
            Object obj = l.f24285a;
            te.c cVar = null;
            if (z9 || O == obj) {
                O = y.B(null);
                rVar3.k0(O);
            }
            a1 a1Var4 = (a1) O;
            boolean f15 = rVar3.f(a1Var4) | rVar3.h(context);
            if (i17 == 4) {
                z10 = true;
            } else {
                z10 = false;
            }
            boolean z18 = f15 | z10;
            Object O2 = rVar3.O();
            if (!z18 && O2 != obj) {
                i12 = i11;
                a1Var = a1Var4;
            } else {
                i12 = i11;
                a1Var = a1Var4;
                Object l8Var = new l8(context, maVar3, a1Var, cVar, 1);
                maVar3 = maVar3;
                rVar3.k0(l8Var);
                O2 = l8Var;
            }
            y.f((df.p) O2, maVar3, rVar3);
            Object O3 = rVar3.O();
            if (O3 == obj) {
                O3 = y.B(Boolean.FALSE);
                rVar3.k0(O3);
            }
            a1 a1Var5 = (a1) O3;
            Object O4 = rVar3.O();
            if (O4 == obj) {
                O4 = g(0.0f, rVar3);
            }
            e1 e1Var2 = (e1) O4;
            Object O5 = rVar3.O();
            if (O5 == obj) {
                O5 = g(0.0f, rVar3);
            }
            e1 e1Var3 = (e1) O5;
            Object O6 = rVar3.O();
            if (O6 == obj) {
                O6 = y.B(Boolean.FALSE);
                rVar3.k0(O6);
            }
            a1 a1Var6 = (a1) O6;
            Object O7 = rVar3.O();
            if (O7 == obj) {
                O7 = y.B(new b(0L));
                rVar3.k0(O7);
            }
            a1 a1Var7 = (a1) O7;
            if (((Boolean) a1Var5.getValue()).booleanValue() && !((Boolean) a1Var6.getValue()).booleanValue()) {
                z11 = true;
            } else {
                z11 = false;
            }
            float t12 = t1(z11, rVar3, 0, 6);
            if (((Boolean) a1Var5.getValue()).booleanValue() && !((Boolean) a1Var6.getValue()).booleanValue()) {
                f11 = 1.04f;
            } else {
                f11 = 1.0f;
            }
            float f16 = f11;
            float f17 = FacebookMediationAdapter.ERROR_FACEBOOK_INITIALIZATION;
            o oVar2 = o.f15687a;
            r l10 = androidx.compose.foundation.layout.d.l(oVar2, 88, f17);
            Object O8 = rVar3.O();
            if (O8 == obj) {
                e1Var = e1Var2;
                O8 = new b8.a0(a1Var7, 27);
                rVar3.k0(O8);
            } else {
                e1Var = e1Var2;
            }
            r d2 = androidx.compose.ui.layout.a.d(l10, (df.l) O8);
            int i18 = i12 & 112;
            if (i18 == 32) {
                z12 = true;
            } else {
                z12 = false;
            }
            Object O9 = rVar3.O();
            boolean z19 = z12;
            int i19 = 3;
            if (z19 || O9 == obj) {
                O9 = new q6(i19, pVar);
                rVar3.k0(O9);
            }
            r b10 = d0.b(d2, maVar3, (PointerInputEventHandler) O9);
            if ((i12 & 7168) == 2048) {
                z13 = true;
            } else {
                z13 = false;
            }
            if ((i12 & 896) == 256) {
                z14 = true;
            } else {
                z14 = false;
            }
            boolean z20 = z13 | z14;
            if (i18 == 32) {
                z15 = true;
            } else {
                z15 = false;
            }
            boolean f18 = z15 | z20 | rVar3.f(a1Var);
            Object O10 = rVar3.O();
            if (!f18 && O10 != obj) {
                maVar2 = maVar3;
                f12 = t12;
                oVar = oVar2;
                a1Var2 = a1Var6;
                rVar2 = b10;
            } else {
                a1 a1Var8 = a1Var;
                maVar2 = maVar3;
                oVar = oVar2;
                rVar2 = b10;
                f12 = t12;
                Object x6Var = new x6(a1Var5, f10, lVar, pVar, a1Var6, e1Var3, e1Var, a1Var7, a1Var8, 1);
                a1Var2 = a1Var6;
                a1Var = a1Var8;
                rVar3.k0(x6Var);
                O10 = x6Var;
            }
            r b11 = d0.b(rVar2, maVar2, (PointerInputEventHandler) O10);
            boolean c10 = rVar3.c(f12) | rVar3.c(f16);
            Object O11 = rVar3.O();
            if (c10 || O11 == obj) {
                O11 = new i6(f12, f16, a1Var2, 3);
                rVar3.k0(O11);
            }
            float f19 = 13;
            r a10 = wa.j7.a(androidx.compose.ui.graphics.a(b11, (df.l) O11), f0.e.a(f19));
            long j10 = r.f19515d;
            long c11 = r.c(j10, 0.05f);
            k0 k0Var = l0.f19495a;
            r b12 = androidx.compose.foundation.a.b(a10, c11, k0Var);
            if (((Boolean) a1Var5.getValue()).booleanValue()) {
                f13 = 2;
            } else {
                f13 = 1;
            }
            if (((Boolean) a1Var5.getValue()).booleanValue()) {
                f14 = 0.85f;
            } else {
                f14 = 0.13f;
            }
            r a11 = ya.a(b12, f13, r.c(j10, f14), f0.e.a(f19));
            j jVar = c.f15674y;
            p0 d10 = m.d(jVar, false);
            int hashCode = Long.hashCode(rVar3.T);
            g l11 = rVar3.l();
            r c12 = a.c(a11, rVar3);
            h.f1471d.getClass();
            df.a aVar2 = g.f1462b;
            rVar3.e0();
            if (rVar3.S) {
                rVar3.k(aVar2);
            } else {
                rVar3.n0();
            }
            f fVar4 = g.e;
            y.I(fVar4, d10, rVar3);
            f fVar5 = g.f1464d;
            y.I(fVar5, l11, rVar3);
            f fVar6 = g.f1465f;
            if (rVar3.S || !kotlin.jvm.internal.l.a(rVar3.O(), Integer.valueOf(hashCode))) {
                a.t(hashCode, rVar3, hashCode, fVar6);
            }
            f fVar7 = g.f1463c;
            y.I(fVar7, c12, rVar3);
            if (((f) a1Var.getValue()) != null) {
                rVar3.a0(1898900680);
                f fVar8 = (f) a1Var.getValue();
                fVar8.getClass();
                fVar = fVar6;
                a1Var3 = a1Var2;
                rVar = rVar3;
                fVar2 = fVar5;
                fVar3 = fVar4;
                aVar = aVar2;
                ya.wa.b(fVar8, null, androidx.compose.foundation.layout.a.k(androidx.compose.foundation.layout.d.f506c, 12), n.f31849b, rVar, 25008, 232);
                rVar.p(false);
            } else {
                fVar = fVar6;
                aVar = aVar2;
                a1Var3 = a1Var2;
                rVar = rVar3;
                fVar2 = fVar5;
                fVar3 = fVar4;
                rVar.a0(1899033856);
                m.a(6, androidx.compose.foundation.a.b(androidx.compose.foundation.layout.d.f506c, r.c(j10, 0.04f), k0Var), rVar);
                rVar.p(false);
            }
            if (((Boolean) a1Var5.getValue()).booleanValue() && !((Boolean) a1Var3.getValue()).booleanValue()) {
                rVar.a0(1899181106);
                r b13 = androidx.compose.foundation.a.b(androidx.compose.foundation.layout.d.f506c, r.c(r.f19513b, 0.38f), k0Var);
                p0 d11 = m.d(jVar, false);
                int hashCode2 = Long.hashCode(rVar.T);
                g l12 = rVar.l();
                r c13 = a.c(b13, rVar);
                rVar.e0();
                if (rVar.S) {
                    rVar.k(aVar);
                } else {
                    rVar.n0();
                }
                y.I(fVar3, d11, rVar);
                y.I(fVar2, l12, rVar);
                if (rVar.S || !kotlin.jvm.internal.l.a(rVar.O(), Integer.valueOf(hashCode2))) {
                    a.t(hashCode2, rVar, hashCode2, fVar);
                }
                y.I(fVar7, c13, rVar);
                r a12 = q.a(h.i(4), c.H, rVar, 54);
                int hashCode3 = Long.hashCode(rVar.T);
                g l13 = rVar.l();
                o oVar3 = oVar;
                r c14 = a.c(oVar3, rVar);
                rVar.e0();
                if (rVar.S) {
                    rVar.k(aVar);
                } else {
                    rVar.n0();
                }
                y.I(fVar3, a12, rVar);
                y.I(fVar2, l13, rVar);
                if (rVar.S || !kotlin.jvm.internal.l.a(rVar.O(), Integer.valueOf(hashCode3))) {
                    a.t(hashCode3, rVar, hashCode3, fVar);
                }
                y.I(fVar7, c14, rVar);
                r rVar4 = rVar;
                y.b(wa.a(), null, androidx.compose.foundation.layout.d.k(oVar3, 20), j10, rVar4, 3504, 0);
                rVar = rVar4;
                z17 = true;
                x1.b(wa.n7.b(R.string.insert_drag_hint, rVar), null, j10, ae.f(4294967296L, 9.0f), null, s.B, null, 0L, null, 0L, 0, false, 0, 0, null, rVar, 196992, 0, 131026);
                rVar.p(true);
                rVar.p(true);
                z16 = false;
            } else {
                z16 = false;
                z17 = true;
                rVar.a0(1887313407);
            }
            rVar.p(z16);
            rVar.p(z17);
        } else {
            rVar = rVar3;
            rVar.U();
        }
        q1 t3 = rVar.t();
        if (t3 != null) {
            t3.f24332d = new j6(maVar, pVar, lVar, f10, i10, 1);
        }
    }

    public static final void I(float f10, float f11, p pVar, Paint paint, Paint paint2, float f12, float f13, boolean z3) {
        float f14;
        if (z3) {
            f14 = f10;
        } else {
            f14 = f11;
        }
        if (z3) {
            f10 = f11;
        }
        float f15 = f14 / 2.0f;
        float f16 = f10 / 2.0f;
        RectF rectF = new RectF(f12 - f15, f13 - f16, f12 + f15, f13 + f16);
        Canvas canvas = b.f19467a;
        a aVar = (a) pVar;
        aVar.f19463a.drawRoundRect(rectF, f10, f10, paint);
        aVar.f19463a.drawRoundRect(rectF, f10, f10, paint2);
    }

    public static final void I0(u7.c cVar, u7.m3 m3Var, int i10, int i11, df.a aVar, m mVar, int i12) {
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        boolean z3;
        r rVar = (r) mVar;
        rVar.c0(1526268105);
        if (rVar.f(cVar)) {
            i13 = 4;
        } else {
            i13 = 2;
        }
        int i18 = i12 | i13;
        if (rVar.h(m3Var)) {
            i14 = 32;
        } else {
            i14 = 16;
        }
        int i19 = i18 | i14;
        if (rVar.d(i10)) {
            i15 = 256;
        } else {
            i15 = 128;
        }
        int i20 = i19 | i15;
        if (rVar.d(i11)) {
            i16 = 2048;
        } else {
            i16 = 1024;
        }
        int i21 = i20 | i16;
        if (rVar.h(aVar)) {
            i17 = 16384;
        } else {
            i17 = 8192;
        }
        int i22 = i21 | i17;
        if ((i22 & 9363) != 9362) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (rVar.R(i22 & 1, z3)) {
            Object O = rVar.O();
            v0 v0Var = l.f24285a;
            if (O == v0Var) {
                O = y.B(Boolean.FALSE);
                rVar.k0(O);
            }
            a1 a1Var = (a1) O;
            Object O2 = rVar.O();
            if (O2 == v0Var) {
                O2 = y.B(Boolean.FALSE);
                rVar.k0(O2);
            }
            x7.y0.a(wa.n7.b(R.string.shape_style_title, rVar), aVar, null, null, h.d(828081505, new z0(cVar, m3Var, i10, i11, a1Var, (a1) O2), rVar), rVar, ((i22 >> 9) & 112) | 24576, 12);
        } else {
            rVar.U();
        }
        q1 t3 = rVar.t();
        if (t3 != null) {
            t3.f24332d = new x0(cVar, m3Var, i10, i11, aVar, i12, 1);
        }
    }

    public static final h J(b1.v vVar) {
        h a10 = k.a();
        if (vVar.isEmpty()) {
            return a10;
        }
        int i10 = 1;
        if (vVar.size() == 1) {
            a10.h(Float.intBitsToFloat((int) (((b) vVar.get(0)).f18762a >> 32)), Float.intBitsToFloat((int) (((b) vVar.get(0)).f18762a & 4294967295L)));
            return a10;
        }
        a10.h(Float.intBitsToFloat((int) (((b) vVar.get(0)).f18762a >> 32)), Float.intBitsToFloat((int) (((b) vVar.get(0)).f18762a & 4294967295L)));
        if (vVar.size() == 2) {
            a10.g(Float.intBitsToFloat((int) (((b) vVar.get(1)).f18762a >> 32)), Float.intBitsToFloat((int) (((b) vVar.get(1)).f18762a & 4294967295L)));
            return a10;
        }
        int size = vVar.size() - 1;
        while (i10 < size) {
            int i11 = i10 + 1;
            float intBitsToFloat = (Float.intBitsToFloat((int) (((b) vVar.get(i11)).f18762a >> 32)) + Float.intBitsToFloat((int) (((b) vVar.get(i10)).f18762a >> 32))) / 2.0f;
            float intBitsToFloat2 = (Float.intBitsToFloat((int) (((b) vVar.get(i11)).f18762a & 4294967295L)) + Float.intBitsToFloat((int) (((b) vVar.get(i10)).f18762a & 4294967295L))) / 2.0f;
            a10.f19481a.quadTo(Float.intBitsToFloat((int) (((b) vVar.get(i10)).f18762a >> 32)), Float.intBitsToFloat((int) (((b) vVar.get(i10)).f18762a & 4294967295L)), intBitsToFloat, intBitsToFloat2);
            i10 = i11;
        }
        a10.g(Float.intBitsToFloat((int) (((b) qe.l.C(vVar)).f18762a >> 32)), Float.intBitsToFloat((int) (((b) qe.l.C(vVar)).f18762a & 4294967295L)));
        return a10;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ad  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void J0(u7.m3 r32, int r33, int r34, u7.c r35, java.lang.Integer r36, java.lang.Integer r37, java.lang.Float r38, java.lang.Float r39, int r40) {
        /*
            Method dump skipped, instructions count: 249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w7.n4.J0(u7.m3, int, int, u7.c, java.lang.Integer, java.lang.Integer, java.lang.Float, java.lang.Float, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0151 A[Catch: all -> 0x0321, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0321, blocks: (B:32:0x00c8, B:42:0x0173, B:70:0x01d9, B:76:0x01f8, B:101:0x0151, B:106:0x00eb, B:129:0x013c), top: B:31:0x00c8 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x017d A[Catch: all -> 0x00de, TRY_ENTER, TryCatch #7 {all -> 0x00de, blocks: (B:27:0x00af, B:34:0x00ce, B:44:0x017d, B:47:0x0191, B:49:0x019d, B:51:0x01a5, B:53:0x01ad, B:62:0x01bb, B:64:0x01c4, B:66:0x01c8, B:68:0x01d0, B:73:0x01ec, B:103:0x015d, B:105:0x016a, B:108:0x00f7, B:110:0x00ff, B:111:0x0109, B:113:0x010f, B:117:0x0120, B:119:0x0124, B:123:0x012d, B:125:0x0137, B:131:0x0144, B:133:0x0148), top: B:26:0x00af }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01c4 A[Catch: all -> 0x00de, TryCatch #7 {all -> 0x00de, blocks: (B:27:0x00af, B:34:0x00ce, B:44:0x017d, B:47:0x0191, B:49:0x019d, B:51:0x01a5, B:53:0x01ad, B:62:0x01bb, B:64:0x01c4, B:66:0x01c8, B:68:0x01d0, B:73:0x01ec, B:103:0x015d, B:105:0x016a, B:108:0x00f7, B:110:0x00ff, B:111:0x0109, B:113:0x010f, B:117:0x0120, B:119:0x0124, B:123:0x012d, B:125:0x0137, B:131:0x0144, B:133:0x0148), top: B:26:0x00af }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0215 A[Catch: all -> 0x02ad, TryCatch #5 {all -> 0x02ad, blocks: (B:78:0x020e, B:80:0x0215, B:82:0x022c, B:92:0x02b2, B:147:0x0340), top: B:28:0x00c4 }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0410 A[Catch: all -> 0x03c7, TryCatch #2 {all -> 0x03c7, blocks: (B:84:0x0402, B:86:0x0410, B:88:0x0416, B:158:0x03c1, B:161:0x03d5), top: B:28:0x00c4 }] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01f6  */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v12 */
    /* JADX WARN: Type inference failed for: r15v20 */
    /* JADX WARN: Type inference failed for: r15v8, types: [float] */
    /* JADX WARN: Type inference failed for: r15v9 */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v10 */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r16v3 */
    /* JADX WARN: Type inference failed for: r16v6 */
    /* JADX WARN: Type inference failed for: r16v7 */
    /* JADX WARN: Type inference failed for: r16v9 */
    /* JADX WARN: Type inference failed for: r8v1, types: [ic.c] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void K(df.l r33, float r34, d r35, java.lang.String r36, pe.j r37, a1 r38, a1 r39, u7.m3 r40, int r41, int r42, a1 r43, a1 r44, e3 r45, e1 r46, u7.b r47) {
        /*
            Method dump skipped, instructions count: 1172
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w7.n4.K(df.l, float, d, java.lang.String, pe.j, a1, a1, u7.m3, int, int, a1, a1, e3, e1, u7.b):void");
    }

    public static final void K0(u7.c cVar, u7.m3 m3Var, int i10, int i11, boolean z3) {
        int i12 = -6381922;
        if (z3) {
            if (cVar.f25972d == null) {
                Integer num = cVar.f25971c;
                if (num != null) {
                    i12 = num.intValue();
                }
                Integer valueOf = Integer.valueOf(i12);
                float f10 = cVar.e;
                if (f10 <= 0.0f) {
                    f10 = 0.006f;
                }
                J0(m3Var, i10, i11, cVar, null, valueOf, Float.valueOf(f10), null, 1680);
                return;
            }
            J0(m3Var, i10, i11, cVar, null, null, null, null, 1776);
            return;
        }
        if (cVar.f25971c == null) {
            Integer num2 = cVar.f25972d;
            if (num2 != null) {
                i12 = num2.intValue();
            }
            J0(m3Var, i10, i11, cVar, Integer.valueOf(i12), null, null, null, 1504);
            return;
        }
        J0(m3Var, i10, i11, cVar, null, null, null, null, 1520);
    }

    public static final void L(float f10, d dVar, u7.c cVar) {
        float f11 = cVar.f25974g * f10;
        float f12 = cVar.f25977k;
        float f13 = f11 * f12;
        float f14 = cVar.f25975h * f10 * f12;
        p j10 = dVar.p0().j();
        a(j10).save();
        a aVar = (a) j10;
        aVar.f19463a.translate(Float.intBitsToFloat((int) (dVar.e() >> 32)) * cVar.i, Float.intBitsToFloat((int) (dVar.e() & 4294967295L)) * cVar.f25976j);
        aVar.f19463a.rotate(cVar.f25978l);
        List list = y8.f29503a;
        c(aVar.f19463a, cVar.f25970b, f13, f14, cVar.f25971c, cVar.f25972d, cVar.e * f10 * f12, cVar.f25973f);
        aVar.f19463a.restore();
    }

    public static final void L0(final p pVar, final u7.m3 m3Var, final e3 e3Var, final int i10, final int i11, final boolean z3, final a1 a1Var, final a1 a1Var2, m mVar, final int i12) {
        int i13;
        e3 e3Var2;
        a1 a1Var3;
        boolean z9;
        r rVar;
        u7.c cVar;
        boolean z10;
        Object obj;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        pVar.getClass();
        a1Var.getClass();
        r rVar2 = (r) mVar;
        rVar2.c0(-1860232734);
        if ((i12 & 6) == 0) {
            if (rVar2.f(pVar)) {
                i21 = 4;
            } else {
                i21 = 2;
            }
            i13 = i21 | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 48) == 0) {
            if (rVar2.h(m3Var)) {
                i20 = 32;
            } else {
                i20 = 16;
            }
            i13 |= i20;
        }
        if ((i12 & 384) == 0) {
            e3Var2 = e3Var;
            if (rVar2.f(e3Var2)) {
                i19 = 256;
            } else {
                i19 = 128;
            }
            i13 |= i19;
        } else {
            e3Var2 = e3Var;
        }
        if ((i12 & 3072) == 0) {
            if (rVar2.d(i10)) {
                i18 = 2048;
            } else {
                i18 = 1024;
            }
            i13 |= i18;
        }
        if ((i12 & 24576) == 0) {
            if (rVar2.d(i11)) {
                i17 = 16384;
            } else {
                i17 = 8192;
            }
            i13 |= i17;
        }
        if ((196608 & i12) == 0) {
            if (rVar2.g(z3)) {
                i16 = 131072;
            } else {
                i16 = 65536;
            }
            i13 |= i16;
        }
        if ((1572864 & i12) == 0) {
            if (rVar2.f(a1Var)) {
                i15 = 1048576;
            } else {
                i15 = 524288;
            }
            i13 |= i15;
        }
        if ((12582912 & i12) == 0) {
            a1Var3 = a1Var2;
            if (rVar2.f(a1Var3)) {
                i14 = 8388608;
            } else {
                i14 = 4194304;
            }
            i13 |= i14;
        } else {
            a1Var3 = a1Var2;
        }
        boolean z11 = true;
        if ((4793491 & i13) != 4793490) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (rVar2.R(i13 & 1, z9)) {
            String str = (String) a1Var3.getValue();
            if (str != null) {
                Iterator it = m3Var.j1(i10, i11).iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (kotlin.jvm.internal.l.a(((u7.c) obj).f25969a, str)) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                cVar = (u7.c) obj;
            } else {
                cVar = null;
            }
            if (cVar == null && ((Boolean) a1Var.getValue()).booleanValue()) {
                a1Var.setValue(Boolean.FALSE);
            }
            boolean booleanValue = ((Boolean) a1Var.getValue()).booleanValue();
            v0 v0Var = l.f24285a;
            if (booleanValue && cVar != null) {
                rVar2.a0(-229674072);
                FillElement fillElement = androidx.compose.foundation.layout.d.f506c;
                Object O = rVar2.O();
                if (O == v0Var) {
                    O = a.r(rVar2);
                }
                v.i iVar = (v.i) O;
                if ((i13 & 3670016) == 1048576) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                Object O2 = rVar2.O();
                if (z10 || O2 == v0Var) {
                    O2 = new u7.k4(a1Var, 26);
                    rVar2.k0(O2);
                }
                m.a(0, androidx.compose.foundation.a.e(fillElement, iVar, null, false, null, (df.a) O2, 28), rVar2);
            } else {
                rVar2.a0(-248242080);
            }
            rVar2.p(false);
            if (!((Boolean) a1Var.getValue()).booleanValue() || !z3 || e3Var2.m() || cVar == null) {
                z11 = false;
            }
            r b10 = x7.y0.b(e3Var2.p(), pVar.a(o.f15687a, c.B), rVar2);
            q.r0 r8 = q.e.r(0.8f, 520.0f, null, 4);
            Object O3 = rVar2.O();
            if (O3 == v0Var) {
                O3 = new f0(13);
                rVar2.k0(O3);
            }
            p0 a10 = androidx.compose.animation.k((df.l) O3, r8).a(androidx.compose.animation.d(q.e.r(0.8f, 520.0f, null, 4), 2));
            q.r0 r10 = q.e.r(1.0f, 800.0f, null, 4);
            Object O4 = rVar2.O();
            if (O4 == v0Var) {
                O4 = new f0(13);
                rVar2.k0(O4);
            }
            boolean z12 = z11;
            rVar = rVar2;
            ya.c(z12, b10, a10, androidx.compose.animation.m((df.l) O4, r10).a(androidx.compose.animation.c.e(q.e.r(1.0f, 800.0f, null, 4), 2)), null, h.d(1763334842, new e9(cVar, m3Var, i10, i11, a1Var, 0), rVar2), rVar, 196608, 16);
        } else {
            rVar = rVar2;
            rVar.U();
        }
        q1 t3 = rVar.t();
        if (t3 != null) {
            t3.f24332d = new df.p() { // from class: w7.f9
                @Override // df.p
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    n4.L0(p.this, m3Var, e3Var, i10, i11, z3, a1Var, a1Var2, (m) obj2, y.L(i12 | 1));
                    return pe.z.f22715a;
                }
            };
        }
    }

    public static final void M(u7.m3 m3Var, int i10, int i11, kotlin.jvm.internal.y yVar, n nVar, b1.v vVar, d dVar, e3 e3Var, int i12) {
        boolean z3;
        boolean z9;
        Bitmap h02;
        Bitmap h03;
        int i13;
        n nVar2 = nVar;
        int i14 = i12 * 2;
        int b10 = u7.a.b(i12);
        boolean k02 = m3Var.k0(i10, i11, i14, (Context) yVar.f19787u);
        boolean k03 = m3Var.k0(i10, i11, b10, (Context) yVar.f19787u);
        List s12 = m3Var.s1(i10, i11, i14, (Context) yVar.f19787u);
        List s13 = m3Var.s1(i10, i11, b10, (Context) yVar.f19787u);
        if (nVar2 == null || ((i13 = nVar2.f27463a) != i14 && i13 != b10)) {
            nVar2 = null;
        }
        if (!vVar.isEmpty() && i12 == m3Var.j(i10, i11)) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (k02 || k03 || !s12.isEmpty() || !s13.isEmpty() || nVar2 != null) {
            p j10 = dVar.p0().j();
            RectF rectF = new RectF(0.0f, 0.0f, Float.intBitsToFloat((int) (dVar.e() >> 32)), Float.intBitsToFloat((int) (dVar.e() & 4294967295L)));
            Paint paint = new Paint(2);
            if (z3) {
                z9 = k02;
                a(j10).saveLayer(0.0f, 0.0f, Float.intBitsToFloat((int) (dVar.e() >> 32)), Float.intBitsToFloat((int) (dVar.e() & 4294967295L)), null);
            } else {
                z9 = k02;
            }
            if (z9 && (h03 = m3Var.h0(i10, i11, i14, (Context) yVar.f19787u)) != null) {
                a(j10).drawBitmap(h03, (Rect) null, rectF, paint);
            }
            x0 x0Var = y0.f22611a;
            y0.c(a(j10), s12, Float.intBitsToFloat((int) (dVar.e() >> 32)), Float.intBitsToFloat((int) (dVar.e() & 4294967295L)));
            if (nVar2 != null && nVar2.f27463a == i14) {
                y0.d(((a) j10).f19463a, nVar2, Float.intBitsToFloat((int) (dVar.e() >> 32)), Float.intBitsToFloat((int) (dVar.e() & 4294967295L)));
            }
            if (k03 && (h02 = m3Var.h0(i10, i11, b10, (Context) yVar.f19787u)) != null) {
                ((a) j10).f19463a.drawBitmap(h02, (Rect) null, rectF, paint);
            }
            a aVar = (a) j10;
            y0.c(aVar.f19463a, s13, Float.intBitsToFloat((int) (dVar.e() >> 32)), Float.intBitsToFloat((int) (dVar.e() & 4294967295L)));
            if (nVar2 != null && nVar2.f27463a == b10) {
                y0.d(aVar.f19463a, nVar2, Float.intBitsToFloat((int) (dVar.e() >> 32)), Float.intBitsToFloat((int) (dVar.e() & 4294967295L)));
            }
            if (z3) {
                f1(aVar.f19463a, vVar, e3Var.f28145w.h(), Float.intBitsToFloat((int) (dVar.e() >> 32)), Float.intBitsToFloat((int) (dVar.e() & 4294967295L)));
                aVar.f19463a.restore();
            }
        }
    }

    public static final void M0(int i10, m mVar) {
        boolean z3;
        r rVar = (r) mVar;
        rVar.c0(62052130);
        if (i10 != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (rVar.R(i10 & 1, z3)) {
            r l10 = androidx.compose.foundation.layout.d.l(o.f15687a, 88, FacebookMediationAdapter.ERROR_FAILED_TO_PRESENT_AD);
            float f10 = 14;
            r a10 = wa.j7.a(l10, f0.e.a(f10));
            long j10 = r.f19515d;
            m.a(0, ya.a(androidx.compose.foundation.a.b(a10, r.c(j10, 0.04f), l0.f19495a), 1, r.c(j10, 0.06f), f0.e.a(f10)), rVar);
        } else {
            rVar.U();
        }
        q1 t3 = rVar.t();
        if (t3 != null) {
            t3.f24332d = new r5(i10, 1);
        }
    }

    public static final void N(d dVar, a1 a1Var, kotlin.jvm.internal.y yVar, u7.d dVar2) {
        if (kotlin.jvm.internal.l.a(dVar2.f26033a, (String) a1Var.getValue())) {
            return;
        }
        u7.e.H(a(dVar.p0().j()), (Context) yVar.f19787u, dVar2, Float.intBitsToFloat((int) (dVar.e() >> 32)), Float.intBitsToFloat((int) (dVar.e() & 4294967295L)));
    }

    public static final void N0(df.a aVar, e eVar, m mVar, int i10) {
        int i11;
        boolean z3;
        e eVar2;
        e a10;
        aVar.getClass();
        r rVar = (r) mVar;
        rVar.c0(2133733957);
        if (rVar.h(aVar)) {
            i11 = 4;
        } else {
            i11 = 2;
        }
        int i12 = i11 | i10 | 400;
        if ((i12 & 147) != 146) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (rVar.R(i12 & 1, z3)) {
            rVar.W();
            if ((i10 & 1) != 0 && !rVar.A()) {
                rVar.U();
                a10 = eVar;
            } else {
                a10 = wa.a();
            }
            rVar.q();
            rVar.a0(1818944011);
            String b10 = wa.n7.b(R.string.panel_gallery, rVar);
            rVar.p(false);
            float f10 = FacebookMediationAdapter.ERROR_FAILED_TO_PRESENT_AD;
            o oVar = o.f15687a;
            r l10 = androidx.compose.foundation.layout.d.l(oVar, 88, f10);
            float f11 = 14;
            r a11 = wa.j7.a(l10, f0.e.a(f11));
            long j10 = r.f19515d;
            r a12 = ya.a(androidx.compose.foundation.a.b(a11, r.c(j10, 0.07f), l0.f19495a), (float) 1.5d, r.c(j10, 0.18f), f0.e.a(f11));
            Object O = rVar.O();
            if (O == l.f24285a) {
                O = a.r(rVar);
            }
            r e8 = androidx.compose.foundation.a.e(a12, (v.i) O, null, false, null, aVar, 28);
            p0 d2 = m.d(c.f15674y, false);
            int hashCode = Long.hashCode(rVar.T);
            g l11 = rVar.l();
            r c10 = a.c(e8, rVar);
            h.f1471d.getClass();
            b0 b0Var = g.f1462b;
            rVar.e0();
            if (rVar.S) {
                rVar.k(b0Var);
            } else {
                rVar.n0();
            }
            f fVar = g.e;
            y.I(fVar, d2, rVar);
            f fVar2 = g.f1464d;
            y.I(fVar2, l11, rVar);
            f fVar3 = g.f1465f;
            if (rVar.S || !kotlin.jvm.internal.l.a(rVar.O(), Integer.valueOf(hashCode))) {
                a.t(hashCode, rVar, hashCode, fVar3);
            }
            f fVar4 = g.f1463c;
            y.I(fVar4, c10, rVar);
            r a13 = q.a(h.i(6), c.H, rVar, 54);
            int hashCode2 = Long.hashCode(rVar.T);
            g l12 = rVar.l();
            r c11 = a.c(oVar, rVar);
            rVar.e0();
            e eVar3 = a10;
            if (rVar.S) {
                rVar.k(b0Var);
            } else {
                rVar.n0();
            }
            y.I(fVar, a13, rVar);
            y.I(fVar2, l12, rVar);
            if (rVar.S || !kotlin.jvm.internal.l.a(rVar.O(), Integer.valueOf(hashCode2))) {
                a.t(hashCode2, rVar, hashCode2, fVar3);
            }
            y.I(fVar4, c11, rVar);
            y.b(eVar3, null, androidx.compose.foundation.layout.d.k(oVar, 24), r.c(j10, 0.7f), rVar, 3504, 0);
            eVar2 = eVar3;
            x1.b(b10, null, r.c(j10, 0.5f), ae.f(4294967296L, 9.5f), null, s.f23368z, null, 0L, null, 0L, 0, false, 0, 0, null, rVar, 196992, 0, 131026);
            rVar = rVar;
            rVar.p(true);
            rVar.p(true);
        } else {
            rVar.U();
            eVar2 = eVar;
        }
        q1 t3 = rVar.t();
        if (t3 != null) {
            t3.f24332d = new b8.l(i10, 9, aVar, eVar2);
        }
    }

    public static final boolean O(u7.b bVar) {
        if (bVar != null && bVar.b() == null && !kotlin.jvm.internal.l.a(bVar.f25918b, "empty_frame") && !bVar.f25924j && bVar.i) {
            return true;
        }
        return false;
    }

    public static final void O0(ma maVar, String str, df.a aVar, m mVar, int i10) {
        int i11;
        int i12;
        int i13;
        boolean z3;
        r rVar;
        boolean z9;
        boolean z10;
        Object l8Var;
        a1 a1Var;
        float f10;
        boolean z11;
        f fVar;
        ma maVar2 = maVar;
        maVar2.getClass();
        str.getClass();
        aVar.getClass();
        r rVar2 = (r) mVar;
        rVar2.c0(-93127752);
        if (rVar2.f(maVar2)) {
            i11 = 4;
        } else {
            i11 = 2;
        }
        int i14 = i10 | i11;
        if (rVar2.f(str)) {
            i12 = 32;
        } else {
            i12 = 16;
        }
        int i15 = i14 | i12;
        if (rVar2.h(aVar)) {
            i13 = 256;
        } else {
            i13 = 128;
        }
        int i16 = i15 | i13;
        if ((i16 & 147) != 146) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (rVar2.R(i16 & 1, z3)) {
            Context context = (Context) rVar2.j(AndroidCompositionLocals_androidKt.f642b);
            int i17 = i16 & 14;
            if (i17 == 4) {
                z9 = true;
            } else {
                z9 = false;
            }
            Object O = rVar2.O();
            v0 v0Var = l.f24285a;
            boolean z12 = z9;
            te.c cVar = null;
            if (z12 || O == v0Var) {
                O = y.B(null);
                rVar2.k0(O);
            }
            a1 a1Var2 = (a1) O;
            boolean f11 = rVar2.f(a1Var2) | rVar2.h(context);
            if (i17 == 4) {
                z10 = true;
            } else {
                z10 = false;
            }
            boolean z13 = z10 | f11;
            Object O2 = rVar2.O();
            if (!z13 && O2 != v0Var) {
                l8Var = O2;
                a1Var = a1Var2;
            } else {
                a1Var = a1Var2;
                l8Var = new l8(context, maVar, a1Var, cVar, 2);
                maVar2 = maVar;
                rVar2.k0(l8Var);
            }
            y.f((df.p) l8Var, maVar2, rVar2);
            Object O3 = rVar2.O();
            if (O3 == v0Var) {
                O3 = y.B(Boolean.FALSE);
                rVar2.k0(O3);
            }
            a1 a1Var3 = (a1) O3;
            if (((Boolean) a1Var3.getValue()).booleanValue()) {
                f10 = 0.95f;
            } else {
                f10 = 1.0f;
            }
            float f12 = FacebookMediationAdapter.ERROR_FACEBOOK_INITIALIZATION;
            o oVar = o.f15687a;
            r l10 = androidx.compose.foundation.layout.d.l(oVar, 88, f12);
            if ((i16 & 896) == 256) {
                z11 = true;
            } else {
                z11 = false;
            }
            Object O4 = rVar2.O();
            if (z11 || O4 == v0Var) {
                O4 = new g0.p0(a1Var3, 3, aVar);
                rVar2.k0(O4);
            }
            r b10 = d0.b(l10, maVar2, (PointerInputEventHandler) O4);
            boolean c10 = rVar2.c(f10);
            Object O5 = rVar2.O();
            if (c10 || O5 == v0Var) {
                O5 = new b8.n4(4, f10);
                rVar2.k0(O5);
            }
            float f13 = 13;
            r a10 = wa.j7.a(androidx.compose.ui.graphics.a(b10, (df.l) O5), f0.e.a(f13));
            long j10 = r.f19515d;
            long c11 = r.c(j10, 0.05f);
            k0 k0Var = l0.f19495a;
            r a11 = ya.a(androidx.compose.foundation.a.b(a10, c11, k0Var), 1, r.c(j10, 0.13f), f0.e.a(f13));
            p0 d2 = m.d(c.f15674y, false);
            int hashCode = Long.hashCode(rVar2.T);
            g l11 = rVar2.l();
            r c12 = a.c(a11, rVar2);
            h.f1471d.getClass();
            b0 b0Var = g.f1462b;
            rVar2.e0();
            if (rVar2.S) {
                rVar2.k(b0Var);
            } else {
                rVar2.n0();
            }
            f fVar2 = g.e;
            y.I(fVar2, d2, rVar2);
            f fVar3 = g.f1464d;
            y.I(fVar3, l11, rVar2);
            f fVar4 = g.f1465f;
            if (rVar2.S || !kotlin.jvm.internal.l.a(rVar2.O(), Integer.valueOf(hashCode))) {
                a.t(hashCode, rVar2, hashCode, fVar4);
            }
            f fVar5 = g.f1463c;
            y.I(fVar5, c12, rVar2);
            if (((l9) a1Var.getValue()) != null) {
                rVar2.a0(1662839407);
                r l12 = androidx.compose.foundation.layout.a.l(androidx.compose.foundation.layout.d.f506c, 8, 30);
                boolean f14 = rVar2.f(a1Var);
                Object O6 = rVar2.O();
                if (f14 || O6 == v0Var) {
                    O6 = new b8.a0(a1Var, 29);
                    rVar2.k0(O6);
                }
                ya.ta.a(l12, (df.l) O6, rVar2, 6);
                rVar2.p(false);
                fVar = fVar3;
            } else {
                rVar2.a0(1663114501);
                fVar = fVar3;
                m.a(6, androidx.compose.foundation.a.b(androidx.compose.foundation.layout.d.f506c, r.c(j10, 0.04f), k0Var), rVar2);
                rVar2.p(false);
            }
            r o10 = androidx.compose.foundation.layout.a.o(androidx.compose.foundation.layout.b.f501a.a(oVar, c.B), 0.0f, 0.0f, 0.0f, 8, 7);
            p0 d10 = m.d(c.f15670u, false);
            int hashCode2 = Long.hashCode(rVar2.T);
            g l13 = rVar2.l();
            r c13 = a.c(o10, rVar2);
            rVar2.e0();
            if (rVar2.S) {
                rVar2.k(b0Var);
            } else {
                rVar2.n0();
            }
            y.I(fVar2, d10, rVar2);
            y.I(fVar, l13, rVar2);
            if (rVar2.S || !kotlin.jvm.internal.l.a(rVar2.O(), Integer.valueOf(hashCode2))) {
                a.t(hashCode2, rVar2, hashCode2, fVar4);
            }
            y.I(fVar5, c13, rVar2);
            x1.b(str, null, r.c(j10, 0.8f), ae.f(4294967296L, 9.0f), null, null, null, 0L, null, 0L, 0, false, 0, 0, null, rVar2, ((i16 >> 3) & 14) | 384, 0, 131058);
            rVar = rVar2;
            rVar.p(true);
            rVar.p(true);
        } else {
            rVar = rVar2;
            rVar.U();
        }
        q1 t3 = rVar.t();
        if (t3 != null) {
            t3.f24332d = new b8.g(maVar, str, aVar, i10, 6);
        }
    }

    public static final void P(u7.m3 m3Var, a1 a1Var) {
        pe.j jVar;
        p4 p4Var = (p4) a1Var.getValue();
        if (p4Var == null) {
            return;
        }
        a1Var.setValue(null);
        float f10 = p4Var.f28892d;
        e1 e1Var = p4Var.f28899m;
        float h3 = e1Var.h() * f10;
        float h10 = e1Var.h() * p4Var.e;
        e1 e1Var2 = p4Var.f28902p;
        float d2 = wa.b9.d((e1Var2.h() - p4Var.f()) / h3, 0.0f, 1.0f);
        e1 e1Var3 = p4Var.f28904r;
        float d10 = wa.b9.d((e1Var3.h() - p4Var.f()) / h3, 0.0f, 1.0f);
        e1 e1Var4 = p4Var.f28903q;
        final float d11 = wa.b9.d((e1Var4.h() - p4Var.h()) / h10, 0.0f, 1.0f);
        e1 e1Var5 = p4Var.f28905s;
        final float d12 = wa.b9.d((e1Var5.h() - p4Var.h()) / h10, 0.0f, 1.0f);
        if (p4Var.i) {
            jVar = new pe.j(Float.valueOf(1.0f - d10), Float.valueOf(1.0f - d2));
        } else {
            jVar = new pe.j(Float.valueOf(d2), Float.valueOf(d10));
        }
        float floatValue = ((Number) jVar.f22693u).floatValue();
        float floatValue2 = ((Number) jVar.f22694v).floatValue();
        float h11 = (e1Var3.h() + e1Var2.h()) / 2.0f;
        float h12 = (e1Var5.h() + e1Var4.h()) / 2.0f;
        double d13 = p4Var.f28895h * 0.017453292519943295d;
        double cos = Math.cos(d13);
        double sin = Math.sin(d13);
        double d14 = h11;
        double d15 = h12;
        float f11 = (float) (((d14 * cos) - (d15 * sin)) + p4Var.f28893f);
        float f12 = (float) ((d15 * cos) + (d14 * sin) + p4Var.f28894g);
        final float d16 = wa.b9.d((e1Var3.h() - e1Var2.h()) / (p4Var.f28896j * 0.7f), 0.05f, 12.0f);
        final float d17 = wa.b9.d(floatValue, 0.0f, 1.0f);
        final float d18 = wa.b9.d(floatValue2, 0.0f, 1.0f);
        final float f13 = f11 / p4Var.f28897k;
        final float f14 = f12 / p4Var.f28898l;
        int i10 = p4Var.f28890b;
        int i11 = p4Var.f28891c;
        String str = p4Var.f28889a;
        str.getClass();
        m3Var.x0(i10, i11, str, new df.l() { // from class: u7.p2
            @Override // df.l
            public final Object invoke(Object obj) {
                b bVar = (b) obj;
                bVar.getClass();
                return a(bVar, null, null, f13, f14, d16, 0.0f, 0, false, false, null, null, null, false, d17, d11, d18, d12, null, 3702755);
            }
        });
    }

    public static final void P0(int i10, m mVar) {
        boolean z3;
        r rVar = (r) mVar;
        rVar.c0(-1291247171);
        if (i10 != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (rVar.R(i10 & 1, z3)) {
            r k3 = androidx.compose.foundation.layout.d.k(o.f15687a, 16);
            Object O = rVar.O();
            if (O == l.f24285a) {
                O = new f3(28);
                rVar.k0(O);
            }
            ya.ta.a(k3, (df.l) O, rVar, 54);
        } else {
            rVar.U();
        }
        q1 t3 = rVar.t();
        if (t3 != null) {
            t3.f24332d = new r5(i10, 14);
        }
    }

    public static final void Q(float f10, float f11, df.l lVar, int i10, int i11, a1 a1Var, u7.b bVar) {
        f fVar;
        float h3;
        if (O(bVar) && f10 > 0.0f && f11 > 0.0f && (fVar = (f) lVar.invoke(bVar.f25918b)) != null) {
            String str = bVar.f25917a;
            Bitmap bitmap = fVar.f19477a;
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            float f12 = bVar.f25919c * f10;
            float f13 = bVar.f25920d * f11;
            float f14 = bVar.f25921f;
            boolean z3 = bVar.f25929o;
            float f15 = f10 / 2.0f;
            p4 p4Var = new p4(str, i10, i11, width, height, f12, f13, f14, z3, f15, f10, f11);
            pe.j f16 = f.f(bVar, Integer.valueOf(width), Integer.valueOf(height));
            float floatValue = ((Number) f16.f22693u).floatValue();
            float floatValue2 = ((Number) f16.f22694v).floatValue();
            float f17 = ((f15 * 0.7f) / floatValue) * bVar.e;
            e1 e1Var = p4Var.f28899m;
            e1Var.i(f17);
            p4Var.f28902p.i((e1Var.h() * (-floatValue)) / 2.0f);
            p4Var.f28904r.i((e1Var.h() * floatValue) / 2.0f);
            p4Var.f28903q.i((e1Var.h() * (-floatValue2)) / 2.0f);
            p4Var.f28905s.i((e1Var.h() * floatValue2) / 2.0f);
            Rect c10 = f.c(width, height, bVar);
            float f18 = (c10.left + c10.right) / 2.0f;
            float f19 = (c10.top + c10.bottom) / 2.0f;
            float f20 = width / 2.0f;
            if (z3) {
                h3 = e1Var.h() * (f18 - f20);
            } else {
                h3 = (f20 - f18) * e1Var.h();
            }
            p4Var.f28900n.i(h3);
            p4Var.f28901o.i(e1Var.h() * ((height / 2.0f) - f19));
            a1Var.setValue(p4Var);
        }
    }

    public static final void Q0(int i10, m mVar) {
        boolean z3;
        r rVar = (r) mVar;
        rVar.c0(-1570255143);
        if (i10 != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (rVar.R(i10 & 1, z3)) {
            r k3 = androidx.compose.foundation.layout.d.k(o.f15687a, 18);
            Object O = rVar.O();
            if (O == l.f24285a) {
                O = new f3(24);
                rVar.k0(O);
            }
            ya.ta.a(k3, (df.l) O, rVar, 54);
        } else {
            rVar.U();
        }
        q1 t3 = rVar.t();
        if (t3 != null) {
            t3.f24332d = new r5(i10, 8);
        }
    }

    public static final boolean R(e3 e3Var) {
        return e3Var.c();
    }

    public static final void R0(d dVar, long j10, float f10, float f11, float f12, float f13) {
        h a10 = k.a();
        float f14 = f11 - f12;
        a10.h(f10, f14);
        a10.j(f10, f11, f10 + f12, f11);
        a10.j(f10, f11, f10, f11 + f12);
        a10.j(f10, f11, f10 - f12, f11);
        a10.j(f10, f11, f10, f14);
        a10.d();
        d.o0(dVar, a10, r.c(j10, f13), null, 60);
    }

    public static final long S(e3 e3Var) {
        return e3Var.l();
    }

    public static final void S0(a1 a1Var, long j10) {
        a1Var.setValue(new b(j10));
    }

    public static final void T(e3 e3Var, float f10) {
        e3Var.D(f10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:146:0x0870, code lost:
    
        if (r1 < 1) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x068b, code lost:
    
        r4.f19785u = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:224:0x06a0, code lost:
    
        r4.f19785u = -1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:105:0x0370, B:234:0x06e5], limit reached: 345 */
    /* JADX WARN: Path cross not found for [B:234:0x06e5, B:105:0x0370], limit reached: 345 */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0370  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x082c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:127:0x088b  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x08a2  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0f43  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x099a  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x06b8  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x07cf  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x07e4  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x06bb  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x1221  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x06e5  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x11fa  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0f23  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x110e  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0af8  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0dbf  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0d93  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0ad6  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0cac  */
    /* JADX WARN: Type inference failed for: r2v45, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v46, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v48, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v2, types: [r2] */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:175:0x0335 -> B:94:0x035d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x0f23 -> B:12:0x0f32). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:81:0x0ad6 -> B:55:0x0ae7). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object T0(b r62, u7.m3 r63, int r64, int r65, df.l r66, float r67, df.v r68, df.l r69, kotlin.jvm.internal.y r70, a1 r71, a1 r72, a1 r73, a1 r74, e1 r75, a1 r76, a1 r77, u7.b r78, u7.d r79, u7.c r80, float r81, float r82, float r83, ve.a r84) {
        /*
            Method dump skipped, instructions count: 4647
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w7.n4.T0(b, u7.m3, int, int, df.l, float, df.v, df.l, kotlin.jvm.internal.y, a1, a1, a1, a1, e1, a1, a1, u7.b, u7.d, u7.c, float, float, float, ve.a):java.lang.Object");
    }

    public static final boolean U(e3 e3Var) {
        return e3Var.e();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0546  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x04fb  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x050f  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0241 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x048c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00b7  */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:67:0x0242 -> B:10:0x025c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object U0(b r33, u7.m3 r34, int r35, int r36, df.l r37, float r38, df.v r39, a1 r40, b1.v r41, a1 r42, e1 r43, a1 r44, i5 r45, int r46, long r47, float r49, float r50, ve.a r51) {
        /*
            Method dump skipped, instructions count: 1374
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w7.n4.U0(b, u7.m3, int, int, df.l, float, df.v, a1, b1.v, a1, e1, a1, i5, int, long, float, float, ve.a):java.lang.Object");
    }

    public static final float V(e3 e3Var) {
        return e3Var.f28147y.h();
    }

    public static final pe.o V0(u7.m3 m3Var, int i10, int i11, df.l lVar, kotlin.jvm.internal.y yVar, float f10, float f11, float f12, float f13, float f14) {
        f fVar;
        Integer num;
        Integer num2;
        float f15;
        float f16;
        float f17;
        float f18;
        float f19;
        float f20;
        for (u7.a8 a8Var : qe.l.H(m3Var.g1(i10, i11))) {
            if (a8Var.c() && !a8Var.b()) {
                if (a8Var instanceof u7.w7) {
                    u7.b bVar = ((u7.w7) a8Var).f27004a;
                    if (bVar.b() != null) {
                        fVar = null;
                    } else {
                        fVar = (f) lVar.invoke(bVar.f25918b);
                    }
                    if (fVar != null) {
                        num = Integer.valueOf(fVar.f19477a.getWidth());
                    } else {
                        num = null;
                    }
                    if (fVar != null) {
                        num2 = Integer.valueOf(fVar.f19477a.getHeight());
                    } else {
                        num2 = null;
                    }
                    pe.j f21 = f.f(bVar, num, num2);
                    float floatValue = ((Number) f21.f22693u).floatValue();
                    float floatValue2 = ((Number) f21.f22694v).floatValue();
                    float f22 = ((f12 / 2.0f) * 0.7f) / floatValue;
                    float f23 = bVar.f25919c * f12;
                    float f24 = bVar.f25920d * f13;
                    float f25 = bVar.f25921f;
                    float f26 = bVar.e;
                    if (k(f10, f11, f23, f24, f25, ((floatValue * f22) * f26) / 2.0f, ((floatValue2 * f22) * f26) / 2.0f)) {
                        return new pe.o(bVar, null, null);
                    }
                } else if (a8Var instanceof u7.z7) {
                    u7.d dVar = ((u7.z7) a8Var).f27108a;
                    pe.j V = u7.e.V((Context) yVar.f19787u, dVar, f12, f13);
                    float floatValue3 = ((Number) V.f22693u).floatValue();
                    float floatValue4 = ((Number) V.f22694v).floatValue();
                    float f27 = dVar.f26037f * f12;
                    float f28 = dVar.f26038g * f13;
                    float f29 = dVar.i;
                    float f30 = floatValue3 + 8.0f;
                    if (f30 < 12.0f) {
                        f15 = 12.0f;
                    } else {
                        f15 = f30;
                    }
                    float f31 = floatValue4 + 6.0f;
                    if (f31 < 12.0f) {
                        f16 = 12.0f;
                        f18 = f11;
                        f17 = f10;
                    } else {
                        f16 = f31;
                        f17 = f10;
                        f18 = f11;
                    }
                    if (k(f17, f18, f27, f28, f29, f15, f16)) {
                        return new pe.o(null, dVar, null);
                    }
                } else if (a8Var instanceof u7.y7) {
                    u7.c cVar = ((u7.y7) a8Var).f27074a;
                    float f32 = cVar.i * f12;
                    float f33 = cVar.f25976j * f13;
                    float f34 = cVar.f25978l;
                    float f35 = cVar.f25974g * f14;
                    float f36 = cVar.f25977k;
                    float f37 = (f35 * f36) / 2.0f;
                    if (f37 < 12.0f) {
                        f37 = 12.0f;
                    }
                    float f38 = ((cVar.f25975h * f14) * f36) / 2.0f;
                    if (f38 < 12.0f) {
                        f38 = 12.0f;
                        f20 = f37;
                        f19 = f10;
                    } else {
                        f19 = f10;
                        f20 = f37;
                    }
                    if (k(f19, f11, f32, f33, f34, f20, f38)) {
                        return new pe.o(null, null, cVar);
                    }
                } else if (!(a8Var instanceof u7.x7)) {
                    l4.a.o();
                    return null;
                }
            }
        }
        return new pe.o(null, null, null);
    }

    public static final String W(e3 e3Var) {
        return (String) e3Var.f28148z.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object W0(b r6, android.view.View r7, t r8, ve.a r9) {
        /*
            boolean r0 = r9 instanceof u2
            if (r0 == 0) goto L13
            r0 = r9
            u2 r0 = (u2) r0
            int r1 = r0.f29178w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f29178w = r1
            goto L18
        L13:
            u2 r0 = new u2
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f29177v
            int r1 = r0.f29178w
            r2 = 1
            if (r1 == 0) goto L2e
            if (r1 != r2) goto L27
            android.view.View r7 = r0.f29176u
            pe.a.e(r9)
            goto L56
        L27:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            q.o(r6)
            r6 = 0
            return r6
        L2e:
            pe.a.e(r9)
            g0 r6 = (g0) r6
            c2.r2 r9 = d()
            float r9 = r9.f()
            c2.r2 r1 = d()
            long r3 = r1.b()
            v2 r1 = new v2
            r5 = 0
            r1.<init>(r8, r9, r5)
            r0.f29176u = r7
            r0.f29178w = r2
            java.lang.Object r9 = j(r3, r1, r0)
            ue.a r6 = ue.a.f27192u
            if (r9 != r6) goto L56
            return r6
        L56:
            java.lang.Integer r9 = (java.lang.Integer) r9
            if (r9 != 0) goto L67
            r7.getClass()
            boolean r6 = h.a()
            if (r6 == 0) goto L67
            r6 = 0
            r7.performHapticFeedback(r6)
        L67:
            if (r9 == 0) goto L6d
            int r2 = r9.intValue()
        L6d:
            java.lang.Integer r6 = new java.lang.Integer
            r6.<init>(r2)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: w7.n4.W0(b, android.view.View, t, ve.a):java.lang.Object");
    }

    public static final String X(e3 e3Var) {
        return e3Var.f();
    }

    public static final /* synthetic */ void X0(a1 a1Var) {
        C(a1Var, false);
    }

    public static final boolean Y(a1 a1Var) {
        return ((Boolean) a1Var.getValue()).booleanValue();
    }

    public static final float Z(e1 e1Var) {
        return e1Var.h();
    }

    public static final void a(final d dVar, m mVar, final int i10) {
        int i11;
        boolean z3;
        q1 t3;
        df.p pVar;
        dVar.getClass();
        r rVar = (r) mVar;
        rVar.c0(-464485159);
        if (rVar.f(dVar)) {
            i11 = 4;
        } else {
            i11 = 2;
        }
        int i12 = i11 | i10;
        if ((i12 & 3) != 2) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (rVar.R(i12 & 1, z3)) {
            if (((c) dVar.f28051a.getValue()) == c.IDLE) {
                t3 = rVar.t();
                if (t3 != null) {
                    final int i13 = 0;
                    pVar = new df.p(dVar, i10, i13) { // from class: w7.e

                        /* renamed from: u, reason: collision with root package name */
                        public final /* synthetic */ int f28111u;

                        /* renamed from: v, reason: collision with root package name */
                        public final /* synthetic */ d f28112v;

                        {
                            this.f28111u = i13;
                        }

                        @Override // df.p
                        public final Object invoke(Object obj, Object obj2) {
                            int i14 = this.f28111u;
                            m mVar2 = (m) obj;
                            ((Integer) obj2).getClass();
                            switch (i14) {
                                case 0:
                                    a(this.f28112v, mVar2, y.L(1));
                                    break;
                                default:
                                    a(this.f28112v, mVar2, y.L(1));
                                    break;
                            }
                            return pe.z.f22715a;
                        }
                    };
                    t3.f24332d = pVar;
                }
                return;
            }
            View view = (View) rVar.j(AndroidCompositionLocals_androidKt.f645f);
            androidx.lifecycle.w wVar = (androidx.lifecycle.w) rVar.j(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
            FillElement fillElement = androidx.compose.foundation.layout.d.f506c;
            Object O = rVar.O();
            if (O == l.f24285a) {
                O = h.f28326a;
                rVar.k0(O);
            }
            x.a(d0.b(fillElement, pe.z.f22715a, (PointerInputEventHandler) O), null, h.d(-1448049873, new r7.j(2, dVar, view, wVar), rVar), rVar, 3072);
        } else {
            rVar.U();
        }
        t3 = rVar.t();
        if (t3 != null) {
            final int i14 = 1;
            pVar = new df.p(dVar, i10, i14) { // from class: w7.e

                /* renamed from: u, reason: collision with root package name */
                public final /* synthetic */ int f28111u;

                /* renamed from: v, reason: collision with root package name */
                public final /* synthetic */ d f28112v;

                {
                    this.f28111u = i14;
                }

                @Override // df.p
                public final Object invoke(Object obj, Object obj2) {
                    int i142 = this.f28111u;
                    m mVar2 = (m) obj;
                    ((Integer) obj2).getClass();
                    switch (i142) {
                        case 0:
                            a(this.f28112v, mVar2, y.L(1));
                            break;
                        default:
                            a(this.f28112v, mVar2, y.L(1));
                            break;
                    }
                    return pe.z.f22715a;
                }
            };
            t3.f24332d = pVar;
        }
    }

    public static final void a0(a1 a1Var) {
        a1Var.setValue(qe.s.f24023u);
    }

    public static final void a1(a1 a1Var, String str) {
        a1Var.setValue(str);
    }

    public static final void b(final b1.v vVar, final long j10, final p pVar, final o1 o1Var, final boolean z3, final df.l lVar, final df.a aVar, final boolean z9, final r rVar, final df.a aVar2, m mVar, final int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        boolean z10;
        r rVar2;
        boolean z11;
        r rVar3;
        a1 a1Var;
        vVar.getClass();
        r rVar4 = (r) mVar;
        rVar4.c0(301796745);
        if (rVar4.f(vVar)) {
            i11 = 4;
        } else {
            i11 = 2;
        }
        int i21 = i10 | i11;
        if (rVar4.e(j10)) {
            i12 = 32;
        } else {
            i12 = 16;
        }
        int i22 = i21 | i12;
        if (rVar4.h(pVar)) {
            i13 = 256;
        } else {
            i13 = 128;
        }
        int i23 = i22 | i13;
        if (rVar4.h(o1Var)) {
            i14 = 2048;
        } else {
            i14 = 1024;
        }
        int i24 = i23 | i14;
        if (rVar4.g(z3)) {
            i15 = 16384;
        } else {
            i15 = 8192;
        }
        int i25 = i24 | i15;
        if (rVar4.h(lVar)) {
            i16 = 131072;
        } else {
            i16 = 65536;
        }
        int i26 = i25 | i16;
        if (rVar4.h(aVar)) {
            i17 = 1048576;
        } else {
            i17 = 524288;
        }
        int i27 = i26 | i17;
        if (rVar4.g(z9)) {
            i18 = 8388608;
        } else {
            i18 = 4194304;
        }
        int i28 = i27 | i18;
        if (rVar4.f(rVar)) {
            i19 = 67108864;
        } else {
            i19 = 33554432;
        }
        int i29 = i28 | i19;
        if (rVar4.h(aVar2)) {
            i20 = 536870912;
        } else {
            i20 = 268435456;
        }
        int i30 = i29 | i20;
        boolean z12 = false;
        if ((i30 & 306783379) != 306783378) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (rVar4.R(i30 & 1, z10)) {
            Object O = rVar4.O();
            v0 v0Var = l.f24285a;
            if (O == v0Var) {
                O = y.B(new r(j10));
                rVar4.k0(O);
            }
            a1 a1Var2 = (a1) O;
            r rVar5 = new r(j10);
            Boolean valueOf = Boolean.valueOf(z3);
            if ((i30 & 57344) == 16384) {
                z11 = true;
            } else {
                z11 = false;
            }
            boolean z13 = z11;
            if ((i30 & 112) == 32) {
                z12 = true;
            }
            boolean z14 = z13 | z12;
            Object O2 = rVar4.O();
            if (!z14 && O2 != v0Var) {
                rVar3 = rVar5;
                a1Var = a1Var2;
            } else {
                rVar3 = rVar5;
                a1Var = a1Var2;
                n nVar = new n(z3, j10, a1Var, null);
                rVar4.k0(nVar);
                O2 = nVar;
            }
            y.g(rVar3, valueOf, (df.p) O2, rVar4);
            final a1 a1Var3 = a1Var;
            rVar2 = rVar4;
            ya.c(z3, null, androidx.compose.animation.d(null, 3).a(androidx.compose.animation.c(null, 15)), androidx.compose.animation.c.e(null, 3).a(androidx.compose.animation.i(null, 15)), null, h.d(2124496817, new df.q() { // from class: w7.l
                /* JADX WARN: Removed duplicated region for block: B:100:0x0453  */
                /* JADX WARN: Removed duplicated region for block: B:107:0x047e  */
                /* JADX WARN: Removed duplicated region for block: B:120:0x0522  */
                /* JADX WARN: Removed duplicated region for block: B:123:0x0577  */
                /* JADX WARN: Removed duplicated region for block: B:126:0x0589  */
                /* JADX WARN: Removed duplicated region for block: B:129:0x05c7  */
                /* JADX WARN: Removed duplicated region for block: B:137:0x0602  */
                /* JADX WARN: Removed duplicated region for block: B:156:0x067c  */
                /* JADX WARN: Removed duplicated region for block: B:159:0x06ab A[ADDED_TO_REGION] */
                /* JADX WARN: Removed duplicated region for block: B:163:0x06c1  */
                /* JADX WARN: Removed duplicated region for block: B:166:0x06d3 A[ADDED_TO_REGION] */
                /* JADX WARN: Removed duplicated region for block: B:170:0x0705 A[ADDED_TO_REGION] */
                /* JADX WARN: Removed duplicated region for block: B:173:0x0740 A[ADDED_TO_REGION] */
                /* JADX WARN: Removed duplicated region for block: B:177:0x07b9 A[ADDED_TO_REGION] */
                /* JADX WARN: Removed duplicated region for block: B:181:0x084f  */
                /* JADX WARN: Removed duplicated region for block: B:184:0x0866  */
                /* JADX WARN: Removed duplicated region for block: B:188:0x0882  */
                /* JADX WARN: Removed duplicated region for block: B:207:0x08f7  */
                /* JADX WARN: Removed duplicated region for block: B:209:0x0853  */
                /* JADX WARN: Removed duplicated region for block: B:215:0x06c3  */
                /* JADX WARN: Removed duplicated region for block: B:217:0x0684  */
                /* JADX WARN: Removed duplicated region for block: B:231:0x092a A[SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:261:0x05cb  */
                /* JADX WARN: Removed duplicated region for block: B:262:0x058b  */
                /* JADX WARN: Removed duplicated region for block: B:263:0x0532  */
                /* JADX WARN: Removed duplicated region for block: B:266:0x0495  */
                /* JADX WARN: Removed duplicated region for block: B:268:0x0457  */
                /* JADX WARN: Removed duplicated region for block: B:270:0x0418  */
                /* JADX WARN: Removed duplicated region for block: B:272:0x03cb  */
                /* JADX WARN: Removed duplicated region for block: B:273:0x0399  */
                /* JADX WARN: Removed duplicated region for block: B:275:0x02c4  */
                /* JADX WARN: Removed duplicated region for block: B:276:0x02a3  */
                /* JADX WARN: Removed duplicated region for block: B:60:0x02a0  */
                /* JADX WARN: Removed duplicated region for block: B:63:0x02ba  */
                /* JADX WARN: Removed duplicated region for block: B:66:0x02e4  */
                /* JADX WARN: Removed duplicated region for block: B:69:0x02f7  */
                /* JADX WARN: Removed duplicated region for block: B:72:0x030d  */
                /* JADX WARN: Removed duplicated region for block: B:75:0x0320  */
                /* JADX WARN: Removed duplicated region for block: B:82:0x0388  */
                /* JADX WARN: Removed duplicated region for block: B:85:0x03c5  */
                /* JADX WARN: Removed duplicated region for block: B:93:0x0414  */
                @Override // df.q
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object b(java.lang.Object r69, java.lang.Object r70, java.lang.Object r71) {
                    /*
                        Method dump skipped, instructions count: 2646
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: w7.l.b(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
                }
            }, rVar4), rVar2, ((i30 >> 12) & 14) | 200064, 18);
        } else {
            rVar2 = rVar4;
            rVar2.U();
        }
        q1 t3 = rVar2.t();
        if (t3 != null) {
            t3.f24332d = new df.p(j10, pVar, o1Var, z3, lVar, aVar, z9, rVar, aVar2, i10) { // from class: w7.m
                public final /* synthetic */ df.a A;
                public final /* synthetic */ boolean B;
                public final /* synthetic */ r C;
                public final /* synthetic */ df.a D;

                /* renamed from: v, reason: collision with root package name */
                public final /* synthetic */ long f28660v;

                /* renamed from: w, reason: collision with root package name */
                public final /* synthetic */ p f28661w;

                /* renamed from: x, reason: collision with root package name */
                public final /* synthetic */ o1 f28662x;

                /* renamed from: y, reason: collision with root package name */
                public final /* synthetic */ boolean f28663y;

                /* renamed from: z, reason: collision with root package name */
                public final /* synthetic */ df.l f28664z;

                @Override // df.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int L = y.L(1);
                    n4.b(b1.v.this, this.f28660v, this.f28661w, this.f28662x, this.f28663y, this.f28664z, this.A, this.B, this.C, this.D, (m) obj, L);
                    return pe.z.f22715a;
                }
            };
        }
    }

    public static final Integer b0(a1 a1Var) {
        return (Integer) a1Var.getValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:122:0x03ba, code lost:
    
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x01bf, code lost:
    
        qe.m.k();
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x01c2, code lost:
    
        throw r35;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:110:0x03e8  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x012b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0177 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:146:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0323 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x03e3  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0402  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x040c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:104:0x012c -> B:10:0x013f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b1(b r35, b1.v r36, android.view.View r37, b1.v r38, u7.m3 r39, int r40, int r41, a1 r42, a1 r43, df.l r44, kotlin.jvm.internal.y r45, a1 r46, a1 r47, a1 r48, t r49, df.l r50, float r51, float r52, float r53, ve.a r54) {
        /*
            Method dump skipped, instructions count: 1161
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w7.n4.b1(b, b1.v, android.view.View, b1.v, u7.m3, int, int, a1, a1, df.l, kotlin.jvm.internal.y, a1, a1, a1, t, df.l, float, float, float, ve.a):java.lang.Object");
    }

    public static final boolean c(a1 a1Var) {
        return ((Boolean) a1Var.getValue()).booleanValue();
    }

    public static final Bitmap c0(n2 n2Var) {
        return (Bitmap) n2Var.getValue();
    }

    public static final r c1(Bitmap bitmap, x xVar, long j10) {
        if (bitmap != null && xVar != null) {
            long E2 = xVar.E(j10);
            float intBitsToFloat = Float.intBitsToFloat((int) (E2 >> 32)) / ((int) (xVar.k() >> 32));
            float intBitsToFloat2 = Float.intBitsToFloat((int) (E2 & 4294967295L)) / ((int) (4294967295L & xVar.k()));
            if (0.0f <= intBitsToFloat && intBitsToFloat <= 1.0f && 0.0f <= intBitsToFloat2 && intBitsToFloat2 <= 1.0f) {
                return new r(l0.c(bitmap.getPixel(wa.b9.e((int) (intBitsToFloat * (bitmap.getWidth() - 1)), 0, bitmap.getWidth() - 1), wa.b9.e((int) (intBitsToFloat2 * (bitmap.getHeight() - 1)), 0, bitmap.getHeight() - 1))));
            }
            return null;
        }
        return null;
    }

    public static final int d(a1 a1Var) {
        return ((Number) a1Var.getValue()).intValue();
    }

    public static final Bitmap d0(n2 n2Var) {
        return (Bitmap) n2Var.getValue();
    }

    public static final n d1(int i10, boolean z3, boolean z9, boolean z10, int i11, float f10, ArrayList arrayList, List list, List list2) {
        int size;
        a aVar;
        float f11;
        int i12;
        float f12;
        x0 x0Var = y0.f22611a;
        if (!w.a() || (size = arrayList.size()) == 0) {
            return null;
        }
        if (z3) {
            aVar = a.PENCIL;
        } else if (z9) {
            aVar = a.HIGHLIGHTER;
        } else if (z10) {
            aVar = a.MARKER;
        } else {
            aVar = a.PEN;
        }
        a aVar2 = aVar;
        if (z9) {
            f11 = 2.5f;
        } else if (z3) {
            f11 = 0.75f;
        } else if (z10) {
            f11 = 1.5f;
        } else {
            f11 = 1.0f;
        }
        float f13 = 2048;
        float f14 = ((((f13 / f13) * 3.6864f) * f10) * f11) / f13;
        float[] fArr = new float[size];
        float[] fArr2 = new float[size];
        int[] iArr = new int[size];
        float[] fArr3 = new float[size];
        int i13 = -1;
        for (int i14 = 0; i14 < size; i14++) {
            fArr[i14] = wa.b9.d(Float.intBitsToFloat((int) (((b) arrayList.get(i14)).f18762a >> 32)), 0.0f, 1.0f);
            fArr2[i14] = wa.b9.d(Float.intBitsToFloat((int) (((b) arrayList.get(i14)).f18762a & 4294967295L)), 0.0f, 1.0f);
            Integer num = (Integer) qe.l.y(i14, list2);
            if (num != null) {
                i12 = num.intValue();
            } else {
                i12 = i14;
            }
            i13++;
            if (i12 >= i13) {
                i13 = i12;
            }
            iArr[i14] = i13;
            Float f15 = (Float) qe.l.y(i14, list);
            if (f15 != null) {
                if (f15.floatValue() <= 0.0f) {
                    f15 = null;
                }
                if (f15 != null) {
                    f12 = f15.floatValue();
                    fArr3[i14] = f12;
                }
            }
            f12 = 1.0f;
            fArr3[i14] = f12;
        }
        return new n(i10, aVar2, i11, f14, false, fArr, fArr2, iArr, fArr3);
    }

    public static final long e(a1 a1Var) {
        return ((b) a1Var.getValue()).f18762a;
    }

    public static final ArrayList e0(u7.m3 m3Var, int i10, int i11, df.l lVar, kotlin.jvm.internal.y yVar, b1.v vVar, float f10, float f11, float f12) {
        ArrayList f02 = f0(m3Var, i10, i11, lVar, yVar, f10, f11, f12);
        ArrayList arrayList = new ArrayList();
        int size = f02.size();
        int i12 = 0;
        while (i12 < size) {
            Object obj = f02.get(i12);
            i12++;
            if (vVar.contains(((f5) obj).f28218a)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final void e1(Context context, Uri uri) {
        try {
            String lastPathSegment = uri.getLastPathSegment();
            if (lastPathSegment != null) {
                int lastIndexOf = lastPathSegment.lastIndexOf(47, lastPathSegment.length() - 1);
                if (lastIndexOf != -1) {
                    lastPathSegment = lastPathSegment.substring(lastIndexOf + 1, lastPathSegment.length());
                }
                new File(new File(context.getCacheDir(), "camera"), lastPathSegment).delete();
            }
        } catch (Exception unused) {
        }
    }

    public static final void f(a1 a1Var, a1 a1Var2, a1 a1Var3) {
        a1Var.setValue(Long.valueOf(System.currentTimeMillis()));
        Boolean bool = Boolean.FALSE;
        a1Var2.setValue(bool);
        a1Var3.setValue(bool);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [f5] */
    /* JADX WARN: Type inference failed for: r11v2, types: [f5] */
    /* JADX WARN: Type inference failed for: r13v2, types: [f5] */
    public static final ArrayList f0(u7.m3 m3Var, int i10, int i11, df.l lVar, kotlin.jvm.internal.y yVar, float f10, float f11, float f12) {
        ArrayList arrayList;
        float f13;
        float f14;
        Integer num;
        float f15;
        float f16;
        f fVar;
        Integer num2;
        float f17 = f10;
        List H = qe.l.H(m3Var.g1(i10, i11));
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : H) {
            u7.a8 a8Var = (u7.a8) obj;
            if (a8Var.c() && !a8Var.b()) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        int size = arrayList2.size();
        int i12 = 0;
        while (i12 < size) {
            Object obj2 = arrayList2.get(i12);
            i12++;
            u7.a8 a8Var2 = (u7.a8) obj2;
            Integer num3 = null;
            if (a8Var2 instanceof u7.w7) {
                u7.b bVar = ((u7.w7) a8Var2).f27004a;
                if (bVar.b() != null) {
                    fVar = null;
                } else {
                    fVar = (f) lVar.invoke(bVar.f25918b);
                }
                if (fVar != null) {
                    num2 = Integer.valueOf(fVar.f19477a.getWidth());
                } else {
                    num2 = null;
                }
                if (fVar != null) {
                    num3 = Integer.valueOf(fVar.f19477a.getHeight());
                }
                pe.j f18 = f.f(bVar, num2, num3);
                float floatValue = ((Number) f18.f22693u).floatValue();
                float floatValue2 = ((Number) f18.f22694v).floatValue();
                float f19 = ((f17 / 2.0f) * 0.7f) / floatValue;
                String str = bVar.f25917a;
                g5 g5Var = g5.IMAGE;
                float f20 = bVar.f25919c;
                float f21 = bVar.f25920d;
                arrayList = arrayList2;
                float f22 = bVar.e;
                num3 = new f5(str, g5Var, f20 * f17, f21 * f11, ((floatValue * f19) * f22) / 2.0f, ((floatValue2 * f19) * f22) / 2.0f, bVar.f25921f, f20, f21, f22);
            } else {
                arrayList = arrayList2;
                if (a8Var2 instanceof u7.z7) {
                    u7.d dVar = ((u7.z7) a8Var2).f27108a;
                    pe.j V = u7.e.V((Context) yVar.f19787u, dVar, f17, f11);
                    float floatValue3 = ((Number) V.f22693u).floatValue();
                    float floatValue4 = ((Number) V.f22694v).floatValue();
                    String str2 = dVar.f26033a;
                    g5 g5Var2 = g5.TEXT;
                    float f23 = dVar.f26037f;
                    float f24 = f23 * f17;
                    float f25 = dVar.f26038g;
                    float f26 = f25 * f11;
                    float f27 = floatValue3 + 8.0f;
                    if (f27 < 12.0f) {
                        f15 = 12.0f;
                    } else {
                        f15 = f27;
                    }
                    float f28 = floatValue4 + 6.0f;
                    if (f28 < 12.0f) {
                        f16 = 12.0f;
                    } else {
                        f16 = f28;
                    }
                    num = new f5(str2, g5Var2, f24, f26, f15, f16, dVar.i, f23, f25, dVar.f26039h);
                } else if (a8Var2 instanceof u7.y7) {
                    u7.c cVar = ((u7.y7) a8Var2).f27074a;
                    String str3 = cVar.f25969a;
                    g5 g5Var3 = g5.SHAPE;
                    float f29 = cVar.i;
                    float f30 = f29 * f17;
                    float f31 = cVar.f25976j;
                    float f32 = f31 * f11;
                    float f33 = cVar.f25974g * f12;
                    float f34 = cVar.f25977k;
                    float f35 = (f33 * f34) / 2.0f;
                    if (f35 < 12.0f) {
                        f13 = 12.0f;
                    } else {
                        f13 = f35;
                    }
                    float f36 = ((cVar.f25975h * f12) * f34) / 2.0f;
                    if (f36 < 12.0f) {
                        f14 = 12.0f;
                    } else {
                        f14 = f36;
                    }
                    num = new f5(str3, g5Var3, f30, f32, f13, f14, cVar.f25978l, f29, f31, f34);
                } else if (!(a8Var2 instanceof u7.x7)) {
                    l4.a.o();
                    return null;
                }
                num3 = num;
            }
            if (num3 != null) {
                arrayList3.add(num3);
            }
            arrayList2 = arrayList;
            f17 = f10;
        }
        return arrayList3;
    }

    public static void f1(Canvas canvas, List list, float f10, float f11, float f12) {
        canvas.getClass();
        list.getClass();
        if (!list.isEmpty() && f11 > 0.0f && f12 > 0.0f) {
            float f13 = 2048;
            float f14 = ((((f13 / f13) * 3.6864f) * f10) / f13) * f11;
            if (f14 < 1.0f) {
                f14 = 1.0f;
            }
            Paint paint = new Paint(1);
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
            paint.setStrokeCap(Paint.Cap.ROUND);
            paint.setStrokeJoin(Paint.Join.ROUND);
            paint.setStrokeWidth(f14);
            if (list.size() == 1) {
                paint.setStyle(Paint.Style.FILL);
                canvas.drawCircle(Float.intBitsToFloat((int) (((b) list.get(0)).f18762a >> 32)) * f11, Float.intBitsToFloat((int) (((b) list.get(0)).f18762a & 4294967295L)) * f12, f14 / 2.0f, paint);
                return;
            }
            paint.setStyle(Paint.Style.STROKE);
            Path path = new Path();
            path.moveTo(Float.intBitsToFloat((int) (((b) list.get(0)).f18762a >> 32)) * f11, Float.intBitsToFloat((int) (((b) list.get(0)).f18762a & 4294967295L)) * f12);
            int size = list.size();
            for (int i10 = 1; i10 < size; i10++) {
                path.lineTo(Float.intBitsToFloat((int) (((b) list.get(i10)).f18762a >> 32)) * f11, Float.intBitsToFloat((int) (((b) list.get(i10)).f18762a & 4294967295L)) * f12);
            }
            canvas.drawPath(path, paint);
        }
    }

    public static final int g(float f10, b1.v vVar, a1 a1Var, int i10) {
        int b10 = ff.a.b(Float.intBitsToFloat((int) (e(a1Var) >> 32)) / f10) + i10;
        int size = vVar.size() - 1;
        if (size < 0) {
            size = 0;
        }
        return wa.b9.e(b10, 0, size);
    }

    public static final void g0(final p pVar, final e3 e3Var, final boolean z3, final boolean z9, final df.a aVar, final df.a aVar2, final m0 m0Var, final m0 m0Var2, m mVar, final int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        pVar.getClass();
        aVar.getClass();
        aVar2.getClass();
        r rVar = (r) mVar;
        rVar.c0(-1702053913);
        if ((i10 & 6) == 0) {
            if (rVar.f(pVar)) {
                i20 = 4;
            } else {
                i20 = 2;
            }
            i11 = i20 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if (rVar.f(e3Var)) {
                i19 = 32;
            } else {
                i19 = 16;
            }
            i11 |= i19;
        }
        if ((i10 & 384) == 0) {
            if (rVar.g(z3)) {
                i18 = 256;
            } else {
                i18 = 128;
            }
            i11 |= i18;
        }
        if ((i10 & 3072) == 0) {
            if (rVar.g(z9)) {
                i17 = 2048;
            } else {
                i17 = 1024;
            }
            i11 |= i17;
        }
        boolean z10 = false;
        if ((i10 & 24576) == 0) {
            if (rVar.g(false)) {
                i16 = 16384;
            } else {
                i16 = 8192;
            }
            i11 |= i16;
        }
        if ((196608 & i10) == 0) {
            if (rVar.h(aVar)) {
                i15 = 131072;
            } else {
                i15 = 65536;
            }
            i11 |= i15;
        }
        if ((1572864 & i10) == 0) {
            if (rVar.h(aVar2)) {
                i14 = 1048576;
            } else {
                i14 = 524288;
            }
            i11 |= i14;
        }
        if ((12582912 & i10) == 0) {
            if (rVar.h(m0Var)) {
                i13 = 8388608;
            } else {
                i13 = 4194304;
            }
            i11 |= i13;
        }
        if ((100663296 & i10) == 0) {
            if (rVar.h(m0Var2)) {
                i12 = 67108864;
            } else {
                i12 = 33554432;
            }
            i11 |= i12;
        }
        if ((38347923 & i11) != 38347922) {
            z10 = true;
        }
        if (rVar.R(i11 & 1, z10)) {
            a(c2.p1.f3606h.a(q1(r1(rVar), rVar)), h.d(-1973437273, new df.p(e3Var, aVar, aVar2, z3, m0Var, z9, m0Var2) { // from class: w7.k4
                public final /* synthetic */ m0 A;

                /* renamed from: v, reason: collision with root package name */
                public final /* synthetic */ e3 f28569v;

                /* renamed from: w, reason: collision with root package name */
                public final /* synthetic */ df.a f28570w;

                /* renamed from: x, reason: collision with root package name */
                public final /* synthetic */ boolean f28571x;

                /* renamed from: y, reason: collision with root package name */
                public final /* synthetic */ m0 f28572y;

                /* renamed from: z, reason: collision with root package name */
                public final /* synthetic */ boolean f28573z;

                {
                    this.f28571x = z3;
                    this.f28572y = m0Var;
                    this.f28573z = z9;
                    this.A = m0Var2;
                }

                @Override // df.p
                public final Object invoke(Object obj, Object obj2) {
                    boolean z11;
                    long c10;
                    long c11;
                    m mVar2 = (m) obj;
                    int intValue = ((Integer) obj2).intValue();
                    if ((intValue & 3) != 2) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    r rVar2 = (r) mVar2;
                    if (rVar2.R(intValue & 1, z11)) {
                        o oVar = o.f15687a;
                        float f10 = 24;
                        r l10 = androidx.compose.foundation.layout.a.l(p.this.a(androidx.compose.foundation.layout.d(oVar, 1.0f), c.f15671v), f10, f10);
                        e3 e3Var2 = this.f28569v;
                        boolean f11 = rVar2.f(e3Var2);
                        Object O = rVar2.O();
                        v0 v0Var = l.f24285a;
                        if (f11 || O == v0Var) {
                            O = new j3(e3Var2, 10);
                            rVar2.k0(O);
                        }
                        r d2 = androidx.compose.ui.layout.a.d(l10, (df.l) O);
                        j jVar = c.f15670u;
                        p0 d10 = m.d(jVar, false);
                        int hashCode = Long.hashCode(rVar2.T);
                        g l11 = rVar2.l();
                        r c12 = a.c(d2, rVar2);
                        h.f1471d.getClass();
                        b0 b0Var = g.f1462b;
                        rVar2.e0();
                        if (rVar2.S) {
                            rVar2.k(b0Var);
                        } else {
                            rVar2.n0();
                        }
                        f fVar = g.e;
                        y.I(fVar, d10, rVar2);
                        f fVar2 = g.f1464d;
                        y.I(fVar2, l11, rVar2);
                        f fVar3 = g.f1465f;
                        if (rVar2.S || !kotlin.jvm.internal.l.a(rVar2.O(), Integer.valueOf(hashCode))) {
                            a.t(hashCode, rVar2, hashCode, fVar3);
                        }
                        f fVar4 = g.f1463c;
                        y.I(fVar4, c12, rVar2);
                        j jVar2 = c.f15672w;
                        androidx.compose.foundation.layout.b bVar = androidx.compose.foundation.layout.b.f501a;
                        r k3 = androidx.compose.foundation.layout.d.k(bVar.a(oVar, jVar2), 28);
                        long c13 = l0.c(1711276032);
                        f0.d dVar = f0.e.f16629a;
                        r b10 = androidx.compose.foundation.a.b(k3, c13, dVar);
                        float f12 = 1;
                        h1.a(this.f28570w, ya.a(b10, f12, l0.c(587202559), dVar), false, null, n4.f28766c, rVar2, 196608, 28);
                        rVar2.a0(254480629);
                        rVar2.p(false);
                        float f13 = 12;
                        r a10 = ya.a(androidx.compose.foundation.a.b(bVar.a(oVar, jVar), l0.c(1711276032), f0.e.a(f13)), f12, l0.c(587202559), f0.e.a(f13));
                        float f14 = 4;
                        r m4 = androidx.compose.foundation.layout.a.m(a10, 0.0f, f14, 1);
                        r a11 = q.a(h.i(f14), c.H, rVar2, 54);
                        int hashCode2 = Long.hashCode(rVar2.T);
                        g l12 = rVar2.l();
                        r c14 = a.c(m4, rVar2);
                        rVar2.e0();
                        if (rVar2.S) {
                            rVar2.k(b0Var);
                        } else {
                            rVar2.n0();
                        }
                        y.I(fVar, a11, rVar2);
                        y.I(fVar2, l12, rVar2);
                        if (rVar2.S || !kotlin.jvm.internal.l.a(rVar2.O(), Integer.valueOf(hashCode2))) {
                            a.t(hashCode2, rVar2, hashCode2, fVar3);
                        }
                        y.I(fVar4, c14, rVar2);
                        boolean z12 = this.f28571x;
                        if (z12) {
                            c10 = r.f19515d;
                        } else {
                            c10 = r.c(r.f19515d, 0.3f);
                        }
                        long j10 = c10;
                        long f15 = ae.f(4294967296L, 20.0f);
                        s sVar = s.B;
                        r a12 = wa.a(oVar, 90.0f);
                        m0 m0Var3 = this.f28572y;
                        boolean f16 = rVar2.f(m0Var3);
                        Object O2 = rVar2.O();
                        if (f16 || O2 == v0Var) {
                            O2 = new c(29, m0Var3);
                            rVar2.k0(O2);
                        }
                        r f17 = androidx.compose.foundation.a.f(null, z12, a12, (df.a) O2, 6);
                        float f18 = 8;
                        x1.b("↩", androidx.compose.foundation.layout.a.l(f17, f18, f18), j10, f15, null, sVar, null, 0L, null, 0L, 0, false, 0, 0, null, rVar2, 196614, 0, 131024);
                        boolean z13 = this.f28573z;
                        if (z13) {
                            c11 = r.f19515d;
                        } else {
                            c11 = r.c(r.f19515d, 0.3f);
                        }
                        long j11 = c11;
                        long f19 = ae.f(4294967296L, 20.0f);
                        r a13 = wa.a(oVar, 90.0f);
                        m0 m0Var4 = this.A;
                        boolean f20 = rVar2.f(m0Var4);
                        Object O3 = rVar2.O();
                        if (f20 || O3 == v0Var) {
                            O3 = new m4(0, m0Var4);
                            rVar2.k0(O3);
                        }
                        x1.b("↪", androidx.compose.foundation.layout.a.l(androidx.compose.foundation.a.f(null, z13, a13, (df.a) O3, 6), f18, f18), j11, f19, null, sVar, null, 0L, null, 0L, 0, false, 0, 0, null, rVar2, 196614, 0, 131024);
                        rVar2.p(true);
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
            t3.f24332d = new df.p() { // from class: w7.l4
                @Override // df.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    n4.g0(p.this, e3Var, z3, z9, aVar, aVar2, m0Var, m0Var2, (m) obj, y.L(i10 | 1));
                    return pe.z.f22715a;
                }
            };
        }
    }

    public static final void g1(Canvas canvas, ArrayList arrayList, e5 e5Var, float f10, float f11, float f12) {
        canvas.getClass();
        float f13 = e5Var.f28157c;
        float f14 = e5Var.f28156b;
        float f15 = e5Var.f28155a;
        float f16 = e5Var.f28158d;
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(0.75f * f12);
        paint.setColor(Color.argb(150, 26, 86, 204));
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            h1(canvas, (f5) obj, paint);
        }
        Paint paint2 = new Paint(1);
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        paint2.setStrokeWidth(f12);
        paint2.setColor(Color.argb(230, 26, 86, 204));
        canvas.drawRect(e5Var.f28155a, e5Var.f28156b, e5Var.f28157c, e5Var.f28158d, paint2);
        Paint paint3 = new Paint(1);
        paint3.setStyle(Paint.Style.FILL);
        paint3.setColor(-1);
        paint3.setShadowLayer(3.0f, 0.0f, 1.0f, Color.argb(90, 0, 0, 0));
        Paint paint4 = new Paint(1);
        paint4.setStyle(style);
        paint4.setStrokeWidth(f12);
        paint4.setColor(Color.argb(255, 26, 86, 204));
        for (pe.j jVar : qe.m.h(new pe.j(Float.valueOf(f15), Float.valueOf(f14)), new pe.j(Float.valueOf(f13), Float.valueOf(f14)), new pe.j(Float.valueOf(f13), Float.valueOf(f16)), new pe.j(Float.valueOf(f15), Float.valueOf(f16)))) {
            float floatValue = ((Number) jVar.f22693u).floatValue();
            float floatValue2 = ((Number) jVar.f22694v).floatValue();
            canvas.drawCircle(floatValue, floatValue2, f10, paint3);
            canvas.drawCircle(floatValue, floatValue2, f10, paint4);
        }
        float f17 = f16 + f11;
        canvas.drawLine(e5Var.a(), e5Var.f28158d, e5Var.a(), f17 - f10, paint4);
        canvas.drawCircle(e5Var.a(), f17, f10, paint3);
        canvas.drawCircle(e5Var.a(), f17, f10, paint4);
    }

    public static final boolean h(float f10, float f11, a1 a1Var, a1 a1Var2, a1 a1Var3, a1 a1Var4, a1 a1Var5) {
        x xVar;
        x xVar2;
        if (((Integer) a1Var.getValue()) != null && (xVar = (x) a1Var2.getValue()) != null && (xVar2 = (x) a1Var3.getValue()) != null) {
            long h3 = b.h(b.h(((b) a1Var4.getValue()).f18762a, e(a1Var5)), (Float.floatToRawIntBits(f10) << 32) | (Float.floatToRawIntBits(f10) & 4294967295L));
            long d2 = xVar.d(xVar2, 0L);
            float k3 = ((int) (xVar2.k() >> 32)) / 2.0f;
            if (b.d(b.g(h3, b.h(d2, (Float.floatToRawIntBits(((int) (xVar2.k() & 4294967295L)) / 2.0f) & 4294967295L) | (Float.floatToRawIntBits(k3) << 32)))) < f11) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static final void h0(t9 t9Var, m mVar, int i10) {
        int i11;
        boolean z3;
        int i12;
        r rVar = (r) mVar;
        rVar.c0(-1104523184);
        if ((i10 & 6) == 0) {
            if (rVar.h(t9Var)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i11 = i12 | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) != 2) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (rVar.R(i11 & 1, z3)) {
            Context context = (Context) rVar.j(AndroidCompositionLocals_androidKt.f642b);
            String str = t9Var.f29155a.f29080a;
            boolean h3 = rVar.h(t9Var) | rVar.h(context);
            Object O = rVar.O();
            v0 v0Var = l.f24285a;
            if (h3 || O == v0Var) {
                O = new y5(t9Var, context, null);
                rVar.k0(O);
            }
            a1 D2 = y.D(null, str, (df.p) O, rVar, 6);
            FillElement fillElement = androidx.compose.foundation.layout.d.f506c;
            p0 d2 = m.d(c.f15674y, false);
            int hashCode = Long.hashCode(rVar.T);
            g l10 = rVar.l();
            r c10 = a.c(fillElement, rVar);
            h.f1471d.getClass();
            b0 b0Var = g.f1462b;
            rVar.e0();
            if (rVar.S) {
                rVar.k(b0Var);
            } else {
                rVar.n0();
            }
            y.I(g.e, d2, rVar);
            y.I(g.f1464d, l10, rVar);
            f fVar = g.f1465f;
            if (rVar.S || !kotlin.jvm.internal.l.a(rVar.O(), Integer.valueOf(hashCode))) {
                a.t(hashCode, rVar, hashCode, fVar);
            }
            y.I(g.f1463c, c10, rVar);
            l9 l9Var = (l9) D2.getValue();
            if (l9Var == null) {
                rVar.a0(910472618);
            } else {
                rVar.a0(910472619);
                r o10 = androidx.compose.foundation.layout.a.o(androidx.compose.foundation.layout.f(androidx.compose.foundation.layout.d(o.f15687a, 1.0f), 34), 0.0f, 0.0f, 0.0f, 18, 7);
                boolean f10 = rVar.f(l9Var);
                Object O2 = rVar.O();
                if (f10 || O2 == v0Var) {
                    O2 = new d1(l9Var, 1);
                    rVar.k0(O2);
                }
                ya.ta.a(o10, (df.l) O2, rVar, 6);
            }
            rVar.p(false);
            rVar.p(true);
        } else {
            rVar.U();
        }
        q1 t3 = rVar.t();
        if (t3 != null) {
            t3.f24332d = new s5(t9Var, i10, 0);
        }
    }

    public static final void h1(Canvas canvas, f5 f5Var, Paint paint) {
        canvas.getClass();
        f5Var.getClass();
        canvas.save();
        canvas.translate(f5Var.f28220c, f5Var.f28221d);
        canvas.rotate(f5Var.f28223g);
        float f10 = f5Var.e;
        float f11 = f5Var.f28222f;
        canvas.drawRect(-f10, -f11, f10, f11, paint);
        canvas.restore();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0331  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0367  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0392  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x03a3  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x03b6  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x03c9  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x03da  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x03ed  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0400  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x040e  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0421  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x042d  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0438  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x04f9  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x050c  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x051f  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0532  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0545  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0558  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x056e  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x057f  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0593  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x05a5  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x05b7  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x05ca  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x05d6  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x05e2  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x05f8  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0607  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0618  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x062a  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0640  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0651  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0663  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0676  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0689  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x06a4  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x06ba  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x06cb  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x06da  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x06eb  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x06fc  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x070d  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0723  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x0734  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x0742  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x0770  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x077a  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x079c  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x07af  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x07da  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x07ea  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x07fc  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x098a  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x09c9 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:332:0x09e4 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:335:0x09f7  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x0a07 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:341:0x0a2e  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x0a54  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x0a78 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:350:0x0a92 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:353:0x0ab4  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x0ad2 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:359:0x0ae9  */
    /* JADX WARN: Removed duplicated region for block: B:362:0x0b0b  */
    /* JADX WARN: Removed duplicated region for block: B:365:0x0b1b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:369:0x0b50  */
    /* JADX WARN: Removed duplicated region for block: B:371:0x0b56 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:379:0x0c51  */
    /* JADX WARN: Removed duplicated region for block: B:382:0x0c87  */
    /* JADX WARN: Removed duplicated region for block: B:385:0x0caa  */
    /* JADX WARN: Removed duplicated region for block: B:388:0x0cba A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:392:0x0d2b  */
    /* JADX WARN: Removed duplicated region for block: B:395:0x0d39  */
    /* JADX WARN: Removed duplicated region for block: B:398:0x0d41 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:402:0x0d71  */
    /* JADX WARN: Removed duplicated region for block: B:405:0x0d9a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:408:0x0dac  */
    /* JADX WARN: Removed duplicated region for block: B:411:0x0dc1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:414:0x0de5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:418:0x0ed2  */
    /* JADX WARN: Removed duplicated region for block: B:421:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:427:0x0d2e  */
    /* JADX WARN: Removed duplicated region for block: B:429:0x0cad  */
    /* JADX WARN: Removed duplicated region for block: B:430:0x0c92  */
    /* JADX WARN: Removed duplicated region for block: B:431:0x0c6f  */
    /* JADX WARN: Removed duplicated region for block: B:433:0x0b53  */
    /* JADX WARN: Removed duplicated region for block: B:436:0x0b0e  */
    /* JADX WARN: Removed duplicated region for block: B:441:0x09fa  */
    /* JADX WARN: Removed duplicated region for block: B:444:0x0992  */
    /* JADX WARN: Removed duplicated region for block: B:457:0x089f  */
    /* JADX WARN: Removed duplicated region for block: B:482:0x07b2  */
    /* JADX WARN: Removed duplicated region for block: B:483:0x0773  */
    /* JADX WARN: Removed duplicated region for block: B:484:0x074c  */
    /* JADX WARN: Removed duplicated region for block: B:485:0x0717  */
    /* JADX WARN: Removed duplicated region for block: B:486:0x06ae  */
    /* JADX WARN: Removed duplicated region for block: B:487:0x0634  */
    /* JADX WARN: Removed duplicated region for block: B:488:0x05ec  */
    /* JADX WARN: Removed duplicated region for block: B:489:0x0562  */
    /* JADX WARN: Removed duplicated region for block: B:491:0x048e  */
    /* JADX WARN: Removed duplicated region for block: B:500:0x044c  */
    /* JADX WARN: Removed duplicated region for block: B:502:0x0457  */
    /* JADX WARN: Removed duplicated region for block: B:503:0x043b  */
    /* JADX WARN: Removed duplicated region for block: B:504:0x0430  */
    /* JADX WARN: Removed duplicated region for block: B:505:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:507:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:509:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:511:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:513:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:514:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:515:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:528:0x0ec3  */
    /* JADX WARN: Removed duplicated region for block: B:529:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:530:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x023b  */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, kotlin.jvm.internal.y] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void i(final float r131, final int r132, final int r133, final u7.m3 r134, final df.a r135, final df.l r136, final df.l r137, int r138, df.l r139, boolean r140, m r141, final int r142, final int r143) {
        /*
            Method dump skipped, instructions count: 3821
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w7.n4.i(float, int, int, u7.m3, df.a, df.l, df.l, int, df.l, boolean, m, int, int):void");
    }

    public static final void i0(int i10, m mVar) {
        boolean z3;
        r rVar = (r) mVar;
        rVar.c0(-262300599);
        if (i10 != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (rVar.R(i10 & 1, z3)) {
            r k3 = androidx.compose.foundation.layout.d.k(o.f15687a, 17);
            Object O = rVar.O();
            if (O == l.f24285a) {
                O = new f3(29);
                rVar.k0(O);
            }
            ya.ta.a(k3, (df.l) O, rVar, 54);
        } else {
            rVar.U();
        }
        q1 t3 = rVar.t();
        if (t3 != null) {
            t3.f24332d = new r5(i10, 7);
        }
    }

    public static final u4 i1(String str) {
        Object obj;
        str.getClass();
        ArrayList E2 = qe.l.E(y.f29468b, y.f29467a);
        int size = E2.size();
        int i10 = 0;
        while (true) {
            if (i10 < size) {
                obj = E2.get(i10);
                i10++;
                if (kotlin.jvm.internal.l.a(((u4) obj).f29209a, str)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        return (u4) obj;
    }

    public static final void j(u7.m3 m3Var, int i10, int i11, i5 i5Var) {
        ArrayList arrayList = i5Var.f28438c;
        int size = arrayList.size();
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList.get(i12);
            i12++;
            h5 h5Var = (h5) obj;
            h5Var.getClass();
            double radians = Math.toRadians(i5Var.f28448o);
            float cos = (float) Math.cos(radians);
            float sin = (float) Math.sin(radians);
            float f10 = h5Var.f28356c;
            float f11 = i5Var.e;
            float f12 = i5Var.f28436a;
            float f13 = (f10 - f11) * f12;
            float f14 = h5Var.f28357d;
            float f15 = i5Var.f28440f;
            float f16 = i5Var.f28437b;
            float f17 = (f14 - f15) * f16;
            float f18 = (f13 * cos) - (f17 * sin);
            float f19 = i5Var.f28447n;
            float y10 = a.y(f17, cos, f13 * sin, f19);
            float f20 = ((f18 * f19) / f12) + f11 + i5Var.f28445l;
            float f21 = (y10 / f16) + f15 + i5Var.f28446m;
            float d2 = wa.b9.d(h5Var.e * f19, 0.05f, 12.0f);
            float f22 = h5Var.f28358f + i5Var.f28448o;
            int i13 = d3.f28067a[h5Var.f28355b.ordinal()];
            if (i13 != 1) {
                if (i13 != 2) {
                    if (i13 == 3) {
                        u7.m3.o1(m3Var, i10, i11, h5Var.f28354a, f20, f21, d2, f22, null, null, 384);
                    } else {
                        l4.a.o();
                        return;
                    }
                } else {
                    m3Var.p1(i10, i11, h5Var.f28354a, f20, f21, d2, f22, null);
                }
            } else {
                m3Var.n1(i10, i11, h5Var.f28354a, f20, f21, d2, f22);
            }
        }
    }

    public static final void j0(int i10, m mVar) {
        boolean z3;
        r rVar = (r) mVar;
        rVar.c0(820323338);
        if (i10 != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (rVar.R(i10 & 1, z3)) {
            r k3 = androidx.compose.foundation.layout.d.k(o.f15687a, 17);
            Object O = rVar.O();
            if (O == l.f24285a) {
                O = new f3(25);
                rVar.k0(O);
            }
            ya.ta.a(k3, (df.l) O, rVar, 54);
        } else {
            rVar.U();
        }
        q1 t3 = rVar.t();
        if (t3 != null) {
            t3.f24332d = new r5(i10, 10);
        }
    }

    public static final b j1(String str) {
        Object obj;
        str.getClass();
        Iterator<E> it = b.getEntries().iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (kotlin.jvm.internal.l.a(((b) obj).name(), str)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        return (b) obj;
    }

    public static final boolean k(float f10, float f11, float f12, float f13, float f14, float f15, float f16) {
        float f17 = f10 - f12;
        double d2 = f14 * 0.017453292519943295d;
        double cos = Math.cos(d2);
        double sin = Math.sin(d2);
        double d10 = f11 - f13;
        double d11 = (d10 * sin) + (f17 * cos);
        double d12 = (d10 * cos) + ((-f17) * sin);
        if (Math.abs(d11) <= f15 && Math.abs(d12) <= f16) {
            return true;
        }
        return false;
    }

    public static final void k0(int i10, m mVar) {
        boolean z3;
        r rVar = (r) mVar;
        rVar.c0(1681804943);
        if (i10 != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (rVar.R(i10 & 1, z3)) {
            y.b(wa.a(), null, androidx.compose.foundation.layout.d.k(o.f15687a, 15), r.c(r.f19515d, 0.92f), rVar, 3504, 0);
        } else {
            rVar.U();
        }
        q1 t3 = rVar.t();
        if (t3 != null) {
            t3.f24332d = new r5(i10, 9);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x009a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String k1(a5 r5, m r6) {
        /*
            r5.getClass()
            java.lang.String r0 = r5.f27868a
            r r6 = (r) r6
            r1 = -119685611(0xfffffffff8ddbe15, float:-3.597978E34)
            r6.a0(r1)
            java.lang.String r1 = r5.f27870c
            boolean r1 = mf.f.u(r1)
            r2 = -733805459(0xffffffffd443046d, float:-3.3503715E12)
            r3 = 0
            if (r1 == 0) goto La4
            r1 = -731108955(0xffffffffd46c29a5, float:-4.05724384E12)
            r6.a0(r1)
            b r1 = j1(r0)
            if (r1 == 0) goto L89
            int[] r4 = b5.f27984a
            int r1 = r1.ordinal()
            r1 = r4[r1]
            switch(r1) {
                case 1: goto L85;
                case 2: goto L81;
                case 3: goto L7d;
                case 4: goto L79;
                case 5: goto L75;
                case 6: goto L71;
                case 7: goto L6d;
                case 8: goto L69;
                case 9: goto L65;
                case 10: goto L61;
                case 11: goto L5d;
                case 12: goto L59;
                case 13: goto L55;
                case 14: goto L51;
                case 15: goto L4d;
                case 16: goto L49;
                case 17: goto L45;
                case 18: goto L41;
                case 19: goto L3d;
                case 20: goto L39;
                case 21: goto L35;
                case 22: goto L89;
                case 23: goto L89;
                default: goto L30;
            }
        L30:
            l4.a.o()
            r5 = 0
            return r5
        L35:
            r1 = 2131820756(0x7f1100d4, float:1.9274236E38)
            goto L8a
        L39:
            r1 = 2131820776(0x7f1100e8, float:1.9274276E38)
            goto L8a
        L3d:
            r1 = 2131820758(0x7f1100d6, float:1.927424E38)
            goto L8a
        L41:
            r1 = 2131820768(0x7f1100e0, float:1.927426E38)
            goto L8a
        L45:
            r1 = 2131820770(0x7f1100e2, float:1.9274264E38)
            goto L8a
        L49:
            r1 = 2131820774(0x7f1100e6, float:1.9274272E38)
            goto L8a
        L4d:
            r1 = 2131820772(0x7f1100e4, float:1.9274268E38)
            goto L8a
        L51:
            r1 = 2131820773(0x7f1100e5, float:1.927427E38)
            goto L8a
        L55:
            r1 = 2131820779(0x7f1100eb, float:1.9274283E38)
            goto L8a
        L59:
            r1 = 2131820777(0x7f1100e9, float:1.9274279E38)
            goto L8a
        L5d:
            r1 = 2131820757(0x7f1100d5, float:1.9274238E38)
            goto L8a
        L61:
            r1 = 2131820775(0x7f1100e7, float:1.9274274E38)
            goto L8a
        L65:
            r1 = 2131820778(0x7f1100ea, float:1.927428E38)
            goto L8a
        L69:
            r1 = 2131820759(0x7f1100d7, float:1.9274242E38)
            goto L8a
        L6d:
            r1 = 2131820761(0x7f1100d9, float:1.9274246E38)
            goto L8a
        L71:
            r1 = 2131820771(0x7f1100e3, float:1.9274266E38)
            goto L8a
        L75:
            r1 = 2131820767(0x7f1100df, float:1.9274258E38)
            goto L8a
        L79:
            r1 = 2131820754(0x7f1100d2, float:1.9274232E38)
            goto L8a
        L7d:
            r1 = 2131820760(0x7f1100d8, float:1.9274244E38)
            goto L8a
        L81:
            r1 = 2131820769(0x7f1100e1, float:1.9274262E38)
            goto L8a
        L85:
            r1 = 2131820755(0x7f1100d3, float:1.9274234E38)
            goto L8a
        L89:
            r1 = r3
        L8a:
            if (r1 == 0) goto L9a
            r5 = -731001509(0xffffffffd46dcd5b, float:-4.08541017E12)
            java.lang.String r5 = a.p(r6, r5, r1, r6, r3)
            r6.p(r3)
            r6.p(r3)
            return r5
        L9a:
            r6.a0(r2)
            r6.p(r3)
        La0:
            r6.p(r3)
            goto La8
        La4:
            r6.a0(r2)
            goto La0
        La8:
            java.lang.String r5 = r5.f27871d
            boolean r1 = mf.f.u(r5)
            if (r1 == 0) goto Lb1
            goto Lb2
        Lb1:
            r0 = r5
        Lb2:
            r6.p(r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: w7.n4.k1(a5, m):java.lang.String");
    }

    public static final boolean l(e3 e3Var) {
        return e3Var.h();
    }

    public static final void l0(int i10, m mVar) {
        boolean z3;
        r rVar = (r) mVar;
        rVar.c0(450579844);
        if (i10 != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (rVar.R(i10 & 1, z3)) {
            r k3 = androidx.compose.foundation.layout.d.k(o.f15687a, 16);
            Object O = rVar.O();
            if (O == l.f24285a) {
                O = new f3(26);
                rVar.k0(O);
            }
            ya.ta.a(k3, (df.l) O, rVar, 54);
        } else {
            rVar.U();
        }
        q1 t3 = rVar.t();
        if (t3 != null) {
            t3.f24332d = new r5(i10, 12);
        }
    }

    public static final e5 l1(List list) {
        list.getClass();
        Iterator it = list.iterator();
        float f10 = Float.MAX_VALUE;
        float f11 = -3.4028235E38f;
        float f12 = -3.4028235E38f;
        float f13 = Float.MAX_VALUE;
        while (it.hasNext()) {
            f5 f5Var = (f5) it.next();
            double radians = Math.toRadians(f5Var.f28223g);
            float abs = (float) Math.abs(Math.cos(radians));
            float abs2 = (float) Math.abs(Math.sin(radians));
            float f14 = f5Var.e;
            float f15 = f5Var.f28222f;
            float f16 = (f15 * abs2) + (f14 * abs);
            float f17 = (f15 * abs) + (f14 * abs2);
            float f18 = f5Var.f28220c;
            float f19 = f18 - f16;
            if (f19 < f10) {
                f10 = f19;
            }
            float f20 = f5Var.f28221d;
            float f21 = f20 - f17;
            if (f21 < f13) {
                f13 = f21;
            }
            float f22 = f18 + f16;
            if (f22 > f11) {
                f11 = f22;
            }
            float f23 = f20 + f17;
            if (f23 > f12) {
                f12 = f23;
            }
        }
        return new e5(f10, f13, f11, f12);
    }

    public static final boolean m(a1 a1Var) {
        return ((Boolean) a1Var.getValue()).booleanValue();
    }

    public static final void m0(Bitmap bitmap, x xVar, df.l lVar, df.l lVar2, df.a aVar, m mVar, int i10) {
        int i11;
        int i12;
        boolean z3;
        r rVar;
        f fVar;
        f fVar2;
        f fVar3;
        float f10;
        Bitmap bitmap2 = bitmap;
        x xVar2 = xVar;
        lVar.getClass();
        lVar2.getClass();
        aVar.getClass();
        r rVar2 = (r) mVar;
        rVar2.c0(-1511330317);
        if (rVar2.h(bitmap2)) {
            i11 = 4;
        } else {
            i11 = 2;
        }
        int i13 = i10 | i11;
        if (rVar2.h(xVar2)) {
            i12 = 32;
        } else {
            i12 = 16;
        }
        int i14 = i13 | i12;
        if ((i14 & 9363) != 9362) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (rVar2.R(i14 & 1, z3)) {
            Object O = rVar2.O();
            v0 v0Var = l.f24285a;
            if (O == v0Var) {
                O = y.B(null);
                rVar2.k0(O);
            }
            a1 a1Var = (a1) O;
            Object O2 = rVar2.O();
            if (O2 == v0Var) {
                O2 = y.B(new r(r.f19515d));
                rVar2.k0(O2);
            }
            a1 a1Var2 = (a1) O2;
            c cVar = (c) rVar2.j(c2.p1.f3606h);
            FillElement fillElement = androidx.compose.foundation.layout.d.f506c;
            p0 d2 = m.d(c.f15670u, false);
            int hashCode = Long.hashCode(rVar2.T);
            g l10 = rVar2.l();
            r c10 = a.c(fillElement, rVar2);
            h.f1471d.getClass();
            b0 b0Var = g.f1462b;
            rVar2.e0();
            if (rVar2.S) {
                rVar2.k(b0Var);
            } else {
                rVar2.n0();
            }
            f fVar4 = g.e;
            y.I(fVar4, d2, rVar2);
            f fVar5 = g.f1464d;
            y.I(fVar5, l10, rVar2);
            f fVar6 = g.f1465f;
            if (rVar2.S || !kotlin.jvm.internal.l.a(rVar2.O(), Integer.valueOf(hashCode))) {
                a.t(hashCode, rVar2, hashCode, fVar6);
            }
            f fVar7 = g.f1463c;
            y.I(fVar7, c10, rVar2);
            boolean h3 = rVar2.h(bitmap2) | rVar2.h(xVar2);
            Object O3 = rVar2.O();
            if (!h3 && O3 != v0Var) {
                fVar = fVar5;
                fVar2 = fVar7;
                fVar3 = fVar6;
            } else {
                fVar = fVar5;
                fVar2 = fVar7;
                fVar3 = fVar6;
                u7.f5 f5Var = new u7.f5(lVar2, aVar, a1Var, bitmap2, xVar2, lVar, a1Var2);
                bitmap2 = bitmap2;
                xVar2 = xVar2;
                a1Var2 = a1Var2;
                rVar2.k0(f5Var);
                O3 = f5Var;
            }
            r c11 = d0.c(fillElement, bitmap2, xVar2, (PointerInputEventHandler) O3);
            boolean h10 = rVar2.h(bitmap2) | rVar2.h(xVar2);
            Object O4 = rVar2.O();
            if (h10 || O4 == v0Var) {
                androidx.ink.authoring.compose.c cVar2 = new androidx.ink.authoring.compose.c((Object) bitmap2, (Object) xVar2, (Object) a1Var, (Object) a1Var2, 11);
                rVar2.k0(cVar2);
                O4 = cVar2;
            }
            boolean z9 = false;
            ya.ta.a(c11, (df.l) O4, rVar2, 0);
            b bVar = (b) a1Var.getValue();
            if (bVar != null && Float.intBitsToFloat((int) (bVar.f18762a & 4294967295L)) < cVar.l0(160)) {
                z9 = true;
            }
            j jVar = c.f15671v;
            androidx.compose.foundation.layout.b bVar2 = androidx.compose.foundation.layout.b.f501a;
            o oVar = o.f15687a;
            r a10 = bVar2.a(oVar, jVar);
            float f11 = 28;
            r o10 = androidx.compose.foundation.layout.a.o(a10, 0.0f, f11, 0.0f, 0.0f, 13);
            if (z9) {
                f10 = 0.25f;
            } else {
                f10 = 1.0f;
            }
            float f12 = 6;
            r n10 = androidx.compose.foundation.layout.a.n(androidx.compose.foundation.a.b(wa.j7.a(wa.g7.a(o10, f10), f0.e.a(20)), r.c(r.f19513b, 0.72f), l0.f19495a), 14, f12, f12, f12);
            p0 a11 = o0.a(h.i(8), c.E, rVar2, 54);
            int hashCode2 = Long.hashCode(rVar2.T);
            g l11 = rVar2.l();
            r c12 = a.c(n10, rVar2);
            rVar2.e0();
            if (rVar2.S) {
                rVar2.k(b0Var);
            } else {
                rVar2.n0();
            }
            y.I(fVar4, a11, rVar2);
            y.I(fVar, l11, rVar2);
            if (rVar2.S || !kotlin.jvm.internal.l.a(rVar2.O(), Integer.valueOf(hashCode2))) {
                a.t(hashCode2, rVar2, hashCode2, fVar3);
            }
            y.I(fVar2, c12, rVar2);
            x1.b(wa.n7.b(R.string.eyedropper_hint, rVar2), null, r.f19515d, ae.e(13), null, null, null, 0L, null, 0L, 0, false, 0, 0, null, rVar2, 3456, 0, 131058);
            rVar = rVar2;
            h1.a(aVar, androidx.compose.foundation.layout.d.k(oVar, f11), false, null, f28767d, rVar, 196662, 28);
            rVar.p(true);
            rVar.p(true);
        } else {
            rVar = rVar2;
            rVar.U();
        }
        q1 t3 = rVar.t();
        if (t3 != null) {
            t3.f24332d = new u7.m4(bitmap, xVar, lVar, lVar2, aVar, i10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ee A[Catch: all -> 0x00f6, TRY_ENTER, TryCatch #10 {all -> 0x00f6, blocks: (B:44:0x00ee, B:50:0x00f9), top: B:42:0x00ec }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00f9 A[Catch: all -> 0x00f6, TRY_LEAVE, TryCatch #10 {all -> 0x00f6, blocks: (B:44:0x00ee, B:50:0x00f9), top: B:42:0x00ec }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.io.File m1(android.content.Context r11, android.net.Uri r12, java.io.File r13, java.lang.String r14) {
        /*
            Method dump skipped, instructions count: 304
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w7.n4.m1(android.content.Context, android.net.Uri, java.io.File, java.lang.String):java.io.File");
    }

    public static final boolean n(e3 e3Var) {
        return e3Var.k();
    }

    public static final void n0(int i10, m mVar) {
        boolean z3;
        r rVar;
        r rVar2 = (r) mVar;
        rVar2.c0(1873147434);
        if (i10 != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (rVar2.R(i10 & 1, z3)) {
            rVar = rVar2;
            x1.b("Aa", null, r.c(r.f19515d, 0.92f), ae.e(13), null, s.B, null, 0L, null, 0L, 0, false, 0, 0, null, rVar, 200070, 0, 131026);
        } else {
            rVar = rVar2;
            rVar.U();
        }
        q1 t3 = rVar.t();
        if (t3 != null) {
            t3.f24332d = new r5(i10, 11);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0058 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object n1(android.content.Context r4, android.net.Uri r5, android.util.LruCache r6, ve.c r7) {
        /*
            boolean r0 = r7 instanceof j5
            if (r0 == 0) goto L13
            r0 = r7
            j5 r0 = (j5) r0
            int r1 = r0.f28506x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f28506x = r1
            goto L18
        L13:
            j5 r0 = new j5
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f28505w
            int r1 = r0.f28506x
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L30
            if (r1 != r2) goto L2a
            android.util.LruCache r6 = r0.f28504v
            android.net.Uri r5 = r0.f28503u
            pe.a.e(r7)
            goto L54
        L2a:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            q.o(r4)
            return r3
        L30:
            pe.a.e(r7)
            java.lang.Object r7 = r6.get(r5)
            f r7 = (f) r7
            if (r7 == 0) goto L3c
            return r7
        L3c:
            wf.e r7 = pf.l0.f22767a
            wf.d r7 = wf.d.f29913w
            u7.r0 r1 = new u7.r0
            r1.<init>(r4, r5, r3, r2)
            r0.f28503u = r5
            r0.f28504v = r6
            r0.f28506x = r2
            java.lang.Object r7 = pf.b0.J(r7, r1, r0)
            ue.a r4 = ue.a.f27192u
            if (r7 != r4) goto L54
            return r4
        L54:
            android.graphics.Bitmap r7 = (android.graphics.Bitmap) r7
            if (r7 != 0) goto L59
            return r3
        L59:
            f r4 = new f
            r4.<init>(r7)
            r6.put(r5, r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: w7.n4.n1(android.content.Context, android.net.Uri, android.util.LruCache, ve.c):java.lang.Object");
    }

    public static final void o(a1 a1Var, boolean z3) {
        a1Var.setValue(Boolean.valueOf(z3));
    }

    public static final void o0(boolean z3, m mVar, int i10) {
        boolean z9;
        r rVar = (r) mVar;
        rVar.c0(801640846);
        if ((i10 & 3) != 2) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (rVar.R(i10 & 1, z9)) {
            r k3 = androidx.compose.foundation.layout.d.k(o.f15687a, 18);
            Object O = rVar.O();
            if (O == l.f24285a) {
                O = new b8.o4(6, z3);
                rVar.k0(O);
            }
            ya.ta.a(k3, (df.l) O, rVar, 6);
        } else {
            rVar.U();
        }
        q1 t3 = rVar.t();
        if (t3 != null) {
            t3.f24332d = new d(i10, 6, z3);
        }
    }

    public static ArrayList o1(String str) {
        if (str != null && !mf.f.u(str)) {
            List C2 = mf.f.C(str, new String[]{","});
            ArrayList arrayList = new ArrayList();
            Iterator it = C2.iterator();
            while (it.hasNext()) {
                String obj = mf.f.I((String) it.next()).toString();
                obj.getClass();
                Integer k3 = mf.m.k(10, obj);
                if (k3 != null) {
                    arrayList.add(k3);
                }
            }
            if (!arrayList.isEmpty()) {
                return arrayList;
            }
            return null;
        }
        return null;
    }

    public static final boolean p(a1 a1Var) {
        return ((Boolean) a1Var.getValue()).booleanValue();
    }

    public static final void p0(d dVar, long j10, long j11, float f10, float f11, float f12, float f13, float f14, boolean z3) {
        h a10 = k.a();
        float f15 = f12 * 0.09f;
        a10.h(f11, f14 - f15);
        a10.g(0.82f * f13, f14);
        a10.g(f11, f15 + f14);
        a10.g(f13 * 0.18f, f14);
        a10.d();
        if (z3) {
            d.o0(dVar, a10, j10, null, 60);
        } else {
            d.o0(dVar, a10, j11, new h(f10, 0.0f, 0, 0, null, 30), 52);
        }
    }

    public static void p1(Context context, e3 e3Var) {
        SharedPreferences.Editor edit = context.getSharedPreferences("scraply_canvas_tools", 0).edit();
        edit.putBoolean("eraser", e3Var.a());
        edit.putBoolean("pencil", e3Var.j());
        edit.putBoolean("paintbrush", e3Var.i());
        edit.putBoolean("fill", e3Var.b());
        edit.putBoolean("highlighter", e3Var.c());
        edit.putBoolean("write", e3Var.r());
        edit.putBoolean("maleta", e3Var.h());
        edit.putBoolean("scissor", e3Var.k());
        edit.putBoolean("smudge", e3Var.n());
        edit.putBoolean("magic", e3Var.e());
        edit.putBoolean("showPalette", e3Var.m());
        edit.putString("font", (String) e3Var.f28134l.getValue());
        edit.putInt("cMarcador", l0.F(((r) e3Var.f28135m.getValue()).f19523a));
        edit.putInt("cPencil", l0.F(((r) e3Var.f28136n.getValue()).f19523a));
        edit.putInt("cHighlighter", l0.F(((r) e3Var.f28137o.getValue()).f19523a));
        edit.putInt("cPaintbrush", l0.F(((r) e3Var.f28138p.getValue()).f19523a));
        edit.putInt("cFill", l0.F(((r) e3Var.f28139q.getValue()).f19523a));
        edit.putInt("cText", l0.F(((r) e3Var.f28140r.getValue()).f19523a));
        edit.putFloat("wMarcador", e3Var.f28141s.h());
        edit.putFloat("wPencil", e3Var.f28142t.h());
        edit.putFloat("wHighlighter", e3Var.f28143u.h());
        edit.putFloat("wPaintbrush", e3Var.f28144v.h());
        edit.putFloat("wEraser", e3Var.f28145w.h());
        edit.putFloat("wSmudge", e3Var.f28146x.h());
        edit.putFloat("wMagic", e3Var.f28147y.h());
        edit.putFloat("smudgeStrength", e3Var.D.h());
        edit.putString("magicStyle", (String) e3Var.f28148z.getValue());
        edit.putString("magicPalette", e3Var.f());
        edit.putString("magicCustom", qe.l.B(e3Var.d(), ",", null, null, new f3(0), 30));
        edit.putString("palette", qe.l.B(e3Var.f28125a, ",", null, null, n1.f28750w, 30));
        edit.apply();
    }

    public static final boolean q(e3 e3Var) {
        return e3Var.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:124:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0372  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x03c2  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x03c6  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x02e8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void q0(final p r31, final boolean r32, final int r33, final x r34, final float r35, final float r36, final float r37, final float r38, final z0 r39, final df.a r40, final u7.i0 r41, m r42, final int r43) {
        /*
            Method dump skipped, instructions count: 1149
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w7.n4.q0(p, boolean, int, x, float, float, float, float, z0, df.a, u7.i0, m, int):void");
    }

    public static final c q1(float f10, m mVar) {
        r rVar = (r) mVar;
        c cVar = (c) rVar.j(c2.p1.f3606h);
        boolean f11 = rVar.f(cVar) | rVar.c(f10);
        Object O = rVar.O();
        if (f11 || O == l.f24285a) {
            O = new d(cVar.a() * f10, cVar.i0());
            rVar.k0(O);
        }
        return (c) O;
    }

    public static final p4 r(a1 a1Var) {
        return (p4) a1Var.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:227:0x0a7d  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0a8b  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0a92 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0ad1  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0ae2  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0b50  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0b61  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0b7f  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0b54  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0ad5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void r0(final java.lang.String r58, final df.l r59, final int r60, final int r61, final u7.m3 r62, final android.util.LruCache r63, final df.a r64, final df.q r65, final k0 r66, final df.l r67, final df.a r68, final df.q r69, final df.q r70, final df.q r71, final df.l r72, m r73, final int r74) {
        /*
            Method dump skipped, instructions count: 3109
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w7.n4.r0(java.lang.String, df.l, int, int, u7.m3, android.util.LruCache, df.a, df.q, k0, df.l, df.a, df.q, df.q, df.q, df.l, m, int):void");
    }

    public static final float r1(m mVar) {
        float f10;
        r rVar = (r) mVar;
        int i10 = ((Configuration) rVar.j(AndroidCompositionLocals_androidKt.f641a)).smallestScreenWidthDp;
        boolean d2 = rVar.d(i10);
        Object O = rVar.O();
        if (d2 || O == l.f24285a) {
            if (i10 >= 720) {
                f10 = 1.45f;
            } else if (i10 >= 600) {
                f10 = 1.3f;
            } else {
                f10 = 1.0f;
            }
            O = Float.valueOf(f10);
            rVar.k0(O);
        }
        return ((Number) O).floatValue();
    }

    public static final ma s(a1 a1Var) {
        return (ma) a1Var.getValue();
    }

    public static final void s0(a1 a1Var, boolean z3) {
        a1Var.setValue(Boolean.valueOf(z3));
    }

    public static final Bitmap s1(u7.m3 m3Var, int i10, int i11, boolean z3, m mVar) {
        r rVar = (r) mVar;
        Context context = (Context) rVar.j(AndroidCompositionLocals_androidKt.f642b);
        Object O = rVar.O();
        Object obj = l.f24285a;
        if (O == obj) {
            O = y.B(null);
            rVar.k0(O);
        }
        a1 a1Var = (a1) O;
        Object[] objArr = {Boolean.TRUE, Integer.valueOf(i10), Integer.valueOf(i11), Boolean.valueOf(z3)};
        boolean g8 = rVar.g(z3) | rVar.h(m3Var) | rVar.d(i10) | rVar.h(context) | rVar.d(i11);
        Object O2 = rVar.O();
        if (g8 || O2 == obj) {
            Object t4Var = new t4(a1Var, z3, m3Var, i10, context, i11, null);
            rVar.k0(t4Var);
            O2 = t4Var;
        }
        y.i(objArr, (df.p) O2, rVar);
        Object O3 = rVar.O();
        if (O3 == obj) {
            O3 = new b8.a0(a1Var, 17);
            rVar.k0(O3);
        }
        y.c(pe.z.f22715a, (df.l) O3, rVar);
        return (Bitmap) a1Var.getValue();
    }

    public static final l9 t(a1 a1Var) {
        return (l9) a1Var.getValue();
    }

    public static final List t0(a1 a1Var) {
        return (List) a1Var.getValue();
    }

    public static final float t1(boolean z3, m mVar, int i10, int i11) {
        float f10;
        int i12;
        r rVar = (r) mVar;
        rVar.a0(-1026501294);
        if ((i11 & 2) != 0) {
            f10 = 5.0f;
        } else {
            f10 = 2.0f;
        }
        float f11 = f10;
        if ((i11 & 4) != 0) {
            i12 = 70;
        } else {
            i12 = 100;
        }
        if (!z3) {
            rVar.p(false);
            return 0.0f;
        }
        float floatValue = ((Number) q.e.f(q.e.o("shake", rVar, 0), -f11, f11, q.e.n(q.e.s(i12, 0, null, 6), 4), "shakeAngle", rVar, ((i10 << 3) & 896) | 28680, 0).f22884x.getValue()).floatValue();
        rVar.p(false);
        return floatValue;
    }

    public static final float u(e1 e1Var) {
        return e1Var.h();
    }

    public static final void u0(int i10, m mVar) {
        boolean z3;
        r rVar = (r) mVar;
        rVar.c0(1942127674);
        if (i10 != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (rVar.R(i10 & 1, z3)) {
            r k3 = androidx.compose.foundation.layout.d.k(o.f15687a, 18);
            Object O = rVar.O();
            if (O == l.f24285a) {
                O = new f3(27);
                rVar.k0(O);
            }
            ya.ta.a(k3, (df.l) O, rVar, 54);
        } else {
            rVar.U();
        }
        q1 t3 = rVar.t();
        if (t3 != null) {
            t3.f24332d = new r5(i10, 13);
        }
    }

    public static final void u1(Context context, t9 t9Var) {
        boolean a10 = t9Var.a();
        s9 s9Var = t9Var.f29155a;
        int i10 = 3;
        if (a10) {
            fg.s sVar = d8.f.f15790a;
            String str = s9Var.f29080a;
            context.getClass();
            str.getClass();
            pf.b0.x(d8.f.f15791b, null, new d8.e(context.getApplicationContext(), str, null, 1), 3);
            return;
        }
        sf.n0 n0Var = g7.i.f17566a;
        String str2 = s9Var.f29080a;
        str2.getClass();
        r1 r1Var = g7.i.e;
        if (r1Var != null) {
            try {
                h hVar = new h();
                ((Executor) r1Var.f20257j.b()).execute(new j(27, r1Var, str2, hVar));
                o oVar = hVar.f18363a;
                b1.h hVar2 = new b1.h(9, new b8.w(str2, i10));
                oVar.getClass();
                z1 z1Var = i.f18364a;
                oVar.f(z1Var, hVar2);
                oVar.e(z1Var, new g7.b(str2, 0));
            } catch (Throwable unused) {
            }
        }
    }

    public static final b v(a1 a1Var) {
        return (b) a1Var.getValue();
    }

    public static final void v0(String str, Integer num, boolean z3, df.a aVar, df.a aVar2, df.l lVar, df.a aVar3, m mVar, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        boolean z9;
        df.a aVar4;
        float f10;
        long j10;
        boolean z10;
        int i16;
        boolean z11;
        boolean z12;
        boolean z13;
        Integer num2 = num;
        r rVar = (r) mVar;
        rVar.c0(-491901408);
        if (rVar.f(str)) {
            i11 = 4;
        } else {
            i11 = 2;
        }
        int i17 = i10 | i11;
        if (rVar.f(num2)) {
            i12 = 32;
        } else {
            i12 = 16;
        }
        int i18 = i17 | i12;
        if (rVar.g(z3)) {
            i13 = 256;
        } else {
            i13 = 128;
        }
        int i19 = i18 | i13;
        if (rVar.h(lVar)) {
            i14 = 131072;
        } else {
            i14 = 65536;
        }
        int i20 = i19 | i14;
        if (rVar.h(aVar3)) {
            i15 = 1048576;
        } else {
            i15 = 524288;
        }
        int i21 = i20 | i15;
        if ((599187 & i21) != 599186) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (rVar.R(i21 & 1, z9)) {
            A0(str, rVar, i21 & 14);
            o oVar = o.f15687a;
            float f11 = 14;
            r o10 = androidx.compose.foundation.layout.a.o(androidx.compose.foundation.layout.d(oVar, 1.0f), f11, 0.0f, 0.0f, 0.0f, 14);
            float f12 = 8;
            p0 a10 = o0.a(h.i(f12), c.E, rVar, 54);
            int hashCode = Long.hashCode(rVar.T);
            g l10 = rVar.l();
            r c10 = a.c(o10, rVar);
            h.f1471d.getClass();
            b0 b0Var = g.f1462b;
            rVar.e0();
            if (rVar.S) {
                rVar.k(b0Var);
            } else {
                rVar.n0();
            }
            f fVar = g.e;
            y.I(fVar, a10, rVar);
            f fVar2 = g.f1464d;
            y.I(fVar2, l10, rVar);
            f fVar3 = g.f1465f;
            if (rVar.S || !kotlin.jvm.internal.l.a(rVar.O(), Integer.valueOf(hashCode))) {
                a.t(hashCode, rVar, hashCode, fVar3);
            }
            f fVar4 = g.f1463c;
            y.I(fVar4, c10, rVar);
            float f13 = 30;
            r k3 = androidx.compose.foundation.layout.d.k(oVar, f13);
            f0.d dVar = f0.e.f16629a;
            r a11 = wa.j7.a(k3, dVar);
            long j11 = r.f19515d;
            long c11 = r.c(j11, 0.06f);
            k0 k0Var = l0.f19495a;
            r b10 = androidx.compose.foundation.a.b(a11, c11, k0Var);
            if (num2 == null) {
                f10 = 2;
            } else {
                f10 = 1;
            }
            if (num2 == null) {
                j10 = j11;
            } else {
                j10 = j11;
                j11 = r.c(j11, 0.25f);
            }
            r a12 = ya.a(b10, f10, j11, dVar);
            if ((i21 & 3670016) == 1048576) {
                z10 = true;
            } else {
                z10 = false;
            }
            Object O = rVar.O();
            v0 v0Var = l.f24285a;
            if (z10 || O == v0Var) {
                O = new b8.z(24, aVar3);
                rVar.k0(O);
            }
            r f14 = androidx.compose.foundation.a.f(null, false, a12, (df.a) O, 7);
            p0 d2 = m.d(c.f15674y, false);
            int hashCode2 = Long.hashCode(rVar.T);
            g l11 = rVar.l();
            r c12 = a.c(f14, rVar);
            rVar.e0();
            if (rVar.S) {
                rVar.k(b0Var);
            } else {
                rVar.n0();
            }
            y.I(fVar, d2, rVar);
            y.I(fVar2, l11, rVar);
            if (rVar.S || !kotlin.jvm.internal.l.a(rVar.O(), Integer.valueOf(hashCode2))) {
                a.t(hashCode2, rVar, hashCode2, fVar3);
            }
            y.I(fVar4, c12, rVar);
            r k4 = androidx.compose.foundation.layout.d.k(oVar, f13);
            Object O2 = rVar.O();
            if (O2 == v0Var) {
                O2 = new c9(0);
                rVar.k0(O2);
            }
            ya.ta.a(k4, (df.l) O2, rVar, 54);
            rVar.p(true);
            p0 d10 = m.d(c.f15670u, false);
            int hashCode3 = Long.hashCode(rVar.T);
            g l12 = rVar.l();
            r c13 = a.c(oVar, rVar);
            rVar.e0();
            if (rVar.S) {
                rVar.k(b0Var);
            } else {
                rVar.n0();
            }
            y.I(fVar, d10, rVar);
            y.I(fVar2, l12, rVar);
            if (rVar.S || !kotlin.jvm.internal.l.a(rVar.O(), Integer.valueOf(hashCode3))) {
                a.t(hashCode3, rVar, hashCode3, fVar3);
            }
            y.I(fVar4, c13, rVar);
            r a13 = wa.j7.a(androidx.compose.foundation.layout.d.k(oVar, f13), dVar);
            int i22 = -6381922;
            if (num != null) {
                i16 = num.intValue();
            } else {
                i16 = -6381922;
            }
            r a14 = ya.a(androidx.compose.foundation.a.b(a13, l0.c(i16), k0Var), (float) 1.5d, r.c(j10, 0.6f), dVar);
            Object O3 = rVar.O();
            if (O3 == v0Var) {
                aVar4 = aVar;
                O3 = new b8.z(25, aVar4);
                rVar.k0(O3);
            } else {
                aVar4 = aVar;
            }
            m.a(0, androidx.compose.foundation.a.f(null, false, a14, (df.a) O3, 7), rVar);
            if (num != null) {
                i22 = num.intValue();
            }
            long c14 = l0.c(i22);
            int i23 = i21 & 458752;
            if (i23 == 131072) {
                z11 = true;
            } else {
                z11 = false;
            }
            Object O4 = rVar.O();
            if (z11 || O4 == v0Var) {
                O4 = new b1.b(1, lVar);
                rVar.k0(O4);
            }
            x7.b(z3, c14, (df.l) O4, aVar2, null, rVar, ((i21 >> 6) & 14) | 3072, 16);
            rVar.p(true);
            e i24 = h.i(f12);
            k0 b11 = androidx.compose.foundation.layout.a.b(0.0f, f11, 0.0f, 11);
            if (1.0f <= 0.0d) {
                a("invalid weight; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
            if ((i21 & 112) == 32) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (i23 == 131072) {
                z13 = true;
            } else {
                z13 = false;
            }
            boolean z14 = z12 | z13;
            Object O5 = rVar.O();
            if (!z14 && O5 != v0Var) {
                num2 = num;
            } else {
                num2 = num;
                O5 = new d9(num2, 0, lVar);
                rVar.k0(O5);
            }
            we.b(layoutWeightElement, null, b11, i24, null, null, false, null, (df.l) O5, rVar, 24960, 490);
            rVar = rVar;
            rVar.p(true);
        } else {
            aVar4 = aVar;
            rVar.U();
        }
        q1 t3 = rVar.t();
        if (t3 != null) {
            t3.f24332d = new b8.a8(str, num2, z3, aVar4, aVar2, lVar, aVar3, i10);
        }
    }

    public static void v1(Context context, e3 e3Var) {
        e1 e1Var;
        ArrayList arrayList;
        e1 e1Var2 = e3Var.f28147y;
        e1 e1Var3 = e3Var.f28146x;
        e1 e1Var4 = e3Var.f28145w;
        e1 e1Var5 = e3Var.f28144v;
        e1 e1Var6 = e3Var.f28143u;
        e1 e1Var7 = e3Var.f28142t;
        e1 e1Var8 = e3Var.f28141s;
        i1 i1Var = e3Var.f28140r;
        i1 i1Var2 = e3Var.f28139q;
        i1 i1Var3 = e3Var.f28138p;
        i1 i1Var4 = e3Var.f28137o;
        i1 i1Var5 = e3Var.f28136n;
        i1 i1Var6 = e3Var.f28135m;
        SharedPreferences sharedPreferences = context.getSharedPreferences("scraply_canvas_tools", 0);
        if (sharedPreferences.contains("palette")) {
            boolean a10 = e3Var.a();
            b1.v vVar = e3Var.f28125a;
            e1 e1Var9 = e3Var.D;
            e3Var.s(sharedPreferences.getBoolean("eraser", a10));
            e3Var.y(sharedPreferences.getBoolean("pencil", e3Var.j()));
            e3Var.x(sharedPreferences.getBoolean("paintbrush", e3Var.i()));
            e3Var.t(sharedPreferences.getBoolean("fill", e3Var.b()));
            e3Var.u(sharedPreferences.getBoolean("highlighter", e3Var.c()));
            e3Var.E(sharedPreferences.getBoolean("write", e3Var.r()));
            e3Var.w(sharedPreferences.getBoolean("maleta", e3Var.h()));
            e3Var.z(sharedPreferences.getBoolean("scissor", e3Var.k()));
            e3Var.C(sharedPreferences.getBoolean("smudge", e3Var.n()));
            e3Var.v(sharedPreferences.getBoolean("magic", e3Var.e()));
            e3Var.A(sharedPreferences.getBoolean("showPalette", e3Var.m()));
            String string = sharedPreferences.getString("font", null);
            if (string != null) {
                List list = e.f22444a;
                e1Var = e1Var3;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        } else if (kotlin.jvm.internal.l.a(((c) it.next()).f22431a, string)) {
                            e3Var.f28134l.setValue(string);
                            break;
                        }
                    }
                }
            } else {
                e1Var = e1Var3;
            }
            String string2 = sharedPreferences.getString("magicStyle", null);
            if (string2 != null) {
                List list2 = q0.f22560b;
                if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                    Iterator it2 = list2.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        } else if (((p0) it2.next()).f22551a.equals(string2)) {
                            e3Var.f28148z.setValue(string2);
                            break;
                        }
                    }
                }
            }
            String string3 = sharedPreferences.getString("magicPalette", null);
            if (string3 != null) {
                List list3 = q0.f22559a;
                if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                    Iterator it3 = list3.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            break;
                        } else if (((o0) it3.next()).f22545a.equals(string3)) {
                            e3Var.A.setValue(string3);
                            break;
                        }
                    }
                }
            }
            i1Var6.setValue(new r(l0.c(sharedPreferences.getInt("cMarcador", l0.F(((r) i1Var6.getValue()).f19523a)))));
            i1Var5.setValue(new r(l0.c(sharedPreferences.getInt("cPencil", l0.F(((r) i1Var5.getValue()).f19523a)))));
            i1Var4.setValue(new r(l0.c(sharedPreferences.getInt("cHighlighter", l0.F(((r) i1Var4.getValue()).f19523a)))));
            i1Var3.setValue(new r(l0.c(sharedPreferences.getInt("cPaintbrush", l0.F(((r) i1Var3.getValue()).f19523a)))));
            i1Var2.setValue(new r(l0.c(sharedPreferences.getInt("cFill", l0.F(((r) i1Var2.getValue()).f19523a)))));
            i1Var.setValue(new r(l0.c(sharedPreferences.getInt("cText", l0.F(((r) i1Var.getValue()).f19523a)))));
            e1Var8.i(sharedPreferences.getFloat("wMarcador", e1Var8.h()));
            e1Var7.i(sharedPreferences.getFloat("wPencil", e1Var7.h()));
            e1Var6.i(sharedPreferences.getFloat("wHighlighter", e1Var6.h()));
            e1Var5.i(sharedPreferences.getFloat("wPaintbrush", e1Var5.h()));
            e1Var4.i(sharedPreferences.getFloat("wEraser", e1Var4.h()));
            e1Var.i(sharedPreferences.getFloat("wSmudge", e1Var.h()));
            e1Var2.i(sharedPreferences.getFloat("wMagic", e1Var2.h()));
            e1Var9.i(sharedPreferences.getFloat("smudgeStrength", e1Var9.h()));
            ArrayList o12 = o1(sharedPreferences.getString("magicCustom", null));
            if (o12 != null) {
                if (o12.size() != e3Var.d().size()) {
                    o12 = null;
                }
                if (o12 != null) {
                    e3Var.C.setValue(o12);
                }
            }
            ArrayList o13 = o1(sharedPreferences.getString("palette", null));
            if (o13 != null) {
                if (!o13.isEmpty()) {
                    arrayList = o13;
                } else {
                    arrayList = null;
                }
                if (arrayList != null) {
                    vVar.clear();
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        vVar.add(new r(l0.c(((Number) obj).intValue())));
                    }
                }
            }
        }
    }

    public static final b w(a1 a1Var) {
        return (b) a1Var.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void w0(final java.lang.String r34, final df.a r35, df.a r36, final c r37, m r38, final int r39, final int r40) {
        /*
            Method dump skipped, instructions count: 530
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w7.n4.w0(java.lang.String, df.a, df.a, c, m, int, int):void");
    }

    public static List w1(Context context, String str, ArrayList arrayList) {
        context.getClass();
        String string = context.getApplicationContext().getSharedPreferences("scraply_pack_order", 0).getString(str, null);
        if (string != null) {
            List C2 = mf.f.C(string, new String[]{"\n"});
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : C2) {
                if (!mf.f.u((String) obj)) {
                    arrayList2.add(obj);
                }
            }
            if (!arrayList2.isEmpty()) {
                cg.g gVar = new cg.g(2, new c(25, arrayList2));
                int b10 = qe.b(qe.m.d(gVar, 10));
                if (b10 < 16) {
                    b10 = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(b10);
                Iterator it = gVar.iterator();
                while (true) {
                    cg.f fVar = (cg.f) it;
                    if (((Iterator) fVar.f4129w).hasNext()) {
                        qe.v vVar = (qe.v) fVar.next();
                        linkedHashMap.put((String) vVar.f24027b, Integer.valueOf(vVar.f24026a));
                    } else {
                        return qe.l.K(arrayList, new b8.n3(5, linkedHashMap));
                    }
                }
            }
        }
        return arrayList;
    }

    public static final float x(e1 e1Var) {
        return e1Var.h();
    }

    public static final void x0(List list, LruCache lruCache, m mVar, int i10) {
        int i11;
        int i12;
        boolean z3;
        float f10;
        boolean z9;
        j jVar = c.f15674y;
        list.getClass();
        lruCache.getClass();
        r rVar = (r) mVar;
        rVar.c0(-78675013);
        if (rVar.h(list)) {
            i11 = 4;
        } else {
            i11 = 2;
        }
        int i13 = i11 | i10;
        if (rVar.h(lruCache)) {
            i12 = 32;
        } else {
            i12 = 16;
        }
        int i14 = i13 | i12;
        if ((i14 & 19) != 18) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (rVar.R(i14 & 1, z3)) {
            List L = qe.l.L(list, 4);
            FillElement fillElement = androidx.compose.foundation.layout.d.f506c;
            long d2 = l0.d(4280624688L);
            k0 k0Var = l0.f19495a;
            r b10 = androidx.compose.foundation.a.b(fillElement, d2, k0Var);
            p0 d10 = m.d(jVar, false);
            int hashCode = Long.hashCode(rVar.T);
            g l10 = rVar.l();
            r c10 = a.c(b10, rVar);
            h.f1471d.getClass();
            b0 b0Var = g.f1462b;
            rVar.e0();
            if (rVar.S) {
                rVar.k(b0Var);
            } else {
                rVar.n0();
            }
            f fVar = g.e;
            y.I(fVar, d10, rVar);
            f fVar2 = g.f1464d;
            y.I(fVar2, l10, rVar);
            f fVar3 = g.f1465f;
            if (rVar.S || !kotlin.jvm.internal.l.a(rVar.O(), Integer.valueOf(hashCode))) {
                a.t(hashCode, rVar, hashCode, fVar3);
            }
            f fVar4 = g.f1463c;
            y.I(fVar4, c10, rVar);
            float f11 = 4;
            r a10 = q.a(h.i(f11), c.G, rVar, 6);
            int hashCode2 = Long.hashCode(rVar.T);
            g l11 = rVar.l();
            o oVar = o.f15687a;
            r c11 = a.c(oVar, rVar);
            rVar.e0();
            if (rVar.S) {
                rVar.k(b0Var);
            } else {
                rVar.n0();
            }
            y.I(fVar, a10, rVar);
            y.I(fVar2, l11, rVar);
            if (rVar.S || !kotlin.jvm.internal.l.a(rVar.O(), Integer.valueOf(hashCode2))) {
                a.t(hashCode2, rVar, hashCode2, fVar3);
            }
            y.I(fVar4, c11, rVar);
            rVar.a0(1042841762);
            for (int i15 = 0; i15 < 2; i15++) {
                p0 a11 = o0.a(h.i(f11), c.D, rVar, 6);
                int hashCode3 = Long.hashCode(rVar.T);
                g l12 = rVar.l();
                r c12 = a.c(oVar, rVar);
                h.f1471d.getClass();
                b0 b0Var2 = g.f1462b;
                rVar.e0();
                if (rVar.S) {
                    rVar.k(b0Var2);
                } else {
                    rVar.n0();
                }
                y.I(g.e, a11, rVar);
                y.I(g.f1464d, l12, rVar);
                f fVar5 = g.f1465f;
                if (rVar.S || !kotlin.jvm.internal.l.a(rVar.O(), Integer.valueOf(hashCode3))) {
                    a.t(hashCode3, rVar, hashCode3, fVar5);
                }
                y.I(g.f1463c, c12, rVar);
                rVar.a0(1429043409);
                int i16 = 0;
                while (i16 < 2) {
                    p8 p8Var = (p8) qe.l.y((i15 * 2) + i16, L);
                    r a12 = wa.j7.a(androidx.compose.foundation.layout.d.k(oVar, 26), f0.e.a(5));
                    long j10 = r.f19515d;
                    if (p8Var == null) {
                        f10 = 0.07f;
                    } else {
                        f10 = 0.12f;
                    }
                    r b11 = androidx.compose.foundation.a.b(a12, r.c(j10, f10), k0Var);
                    p0 d11 = m.d(jVar, false);
                    o oVar2 = oVar;
                    int hashCode4 = Long.hashCode(rVar.T);
                    g l13 = rVar.l();
                    r c13 = a.c(b11, rVar);
                    h.f1471d.getClass();
                    b0 b0Var3 = g.f1462b;
                    rVar.e0();
                    if (rVar.S) {
                        rVar.k(b0Var3);
                    } else {
                        rVar.n0();
                    }
                    y.I(g.e, d11, rVar);
                    y.I(g.f1464d, l13, rVar);
                    f fVar6 = g.f1465f;
                    if (rVar.S || !kotlin.jvm.internal.l.a(rVar.O(), Integer.valueOf(hashCode4))) {
                        a.t(hashCode4, rVar, hashCode4, fVar6);
                    }
                    y.I(g.f1463c, c13, rVar);
                    if (p8Var != null) {
                        rVar.a0(-105393717);
                        z0(p8Var, lruCache, rVar, i14 & 112);
                        z9 = false;
                    } else {
                        z9 = false;
                        rVar.a0(1019699901);
                    }
                    rVar.p(z9);
                    rVar.p(true);
                    i16++;
                    oVar = oVar2;
                }
                rVar.p(false);
                rVar.p(true);
            }
            rVar.p(false);
            rVar.p(true);
            rVar.p(true);
        } else {
            rVar.U();
        }
        q1 t3 = rVar.t();
        if (t3 != null) {
            t3.f24332d = new b8.l(i10, 16, list, lruCache);
        }
    }

    public static void x1(Context context) {
        context.getClass();
        try {
            context.stopService(new Intent(context, (Class<?>) CameraKeepAliveService.class));
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    public static final q2 y(a1 a1Var) {
        return (q2) a1Var.getValue();
    }

    public static final void y0(final p8 p8Var, final LruCache lruCache, final float f10, final df.l lVar, final df.q qVar, final df.q qVar2, final df.q qVar3, final df.q qVar4, final df.l lVar2, final df.l lVar3, m mVar, final int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        boolean z3;
        boolean z9;
        boolean z10;
        ma kaVar;
        ma kaVar2;
        String str;
        String valueOf;
        boolean z11;
        d5 d5Var;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        p8Var.getClass();
        String str2 = p8Var.f28914b;
        lruCache.getClass();
        lVar.getClass();
        qVar.getClass();
        qVar2.getClass();
        qVar3.getClass();
        qVar4.getClass();
        lVar2.getClass();
        lVar3.getClass();
        r rVar = (r) mVar;
        rVar.c0(668005701);
        if (rVar.f(p8Var)) {
            i11 = 4;
        } else {
            i11 = 2;
        }
        int i21 = i10 | i11;
        if (rVar.h(lruCache)) {
            i12 = 32;
        } else {
            i12 = 16;
        }
        int i22 = i21 | i12;
        if (rVar.c(f10)) {
            i13 = 256;
        } else {
            i13 = 128;
        }
        int i23 = i22 | i13;
        if (rVar.h(lVar)) {
            i14 = 2048;
        } else {
            i14 = 1024;
        }
        int i24 = i23 | i14;
        if (rVar.h(qVar)) {
            i15 = 16384;
        } else {
            i15 = 8192;
        }
        int i25 = i24 | i15;
        if (rVar.h(qVar2)) {
            i16 = 131072;
        } else {
            i16 = 65536;
        }
        int i26 = i25 | i16;
        if (rVar.h(qVar3)) {
            i17 = 1048576;
        } else {
            i17 = 524288;
        }
        int i27 = i26 | i17;
        if (rVar.h(qVar4)) {
            i18 = 8388608;
        } else {
            i18 = 4194304;
        }
        int i28 = i27 | i18;
        if (rVar.h(lVar2)) {
            i19 = 67108864;
        } else {
            i19 = 33554432;
        }
        int i29 = i28 | i19;
        if (rVar.h(lVar3)) {
            i20 = 536870912;
        } else {
            i20 = 268435456;
        }
        int i30 = i29 | i20;
        if ((306783379 & i30) != 306783378) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (rVar.R(i30 & 1, z3)) {
            int i31 = m8.f28738a[p8Var.f28913a.ordinal()];
            Object obj = l.f24285a;
            switch (i31) {
                case 1:
                    rVar.a0(1974889294);
                    boolean f11 = rVar.f(str2);
                    Object O = rVar.O();
                    if (f11 || O == obj) {
                        O = Uri.parse(str2);
                        rVar.k0(O);
                    }
                    Uri uri = (Uri) O;
                    uri.getClass();
                    if ((i30 & 57344) == 16384) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    boolean h3 = rVar.h(uri) | z9;
                    Object O2 = rVar.O();
                    if (h3 || O2 == obj) {
                        O2 = new b8.l(qVar, 11, uri);
                        rVar.k0(O2);
                    }
                    F0(uri, lruCache, (df.p) O2, lVar, f10, rVar, (i30 & 7280) | ((i30 << 6) & 57344));
                    rVar = rVar;
                    rVar.p(false);
                    break;
                case 2:
                    rVar.a0(1975257636);
                    if (mf.m.j(str2, "remote:")) {
                        List C2 = mf.f.C(mf.f.F(str2, "remote:", str2), new String[]{"/"});
                        z10 = true;
                        kaVar = new la((String) C2.get(0), (String) C2.get(1));
                    } else {
                        z10 = true;
                        kaVar = new ka(str2);
                    }
                    if ((29360128 & i30) != 8388608) {
                        z10 = false;
                    }
                    boolean f12 = rVar.f(kaVar) | z10;
                    Object O3 = rVar.O();
                    if (f12 || O3 == obj) {
                        O3 = new b8.l(qVar4, 13, kaVar);
                        rVar.k0(O3);
                    }
                    H0(kaVar, (df.p) O3, lVar, f10, rVar, ((i30 >> 3) & 896) | ((i30 << 3) & 7168));
                    rVar.p(false);
                    break;
                case 3:
                    rVar.a0(1975767679);
                    if (mf.m.j(str2, "remote:")) {
                        List C3 = mf.f.C(mf.f.F(str2, "remote:", str2), new String[]{"/"});
                        kaVar2 = new la((String) C3.get(0), (String) C3.get(1));
                    } else {
                        kaVar2 = new ka(str2);
                    }
                    if (kaVar2 instanceof ka) {
                        String str3 = ((ka) kaVar2).f28586a;
                        str = mf.f.G(str3, "/", str3);
                    } else if (kaVar2 instanceof la) {
                        str = ((la) kaVar2).f28658b;
                    } else {
                        l4.a.o();
                        return;
                    }
                    boolean f13 = rVar.f(str2);
                    Object O4 = rVar.O();
                    if (f13 || O4 == obj) {
                        String i32 = mf.m.i(mf.f.A(mf.f.z(str, "washi_")), "_", " ");
                        if (i32.length() > 0) {
                            StringBuilder sb2 = new StringBuilder();
                            char charAt = i32.charAt(0);
                            if (Character.isLowerCase(charAt)) {
                                Locale locale = Locale.getDefault();
                                locale.getClass();
                                valueOf = ya.x0.d(charAt, locale);
                            } else {
                                valueOf = String.valueOf(charAt);
                            }
                            sb2.append((Object) valueOf);
                            sb2.append(i32.substring(1));
                            i32 = sb2.toString();
                        }
                        O4 = i32;
                        rVar.k0(O4);
                    }
                    String str4 = (String) O4;
                    if ((234881024 & i30) == 67108864) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    boolean f14 = rVar.f(kaVar2) | z11;
                    Object O5 = rVar.O();
                    if (f14 || O5 == obj) {
                        O5 = new androidx.ink.brush.b(lVar2, 17, kaVar2);
                        rVar.k0(O5);
                    }
                    O0(kaVar2, str4, (df.a) O5, rVar, 0);
                    rVar.p(false);
                    break;
                case 4:
                    rVar.a0(1976938766);
                    Context context = (Context) rVar.j(AndroidCompositionLocals_androidKt.f642b);
                    boolean f15 = rVar.f(str2);
                    Object O6 = rVar.O();
                    if (f15 || O6 == obj) {
                        O6 = x4.d(context, str2);
                        rVar.k0(O6);
                    }
                    a5 a5Var = (a5) O6;
                    if (a5Var != null) {
                        d5Var = x4.c(context, a5Var);
                    } else {
                        d5Var = null;
                    }
                    d5 d5Var2 = d5Var;
                    if (a5Var != null && d5Var2 != null) {
                        rVar.a0(1977213302);
                        String k12 = k1(a5Var, rVar);
                        if ((458752 & i30) == 131072) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        boolean h10 = z13 | rVar.h(a5Var);
                        Object O7 = rVar.O();
                        if (h10 || O7 == obj) {
                            O7 = new b8.l(qVar2, 14, a5Var);
                            rVar.k0(O7);
                        }
                        E0(d5Var2, k12, (df.p) O7, lVar, f10, null, rVar, (i30 & 7168) | ((i30 << 6) & 57344), 32);
                        rVar = rVar;
                        z12 = false;
                    } else {
                        z12 = false;
                        rVar.a0(1971123197);
                    }
                    rVar.p(z12);
                    rVar.p(z12);
                    break;
                case 5:
                    rVar.a0(2003454339);
                    String str5 = p8Var.f28914b;
                    if ((3670016 & i30) == 1048576) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if ((i30 & 14) == 4) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    boolean z17 = z14 | z15;
                    Object O8 = rVar.O();
                    if (z17 || O8 == obj) {
                        O8 = new b8.l(qVar3, 15, p8Var);
                        rVar.k0(O8);
                    }
                    G0(str5, (df.p) O8, lVar, f10, rVar, ((i30 >> 3) & 896) | ((i30 << 3) & 7168));
                    rVar.p(false);
                    break;
                case 6:
                    boolean z18 = false;
                    rVar.a0(1977779424);
                    u4 i110 = i1(str2);
                    if (i110 == null) {
                        rVar.a0(1977779423);
                    } else {
                        rVar.a0(1977779424);
                        if ((1879048192 & i30) == 536870912) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        boolean f16 = z16 | rVar.f(i110);
                        Object O9 = rVar.O();
                        if (f16 || O9 == obj) {
                            O9 = new androidx.ink.brush.b(lVar3, 18, i110);
                            rVar.k0(O9);
                        }
                        D0(i110, (df.a) O9, lVar, f10, rVar, ((i30 >> 3) & 896) | ((i30 << 3) & 7168));
                        z18 = false;
                    }
                    rVar.p(z18);
                    rVar.p(z18);
                    break;
                default:
                    rVar.a0(2003370108);
                    rVar.p(false);
                    l4.a.o();
                    return;
            }
        } else {
            rVar.U();
        }
        q1 t3 = rVar.t();
        if (t3 != null) {
            t3.f24332d = new df.p(lruCache, f10, lVar, qVar, qVar2, qVar3, qVar4, lVar2, lVar3, i10) { // from class: w7.j8
                public final /* synthetic */ df.q A;
                public final /* synthetic */ df.q B;
                public final /* synthetic */ df.l C;
                public final /* synthetic */ df.l D;

                /* renamed from: v, reason: collision with root package name */
                public final /* synthetic */ LruCache f28519v;

                /* renamed from: w, reason: collision with root package name */
                public final /* synthetic */ float f28520w;

                /* renamed from: x, reason: collision with root package name */
                public final /* synthetic */ df.l f28521x;

                /* renamed from: y, reason: collision with root package name */
                public final /* synthetic */ df.q f28522y;

                /* renamed from: z, reason: collision with root package name */
                public final /* synthetic */ df.q f28523z;

                @Override // df.p
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int L = y.L(1);
                    n4.y0(p8.this, this.f28519v, this.f28520w, this.f28521x, this.f28522y, this.f28523z, this.A, this.B, this.C, this.D, (m) obj2, L);
                    return pe.z.f22715a;
                }
            };
        }
    }

    public static List y1(Context context, List list, long j10, float f10, float f11, float f12) {
        float f13 = f11;
        float f14 = f12;
        context.getClass();
        Iterator it = list.iterator();
        ArrayList arrayList = null;
        while (it.hasNext()) {
            u7.d dVar = (u7.d) it.next();
            if (dVar.f26041k && !dVar.f26042l) {
                pe.j V = u7.e.V(context, dVar, f13, f14);
                float floatValue = ((Number) V.f22693u).floatValue();
                float floatValue2 = ((Number) V.f22694v).floatValue();
                float intBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32)) - (dVar.f26037f * f13);
                float intBitsToFloat2 = Float.intBitsToFloat((int) (j10 & 4294967295L)) - (dVar.f26038g * f14);
                double d2 = dVar.i * 0.017453292519943295d;
                double cos = Math.cos(d2);
                double sin = Math.sin(d2);
                double d10 = intBitsToFloat2;
                double d11 = (d10 * sin) + (intBitsToFloat * cos);
                double d12 = (d10 * cos) + ((-intBitsToFloat) * sin);
                if (Math.abs(d11) <= floatValue + f10 && Math.abs(d12) <= floatValue2 + f10) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(dVar.f26033a);
                }
            }
            f13 = f11;
            f14 = f12;
        }
        if (arrayList == null) {
            return qe.s.f24023u;
        }
        return arrayList;
    }

    public static final boolean z(n2 n2Var) {
        return ((Boolean) n2Var.getValue()).booleanValue();
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:13:0x0054. Please report as an issue. */
    public static final void z0(p8 p8Var, LruCache lruCache, m mVar, int i10) {
        int i11;
        int i12;
        boolean z3;
        LruCache lruCache2;
        boolean z9;
        ma kaVar;
        a1 a1Var;
        boolean z10;
        String str;
        n r0Var;
        r rVar = (r) mVar;
        rVar.c0(-2132963838);
        if (rVar.f(p8Var)) {
            i11 = 4;
        } else {
            i11 = 2;
        }
        int i13 = i11 | i10;
        if (rVar.h(lruCache)) {
            i12 = 32;
        } else {
            i12 = 16;
        }
        int i14 = i13 | i12;
        boolean z11 = true;
        if ((i14 & 19) != 18) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (rVar.R(i14 & 1, z3)) {
            o2 o2Var = AndroidCompositionLocals_androidKt.f642b;
            Context context = (Context) rVar.j(o2Var);
            q8 q8Var = p8Var.f28913a;
            String str2 = p8Var.f28914b;
            int i15 = m8.f28738a[q8Var.ordinal()];
            v0 v0Var = l.f24285a;
            te.c cVar = null;
            switch (i15) {
                case 1:
                    rVar.a0(916337466);
                    boolean f10 = rVar.f(str2);
                    Object O = rVar.O();
                    if (f10 || O == v0Var) {
                        O = Uri.parse(str2);
                        rVar.k0(O);
                    }
                    Uri uri = (Uri) O;
                    boolean f11 = rVar.f(str2);
                    Object O2 = rVar.O();
                    if (f11 || O2 == v0Var) {
                        O2 = y.B(null);
                        rVar.k0(O2);
                    }
                    a1 a1Var2 = (a1) O2;
                    boolean f12 = rVar.f(a1Var2) | rVar.h(context) | rVar.h(uri) | rVar.h(lruCache);
                    Object O3 = rVar.O();
                    if (!f12 && O3 != v0Var) {
                        z9 = false;
                        lruCache2 = lruCache;
                    } else {
                        z9 = false;
                        v6 v6Var = new v6(context, uri, lruCache, a1Var2, null, 1);
                        lruCache2 = lruCache;
                        rVar.k0(v6Var);
                        O3 = v6Var;
                    }
                    y.f((df.p) O3, str2, rVar);
                    f fVar = (f) a1Var2.getValue();
                    if (fVar == null) {
                        rVar.a0(916598547);
                    } else {
                        rVar.a0(916598548);
                        ya.wa.b(fVar, null, androidx.compose.foundation.layout.d.f506c, n.f31848a, rVar, 25008, 232);
                    }
                    rVar.p(z9);
                    rVar.p(z9);
                    break;
                case 2:
                case 3:
                    rVar.a0(915721868);
                    if (mf.m.j(str2, "remote:")) {
                        List C2 = mf.f.C(mf.f.F(str2, "remote:", str2), new String[]{"/"});
                        kaVar = new la((String) C2.get(0), (String) C2.get(1));
                    } else {
                        kaVar = new ka(str2);
                    }
                    boolean f13 = rVar.f(str2);
                    Object O4 = rVar.O();
                    if (f13 || O4 == v0Var) {
                        O4 = y.B(null);
                        rVar.k0(O4);
                    }
                    a1 a1Var3 = (a1) O4;
                    boolean f14 = rVar.f(a1Var3) | rVar.h(context) | rVar.f(kaVar);
                    Object O5 = rVar.O();
                    if (!f14 && O5 != v0Var) {
                        a1Var = a1Var3;
                    } else {
                        a1Var = a1Var3;
                        l8 l8Var = new l8(context, kaVar, a1Var, cVar, 0);
                        rVar.k0(l8Var);
                        O5 = l8Var;
                    }
                    y.f((df.p) O5, str2, rVar);
                    f fVar2 = (f) a1Var.getValue();
                    if (fVar2 == null) {
                        rVar.a0(916137670);
                        rVar.p(false);
                        z10 = false;
                    } else {
                        rVar.a0(916137671);
                        z10 = false;
                        ya.wa.b(fVar2, null, androidx.compose.foundation.layout.a.k(androidx.compose.foundation.layout.d.f506c, 2), n.f31849b, rVar, 25008, 232);
                        rVar.p(false);
                    }
                    rVar.p(z10);
                    lruCache2 = lruCache;
                    break;
                case 4:
                    rVar.a0(917831790);
                    Context context2 = (Context) rVar.j(o2Var);
                    boolean f15 = rVar.f(str2);
                    Object O6 = rVar.O();
                    if (f15 || O6 == v0Var) {
                        a5 d2 = x4.d(context2, str2);
                        if (d2 != null) {
                            O6 = x4.c(context2, d2);
                        } else {
                            O6 = null;
                        }
                        rVar.k0(O6);
                    }
                    d5 d5Var = (d5) O6;
                    if (d5Var != null) {
                        str = d5Var.f28081b;
                    } else {
                        str = null;
                    }
                    boolean h3 = rVar.h(d5Var);
                    Object O7 = rVar.O();
                    if (h3 || O7 == v0Var) {
                        O7 = new u6(d5Var, cVar, 1);
                        rVar.k0(O7);
                    }
                    a1 D2 = y.D(null, str, (df.p) O7, rVar, 6);
                    if (d5Var != null) {
                        rVar.a0(918874165);
                        r k3 = androidx.compose.foundation.layout.a.k(androidx.compose.foundation.layout.d.f506c, 3);
                        boolean h10 = rVar.h(d5Var) | rVar.f(D2);
                        Object O8 = rVar.O();
                        if (h10 || O8 == v0Var) {
                            O8 = new k6(d5Var, D2, 1);
                            rVar.k0(O8);
                        }
                        ya.ta.a(k3, (df.l) O8, rVar, 6);
                    } else {
                        rVar.a0(907135488);
                    }
                    rVar.p(false);
                    rVar.p(false);
                    lruCache2 = lruCache;
                    break;
                case 5:
                    rVar.a0(-1078787960);
                    r k4 = androidx.compose.foundation.layout.a.k(androidx.compose.foundation.layout.d.f506c, 4);
                    if ((i14 & 14) != 4) {
                        z11 = false;
                    }
                    Object O9 = rVar.O();
                    if (z11 || O9 == v0Var) {
                        O9 = new k8(p8Var);
                        rVar.k0(O9);
                    }
                    ya.ta.a(k4, (df.l) O9, rVar, 6);
                    rVar.p(false);
                    lruCache2 = lruCache;
                    break;
                case 6:
                    rVar.a0(916799955);
                    u4 i16 = i1(str2);
                    if (i16 == null) {
                        rVar.a0(916799954);
                    } else {
                        r rVar2 = i16.f29212d;
                        rVar.a0(916799955);
                        FillElement fillElement = androidx.compose.foundation.layout.d.f506c;
                        long j10 = i16.f29211c;
                        if (rVar2 != null) {
                            r0Var = new c0(qe.m.h(new r(j10), rVar2), null, 0L, 9187343241974906880L);
                        } else {
                            r0Var = new r0(j10);
                        }
                        m.a(0, androidx.compose.foundation.a(fillElement, r0Var, 6), rVar);
                    }
                    rVar.p(false);
                    rVar.p(false);
                    lruCache2 = lruCache;
                    break;
                default:
                    rVar.a0(-1078838041);
                    rVar.p(false);
                    l4.a.o();
                    return;
            }
        } else {
            lruCache2 = lruCache;
            rVar.U();
        }
        q1 t3 = rVar.t();
        if (t3 != null) {
            t3.f24332d = new b8.l(i10, 12, p8Var, lruCache2);
        }
    }
}
