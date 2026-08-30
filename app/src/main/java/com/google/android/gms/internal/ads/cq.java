package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;

/* loaded from: classes.dex */
public final class cq extends ph {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ yx f5141u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cq(dq dqVar, yx yxVar) {
        super("com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheCallback");
        this.f5141u = yxVar;
    }

    @Override // com.google.android.gms.internal.ads.ph
    public final boolean u4(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) qh.b(parcel, ParcelFileDescriptor.CREATOR);
            qh.f(parcel);
            this.f5141u.b(parcelFileDescriptor);
            return true;
        }
        return false;
    }
}
