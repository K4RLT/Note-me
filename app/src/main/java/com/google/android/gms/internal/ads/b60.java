package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;

/* loaded from: classes.dex */
public final class b60 {

    /* renamed from: a, reason: collision with root package name */
    public h9.c f4725a;

    public final synchronized h9.c a(Context context) {
        h9.c cVar = this.f4725a;
        if (cVar != null) {
            return cVar;
        }
        h9.c asInterface = h9.b.asInterface((IBinder) context.getApplicationContext().getClassLoader().loadClass("com.google.android.gms.ads.internal.client.hsdp.HsdpDeepLinkServiceWrapper").getConstructor(null).newInstance(null));
        this.f4725a = asInterface;
        return asInterface;
    }
}
