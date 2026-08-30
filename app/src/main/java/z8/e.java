package z8;
import r.e;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.iv1;
import com.google.android.gms.internal.ads.sl;
import com.google.android.gms.internal.ads.um;
import g9.b3;
import g9.d0;
import g9.d2;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final Context f31981a;

    /* renamed from: b, reason: collision with root package name */
    public final d0 f31982b;

    public e(Context context, d0 d0Var) {
        this.f31981a = context;
        this.f31982b = d0Var;
    }

    public final void a(g gVar) {
        d2 d2Var = gVar.f31983a;
        Context context = this.f31981a;
        sl.a(context);
        if (((Boolean) um.f11678c.p()).booleanValue()) {
            if (((Boolean) g9.r.e.f17698c.a(sl.Cc)).booleanValue()) {
                l9.b.f20035b.execute(new iv1(this, 29, d2Var));
                return;
            }
        }
        try {
            this.f31982b.I3(b3.a(context, d2Var));
        } catch (RemoteException e) {
            l9.i.d("Failed to load ad.", e);
        }
    }
}
