package g9;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.oh;
import com.google.android.gms.internal.ads.qh;

/* loaded from: classes.dex */
public final class w1 extends oh implements z1 {
    public w1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IVideoController", 0);
    }

    @Override // g9.z1
    public final float f() {
        throw null;
    }

    @Override // g9.z1
    public final float i() {
        throw null;
    }

    @Override // g9.z1
    public final float m() {
        throw null;
    }

    @Override // g9.z1
    public final a2 p() {
        a2 a2Var;
        Parcel u22 = u2(g2(), 11);
        IBinder readStrongBinder = u22.readStrongBinder();
        if (readStrongBinder == null) {
            a2Var = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
            if (queryLocalInterface instanceof a2) {
                a2Var = (a2) queryLocalInterface;
            } else {
                a2Var = new a2(readStrongBinder);
            }
        }
        u22.recycle();
        return a2Var;
    }

    @Override // g9.z1
    public final void u0(a2 a2Var) {
        Parcel g22 = g2();
        qh.e(g22, a2Var);
        v2(g22, 8);
    }
}
