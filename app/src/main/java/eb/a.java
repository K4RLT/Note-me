package eb;
import d1.d;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

/* loaded from: classes.dex */
public final class a implements s1 {

    /* renamed from: a, reason: collision with root package name */
    public final com.google.android.gms.internal.measurement.u0 f16050a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AppMeasurementDynamiteService f16051b;

    public a(AppMeasurementDynamiteService appMeasurementDynamiteService, com.google.android.gms.internal.measurement.u0 u0Var) {
        this.f16051b = appMeasurementDynamiteService;
        this.f16050a = u0Var;
    }

    @Override // eb.s1
    public final void a(long j10, Bundle bundle, String str, String str2) {
        try {
            this.f16050a.u3(j10, bundle, str, str2);
        } catch (RemoteException e) {
            d1 d1Var = this.f16051b.f15571u;
            if (d1Var != null) {
                k0 k0Var = d1Var.C;
                d(k0Var);
                k0Var.D.f(e, "Event listener threw exception");
            }
        }
    }
}
