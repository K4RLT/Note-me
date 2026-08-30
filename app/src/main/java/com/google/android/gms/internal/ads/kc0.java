package com.google.android.gms.internal.ads;
import g9.z1;
import oa.a;
import oa.b;

import android.os.Bundle;
import android.os.IInterface;
import android.os.Parcel;
import java.util.List;

/* loaded from: classes.dex */
public final class kc0 extends ph implements IInterface {

    /* renamed from: u, reason: collision with root package name */
    public final String f7714u;

    /* renamed from: v, reason: collision with root package name */
    public final na0 f7715v;

    /* renamed from: w, reason: collision with root package name */
    public final ra0 f7716w;

    public kc0(String str, na0 na0Var, ra0 ra0Var) {
        super("com.google.android.gms.ads.internal.formats.client.INativeContentAd");
        this.f7714u = str;
        this.f7715v = na0Var;
        this.f7716w = ra0Var;
    }

    @Override // com.google.android.gms.internal.ads.ph
    public final boolean u4(int i, Parcel parcel, Parcel parcel2) {
        List list;
        zn znVar;
        a aVar;
        switch (i) {
            case 2:
                b bVar = new b(this.f7715v);
                parcel2.writeNoException();
                qh.e(parcel2, bVar);
                return true;
            case 3:
                String a10 = this.f7716w.a();
                parcel2.writeNoException();
                parcel2.writeString(a10);
                return true;
            case 4:
                ra0 ra0Var = this.f7716w;
                synchronized (ra0Var) {
                    list = ra0Var.e;
                }
                parcel2.writeNoException();
                parcel2.writeList(list);
                return true;
            case 5:
                String c10 = this.f7716w.c();
                parcel2.writeNoException();
                parcel2.writeString(c10);
                return true;
            case 6:
                ra0 ra0Var2 = this.f7716w;
                synchronized (ra0Var2) {
                    znVar = ra0Var2.f10182t;
                }
                parcel2.writeNoException();
                qh.e(parcel2, znVar);
                return true;
            case 7:
                String e = this.f7716w.e();
                parcel2.writeNoException();
                parcel2.writeString(e);
                return true;
            case 8:
                String f10 = this.f7716w.f();
                parcel2.writeNoException();
                parcel2.writeString(f10);
                return true;
            case 9:
                Bundle d2 = this.f7716w.d();
                parcel2.writeNoException();
                qh.d(parcel2, d2);
                return true;
            case 10:
                this.f7715v.o();
                parcel2.writeNoException();
                return true;
            case 11:
                z1 r8 = this.f7716w.r();
                parcel2.writeNoException();
                qh.e(parcel2, r8);
                return true;
            case 12:
                Bundle bundle = (Bundle) qh.b(parcel, Bundle.CREATOR);
                qh.f(parcel);
                na0 na0Var = this.f7715v;
                synchronized (na0Var) {
                    na0Var.f8616n.g(bundle);
                }
                parcel2.writeNoException();
                return true;
            case 13:
                Bundle bundle2 = (Bundle) qh.b(parcel, Bundle.CREATOR);
                qh.f(parcel);
                boolean p10 = this.f7715v.p(bundle2);
                parcel2.writeNoException();
                parcel2.writeInt(p10 ? 1 : 0);
                return true;
            case 14:
                Bundle bundle3 = (Bundle) qh.b(parcel, Bundle.CREATOR);
                qh.f(parcel);
                na0 na0Var2 = this.f7715v;
                synchronized (na0Var2) {
                    na0Var2.f8616n.p(bundle3);
                }
                parcel2.writeNoException();
                return true;
            case 15:
                un s10 = this.f7716w.s();
                parcel2.writeNoException();
                qh.e(parcel2, s10);
                return true;
            case 16:
                ra0 ra0Var3 = this.f7716w;
                synchronized (ra0Var3) {
                    aVar = ra0Var3.f10179q;
                }
                parcel2.writeNoException();
                qh.e(parcel2, aVar);
                return true;
            case 17:
                String str = this.f7714u;
                parcel2.writeNoException();
                parcel2.writeString(str);
                return true;
            default:
                return false;
        }
    }
}
