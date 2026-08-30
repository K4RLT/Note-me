package ya;
import a1.t;
import d1.r;
import df.a;
import r.l1;
import r.n0;
import r0.l;
import r0.m;
import r0.r;
import t.z0;

import androidx.compose.foundation.ScrollingLayoutElement;
import com.google.android.gms.internal.ads.x90;

/* loaded from: classes.dex */
public abstract class xa {
    public static r a(r rVar, l1 l1Var) {
        return c(rVar, l1Var, true, false);
    }

    public static final l1 b(m mVar) {
        Object[] objArr = new Object[0];
        x90 x90Var = l1.i;
        boolean d2 = ((r) mVar).d(0);
        r rVar = (r) mVar;
        Object O = rVar.O();
        if (d2 || O == l.f24285a) {
            O = new n0(0, 2);
            rVar.k0(O);
        }
        return (l1) t.c(objArr, x90Var, (a) O, rVar, 0, 4);
    }

    public static r c(r rVar, l1 l1Var, boolean z3, boolean z9) {
        z0 z0Var;
        if (z9) {
            z0Var = z0.f25597u;
        } else {
            z0Var = z0.f25598v;
        }
        return androidx.compose.foundation.a.l(rVar, l1Var, z0Var, z3, null, l1Var.f24116c, true, null, null).d(new ScrollingLayoutElement(l1Var, z9));
    }

    public static r d(r rVar, l1 l1Var, boolean z3, int i) {
        if ((i & 2) != 0) {
            z3 = true;
        }
        return c(rVar, l1Var, z3, true);
    }
}
