package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;

/* loaded from: classes.dex */
public final class sg0 implements a80 {

    /* renamed from: u, reason: collision with root package name */
    public final Context f10610u;

    /* renamed from: v, reason: collision with root package name */
    public final ww f10611v;

    public sg0(Context context, ww wwVar) {
        this.f10610u = context;
        this.f10611v = wwVar;
    }

    @Override // com.google.android.gms.internal.ads.a80
    public final void S(wp0 wp0Var) {
        String str = ((sp0) wp0Var.f12313b.f11471w).e;
        if (!TextUtils.isEmpty(str)) {
            ww wwVar = this.f10611v;
            Context context = this.f10610u;
            wwVar.getClass();
            if (((Boolean) g9.r.e.f17698c.a(sl.Y0)).booleanValue() && wwVar.a(context) && ww.g(context)) {
                synchronized (wwVar.f12348j) {
                }
            }
            wwVar.h(context, "_aq", str, null);
        }
    }

    @Override // com.google.android.gms.internal.ads.a80
    public final void r(dv dvVar) {
    }
}
