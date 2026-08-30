package g9;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.oh;
import com.google.android.gms.internal.ads.qh;
import com.google.android.gms.internal.ads.tr;

/* loaded from: classes.dex */
public final class t1 extends oh {
    public final s1 u4(oa.b bVar, tr trVar) {
        s1 r1Var;
        Parcel g22 = g2();
        qh.e(g22, bVar);
        qh.e(g22, trVar);
        g22.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel u22 = u2(g22, 1);
        IBinder readStrongBinder = u22.readStrongBinder();
        if (readStrongBinder == null) {
            r1Var = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOutOfContextTester");
            if (queryLocalInterface instanceof s1) {
                r1Var = (s1) queryLocalInterface;
            } else {
                r1Var = new r1(readStrongBinder);
            }
        }
        u22.recycle();
        return r1Var;
    }
}
