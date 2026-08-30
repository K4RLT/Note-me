package com.google.android.gms.internal.ads;
import h9.b;
import h9.c;

import android.content.Context;
import android.os.IBinder;

/* loaded from: classes.dex */
public final class b60 {

    /* renamed from: a, reason: collision with root package name */
    public c f4725a;

    public final synchronized c a(Context context) {
        c cVar = this.f4725a;
        if (cVar != null) {
            return cVar;
        }
        c asInterface = b.asInterface((IBinder) context.getApplicationContext().getClassLoader().loadClass("com.google.android.gms.ads.internal.client.hsdp.HsdpDeepLinkServiceWrapper").getConstructor(null).newInstance(null));
        this.f4725a = asInterface;
        return asInterface;
    }
}
