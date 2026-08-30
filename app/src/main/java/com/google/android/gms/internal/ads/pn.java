package com.google.android.gms.internal.ads;
import oa.a;
import oa.b;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class pn extends ph implements zn {

    /* renamed from: u, reason: collision with root package name */
    public final Drawable f9559u;

    /* renamed from: v, reason: collision with root package name */
    public final Uri f9560v;

    /* renamed from: w, reason: collision with root package name */
    public final double f9561w;

    /* renamed from: x, reason: collision with root package name */
    public final int f9562x;

    /* renamed from: y, reason: collision with root package name */
    public final int f9563y;

    /* renamed from: z, reason: collision with root package name */
    public final Map f9564z;

    public pn(Drawable drawable, Uri uri, double d2, int i, int i10, HashMap hashMap) {
        super("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
        this.f9559u = drawable;
        this.f9560v = uri;
        this.f9561w = d2;
        this.f9562x = i;
        this.f9563y = i10;
        this.f9564z = hashMap;
    }

    public static zn v4(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
        if (queryLocalInterface instanceof zn) {
            return (zn) queryLocalInterface;
        }
        return new yn(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zn
    public final int a() {
        return this.f9563y;
    }

    @Override // com.google.android.gms.internal.ads.zn
    public final Map b() {
        return this.f9564z;
    }

    @Override // com.google.android.gms.internal.ads.zn
    public final double c() {
        return this.f9561w;
    }

    @Override // com.google.android.gms.internal.ads.zn
    public final int k() {
        return this.f9562x;
    }

    @Override // com.google.android.gms.internal.ads.ph
    public final boolean u4(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 1:
                oa.a zza = zza();
                parcel2.writeNoException();
                qh.e(parcel2, zza);
                return true;
            case 2:
                parcel2.writeNoException();
                qh.d(parcel2, this.f9560v);
                return true;
            case 3:
                parcel2.writeNoException();
                parcel2.writeDouble(this.f9561w);
                return true;
            case 4:
                parcel2.writeNoException();
                parcel2.writeInt(this.f9562x);
                return true;
            case 5:
                parcel2.writeNoException();
                parcel2.writeInt(this.f9563y);
                return true;
            case 6:
                parcel2.writeNoException();
                parcel2.writeMap(this.f9564z);
                return true;
            default:
                return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zn
    public final oa.a zza() {
        return new oa.b(this.f9559u);
    }

    @Override // com.google.android.gms.internal.ads.zn
    public final Uri zzb() {
        return this.f9560v;
    }
}
