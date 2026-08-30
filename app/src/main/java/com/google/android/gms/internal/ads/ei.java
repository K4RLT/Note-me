package com.google.android.gms.internal.ads;
import a9.d;
import g9.u0;

import android.os.Parcel;

/* loaded from: classes.dex */
public final class ei extends ph implements g9.u0 {

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ int f5693v = 0;

    /* renamed from: u, reason: collision with root package name */
    public final a9.d f5694u;

    public ei(a9.d dVar) {
        super("com.google.android.gms.ads.internal.client.IAppEventListener");
        this.f5694u = dVar;
    }

    @Override // g9.u0
    public final void e0(String str, String str2) {
        this.f5694u.p(str, str2);
    }

    @Override // com.google.android.gms.internal.ads.ph
    public final boolean u4(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            qh.f(parcel);
            e0(readString, readString2);
            parcel2.writeNoException();
            return true;
        }
        return false;
    }
}
