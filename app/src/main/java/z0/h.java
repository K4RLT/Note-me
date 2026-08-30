package z0;

import df.p;
import java.util.ArrayList;
import kotlin.jvm.internal.b0;
import r0.l;
import r0.m;
import r0.q1;
import r0.r;
import r0.x;

/* loaded from: classes.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public static final StackTraceElement[] f31762a = new StackTraceElement[0];

    /* renamed from: b, reason: collision with root package name */
    public static final i f31763b = new i(0, new long[0], new Object[0]);

    public static final int a(int i, int i10) {
        return i << (((i10 % 10) * 3) + 1);
    }

    public static final long b() {
        return Thread.currentThread().getId();
    }

    public static final void c(r rVar, p pVar) {
        pVar.getClass();
        b0.b(2, pVar);
        pVar.invoke(rVar, 1);
    }

    public static final c d(int i, pe.d dVar, m mVar) {
        r rVar = (r) mVar;
        Object O = rVar.O();
        boolean z3 = true;
        if (O == l.f24285a) {
            O = new c(i, dVar, true);
            rVar.k0(O);
        }
        c cVar = (c) O;
        if (!kotlin.jvm.internal.l.a(cVar.f31757w, dVar)) {
            if (cVar.f31757w != null) {
                z3 = false;
            }
            cVar.f31757w = dVar;
            if (!z3 && cVar.f31756v) {
                q1 q1Var = cVar.f31758x;
                if (q1Var != null) {
                    x xVar = q1Var.f24329a;
                    if (xVar != null) {
                        xVar.r(q1Var, null);
                    }
                    cVar.f31758x = null;
                }
                ArrayList arrayList = cVar.f31759y;
                if (arrayList != null) {
                    int size = arrayList.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        q1 q1Var2 = (q1) arrayList.get(i10);
                        x xVar2 = q1Var2.f24329a;
                        if (xVar2 != null) {
                            xVar2.r(q1Var2, null);
                        }
                    }
                    arrayList.clear();
                }
            }
        }
        return cVar;
    }

    public static final boolean e(q1 q1Var, q1 q1Var2) {
        if (q1Var != null && q1Var.a() && !q1Var.equals(q1Var2) && !kotlin.jvm.internal.l.a(q1Var.f24331c, q1Var2.f24331c)) {
            return false;
        }
        return true;
    }
}
