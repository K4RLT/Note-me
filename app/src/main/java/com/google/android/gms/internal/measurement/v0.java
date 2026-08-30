package com.google.android.gms.internal.measurement;
import f0.c;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.oh;

/* loaded from: classes.dex */
public final class v0 extends oh implements t0 {
    public v0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IBundleReceiver", 1);
    }

    @Override // com.google.android.gms.internal.measurement.t0
    public final void k0(Bundle bundle) {
        Parcel g02 = g0();
        c(g02, bundle);
        z1(g02, 1);
    }
}
