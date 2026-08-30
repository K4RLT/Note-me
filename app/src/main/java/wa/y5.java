package wa;
import t.c;
import x.o;
import a1.t;
import c.m;
import c.o;
import c3.h;
import d.a;
import d.b;
import d.g;
import d.i;
import q.x;
import r0.a1;
import r0.h0;
import r0.l;
import r0.r;
import r0.v0;
import r0.y;

import android.content.Context;
import android.content.ContextWrapper;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* loaded from: classes.dex */
public abstract class y5 {
    public static final i a(q6 q6Var, df.l lVar, m mVar) {
        Object hVar;
        q6 q6Var2;
        y.G(q6Var, mVar);
        a1 G = y.G(lVar, mVar);
        String str = (String) t.c(new Object[0], null, b.f15633v, mVar, 3072, 6);
        r rVar = (r) mVar;
        h hVar2 = (h) rVar.j(g.f15646a);
        if (hVar2 == null) {
            rVar.a0(1006590171);
            Object obj = (Context) rVar.j(AndroidCompositionLocals_androidKt.f642b);
            while (true) {
                if (obj instanceof ContextWrapper) {
                    if (obj instanceof h) {
                        break;
                    }
                    obj = ((ContextWrapper) obj).getBaseContext();
                } else {
                    obj = null;
                    break;
                }
            }
            hVar2 = (h) obj;
        } else {
            rVar.a0(1006589303);
        }
        rVar.p(false);
        if (hVar2 != null) {
            m mVar2 = ((o) hVar2).C;
            Object O = rVar.O();
            v0 v0Var = l.f24285a;
            if (O == v0Var) {
                O = new Object();
                rVar.k0(O);
            }
            a aVar = (a) O;
            Object O2 = rVar.O();
            if (O2 == v0Var) {
                O2 = new i(aVar);
                rVar.k0(O2);
            }
            i iVar = (i) O2;
            boolean h3 = rVar.h(aVar) | rVar.h(mVar2) | rVar.f(str) | rVar.h(q6Var) | rVar.f(G);
            Object O3 = rVar.O();
            if (!h3 && O3 != v0Var) {
                hVar = O3;
                q6Var2 = q6Var;
            } else {
                q6Var2 = q6Var;
                hVar = new h(aVar, mVar2, str, q6Var2, G);
                rVar.k0(hVar);
            }
            df.l lVar2 = (df.l) hVar;
            boolean f10 = rVar.f(mVar2) | rVar.f(str) | rVar.f(q6Var2);
            Object O4 = rVar.O();
            if (f10 || O4 == v0Var) {
                O4 = new h0(lVar2);
                rVar.k0(O4);
            }
            return iVar;
        }
        x.o("No ActivityResultRegistryOwner was provided via LocalActivityResultRegistryOwner");
        return null;
    }
}
