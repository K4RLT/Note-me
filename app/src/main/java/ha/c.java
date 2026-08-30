package ha;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import ca.d;
import com.google.android.gms.internal.ads.oh;
import ea.l;
import fa.h;
import fa.o;
import g9.n;

/* loaded from: classes.dex */
public final class c extends h {
    public final o T;

    public c(Context context, Looper looper, n nVar, o oVar, l lVar, l lVar2) {
        super(context, looper, 270, nVar, lVar, lVar2);
        this.T = oVar;
    }

    @Override // fa.e
    public final int i() {
        return 203400000;
    }

    @Override // fa.e
    public final IInterface n(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
        if (queryLocalInterface instanceof a) {
            return (a) queryLocalInterface;
        }
        return new oh(iBinder, "com.google.android.gms.common.internal.service.IClientTelemetryService", 4);
    }

    @Override // fa.e
    public final d[] q() {
        return sa.b.f25127b;
    }

    @Override // fa.e
    public final Bundle r() {
        o oVar = this.T;
        oVar.getClass();
        Bundle bundle = new Bundle();
        String str = oVar.f16906b;
        if (str != null) {
            bundle.putString("api", str);
        }
        return bundle;
    }

    @Override // fa.e
    public final String u() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }

    @Override // fa.e
    public final String v() {
        return "com.google.android.gms.common.telemetry.service.START";
    }

    @Override // fa.e
    public final boolean w() {
        return true;
    }
}
