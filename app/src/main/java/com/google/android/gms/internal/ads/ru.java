package com.google.android.gms.internal.ads;
import ba.p;
import f9.k;

import android.os.Parcel;

/* loaded from: classes.dex */
public final class ru extends ph {
    @Override // com.google.android.gms.internal.ads.ph
    public final boolean u4(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            f9.k.C.f16817h.d("FlagsAccessedBeforeInitialized", new ba.p("Flags were accessed before initialized.", 2));
            parcel2.writeNoException();
            return true;
        }
        return false;
    }
}
