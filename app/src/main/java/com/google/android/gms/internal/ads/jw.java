package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* loaded from: classes.dex */
public final class jw extends ph implements sv {

    /* renamed from: u, reason: collision with root package name */
    public final String f7551u;

    /* renamed from: v, reason: collision with root package name */
    public final int f7552v;

    public jw(String str, int i) {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
        this.f7551u = str;
        this.f7552v = i;
    }

    @Override // com.google.android.gms.internal.ads.sv
    public final String a() {
        return this.f7551u;
    }

    @Override // com.google.android.gms.internal.ads.sv
    public final int b() {
        return this.f7552v;
    }

    @Override // com.google.android.gms.internal.ads.ph
    public final boolean u4(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            if (i != 2) {
                return false;
            }
            parcel2.writeNoException();
            parcel2.writeInt(this.f7552v);
            return true;
        }
        parcel2.writeNoException();
        parcel2.writeString(this.f7551u);
        return true;
    }
}
