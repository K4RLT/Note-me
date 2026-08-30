package h0;

import android.os.Build;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean f17821a;

    static {
        boolean z3;
        if (Build.VERSION.SDK_INT >= 34) {
            z3 = true;
        } else {
            z3 = false;
        }
        f17821a = z3;
    }
}
