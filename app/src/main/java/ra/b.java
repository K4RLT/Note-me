package ra;

import android.os.IBinder;
import android.os.IInterface;
import fa.h;

/* loaded from: classes.dex */
public final class b extends h {
    @Override // fa.e
    public final int i() {
        return 212800000;
    }

    @Override // fa.e
    public final /* synthetic */ IInterface n(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.appset.internal.IAppSetService");
        if (queryLocalInterface instanceof c) {
            return (c) queryLocalInterface;
        }
        return new c(iBinder);
    }

    @Override // fa.e
    public final ca.d[] q() {
        return y9.d.f31003b;
    }

    @Override // fa.e
    public final String u() {
        return "com.google.android.gms.appset.internal.IAppSetService";
    }

    @Override // fa.e
    public final String v() {
        return "com.google.android.gms.appset.service.START";
    }

    @Override // fa.e
    public final boolean w() {
        return true;
    }

    @Override // fa.e
    public final boolean x() {
        return true;
    }
}
