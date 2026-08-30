package com.google.android.gms.internal.ads;
import fa.y;
import ga.a;
import wa.e7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import org.json.JSONArray;

/* loaded from: classes.dex */
public final class qv extends a {
    public static final Parcelable.Creator<qv> CREATOR = new bj(15);

    /* renamed from: u, reason: collision with root package name */
    public final String f9994u;

    /* renamed from: v, reason: collision with root package name */
    public final int f9995v;

    public qv(String str, int i) {
        this.f9994u = str;
        this.f9995v = i;
    }

    public static qv a(JSONArray jSONArray) {
        if (jSONArray != null && jSONArray.length() != 0) {
            return new qv(jSONArray.getJSONObject(0).optString("rb_type"), jSONArray.getJSONObject(0).optInt("rb_amount"));
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof qv)) {
            return false;
        }
        qv qvVar = (qv) obj;
        if (!y.l(this.f9994u, qvVar.f9994u) || !y.l(Integer.valueOf(this.f9995v), Integer.valueOf(qvVar.f9995v))) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f9994u, Integer.valueOf(this.f9995v)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int k3 = e7.k(parcel, 20293);
        e7.e(parcel, 2, this.f9994u);
        e7.j(parcel, 3, 4);
        parcel.writeInt(this.f9995v);
        e7.l(parcel, k3);
    }
}
