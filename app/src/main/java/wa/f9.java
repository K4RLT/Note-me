package wa;
import f9.k;
import g9.r;
import wa.f9;

import android.content.Context;
import com.google.android.gms.internal.ads.jx0;
import com.google.android.gms.internal.ads.kx0;
import com.google.android.gms.internal.ads.lx0;
import com.google.android.gms.internal.ads.sl;
import java.io.IOException;

/* loaded from: classes.dex */
public abstract class f9 {
    public static void a(Context context) {
        if (((Boolean) r.e.f17698c.a(sl.f10713e7)).booleanValue() && context != null) {
            context.deleteDatabase("OfflineUpload.db");
        }
        try {
            jx0 f10 = jx0.f(context);
            kx0 f11 = kx0.f(context);
            lx0 f12 = lx0.f(context);
            f10.getClass();
            synchronized (jx0.class) {
                f10.c(false);
            }
            synchronized (jx0.class) {
                f10.c(true);
            }
            f11.g();
            f12.o();
        } catch (IOException e) {
            k.C.f16817h.d("clearStorageOnIdlessMode", e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.os.Bundle b(android.content.Context r11, java.lang.String r12) {
        /*
            Method dump skipped, instructions count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wa.f9.b(android.content.Context, java.lang.String):android.os.Bundle");
    }
}
