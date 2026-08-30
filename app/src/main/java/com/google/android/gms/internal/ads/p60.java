package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.List;

/* loaded from: classes.dex */
public final class p60 extends ph implements g9.v1 {
    public final String A;
    public final ii0 B;
    public final Bundle C;
    public final double D;
    public final int E;

    /* renamed from: u, reason: collision with root package name */
    public final String f9412u;

    /* renamed from: v, reason: collision with root package name */
    public final String f9413v;

    /* renamed from: w, reason: collision with root package name */
    public final String f9414w;

    /* renamed from: x, reason: collision with root package name */
    public final String f9415x;

    /* renamed from: y, reason: collision with root package name */
    public final List f9416y;

    /* renamed from: z, reason: collision with root package name */
    public final long f9417z;

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00ef, code lost:
    
        if (android.text.TextUtils.isEmpty(r3) != false) goto L53;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public p60(com.google.android.gms.internal.ads.qp0 r3, java.lang.String r4, com.google.android.gms.internal.ads.ii0 r5, com.google.android.gms.internal.ads.sp0 r6, java.lang.String r7) {
        /*
            Method dump skipped, instructions count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.p60.<init>(com.google.android.gms.internal.ads.qp0, java.lang.String, com.google.android.gms.internal.ads.ii0, com.google.android.gms.internal.ads.sp0, java.lang.String):void");
    }

    public static g9.v1 v4(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IResponseInfo");
        if (queryLocalInterface instanceof g9.v1) {
            return (g9.v1) queryLocalInterface;
        }
        return new g9.u1(iBinder);
    }

    @Override // g9.v1
    public final String a() {
        return this.f9412u;
    }

    @Override // g9.v1
    public final String b() {
        return this.f9413v;
    }

    @Override // g9.v1
    public final g9.e3 d() {
        ii0 ii0Var = this.B;
        if (ii0Var != null) {
            return ii0Var.f7147f;
        }
        return null;
    }

    @Override // g9.v1
    public final List e() {
        return this.f9416y;
    }

    @Override // g9.v1
    public final String f() {
        return this.f9414w;
    }

    @Override // g9.v1
    public final Bundle g() {
        return this.C;
    }

    @Override // com.google.android.gms.internal.ads.ph
    public final boolean u4(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 1:
                parcel2.writeNoException();
                parcel2.writeString(this.f9412u);
                return true;
            case 2:
                parcel2.writeNoException();
                parcel2.writeString(this.f9413v);
                return true;
            case 3:
                parcel2.writeNoException();
                parcel2.writeTypedList(this.f9416y);
                return true;
            case 4:
                g9.e3 d2 = d();
                parcel2.writeNoException();
                qh.d(parcel2, d2);
                return true;
            case 5:
                parcel2.writeNoException();
                qh.d(parcel2, this.C);
                return true;
            case 6:
                parcel2.writeNoException();
                parcel2.writeString(this.f9414w);
                return true;
            default:
                return false;
        }
    }
}
