package com.google.android.gms.internal.ads;
import g9.r;
import h9.g;
import r.e;

import android.os.Bundle;
import android.os.Parcel;
import java.util.Objects;

/* loaded from: classes.dex */
public final class rp extends ph implements h9.g {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ String f10267u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ tp f10268v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rp(tp tpVar, String str) {
        super("com.google.android.gms.ads.internal.client.hsdp.IHsdpServiceCallback");
        this.f10267u = str;
        Objects.requireNonNull(tpVar);
        this.f10268v = tpVar;
    }

    @Override // h9.g
    public final void K(Bundle bundle) {
        if (((Boolean) g9.r.e.f17698c.a(sl.se)).booleanValue()) {
            this.f10268v.e("hsdp_on_error", bundle, this.f10267u);
        }
    }

    @Override // h9.g
    public final void N(Bundle bundle) {
        if (((Boolean) g9.r.e.f17698c.a(sl.se)).booleanValue()) {
            this.f10268v.e("hsdp_on_shown", bundle, this.f10267u);
        }
    }

    @Override // h9.g
    public final void W(Bundle bundle) {
        if (((Boolean) g9.r.e.f17698c.a(sl.se)).booleanValue()) {
            this.f10268v.e("hsdp_on_dismissed", bundle, this.f10267u);
        }
    }

    @Override // com.google.android.gms.internal.ads.ph
    public final boolean u4(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return false;
                }
                Bundle bundle = (Bundle) qh.b(parcel, Bundle.CREATOR);
                qh.f(parcel);
                K(bundle);
            } else {
                Bundle bundle2 = (Bundle) qh.b(parcel, Bundle.CREATOR);
                qh.f(parcel);
                W(bundle2);
            }
        } else {
            Bundle bundle3 = (Bundle) qh.b(parcel, Bundle.CREATOR);
            qh.f(parcel);
            N(bundle3);
        }
        parcel2.writeNoException();
        return true;
    }
}
