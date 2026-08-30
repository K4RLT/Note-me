package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;
import java.util.UUID;

/* loaded from: classes.dex */
public final class nu1 implements Comparator, Parcelable {
    public static final Parcelable.Creator<nu1> CREATOR = new bj(25);

    /* renamed from: u, reason: collision with root package name */
    public final ju1[] f8871u;

    /* renamed from: v, reason: collision with root package name */
    public int f8872v;

    /* renamed from: w, reason: collision with root package name */
    public final String f8873w;

    /* renamed from: x, reason: collision with root package name */
    public final int f8874x;

    public nu1(Parcel parcel) {
        this.f8873w = parcel.readString();
        ju1[] ju1VarArr = (ju1[]) parcel.createTypedArray(ju1.CREATOR);
        String str = bq0.f4860a;
        this.f8871u = ju1VarArr;
        this.f8874x = ju1VarArr.length;
    }

    public final nu1 a(String str) {
        if (Objects.equals(this.f8873w, str)) {
            return this;
        }
        return new nu1(str, false, this.f8871u);
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        ju1 ju1Var = (ju1) obj2;
        UUID uuid = yv0.f12975a;
        UUID uuid2 = ((ju1) obj).f7545v;
        if (uuid.equals(uuid2)) {
            if (!uuid.equals(ju1Var.f7545v)) {
                return 1;
            }
            return 0;
        }
        return uuid2.compareTo(ju1Var.f7545v);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && nu1.class == obj.getClass()) {
            nu1 nu1Var = (nu1) obj;
            if (Objects.equals(this.f8873w, nu1Var.f8873w) && Arrays.equals(this.f8871u, nu1Var.f8871u)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i = this.f8872v;
        if (i == 0) {
            String str = this.f8873w;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int hashCode2 = (hashCode * 31) + Arrays.hashCode(this.f8871u);
            this.f8872v = hashCode2;
            return hashCode2;
        }
        return i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f8873w);
        parcel.writeTypedArray(this.f8871u, 0);
    }

    public nu1(String str, boolean z3, ju1... ju1VarArr) {
        this.f8873w = str;
        ju1VarArr = z3 ? (ju1[]) ju1VarArr.clone() : ju1VarArr;
        this.f8871u = ju1VarArr;
        this.f8874x = ju1VarArr.length;
        Arrays.sort(ju1VarArr, this);
    }
}
