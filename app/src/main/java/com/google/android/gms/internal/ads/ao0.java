package com.google.android.gms.internal.ads;

import android.content.Context;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class ao0 implements qn0 {

    /* renamed from: a, reason: collision with root package name */
    public final JSONObject f4565a;

    public ao0(Context context) {
        this.f4565a = a8.e(context, l9.a.a());
    }

    @Override // com.google.android.gms.internal.ads.qn0
    public final ac.b zza() {
        if (((Boolean) g9.r.e.f17698c.a(sl.f10957td)).booleanValue()) {
            return ed1.e(zn0.f13217a);
        }
        return ed1.e(new cn0(2, this));
    }

    @Override // com.google.android.gms.internal.ads.qn0
    public final int zzb() {
        return 46;
    }
}
