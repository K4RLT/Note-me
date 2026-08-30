package ge;

import android.util.Log;
import com.google.android.gms.internal.ads.vl;
import g5.q;
import g9.n;
import ic.r;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public final class c implements ib.d, ic.d {

    /* renamed from: u, reason: collision with root package name */
    public static final c f17749u = new Object();

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ c f17750v = new Object();

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ c f17751w = new Object();

    @Override // ic.d
    public Object e(n nVar) {
        Set i = nVar.i(r.a(b.class));
        Object obj = new Object();
        new HashMap();
        new HashMap();
        Iterator it = i.iterator();
        if (!it.hasNext()) {
            return obj;
        }
        it.next().getClass();
        q.b();
        throw null;
    }

    @Override // ib.d
    public void w(Exception exc) {
        vl vlVar = a.f17744y;
        if (Log.isLoggable(vlVar.f11932a, 6)) {
            Log.e("MobileVisionBase", vlVar.a("Error preloading model resource"), exc);
        }
    }
}
