package r0;
import p.i;
import p.k;
import p.n;
import p.o;
import p.t;
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
public final class f1 extends i0 implements Parcelable, r, n2, a1 {
    public static final Parcelable.Creator<f1> CREATOR = new d1(1);

    /* renamed from: v, reason: collision with root package name */
    public g2 f24250v;

    public f1(int i) {
        i k3 = p.k();
        g2 g2Var = new g2(k3.g(), i);
        if (!(k3 instanceof c)) {
            g2Var.f1351b = new g2(1, i);
        }
        this.f24250v = g2Var;
    }

    @Override // h0
    public final void a(j0 j0Var) {
        j0Var.getClass();
        this.f24250v = (g2) j0Var;
    }

    @Override // h0
    public final j0 b() {
        return this.f24250v;
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
        if (((g2) j0Var2).f24257c == ((g2) j0Var3).f24257c) {
            return j0Var2;
        }
        return null;
    }

    @Override // n2
    public final Object getValue() {
        return Integer.valueOf(h());
    }

    public final int h() {
        return ((g2) p.t(this.f24250v, this)).f24257c;
    }

    public final void i(int i) {
        i k3;
        g2 g2Var = (g2) p.i(this.f24250v);
        if (g2Var.f24257c != i) {
            g2 g2Var2 = this.f24250v;
            synchronized (p.f1387c) {
                k3 = p.k();
                ((g2) p.o(g2Var2, this, k3, g2Var)).f24257c = i;
            }
            p.n(k3, this);
        }
    }

    @Override // a1
    public final void setValue(Object obj) {
        i(((Number) obj).intValue());
    }

    public final String toString() {
        return "MutableIntState(value=" + ((g2) p.i(this.f24250v)).f24257c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(h());
    }
}
