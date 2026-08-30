package com.google.android.gms.internal.ads;
import e7.a;
import e7.e;
import e7.j;
import e7.k;
import e7.l;
import k9.a0;
import l9.i;
import wa.e7;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* loaded from: classes.dex */
public final class dj extends ga.a {
    public static final Parcelable.Creator<dj> CREATOR = new bj(1);
    public final boolean A;
    public long B;
    public String C;
    public int D;

    /* renamed from: u, reason: collision with root package name */
    public final String f5436u;

    /* renamed from: v, reason: collision with root package name */
    public final long f5437v;

    /* renamed from: w, reason: collision with root package name */
    public final String f5438w;

    /* renamed from: x, reason: collision with root package name */
    public final String f5439x;

    /* renamed from: y, reason: collision with root package name */
    public final String f5440y;

    /* renamed from: z, reason: collision with root package name */
    public final Bundle f5441z;

    public dj(String str, long j10, String str2, String str3, String str4, Bundle bundle, boolean z3, long j11, String str5, int i) {
        this.f5436u = str;
        this.f5437v = j10;
        this.f5438w = str2 == null ? "" : str2;
        this.f5439x = str3 == null ? "" : str3;
        this.f5440y = str4 == null ? "" : str4;
        this.f5441z = bundle == null ? new Bundle() : bundle;
        this.A = z3;
        this.B = j11;
        this.C = str5;
        this.D = i;
    }

    public static dj a(Uri uri) {
        long parseLong;
        try {
            if (!"gcache".equals(uri.getScheme())) {
                return null;
            }
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments.size() != 2) {
                int size = pathSegments.size();
                StringBuilder sb2 = new StringBuilder(String.valueOf(size).length() + 51);
                sb2.append("Expected 2 path parts for namespace and id, found :");
                sb2.append(size);
                String sb3 = sb2.toString();
                int i = k9.a0.f19634b;
                l9.i.f(sb3);
                return null;
            }
            String str = pathSegments.get(0);
            String str2 = pathSegments.get(1);
            String host = uri.getHost();
            String queryParameter = uri.getQueryParameter("url");
            boolean equals = "1".equals(uri.getQueryParameter("read_only"));
            String queryParameter2 = uri.getQueryParameter("expiration");
            if (queryParameter2 == null) {
                parseLong = 0;
            } else {
                parseLong = Long.parseLong(queryParameter2);
            }
            long j10 = parseLong;
            Bundle bundle = new Bundle();
            for (String str3 : uri.getQueryParameterNames()) {
                if (str3.startsWith("tag.")) {
                    bundle.putString(str3.substring(4), uri.getQueryParameter(str3));
                }
            }
            return new dj(queryParameter, j10, host, str, str2, bundle, equals, 0L, "", 0);
        } catch (NullPointerException e) {
            e = e;
            int i10 = k9.a0.f19634b;
            l9.i.g("Unable to parse Uri into cache offering.", e);
            return null;
        } catch (NumberFormatException e8) {
            e = e8;
            int i102 = k9.a0.f19634b;
            l9.i.g("Unable to parse Uri into cache offering.", e);
            return null;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int k3 = wa.e7.k(parcel, 20293);
        wa.e7.e(parcel, 2, this.f5436u);
        wa.e7.j(parcel, 3, 8);
        parcel.writeLong(this.f5437v);
        wa.e7.e(parcel, 4, this.f5438w);
        wa.e7.e(parcel, 5, this.f5439x);
        wa.e7.e(parcel, 6, this.f5440y);
        wa.e7.a(parcel, 7, this.f5441z);
        wa.e7.j(parcel, 8, 4);
        parcel.writeInt(this.A ? 1 : 0);
        long j10 = this.B;
        wa.e7.j(parcel, 9, 8);
        parcel.writeLong(j10);
        wa.e7.e(parcel, 10, this.C);
        int i10 = this.D;
        wa.e7.j(parcel, 11, 4);
        parcel.writeInt(i10);
        wa.e7.l(parcel, k3);
    }
}
