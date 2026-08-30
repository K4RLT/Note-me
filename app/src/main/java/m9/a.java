package m9;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.internal.ads.pq;
import com.google.android.gms.internal.ads.sl;
import com.google.android.gms.internal.ads.um;
import fa.y;
import g9.r;
import z8.g;

/* loaded from: classes.dex */
public abstract class a {
    public static void a(Context context, String str, g gVar, b bVar) {
        y.i(context, "Context cannot be null.");
        y.i(str, "AdUnitId cannot be null.");
        y.i(gVar, "AdRequest cannot be null.");
        y.d("#008 Must be called on the main UI thread.");
        sl.a(context);
        if (((Boolean) um.i.p()).booleanValue()) {
            if (((Boolean) r.e.f17698c.a(sl.Cc)).booleanValue()) {
                l9.b.f20035b.execute(new b9.a(context, str, gVar, bVar, 9));
                return;
            }
        }
        new pq(context, str).c(gVar.f31983a, bVar);
    }

    public abstract void b(Activity activity);
}
