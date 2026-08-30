package g9;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import wa.e7;

/* loaded from: classes.dex */
public final class c3 extends ga.a {
    public static final Parcelable.Creator<c3> CREATOR = new h1(9);
    public final c3[] A;
    public final boolean B;
    public final boolean C;
    public boolean D;
    public final boolean E;
    public final boolean F;
    public final boolean G;
    public final boolean H;
    public final boolean I;
    public final boolean J;

    /* renamed from: u, reason: collision with root package name */
    public final String f17589u;

    /* renamed from: v, reason: collision with root package name */
    public final int f17590v;

    /* renamed from: w, reason: collision with root package name */
    public final int f17591w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f17592x;

    /* renamed from: y, reason: collision with root package name */
    public final int f17593y;

    /* renamed from: z, reason: collision with root package name */
    public final int f17594z;

    /* JADX WARN: Removed duplicated region for block: B:32:0x00e7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public c3(android.content.Context r17, z8.h[] r18) {
        /*
            Method dump skipped, instructions count: 425
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g9.c3.<init>(android.content.Context, z8.h[]):void");
    }

    public static c3 a() {
        return new c3("320x50_mb", 0, 0, false, 0, 0, null, true, false, false, false, false, false, false, false, false);
    }

    public static c3 b() {
        return new c3("interstitial_mb", 0, 0, false, 0, 0, null, false, false, false, false, true, false, false, false, false);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int k3 = e7.k(parcel, 20293);
        e7.e(parcel, 2, this.f17589u);
        e7.j(parcel, 3, 4);
        parcel.writeInt(this.f17590v);
        e7.j(parcel, 4, 4);
        parcel.writeInt(this.f17591w);
        e7.j(parcel, 5, 4);
        parcel.writeInt(this.f17592x ? 1 : 0);
        e7.j(parcel, 6, 4);
        parcel.writeInt(this.f17593y);
        e7.j(parcel, 7, 4);
        parcel.writeInt(this.f17594z);
        e7.h(parcel, 8, this.A, i);
        e7.j(parcel, 9, 4);
        parcel.writeInt(this.B ? 1 : 0);
        e7.j(parcel, 10, 4);
        parcel.writeInt(this.C ? 1 : 0);
        boolean z3 = this.D;
        e7.j(parcel, 11, 4);
        parcel.writeInt(z3 ? 1 : 0);
        e7.j(parcel, 12, 4);
        parcel.writeInt(this.E ? 1 : 0);
        e7.j(parcel, 13, 4);
        parcel.writeInt(this.F ? 1 : 0);
        e7.j(parcel, 14, 4);
        parcel.writeInt(this.G ? 1 : 0);
        e7.j(parcel, 15, 4);
        parcel.writeInt(this.H ? 1 : 0);
        e7.j(parcel, 16, 4);
        parcel.writeInt(this.I ? 1 : 0);
        e7.j(parcel, 17, 4);
        parcel.writeInt(this.J ? 1 : 0);
        e7.l(parcel, k3);
    }

    public c3(String str, int i, int i10, boolean z3, int i11, int i12, c3[] c3VarArr, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17) {
        this.f17589u = str;
        this.f17590v = i;
        this.f17591w = i10;
        this.f17592x = z3;
        this.f17593y = i11;
        this.f17594z = i12;
        this.A = c3VarArr;
        this.B = z9;
        this.C = z10;
        this.D = z11;
        this.E = z12;
        this.F = z13;
        this.G = z14;
        this.H = z15;
        this.I = z16;
        this.J = z17;
    }

    public c3() {
        this("interstitial_mb", 0, 0, true, 0, 0, null, false, false, false, false, false, false, false, false, false);
    }

    public c3(Context context, z8.h hVar) {
        this(context, new z8.h[]{hVar});
    }
}
