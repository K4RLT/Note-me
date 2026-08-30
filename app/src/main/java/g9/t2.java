package g9;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Objects;
import wa.e7;

/* loaded from: classes.dex */
public final class t2 extends ga.a {
    public static final Parcelable.Creator<t2> CREATOR = new h1(4);

    /* renamed from: u, reason: collision with root package name */
    public final String f17702u;

    /* renamed from: v, reason: collision with root package name */
    public final int f17703v;

    /* renamed from: w, reason: collision with root package name */
    public final z2 f17704w;

    /* renamed from: x, reason: collision with root package name */
    public final int f17705x;

    /* renamed from: y, reason: collision with root package name */
    public final boolean f17706y;

    public t2(String str, int i, z2 z2Var, int i10, boolean z3) {
        this.f17702u = str;
        this.f17703v = i;
        this.f17704w = z2Var;
        this.f17705x = i10;
        this.f17706y = z3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof t2) {
                t2 t2Var = (t2) obj;
                if (this.f17702u.equals(t2Var.f17702u) && this.f17703v == t2Var.f17703v && this.f17704w.a(t2Var.f17704w)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.f17702u, Integer.valueOf(this.f17703v), this.f17704w);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int k3 = e7.k(parcel, 20293);
        e7.e(parcel, 1, this.f17702u);
        e7.j(parcel, 2, 4);
        parcel.writeInt(this.f17703v);
        e7.d(parcel, 3, this.f17704w, i);
        e7.j(parcel, 4, 4);
        parcel.writeInt(this.f17705x);
        e7.j(parcel, 5, 4);
        parcel.writeInt(this.f17706y ? 1 : 0);
        e7.l(parcel, k3);
    }
}
