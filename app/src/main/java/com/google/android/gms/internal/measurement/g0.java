package com.google.android.gms.internal.measurement;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class g0 extends Binder implements IInterface {
    public g0(String str) {
        attachInterface(this, str);
    }

    public abstract boolean R(int i, Parcel parcel, Parcel parcel2);

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i10) {
        boolean z3;
        if (i > 16777215) {
            z3 = super.onTransact(i, parcel, parcel2, i10);
        } else {
            parcel.enforceInterface(getInterfaceDescriptor());
            z3 = false;
        }
        if (z3) {
            return true;
        }
        return R(i, parcel, parcel2);
    }
}
