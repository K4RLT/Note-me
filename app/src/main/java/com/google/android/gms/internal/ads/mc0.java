package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.Collections;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class mc0 extends ph implements xo {

    /* renamed from: u, reason: collision with root package name */
    public final String f8319u;

    /* renamed from: v, reason: collision with root package name */
    public final na0 f8320v;

    /* renamed from: w, reason: collision with root package name */
    public final ra0 f8321w;

    /* renamed from: x, reason: collision with root package name */
    public final be0 f8322x;

    public mc0(String str, na0 na0Var, ra0 ra0Var, be0 be0Var) {
        super("com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd");
        this.f8319u = str;
        this.f8320v = na0Var;
        this.f8321w = ra0Var;
        this.f8322x = be0Var;
    }

    @Override // com.google.android.gms.internal.ads.xo
    public final void U2(Bundle bundle) {
        if (((Boolean) g9.r.e.f17698c.a(sl.Ce)).booleanValue()) {
            na0 na0Var = this.f8320v;
            h00 h3 = na0Var.f8615m.h();
            if (h3 == null) {
                int i = k9.a0.f19634b;
                l9.i.c("Video webview is null");
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject();
                for (String str : bundle.keySet()) {
                    jSONObject.put(str, bundle.get(str));
                }
                na0Var.f8614l.execute(new ac.a(h3, 15, jSONObject));
            } catch (JSONException e) {
                int i10 = k9.a0.f19634b;
                l9.i.d("Error reading event signals", e);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.xo
    public final String a() {
        return this.f8321w.a();
    }

    @Override // com.google.android.gms.internal.ads.xo
    public final List b() {
        List list;
        ra0 ra0Var = this.f8321w;
        synchronized (ra0Var) {
            list = ra0Var.e;
        }
        return list;
    }

    @Override // com.google.android.gms.internal.ads.xo
    public final zn d() {
        zn znVar;
        ra0 ra0Var = this.f8321w;
        synchronized (ra0Var) {
            znVar = ra0Var.f10181s;
        }
        return znVar;
    }

    @Override // com.google.android.gms.internal.ads.xo
    public final String e() {
        return this.f8321w.c();
    }

    @Override // com.google.android.gms.internal.ads.xo
    public final String f() {
        return this.f8321w.f();
    }

    @Override // com.google.android.gms.internal.ads.xo
    public final String g() {
        return this.f8321w.e();
    }

    @Override // com.google.android.gms.internal.ads.xo
    public final String h() {
        String p10;
        ra0 ra0Var = this.f8321w;
        synchronized (ra0Var) {
            p10 = ra0Var.p("store");
        }
        return p10;
    }

    @Override // com.google.android.gms.internal.ads.xo
    public final double i() {
        double d2;
        ra0 ra0Var = this.f8321w;
        synchronized (ra0Var) {
            d2 = ra0Var.f10180r;
        }
        return d2;
    }

    @Override // com.google.android.gms.internal.ads.xo
    public final un j() {
        return this.f8321w.s();
    }

    @Override // com.google.android.gms.internal.ads.xo
    public final g9.v1 l0() {
        if (!((Boolean) g9.r.e.f17698c.a(sl.F7)).booleanValue()) {
            return null;
        }
        return this.f8320v.f13071f;
    }

    @Override // com.google.android.gms.internal.ads.xo
    public final String m() {
        String p10;
        ra0 ra0Var = this.f8321w;
        synchronized (ra0Var) {
            p10 = ra0Var.p("price");
        }
        return p10;
    }

    @Override // com.google.android.gms.internal.ads.xo
    public final g9.z1 n() {
        return this.f8321w.r();
    }

    @Override // com.google.android.gms.internal.ads.xo
    public final List s() {
        List list;
        g9.k2 k2Var;
        List list2;
        ra0 ra0Var = this.f8321w;
        synchronized (ra0Var) {
            list = ra0Var.f10169f;
        }
        if (!list.isEmpty()) {
            synchronized (ra0Var) {
                k2Var = ra0Var.f10170g;
            }
            if (k2Var != null) {
                ra0 ra0Var2 = this.f8321w;
                synchronized (ra0Var2) {
                    list2 = ra0Var2.f10169f;
                }
                return list2;
            }
        }
        return Collections.EMPTY_LIST;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [com.google.android.gms.internal.ads.oh] */
    /* JADX WARN: Type inference failed for: r2v8, types: [com.google.android.gms.internal.ads.oh] */
    @Override // com.google.android.gms.internal.ads.ph
    public final boolean u4(int i, Parcel parcel, Parcel parcel2) {
        List list;
        zn znVar;
        double d2;
        String p10;
        String p11;
        oa.a aVar;
        List list2;
        g9.k2 k2Var;
        xn xnVar;
        boolean d10;
        long j10;
        c60 c60Var;
        c60 c60Var2;
        int i10 = 0;
        vo voVar = null;
        g9.i1 i1Var = null;
        switch (i) {
            case 2:
                String a10 = this.f8321w.a();
                parcel2.writeNoException();
                parcel2.writeString(a10);
                return true;
            case 3:
                ra0 ra0Var = this.f8321w;
                synchronized (ra0Var) {
                    list = ra0Var.e;
                }
                parcel2.writeNoException();
                parcel2.writeList(list);
                return true;
            case 4:
                String c10 = this.f8321w.c();
                parcel2.writeNoException();
                parcel2.writeString(c10);
                return true;
            case 5:
                ra0 ra0Var2 = this.f8321w;
                synchronized (ra0Var2) {
                    znVar = ra0Var2.f10181s;
                }
                parcel2.writeNoException();
                qh.e(parcel2, znVar);
                return true;
            case 6:
                String e = this.f8321w.e();
                parcel2.writeNoException();
                parcel2.writeString(e);
                return true;
            case 7:
                String f10 = this.f8321w.f();
                parcel2.writeNoException();
                parcel2.writeString(f10);
                return true;
            case 8:
                ra0 ra0Var3 = this.f8321w;
                synchronized (ra0Var3) {
                    d2 = ra0Var3.f10180r;
                }
                parcel2.writeNoException();
                parcel2.writeDouble(d2);
                return true;
            case 9:
                ra0 ra0Var4 = this.f8321w;
                synchronized (ra0Var4) {
                    p10 = ra0Var4.p("store");
                }
                parcel2.writeNoException();
                parcel2.writeString(p10);
                return true;
            case 10:
                ra0 ra0Var5 = this.f8321w;
                synchronized (ra0Var5) {
                    p11 = ra0Var5.p("price");
                }
                parcel2.writeNoException();
                parcel2.writeString(p11);
                return true;
            case 11:
                g9.z1 r8 = this.f8321w.r();
                parcel2.writeNoException();
                qh.e(parcel2, r8);
                return true;
            case 12:
                String str = this.f8319u;
                parcel2.writeNoException();
                parcel2.writeString(str);
                return true;
            case 13:
                this.f8320v.o();
                parcel2.writeNoException();
                return true;
            case 14:
                un s10 = this.f8321w.s();
                parcel2.writeNoException();
                qh.e(parcel2, s10);
                return true;
            case 15:
                Bundle bundle = (Bundle) qh.b(parcel, Bundle.CREATOR);
                qh.f(parcel);
                na0 na0Var = this.f8320v;
                synchronized (na0Var) {
                    na0Var.f8616n.g(bundle);
                }
                parcel2.writeNoException();
                return true;
            case 16:
                Bundle bundle2 = (Bundle) qh.b(parcel, Bundle.CREATOR);
                qh.f(parcel);
                boolean p12 = this.f8320v.p(bundle2);
                parcel2.writeNoException();
                parcel2.writeInt(p12 ? 1 : 0);
                return true;
            case 17:
                Bundle bundle3 = (Bundle) qh.b(parcel, Bundle.CREATOR);
                qh.f(parcel);
                na0 na0Var2 = this.f8320v;
                synchronized (na0Var2) {
                    na0Var2.f8616n.p(bundle3);
                }
                parcel2.writeNoException();
                return true;
            case 18:
                oa.a x9 = x();
                parcel2.writeNoException();
                qh.e(parcel2, x9);
                return true;
            case 19:
                ra0 ra0Var6 = this.f8321w;
                synchronized (ra0Var6) {
                    aVar = ra0Var6.f10179q;
                }
                parcel2.writeNoException();
                qh.e(parcel2, aVar);
                return true;
            case 20:
                Bundle d11 = this.f8321w.d();
                parcel2.writeNoException();
                qh.d(parcel2, d11);
                return true;
            case gl.zzm /* 21 */:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IUnconfirmedClickListener");
                    if (queryLocalInterface instanceof vo) {
                        voVar = (vo) queryLocalInterface;
                    } else {
                        voVar = new oh(readStrongBinder, "com.google.android.gms.ads.internal.formats.client.IUnconfirmedClickListener", 0);
                    }
                }
                qh.f(parcel);
                x4(voVar);
                parcel2.writeNoException();
                return true;
            case 22:
                na0 na0Var3 = this.f8320v;
                synchronized (na0Var3) {
                    na0Var3.f8616n.j();
                }
                parcel2.writeNoException();
                return true;
            case 23:
                List s11 = s();
                parcel2.writeNoException();
                parcel2.writeList(s11);
                return true;
            case 24:
                ra0 ra0Var7 = this.f8321w;
                synchronized (ra0Var7) {
                    list2 = ra0Var7.f10169f;
                }
                if (!list2.isEmpty()) {
                    synchronized (ra0Var7) {
                        k2Var = ra0Var7.f10170g;
                    }
                    if (k2Var != null) {
                        i10 = 1;
                    }
                }
                parcel2.writeNoException();
                ClassLoader classLoader = qh.f9846a;
                parcel2.writeInt(i10);
                return true;
            case 25:
                g9.k1 v4 = g9.k2.v4(parcel.readStrongBinder());
                qh.f(parcel);
                v4(v4);
                parcel2.writeNoException();
                return true;
            case 26:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.IMuteThisAdListener");
                    if (queryLocalInterface2 instanceof g9.i1) {
                        i1Var = (g9.i1) queryLocalInterface2;
                    } else {
                        i1Var = new oh(readStrongBinder2, "com.google.android.gms.ads.internal.client.IMuteThisAdListener", 0);
                    }
                }
                qh.f(parcel);
                w4(i1Var);
                parcel2.writeNoException();
                return true;
            case 27:
                na0 na0Var4 = this.f8320v;
                synchronized (na0Var4) {
                    na0Var4.f8616n.e();
                }
                parcel2.writeNoException();
                return true;
            case 28:
                na0 na0Var5 = this.f8320v;
                synchronized (na0Var5) {
                    ph phVar = na0Var5.f8625w;
                    if (phVar == null) {
                        int i11 = k9.a0.f19634b;
                        l9.i.a("Ad should be associated with an ad view before calling recordCustomClickGesture()");
                    } else {
                        na0Var5.f8614l.execute(new lt(1, na0Var5, phVar instanceof ya0));
                    }
                }
                parcel2.writeNoException();
                return true;
            case 29:
                pa0 pa0Var = this.f8320v.F;
                synchronized (pa0Var) {
                    xnVar = pa0Var.f9451a;
                }
                parcel2.writeNoException();
                qh.e(parcel2, xnVar);
                return true;
            case 30:
                na0 na0Var6 = this.f8320v;
                synchronized (na0Var6) {
                    d10 = na0Var6.f8616n.d();
                }
                parcel2.writeNoException();
                ClassLoader classLoader2 = qh.f9846a;
                parcel2.writeInt(d10 ? 1 : 0);
                return true;
            case 31:
                g9.v1 l0 = l0();
                parcel2.writeNoException();
                qh.e(parcel2, l0);
                return true;
            case 32:
                g9.q1 v42 = g9.s2.v4(parcel.readStrongBinder());
                qh.f(parcel);
                try {
                    if (!v42.b()) {
                        this.f8322x.b();
                    }
                } catch (RemoteException e8) {
                    int i12 = k9.a0.f19634b;
                    l9.i.b("Error in making CSI ping for reporting paid event callback", e8);
                }
                na0 na0Var7 = this.f8320v;
                synchronized (na0Var7) {
                    na0Var7.G.f13180u.set(v42);
                }
                parcel2.writeNoException();
                return true;
            case 33:
                Bundle bundle4 = (Bundle) qh.b(parcel, Bundle.CREATOR);
                qh.f(parcel);
                U2(bundle4);
                parcel2.writeNoException();
                return true;
            case 34:
                na0 na0Var8 = this.f8320v;
                if (na0Var8 != null && (c60Var = na0Var8.f13074j) != null) {
                    j10 = c60Var.f5014a.get();
                } else {
                    j10 = 0;
                }
                parcel2.writeNoException();
                parcel2.writeLong(j10);
                return true;
            case 35:
                long readLong = parcel.readLong();
                qh.f(parcel);
                na0 na0Var9 = this.f8320v;
                if (na0Var9 != null && (c60Var2 = na0Var9.f13074j) != null) {
                    c60Var2.a(readLong);
                }
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }

    public final void v4(g9.k1 k1Var) {
        na0 na0Var = this.f8320v;
        synchronized (na0Var) {
            na0Var.f8616n.q(k1Var);
        }
    }

    public final void w4(g9.i1 i1Var) {
        na0 na0Var = this.f8320v;
        synchronized (na0Var) {
            na0Var.f8616n.c(i1Var);
        }
    }

    @Override // com.google.android.gms.internal.ads.xo
    public final oa.a x() {
        return new oa.b(this.f8320v);
    }

    public final void x4(vo voVar) {
        na0 na0Var = this.f8320v;
        synchronized (na0Var) {
            na0Var.f8616n.h(voVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.xo
    public final oa.a z() {
        oa.a aVar;
        ra0 ra0Var = this.f8321w;
        synchronized (ra0Var) {
            aVar = ra0Var.f10179q;
        }
        return aVar;
    }
}
