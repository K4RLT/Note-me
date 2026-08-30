package com.google.android.gms.internal.ads;
import f9.d;
import oa.a;
import oa.b;

import android.os.Parcel;
import android.view.View;

/* loaded from: classes.dex */
public final class xl extends ph {

    /* renamed from: u, reason: collision with root package name */
    public final d f12583u;

    /* renamed from: v, reason: collision with root package name */
    public final String f12584v;

    /* renamed from: w, reason: collision with root package name */
    public final String f12585w;

    public xl(d dVar, String str, String str2) {
        super("com.google.android.gms.ads.internal.customrenderedad.client.ICustomRenderedAd");
        this.f12583u = dVar;
        this.f12584v = str;
        this.f12585w = str2;
    }

    @Override // com.google.android.gms.internal.ads.ph
    public final boolean u4(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            if (i != 2) {
                d dVar = this.f12583u;
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            return false;
                        }
                        dVar.c();
                        parcel2.writeNoException();
                        return true;
                    }
                    dVar.zzb();
                    parcel2.writeNoException();
                    return true;
                }
                a v12 = b.v1(parcel.readStrongBinder());
                qh.f(parcel);
                if (v12 != null) {
                    dVar.x((View) b.z1(v12));
                }
                parcel2.writeNoException();
                return true;
            }
            parcel2.writeNoException();
            parcel2.writeString(this.f12585w);
            return true;
        }
        parcel2.writeNoException();
        parcel2.writeString(this.f12584v);
        return true;
    }
}
