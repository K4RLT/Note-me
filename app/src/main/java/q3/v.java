package q3;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.PathInterpolator;
import com.daren.scraply.R;
import com.google.android.gms.internal.ads.zb1;
import java.util.List;

/* loaded from: classes.dex */
public final class v extends z {
    public static final PathInterpolator e = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);

    /* renamed from: f, reason: collision with root package name */
    public static final s4.a f23436f = new s4.a();

    /* renamed from: g, reason: collision with root package name */
    public static final DecelerateInterpolator f23437g = new DecelerateInterpolator(1.5f);

    /* renamed from: h, reason: collision with root package name */
    public static final AccelerateInterpolator f23438h = new AccelerateInterpolator(1.5f);

    public static void f(View view, a0 a0Var) {
        zb1 j10 = j(view);
        if (j10 != null) {
            j10.a(a0Var);
            if (j10.f13134u == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                f(viewGroup.getChildAt(i), a0Var);
            }
        }
    }

    public static void g(View view, a0 a0Var, q0 q0Var, boolean z3) {
        zb1 j10 = j(view);
        if (j10 != null) {
            j10.f13135v = q0Var;
            if (!z3) {
                j10.b();
                if (j10.f13134u == 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                g(viewGroup.getChildAt(i), a0Var, q0Var, z3);
            }
        }
    }

    public static void h(View view, q0 q0Var, List list) {
        zb1 j10 = j(view);
        if (j10 != null) {
            q0Var = j10.d(q0Var, list);
            if (j10.f13134u == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                h(viewGroup.getChildAt(i), q0Var, list);
            }
        }
    }

    public static void i(View view, a0 a0Var, j6.l lVar) {
        zb1 j10 = j(view);
        if (j10 != null) {
            j10.e(a0Var, lVar);
            if (j10.f13134u == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                i(viewGroup.getChildAt(i), a0Var, lVar);
            }
        }
    }

    public static zb1 j(View view) {
        Object tag = view.getTag(R.id.tag_window_insets_animation_callback);
        if (tag instanceof u) {
            return ((u) tag).f23434a;
        }
        return null;
    }
}
