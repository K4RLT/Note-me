package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class d1 extends g0 implements u0 {

    /* renamed from: u, reason: collision with root package name */
    public final gc.b f13684u;

    public d1(gc.b bVar) {
        super("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
        this.f13684u = bVar;
    }

    @Override // com.google.android.gms.internal.measurement.g0
    public final boolean R(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            if (i != 2) {
                return false;
            }
            int identityHashCode = System.identityHashCode(this.f13684u);
            parcel2.writeNoException();
            parcel2.writeInt(identityHashCode);
            return true;
        }
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        Bundle bundle = (Bundle) f0.a(parcel, Bundle.CREATOR);
        long readLong = parcel.readLong();
        f0.d(parcel);
        u3(readLong, bundle, readString, readString2);
        parcel2.writeNoException();
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.u0
    public final void u3(long j10, Bundle bundle, String str, String str2) {
        this.f13684u.a(j10, bundle, str, str2);
    }

    @Override // com.google.android.gms.internal.measurement.u0
    public final int zza() {
        return System.identityHashCode(this.f13684u);
    }
}
