package wa;
import x.o;
import b2.k0;
import c.g0;
import c.i0;
import d.c;
import d.d;
import d.e;
import d.h;
import q.x;
import r0.a1;
import r0.l;
import r0.m;
import r0.q1;
import r0.r;
import r0.v0;
import r0.y;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.daren.scraply.R;
import ya.jc;

/* loaded from: classes.dex */
public abstract class z5 {
    public static final void a(boolean z3, df.a aVar, m mVar, int i, int i10) {
        int i11;
        int i12;
        i0 i0Var;
        int i13;
        r rVar = (r) mVar;
        rVar.c0(-361453782);
        int i14 = i10 & 1;
        int i15 = 2;
        if (i14 != 0) {
            i11 = i | 6;
        } else if ((i & 6) == 0) {
            if (rVar.g(z3)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i11 = i12 | i;
        } else {
            i11 = i;
        }
        if ((i & 48) == 0) {
            if (rVar.h(aVar)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i11 |= i13;
        }
        if ((i11 & 19) == 18 && rVar.D()) {
            rVar.U();
        } else {
            boolean z9 = true;
            if (i14 != 0) {
                z3 = true;
            }
            a1 G = y.G(aVar, rVar);
            Object O = rVar.O();
            v0 v0Var = l.f24285a;
            if (O == v0Var) {
                O = new e(G, z3);
                rVar.k0(O);
            }
            e eVar = (e) O;
            if ((i11 & 14) != 4) {
                z9 = false;
            }
            Object O2 = rVar.O();
            if (z9 || O2 == v0Var) {
                O2 = new c(eVar, z3);
                rVar.k0(O2);
            }
            y.j((df.a) O2, rVar);
            i0 i0Var2 = (i0) rVar.j(h.f15647a);
            Object obj = null;
            if (i0Var2 == null) {
                rVar.a0(544166745);
                View view = (View) rVar.j(AndroidCompositionLocals_androidKt.f645f);
                view.getClass();
                while (true) {
                    if (view != null) {
                        Object tag = view.getTag(R.id.view_tree_on_back_pressed_dispatcher_owner);
                        if (tag instanceof i0) {
                            i0Var = (i0) tag;
                        } else {
                            i0Var = null;
                        }
                        if (i0Var != null) {
                            i0Var2 = i0Var;
                            break;
                        }
                        Object a10 = jc.a(view);
                        if (a10 instanceof View) {
                            view = (View) a10;
                        } else {
                            view = null;
                        }
                    } else {
                        i0Var2 = null;
                        break;
                    }
                }
                rVar.p(false);
            } else {
                rVar.a0(544164296);
                rVar.p(false);
            }
            if (i0Var2 == null) {
                rVar.a0(544168748);
                Object obj2 = (Context) rVar.j(AndroidCompositionLocals_androidKt.f642b);
                while (true) {
                    if (!(obj2 instanceof ContextWrapper)) {
                        break;
                    }
                    if (obj2 instanceof i0) {
                        obj = obj2;
                        break;
                    }
                    obj2 = ((ContextWrapper) obj2).getBaseContext();
                }
                i0Var2 = (i0) obj;
                rVar.p(false);
            } else {
                rVar.a0(544164377);
                rVar.p(false);
            }
            if (i0Var2 != null) {
                g0 a11 = i0Var2.a();
                androidx.lifecycle.w wVar = (androidx.lifecycle.w) rVar.j(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
                boolean h3 = rVar.h(a11) | rVar.h(wVar);
                Object O3 = rVar.O();
                if (h3 || O3 == v0Var) {
                    O3 = new k0(i15, a11, wVar, eVar);
                    rVar.k0(O3);
                }
                y.d(wVar, a11, (df.l) O3, rVar);
            } else {
                x.o("No OnBackPressedDispatcherOwner was provided via LocalOnBackPressedDispatcherOwner");
                return;
            }
        }
        q1 t3 = rVar.t();
        if (t3 != null) {
            t3.f24332d = new d(z3, aVar, i, i10);
        }
    }
}
