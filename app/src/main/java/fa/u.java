package fa;
import f.a;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class u implements IInterface {

    /* renamed from: u, reason: collision with root package name */
    public final IBinder f16926u;

    public u(IBinder iBinder) {
        this.f16926u = iBinder;
    }

    public final void R(c0 c0Var, g gVar) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            obtain.writeStrongBinder(c0Var);
            obtain.writeInt(1);
            c9.a(gVar, obtain, 0);
            this.f16926u.transact(46, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f16926u;
    }
}
