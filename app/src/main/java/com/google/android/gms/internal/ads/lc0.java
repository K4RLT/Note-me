package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Parcel;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class lc0 extends ph implements ko {

    /* renamed from: u, reason: collision with root package name */
    public final Context f8007u;

    /* renamed from: v, reason: collision with root package name */
    public final ra0 f8008v;

    /* renamed from: w, reason: collision with root package name */
    public ab0 f8009w;

    /* renamed from: x, reason: collision with root package name */
    public na0 f8010x;

    public lc0(Context context, ra0 ra0Var, ab0 ab0Var, na0 na0Var) {
        super("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
        this.f8007u = context;
        this.f8008v = ra0Var;
        this.f8009w = ab0Var;
        this.f8010x = na0Var;
    }

    @Override // com.google.android.gms.internal.ads.ko
    public final oa.a b0() {
        return new oa.b(this.f8007u);
    }

    @Override // com.google.android.gms.internal.ads.ko
    public final String d() {
        return this.f8008v.g();
    }

    @Override // com.google.android.gms.internal.ads.ko
    public final boolean h2(oa.a aVar) {
        ab0 ab0Var;
        Object z12 = oa.b.z1(aVar);
        if ((z12 instanceof ViewGroup) && (ab0Var = this.f8009w) != null && ab0Var.c((ViewGroup) z12, true)) {
            this.f8008v.h().b1(new lx0(23, this));
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.ko
    public final boolean n0(oa.a aVar) {
        ab0 ab0Var;
        Object z12 = oa.b.z1(aVar);
        if (!(z12 instanceof ViewGroup) || (ab0Var = this.f8009w) == null || !ab0Var.c((ViewGroup) z12, false)) {
            return false;
        }
        this.f8008v.i().b1(new lx0(23, this));
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v26, types: [java.util.Map, n.r0] */
    @Override // com.google.android.gms.internal.ads.ph
    public final boolean u4(int i, Parcel parcel, Parcel parcel2) {
        xn xnVar;
        String str;
        List<String> arrayList;
        n.r0 r0Var;
        n.r0 r0Var2;
        n.r0 r0Var3;
        n.r0 r0Var4;
        na0 na0Var;
        xn xnVar2 = null;
        int i10 = 0;
        switch (i) {
            case 1:
                String readString = parcel.readString();
                qh.f(parcel);
                ra0 ra0Var = this.f8008v;
                synchronized (ra0Var) {
                    r0Var3 = ra0Var.f10185w;
                }
                String str2 = (String) r0Var3.get(readString);
                parcel2.writeNoException();
                parcel2.writeString(str2);
                return true;
            case 2:
                String readString2 = parcel.readString();
                qh.f(parcel);
                ra0 ra0Var2 = this.f8008v;
                synchronized (ra0Var2) {
                    r0Var4 = ra0Var2.f10184v;
                }
                zn znVar = (zn) r0Var4.get(readString2);
                parcel2.writeNoException();
                qh.e(parcel2, znVar);
                return true;
            case 3:
                try {
                    ra0 ra0Var3 = this.f8008v;
                    synchronized (ra0Var3) {
                        r0Var = ra0Var3.f10184v;
                    }
                    synchronized (ra0Var3) {
                        r0Var2 = ra0Var3.f10185w;
                    }
                    String[] strArr = new String[r0Var.f20934w + r0Var2.f20934w];
                    int i11 = 0;
                    for (int i12 = 0; i12 < r0Var.f20934w; i12++) {
                        strArr[i11] = (String) r0Var.g(i12);
                        i11++;
                    }
                    while (i10 < r0Var2.f20934w) {
                        strArr[i11] = (String) r0Var2.g(i10);
                        i11++;
                        i10++;
                    }
                    arrayList = Arrays.asList(strArr);
                } catch (NullPointerException e) {
                    f9.k.C.f16817h.d("InternalNativeCustomTemplateAdShim.getAvailableAssetNames", e);
                    arrayList = new ArrayList<>();
                }
                parcel2.writeNoException();
                parcel2.writeStringList(arrayList);
                return true;
            case 4:
                String g8 = this.f8008v.g();
                parcel2.writeNoException();
                parcel2.writeString(g8);
                return true;
            case 5:
                String readString3 = parcel.readString();
                qh.f(parcel);
                na0 na0Var2 = this.f8010x;
                if (na0Var2 != null) {
                    synchronized (na0Var2) {
                        na0Var2.f8616n.H(readString3);
                    }
                }
                parcel2.writeNoException();
                return true;
            case 6:
                na0 na0Var3 = this.f8010x;
                if (na0Var3 != null) {
                    synchronized (na0Var3) {
                        if (!na0Var3.f8627y) {
                            na0Var3.f8616n.n();
                        }
                    }
                }
                parcel2.writeNoException();
                return true;
            case 7:
                g9.z1 r8 = this.f8008v.r();
                parcel2.writeNoException();
                qh.e(parcel2, r8);
                return true;
            case 8:
                na0 na0Var4 = this.f8010x;
                if (na0Var4 != null) {
                    na0Var4.o();
                }
                this.f8010x = null;
                this.f8009w = null;
                parcel2.writeNoException();
                return true;
            case 9:
                oa.a b02 = b0();
                parcel2.writeNoException();
                qh.e(parcel2, b02);
                return true;
            case 10:
                oa.a v12 = oa.b.v1(parcel.readStrongBinder());
                qh.f(parcel);
                boolean h22 = h2(v12);
                parcel2.writeNoException();
                parcel2.writeInt(h22 ? 1 : 0);
                return true;
            case 11:
                parcel2.writeNoException();
                ClassLoader classLoader = qh.f9846a;
                parcel2.writeStrongBinder(null);
                return true;
            case 12:
                na0 na0Var5 = this.f8010x;
                if (na0Var5 == null || na0Var5.f8618p.c()) {
                    ra0 ra0Var4 = this.f8008v;
                    if (ra0Var4.j() != null && ra0Var4.h() == null) {
                        i10 = 1;
                    }
                }
                parcel2.writeNoException();
                ClassLoader classLoader2 = qh.f9846a;
                parcel2.writeInt(i10);
                return true;
            case 13:
                ra0 ra0Var5 = this.f8008v;
                bi0 k3 = ra0Var5.k();
                if (k3 != null) {
                    v80 v80Var = f9.k.C.f16832x;
                    tt0 tt0Var = k3.f4801a;
                    v80Var.getClass();
                    v80.g(tt0Var);
                    if (ra0Var5.j() != null) {
                        ra0Var5.j().b("onSdkLoaded", new n.r0(0));
                    }
                    i10 = 1;
                } else {
                    int i13 = k9.a0.f19634b;
                    l9.i.f("Trying to start OMID session before creation.");
                }
                parcel2.writeNoException();
                ClassLoader classLoader3 = qh.f9846a;
                parcel2.writeInt(i10);
                return true;
            case 14:
                oa.a v13 = oa.b.v1(parcel.readStrongBinder());
                qh.f(parcel);
                Object z12 = oa.b.z1(v13);
                if ((z12 instanceof View) && this.f8008v.k() != null && (na0Var = this.f8010x) != null) {
                    na0Var.f((View) z12);
                }
                parcel2.writeNoException();
                return true;
            case 15:
                try {
                    ra0 ra0Var6 = this.f8008v;
                    synchronized (ra0Var6) {
                        str = ra0Var6.f10187y;
                    }
                    if (Objects.equals(str, "Google")) {
                        int i14 = k9.a0.f19634b;
                        l9.i.f("Illegal argument specified for omid partner name.");
                    } else if (TextUtils.isEmpty(str)) {
                        int i15 = k9.a0.f19634b;
                        l9.i.f("Not starting OMID session. OM partner name has not been configured.");
                    } else {
                        na0 na0Var6 = this.f8010x;
                        if (na0Var6 != null) {
                            na0Var6.e(str, false);
                        }
                    }
                } catch (NullPointerException e8) {
                    f9.k.C.f16817h.d("InternalNativeCustomTemplateAdShim.initializeDisplayOpenMeasurement", e8);
                }
                parcel2.writeNoException();
                return true;
            case 16:
                try {
                    pa0 pa0Var = this.f8010x.F;
                    synchronized (pa0Var) {
                        xnVar = pa0Var.f9451a;
                    }
                    xnVar2 = xnVar;
                } catch (NullPointerException e10) {
                    f9.k.C.f16817h.d("InternalNativeCustomTemplateAdShim.getMediaContent", e10);
                }
                parcel2.writeNoException();
                qh.e(parcel2, xnVar2);
                return true;
            case 17:
                oa.a v14 = oa.b.v1(parcel.readStrongBinder());
                qh.f(parcel);
                boolean n02 = n0(v14);
                parcel2.writeNoException();
                parcel2.writeInt(n02 ? 1 : 0);
                return true;
            default:
                return false;
        }
    }
}
