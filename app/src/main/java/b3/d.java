package b3;
import l.c;
import l.d;
import p.c;

import android.view.WindowInsets;
import b2.i0;
import b2.v1;
import c2.x;
import java.util.HashMap;
import pe.z;
import q3.q0;

/* loaded from: classes.dex */
public final class d extends kotlin.jvm.internal.m implements df.l {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f1648u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ s f1649v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ i0 f1650w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(s sVar, i0 i0Var, int i) {
        super(1);
        this.f1648u = i;
        this.f1649v = sVar;
        this.f1650w = i0Var;
    }

    @Override // df.l
    public final Object invoke(Object obj) {
        x xVar;
        WindowInsets b10;
        switch (this.f1648u) {
            case 0:
                v1 v1Var = (v1) obj;
                if (v1Var instanceof x) {
                    xVar = (x) v1Var;
                } else {
                    xVar = null;
                }
                s sVar = this.f1649v;
                if (xVar != null) {
                    HashMap<k, i0> holderToLayoutNode = xVar.getAndroidViewsHandler$ui_release().getHolderToLayoutNode();
                    i0 i0Var = this.f1650w;
                    holderToLayoutNode.put(sVar, i0Var);
                    xVar.getAndroidViewsHandler$ui_release().addView(sVar);
                    xVar.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().put(i0Var, sVar);
                    sVar.setImportantForAccessibility(1);
                    q3.c(sVar, new c2.o(xVar, i0Var, xVar));
                }
                if (sVar.getView().getParent() != sVar) {
                    sVar.addView(sVar.getView());
                }
                return z.f22715a;
            case 1:
                l.d(this.f1649v, this.f1650w);
                return z.f22715a;
            default:
                i0 i0Var2 = this.f1650w;
                s sVar2 = this.f1649v;
                l.d(sVar2, i0Var2);
                ((x) sVar2.f1672w).U = true;
                int[] iArr = sVar2.H;
                int i = iArr[0];
                int i10 = iArr[1];
                sVar2.getView().getLocationOnScreen(iArr);
                long j10 = sVar2.I;
                long k3 = ((z1.x) obj).k();
                sVar2.I = k3;
                q0 q0Var = sVar2.J;
                if (q0Var != null && ((i != iArr[0] || i10 != iArr[1] || !y2.c(j10, k3)) && (b10 = sVar2.g(q0Var).b()) != null)) {
                    sVar2.getView().dispatchApplyWindowInsets(b10);
                }
                return z.f22715a;
        }
    }
}
