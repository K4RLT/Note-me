package com.google.android.gms.internal.ads;
import fa.y;

import android.content.Context;
import android.content.Intent;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class ll implements r31, n80 {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f8055u;

    /* renamed from: v, reason: collision with root package name */
    public final Context f8056v;

    public ll(Context context) {
        this.f8055u = 0;
        y.i(context, "Context can not be null");
        this.f8056v = context;
    }

    public boolean a(Intent intent) {
        y.i(intent, "Intent can not be null");
        if (this.f8056v.getPackageManager().queryIntentActivities(intent, 0).isEmpty()) {
            return false;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.n80, com.google.android.gms.internal.ads.ie0
    /* renamed from: l */
    public /* synthetic */ void mo205l(Object obj) {
        ((c70) obj).c(this.f8056v);
    }

    @Override // com.google.android.gms.internal.ads.r31
    public Object zza() {
        a0 a0Var;
        Context applicationContext;
        switch (this.f8055u) {
            case 1:
                return xy.p(this.f8056v);
            default:
                int i = os1.A;
                Context context = this.f8056v;
                y51 y51Var = a0.H;
                synchronized (a0.class) {
                    try {
                        if (a0.N == null) {
                            if (context == null) {
                                applicationContext = null;
                            } else {
                                applicationContext = context.getApplicationContext();
                            }
                            HashMap hashMap = new HashMap(8);
                            hashMap.put(0, 1000000L);
                            hashMap.put(2, -9223372036854775807L);
                            hashMap.put(3, -9223372036854775807L);
                            hashMap.put(4, -9223372036854775807L);
                            hashMap.put(5, -9223372036854775807L);
                            hashMap.put(10, -9223372036854775807L);
                            hashMap.put(9, -9223372036854775807L);
                            hashMap.put(7, -9223372036854775807L);
                            a0.N = new a0(applicationContext, hashMap);
                        }
                        a0Var = a0.N;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return a0Var;
        }
    }

    public /* synthetic */ ll(Context context, int i) {
        this.f8055u = i;
        this.f8056v = context;
    }
}
