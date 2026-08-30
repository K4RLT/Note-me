package g9;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.oh;
import com.google.android.gms.internal.ads.ph;
import com.google.android.gms.internal.ads.qh;
import com.google.android.gms.internal.ads.vr;

/* loaded from: classes.dex */
public abstract class b1 extends ph implements c1 {
    /* JADX WARN: Type inference failed for: r1v1, types: [g9.c1, com.google.android.gms.internal.ads.oh] */
    public static c1 asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.ILiteSdkInfo");
        if (queryLocalInterface instanceof c1) {
            return (c1) queryLocalInterface;
        }
        return new oh(iBinder, "com.google.android.gms.ads.internal.client.ILiteSdkInfo", 0);
    }

    @Override // com.google.android.gms.internal.ads.ph
    public final boolean u4(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            if (i != 2) {
                return false;
            }
            vr adapterCreator = getAdapterCreator();
            parcel2.writeNoException();
            qh.e(parcel2, adapterCreator);
            return true;
        }
        l2 liteSdkVersion = getLiteSdkVersion();
        parcel2.writeNoException();
        qh.d(parcel2, liteSdkVersion);
        return true;
    }
}
