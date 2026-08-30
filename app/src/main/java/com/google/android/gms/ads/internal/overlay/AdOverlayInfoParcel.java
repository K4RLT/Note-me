package com.google.android.gms.ads.internal.overlay;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.internal.ads.dp;
import com.google.android.gms.internal.ads.ep;
import com.google.android.gms.internal.ads.f90;
import com.google.android.gms.internal.ads.h00;
import com.google.android.gms.internal.ads.k00;
import com.google.android.gms.internal.ads.p90;
import com.google.android.gms.internal.ads.q00;
import com.google.android.gms.internal.ads.qf0;
import com.google.android.gms.internal.ads.sl;
import com.google.android.gms.internal.ads.tt;
import com.google.android.gms.internal.ads.wh0;
import com.google.android.gms.internal.ads.xx;
import com.google.android.gms.internal.ads.y60;
import f9.f;
import g5.q;
import g9.r;
import ga.a;
import i9.b;
import j9.c;
import j9.e;
import j9.k;
import j9.l;
import j9.m;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import wa.da;
import wa.e7;

/* loaded from: classes.dex */
public final class AdOverlayInfoParcel extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<AdOverlayInfoParcel> CREATOR = new b(5);
    public static final AtomicLong S = new AtomicLong(0);
    public static final ConcurrentHashMap T = new ConcurrentHashMap();
    public final boolean A;
    public final String B;
    public final c C;
    public final int D;
    public final int E;
    public final String F;
    public final l9.a G;
    public final String H;
    public final f I;
    public final dp J;
    public final String K;
    public final String L;
    public final String M;
    public final y60 N;
    public final f90 O;
    public final tt P;
    public final boolean Q;
    public final long R;

    /* renamed from: u, reason: collision with root package name */
    public final e f4263u;

    /* renamed from: v, reason: collision with root package name */
    public final g9.a f4264v;

    /* renamed from: w, reason: collision with root package name */
    public final m f4265w;

    /* renamed from: x, reason: collision with root package name */
    public final h00 f4266x;

    /* renamed from: y, reason: collision with root package name */
    public final ep f4267y;

    /* renamed from: z, reason: collision with root package name */
    public final String f4268z;

    public AdOverlayInfoParcel(e eVar, IBinder iBinder, IBinder iBinder2, IBinder iBinder3, IBinder iBinder4, String str, boolean z3, String str2, IBinder iBinder5, int i, int i10, String str3, l9.a aVar, String str4, f fVar, IBinder iBinder6, String str5, String str6, String str7, IBinder iBinder7, IBinder iBinder8, IBinder iBinder9, boolean z9, long j10) {
        this.f4263u = eVar;
        this.f4268z = str;
        this.A = z3;
        this.B = str2;
        this.D = i;
        this.E = i10;
        this.F = str3;
        this.G = aVar;
        this.H = str4;
        this.I = fVar;
        this.K = str5;
        this.L = str6;
        this.M = str7;
        this.Q = z9;
        this.R = j10;
        if (((Boolean) r.e.f17698c.a(sl.f11052ze)).booleanValue()) {
            k kVar = (k) T.remove(Long.valueOf(j10));
            if (kVar != null) {
                this.f4264v = kVar.f19081a;
                this.f4265w = kVar.f19082b;
                this.f4266x = kVar.f19083c;
                this.J = kVar.f19084d;
                this.f4267y = kVar.e;
                this.N = kVar.f19086g;
                this.O = kVar.f19087h;
                this.P = kVar.i;
                this.C = kVar.f19085f;
                kVar.f19088j.cancel(false);
                return;
            }
            q.h("AdOverlayObjects is null");
            throw null;
        }
        this.f4264v = (g9.a) oa.b.z1(oa.b.v1(iBinder));
        this.f4265w = (m) oa.b.z1(oa.b.v1(iBinder2));
        this.f4266x = (h00) oa.b.z1(oa.b.v1(iBinder3));
        this.J = (dp) oa.b.z1(oa.b.v1(iBinder6));
        this.f4267y = (ep) oa.b.z1(oa.b.v1(iBinder4));
        this.C = (c) oa.b.z1(oa.b.v1(iBinder5));
        this.N = (y60) oa.b.z1(oa.b.v1(iBinder7));
        this.O = (f90) oa.b.z1(oa.b.v1(iBinder8));
        this.P = (tt) oa.b.z1(oa.b.v1(iBinder9));
    }

    public static AdOverlayInfoParcel a(Intent intent) {
        try {
            Bundle bundleExtra = intent.getBundleExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
            bundleExtra.setClassLoader(AdOverlayInfoParcel.class.getClassLoader());
            return (AdOverlayInfoParcel) da.a(bundleExtra, "com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", AdOverlayInfoParcel.class);
        } catch (Exception e) {
            if (((Boolean) r.e.f17698c.a(sl.f11052ze)).booleanValue()) {
                f9.k.C.f16817h.d("AdOverlayInfoParcel.getFromIntent", e);
                return null;
            }
            return null;
        }
    }

    public static final oa.b b(Object obj) {
        if (((Boolean) r.e.f17698c.a(sl.f11052ze)).booleanValue()) {
            return null;
        }
        return new oa.b(obj);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int k3 = e7.k(parcel, 20293);
        e7.d(parcel, 2, this.f4263u, i);
        g9.a aVar = this.f4264v;
        e7.c(parcel, 3, b(aVar));
        m mVar = this.f4265w;
        e7.c(parcel, 4, b(mVar));
        h00 h00Var = this.f4266x;
        e7.c(parcel, 5, b(h00Var));
        ep epVar = this.f4267y;
        e7.c(parcel, 6, b(epVar));
        e7.e(parcel, 7, this.f4268z);
        e7.j(parcel, 8, 4);
        parcel.writeInt(this.A ? 1 : 0);
        e7.e(parcel, 9, this.B);
        c cVar = this.C;
        e7.c(parcel, 10, b(cVar));
        e7.j(parcel, 11, 4);
        parcel.writeInt(this.D);
        e7.j(parcel, 12, 4);
        parcel.writeInt(this.E);
        e7.e(parcel, 13, this.F);
        e7.d(parcel, 14, this.G, i);
        e7.e(parcel, 16, this.H);
        e7.d(parcel, 17, this.I, i);
        dp dpVar = this.J;
        e7.c(parcel, 18, b(dpVar));
        e7.e(parcel, 19, this.K);
        e7.e(parcel, 24, this.L);
        e7.e(parcel, 25, this.M);
        y60 y60Var = this.N;
        e7.c(parcel, 26, b(y60Var));
        f90 f90Var = this.O;
        e7.c(parcel, 27, b(f90Var));
        tt ttVar = this.P;
        e7.c(parcel, 28, b(ttVar));
        e7.j(parcel, 29, 4);
        parcel.writeInt(this.Q ? 1 : 0);
        e7.j(parcel, 30, 8);
        long j10 = this.R;
        parcel.writeLong(j10);
        e7.l(parcel, k3);
        if (((Boolean) r.e.f17698c.a(sl.f11052ze)).booleanValue()) {
            T.put(Long.valueOf(j10), new k(aVar, mVar, h00Var, dpVar, epVar, cVar, y60Var, f90Var, ttVar, xx.f12654d.schedule(new l(j10), ((Integer) r2.f17698c.a(sl.Be)).intValue(), TimeUnit.SECONDS)));
        }
    }

    public AdOverlayInfoParcel(p90 p90Var, h00 h00Var, int i, l9.a aVar, String str, f fVar, String str2, String str3, String str4, y60 y60Var, wh0 wh0Var, String str5) {
        this.f4263u = null;
        this.f4264v = null;
        this.f4265w = p90Var;
        this.f4266x = h00Var;
        this.J = null;
        this.f4267y = null;
        this.A = false;
        if (((Boolean) r.e.f17698c.a(sl.f10883p1)).booleanValue()) {
            this.f4268z = null;
            this.B = null;
        } else {
            this.f4268z = str2;
            this.B = str3;
        }
        this.C = null;
        this.D = i;
        this.E = 1;
        this.F = null;
        this.G = aVar;
        this.H = str;
        this.I = fVar;
        this.K = str5;
        this.L = null;
        this.M = str4;
        this.N = y60Var;
        this.O = null;
        this.P = wh0Var;
        this.Q = false;
        this.R = S.getAndIncrement();
    }

    public AdOverlayInfoParcel(qf0 qf0Var, h00 h00Var, l9.a aVar) {
        this.f4265w = qf0Var;
        this.f4266x = h00Var;
        this.D = 1;
        this.G = aVar;
        this.f4263u = null;
        this.f4264v = null;
        this.J = null;
        this.f4267y = null;
        this.f4268z = null;
        this.A = false;
        this.B = null;
        this.C = null;
        this.E = 1;
        this.F = null;
        this.H = null;
        this.I = null;
        this.K = null;
        this.L = null;
        this.M = null;
        this.N = null;
        this.O = null;
        this.P = null;
        this.Q = false;
        this.R = S.getAndIncrement();
    }

    public AdOverlayInfoParcel(g9.a aVar, k00 k00Var, dp dpVar, ep epVar, c cVar, q00 q00Var, boolean z3, int i, String str, String str2, l9.a aVar2, f90 f90Var, wh0 wh0Var) {
        this.f4263u = null;
        this.f4264v = aVar;
        this.f4265w = k00Var;
        this.f4266x = q00Var;
        this.J = dpVar;
        this.f4267y = epVar;
        this.f4268z = str2;
        this.A = z3;
        this.B = str;
        this.C = cVar;
        this.D = i;
        this.E = 3;
        this.F = null;
        this.G = aVar2;
        this.H = null;
        this.I = null;
        this.K = null;
        this.L = null;
        this.M = null;
        this.N = null;
        this.O = f90Var;
        this.P = wh0Var;
        this.Q = false;
        this.R = S.getAndIncrement();
    }

    public AdOverlayInfoParcel(g9.a aVar, k00 k00Var, dp dpVar, ep epVar, c cVar, q00 q00Var, boolean z3, int i, String str, l9.a aVar2, f90 f90Var, wh0 wh0Var, boolean z9) {
        this.f4263u = null;
        this.f4264v = aVar;
        this.f4265w = k00Var;
        this.f4266x = q00Var;
        this.J = dpVar;
        this.f4267y = epVar;
        this.f4268z = null;
        this.A = z3;
        this.B = null;
        this.C = cVar;
        this.D = i;
        this.E = 3;
        this.F = str;
        this.G = aVar2;
        this.H = null;
        this.I = null;
        this.K = null;
        this.L = null;
        this.M = null;
        this.N = null;
        this.O = f90Var;
        this.P = wh0Var;
        this.Q = z9;
        this.R = S.getAndIncrement();
    }

    public AdOverlayInfoParcel(g9.a aVar, m mVar, c cVar, q00 q00Var, boolean z3, int i, l9.a aVar2, f90 f90Var, wh0 wh0Var) {
        this.f4263u = null;
        this.f4264v = aVar;
        this.f4265w = mVar;
        this.f4266x = q00Var;
        this.J = null;
        this.f4267y = null;
        this.f4268z = null;
        this.A = z3;
        this.B = null;
        this.C = cVar;
        this.D = i;
        this.E = 2;
        this.F = null;
        this.G = aVar2;
        this.H = null;
        this.I = null;
        this.K = null;
        this.L = null;
        this.M = null;
        this.N = null;
        this.O = f90Var;
        this.P = wh0Var;
        this.Q = false;
        this.R = S.getAndIncrement();
    }

    public AdOverlayInfoParcel(q00 q00Var, l9.a aVar, String str, String str2, tt ttVar) {
        this.f4263u = null;
        this.f4264v = null;
        this.f4265w = null;
        this.f4266x = q00Var;
        this.J = null;
        this.f4267y = null;
        this.f4268z = null;
        this.A = false;
        this.B = null;
        this.C = null;
        this.D = 14;
        this.E = 5;
        this.F = null;
        this.G = aVar;
        this.H = null;
        this.I = null;
        this.K = str;
        this.L = str2;
        this.M = null;
        this.N = null;
        this.O = null;
        this.P = ttVar;
        this.Q = false;
        this.R = S.getAndIncrement();
    }

    public AdOverlayInfoParcel(e eVar, g9.a aVar, m mVar, c cVar, l9.a aVar2, q00 q00Var, f90 f90Var, String str) {
        this.f4263u = eVar;
        this.f4264v = aVar;
        this.f4265w = mVar;
        this.f4266x = q00Var;
        this.J = null;
        this.f4267y = null;
        this.f4268z = null;
        this.A = false;
        this.B = null;
        this.C = cVar;
        this.D = -1;
        this.E = 4;
        this.F = null;
        this.G = aVar2;
        this.H = null;
        this.I = null;
        this.K = str;
        this.L = null;
        this.M = null;
        this.N = null;
        this.O = f90Var;
        this.P = null;
        this.Q = false;
        this.R = S.getAndIncrement();
    }
}
