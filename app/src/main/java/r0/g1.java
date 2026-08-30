package r0;
import b1.c;
import b1.h0;
import b1.i0;
import b1.i;
import b1.j0;
import b1.p;
import b1.r;
import r0.a1;
import r0.n2;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class g1 extends i0 implements Parcelable, r, n2, a1 {
    public static final Parcelable.Creator<g1> CREATOR = new d1(2);

    /* renamed from: v, reason: collision with root package name */
    public h2 f24256v;

    public g1(long j10) {
        i k3 = p.k();
        h2 h2Var = new h2(k3.g(), j10);
        if (!(k3 instanceof c)) {
            h2Var.f1351b = new h2(1, j10);
        }
        this.f24256v = h2Var;
    }

    @Override // h0
    public final void a(j0 j0Var) {
        j0Var.getClass();
        this.f24256v = (h2) j0Var;
    }

    @Override // h0
    public final j0 b() {
        return this.f24256v;
    }

    @Override // r
    public final v0 d() {
        return v0.f24421z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // h0
    public final j0 g(j0 j0Var, j0 j0Var2, j0 j0Var3) {
        if (((h2) j0Var2).f24263c == ((h2) j0Var3).f24263c) {
            return j0Var2;
        }
        return null;
    }

    @Override // n2
    public final Object getValue() {
        return Long.valueOf(h());
    }

    public final long h() {
        return ((h2) p.t(this.f24256v, this)).f24263c;
    }

    public final void i(long j10) {
        i k3;
        h2 h2Var = (h2) p.i(this.f24256v);
        if (h2Var.f24263c != j10) {
            h2 h2Var2 = this.f24256v;
            synchronized (p.f1387c) {
                k3 = p.k();
                ((h2) p.o(h2Var2, this, k3, h2Var)).f24263c = j10;
            }
            p.n(k3, this);
        }
    }

    @Override // a1
    public final void setValue(Object obj) {
        i(((Number) obj).longValue());
    }

    public final String toString() {
        return "MutableLongState(value=" + ((h2) p.i(this.f24256v)).f24263c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(h());
    }
}
