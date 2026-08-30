package g9;

import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import wa.e7;

/* loaded from: classes.dex */
public final class z2 extends ga.a {
    public static final Parcelable.Creator<z2> CREATOR = new h1(8);
    public final int A;
    public final boolean B;
    public final String C;
    public final v2 D;
    public final Location E;
    public final String F;
    public final Bundle G;
    public final Bundle H;
    public final List I;
    public final String J;
    public final String K;
    public final boolean L;
    public final o0 M;
    public final int N;
    public final String O;
    public final List P;
    public final int Q;
    public final String R;
    public final int S;
    public final long T;
    public final long U;
    public final int V;
    public final Bundle W = new Bundle();

    /* renamed from: u, reason: collision with root package name */
    public final int f17721u;

    /* renamed from: v, reason: collision with root package name */
    public final long f17722v;

    /* renamed from: w, reason: collision with root package name */
    public final Bundle f17723w;

    /* renamed from: x, reason: collision with root package name */
    public final int f17724x;

    /* renamed from: y, reason: collision with root package name */
    public final List f17725y;

    /* renamed from: z, reason: collision with root package name */
    public final boolean f17726z;

    public z2(int i, long j10, Bundle bundle, int i10, List list, boolean z3, int i11, boolean z9, String str, v2 v2Var, Location location, String str2, Bundle bundle2, Bundle bundle3, List list2, String str3, String str4, boolean z10, o0 o0Var, int i12, String str5, List list3, int i13, String str6, int i14, long j11, long j12, int i15) {
        this.f17721u = i;
        this.f17722v = j10;
        this.f17723w = bundle == null ? new Bundle() : bundle;
        this.f17724x = i10;
        this.f17725y = list;
        this.f17726z = z3;
        this.A = i11;
        this.B = z9;
        this.C = str;
        this.D = v2Var;
        this.E = location;
        this.F = str2;
        this.G = bundle2 == null ? new Bundle() : bundle2;
        this.H = bundle3;
        this.I = list2;
        this.J = str3;
        this.K = str4;
        this.L = z10;
        this.M = o0Var;
        this.N = i12;
        this.O = str5;
        this.P = list3 == null ? new ArrayList() : list3;
        this.Q = i13;
        this.R = str6;
        this.S = i14;
        this.T = j11;
        this.U = j12;
        this.V = i15;
    }

    public final boolean a(z2 z2Var) {
        if (z2Var != null && this.f17721u == z2Var.f17721u && this.f17722v == z2Var.f17722v && ya.l0.a(this.f17723w, z2Var.f17723w) && this.f17724x == z2Var.f17724x && fa.y.l(this.f17725y, z2Var.f17725y) && this.f17726z == z2Var.f17726z && this.A == z2Var.A && this.B == z2Var.B && fa.y.l(this.C, z2Var.C) && fa.y.l(this.D, z2Var.D) && fa.y.l(this.E, z2Var.E) && fa.y.l(this.F, z2Var.F) && ya.l0.a(this.G, z2Var.G) && ya.l0.a(this.H, z2Var.H) && fa.y.l(this.I, z2Var.I) && fa.y.l(this.J, z2Var.J) && fa.y.l(this.K, z2Var.K) && this.L == z2Var.L && this.N == z2Var.N && fa.y.l(this.O, z2Var.O) && fa.y.l(this.P, z2Var.P) && this.Q == z2Var.Q && fa.y.l(this.R, z2Var.R) && this.S == z2Var.S && this.V == z2Var.V) {
            return true;
        }
        return false;
    }

    public final boolean b() {
        Bundle bundle = this.f17723w;
        if (!bundle.getBoolean("is_sdk_preload", false) && !bundle.getBoolean("zenith_v2", false)) {
            return false;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof z2) {
            z2 z2Var = (z2) obj;
            if (a(z2Var) && this.T == z2Var.T) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f17721u), Long.valueOf(this.f17722v), this.f17723w, Integer.valueOf(this.f17724x), this.f17725y, Boolean.valueOf(this.f17726z), Integer.valueOf(this.A), Boolean.valueOf(this.B), this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, this.K, Boolean.valueOf(this.L), Integer.valueOf(this.N), this.O, this.P, Integer.valueOf(this.Q), this.R, Integer.valueOf(this.S), Long.valueOf(this.T), Long.valueOf(this.U), Integer.valueOf(this.V)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int k3 = e7.k(parcel, 20293);
        e7.j(parcel, 1, 4);
        parcel.writeInt(this.f17721u);
        e7.j(parcel, 2, 8);
        parcel.writeLong(this.f17722v);
        e7.a(parcel, 3, this.f17723w);
        e7.j(parcel, 4, 4);
        parcel.writeInt(this.f17724x);
        e7.g(parcel, this.f17725y, 5);
        e7.j(parcel, 6, 4);
        parcel.writeInt(this.f17726z ? 1 : 0);
        e7.j(parcel, 7, 4);
        parcel.writeInt(this.A);
        e7.j(parcel, 8, 4);
        parcel.writeInt(this.B ? 1 : 0);
        e7.e(parcel, 9, this.C);
        e7.d(parcel, 10, this.D, i);
        e7.d(parcel, 11, this.E, i);
        e7.e(parcel, 12, this.F);
        e7.a(parcel, 13, this.G);
        e7.a(parcel, 14, this.H);
        e7.g(parcel, this.I, 15);
        e7.e(parcel, 16, this.J);
        e7.e(parcel, 17, this.K);
        e7.j(parcel, 18, 4);
        parcel.writeInt(this.L ? 1 : 0);
        e7.d(parcel, 19, this.M, i);
        e7.j(parcel, 20, 4);
        parcel.writeInt(this.N);
        e7.e(parcel, 21, this.O);
        e7.g(parcel, this.P, 22);
        e7.j(parcel, 23, 4);
        parcel.writeInt(this.Q);
        e7.e(parcel, 24, this.R);
        e7.j(parcel, 25, 4);
        parcel.writeInt(this.S);
        e7.j(parcel, 26, 8);
        parcel.writeLong(this.T);
        e7.j(parcel, 27, 8);
        parcel.writeLong(this.U);
        e7.j(parcel, 28, 4);
        parcel.writeInt(this.V);
        e7.l(parcel, k3);
    }
}
