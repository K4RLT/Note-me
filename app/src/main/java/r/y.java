package r;

import android.view.ViewConfiguration;

/* loaded from: classes.dex */
public abstract class y {

    /* renamed from: a, reason: collision with root package name */
    public static final float f24161a = ViewConfiguration.getScrollFriction();

    /* renamed from: b, reason: collision with root package name */
    public static final double f24162b;

    /* renamed from: c, reason: collision with root package name */
    public static final double f24163c;

    static {
        double log = Math.log(0.78d) / Math.log(0.9d);
        f24162b = log;
        f24163c = log - 1.0d;
    }
}
