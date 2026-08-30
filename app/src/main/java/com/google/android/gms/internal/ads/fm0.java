package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class fm0 implements pn0 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f6117a;

    /* renamed from: b, reason: collision with root package name */
    public final Bundle f6118b;

    /* renamed from: c, reason: collision with root package name */
    public final String f6119c;

    /* renamed from: d, reason: collision with root package name */
    public final String f6120d;
    public final k9.c0 e;

    /* renamed from: f, reason: collision with root package name */
    public final String f6121f;

    /* renamed from: g, reason: collision with root package name */
    public final q50 f6122g;

    public fm0(Context context, Bundle bundle, String str, String str2, k9.c0 c0Var, String str3, q50 q50Var) {
        this.f6117a = context;
        this.f6118b = bundle;
        this.f6119c = str;
        this.f6120d = str2;
        this.e = c0Var;
        this.f6121f = str3;
        this.f6122g = q50Var;
    }

    @Override // com.google.android.gms.internal.ads.pn0
    public final void l(Object obj) {
        long longValue;
        int intValue;
        Bundle bundle = (Bundle) obj;
        bundle.putBundle("quality_signals", this.f6118b);
        bundle.putString("seq_num", this.f6119c);
        if (!this.e.t()) {
            bundle.putString("session_id", this.f6120d);
        }
        bundle.putBoolean("client_purpose_one", !r0.t());
        if (((Boolean) g9.r.e.f17698c.a(sl.C6)).booleanValue()) {
            try {
                k9.f0 f0Var = f9.k.C.f16813c;
                bundle.putString("_app_id", k9.f0.M(this.f6117a));
            } catch (RemoteException | RuntimeException e) {
                f9.k.C.f16817h.d("AppStatsSignal_AppId", e);
            }
        }
        String str = this.f6121f;
        if (str != null) {
            Bundle bundle2 = new Bundle();
            q50 q50Var = this.f6122g;
            Long l10 = (Long) q50Var.f9757d.get(str);
            if (l10 == null) {
                longValue = -1;
            } else {
                longValue = l10.longValue();
            }
            bundle2.putLong("dload", longValue);
            Integer num = (Integer) q50Var.f9755b.get(str);
            if (num == null) {
                intValue = 0;
            } else {
                intValue = num.intValue();
            }
            bundle2.putInt("pcc", intValue);
            bundle.putBundle("ad_unit_quality_signals", bundle2);
        }
        if (((Boolean) g9.r.e.f17698c.a(sl.f10749gb)).booleanValue()) {
            f9.k kVar = f9.k.C;
            if (kVar.f16817h.f9641l.get() > 0) {
                bundle.putInt("nrwv", kVar.f16817h.f9641l.get());
            }
        }
    }
}
