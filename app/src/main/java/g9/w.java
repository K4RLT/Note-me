package g9;

import android.os.Parcel;
import com.google.android.gms.internal.ads.ph;
import com.google.android.gms.internal.ads.qh;

/* loaded from: classes.dex */
public abstract class w extends ph implements x {
    public w() {
        super("com.google.android.gms.ads.internal.client.IAdListener");
    }

    @Override // com.google.android.gms.internal.ads.ph
    public final boolean u4(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 1:
                l();
                break;
            case 2:
                int readInt = parcel.readInt();
                qh.f(parcel);
                w(readInt);
                break;
            case 3:
                break;
            case 4:
                a();
                break;
            case 5:
                b();
                break;
            case 6:
                e();
                break;
            case 7:
                g();
                break;
            case 8:
                y1 y1Var = (y1) qh.b(parcel, y1.CREATOR);
                qh.f(parcel);
                F(y1Var);
                break;
            case 9:
                d();
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
