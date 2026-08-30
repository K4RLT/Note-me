package c2;
import f.b;
import k1.e;

import android.content.Context;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import com.daren.scraply.R;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class a0 implements View.OnAttachStateChangeListener {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f3458u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f3459v;

    public /* synthetic */ a0(int i, Object obj) {
        this.f3458u = i;
        this.f3459v = obj;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        switch (this.f3458u) {
            case 0:
                f0 f0Var = (f0) this.f3459v;
                AccessibilityManager accessibilityManager = f0Var.f3518g;
                f0Var.f3521k = accessibilityManager.getEnabledAccessibilityServiceList(-1);
                accessibilityManager.addAccessibilityStateChangeListener(f0Var.i);
                accessibilityManager.addTouchExplorationStateChangeListener(f0Var.f3520j);
                return;
            case 1:
            case 2:
                return;
            default:
                e eVar = (e) this.f3459v;
                Context context = view.getContext();
                if (!eVar.f19476d) {
                    context.getApplicationContext().registerComponentCallbacks(eVar.e);
                    eVar.f19476d = true;
                    return;
                }
                return;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        Boolean bool;
        boolean z3;
        int i = this.f3458u;
        boolean z9 = false;
        Object obj = this.f3459v;
        switch (i) {
            case 0:
                f0 f0Var = (f0) obj;
                f0Var.f3522l.removeCallbacks(f0Var.N);
                AccessibilityManager accessibilityManager = f0Var.f3518g;
                accessibilityManager.removeAccessibilityStateChangeListener(f0Var.i);
                accessibilityManager.removeTouchExplorationStateChangeListener(f0Var.f3520j);
                return;
            case 1:
                a aVar = (a) obj;
                Iterator it = lf.b(aVar.getParent(), q3.r.f23424u).iterator();
                while (true) {
                    if (it.hasNext()) {
                        Object obj2 = (ViewParent) it.next();
                        if (obj2 instanceof View) {
                            View view2 = (View) obj2;
                            view2.getClass();
                            Object tag = view2.getTag(R.id.is_pooling_container_tag);
                            if (tag instanceof Boolean) {
                                bool = (Boolean) tag;
                            } else {
                                bool = null;
                            }
                            if (bool != null) {
                                z3 = bool.booleanValue();
                            } else {
                                z3 = false;
                            }
                            if (z3) {
                                z9 = true;
                            }
                        }
                    }
                }
                if (!z9) {
                    g3 g3Var = aVar.f3454w;
                    if (g3Var != null) {
                        g3Var.a();
                    }
                    aVar.f3454w = null;
                    aVar.requestLayout();
                    return;
                }
                return;
            case 2:
                view.removeOnAttachStateChangeListener(this);
                ((pf.r1) obj).j(null);
                return;
            default:
                e eVar = (e) obj;
                Context context = view.getContext();
                if (eVar.f19476d) {
                    context.getApplicationContext().unregisterComponentCallbacks(eVar.e);
                    eVar.f19476d = false;
                    return;
                }
                return;
        }
    }

    private final void a(View view) {
    }

    private final void b(View view) {
    }
}
