package com.google.android.gms.internal.ads;
import g3.a;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;
import java.util.UUID;

/* loaded from: classes.dex */
public final class ju1 implements Parcelable {
    public static final Parcelable.Creator<ju1> CREATOR = new bj(26);

    /* renamed from: u, reason: collision with root package name */
    public int f7544u;

    /* renamed from: v, reason: collision with root package name */
    public final UUID f7545v;

    /* renamed from: w, reason: collision with root package name */
    public final String f7546w;

    /* renamed from: x, reason: collision with root package name */
    public final String f7547x;

    /* renamed from: y, reason: collision with root package name */
    public final byte[] f7548y;

    public ju1(Parcel parcel) {
        this.f7545v = new UUID(parcel.readLong(), parcel.readLong());
        this.f7546w = parcel.readString();
        String readString = parcel.readString();
        String str = bq0.f4860a;
        this.f7547x = readString;
        this.f7548y = parcel.createByteArray();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ju1)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        ju1 ju1Var = (ju1) obj;
        if (!Objects.equals(this.f7546w, ju1Var.f7546w) || !Objects.equals(this.f7547x, ju1Var.f7547x) || !Objects.equals(this.f7545v, ju1Var.f7545v) || !Arrays.equals(this.f7548y, ju1Var.f7548y)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int i = this.f7544u;
        if (i == 0) {
            int hashCode2 = this.f7545v.hashCode() * 31;
            String str = this.f7546w;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int hashCode3 = Arrays.hashCode(this.f7548y) + a.e(this.f7547x, (hashCode2 + hashCode) * 31, 31);
            this.f7544u = hashCode3;
            return hashCode3;
        }
        return i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        UUID uuid = this.f7545v;
        parcel.writeLong(uuid.getMostSignificantBits());
        parcel.writeLong(uuid.getLeastSignificantBits());
        parcel.writeString(this.f7546w);
        parcel.writeString(this.f7547x);
        parcel.writeByteArray(this.f7548y);
    }

    public ju1(UUID uuid, String str, byte[] bArr) {
        uuid.getClass();
        this.f7545v = uuid;
        this.f7546w = null;
        this.f7547x = ha.h(str);
        this.f7548y = bArr;
    }
}
