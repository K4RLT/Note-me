package com.google.android.gms.internal.ads;
import f9.b;
import fa.b;
import fa.c;
import fa.e;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* loaded from: classes.dex */
public final class qv0 extends f9.b {
    public final int S;

    public qv0(Context context, Looper looper, fa.b bVar, fa.c cVar, int i) {
        super(context, looper, 116, bVar, cVar);
        this.S = i;
    }

    @Override // fa.e
    public final int i() {
        return this.S;
    }

    @Override // fa.e
    public final IInterface n(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.gass.internal.IGassService");
        if (queryLocalInterface instanceof tv0) {
            return (tv0) queryLocalInterface;
        }
        return new oh(iBinder, "com.google.android.gms.gass.internal.IGassService", 0);
    }

    @Override // fa.e
    public final String u() {
        return "com.google.android.gms.gass.internal.IGassService";
    }

    @Override // fa.e
    public final String v() {
        return "com.google.android.gms.gass.START";
    }
}
