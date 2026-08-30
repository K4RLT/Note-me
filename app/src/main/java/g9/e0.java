package g9;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.oh;
import com.google.android.gms.internal.ads.oo;
import com.google.android.gms.internal.ads.qh;
import com.google.android.gms.internal.ads.qo;
import com.google.android.gms.internal.ads.rn;
import com.google.android.gms.internal.ads.uo;

/* loaded from: classes.dex */
public final class e0 extends oh implements g0 {
    public e0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoaderBuilder", 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v5, types: [g9.d0] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    @Override // g9.g0
    public final d0 a() {
        Object ohVar;
        Parcel u22 = u2(g2(), 1);
        IBinder readStrongBinder = u22.readStrongBinder();
        if (readStrongBinder == null) {
            ohVar = 0;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoader");
            if (queryLocalInterface instanceof d0) {
                ohVar = (d0) queryLocalInterface;
            } else {
                ohVar = new oh(readStrongBinder, "com.google.android.gms.ads.internal.client.IAdLoader", 0);
            }
        }
        u22.recycle();
        return ohVar;
    }

    @Override // g9.g0
    public final void f1(x xVar) {
        Parcel g22 = g2();
        qh.e(g22, xVar);
        v2(g22, 2);
    }

    @Override // g9.g0
    public final void i2(String str, qo qoVar, oo ooVar) {
        Parcel g22 = g2();
        g22.writeString(str);
        qh.e(g22, qoVar);
        qh.e(g22, ooVar);
        v2(g22, 5);
    }

    @Override // g9.g0
    public final void i3(uo uoVar) {
        Parcel g22 = g2();
        qh.e(g22, uoVar);
        v2(g22, 10);
    }

    @Override // g9.g0
    public final void k4(rn rnVar) {
        Parcel g22 = g2();
        qh.c(g22, rnVar);
        v2(g22, 6);
    }
}