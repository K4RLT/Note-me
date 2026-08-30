package ya;
import jb.f;
import q2.a;
import q2.j;
import q2.t;

import android.content.Context;
import android.os.Build;

/* loaded from: classes.dex */
public abstract class x9 {
    public static final j a(Context context) {
        int i;
        f fVar = new f(context, 2);
        if (Build.VERSION.SDK_INT >= 31) {
            i = t.f23370a.a(context);
        } else {
            i = 0;
        }
        return new j(fVar, new a(i));
    }
}
