package wa;
import c.i;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;

/* loaded from: classes.dex */
public abstract class da {
    public static Object a(Bundle bundle, String str, Class cls) {
        if (Build.VERSION.SDK_INT >= 34) {
            return i.b(bundle, str, cls);
        }
        Parcelable parcelable = bundle.getParcelable(str);
        if (cls.isInstance(parcelable)) {
            return parcelable;
        }
        return null;
    }
}
