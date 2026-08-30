package q7;
import d.i;
import g.b;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import df.p;
import fg.o;
import k1.l0;
import m2.a0;
import pe.n;
import r0.a1;
import r0.l;
import r0.m;
import r0.q1;
import r0.r;
import r0.v0;
import r0.y;
import wa.y5;

/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f23568a = 0;

    static {
        l0.d(4062323239L);
        l0.d(4284246976L);
        new n(new o(20));
    }

    public static final void a(int i, m mVar) {
        boolean z3;
        r rVar = (r) mVar;
        rVar.c0(-1861013994);
        if (i != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (rVar.R(i & 1, z3)) {
            Context context = (Context) rVar.j(AndroidCompositionLocals_androidKt.f642b);
            a1 o10 = y.o(b.f23564c, rVar);
            b bVar = new b(3);
            boolean h3 = rVar.h(context);
            Object O = rVar.O();
            v0 v0Var = l.f24285a;
            if (h3 || O == v0Var) {
                O = new b8.b(context, 1);
                rVar.k0(O);
            }
            i a10 = y5.a(bVar, (df.l) O, rVar);
            Boolean bool = (Boolean) o10.getValue();
            bool.booleanValue();
            boolean f10 = rVar.f(o10) | rVar.h(context) | rVar.h(a10);
            Object O2 = rVar.O();
            if (f10 || O2 == v0Var) {
                a6.f fVar = new a6.f(context, a10, o10, (te.c) null, 24);
                rVar.k0(fVar);
                O2 = fVar;
            }
            y.f((p) O2, bool, rVar);
        } else {
            rVar.U();
        }
        q1 t3 = rVar.t();
        if (t3 != null) {
            t3.f24332d = new a0(i, 18);
        }
    }

    public static final Activity b(Context context) {
        context.getClass();
        while (context instanceof ContextWrapper) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return null;
    }
}
