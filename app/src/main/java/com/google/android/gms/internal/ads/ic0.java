package com.google.android.gms.internal.ads;
import g9.z1;
import oa.a;
import oa.b;

import android.os.Bundle;
import android.os.IInterface;
import android.os.Parcel;
import java.util.List;

/* loaded from: classes.dex */
public final class ic0 extends ph implements IInterface {

    /* renamed from: u, reason: collision with root package name */
    public final String f7100u;

    /* renamed from: v, reason: collision with root package name */
    public final na0 f7101v;

    /* renamed from: w, reason: collision with root package name */
    public final ra0 f7102w;

    public ic0(String str, na0 na0Var, ra0 ra0Var) {
        super("com.google.android.gms.ads.internal.formats.client.INativeAppInstallAd");
        this.f7100u = str;
        this.f7101v = na0Var;
        this.f7102w = ra0Var;
    }

    @Override // com.google.android.gms.internal.ads.ph
    public final boolean u4(int i, Parcel parcel, Parcel parcel2) {
        List list;
        zn znVar;
        double d2;
        String p10;
        String p11;
        a aVar;
        na0 na0Var = this.f7101v;
        ra0 ra0Var = this.f7102w;
        switch (i) {
            case 2:
                b bVar = new b(na0Var);
                parcel2.writeNoException();
                qh.e(parcel2, bVar);
                return true;
            case 3:
                String a10 = ra0Var.a();
                parcel2.writeNoException();
                parcel2.writeString(a10);
                return true;
            case 4:
                synchronized (ra0Var) {
                    list = ra0Var.e;
                }
                parcel2.writeNoException();
                parcel2.writeList(list);
                return true;
            case 5:
                String c10 = ra0Var.c();
                parcel2.writeNoException();
                parcel2.writeString(c10);
                return true;
            case 6:
                synchronized (ra0Var) {
                    znVar = ra0Var.f10181s;
                }
                parcel2.writeNoException();
                qh.e(parcel2, znVar);
                return true;
            case 7:
                String e = ra0Var.e();
                parcel2.writeNoException();
                parcel2.writeString(e);
                return true;
            case 8:
                synchronized (ra0Var) {
                    d2 = ra0Var.f10180r;
                }
                parcel2.writeNoException();
                parcel2.writeDouble(d2);
                return true;
            case 9:
                synchronized (ra0Var) {
                    p10 = ra0Var.p("store");
                }
                parcel2.writeNoException();
                parcel2.writeString(p10);
                return true;
            case 10:
                synchronized (ra0Var) {
                    p11 = ra0Var.p("price");
                }
                parcel2.writeNoException();
                parcel2.writeString(p11);
                return true;
            case 11:
                Bundle d10 = ra0Var.d();
                parcel2.writeNoException();
                qh.d(parcel2, d10);
                return true;
            case 12:
                na0Var.o();
                parcel2.writeNoException();
                return true;
            case 13:
                z1 r8 = ra0Var.r();
                parcel2.writeNoException();
                qh.e(parcel2, r8);
                return true;
            case 14:
                Bundle bundle = (Bundle) qh.b(parcel, Bundle.CREATOR);
                qh.f(parcel);
                synchronized (na0Var) {
                    na0Var.f8616n.g(bundle);
                }
                parcel2.writeNoException();
                return true;
            case 15:
                Bundle bundle2 = (Bundle) qh.b(parcel, Bundle.CREATOR);
                qh.f(parcel);
                boolean p12 = na0Var.p(bundle2);
                parcel2.writeNoException();
                parcel2.writeInt(p12 ? 1 : 0);
                return true;
            case 16:
                Bundle bundle3 = (Bundle) qh.b(parcel, Bundle.CREATOR);
                qh.f(parcel);
                synchronized (na0Var) {
                    na0Var.f8616n.p(bundle3);
                }
                parcel2.writeNoException();
                return true;
            case 17:
                un s10 = ra0Var.s();
                parcel2.writeNoException();
                qh.e(parcel2, s10);
                return true;
            case 18:
                synchronized (ra0Var) {
                    aVar = ra0Var.f10179q;
                }
                parcel2.writeNoException();
                qh.e(parcel2, aVar);
                return true;
            case 19:
                String str = this.f7100u;
                parcel2.writeNoException();
                parcel2.writeString(str);
                return true;
            default:
                return false;
        }
    }
}
