package kb;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class e implements g, IInterface {

    /* renamed from: u, reason: collision with root package name */
    public final IBinder f19744u;

    public e(IBinder iBinder) {
        this.f19744u = iBinder;
    }

    @Override // kb.g
    public final void E0(String str, Bundle bundle, jb.h hVar) {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.play.core.appupdate.protocol.IAppUpdateService");
        obtain.writeString(str);
        int i = d.f19743a;
        obtain.writeInt(1);
        bundle.writeToParcel(obtain, 0);
        obtain.writeStrongBinder(hVar);
        try {
            this.f19744u.transact(2, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f19744u;
    }
}
