package uf;
import a.a;
import m.h;
import r.c;
import x.m;
import x.p0;

import androidx.compose.foundation.layout.FillElement;
import b2.b0;
import com.daren.scraply.R;
import com.google.android.gms.internal.ads.gl;
import java.util.Iterator;
import k1.c0;
import k1.k0;
import k1.l0;
import o0.x1;
import pe.z;
import r0.v0;
import w7.f3;
import w7.n4;
import w7.u4;
import wa.j7;
import wa.m9;
import wa.n7;
import wa.o9;
import wa.p9;
import x.o0;
import ya.sa;
import ya.ta;

/* loaded from: classes.dex */
public final /* synthetic */ class u implements df.p {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f27242u;

    public /* synthetic */ u(int i) {
        this.f27242u = i;
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        boolean z3;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        boolean z20;
        boolean z21;
        boolean z22;
        boolean z23;
        int i = this.f27242u;
        v0 v0Var = r0.l.f24285a;
        k0 k0Var = l0.f19495a;
        d1.o oVar = d1.o.f15687a;
        z zVar = z.f22715a;
        boolean z24 = false;
        int i10 = 2;
        switch (i) {
            case 0:
                v vVar = (v) obj;
                te.e eVar = (te.e) obj2;
                if (vVar == null) {
                    if (eVar instanceof v) {
                        return (v) eVar;
                    }
                    return null;
                }
                return vVar;
            case 1:
                y yVar = (y) obj;
                te.e eVar2 = (te.e) obj2;
                if (eVar2 instanceof v) {
                    v vVar2 = (v) eVar2;
                    te.g gVar = yVar.f27249a;
                    ThreadLocal threadLocal = vVar2.f27244v;
                    Object obj3 = threadLocal.get();
                    threadLocal.set(vVar2.f27243u);
                    Object[] objArr = yVar.f27250b;
                    int i11 = yVar.f27252d;
                    objArr[i11] = obj3;
                    v[] vVarArr = yVar.f27251c;
                    yVar.f27252d = i11 + 1;
                    vVarArr[i11] = vVar2;
                }
                return yVar;
            case 2:
                r0.m mVar = (r0.m) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z24 = true;
                }
                r0.r rVar = (r0.r) mVar;
                if (rVar.R(intValue & 1, z24)) {
                    o0.y.b(m9.a(), n7.b(R.string.canvas_add_color, rVar), null, k1.r.f19515d, rVar, 3072, 4);
                } else {
                    rVar.U();
                }
                return zVar;
            case 3:
                r0.m mVar2 = (r0.m) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if ((intValue2 & 3) != 2) {
                    z24 = true;
                }
                r0.r rVar2 = (r0.r) mVar2;
                if (rVar2.R(intValue2 & 1, z24)) {
                    o0.y.b(p9.a(), n7.b(R.string.canvas_cancel_tape, rVar2), null, k1.c(k1.r.f19515d, 0.7f), rVar2, 3072, 4);
                } else {
                    rVar2.U();
                }
                return zVar;
            case 4:
                r0.m mVar3 = (r0.m) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if ((intValue3 & 3) != 2) {
                    z24 = true;
                }
                r0.r rVar3 = (r0.r) mVar3;
                if (rVar3.R(intValue3 & 1, z24)) {
                    o0.y.b(p9.a(), n7.b(R.string.canvas_close, rVar3), androidx.compose.foundation.layout.d.k(oVar, 14), k1.r.f19515d, rVar3, 3456, 0);
                } else {
                    rVar3.U();
                }
                return zVar;
            case 5:
                r0.m mVar4 = (r0.m) obj;
                int intValue4 = ((Integer) obj2).intValue();
                if ((intValue4 & 3) != 2) {
                    z24 = true;
                }
                r0.r rVar4 = (r0.r) mVar4;
                if (rVar4.R(intValue4 & 1, z24)) {
                    o0.y.b(o9.a(), n7.b(R.string.confirm, rVar4), androidx.compose.foundation.layout.d.k(oVar, 20), k1.r.f19515d, rVar4, 3456, 0);
                } else {
                    rVar4.U();
                }
                return zVar;
            case 6:
                r0.m mVar5 = (r0.m) obj;
                int intValue5 = ((Integer) obj2).intValue();
                if ((intValue5 & 3) != 2) {
                    z24 = true;
                }
                r0.r rVar5 = (r0.r) mVar5;
                if (rVar5.R(intValue5 & 1, z24)) {
                    o0.y.b(p9.a(), n7.b(R.string.cancel, rVar5), androidx.compose.foundation.layout.d.k(oVar, 18), k1.c(k1.r.f19515d, 0.85f), rVar5, 3456, 0);
                } else {
                    rVar5.U();
                }
                return zVar;
            case 7:
                r0.m mVar6 = (r0.m) obj;
                int intValue6 = ((Integer) obj2).intValue();
                if ((intValue6 & 3) != 2) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                r0.r rVar6 = (r0.r) mVar6;
                if (rVar6.R(intValue6 & 1, z3)) {
                    d1.r b10 = androidx.compose.foundation.a.b(androidx.compose.foundation.layout.d.f506c, l0.d(4280624688L), k0Var);
                    p0 d2 = m.d(d1.c.f15674y, false);
                    int hashCode = Long.hashCode(rVar6.T);
                    z0.g l10 = rVar6.l();
                    d1.r c10 = d1.a.c(b10, rVar6);
                    b2.h.f1471d.getClass();
                    b0 b0Var = b2.g.f1462b;
                    rVar6.e0();
                    if (rVar6.S) {
                        rVar6.k(b0Var);
                    } else {
                        rVar6.n0();
                    }
                    r0.y.I(b2.g.e, d2, rVar6);
                    r0.y.I(b2.g.f1464d, l10, rVar6);
                    b2.f fVar = b2.g.f1465f;
                    if (rVar6.S || !kotlin.jvm.internal.a(rVar6.O(), Integer.valueOf(hashCode))) {
                        a.t(hashCode, rVar6, hashCode, fVar);
                    }
                    r0.y.I(b2.g.f1463c, c10, rVar6);
                    d1.r k3 = androidx.compose.foundation.layout.d.k(oVar, 36);
                    Object O = rVar6.O();
                    if (O == v0Var) {
                        O = new f3(i10);
                        rVar6.k0(O);
                    }
                    ta.a(k3, (df.l) O, rVar6, 54);
                    rVar6.p(true);
                } else {
                    rVar6.U();
                }
                return zVar;
            case 8:
                r0.m mVar7 = (r0.m) obj;
                int intValue7 = ((Integer) obj2).intValue();
                if ((intValue7 & 3) != 2) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                r0.r rVar7 = (r0.r) mVar7;
                if (rVar7.R(intValue7 & 1, z9)) {
                    FillElement fillElement = androidx.compose.foundation.layout.d.f506c;
                    d1.r b11 = androidx.compose.foundation.a.b(fillElement, l0.d(4282263331L), k0Var);
                    p0 d10 = m.d(d1.c.f15674y, false);
                    int hashCode2 = Long.hashCode(rVar7.T);
                    z0.g l11 = rVar7.l();
                    d1.r c11 = d1.a.c(b11, rVar7);
                    b2.h.f1471d.getClass();
                    b0 b0Var2 = b2.g.f1462b;
                    rVar7.e0();
                    if (rVar7.S) {
                        rVar7.k(b0Var2);
                    } else {
                        rVar7.n0();
                    }
                    r0.y.I(b2.g.e, d10, rVar7);
                    r0.y.I(b2.g.f1464d, l11, rVar7);
                    b2.f fVar2 = b2.g.f1465f;
                    if (rVar7.S || !kotlin.jvm.internal.a(rVar7.O(), Integer.valueOf(hashCode2))) {
                        a.t(hashCode2, rVar7, hashCode2, fVar2);
                    }
                    r0.y.I(b2.g.f1463c, c11, rVar7);
                    Object O2 = rVar7.O();
                    if (O2 == v0Var) {
                        O2 = new f3(3);
                        rVar7.k0(O2);
                    }
                    ta.a(fillElement, (df.l) O2, rVar7, 54);
                    rVar7.p(true);
                } else {
                    rVar7.U();
                }
                return zVar;
            case 9:
                r0.m mVar8 = (r0.m) obj;
                int intValue8 = ((Integer) obj2).intValue();
                if ((intValue8 & 3) != 2) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                r0.r rVar8 = (r0.r) mVar8;
                if (rVar8.R(intValue8 & 1, z10)) {
                    d1.r b12 = androidx.compose.foundation.a.b(androidx.compose.foundation.layout.d.f506c, l0.d(4280299578L), k0Var);
                    p0 d11 = m.d(d1.c.f15674y, false);
                    int hashCode3 = Long.hashCode(rVar8.T);
                    z0.g l12 = rVar8.l();
                    d1.r c12 = d1.a.c(b12, rVar8);
                    b2.h.f1471d.getClass();
                    b0 b0Var3 = b2.g.f1462b;
                    rVar8.e0();
                    if (rVar8.S) {
                        rVar8.k(b0Var3);
                    } else {
                        rVar8.n0();
                    }
                    r0.y.I(b2.g.e, d11, rVar8);
                    r0.y.I(b2.g.f1464d, l12, rVar8);
                    b2.f fVar3 = b2.g.f1465f;
                    if (rVar8.S || !kotlin.jvm.internal.a(rVar8.O(), Integer.valueOf(hashCode3))) {
                        a.t(hashCode3, rVar8, hashCode3, fVar3);
                    }
                    r0.y.I(b2.g.f1463c, c12, rVar8);
                    d1.r k4 = androidx.compose.foundation.layout.d.k(oVar, 44);
                    Object O3 = rVar8.O();
                    if (O3 == v0Var) {
                        z11 = true;
                        O3 = new f3(1 == true ? 1 : 0);
                        rVar8.k0(O3);
                    } else {
                        z11 = true;
                    }
                    ta.a(k4, (df.l) O3, rVar8, 54);
                    rVar8.p(z11);
                } else {
                    rVar8.U();
                }
                return zVar;
            case 10:
                r0.m mVar9 = (r0.m) obj;
                int intValue9 = ((Integer) obj2).intValue();
                if ((intValue9 & 3) != 2) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                r0.r rVar9 = (r0.r) mVar9;
                if (rVar9.R(intValue9 & 1, z12)) {
                    d1.r a10 = androidx.compose.foundation.a(androidx.compose.foundation.layout.d.f506c, new c0(qe.h(new k1.r(l0.d(4294929259L)), new k1.r(l0.d(4294960749L))), null, 0L, 9187343241974906880L), 6);
                    p0 d12 = m.d(d1.c.f15674y, false);
                    int hashCode4 = Long.hashCode(rVar9.T);
                    z0.g l13 = rVar9.l();
                    d1.r c13 = d1.a.c(a10, rVar9);
                    b2.h.f1471d.getClass();
                    b0 b0Var4 = b2.g.f1462b;
                    rVar9.e0();
                    if (rVar9.S) {
                        rVar9.k(b0Var4);
                    } else {
                        rVar9.n0();
                    }
                    b2.f fVar4 = b2.g.e;
                    r0.y.I(fVar4, d12, rVar9);
                    b2.f fVar5 = b2.g.f1464d;
                    r0.y.I(fVar5, l13, rVar9);
                    b2.f fVar6 = b2.g.f1465f;
                    if (rVar9.S || !kotlin.jvm.internal.a(rVar9.O(), Integer.valueOf(hashCode4))) {
                        a.t(hashCode4, rVar9, hashCode4, fVar6);
                    }
                    b2.f fVar7 = b2.g.f1463c;
                    r0.y.I(fVar7, c13, rVar9);
                    p0 a11 = o0.a(h.i(5), d1.c.D, rVar9, 6);
                    int hashCode5 = Long.hashCode(rVar9.T);
                    z0.g l14 = rVar9.l();
                    d1.r c14 = d1.a.c(oVar, rVar9);
                    rVar9.e0();
                    if (rVar9.S) {
                        rVar9.k(b0Var4);
                    } else {
                        rVar9.n0();
                    }
                    r0.y.I(fVar4, a11, rVar9);
                    r0.y.I(fVar5, l14, rVar9);
                    if (rVar9.S || !kotlin.jvm.internal.a(rVar9.O(), Integer.valueOf(hashCode5))) {
                        a.t(hashCode5, rVar9, hashCode5, fVar6);
                    }
                    r0.y.I(fVar7, c14, rVar9);
                    rVar9.a0(-79679189);
                    Iterator it = qe.h(new k1.r(l0.d(4282339765L)), new k1.r(l0.d(4281896508L)), new k1.r(l0.d(4289533015L)), new k1.r(l0.d(4281084974L))).iterator();
                    while (it.hasNext()) {
                        long j10 = ((k1.r) it.next()).f19523a;
                        d1.r k10 = androidx.compose.foundation.layout.d.k(oVar, 14);
                        f0.d dVar = f0.e.f16629a;
                        m.a(0, sa.a(androidx.compose.foundation.a.b(j7.a(k10, dVar), j10, k0Var), 1, k1.c(k1.r.f19515d, 0.3f), dVar), rVar9);
                    }
                    rVar9.p(false);
                    rVar9.p(true);
                    rVar9.p(true);
                } else {
                    rVar9.U();
                }
                return zVar;
            case 11:
                r0.m mVar10 = (r0.m) obj;
                int intValue10 = ((Integer) obj2).intValue();
                if ((intValue10 & 3) != 2) {
                    z24 = true;
                }
                r0.r rVar10 = (r0.r) mVar10;
                if (rVar10.R(intValue10 & 1, z24)) {
                    x1.b(n7.b(R.string.rename, rVar10), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, rVar10, 0, 0, 131070);
                } else {
                    rVar10.U();
                }
                return zVar;
            case 12:
                r0.m mVar11 = (r0.m) obj;
                int intValue11 = ((Integer) obj2).intValue();
                if ((intValue11 & 3) != 2) {
                    z24 = true;
                }
                r0.r rVar11 = (r0.r) mVar11;
                if (rVar11.R(intValue11 & 1, z24)) {
                    x1.b(n7.b(R.string.duplicate, rVar11), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, rVar11, 0, 0, 131070);
                } else {
                    rVar11.U();
                }
                return zVar;
            case 13:
                r0.m mVar12 = (r0.m) obj;
                int intValue12 = ((Integer) obj2).intValue();
                if ((intValue12 & 3) != 2) {
                    z24 = true;
                }
                r0.r rVar12 = (r0.r) mVar12;
                if (rVar12.R(intValue12 & 1, z24)) {
                    x1.b(n7.b(R.string.bring_forward, rVar12), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, rVar12, 0, 0, 131070);
                } else {
                    rVar12.U();
                }
                return zVar;
            case 14:
                r0.m mVar13 = (r0.m) obj;
                int intValue13 = ((Integer) obj2).intValue();
                if ((intValue13 & 3) != 2) {
                    z24 = true;
                }
                r0.r rVar13 = (r0.r) mVar13;
                if (rVar13.R(intValue13 & 1, z24)) {
                    x1.b(n7.b(R.string.send_backward, rVar13), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, rVar13, 0, 0, 131070);
                } else {
                    rVar13.U();
                }
                return zVar;
            case 15:
                r0.m mVar14 = (r0.m) obj;
                int intValue14 = ((Integer) obj2).intValue();
                if ((intValue14 & 3) != 2) {
                    z24 = true;
                }
                r0.r rVar14 = (r0.r) mVar14;
                if (rVar14.R(intValue14 & 1, z24)) {
                    x1.b(n7.b(R.string.delete, rVar14), null, l0.d(4293216333L), 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, rVar14, 384, 0, 131066);
                } else {
                    rVar14.U();
                }
                return zVar;
            case 16:
                r0.m mVar15 = (r0.m) obj;
                int intValue15 = ((Integer) obj2).intValue();
                if ((intValue15 & 3) != 2) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                r0.r rVar15 = (r0.r) mVar15;
                if (rVar15.R(intValue15 & 1, z13)) {
                    n4.j0(0, rVar15);
                } else {
                    rVar15.U();
                }
                return zVar;
            case 17:
                r0.m mVar16 = (r0.m) obj;
                int intValue16 = ((Integer) obj2).intValue();
                if ((intValue16 & 3) != 2) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                r0.r rVar16 = (r0.r) mVar16;
                if (rVar16.R(intValue16 & 1, z14)) {
                    n4.P0(0, rVar16);
                } else {
                    rVar16.U();
                }
                return zVar;
            case 18:
                r0.m mVar17 = (r0.m) obj;
                int intValue17 = ((Integer) obj2).intValue();
                if ((intValue17 & 3) != 2) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                r0.r rVar17 = (r0.r) mVar17;
                if (rVar17.R(intValue17 & 1, z15)) {
                    n4.j0(0, rVar17);
                } else {
                    rVar17.U();
                }
                return zVar;
            case 19:
                r0.m mVar18 = (r0.m) obj;
                int intValue18 = ((Integer) obj2).intValue();
                if ((intValue18 & 3) != 2) {
                    z24 = true;
                }
                r0.r rVar18 = (r0.r) mVar18;
                if (rVar18.R(intValue18 & 1, z24)) {
                    n4.o0(true, rVar18, 6);
                } else {
                    rVar18.U();
                }
                return zVar;
            case 20:
                r0.m mVar19 = (r0.m) obj;
                int intValue19 = ((Integer) obj2).intValue();
                if ((intValue19 & 3) != 2) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                r0.r rVar19 = (r0.r) mVar19;
                if (rVar19.R(intValue19 & 1, z16)) {
                    n4.o0(false, rVar19, 6);
                } else {
                    rVar19.U();
                }
                return zVar;
            case gl.zzm /* 21 */:
                r0.m mVar20 = (r0.m) obj;
                int intValue20 = ((Integer) obj2).intValue();
                if ((intValue20 & 3) != 2) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                r0.r rVar20 = (r0.r) mVar20;
                if (rVar20.R(intValue20 & 1, z17)) {
                    n4.u0(0, rVar20);
                } else {
                    rVar20.U();
                }
                return zVar;
            case 22:
                r0.m mVar21 = (r0.m) obj;
                int intValue21 = ((Integer) obj2).intValue();
                if ((intValue21 & 3) != 2) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                r0.r rVar21 = (r0.r) mVar21;
                if (rVar21.R(intValue21 & 1, z18)) {
                    n4.i0(0, rVar21);
                } else {
                    rVar21.U();
                }
                return zVar;
            case 23:
                r0.m mVar22 = (r0.m) obj;
                int intValue22 = ((Integer) obj2).intValue();
                if ((intValue22 & 3) != 2) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                r0.r rVar22 = (r0.r) mVar22;
                if (rVar22.R(intValue22 & 1, z19)) {
                    n4.Q0(0, rVar22);
                } else {
                    rVar22.U();
                }
                return zVar;
            case 24:
                r0.m mVar23 = (r0.m) obj;
                int intValue23 = ((Integer) obj2).intValue();
                if ((intValue23 & 3) != 2) {
                    z20 = true;
                } else {
                    z20 = false;
                }
                r0.r rVar23 = (r0.r) mVar23;
                if (rVar23.R(intValue23 & 1, z20)) {
                    n4.k0(0, rVar23);
                } else {
                    rVar23.U();
                }
                return zVar;
            case 25:
                r0.m mVar24 = (r0.m) obj;
                int intValue24 = ((Integer) obj2).intValue();
                if ((intValue24 & 3) != 2) {
                    z21 = true;
                } else {
                    z21 = false;
                }
                r0.r rVar24 = (r0.r) mVar24;
                if (rVar24.R(intValue24 & 1, z21)) {
                    n4.n0(0, rVar24);
                } else {
                    rVar24.U();
                }
                return zVar;
            case 26:
                r0.m mVar25 = (r0.m) obj;
                int intValue25 = ((Integer) obj2).intValue();
                if ((intValue25 & 3) != 2) {
                    z22 = true;
                } else {
                    z22 = false;
                }
                r0.r rVar25 = (r0.r) mVar25;
                if (rVar25.R(intValue25 & 1, z22)) {
                    n4.l0(0, rVar25);
                } else {
                    rVar25.U();
                }
                return zVar;
            case 27:
                r0.m mVar26 = (r0.m) obj;
                int intValue26 = ((Integer) obj2).intValue();
                if ((intValue26 & 3) != 2) {
                    z23 = true;
                } else {
                    z23 = false;
                }
                r0.r rVar26 = (r0.r) mVar26;
                if (rVar26.R(intValue26 & 1, z23)) {
                    n4.P0(0, rVar26);
                } else {
                    rVar26.U();
                }
                return zVar;
            case 28:
                ((Integer) obj).intValue();
                pe.j jVar = (pe.j) obj2;
                jVar.getClass();
                return "shape_" + jVar.f22693u;
            default:
                ((Integer) obj).intValue();
                u4 u4Var = (u4) obj2;
                u4Var.getClass();
                return g3.a.k("f_", u4Var.f29209a);
        }
    }
}
