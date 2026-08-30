package com.google.android.gms.internal.ads;
import ga.a;
import l9.a;
import wa.e7;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class dv extends a {
    public static final Parcelable.Creator<dv> CREATOR = new bj(13);
    public final String A;
    public final String B;
    public qq0 C;
    public String D;
    public final boolean E;
    public final boolean F;
    public final Bundle G;

    /* renamed from: u, reason: collision with root package name */
    public final Bundle f5526u;

    /* renamed from: v, reason: collision with root package name */
    public final a f5527v;

    /* renamed from: w, reason: collision with root package name */
    public final ApplicationInfo f5528w;

    /* renamed from: x, reason: collision with root package name */
    public final String f5529x;

    /* renamed from: y, reason: collision with root package name */
    public final List f5530y;

    /* renamed from: z, reason: collision with root package name */
    public final PackageInfo f5531z;

    public dv(Bundle bundle, a aVar, ApplicationInfo applicationInfo, String str, ArrayList arrayList, PackageInfo packageInfo, String str2, String str3, qq0 qq0Var, String str4, boolean z3, boolean z9, Bundle bundle2) {
        this.f5526u = bundle;
        this.f5527v = aVar;
        this.f5529x = str;
        this.f5528w = applicationInfo;
        this.f5530y = arrayList;
        this.f5531z = packageInfo;
        this.A = str2;
        this.B = str3;
        this.C = qq0Var;
        this.D = str4;
        this.E = z3;
        this.F = z9;
        this.G = bundle2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int k3 = e7.k(parcel, 20293);
        e7.a(parcel, 1, this.f5526u);
        e7.d(parcel, 2, this.f5527v, i);
        e7.d(parcel, 3, this.f5528w, i);
        e7.e(parcel, 4, this.f5529x);
        e7.g(parcel, this.f5530y, 5);
        e7.d(parcel, 6, this.f5531z, i);
        e7.e(parcel, 7, this.A);
        e7.e(parcel, 9, this.B);
        e7.d(parcel, 10, this.C, i);
        e7.e(parcel, 11, this.D);
        e7.j(parcel, 12, 4);
        parcel.writeInt(this.E ? 1 : 0);
        e7.j(parcel, 13, 4);
        parcel.writeInt(this.F ? 1 : 0);
        e7.a(parcel, 14, this.G);
        e7.l(parcel, k3);
    }
}
