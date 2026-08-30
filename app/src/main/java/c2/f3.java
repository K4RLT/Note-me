package c2;
import c1.f;
import r0.b2;
import r0.e2;
import r0.l;
import r0.m;
import r0.r;
import r0.v0;
import r0.w;
import r0.y;
import z0.h;

import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.daren.scraply.R;
import java.util.Set;

/* loaded from: classes.dex */
public final class f3 extends kotlin.jvm.internal.m implements df.p {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f3538u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ g3 f3539v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ df.p f3540w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f3(g3 g3Var, df.p pVar, int i) {
        super(2);
        this.f3538u = i;
        this.f3539v = g3Var;
        this.f3540w = pVar;
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        boolean z3;
        boolean z9;
        Set set;
        View view;
        Object obj3;
        int i = this.f3538u;
        pe.z zVar = pe.z.f22715a;
        df.p pVar = this.f3540w;
        g3 g3Var = this.f3539v;
        int i10 = 1;
        int i11 = 0;
        switch (i) {
            case 0:
                m mVar = (m) obj;
                int intValue = ((Number) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                r rVar = (r) mVar;
                if (rVar.R(intValue & 1, z3)) {
                    AndroidCompositionLocals_androidKt.a(g3Var.f3542u, pVar, rVar, 0);
                } else {
                    rVar.U();
                }
                return zVar;
            default:
                m mVar2 = (m) obj;
                int intValue2 = ((Number) obj2).intValue();
                if ((intValue2 & 3) != 2) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                r rVar2 = (r) mVar2;
                if (rVar2.R(intValue2 & 1, z9)) {
                    x xVar = g3Var.f3542u;
                    Object tag = xVar.getTag(R.id.inspection_slot_table_set);
                    te.c cVar = null;
                    if ((tag instanceof Set) && (!(tag instanceof ef.a) || (tag instanceof ef.e))) {
                        set = (Set) tag;
                    } else {
                        set = null;
                    }
                    if (set == null) {
                        Object parent = xVar.getParent();
                        if (parent instanceof View) {
                            view = (View) parent;
                        } else {
                            view = null;
                        }
                        if (view != null) {
                            obj3 = view.getTag(R.id.inspection_slot_table_set);
                        } else {
                            obj3 = null;
                        }
                        if ((obj3 instanceof Set) && (!(obj3 instanceof ef.a) || (obj3 instanceof ef.e))) {
                            set = (Set) obj3;
                        } else {
                            set = null;
                        }
                    }
                    if (set != null) {
                        w wVar = rVar2.U;
                        if (wVar == null) {
                            wVar = new w(rVar2.f24341h);
                            rVar2.U = wVar;
                        }
                        set.add(wVar);
                        rVar2.f24349q = true;
                        rVar2.C = true;
                        rVar2.f24337c.b();
                        rVar2.H.b();
                        e2 e2Var = rVar2.I;
                        b2 b2Var = e2Var.f24217a;
                        e2Var.e = b2Var.D;
                        e2Var.f24221f = b2Var.E;
                    }
                    boolean h3 = rVar2.h(g3Var);
                    Object O = rVar2.O();
                    v0 v0Var = l.f24285a;
                    if (h3 || O == v0Var) {
                        O = new e3(g3Var, cVar, i11);
                        rVar2.k0(O);
                    }
                    y.f((df.p) O, xVar, rVar2);
                    boolean h10 = rVar2.h(g3Var);
                    Object O2 = rVar2.O();
                    if (h10 || O2 == v0Var) {
                        O2 = new e3(g3Var, cVar, i10);
                        rVar2.k0(O2);
                    }
                    y.f((df.p) O2, xVar, rVar2);
                    y.a(f.f3449a.a(set), h.d(-280240369, new f3(g3Var, pVar, i11), rVar2), rVar2, 56);
                } else {
                    rVar2.U();
                }
                return zVar;
        }
    }
}
