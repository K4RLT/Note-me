package g0;
import a.a;
import a0.j0;
import a0.o;
import a0.u;
import b1.v;
import c0.d0;
import c2.b1;
import c2.p1;
import d1.o;
import d1.r;
import j2.k;
import m2.c;
import m2.d;
import m2.e;
import m2.g;
import m2.h0;
import m2.m0;
import m2.n0;
import m2.n;
import p.a;
import q.n;
import r0.f1;
import r0.i1;
import r0.l;
import r0.m;
import r0.q1;
import r0.r;
import r0.v0;
import r0.y;
import v.i;
import v1.p;
import v1.r;
import x.m;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class i2 {

    /* renamed from: a, reason: collision with root package name */
    public final i1 f17133a = y.B(null);

    /* renamed from: b, reason: collision with root package name */
    public g f17134b;

    /* renamed from: c, reason: collision with root package name */
    public final v f17135c;

    public i2(g gVar) {
        l lVar = l.I;
        gVar.getClass();
        d dVar = new d(gVar);
        ArrayList arrayList = dVar.f20448w;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            List list = (List) lVar.invoke(((c) arrayList.get(i)).a(Integer.MIN_VALUE));
            ArrayList arrayList3 = new ArrayList(list.size());
            int size2 = list.size();
            for (int i10 = 0; i10 < size2; i10++) {
                e eVar = (e) list.get(i10);
                arrayList3.add(new c(eVar.f20451a, eVar.f20452b, eVar.f20453c, eVar.f20454d));
            }
            qe.n(arrayList2, arrayList3);
        }
        arrayList.clear();
        arrayList.addAll(arrayList2);
        this.f17134b = dVar.c();
        this.f17135c = new v();
    }

    public static e c(e eVar, m0 m0Var) {
        int c10 = m0Var.f20525b.c(r3.f20551f - 1, false);
        if (eVar.f20452b >= c10) {
            return null;
        }
        return e.a(eVar, null, Math.min(eVar.f20453c, c10), 11);
    }

    public final void a(int i, m mVar) {
        int i10;
        boolean z3;
        char c10;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        h0 h0Var;
        h0 h0Var2;
        h0 h0Var3;
        r rVar = (r) mVar;
        rVar.c0(1154651354);
        char c11 = 2;
        if (rVar.h(this)) {
            i10 = 4;
        } else {
            i10 = 2;
        }
        int i11 = i10 | i;
        boolean z13 = false;
        if ((i11 & 3) != 2) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (rVar.R(i11 & 1, z3)) {
            b1 b1Var = (b1) rVar.j(p1.f3615r);
            g gVar = this.f17134b;
            List a10 = gVar.a(gVar.f20477v.length());
            int size = a10.size();
            int i12 = 0;
            while (i12 < size) {
                e eVar = (e) a10.get(i12);
                int i13 = eVar.f20452b;
                Object obj = eVar.f20451a;
                if (i13 != eVar.f20453c) {
                    rVar.a0(1386075176);
                    Object O = rVar.O();
                    v0 v0Var = l.f24285a;
                    Object obj2 = O;
                    if (O == v0Var) {
                        obj2 = a.r(rVar);
                    }
                    i iVar = (i) obj2;
                    c10 = c11;
                    r j10 = androidx.compose.foundation.a.j(k.a(androidx.compose.ui.graphics.a(o.f15687a, new u(this, 26, eVar)), z13, l.J).d(new j2(new e7.d(this, 2, eVar))), iVar);
                    p.f27336a.getClass();
                    r f10 = r.f(j10, r.f27338b);
                    boolean h3 = rVar.h(this) | rVar.f(eVar) | rVar.h(b1Var);
                    Object O2 = rVar.O();
                    Object obj3 = O2;
                    if (h3 || O2 == v0Var) {
                        o oVar = new o(this, eVar, b1Var);
                        rVar.k0(oVar);
                        obj3 = oVar;
                    }
                    h0 h0Var4 = null;
                    boolean z14 = false;
                    m.a(0, androidx.compose.foundation.a.h(f10, iVar, null, (df.a) obj3, 508), rVar);
                    n nVar = (n) obj;
                    n0 a11 = nVar.a();
                    if (a11 == null || (a11.f20529a == null && a11.f20530b == null && a11.f20531c == null && a11.f20532d == null)) {
                        z9 = false;
                        rVar.a0(1388926990);
                        rVar.p(false);
                    } else {
                        rVar.a0(1386898319);
                        Object O3 = rVar.O();
                        Object obj4 = O3;
                        if (O3 == v0Var) {
                            f1 f1Var = new f1(iVar);
                            rVar.k0(f1Var);
                            obj4 = f1Var;
                        }
                        f1 f1Var2 = (f1) obj4;
                        Object O4 = rVar.O();
                        Object obj5 = O4;
                        if (O4 == v0Var) {
                            j0 j0Var = new j0(f1Var2, z14 ? 1 : 0, 7);
                            rVar.k0(j0Var);
                            obj5 = j0Var;
                        }
                        y.f((df.p) obj5, pe.z.f22715a, rVar);
                        f1 f1Var3 = f1Var2.f17100b;
                        f1 f1Var4 = f1Var2.f17100b;
                        if ((f1Var3.h() & 2) != 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        Boolean valueOf = Boolean.valueOf(z10);
                        if ((f1Var4.h() & 1) != 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        Boolean valueOf2 = Boolean.valueOf(z11);
                        if ((f1Var4.h() & 4) != 0) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        Boolean valueOf3 = Boolean.valueOf(z12);
                        n0 a12 = nVar.a();
                        if (a12 != null) {
                            h0Var = a12.f20529a;
                        } else {
                            h0Var = null;
                        }
                        n0 a13 = nVar.a();
                        if (a13 != null) {
                            h0Var2 = a13.f20530b;
                        } else {
                            h0Var2 = null;
                        }
                        n0 a14 = nVar.a();
                        if (a14 != null) {
                            h0Var3 = a14.f20531c;
                        } else {
                            h0Var3 = null;
                        }
                        n0 a15 = nVar.a();
                        if (a15 != null) {
                            h0Var4 = a15.f20532d;
                        }
                        Object[] objArr = {valueOf, valueOf2, valueOf3, h0Var, h0Var2, h0Var3, h0Var4};
                        boolean h10 = rVar.h(this) | rVar.f(eVar);
                        Object O5 = rVar.O();
                        Object obj6 = O5;
                        if (h10 || O5 == v0Var) {
                            u uVar = new u(this, eVar, f1Var2);
                            rVar.k0(uVar);
                            obj6 = uVar;
                        }
                        b(objArr, (df.l) obj6, rVar, (i11 << 6) & 896);
                        z9 = false;
                        rVar.p(false);
                    }
                    rVar.p(z9);
                } else {
                    c10 = c11;
                    z9 = z13;
                    rVar.a0(1388940878);
                    rVar.p(z9);
                }
                i12++;
                z13 = z9;
                c11 = c10;
            }
        } else {
            rVar.U();
        }
        q1 t3 = rVar.t();
        if (t3 != null) {
            t3.f24332d = new d0(this, i, 11);
        }
    }

    public final void b(Object[] objArr, df.l lVar, m mVar, int i) {
        int i10;
        boolean z3;
        int i11;
        int i12;
        int i13;
        r rVar = (r) mVar;
        rVar.c0(-2083052099);
        if ((i & 48) == 0) {
            if (rVar.h(lVar)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i10 = i13 | i;
        } else {
            i10 = i;
        }
        if ((i & 384) == 0) {
            if (rVar.h(this)) {
                i12 = 256;
            } else {
                i12 = 128;
            }
            i10 |= i12;
        }
        rVar.Y(-416604407, Integer.valueOf(objArr.length));
        boolean z9 = false;
        for (Object obj : objArr) {
            if (rVar.h(obj)) {
                i11 = 4;
            } else {
                i11 = 0;
            }
            i10 |= i11;
        }
        rVar.p(false);
        if ((i10 & 14) == 0) {
            i10 |= 2;
        }
        if ((i10 & 147) != 146) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (rVar.R(i10 & 1, z3)) {
            ArrayList arrayList = new ArrayList(2);
            arrayList.add(lVar);
            if (objArr.length > 0) {
                arrayList.ensureCapacity(arrayList.size() + objArr.length);
                Collections.addAll(arrayList, objArr);
            }
            Object[] array = arrayList.toArray(new Object[arrayList.size()]);
            boolean h3 = rVar.h(this);
            if ((i10 & 112) == 32) {
                z9 = true;
            }
            boolean z10 = h3 | z9;
            Object O = rVar.O();
            if (z10 || O == l.f24285a) {
                O = new t(this, lVar, 1);
                rVar.k0(O);
            }
            y.e(array, (df.l) O, rVar);
        } else {
            rVar.U();
        }
        q1 t3 = rVar.t();
        if (t3 != null) {
            t3.f24332d = new b3.n(this, objArr, lVar, i);
        }
    }
}
