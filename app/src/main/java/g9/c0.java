package g9;

import android.os.Parcel;
import com.google.android.gms.internal.ads.ph;
import com.google.android.gms.internal.ads.qh;

/* loaded from: classes.dex */
public abstract class c0 extends ph implements d0 {
    public c0() {
        super("com.google.android.gms.ads.internal.client.IAdLoader");
    }

    @Override // com.google.android.gms.internal.ads.ph
    public final boolean u4(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            return false;
                        }
                        z2 z2Var = (z2) qh.b(parcel, z2.CREATOR);
                        int readInt = parcel.readInt();
                        qh.f(parcel);
                        v3(z2Var, readInt);
                        parcel2.writeNoException();
                        return true;
                    }
                    String d2 = d();
                    parcel2.writeNoException();
                    parcel2.writeString(d2);
                    return true;
                }
                boolean e = e();
                parcel2.writeNoException();
                ClassLoader classLoader = qh.f9846a;
                parcel2.writeInt(e ? 1 : 0);
                return true;
            }
            String b10 = b();
            parcel2.writeNoException();
            parcel2.writeString(b10);
            return true;
        }
        z2 z2Var2 = (z2) qh.b(parcel, z2.CREATOR);
        qh.f(parcel);
        I3(z2Var2);
        parcel2.writeNoException();
        return true;
    }
}
