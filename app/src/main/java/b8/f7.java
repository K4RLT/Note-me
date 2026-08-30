package b8;
import d1.r;
import r0.a1;
import r0.l;
import r0.m;
import r0.q1;
import r0.v0;
import r0.y;
import x7.j;
import z0.h;
import z5.i;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* loaded from: classes.dex */
public abstract class f7 {

    /* renamed from: a, reason: collision with root package name */
    public static final float f2084a = 84;

    public static final void a(r rVar, boolean z3, m mVar, int i) {
        int i10;
        int i11;
        boolean z9;
        q1 t3;
        a7 a7Var;
        boolean z10;
        String str;
        te.c cVar;
        Object d7Var;
        boolean z11;
        ca caVar;
        r rVar2 = (r) mVar;
        rVar2.c0(450073059);
        if (rVar2.f(rVar)) {
            i10 = 4;
        } else {
            i10 = 2;
        }
        int i12 = i10 | i;
        if (rVar2.g(z3)) {
            i11 = 32;
        } else {
            i11 = 16;
        }
        int i13 = i12 | i11;
        if ((i13 & 19) != 18) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (rVar2.R(i13 & 1, z9)) {
            a1 o10 = y.o(z5.f3080g, rVar2);
            if (!((Boolean) o10.getValue()).booleanValue()) {
                t3 = rVar2.t();
                if (t3 != null) {
                    a7Var = new a7(rVar, z3, i, 0);
                } else {
                    return;
                }
            } else {
                Context context = (Context) rVar2.j(AndroidCompositionLocals_androidKt.f642b);
                a1 o11 = y.o(z6.f3088b, rVar2);
                a1 o12 = y.o(i, rVar2);
                if (!z3 && !((Boolean) o12.getValue()).booleanValue()) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                Boolean bool = (Boolean) o10.getValue();
                bool.getClass();
                Boolean valueOf = Boolean.valueOf(z10);
                boolean g8 = rVar2.g(z10) | rVar2.h(context);
                Object O = rVar2.O();
                v0 v0Var = l.f24285a;
                te.c cVar2 = null;
                if (g8 || O == v0Var) {
                    O = new c7(z10, context, cVar2, 0);
                    rVar2.k0(O);
                }
                y.g(bool, valueOf, (df.p) O, rVar2);
                v6 v6Var = (v6) o11.getValue();
                if (v6Var != null && (caVar = v6Var.f2883a) != null) {
                    str = caVar.f1935a;
                } else {
                    str = null;
                }
                boolean f10 = rVar2.f(str);
                Object O2 = rVar2.O();
                if (f10 || O2 == v0Var) {
                    O2 = y.B(0);
                    rVar2.k0(O2);
                }
                a1 a1Var = (a1) O2;
                Boolean valueOf2 = Boolean.valueOf(z10);
                boolean f11 = rVar2.f(o11) | rVar2.f(a1Var) | rVar2.g(z10) | rVar2.h(context);
                Object O3 = rVar2.O();
                if (f11 || O3 == v0Var) {
                    cVar = null;
                    d7Var = new d7(z10, context, o11, a1Var, null);
                    rVar2.k0(d7Var);
                } else {
                    d7Var = O3;
                    cVar = null;
                }
                y.g(str, valueOf2, (df.p) d7Var, rVar2);
                Integer valueOf3 = Integer.valueOf(((Number) a1Var.getValue()).intValue());
                boolean f12 = rVar2.f(a1Var);
                Object O4 = rVar2.O();
                if (f12 || O4 == v0Var) {
                    O4 = new e7(a1Var, cVar, 0);
                    rVar2.k0(O4);
                }
                y.f((df.p) O4, valueOf3, rVar2);
                Object O5 = rVar2.O();
                if (O5 == v0Var) {
                    O5 = new b7(0);
                    rVar2.k0(O5);
                }
                y.c(pe.z.f22715a, (df.l) O5, rVar2);
                v6 v6Var2 = (v6) o11.getValue();
                if (v6Var2 == null) {
                    t3 = rVar2.t();
                    if (t3 != null) {
                        a7Var = new a7(rVar, z3, i, 1);
                    } else {
                        return;
                    }
                } else {
                    if (((Number) a1Var.getValue()).intValue() == 1) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    j.n(z11, kb.f2335b, rVar, false, 248, h.d(518096000, new m4(a1Var, 1, v6Var2), rVar2), rVar2, ((i13 << 6) & 896) | 224304, 0);
                }
            }
            t3.f24332d = a7Var;
        }
        rVar2.U();
        t3 = rVar2.t();
        if (t3 != null) {
            a7Var = new a7(rVar, z3, i, 2);
            t3.f24332d = a7Var;
        }
    }
}
