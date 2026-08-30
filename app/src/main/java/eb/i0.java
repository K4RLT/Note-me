package eb;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes.dex */
public final class i0 extends fa.e {
    @Override // fa.e
    public final int i() {
        return 12451000;
    }

    @Override // fa.e
    public final /* synthetic */ IInterface n(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
        if (queryLocalInterface instanceof d0) {
            return (d0) queryLocalInterface;
        }
        return new e0(iBinder);
    }

    @Override // fa.e
    public final String u() {
        return "com.google.android.gms.measurement.internal.IMeasurementService";
    }

    @Override // fa.e
    public final String v() {
        return "com.google.android.gms.measurement.START";
    }
}
