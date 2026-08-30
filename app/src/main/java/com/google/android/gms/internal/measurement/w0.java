package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.oh;

/* loaded from: classes.dex */
public final class w0 extends oh implements u0 {
    public w0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IEventHandlerProxy", 1);
    }

    @Override // com.google.android.gms.internal.measurement.u0
    public final void u3(long j10, Bundle bundle, String str, String str2) {
        Parcel g02 = g0();
        g02.writeString(str);
        g02.writeString(str2);
        f0.c(g02, bundle);
        g02.writeLong(j10);
        z1(g02, 1);
    }

    @Override // com.google.android.gms.internal.measurement.u0
    public final int zza() {
        Parcel t12 = t1(g0(), 2);
        int readInt = t12.readInt();
        t12.recycle();
        return readInt;
    }
}
