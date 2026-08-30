package q3;
import m.a;
import v.e;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.PathInterpolator;
import com.daren.scraply.R;
import com.google.android.gms.internal.ads.zb1;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public abstract class p {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f23420a = true;

    static {
        new WeakHashMap();
    }

    public static void a(View view, Matrix matrix) {
        Object parent = view.getParent();
        if (parent instanceof View) {
            a((View) parent, matrix);
            matrix.preTranslate(-r0.getScrollX(), -r0.getScrollY());
        }
        matrix.preTranslate(view.getLeft(), view.getTop());
        matrix.preConcat(view.getMatrix());
    }

    public static void b(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i) {
        if (Build.VERSION.SDK_INT >= 29) {
            a(view, context, iArr, attributeSet, typedArray, i, 0);
        }
    }

    public static void c(ViewGroup viewGroup, b bVar) {
        if (viewGroup.getImportantForAccessibility() == 0) {
            viewGroup.setImportantForAccessibility(1);
        }
        viewGroup.setAccessibilityDelegate(bVar.f23381b);
    }

    public static void d(View view, zb1 zb1Var) {
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = null;
        x xVar = null;
        if (Build.VERSION.SDK_INT >= 30) {
            if (zb1Var != null) {
                xVar = new x(zb1Var);
            }
            view.setWindowInsetsAnimationCallback(xVar);
            return;
        }
        PathInterpolator pathInterpolator = e;
        if (zb1Var != null) {
            onApplyWindowInsetsListener = new u(view, zb1Var);
        }
        view.setTag(R.id.tag_window_insets_animation_callback, onApplyWindowInsetsListener);
        if (view.getTag(R.id.tag_compat_insets_dispatch) == null && view.getTag(R.id.tag_on_apply_window_listener) == null) {
            view.setOnApplyWindowInsetsListener(onApplyWindowInsetsListener);
        }
    }
}
