package ba;

import android.os.Bundle;
import android.util.Log;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final int f3151a;

    /* renamed from: b, reason: collision with root package name */
    public final ib.h f3152b = new ib.h();

    /* renamed from: c, reason: collision with root package name */
    public final int f3153c;

    /* renamed from: d, reason: collision with root package name */
    public final Bundle f3154d;
    public final /* synthetic */ int e;

    public o(int i, int i10, Bundle bundle, int i11) {
        this.e = i11;
        this.f3151a = i;
        this.f3153c = i10;
        this.f3154d = bundle;
    }

    public final boolean a() {
        switch (this.e) {
            case 0:
                return true;
            default:
                return false;
        }
    }

    public final void b(p pVar) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            Log.d("MessengerIpcClient", "Failing " + toString() + " with " + pVar.toString());
        }
        this.f3152b.a(pVar);
    }

    public final void c(Bundle bundle) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            Log.d("MessengerIpcClient", "Finishing " + toString() + " with " + String.valueOf(bundle));
        }
        this.f3152b.b(bundle);
    }

    public final String toString() {
        return "Request { what=" + this.f3153c + " id=" + this.f3151a + " oneWay=" + a() + "}";
    }
}
