package eb;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import wa.e7;

/* loaded from: classes.dex */
public final class o3 extends ga.a {
    public static final Parcelable.Creator<o3> CREATOR = new c9.f(12);
    public final String A;
    public final boolean B;
    public final boolean C;
    public final long D;
    public final String E;
    public final long F;
    public final long G;
    public final int H;
    public final boolean I;
    public final boolean J;
    public final String K;
    public final Boolean L;
    public final long M;
    public final List N;
    public final String O;
    public final String P;
    public final String Q;
    public final String R;
    public final boolean S;
    public final long T;
    public final int U;
    public final String V;
    public final int W;
    public final long X;
    public final String Y;
    public final String Z;

    /* renamed from: u, reason: collision with root package name */
    public final String f16288u;

    /* renamed from: v, reason: collision with root package name */
    public final String f16289v;

    /* renamed from: w, reason: collision with root package name */
    public final String f16290w;

    /* renamed from: x, reason: collision with root package name */
    public final String f16291x;

    /* renamed from: y, reason: collision with root package name */
    public final long f16292y;

    /* renamed from: z, reason: collision with root package name */
    public final long f16293z;

    public o3(String str, String str2, String str3, long j10, String str4, long j11, long j12, String str5, boolean z3, boolean z9, String str6, long j13, int i, boolean z10, boolean z11, String str7, Boolean bool, long j14, List list, String str8, String str9, String str10, boolean z12, long j15, int i10, String str11, int i11, long j16, String str12, String str13) {
        fa.y.e(str);
        this.f16288u = str;
        this.f16289v = TextUtils.isEmpty(str2) ? null : str2;
        this.f16290w = str3;
        this.D = j10;
        this.f16291x = str4;
        this.f16292y = j11;
        this.f16293z = j12;
        this.A = str5;
        this.B = z3;
        this.C = z9;
        this.E = str6;
        this.F = 0L;
        this.G = j13;
        this.H = i;
        this.I = z10;
        this.J = z11;
        this.K = str7;
        this.L = bool;
        this.M = j14;
        this.N = list;
        this.O = null;
        this.P = str8;
        this.Q = str9;
        this.R = str10;
        this.S = z12;
        this.T = j15;
        this.U = i10;
        this.V = str11;
        this.W = i11;
        this.X = j16;
        this.Y = str12;
        this.Z = str13;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int k3 = e7.k(parcel, 20293);
        e7.e(parcel, 2, this.f16288u);
        e7.e(parcel, 3, this.f16289v);
        e7.e(parcel, 4, this.f16290w);
        e7.e(parcel, 5, this.f16291x);
        e7.j(parcel, 6, 8);
        parcel.writeLong(this.f16292y);
        e7.j(parcel, 7, 8);
        parcel.writeLong(this.f16293z);
        e7.e(parcel, 8, this.A);
        e7.j(parcel, 9, 4);
        parcel.writeInt(this.B ? 1 : 0);
        e7.j(parcel, 10, 4);
        parcel.writeInt(this.C ? 1 : 0);
        e7.j(parcel, 11, 8);
        parcel.writeLong(this.D);
        e7.e(parcel, 12, this.E);
        e7.j(parcel, 13, 8);
        parcel.writeLong(this.F);
        e7.j(parcel, 14, 8);
        parcel.writeLong(this.G);
        e7.j(parcel, 15, 4);
        parcel.writeInt(this.H);
        e7.j(parcel, 16, 4);
        parcel.writeInt(this.I ? 1 : 0);
        e7.j(parcel, 18, 4);
        parcel.writeInt(this.J ? 1 : 0);
        e7.e(parcel, 19, this.K);
        Boolean bool = this.L;
        if (bool != null) {
            e7.j(parcel, 21, 4);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        e7.j(parcel, 22, 8);
        parcel.writeLong(this.M);
        e7.g(parcel, this.N, 23);
        e7.e(parcel, 24, this.O);
        e7.e(parcel, 25, this.P);
        e7.e(parcel, 26, this.Q);
        e7.e(parcel, 27, this.R);
        e7.j(parcel, 28, 4);
        parcel.writeInt(this.S ? 1 : 0);
        e7.j(parcel, 29, 8);
        parcel.writeLong(this.T);
        e7.j(parcel, 30, 4);
        parcel.writeInt(this.U);
        e7.e(parcel, 31, this.V);
        e7.j(parcel, 32, 4);
        parcel.writeInt(this.W);
        e7.j(parcel, 34, 8);
        parcel.writeLong(this.X);
        e7.e(parcel, 35, this.Y);
        e7.e(parcel, 36, this.Z);
        e7.l(parcel, k3);
    }

    public o3(String str, String str2, String str3, String str4, long j10, long j11, String str5, boolean z3, boolean z9, long j12, String str6, long j13, long j14, int i, boolean z10, boolean z11, String str7, Boolean bool, long j15, ArrayList arrayList, String str8, String str9, String str10, String str11, boolean z12, long j16, int i10, String str12, int i11, long j17, String str13, String str14) {
        this.f16288u = str;
        this.f16289v = str2;
        this.f16290w = str3;
        this.D = j12;
        this.f16291x = str4;
        this.f16292y = j10;
        this.f16293z = j11;
        this.A = str5;
        this.B = z3;
        this.C = z9;
        this.E = str6;
        this.F = j13;
        this.G = j14;
        this.H = i;
        this.I = z10;
        this.J = z11;
        this.K = str7;
        this.L = bool;
        this.M = j15;
        this.N = arrayList;
        this.O = str8;
        this.P = str9;
        this.Q = str10;
        this.R = str11;
        this.S = z12;
        this.T = j16;
        this.U = i10;
        this.V = str12;
        this.W = i11;
        this.X = j17;
        this.Y = str13;
        this.Z = str14;
    }
}
