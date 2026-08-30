package w7;
import k0.w;
import r0.a1;
import r0.e1;
import v7.j;
import z.e;
import z0.c;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final /* synthetic */ class s0 implements df.l {
    public final /* synthetic */ Object A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object C;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f29033u = 2;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ u7.m3 f29034v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f29035w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f29036x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f29037y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ Object f29038z;

    public /* synthetic */ s0(Context context, pf.z zVar, u7.m3 m3Var, int i, int i10, k0 k0Var, df.l lVar, e1 e1Var) {
        this.f29037y = context;
        this.f29038z = zVar;
        this.f29034v = m3Var;
        this.f29035w = i;
        this.f29036x = i10;
        this.A = k0Var;
        this.B = lVar;
        this.C = e1Var;
    }

    @Override // df.l
    public final Object invoke(Object obj) {
        u7.w2 w2Var;
        boolean z3;
        boolean z9;
        boolean z10;
        List list;
        List list2;
        boolean z11;
        boolean z12;
        int i;
        switch (this.f29033u) {
            case 0:
                b1.v vVar = (b1.v) this.f29037y;
                u7.m3 m3Var = this.f29034v;
                int i10 = this.f29035w;
                int i11 = this.f29036x;
                a1 a1Var = (a1) this.f29038z;
                a1 a1Var2 = (a1) this.A;
                a1 a1Var3 = (a1) this.B;
                e3 e3Var = (e3) this.C;
                String str = (String) obj;
                str.getClass();
                Object obj2 = null;
                a1Var.setValue(null);
                a1Var2.setValue(null);
                a1Var3.setValue(null);
                vVar.clear();
                Integer c10 = u7.a.c(str);
                if (c10 != null) {
                    int intValue = c10.intValue();
                    Iterator it = m3Var.q0(i10, i11).iterator();
                    while (true) {
                        if (it.hasNext()) {
                            Object next = it.next();
                            if (((u7.q1) next).f26742a == intValue) {
                                obj2 = next;
                            }
                        }
                    }
                    u7.q1 q1Var = (u7.q1) obj2;
                    if (q1Var != null && !q1Var.f26745d) {
                        m3Var.f26536j.put(new pe.j(m3Var.y(i10), Integer.valueOf(i11)), c10);
                    }
                } else {
                    List f12 = m3Var.f1(i10, i11);
                    if (!(f12 instanceof Collection) || !f12.isEmpty()) {
                        Iterator it2 = f12.iterator();
                        while (it2.hasNext()) {
                            if (kotlin.jvm.internal.l.a(((u7.b) it2.next()).f25917a, str)) {
                                e3Var.w(true);
                                a1Var.setValue(str);
                            }
                        }
                    }
                    List j12 = m3Var.j1(i10, i11);
                    if (!(j12 instanceof Collection) || !j12.isEmpty()) {
                        Iterator it3 = j12.iterator();
                        while (it3.hasNext()) {
                            if (kotlin.jvm.internal.l.a(((u7.c) it3.next()).f25969a, str)) {
                                e3Var.w(true);
                                a1Var3.setValue(str);
                            }
                        }
                    }
                    e3Var.w(true);
                    a1Var2.setValue(str);
                }
                return pe.z.f22715a;
            case 1:
                u7.m3 m3Var2 = this.f29034v;
                int i12 = this.f29035w;
                int i13 = this.f29036x;
                kotlin.jvm.internal.y yVar = (kotlin.jvm.internal.y) this.C;
                b1.v vVar2 = (b1.v) this.f29037y;
                a1 a1Var4 = (a1) this.f29038z;
                a1 a1Var5 = (a1) this.A;
                a1 a1Var6 = (a1) this.B;
                x7.q qVar = (x7.q) obj;
                qVar.getClass();
                int i14 = d3.f28068b[qVar.ordinal()];
                boolean z13 = true;
                if (i14 != 1) {
                    if (i14 != 2) {
                        if (i14 == 3) {
                            w2Var = u7.w2.EVERYTHING;
                        } else {
                            l4.a.o();
                            return null;
                        }
                    } else {
                        w2Var = u7.w2.IMAGES;
                    }
                } else {
                    w2Var = u7.w2.INK;
                }
                Context context = (Context) yVar.f19787u;
                List list3 = qe.s.f24023u;
                context.getClass();
                w2Var.getClass();
                if (w2Var != u7.w2.IMAGES) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (w2Var != u7.w2.INK) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (w2Var == u7.w2.EVERYTHING) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z9) {
                    list = qe.l.P(m3Var2.f1(i12, i13));
                } else {
                    list = list3;
                }
                if (z10) {
                    list2 = qe.l.P(m3Var2.k1(i12, i13));
                } else {
                    list2 = list3;
                }
                if (z10) {
                    list3 = qe.l.P(m3Var2.j1(i12, i13));
                }
                if (z3 && m3Var2.l0(i12, i13, context)) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11 || !list.isEmpty() || !list2.isEmpty() || !list3.isEmpty()) {
                    m3Var2.u(i12, i13);
                    if (z11) {
                        m3Var2.Z(i12, i13, context, m3Var2.l(i12, i13));
                        m3Var2.f26542p.e(context, m3Var2.y(i12), i13);
                    }
                    if (!list.isEmpty() || !list2.isEmpty() || !list3.isEmpty()) {
                        m3Var2.K0(i12, i13, true);
                    }
                    if (z11) {
                        jf.d dVar = j.f27439a;
                        int i15 = dVar.f19189u;
                        int i16 = dVar.f19190v;
                        if (i15 <= i16) {
                            while (true) {
                                z12 = z13;
                                m3Var2.f26539m.e(m3Var2.y(i12), i13, i15);
                                m3Var2.f26539m.q(m3Var2.y(i12), i13, i15);
                                String y10 = m3Var2.y(i12);
                                m3Var2.f26539m.getClass();
                                nd.o.g(i13, i15, context, y10).delete();
                                if (i15 != i16) {
                                    i15++;
                                    z13 = z12;
                                }
                            }
                        } else {
                            z12 = true;
                        }
                        m3Var2.f26540n.e(context, m3Var2.y(i12), i13, j.f27439a);
                        pe.j jVar = new pe.j(m3Var2.y(i12), Integer.valueOf(i13));
                        b1.y yVar2 = m3Var2.f26538l;
                        Integer num = (Integer) yVar2.get(jVar);
                        if (num != null) {
                            i = num.intValue();
                        } else {
                            i = 0;
                        }
                        yVar2.put(jVar, Integer.valueOf(i + 1));
                    } else {
                        z12 = true;
                    }
                    Iterator it4 = list.iterator();
                    while (it4.hasNext()) {
                        m3Var2.O0(((u7.b) it4.next()).f25917a, i12, i13);
                    }
                    Iterator it5 = list2.iterator();
                    while (it5.hasNext()) {
                        m3Var2.Q0(((u7.d) it5.next()).f26033a, i12, i13);
                    }
                    Iterator it6 = list3.iterator();
                    while (it6.hasNext()) {
                        m3Var2.P0(((u7.c) it6.next()).f25969a, i12, i13);
                    }
                    m3Var2.B(i12, i13);
                    m3Var2.Z0(m3Var2.f26543q.h() + 1);
                    m3Var2.U();
                    m3Var2.f26546t = z12;
                    a1Var4.setValue(null);
                    a1Var5.setValue(null);
                    a1Var6.setValue(null);
                    vVar2.clear();
                }
                return pe.z.f22715a;
            default:
                Context context2 = (Context) this.f29037y;
                pf.z zVar = (pf.z) this.f29038z;
                u7.m3 m3Var3 = this.f29034v;
                int i17 = this.f29035w;
                int i18 = this.f29036x;
                k0 k0Var = (k0) this.A;
                df.l lVar = (df.l) this.B;
                e1 e1Var = (e1) this.C;
                e eVar = (e) obj;
                eVar.getClass();
                ArrayList E = qe.l.E(y.f29468b, y.f29467a);
                eVar.o(E.size(), new w(new uf.u(29), 24, E), new b8.k9(7, E), new c(-1091073711, new g6(E, context2, zVar, m3Var3, i17, i18, k0Var, lVar, e1Var), true));
                return pe.z.f22715a;
        }
    }

    public /* synthetic */ s0(androidx.compose.foundation.layout.c cVar, u7.m3 m3Var, int i, int i10, kotlin.jvm.internal.y yVar, b1.v vVar, a1 a1Var, a1 a1Var2, a1 a1Var3) {
        this.f29034v = m3Var;
        this.f29035w = i;
        this.f29036x = i10;
        this.C = yVar;
        this.f29037y = vVar;
        this.f29038z = a1Var;
        this.A = a1Var2;
        this.B = a1Var3;
    }

    public /* synthetic */ s0(b1.v vVar, u7.m3 m3Var, int i, int i10, a1 a1Var, a1 a1Var2, a1 a1Var3, e3 e3Var) {
        this.f29037y = vVar;
        this.f29034v = m3Var;
        this.f29035w = i;
        this.f29036x = i10;
        this.f29038z = a1Var;
        this.A = a1Var2;
        this.B = a1Var3;
        this.C = e3Var;
    }
}
