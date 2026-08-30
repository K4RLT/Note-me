package eb;

import android.os.Parcel;
import android.os.Parcelable;
import wa.e7;

/* loaded from: classes.dex */
public final class d extends ga.a {
    public static final Parcelable.Creator<d> CREATOR = new c9.f(7);
    public final u A;
    public long B;
    public u C;
    public final long D;
    public final u E;

    /* renamed from: u, reason: collision with root package name */
    public String f16093u;

    /* renamed from: v, reason: collision with root package name */
    public String f16094v;

    /* renamed from: w, reason: collision with root package name */
    public k3 f16095w;

    /* renamed from: x, reason: collision with root package name */
    public long f16096x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f16097y;

    /* renamed from: z, reason: collision with root package name */
    public String f16098z;

    public d(d dVar) {
        fa.y.h(dVar);
        this.f16093u = dVar.f16093u;
        this.f16094v = dVar.f16094v;
        this.f16095w = dVar.f16095w;
        this.f16096x = dVar.f16096x;
        this.f16097y = dVar.f16097y;
        this.f16098z = dVar.f16098z;
        this.A = dVar.A;
        this.B = dVar.B;
        this.C = dVar.C;
        this.D = dVar.D;
        this.E = dVar.E;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int k3 = e7.k(parcel, 20293);
        e7.e(parcel, 2, this.f16093u);
        e7.e(parcel, 3, this.f16094v);
        e7.d(parcel, 4, this.f16095w, i);
        long j10 = this.f16096x;
        e7.j(parcel, 5, 8);
        parcel.writeLong(j10);
        boolean z3 = this.f16097y;
        e7.j(parcel, 6, 4);
        parcel.writeInt(z3 ? 1 : 0);
        e7.e(parcel, 7, this.f16098z);
        e7.d(parcel, 8, this.A, i);
        long j11 = this.B;
        e7.j(parcel, 9, 8);
        parcel.writeLong(j11);
        e7.d(parcel, 10, this.C, i);
        e7.j(parcel, 11, 8);
        parcel.writeLong(this.D);
        e7.d(parcel, 12, this.E, i);
        e7.l(parcel, k3);
    }

    public d(String str, String str2, k3 k3Var, long j10, boolean z3, String str3, u uVar, long j11, u uVar2, long j12, u uVar3) {
        this.f16093u = str;
        this.f16094v = str2;
        this.f16095w = k3Var;
        this.f16096x = j10;
        this.f16097y = z3;
        this.f16098z = str3;
        this.A = uVar;
        this.B = j11;
        this.C = uVar2;
        this.D = j12;
        this.E = uVar3;
    }
}
