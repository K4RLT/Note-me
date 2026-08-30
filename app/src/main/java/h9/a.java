package h9;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.internal.ads.oh;
import com.google.android.gms.internal.ads.qh;
import java.util.List;

/* loaded from: classes.dex */
public final class a extends oh implements c {
    @Override // h9.c
    public final void endSession(oa.a aVar, String str) {
        Parcel g22 = g2();
        qh.e(g22, aVar);
        g22.writeString(str);
        v2(g22, 2);
    }

    @Override // h9.c
    public final void open(oa.a aVar, String str, String str2, Bundle bundle, boolean z3, g gVar) {
        Parcel g22 = g2();
        qh.e(g22, aVar);
        g22.writeString(str);
        g22.writeString(str2);
        qh.c(g22, bundle);
        g22.writeInt(z3 ? 1 : 0);
        qh.e(g22, gVar);
        v2(g22, 3);
    }

    @Override // h9.c
    public final void prewarm(oa.a aVar, List list, e eVar) {
        Parcel g22 = g2();
        qh.e(g22, aVar);
        g22.writeTypedList(list);
        qh.e(g22, eVar);
        v2(g22, 1);
    }
}
