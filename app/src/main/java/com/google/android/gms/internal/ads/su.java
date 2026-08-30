package com.google.android.gms.internal.ads;
import ga.a;
import l9.a;
import e7.a;
import e7.d;
import e7.e;
import e7.g;
import e7.j;
import e7.k;
import e7.l;
import g9.b2;
import g9.c3;
import g9.z2;
import wa.e7;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class su extends ga.a {
    public static final Parcelable.Creator<su> CREATOR = new bj(10);
    public final PackageInfo A;
    public final String B;
    public final String C;
    public final String D;
    public final l9.a E;
    public final Bundle F;
    public final int G;
    public final List H;
    public final Bundle I;
    public final boolean J;
    public final int K;
    public final int L;
    public final float M;
    public final String N;
    public final long O;
    public final String P;
    public final List Q;
    public final String R;
    public final rn S;
    public final List T;
    public final long U;
    public final String V;
    public final float W;
    public final int X;
    public final int Y;
    public final boolean Z;

    /* renamed from: a0, reason: collision with root package name */
    public final String f11136a0;

    /* renamed from: b0, reason: collision with root package name */
    public final boolean f11137b0;

    /* renamed from: c0, reason: collision with root package name */
    public final String f11138c0;

    /* renamed from: d0, reason: collision with root package name */
    public final boolean f11139d0;

    /* renamed from: e0, reason: collision with root package name */
    public final int f11140e0;

    /* renamed from: f0, reason: collision with root package name */
    public final Bundle f11141f0;

    /* renamed from: g0, reason: collision with root package name */
    public final String f11142g0;

    /* renamed from: h0, reason: collision with root package name */
    public final g9.b2 f11143h0;

    /* renamed from: i0, reason: collision with root package name */
    public final boolean f11144i0;

    /* renamed from: j0, reason: collision with root package name */
    public final Bundle f11145j0;

    /* renamed from: k0, reason: collision with root package name */
    public final String f11146k0;
    public final String l0;
    public final String m0;

    /* renamed from: n0, reason: collision with root package name */
    public final boolean f11147n0;

    /* renamed from: o0, reason: collision with root package name */
    public final List f11148o0;

    /* renamed from: p0, reason: collision with root package name */
    public final String f11149p0;

    /* renamed from: q0, reason: collision with root package name */
    public final List f11150q0;

    /* renamed from: r0, reason: collision with root package name */
    public final int f11151r0;

    /* renamed from: s0, reason: collision with root package name */
    public final boolean f11152s0;

    /* renamed from: t0, reason: collision with root package name */
    public final boolean f11153t0;

    /* renamed from: u, reason: collision with root package name */
    public final int f11154u;

    /* renamed from: u0, reason: collision with root package name */
    public final boolean f11155u0;

    /* renamed from: v, reason: collision with root package name */
    public final Bundle f11156v;

    /* renamed from: v0, reason: collision with root package name */
    public final ArrayList f11157v0;

    /* renamed from: w, reason: collision with root package name */
    public final g9.z2 f11158w;

    /* renamed from: w0, reason: collision with root package name */
    public final String f11159w0;

    /* renamed from: x, reason: collision with root package name */
    public final g9.c3 f11160x;

    /* renamed from: x0, reason: collision with root package name */
    public final lq f11161x0;

    /* renamed from: y, reason: collision with root package name */
    public final String f11162y;

    /* renamed from: y0, reason: collision with root package name */
    public final String f11163y0;

    /* renamed from: z, reason: collision with root package name */
    public final ApplicationInfo f11164z;

    /* renamed from: z0, reason: collision with root package name */
    public final Bundle f11165z0;

    public su(int i, Bundle bundle, g9.z2 z2Var, g9.c3 c3Var, String str, ApplicationInfo applicationInfo, PackageInfo packageInfo, String str2, String str3, String str4, l9.a aVar, Bundle bundle2, int i10, ArrayList arrayList, Bundle bundle3, boolean z3, int i11, int i12, float f10, String str5, long j10, String str6, ArrayList arrayList2, String str7, rn rnVar, ArrayList arrayList3, long j11, String str8, float f11, boolean z9, int i13, int i14, boolean z10, String str9, String str10, boolean z11, int i15, Bundle bundle4, String str11, g9.b2 b2Var, boolean z12, Bundle bundle5, String str12, String str13, String str14, boolean z13, ArrayList arrayList4, String str15, ArrayList arrayList5, int i16, boolean z14, boolean z15, boolean z16, ArrayList arrayList6, String str16, lq lqVar, String str17, Bundle bundle6) {
        List unmodifiableList;
        List unmodifiableList2;
        this.f11154u = i;
        this.f11156v = bundle;
        this.f11158w = z2Var;
        this.f11160x = c3Var;
        this.f11162y = str;
        this.f11164z = applicationInfo;
        this.A = packageInfo;
        this.B = str2;
        this.C = str3;
        this.D = str4;
        this.E = aVar;
        this.F = bundle2;
        this.G = i10;
        this.H = arrayList;
        if (arrayList3 == null) {
            unmodifiableList = Collections.EMPTY_LIST;
        } else {
            unmodifiableList = Collections.unmodifiableList(arrayList3);
        }
        this.T = unmodifiableList;
        this.I = bundle3;
        this.J = z3;
        this.K = i11;
        this.L = i12;
        this.M = f10;
        this.N = str5;
        this.O = j10;
        this.P = str6;
        if (arrayList2 == null) {
            unmodifiableList2 = Collections.EMPTY_LIST;
        } else {
            unmodifiableList2 = Collections.unmodifiableList(arrayList2);
        }
        this.Q = unmodifiableList2;
        this.R = str7;
        this.S = rnVar;
        this.U = j11;
        this.V = str8;
        this.W = f11;
        this.f11137b0 = z9;
        this.X = i13;
        this.Y = i14;
        this.Z = z10;
        this.f11136a0 = str9;
        this.f11138c0 = str10;
        this.f11139d0 = z11;
        this.f11140e0 = i15;
        this.f11141f0 = bundle4;
        this.f11142g0 = str11;
        this.f11143h0 = b2Var;
        this.f11144i0 = z12;
        this.f11145j0 = bundle5;
        this.f11146k0 = str12;
        this.l0 = str13;
        this.m0 = str14;
        this.f11147n0 = z13;
        this.f11148o0 = arrayList4;
        this.f11149p0 = str15;
        this.f11150q0 = arrayList5;
        this.f11151r0 = i16;
        this.f11152s0 = z14;
        this.f11153t0 = z15;
        this.f11155u0 = z16;
        this.f11157v0 = arrayList6;
        this.f11159w0 = str16;
        this.f11161x0 = lqVar;
        this.f11163y0 = str17;
        this.f11165z0 = bundle6;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int k3 = wa.e7.k(parcel, 20293);
        wa.e7.j(parcel, 1, 4);
        parcel.writeInt(this.f11154u);
        wa.e7.a(parcel, 2, this.f11156v);
        wa.e7.d(parcel, 3, this.f11158w, i);
        wa.e7.d(parcel, 4, this.f11160x, i);
        wa.e7.e(parcel, 5, this.f11162y);
        wa.e7.d(parcel, 6, this.f11164z, i);
        wa.e7.d(parcel, 7, this.A, i);
        wa.e7.e(parcel, 8, this.B);
        wa.e7.e(parcel, 9, this.C);
        wa.e7.e(parcel, 10, this.D);
        wa.e7.d(parcel, 11, this.E, i);
        wa.e7.a(parcel, 12, this.F);
        wa.e7.j(parcel, 13, 4);
        parcel.writeInt(this.G);
        wa.e7.g(parcel, this.H, 14);
        wa.e7.a(parcel, 15, this.I);
        wa.e7.j(parcel, 16, 4);
        parcel.writeInt(this.J ? 1 : 0);
        wa.e7.j(parcel, 18, 4);
        parcel.writeInt(this.K);
        wa.e7.j(parcel, 19, 4);
        parcel.writeInt(this.L);
        wa.e7.j(parcel, 20, 4);
        parcel.writeFloat(this.M);
        wa.e7.e(parcel, 21, this.N);
        wa.e7.j(parcel, 25, 8);
        parcel.writeLong(this.O);
        wa.e7.e(parcel, 26, this.P);
        wa.e7.g(parcel, this.Q, 27);
        wa.e7.e(parcel, 28, this.R);
        wa.e7.d(parcel, 29, this.S, i);
        wa.e7.g(parcel, this.T, 30);
        wa.e7.j(parcel, 31, 8);
        parcel.writeLong(this.U);
        wa.e7.e(parcel, 33, this.V);
        wa.e7.j(parcel, 34, 4);
        parcel.writeFloat(this.W);
        wa.e7.j(parcel, 35, 4);
        parcel.writeInt(this.X);
        wa.e7.j(parcel, 36, 4);
        parcel.writeInt(this.Y);
        wa.e7.j(parcel, 37, 4);
        parcel.writeInt(this.Z ? 1 : 0);
        wa.e7.e(parcel, 39, this.f11136a0);
        wa.e7.j(parcel, 40, 4);
        parcel.writeInt(this.f11137b0 ? 1 : 0);
        wa.e7.e(parcel, 41, this.f11138c0);
        wa.e7.j(parcel, 42, 4);
        parcel.writeInt(this.f11139d0 ? 1 : 0);
        wa.e7.j(parcel, 43, 4);
        parcel.writeInt(this.f11140e0);
        wa.e7.a(parcel, 44, this.f11141f0);
        wa.e7.e(parcel, 45, this.f11142g0);
        wa.e7.d(parcel, 46, this.f11143h0, i);
        wa.e7.j(parcel, 47, 4);
        parcel.writeInt(this.f11144i0 ? 1 : 0);
        wa.e7.a(parcel, 48, this.f11145j0);
        wa.e7.e(parcel, 49, this.f11146k0);
        wa.e7.e(parcel, 50, this.l0);
        wa.e7.e(parcel, 51, this.m0);
        wa.e7.j(parcel, 52, 4);
        parcel.writeInt(this.f11147n0 ? 1 : 0);
        List list = this.f11148o0;
        if (list != null) {
            int k4 = wa.e7.k(parcel, 53);
            int size = list.size();
            parcel.writeInt(size);
            for (int i10 = 0; i10 < size; i10++) {
                parcel.writeInt(((Integer) list.get(i10)).intValue());
            }
            wa.e7.l(parcel, k4);
        }
        wa.e7.e(parcel, 54, this.f11149p0);
        wa.e7.g(parcel, this.f11150q0, 55);
        wa.e7.j(parcel, 56, 4);
        parcel.writeInt(this.f11151r0);
        wa.e7.j(parcel, 57, 4);
        parcel.writeInt(this.f11152s0 ? 1 : 0);
        wa.e7.j(parcel, 58, 4);
        parcel.writeInt(this.f11153t0 ? 1 : 0);
        wa.e7.j(parcel, 59, 4);
        parcel.writeInt(this.f11155u0 ? 1 : 0);
        wa.e7.g(parcel, this.f11157v0, 60);
        wa.e7.e(parcel, 61, this.f11159w0);
        wa.e7.d(parcel, 63, this.f11161x0, i);
        wa.e7.e(parcel, 64, this.f11163y0);
        wa.e7.a(parcel, 65, this.f11165z0);
        wa.e7.l(parcel, k3);
    }
}
