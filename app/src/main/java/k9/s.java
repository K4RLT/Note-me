package k9;

import android.os.Parcel;
import com.google.android.gms.internal.ads.oh;
import com.google.android.gms.internal.ads.qh;

/* loaded from: classes.dex */
public final class s extends oh implements t {
    @Override // k9.t
    public final boolean zze(oa.a aVar, String str, String str2) {
        Parcel g22 = g2();
        qh.e(g22, aVar);
        g22.writeString(str);
        g22.writeString(str2);
        boolean z3 = true;
        Parcel u22 = u2(g22, 1);
        if (u22.readInt() == 0) {
            z3 = false;
        }
        u22.recycle();
        return z3;
    }

    @Override // k9.t
    public final void zzf(oa.a aVar) {
        Parcel g22 = g2();
        qh.e(g22, aVar);
        v2(g22, 2);
    }

    @Override // k9.t
    public final boolean zzg(oa.a aVar, i9.a aVar2) {
        boolean z3;
        Parcel g22 = g2();
        qh.e(g22, aVar);
        qh.c(g22, aVar2);
        Parcel u22 = u2(g22, 3);
        if (u22.readInt() != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        u22.recycle();
        return z3;
    }
}
