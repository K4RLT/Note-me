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
public final class qv0 extends b {
    public final int S;

    public qv0(Context context, Looper looper, b bVar, c cVar, int i) {
        super(context, looper, 116, bVar, cVar);
        this.S = i;
    }

    @Override // e
    public final int i() {
        return this.S;
    }

    @Override // e
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

    @Override // e
    public final String u() {
        return "com.google.android.gms.gass.internal.IGassService";
    }

    @Override // e
    public final String v() {
        return "com.google.android.gms.gass.START";
    }
}
