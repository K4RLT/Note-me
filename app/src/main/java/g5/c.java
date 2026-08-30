package g5;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class c implements d {

    /* renamed from: u, reason: collision with root package name */
    public IBinder f17424u;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f17424u;
    }

    @Override // g5.d
    public final void j1(String[] strArr) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(d.f17427p);
            obtain.writeStringArray(strArr);
            this.f17424u.transact(1, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }
}
