package g9;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.oh;
import com.google.android.gms.internal.ads.qh;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class u1 extends oh implements v1 {
    public u1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IResponseInfo", 0);
    }

    @Override // g9.v1
    public final String a() {
        Parcel u22 = u2(g2(), 1);
        String readString = u22.readString();
        u22.recycle();
        return readString;
    }

    @Override // g9.v1
    public final String b() {
        Parcel u22 = u2(g2(), 2);
        String readString = u22.readString();
        u22.recycle();
        return readString;
    }

    @Override // g9.v1
    public final e3 d() {
        Parcel u22 = u2(g2(), 4);
        e3 e3Var = (e3) qh.b(u22, e3.CREATOR);
        u22.recycle();
        return e3Var;
    }

    @Override // g9.v1
    public final List e() {
        Parcel u22 = u2(g2(), 3);
        ArrayList createTypedArrayList = u22.createTypedArrayList(e3.CREATOR);
        u22.recycle();
        return createTypedArrayList;
    }

    @Override // g9.v1
    public final String f() {
        Parcel u22 = u2(g2(), 6);
        String readString = u22.readString();
        u22.recycle();
        return readString;
    }

    @Override // g9.v1
    public final Bundle g() {
        Parcel u22 = u2(g2(), 5);
        Bundle bundle = (Bundle) qh.b(u22, Bundle.CREATOR);
        u22.recycle();
        return bundle;
    }
}
