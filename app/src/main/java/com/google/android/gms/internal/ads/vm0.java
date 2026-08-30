package com.google.android.gms.internal.ads;
import g9.r;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class vm0 implements pn0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11948a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final String f11949b;

    /* renamed from: c, reason: collision with root package name */
    public final Bundle f11950c;

    /* renamed from: d, reason: collision with root package name */
    public final String f11951d;

    public vm0(String str, Bundle bundle, String str2) {
        this.f11949b = str;
        this.f11950c = bundle;
        this.f11951d = str2;
    }

    @Override // com.google.android.gms.internal.ads.pn0
    public final void l(Object obj) {
        switch (this.f11948a) {
            case 0:
                Bundle bundle = (Bundle) obj;
                bundle.putString("consent_string", this.f11949b);
                bundle.putString("fc_consent", this.f11951d);
                Bundle bundle2 = this.f11950c;
                if (bundle2 != null) {
                    bundle.putBundle("iab_consent_info", bundle2);
                    return;
                }
                return;
            default:
                Bundle bundle3 = (Bundle) obj;
                bundle3.putString("rtb", this.f11949b);
                if (((Boolean) r.e.f17698c.a(sl.f10680c5)).booleanValue()) {
                    String str = this.f11951d;
                    if (!str.isEmpty()) {
                        bundle3.putString("cld_status", str);
                    }
                }
                Bundle bundle4 = this.f11950c;
                if (!bundle4.isEmpty()) {
                    bundle3.putBundle("adapter_initialization_status", bundle4);
                    return;
                }
                return;
        }
    }

    public /* synthetic */ vm0(String str, String str2, Bundle bundle) {
        this.f11949b = str;
        this.f11951d = str2;
        this.f11950c = bundle;
    }
}
