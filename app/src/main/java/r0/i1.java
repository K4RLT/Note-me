package r0;
import p.i;
import p.k;
import p.n;
import p.o;
import p.t;
import x.o;
import b1.c;
import b1.h0;
import b1.i0;
import b1.i;
import b1.j0;
import b1.p;
import b1.r;
import l.a;
import q.x;
import r0.a1;
import r0.n2;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class i1 extends i0 implements Parcelable, r {
    public static final Parcelable.Creator<i1> CREATOR = new Object();

    /* renamed from: v, reason: collision with root package name */
    public final v0 f24265v;

    /* renamed from: w, reason: collision with root package name */
    public i2 f24266w;

    public i1(Object obj, v0 v0Var) {
        this.f24265v = v0Var;
        i k3 = p.k();
        i2 i2Var = new i2(k3.g(), obj);
        if (!(k3 instanceof c)) {
            i2Var.f1351b = new i2(1, obj);
        }
        this.f24266w = i2Var;
    }

    @Override // h0
    public final void a(j0 j0Var) {
        j0Var.getClass();
        this.f24266w = (i2) j0Var;
    }

    @Override // h0
    public final j0 b() {
        return this.f24266w;
    }

    @Override // r
    public final v0 d() {
        return this.f24265v;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // h0
    public final j0 g(j0 j0Var, j0 j0Var2, j0 j0Var3) {
        if (this.f24265v.b(((i2) j0Var2).f24267c, ((i2) j0Var3).f24267c)) {
            return j0Var2;
        }
        return null;
    }

    @Override // n2
    public final Object getValue() {
        return ((i2) p.t(this.f24266w, this)).f24267c;
    }

    @Override // a1
    public final void setValue(Object obj) {
        i k3;
        i2 i2Var = (i2) p.i(this.f24266w);
        if (!this.f24265v.b(i2Var.f24267c, obj)) {
            i2 i2Var2 = this.f24266w;
            synchronized (p.f1387c) {
                k3 = p.k();
                ((i2) p.o(i2Var2, this, k3, i2Var)).f24267c = obj;
            }
            p.n(k3, this);
        }
    }

    public final String toString() {
        return "MutableState(value=" + ((i2) p.i(this.f24266w)).f24267c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i10;
        parcel.writeValue(getValue());
        v0 v0Var = v0.f24418w;
        v0 v0Var2 = this.f24265v;
        if (kotlin.jvm.internal.a(v0Var2, v0Var)) {
            i10 = 0;
        } else if (kotlin.jvm.internal.a(v0Var2, v0.f24421z)) {
            i10 = 1;
        } else if (kotlin.jvm.internal.a(v0Var2, v0.f24419x)) {
            i10 = 2;
        } else {
            x.o("Only known types of MutableState's SnapshotMutationPolicy are supported");
            return;
        }
        parcel.writeInt(i10);
    }
}
