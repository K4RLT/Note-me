package w7;
import r.c;
import x1.b;
import a1.g;
import b2.f;
import b2.h;
import d1.a;
import d1.c;
import d1.o;
import d1.r;
import k0.w;
import k1.l0;
import o0.x1;
import p7.e;
import r0.a1;
import r0.j0;
import r0.l;
import r0.m;
import r0.y;
import z.b;
import z1.p0;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Typeface;
import java.util.List;
import ya.ae;

/* loaded from: classes.dex */
public final /* synthetic */ class c0 implements df.l {
    public final /* synthetic */ Object A;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f28006u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f28007v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ u7.m3 f28008w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f28009x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ int f28010y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ Object f28011z;

    public /* synthetic */ c0(androidx.compose.foundation.layout.c cVar, a1 a1Var, kotlin.jvm.internal.y yVar, pf.z zVar, u7.m3 m3Var, int i, int i10) {
        this.f28006u = 1;
        this.f28011z = a1Var;
        this.f28007v = yVar;
        this.A = zVar;
        this.f28008w = m3Var;
        this.f28009x = i;
        this.f28010y = i10;
    }

    @Override // df.l
    public final Object invoke(Object obj) {
        int i = this.f28006u;
        int i10 = 6;
        Activity activity = null;
        pe.z zVar = pe.z.f22715a;
        Object obj2 = this.f28007v;
        Object obj3 = this.A;
        Object obj4 = this.f28011z;
        switch (i) {
            case 0:
                ((j0) obj).getClass();
                return new a3((b1.v) obj4, this.f28008w, this.f28009x, this.f28010y, (e3) obj3, (kotlin.jvm.internal.y) obj2);
            case 1:
                a1 a1Var = (a1) obj4;
                kotlin.jvm.internal.y yVar = (kotlin.jvm.internal.y) obj2;
                pf.z zVar2 = (pf.z) obj3;
                u7.b bVar = (u7.b) obj;
                bVar.getClass();
                if (!((Boolean) a1Var.getValue()).booleanValue()) {
                    Object obj5 = (Context) yVar.f19787u;
                    while ((obj5 instanceof ContextWrapper) && !(obj5 instanceof Activity)) {
                        obj5 = ((ContextWrapper) obj5).getBaseContext();
                        obj5.getClass();
                    }
                    if (obj5 instanceof Activity) {
                        activity = (Activity) obj5;
                    }
                    e7.q qVar = e7.q.f15992z;
                    String str = bVar.f25917a;
                    f1 f1Var = new f1(zVar2, a1Var, yVar, bVar, this.f28008w, this.f28009x, this.f28010y);
                    qVar.getClass();
                    str.getClass();
                    if (b1.g0.b() && activity != null) {
                        String str2 = "";
                        String string = activity.getSharedPreferences("scraply_ads", 0).getString("bgremove_paid_ids", "");
                        if (string != null) {
                            str2 = string;
                        }
                        if (mf.f.D(str2, new char[]{'\n'}).contains(str)) {
                            f1Var.invoke(new b8.b7(16));
                        } else if (((Number) ((sf.a0) qVar.f1342y).f25140u.getValue()).intValue() > 0) {
                            f1Var.invoke(new e7.p(activity, str, 0));
                            e7.o oVar = e7.o.f15975a;
                            e7.o.d(activity);
                        } else {
                            e7.o oVar2 = e7.o.f15975a;
                            e7.o.g(activity, "bgremove", new g(i10, activity, f1Var, str));
                        }
                    } else {
                        f1Var.invoke(new b8.b7(16));
                    }
                }
                return zVar;
            case 2:
                u7.d dVar = (u7.d) obj4;
                String str3 = dVar.f26033a;
                a1 a1Var2 = (a1) obj3;
                a1 a1Var3 = (a1) obj2;
                String str4 = (String) obj;
                str4.getClass();
                boolean u9 = mf.f.u(str4);
                u7.m3 m3Var = this.f28008w;
                int i11 = this.f28009x;
                int i12 = this.f28010y;
                if (u9) {
                    m3Var.Q0(str3, i11, i12);
                    if (kotlin.jvm.internal.l.a((String) a1Var2.getValue(), str3)) {
                        a1Var2.setValue(null);
                    }
                } else if (!str4.equals(dVar.f26034b)) {
                    u7.m3.r1(m3Var, i11, i12, dVar.f26033a, str4, dVar.f26035c, Integer.valueOf(dVar.f26036d), null, null, null, null, null, 1984);
                }
                a1Var3.setValue(null);
                return zVar;
            case 3:
                Context context = (Context) obj4;
                u4 u4Var = (u4) obj;
                u4Var.getClass();
                sf.n0 n0Var = o8.f28851a;
                c(context, q8.FILL, u4Var.f29209a);
                wf.e eVar = pf.l0.f22767a;
                pf.b0.x((pf.z) obj3, wf.d.f29913w, new b8.v4(u4Var, context, this.f28008w, this.f28009x, this.f28010y, (k0) obj2, null), 2);
                return zVar;
            case 4:
                e eVar2 = (e) obj;
                eVar2.getClass();
                List list = u7.j7.f26386b;
                eVar2.o(list.size(), new w(new f3(20), 26, list), new b8.d9(4, list), new c(-632812321, new f8(list, (String) obj4, (Context) obj3, this.f28008w, this.f28009x, this.f28010y, (a1) obj2), true));
                return zVar;
            default:
                final List list2 = (List) obj4;
                final u7.d dVar2 = (u7.d) obj3;
                final Context context2 = (Context) obj2;
                e eVar3 = (e) obj;
                eVar3.getClass();
                int size = list2.size();
                final u7.m3 m3Var2 = this.f28008w;
                final int i13 = this.f28009x;
                final int i14 = this.f28010y;
                e.p(eVar3, size, null, new c(962219904, new df.r() { // from class: w7.ya
                    @Override // df.r
                    public final Object d(Object obj6, Object obj7, Object obj8, Object obj9) {
                        boolean z3;
                        long j10;
                        float f10;
                        float f11;
                        long j11;
                        int i15;
                        int intValue = ((Integer) obj7).intValue();
                        m mVar = (m) obj8;
                        int intValue2 = ((Integer) obj9).intValue();
                        ((b) obj6).getClass();
                        if ((intValue2 & 48) == 0) {
                            if (((r) mVar).d(intValue)) {
                                i15 = 32;
                            } else {
                                i15 = 16;
                            }
                            intValue2 |= i15;
                        }
                        if ((intValue2 & 145) != 144) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        r rVar = (r) mVar;
                        if (rVar.R(intValue2 & 1, z3)) {
                            c cVar = (c) list2.get(intValue);
                            String str5 = cVar.f22431a;
                            u7.d dVar3 = dVar2;
                            String str6 = dVar3.f26035c;
                            boolean z9 = dVar3.f26045o;
                            boolean z10 = dVar3.f26044n;
                            boolean a10 = kotlin.jvm.internal.l.a(str5, str6);
                            boolean d2 = rVar.d(e.e.h()) | rVar.f(str5) | rVar.g(z10) | rVar.g(z9);
                            Object O = rVar.O();
                            Object obj10 = l.f24285a;
                            if (d2 || O == obj10) {
                                O = e.f(context2, str5, z10, z9);
                                rVar.k0(O);
                            }
                            Typeface typeface = (Typeface) O;
                            float f12 = 10;
                            r a11 = wa.j7.a(o.f15687a, f0.e.a(f12));
                            if (a10) {
                                j10 = l0.d(4282339765L);
                                f10 = 0.85f;
                            } else {
                                j10 = r.f19515d;
                                f10 = 0.08f;
                            }
                            r b10 = androidx.compose.foundation.a.b(a11, r.c(j10, f10), l0.f19495a);
                            if (a10) {
                                f11 = (float) 1.5d;
                            } else {
                                f11 = 0;
                            }
                            if (a10) {
                                j11 = r.f19515d;
                            } else {
                                j11 = r.f19520k;
                            }
                            r a12 = ya.a(b10, f11, j11, f0.e.a(f12));
                            u7.m3 m3Var3 = m3Var2;
                            boolean h3 = rVar.h(m3Var3);
                            int i16 = i13;
                            boolean d10 = h3 | rVar.d(i16);
                            int i17 = i14;
                            boolean d11 = d10 | rVar.d(i17) | rVar.f(dVar3) | rVar.f(cVar);
                            Object O2 = rVar.O();
                            if (d11 || O2 == obj10) {
                                O2 = new u7.i0(m3Var3, i16, i17, dVar3, cVar, 6);
                                rVar.k0(O2);
                            }
                            r l10 = androidx.compose.foundation.layout.a.l(androidx.compose.foundation.a.f(null, false, a12, (df.a) O2, 7), 12, 7);
                            p0 d12 = m.d(c.f15670u, false);
                            int hashCode = Long.hashCode(rVar.T);
                            g l11 = rVar.l();
                            r c10 = a.c(l10, rVar);
                            h.f1471d.getClass();
                            df.a aVar = g.f1462b;
                            rVar.e0();
                            if (rVar.S) {
                                rVar.k(aVar);
                            } else {
                                rVar.n0();
                            }
                            y.I(g.e, d12, rVar);
                            y.I(g.f1464d, l11, rVar);
                            f fVar = g.f1465f;
                            if (rVar.S || !kotlin.jvm.internal.l.a(rVar.O(), Integer.valueOf(hashCode))) {
                                a.t(hashCode, rVar, hashCode, fVar);
                            }
                            y.I(g.f1463c, c10, rVar);
                            x1.b(cVar.f22432b, null, r.f19515d, ae.e(13), null, null, ya.w9.a(typeface), 0L, null, 0L, 2, false, 1, 0, null, rVar, 3456, 3120, 120754);
                            rVar.p(true);
                        } else {
                            rVar.U();
                        }
                        return pe.z.f22715a;
                    }
                }, true), 6);
                return zVar;
        }
    }

    public /* synthetic */ c0(int i, int i10, int i11, Object obj, Object obj2, Object obj3, u7.m3 m3Var) {
        this.f28006u = i11;
        this.f28011z = obj;
        this.A = obj2;
        this.f28008w = m3Var;
        this.f28009x = i;
        this.f28010y = i10;
        this.f28007v = obj3;
    }

    public /* synthetic */ c0(b1.v vVar, u7.m3 m3Var, int i, int i10, e3 e3Var, kotlin.jvm.internal.y yVar) {
        this.f28006u = 0;
        this.f28011z = vVar;
        this.f28008w = m3Var;
        this.f28009x = i;
        this.f28010y = i10;
        this.A = e3Var;
        this.f28007v = yVar;
    }

    public /* synthetic */ c0(u7.m3 m3Var, int i, int i10, u7.d dVar, a1 a1Var, a1 a1Var2) {
        this.f28006u = 2;
        this.f28008w = m3Var;
        this.f28009x = i;
        this.f28010y = i10;
        this.f28011z = dVar;
        this.A = a1Var;
        this.f28007v = a1Var2;
    }
}
