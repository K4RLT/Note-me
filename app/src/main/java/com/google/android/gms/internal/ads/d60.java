package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class d60 extends ph implements h9.e {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ String f5319u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ long f5320v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ e60 f5321w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d60(e60 e60Var, String str, long j10) {
        super("com.google.android.gms.ads.internal.client.hsdp.IHsdpPrewarmServiceCallback");
        this.f5319u = str;
        this.f5320v = j10;
        this.f5321w = e60Var;
    }

    @Override // h9.e
    public final void K(Bundle bundle) {
        if (((Boolean) g9.r.e.f17698c.a(sl.se)).booleanValue()) {
            this.f5321w.a(this.f5320v, bundle, this.f5319u, "0");
        }
    }

    @Override // h9.e
    public final void Y2(Bundle bundle) {
        if (((Boolean) g9.r.e.f17698c.a(sl.se)).booleanValue()) {
            this.f5321w.a(this.f5320v, bundle, this.f5319u, "1");
        }
    }

    @Override // com.google.android.gms.internal.ads.ph
    public final boolean u4(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            if (i != 2) {
                return false;
            }
            Bundle bundle = (Bundle) qh.b(parcel, Bundle.CREATOR);
            qh.f(parcel);
            K(bundle);
            return true;
        }
        Bundle bundle2 = (Bundle) qh.b(parcel, Bundle.CREATOR);
        qh.f(parcel);
        Y2(bundle2);
        return true;
    }
}
