package wa;
import b.c;
import f2.b;
import z5.h;

import android.os.Build;
import android.view.View;

/* loaded from: classes.dex */
public abstract class l6 {
    public static h a(View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return new h(12, b.c(view));
        }
        return null;
    }
}
