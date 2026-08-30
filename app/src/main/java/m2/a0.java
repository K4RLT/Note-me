package m2;
import b.c;
import d.b;
import e0.a;
import o0.y;
import q.x;
import r0.m;
import r0.r;

import com.google.android.gms.internal.ads.gl;
import com.google.android.gms.internal.ads.x90;
import java.util.ArrayList;
import java.util.Collection;
import wa.n9;
import ya.ha;
import ya.kc;

/* loaded from: classes.dex */
public final /* synthetic */ class a0 implements df.p {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f20439u;

    public /* synthetic */ a0(int i) {
        this.f20439u = i;
    }

    /* JADX WARN: Type inference failed for: r1v13, types: [java.util.List, java.lang.Object] */
    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        i iVar;
        Object a10;
        te.b bVar;
        int i;
        int i10 = this.f20439u;
        Integer num = null;
        boolean z3 = false;
        boolean z9 = false;
        boolean z10 = false;
        pe.z zVar = pe.z.f22715a;
        switch (i10) {
            case 0:
                y2.o oVar = (y2.o) obj2;
                long j10 = y2.o.f30819c;
                if (oVar != null) {
                    z3 = y2.o.a(oVar.f30820a, j10);
                }
                if (z3) {
                    return Boolean.FALSE;
                }
                return qe.a(Float.valueOf(y2.o.c(oVar.f30820a)), new y2.p(y2.o.b(oVar.f30820a)));
            case 1:
                j1.b bVar2 = (j1.b) obj2;
                if (bVar2 != null) {
                    z10 = j1.c(bVar2.f18762a, 9205357640488583168L);
                }
                if (z10) {
                    return Boolean.FALSE;
                }
                return qe.a(Float.valueOf(Float.intBitsToFloat((int) (bVar2.f18762a >> 32))), Float.valueOf(Float.intBitsToFloat((int) (bVar2.f18762a & 4294967295L))));
            case 2:
                a1.d dVar = (a1.d) obj;
                Object r12 = ((t2.b) obj2).f25638u;
                ArrayList arrayList = new ArrayList(r12.size());
                int size = ((Collection) r12).size();
                for (int i11 = 0; i11 < size; i11++) {
                    arrayList.add(a((t2.a) r12.get(i11), e0.f20472t, dVar));
                }
                return arrayList;
            case 3:
                return ((t2.a) obj2).f25636a.toLanguageTag();
            case 4:
                x2.i iVar2 = (x2.i) obj2;
                return qe.a(new x2.f(iVar2.f30055a), new x2.h(iVar2.f30056b), new Object());
            case 5:
                a1.d dVar2 = (a1.d) obj;
                e eVar = (e) obj2;
                Object obj3 = eVar.f20451a;
                if (obj3 instanceof v) {
                    iVar = i.f20498u;
                } else if (obj3 instanceof h0) {
                    iVar = i.f20499v;
                } else if (obj3 instanceof s0) {
                    iVar = i.f20500w;
                } else if (obj3 instanceof r0) {
                    iVar = i.f20501x;
                } else if (obj3 instanceof m) {
                    iVar = i.f20502y;
                } else if (obj3 instanceof l) {
                    iVar = i.f20503z;
                } else if (obj3 instanceof j0) {
                    iVar = i.A;
                } else {
                    x.h();
                    return null;
                }
                switch (iVar.ordinal()) {
                    case 0:
                        obj3.getClass();
                        a10 = a((v) obj3, e0.f20460g, dVar2);
                        break;
                    case 1:
                        obj3.getClass();
                        a10 = a((h0) obj3, e0.f20461h, dVar2);
                        break;
                    case 2:
                        obj3.getClass();
                        a10 = a((s0) obj3, e0.f20457c, dVar2);
                        break;
                    case 3:
                        obj3.getClass();
                        a10 = a((r0) obj3, e0.f20458d, dVar2);
                        break;
                    case 4:
                        obj3.getClass();
                        a10 = a((m) obj3, e0.e, dVar2);
                        break;
                    case 5:
                        obj3.getClass();
                        a10 = a((l) obj3, e0.f20459f, dVar2);
                        break;
                    case 6:
                        obj3.getClass();
                        a10 = ((j0) obj3).f20509a;
                        break;
                    default:
                        l4.a.o();
                        return null;
                }
                return qe.a(iVar, a10, Integer.valueOf(eVar.f20452b), Integer.valueOf(eVar.f20453c), eVar.f20454d);
            case 6:
                l lVar = (l) obj2;
                return qe.a(lVar.f20512a, a(lVar.f20513b, e0.i, (a1.d) obj));
            case 7:
                return ((s0) obj2).f20567a;
            case 8:
                return ((r0) obj2).f20560a;
            case 9:
                a1.d dVar3 = (a1.d) obj;
                v vVar = (v) obj2;
                x2.k kVar = new x2.k(vVar.f20571a);
                x2.m mVar = new x2.m(vVar.f20572b);
                Object a11 = a(new y2.o(vVar.f20573c), e0.f20469q, dVar3);
                x2.q qVar = vVar.f20574d;
                x2.q qVar2 = x2.q.f30070c;
                Object a12 = a(qVar, e0.f20464l, dVar3);
                Object a13 = a(vVar.e, g0.f20480a, dVar3);
                x2.i iVar3 = vVar.f20575f;
                x2.i iVar4 = x2.i.f30054c;
                return qe.a(kVar, mVar, a11, a12, a13, a(iVar3, e0.f20473u, dVar3), a(new x2.e(vVar.f20576g), g0.f20481b, dVar3), new x2.d(vVar.f20577h), a(vVar.i, g0.f20482c, dVar3));
            case 10:
                a1.d dVar4 = (a1.d) obj;
                h0 h0Var = (h0) obj2;
                k1.r rVar = new k1.r(h0Var.f20484a.b());
                d0 d0Var = e0.f20468p;
                Object a14 = a(rVar, d0Var, dVar4);
                y2.o oVar2 = new y2.o(h0Var.f20485b);
                d0 d0Var2 = e0.f20469q;
                Object a15 = a(oVar2, d0Var2, dVar4);
                q2.s sVar = h0Var.f20486c;
                q2.s sVar2 = q2.s.f23364v;
                Object a16 = a(sVar, e0.f20465m, dVar4);
                q2.o oVar3 = h0Var.f20487d;
                q2.p pVar = h0Var.e;
                String str = h0Var.f20489g;
                Object a17 = a(new y2.o(h0Var.f20490h), d0Var2, dVar4);
                Object a18 = a(h0Var.i, e0.f20466n, dVar4);
                Object a19 = a(h0Var.f20491j, e0.f20463k, dVar4);
                t2.b bVar3 = h0Var.f20492k;
                t2.b bVar4 = t2.b.f25637w;
                Object a20 = a(bVar3, e0.f20471s, dVar4);
                Object a21 = a(new k1.r(h0Var.f20493l), d0Var, dVar4);
                Object a22 = a(h0Var.f20494m, e0.f20462j, dVar4);
                k1.o0 o0Var = h0Var.f20495n;
                k1.o0 o0Var2 = k1.o0.f19508d;
                return qe.a(a14, a15, a16, oVar3, pVar, -1, str, a17, a18, a19, a20, a21, a22, a(o0Var, e0.f20467o, dVar4));
            case 11:
                a1.d dVar5 = (a1.d) obj;
                n0 n0Var = (n0) obj2;
                h0 h0Var2 = n0Var.f20529a;
                x90 x90Var = e0.f20461h;
                return qe.a(a(h0Var2, x90Var, dVar5), a(n0Var.f20530b, x90Var, dVar5), a(n0Var.f20531c, x90Var, dVar5), a(n0Var.f20532d, x90Var, dVar5));
            case 12:
                Boolean valueOf = Boolean.valueOf(((x) obj2).f20581a);
                x90 x90Var2 = e0.f20455a;
                return qe.a(valueOf, new Object());
            case 13:
                return Integer.valueOf(((x2.e) obj2).f30048a);
            case 14:
                x2.s sVar3 = (x2.s) obj2;
                x2.r rVar2 = new x2.r(sVar3.f30076a);
                x90 x90Var3 = e0.f20455a;
                return qe.a(rVar2, Boolean.valueOf(sVar3.f30077b));
            case 15:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return bool;
            case 16:
                return ((te.g) obj).V((te.e) obj2);
            case 17:
                return ((te.g) obj).V((te.e) obj2);
            case 18:
                ((Integer) obj2).getClass();
                q7.a(y.L(1), (m) obj);
                return zVar;
            case 19:
                ((Integer) obj2).getClass();
                ha.a(y.L(1), (m) obj);
                return zVar;
            case 20:
                ((Integer) obj2).getClass();
                ha.a(y.L(1), (m) obj);
                return zVar;
            case gl.zzm /* 21 */:
                ((b2.i0) obj).A = true;
                return zVar;
            case 22:
                ((Integer) obj2).getClass();
                kc.a(y.L(1), (m) obj);
                return zVar;
            case 23:
                ((Integer) obj2).getClass();
                kc.a(y.L(1), (m) obj);
                return zVar;
            case 24:
                ((Integer) obj2).getClass();
                t7.b(y.L(7), (m) obj);
                return zVar;
            case 25:
                String str2 = (String) obj;
                te.e eVar2 = (te.e) obj2;
                str2.getClass();
                eVar2.getClass();
                if (str2.length() == 0) {
                    return eVar2.toString();
                }
                return str2 + ", " + eVar2;
            case 26:
                te.g gVar = (te.g) obj;
                te.e eVar3 = (te.e) obj2;
                gVar.getClass();
                eVar3.getClass();
                te.g N = gVar.N(eVar3.getKey());
                te.h hVar = te.h.f25707u;
                if (N != hVar) {
                    te.d dVar6 = te.d.f25706u;
                    pf.v vVar2 = (pf.v) N.L(dVar6);
                    if (vVar2 == null) {
                        bVar = new te.b(eVar3, N);
                    } else {
                        te.g N2 = N.N(dVar6);
                        if (N2 == hVar) {
                            return new te.b(vVar2, eVar3);
                        }
                        bVar = new te.b(vVar2, new te.b(eVar3, N2));
                    }
                    return bVar;
                }
                return eVar3;
            case 27:
                return Integer.valueOf(((Integer) obj).intValue() + 1);
            case 28:
                m mVar2 = (m) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z9 = true;
                }
                r rVar3 = (r) mVar2;
                if (rVar3.R(intValue & 1, z9)) {
                    y.b(n9.a(), "Cerrar", null, k1.r.f19515d, rVar3, 3120, 4);
                } else {
                    rVar3.U();
                }
                return zVar;
            default:
                te.e eVar4 = (te.e) obj2;
                if (!(eVar4 instanceof uf.v)) {
                    return obj;
                }
                if (obj instanceof Integer) {
                    num = (Integer) obj;
                }
                if (num != null) {
                    i = num.intValue();
                } else {
                    i = 1;
                }
                if (i == 0) {
                    return eVar4;
                }
                return Integer.valueOf(i + 1);
        }
    }
}