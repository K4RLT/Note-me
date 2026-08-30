package com.google.android.gms.internal.ads;
import ga.a;
import q.x;
import wa.e7;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class sv0 extends a {
    public static final Parcelable.Creator<sv0> CREATOR = new bj(22);

    /* renamed from: u, reason: collision with root package name */
    public final int f11175u;

    /* renamed from: v, reason: collision with root package name */
    public je f11176v = null;

    /* renamed from: w, reason: collision with root package name */
    public byte[] f11177w;

    public sv0(byte[] bArr, int i) {
        this.f11175u = i;
        this.f11177w = bArr;
        zzb();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int k3 = e7.k(parcel, 20293);
        e7.j(parcel, 1, 4);
        parcel.writeInt(this.f11175u);
        byte[] bArr = this.f11177w;
        if (bArr == null) {
            bArr = this.f11176v.b();
        }
        e7.b(parcel, 2, bArr);
        e7.l(parcel, k3);
    }

    public final void zzb() {
        je jeVar = this.f11176v;
        if (jeVar != null || this.f11177w == null) {
            if (jeVar != null && this.f11177w == null) {
                return;
            }
            if (jeVar != null && this.f11177w != null) {
                x.o("Invalid internal representation - full");
            } else if (jeVar == null && this.f11177w == null) {
                x.o("Invalid internal representation - empty");
            } else {
                x.o("Impossible");
            }
        }
    }
}
