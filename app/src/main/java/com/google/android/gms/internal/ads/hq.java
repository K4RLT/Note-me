package com.google.android.gms.internal.ads;

import android.os.Parcel;
import java.util.List;

/* loaded from: classes.dex */
public final class hq extends oh implements iq {
    @Override // com.google.android.gms.internal.ads.iq
    public final void f2(List list) {
        Parcel g22 = g2();
        g22.writeTypedList(list);
        v2(g22, 1);
    }
}
