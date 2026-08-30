package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class ln0 implements pn0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f8070a;

    /* renamed from: b, reason: collision with root package name */
    public final String f8071b;

    /* renamed from: c, reason: collision with root package name */
    public final String f8072c;

    /* renamed from: d, reason: collision with root package name */
    public final String f8073d;
    public final Long e;

    public ln0(String str, String str2, String str3, String str4, Long l10) {
        this.f8070a = str;
        this.f8071b = str2;
        this.f8072c = str3;
        this.f8073d = str4;
        this.e = l10;
    }

    @Override // com.google.android.gms.internal.ads.pn0
    public final /* bridge */ /* synthetic */ void l(Object obj) {
        Bundle bundle = (Bundle) obj;
        b80.H("gmp_app_id", bundle, this.f8070a);
        b80.H("fbs_aiid", bundle, this.f8071b);
        b80.H("fbs_aeid", bundle, this.f8072c);
        b80.H("apm_id_origin", bundle, this.f8073d);
        Long l10 = this.e;
        if (l10 != null) {
            bundle.putLong("sai_timeout", l10.longValue());
        }
    }
}
