package j;
import x.n;
import q.x;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.TypedValue;
import wa.x7;

/* loaded from: classes.dex */
public abstract class f0 {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f18628a = new ThreadLocal();

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f18629b = {-16842910};

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f18630c = {R.attr.state_focused};

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f18631d = {R.attr.state_pressed};
    public static final int[] e = {R.attr.state_checked};

    /* renamed from: f, reason: collision with root package name */
    public static final int[] f18632f = new int[0];

    /* renamed from: g, reason: collision with root package name */
    public static final int[] f18633g = new int[1];

    public static int a(Context context, int i) {
        ColorStateList c10 = c(context, i);
        if (c10 != null && c10.isStateful()) {
            return c10.getColorForState(f18629b, c10.getDefaultColor());
        }
        ThreadLocal threadLocal = f18628a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        context.getTheme().resolveAttribute(R.attr.disabledAlpha, typedValue, true);
        float f10 = typedValue.getFloat();
        int b10 = b(context, i);
        int round = Math.round(Color.alpha(b10) * f10);
        int i10 = j3.a.f18873a;
        if (round >= 0 && round <= 255) {
            return (b10 & 16777215) | (round << 24);
        }
        x.n("alpha must be between 0 and 255.");
        return 0;
    }

    public static int b(Context context, int i) {
        int[] iArr = f18633g;
        iArr[0] = i;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        try {
            return obtainStyledAttributes.getColor(0, 0);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static ColorStateList c(Context context, int i) {
        ColorStateList colorStateList;
        int resourceId;
        int[] iArr = f18633g;
        iArr[0] = i;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        try {
            if (!obtainStyledAttributes.hasValue(0) || (resourceId = obtainStyledAttributes.getResourceId(0, 0)) == 0 || (colorStateList = x7.a(context, resourceId)) == null) {
                colorStateList = obtainStyledAttributes.getColorStateList(0);
            }
            return colorStateList;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }
}
