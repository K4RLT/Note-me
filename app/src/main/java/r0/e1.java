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
public final class e1 extends i0 implements Parcelable, r, n2, a1 {
    public static final Parcelable.Creator<e1> CREATOR = new d1(0);

    /* renamed from: v, reason: collision with root package name */
    public f2 f24216v;

    public e1(float f10) {
        i k3 = p.k();
        f2 f2Var = new f2(k3.g(), f10);
        if (!(k3 instanceof c)) {
            f2Var.f1351b = new f2(1, f10);
        }
        this.f24216v = f2Var;
    }

    @Override // h0
    public final void a(j0 j0Var) {
        j0Var.getClass();
        this.f24216v = (f2) j0Var;
    }

    @Override // h0
    public final j0 b() {
        return this.f24216v;
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
        if (((f2) j0Var2).f24251c == ((f2) j0Var3).f24251c) {
            return j0Var2;
        }
        return null;
    }

    @Override // n2
    public final Object getValue() {
        return Float.valueOf(h());
    }

    public final float h() {
        return ((f2) p.t(this.f24216v, this)).f24251c;
    }

    public final void i(float f10) {
        i k3;
        f2 f2Var = (f2) p.i(this.f24216v);
        if (f2Var.f24251c == f10) {
            return;
        }
        f2 f2Var2 = this.f24216v;
        synchronized (p.f1387c) {
            k3 = p.k();
            ((f2) p.o(f2Var2, this, k3, f2Var)).f24251c = f10;
        }
        p.n(k3, this);
    }

    @Override // a1
    public final void setValue(Object obj) {
        i(((Number) obj).floatValue());
    }

    public final String toString() {
        return "MutableFloatState(value=" + ((f2) p.i(this.f24216v)).f24251c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(h());
    }
}
