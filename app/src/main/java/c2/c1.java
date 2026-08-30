package c2;
import c2.r2;

import android.os.Build;
import android.view.ViewConfiguration;

/* loaded from: classes.dex */
public final class c1 implements r2 {

    /* renamed from: a, reason: collision with root package name */
    public final ViewConfiguration f3491a;

    public c1(ViewConfiguration viewConfiguration) {
        this.f3491a = viewConfiguration;
    }

    @Override // r2
    public final long a() {
        return ViewConfiguration.getDoubleTapTimeout();
    }

    @Override // r2
    public final long b() {
        return ViewConfiguration.getLongPressTimeout();
    }

    @Override // r2
    public final float c() {
        int scaledHandwritingSlop;
        if (Build.VERSION.SDK_INT >= 34) {
            scaledHandwritingSlop = this.f3491a.getScaledHandwritingSlop();
            return scaledHandwritingSlop;
        }
        return 2.0f;
    }

    @Override // r2
    public final float e() {
        return this.f3491a.getScaledMaximumFlingVelocity();
    }

    @Override // r2
    public final float f() {
        return this.f3491a.getScaledTouchSlop();
    }

    @Override // r2
    public final float g() {
        int scaledHandwritingGestureLineMargin;
        if (Build.VERSION.SDK_INT >= 34) {
            scaledHandwritingGestureLineMargin = this.f3491a.getScaledHandwritingGestureLineMargin();
            return scaledHandwritingGestureLineMargin;
        }
        return 16.0f;
    }
}
