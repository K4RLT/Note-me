package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes.dex */
public abstract class ju extends ph implements ku {
    /* JADX WARN: Type inference failed for: r1v1, types: [com.google.android.gms.internal.ads.oh, com.google.android.gms.internal.ads.ku] */
    public static ku v4(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.query.IUpdateUrlsCallback");
        if (queryLocalInterface instanceof ku) {
            return (ku) queryLocalInterface;
        }
        return new oh(iBinder, "com.google.android.gms.ads.internal.query.IUpdateUrlsCallback", 0);
    }
}
