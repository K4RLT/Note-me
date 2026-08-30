package g9;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.oh;
import com.google.android.gms.internal.ads.qh;
import com.google.android.gms.internal.ads.vr;

/* loaded from: classes.dex */
public final class l0 extends oh {
    public l0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdManagerCreator", 0);
    }

    public final IBinder u4(oa.b bVar, c3 c3Var, String str, vr vrVar, int i) {
        Parcel g22 = g2();
        qh.e(g22, bVar);
        qh.c(g22, c3Var);
        g22.writeString(str);
        qh.e(g22, vrVar);
        g22.writeInt(ModuleDescriptor.MODULE_VERSION);
        g22.writeInt(i);
        Parcel u22 = u2(g22, 2);
        IBinder readStrongBinder = u22.readStrongBinder();
        u22.recycle();
        return readStrongBinder;
    }
}
