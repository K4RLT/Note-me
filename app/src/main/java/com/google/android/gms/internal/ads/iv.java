package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* loaded from: classes.dex */
public final class iv extends ph {

    /* renamed from: u, reason: collision with root package name */
    public final String f7231u;

    /* renamed from: v, reason: collision with root package name */
    public final int f7232v;

    public iv(String str, int i) {
        super("com.google.android.gms.ads.internal.reward.client.IRewardItem");
        this.f7231u = str;
        this.f7232v = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof iv)) {
            return false;
        }
        iv ivVar = (iv) obj;
        if (fa.y.l(this.f7231u, ivVar.f7231u)) {
            if (fa.y.l(Integer.valueOf(this.f7232v), Integer.valueOf(ivVar.f7232v))) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.ph
    public final boolean u4(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            if (i != 2) {
                return false;
            }
            parcel2.writeNoException();
            parcel2.writeInt(this.f7232v);
            return true;
        }
        parcel2.writeNoException();
        parcel2.writeString(this.f7231u);
        return true;
    }
}
