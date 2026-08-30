package r;
import d1.o;
import d1.r;

import android.os.Build;
import androidx.compose.foundation.MagnifierElement;

/* loaded from: classes.dex */
public abstract class t0 {

    /* renamed from: a, reason: collision with root package name */
    public static final j2.v f24145a = new j2.v("MagnifierPositionInRoot");

    public static boolean a() {
        if (Build.VERSION.SDK_INT >= 28) {
            return true;
        }
        return false;
    }

    public static r b(df.l lVar, df.l lVar2, c1 c1Var) {
        if (a()) {
            return new MagnifierElement(lVar, lVar2, c1Var);
        }
        return o.f15687a;
    }
}
