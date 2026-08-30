package ca;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.ads.mu;
import fa.y;
import java.util.Arrays;
import wa.e7;

/* loaded from: classes.dex */
public final class d extends ga.a {
    public static final Parcelable.Creator<d> CREATOR = new c9.f(3);

    /* renamed from: u, reason: collision with root package name */
    public final String f4029u;

    /* renamed from: v, reason: collision with root package name */
    public final int f4030v;

    /* renamed from: w, reason: collision with root package name */
    public final long f4031w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f4032x;

    public d(String str, int i, long j10, boolean z3) {
        this.f4029u = str;
        this.f4030v = i;
        this.f4031w = j10;
        this.f4032x = z3;
    }

    public final long a() {
        long j10 = this.f4031w;
        if (j10 == -1) {
            return this.f4030v;
        }
        return j10;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            d dVar = (d) obj;
            if (y.l(this.f4029u, dVar.f4029u) && a() == dVar.a() && this.f4032x == dVar.f4032x) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4029u, Long.valueOf(a()), Boolean.valueOf(this.f4032x)});
    }

    public final String toString() {
        mu muVar = new mu(this);
        muVar.f(this.f4029u, "name");
        muVar.f(Long.valueOf(a()), "version");
        muVar.f(Boolean.valueOf(this.f4032x), "is_fully_rolled_out");
        return muVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int k3 = e7.k(parcel, 20293);
        e7.e(parcel, 1, this.f4029u);
        e7.j(parcel, 2, 4);
        parcel.writeInt(this.f4030v);
        long a10 = a();
        e7.j(parcel, 3, 8);
        parcel.writeLong(a10);
        e7.j(parcel, 4, 4);
        parcel.writeInt(this.f4032x ? 1 : 0);
        e7.l(parcel, k3);
    }

    public d(String str, long j10) {
        this(str, -1, j10, false);
    }
}
