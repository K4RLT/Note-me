package ra;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import ib.h;

/* loaded from: classes.dex */
public final class f extends Binder implements IInterface {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ h f24678u;

    public f(h hVar) {
        this.f24678u = hVar;
        attachInterface(this, "com.google.android.gms.appset.internal.IAppSetIdCallback");
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i10) {
        Status createFromParcel;
        y9.c createFromParcel2;
        da.d dVar;
        if (i > 16777215) {
            if (super.onTransact(i, parcel, parcel2, i10)) {
                return true;
            }
        } else {
            parcel.enforceInterface(getInterfaceDescriptor());
        }
        if (i == 1) {
            Parcelable.Creator<Status> creator = Status.CREATOR;
            int i11 = a.f24671a;
            y9.b bVar = null;
            if (parcel.readInt() == 0) {
                createFromParcel = null;
            } else {
                createFromParcel = creator.createFromParcel(parcel);
            }
            Status status = createFromParcel;
            Parcelable.Creator<y9.c> creator2 = y9.c.CREATOR;
            if (parcel.readInt() == 0) {
                createFromParcel2 = null;
            } else {
                createFromParcel2 = creator2.createFromParcel(parcel);
            }
            y9.c cVar = createFromParcel2;
            if (cVar != null) {
                bVar = new y9.b(cVar.f31000u, cVar.f31001v);
            }
            int i12 = status.f4283u;
            h hVar = this.f24678u;
            if (i12 <= 0) {
                hVar.b(bVar);
                return true;
            }
            if (status.f4285w != null) {
                dVar = new da.d(status);
            } else {
                dVar = new da.d(status);
            }
            hVar.a(dVar);
            return true;
        }
        return false;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
