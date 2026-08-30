package eb;
import x.n;
import q.x;

import android.os.Parcel;
import android.os.Parcelable;
import wa.e7;

/* loaded from: classes.dex */
public final class k3 extends ga.a {
    public static final Parcelable.Creator<k3> CREATOR = new c9.f(13);
    public final Double A;

    /* renamed from: u, reason: collision with root package name */
    public final int f16211u;

    /* renamed from: v, reason: collision with root package name */
    public final String f16212v;

    /* renamed from: w, reason: collision with root package name */
    public final long f16213w;

    /* renamed from: x, reason: collision with root package name */
    public final Long f16214x;

    /* renamed from: y, reason: collision with root package name */
    public final String f16215y;

    /* renamed from: z, reason: collision with root package name */
    public final String f16216z;

    public k3(long j10, Object obj, String str, String str2) {
        fa.y.e(str);
        this.f16211u = 2;
        this.f16212v = str;
        this.f16213w = j10;
        this.f16216z = str2;
        if (obj == null) {
            this.f16214x = null;
            this.A = null;
            this.f16215y = null;
            return;
        }
        if (obj instanceof Long) {
            this.f16214x = (Long) obj;
            this.A = null;
            this.f16215y = null;
        } else if (obj instanceof String) {
            this.f16214x = null;
            this.A = null;
            this.f16215y = (String) obj;
        } else {
            if (obj instanceof Double) {
                this.f16214x = null;
                this.A = (Double) obj;
                this.f16215y = null;
                return;
            }
            x.n("User attribute given of un-supported type");
            throw null;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int k3 = e7.k(parcel, 20293);
        e7.j(parcel, 1, 4);
        parcel.writeInt(this.f16211u);
        e7.e(parcel, 2, this.f16212v);
        e7.j(parcel, 3, 8);
        parcel.writeLong(this.f16213w);
        Long l10 = this.f16214x;
        if (l10 != null) {
            e7.j(parcel, 4, 8);
            parcel.writeLong(l10.longValue());
        }
        e7.e(parcel, 6, this.f16215y);
        e7.e(parcel, 7, this.f16216z);
        Double d2 = this.A;
        if (d2 != null) {
            e7.j(parcel, 8, 8);
            parcel.writeDouble(d2.doubleValue());
        }
        e7.l(parcel, k3);
    }

    public final Object zza() {
        Long l10 = this.f16214x;
        if (l10 != null) {
            return l10;
        }
        Double d2 = this.A;
        if (d2 != null) {
            return d2;
        }
        String str = this.f16215y;
        if (str != null) {
            return str;
        }
        return null;
    }

    public k3(int i, String str, long j10, Long l10, Float f10, String str2, String str3, Double d2) {
        this.f16211u = i;
        this.f16212v = str;
        this.f16213w = j10;
        this.f16214x = l10;
        if (i == 1) {
            this.A = f10 != null ? Double.valueOf(f10.doubleValue()) : null;
        } else {
            this.A = d2;
        }
        this.f16215y = str2;
        this.f16216z = str3;
    }

    public k3(m3 m3Var) {
        this(m3Var.f16245d, m3Var.e, m3Var.f16244c, m3Var.f16243b);
    }
}
