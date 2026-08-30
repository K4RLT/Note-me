package ya;
import y2.e;
import y2.n;
import z2.a;
import z2.b;

import android.content.Context;

/* loaded from: classes.dex */
public abstract class pd {
    public static final e a(Context context) {
        float f10 = context.getResources().getConfiguration().fontScale;
        float f11 = context.getResources().getDisplayMetrics().density;
        a a10 = b.a(f10);
        if (a10 == null) {
            a10 = new n(f10);
        }
        return new e(f11, f10, a10);
    }
}
