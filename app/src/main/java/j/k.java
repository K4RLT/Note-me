package j;

import android.R;
import android.graphics.PorterDuff;
import android.graphics.Rect;

/* loaded from: classes.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f18646a = {R.attr.state_checked};

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f18647b = new int[0];

    static {
        new Rect();
    }

    public static PorterDuff.Mode a(int i) {
        if (i != 3) {
            if (i != 5) {
                if (i != 9) {
                    switch (i) {
                        case 14:
                            return PorterDuff.Mode.MULTIPLY;
                        case 15:
                            return PorterDuff.Mode.SCREEN;
                        case 16:
                            return PorterDuff.Mode.ADD;
                        default:
                            return null;
                    }
                }
                return PorterDuff.Mode.SRC_ATOP;
            }
            return PorterDuff.Mode.SRC_IN;
        }
        return PorterDuff.Mode.SRC_OVER;
    }
}
