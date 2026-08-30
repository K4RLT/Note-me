package com.google.android.gms.internal.ads;
import g9.c3;
import g9.p;
import g9.r;
import g9.y1;
import g9.z1;
import g9.z2;
import i8.c;
import j6.e;
import j6.l;
import j6.s;
import j8.b;
import j8.f;
import l9.d;
import l9.i;
import n9.h;
import n9.j;
import n9.m;
import n9.o;
import n9.u;
import n9.w;
import n9.y;
import oa.a;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class dt extends ph implements zs {

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ int f5488z = 0;

    /* renamed from: u, reason: collision with root package name */
    public final RtbAdapter f5489u;

    /* renamed from: v, reason: collision with root package name */
    public n9.p f5490v;

    /* renamed from: w, reason: collision with root package name */
    public n9.w f5491w;

    /* renamed from: x, reason: collision with root package name */
    public n9.h f5492x;

    /* renamed from: y, reason: collision with root package name */
    public String f5493y;

    public dt(RtbAdapter rtbAdapter) {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
        this.f5493y = "";
        this.f5489u = rtbAdapter;
    }

    public static final Bundle w4(String str) {
        l9.i.f("Server parameters: ".concat(String.valueOf(str)));
        try {
            Bundle bundle = new Bundle();
            if (str != null) {
                JSONObject jSONObject = new JSONObject(str);
                Bundle bundle2 = new Bundle();
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    bundle2.putString(next, jSONObject.getString(next));
                }
                return bundle2;
            }
            return bundle;
        } catch (JSONException e) {
            l9.i.d("", e);
            androidx.datastore.preferences.protobuf.s1.b();
            return null;
        }
    }

    public static final boolean x4(g9.z2 z2Var) {
        if (!z2Var.f17726z) {
            l9.d dVar = g9.p.f17688g.f17689a;
            if (!l9.d.q()) {
                return false;
            }
            return true;
        }
        return true;
    }

    public static final String y4(g9.z2 z2Var, String str) {
        String str2 = z2Var.O;
        try {
            return new JSONObject(str).getString("max_ad_content_rating");
        } catch (JSONException unused) {
            return str2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [n9.d, n9.y] */
    @Override // com.google.android.gms.internal.ads.zs
    public final void C0(String str, String str2, g9.z2 z2Var, oa.a aVar, xs xsVar, as asVar) {
        try {
            try {
                zd1 zd1Var = new zd1(this, xsVar, asVar, 8, false);
                RtbAdapter rtbAdapter = this.f5489u;
                Context context = (Context) oa.b.z1(aVar);
                Bundle w42 = w4(str2);
                v4(z2Var);
                x4(z2Var);
                int i = z2Var.A;
                int i10 = z2Var.N;
                y4(z2Var, str2);
                rtbAdapter.loadRtbRewardedInterstitialAd(new n9.d(context, str, w42, i, i10, this.f5493y), zd1Var);
            } catch (Throwable th) {
                th = th;
                Throwable th2 = th;
                l9.i.d("Adapter failed to render rewarded interstitial ad.", th2);
                xy.w(aVar, th2, "adapter.loadRtbRewardedInterstitialAd");
                androidx.datastore.preferences.protobuf.s1.b();
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [n9.d, n9.y] */
    @Override // com.google.android.gms.internal.ads.zs
    public final void F2(String str, String str2, g9.z2 z2Var, oa.a aVar, xs xsVar, as asVar) {
        try {
            try {
                zd1 zd1Var = new zd1(this, xsVar, asVar, 8, false);
                RtbAdapter rtbAdapter = this.f5489u;
                Context context = (Context) oa.b.z1(aVar);
                Bundle w42 = w4(str2);
                v4(z2Var);
                x4(z2Var);
                int i = z2Var.A;
                int i10 = z2Var.N;
                y4(z2Var, str2);
                rtbAdapter.loadRtbRewardedAd(new n9.d(context, str, w42, i, i10, this.f5493y), zd1Var);
            } catch (Throwable th) {
                th = th;
                Throwable th2 = th;
                l9.i.d("Adapter failed to render rewarded ad.", th2);
                xy.w(aVar, th2, "adapter.loadRtbRewardedAd");
                androidx.datastore.preferences.protobuf.s1.b();
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    @Override // com.google.android.gms.internal.ads.zs
    public final boolean H3(oa.a aVar) {
        n9.p pVar = this.f5490v;
        if (pVar != null) {
            try {
                ((j8.b) pVar).a((Context) oa.b.z1(aVar));
                return true;
            } catch (Throwable th) {
                l9.i.d("", th);
                xy.w(aVar, th, "adapter.showRtbInterstitialAd");
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0035, code lost:
    
        if (((java.lang.Boolean) g9.r.e.f17698c.a(com.google.android.gms.internal.ads.sl.f10861nd)).booleanValue() != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0040, code lost:
    
        if (r5.equals("app_open") != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0049, code lost:
    
        if (r5.equals("interstitial") != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0052, code lost:
    
        if (r5.equals("rewarded") != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005b, code lost:
    
        if (r5.equals("native") != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0064, code lost:
    
        if (r5.equals("banner") != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001a, code lost:
    
        if (r5.equals("rewarded_interstitial") != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0066, code lost:
    
        new java.util.ArrayList().add(new n9.o(r7));
        r7 = (android.content.Context) oa.b.z1(r4);
        new z8.h(r8.f17589u, r8.f17593y, r8.f17590v);
        r9.collectSignals(new p9.a(r7), r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x008a, code lost:
    
        return;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x000f. Please report as an issue. */
    @Override // com.google.android.gms.internal.ads.zs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void N0(oa.a r4, java.lang.String r5, android.os.Bundle r6, android.os.Bundle r7, g9.c3 r8, com.google.android.gms.internal.ads.bt r9) {
        /*
            r3 = this;
            com.google.android.gms.internal.ads.tf r6 = new com.google.android.gms.internal.ads.tf     // Catch: java.lang.Throwable -> L38
            r0 = 12
            r6.<init>(r3, r0, r9)     // Catch: java.lang.Throwable -> L38
            com.google.android.gms.ads.mediation.rtb.RtbAdapter r9 = r3.f5489u     // Catch: java.lang.Throwable -> L38
            n9.o r0 = new n9.o     // Catch: java.lang.Throwable -> L38
            int r1 = r5.hashCode()     // Catch: java.lang.Throwable -> L38
            switch(r1) {
                case -1396342996: goto L5e;
                case -1052618729: goto L55;
                case -239580146: goto L4c;
                case 604727084: goto L43;
                case 1167692200: goto L3a;
                case 1778294298: goto L1d;
                case 1911491517: goto L14;
                default: goto L12;
            }
        L12:
            goto L8b
        L14:
            java.lang.String r1 = "rewarded_interstitial"
            boolean r5 = r5.equals(r1)
            if (r5 == 0) goto L8b
            goto L66
        L1d:
            java.lang.String r1 = "app_open_ad"
            boolean r5 = r5.equals(r1)
            if (r5 == 0) goto L8b
            com.google.android.gms.internal.ads.nl r5 = com.google.android.gms.internal.ads.sl.f10861nd     // Catch: java.lang.Throwable -> L38
            g9.r r1 = g9.r.e     // Catch: java.lang.Throwable -> L38
            com.google.android.gms.internal.ads.ql r1 = r1.f17698c     // Catch: java.lang.Throwable -> L38
            java.lang.Object r5 = r1.a(r5)     // Catch: java.lang.Throwable -> L38
            java.lang.Boolean r5 = (java.lang.Boolean) r5     // Catch: java.lang.Throwable -> L38
            boolean r5 = r5.booleanValue()     // Catch: java.lang.Throwable -> L38
            if (r5 == 0) goto L8b
            goto L66
        L38:
            r5 = move-exception
            goto L93
        L3a:
            java.lang.String r1 = "app_open"
            boolean r5 = r5.equals(r1)
            if (r5 == 0) goto L8b
            goto L66
        L43:
            java.lang.String r1 = "interstitial"
            boolean r5 = r5.equals(r1)
            if (r5 == 0) goto L8b
            goto L66
        L4c:
            java.lang.String r1 = "rewarded"
            boolean r5 = r5.equals(r1)
            if (r5 == 0) goto L8b
            goto L66
        L55:
            java.lang.String r1 = "native"
            boolean r5 = r5.equals(r1)
            if (r5 == 0) goto L8b
            goto L66
        L5e:
            java.lang.String r1 = "banner"
            boolean r5 = r5.equals(r1)
            if (r5 == 0) goto L8b
        L66:
            r0.<init>(r7)     // Catch: java.lang.Throwable -> L38
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L38
            r5.<init>()     // Catch: java.lang.Throwable -> L38
            r5.add(r0)     // Catch: java.lang.Throwable -> L38
            p9.a r5 = new p9.a     // Catch: java.lang.Throwable -> L38
            java.lang.Object r7 = oa.b.z1(r4)     // Catch: java.lang.Throwable -> L38
            android.content.Context r7 = (android.content.Context) r7     // Catch: java.lang.Throwable -> L38
            int r0 = r8.f17593y     // Catch: java.lang.Throwable -> L38
            int r1 = r8.f17590v     // Catch: java.lang.Throwable -> L38
            java.lang.String r8 = r8.f17589u     // Catch: java.lang.Throwable -> L38
            z8.h r2 = new z8.h     // Catch: java.lang.Throwable -> L38
            r2.<init>(r8, r0, r1)     // Catch: java.lang.Throwable -> L38
            r5.<init>(r7)     // Catch: java.lang.Throwable -> L38
            r9.collectSignals(r5, r6)     // Catch: java.lang.Throwable -> L38
            return
        L8b:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L38
            java.lang.String r6 = "Internal Error"
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L38
            throw r5     // Catch: java.lang.Throwable -> L38
        L93:
            java.lang.String r6 = "Error generating signals for RTB"
            l9.i.d(r6, r5)
            java.lang.String r6 = "adapter.collectSignals"
            com.google.android.gms.internal.ads.xy.w(r4, r5, r6)
            androidx.datastore.preferences.protobuf.s1.b()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.dt.N0(oa.a, java.lang.String, android.os.Bundle, android.os.Bundle, g9.c3, com.google.android.gms.internal.ads.bt):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [n9.d, n9.r] */
    @Override // com.google.android.gms.internal.ads.zs
    public final void Q2(String str, String str2, g9.z2 z2Var, oa.a aVar, ts tsVar, as asVar) {
        try {
            try {
                zd1 zd1Var = new zd1(this, tsVar, asVar, 7, false);
                RtbAdapter rtbAdapter = this.f5489u;
                Context context = (Context) oa.b.z1(aVar);
                Bundle w42 = w4(str2);
                v4(z2Var);
                x4(z2Var);
                int i = z2Var.A;
                int i10 = z2Var.N;
                y4(z2Var, str2);
                rtbAdapter.loadRtbInterstitialAd(new n9.d(context, str, w42, i, i10, this.f5493y), zd1Var);
            } catch (Throwable th) {
                th = th;
                Throwable th2 = th;
                l9.i.d("Adapter failed to render interstitial ad.", th2);
                xy.w(aVar, th2, "adapter.loadRtbInterstitialAd");
                androidx.datastore.preferences.protobuf.s1.b();
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    @Override // com.google.android.gms.internal.ads.zs
    public final void U0(String str, String str2, g9.z2 z2Var, oa.a aVar, rs rsVar, as asVar, g9.c3 c3Var) {
        try {
            j6.e eVar = new j6.e(this, rsVar, asVar);
            RtbAdapter rtbAdapter = this.f5489u;
            Context context = (Context) oa.b.z1(aVar);
            Bundle w42 = w4(str2);
            v4(z2Var);
            x4(z2Var);
            int i = z2Var.A;
            int i10 = z2Var.N;
            y4(z2Var, str2);
            rtbAdapter.loadRtbBannerAd(new n9.m(context, str, w42, i, i10, new z8.h(c3Var.f17589u, c3Var.f17593y, c3Var.f17590v), this.f5493y), eVar);
        } catch (Throwable th) {
            l9.i.d("Adapter failed to render banner ad.", th);
            xy.w(aVar, th, "adapter.loadRtbBannerAd");
            androidx.datastore.preferences.protobuf.s1.b();
        }
    }

    @Override // com.google.android.gms.internal.ads.zs
    public final boolean Y(oa.a aVar) {
        n9.w wVar = this.f5491w;
        if (wVar != null) {
            try {
                ((i8.c) wVar).c((Context) oa.b.z1(aVar));
                return true;
            } catch (Throwable th) {
                l9.i.d("", th);
                xy.w(aVar, th, "adapter.showRtbRewardedAd");
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zs
    public final void Z2(String str) {
        this.f5493y = str;
    }

    @Override // com.google.android.gms.internal.ads.zs
    public final ft b() {
        z8.r versionInfo = this.f5489u.getVersionInfo();
        return new ft(versionInfo.f32000a, versionInfo.f32001b, versionInfo.f32002c);
    }

    @Override // com.google.android.gms.internal.ads.zs
    public final g9.z1 d() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zs
    public final ft e() {
        z8.r sDKVersionInfo = this.f5489u.getSDKVersionInfo();
        return new ft(sDKVersionInfo.f32000a, sDKVersionInfo.f32001b, sDKVersionInfo.f32002c);
    }

    @Override // com.google.android.gms.internal.ads.zs
    public final void j4(String str, String str2, g9.z2 z2Var, oa.b bVar, hj0 hj0Var, as asVar) {
        p4(str, str2, z2Var, bVar, hj0Var, asVar, null);
    }

    @Override // com.google.android.gms.internal.ads.zs
    public final void m2(String str, String str2, g9.z2 z2Var, oa.a aVar, rs rsVar, as asVar, g9.c3 c3Var) {
        try {
            RtbAdapter rtbAdapter = this.f5489u;
            w4(str2);
            v4(z2Var);
            x4(z2Var);
            y4(z2Var, str2);
            new z8.h(c3Var.f17589u, c3Var.f17593y, c3Var.f17590v);
            try {
                rsVar.r(new g9.y1(7, rtbAdapter.getClass().getSimpleName().concat(" does not support interscroller ads."), "com.google.android.gms.ads", null, null));
            } catch (RemoteException e) {
                l9.i.d("", e);
            }
        } catch (Throwable th) {
            l9.i.d("Adapter failed to render interscroller ad.", th);
            xy.w(aVar, th, "adapter.loadRtbInterscrollerAd");
            androidx.datastore.preferences.protobuf.s1.b();
        }
    }

    @Override // com.google.android.gms.internal.ads.zs
    public final boolean n0(oa.a aVar) {
        n9.h hVar = this.f5492x;
        if (hVar != null) {
            try {
                ((j8.f) hVar).a((Context) oa.b.z1(aVar));
                return true;
            } catch (Throwable th) {
                l9.i.d("", th);
                xy.w(aVar, th, "adapter.showRtbAppOpenAd");
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zs
    public final void p4(String str, String str2, g9.z2 z2Var, oa.a aVar, vs vsVar, as asVar, rn rnVar) {
        RtbAdapter rtbAdapter = this.f5489u;
        try {
            j6.l lVar = new j6.l(this, vsVar, asVar);
            Context context = (Context) oa.b.z1(aVar);
            Bundle w42 = w4(str2);
            v4(z2Var);
            x4(z2Var);
            int i = z2Var.A;
            int i10 = z2Var.N;
            y4(z2Var, str2);
            rtbAdapter.loadRtbNativeAdMapper(new n9.u(context, str, w42, i, i10, this.f5493y, rnVar), lVar);
        } catch (Throwable th) {
            l9.i.d("Adapter failed to render native ad.", th);
            xy.w(aVar, th, "adapter.loadRtbNativeAdMapper");
            String message = th.getMessage();
            if (!TextUtils.isEmpty(message) && message.equals("Method is not found")) {
                try {
                    j6.s sVar = new j6.s(this, vsVar, asVar);
                    Context context2 = (Context) oa.b.z1(aVar);
                    Bundle w43 = w4(str2);
                    v4(z2Var);
                    x4(z2Var);
                    int i11 = z2Var.A;
                    int i12 = z2Var.N;
                    y4(z2Var, str2);
                    rtbAdapter.loadRtbNativeAd(new n9.u(context2, str, w43, i11, i12, this.f5493y, rnVar), sVar);
                    return;
                } catch (Throwable th2) {
                    l9.i.d("Adapter failed to render native ad.", th2);
                    xy.w(aVar, th2, "adapter.loadRtbNativeAd");
                    androidx.datastore.preferences.protobuf.s1.b();
                    return;
                }
            }
            androidx.datastore.preferences.protobuf.s1.b();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [n9.d, n9.j] */
    @Override // com.google.android.gms.internal.ads.zs
    public final void q3(String str, String str2, g9.z2 z2Var, oa.a aVar, ps psVar, as asVar) {
        try {
            hq0 hq0Var = new hq0(8, this, psVar, asVar);
            RtbAdapter rtbAdapter = this.f5489u;
            Context context = (Context) oa.b.z1(aVar);
            Bundle w42 = w4(str2);
            v4(z2Var);
            x4(z2Var);
            int i = z2Var.A;
            int i10 = z2Var.N;
            y4(z2Var, str2);
            rtbAdapter.loadRtbAppOpenAd(new n9.d(context, str, w42, i, i10, this.f5493y), hq0Var);
        } catch (Throwable th) {
            l9.i.d("Adapter failed to render app open ad.", th);
            xy.w(aVar, th, "adapter.loadRtbAppOpenAd");
            androidx.datastore.preferences.protobuf.s1.b();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [com.google.android.gms.internal.ads.oh] */
    /* JADX WARN: Type inference failed for: r10v3, types: [com.google.android.gms.internal.ads.oh] */
    /* JADX WARN: Type inference failed for: r10v7, types: [com.google.android.gms.internal.ads.oh] */
    @Override // com.google.android.gms.internal.ads.ph
    public final boolean u4(int i, Parcel parcel, Parcel parcel2) {
        bt btVar = null;
        ps psVar = null;
        vs vsVar = null;
        rs qsVar = null;
        xs xsVar = null;
        vs vsVar2 = null;
        xs xsVar2 = null;
        ts tsVar = null;
        rs qsVar2 = null;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 5) {
                        if (i != 10) {
                            if (i != 11) {
                                switch (i) {
                                    case 13:
                                        String readString = parcel.readString();
                                        String readString2 = parcel.readString();
                                        g9.z2 z2Var = (g9.z2) qh.b(parcel, g9.z2.CREATOR);
                                        oa.a v12 = oa.b.v1(parcel.readStrongBinder());
                                        IBinder readStrongBinder = parcel.readStrongBinder();
                                        if (readStrongBinder != null) {
                                            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
                                            if (queryLocalInterface instanceof rs) {
                                                qsVar2 = (rs) queryLocalInterface;
                                            } else {
                                                qsVar2 = new qs(readStrongBinder);
                                            }
                                        }
                                        rs rsVar = qsVar2;
                                        as v4 = zr.v4(parcel.readStrongBinder());
                                        g9.c3 c3Var = (g9.c3) qh.b(parcel, g9.c3.CREATOR);
                                        qh.f(parcel);
                                        U0(readString, readString2, z2Var, v12, rsVar, v4, c3Var);
                                        parcel2.writeNoException();
                                        return true;
                                    case 14:
                                        String readString3 = parcel.readString();
                                        String readString4 = parcel.readString();
                                        g9.z2 z2Var2 = (g9.z2) qh.b(parcel, g9.z2.CREATOR);
                                        oa.a v13 = oa.b.v1(parcel.readStrongBinder());
                                        IBinder readStrongBinder2 = parcel.readStrongBinder();
                                        if (readStrongBinder2 != null) {
                                            IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IInterstitialCallback");
                                            if (queryLocalInterface2 instanceof ts) {
                                                tsVar = (ts) queryLocalInterface2;
                                            } else {
                                                tsVar = new oh(readStrongBinder2, "com.google.android.gms.ads.internal.mediation.client.rtb.IInterstitialCallback", 0);
                                            }
                                        }
                                        as v42 = zr.v4(parcel.readStrongBinder());
                                        qh.f(parcel);
                                        Q2(readString3, readString4, z2Var2, v13, tsVar, v42);
                                        parcel2.writeNoException();
                                        return true;
                                    case 15:
                                        oa.a v14 = oa.b.v1(parcel.readStrongBinder());
                                        qh.f(parcel);
                                        boolean H3 = H3(v14);
                                        parcel2.writeNoException();
                                        parcel2.writeInt(H3 ? 1 : 0);
                                        return true;
                                    case 16:
                                        String readString5 = parcel.readString();
                                        String readString6 = parcel.readString();
                                        g9.z2 z2Var3 = (g9.z2) qh.b(parcel, g9.z2.CREATOR);
                                        oa.a v15 = oa.b.v1(parcel.readStrongBinder());
                                        IBinder readStrongBinder3 = parcel.readStrongBinder();
                                        if (readStrongBinder3 != null) {
                                            IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback");
                                            if (queryLocalInterface3 instanceof xs) {
                                                xsVar2 = (xs) queryLocalInterface3;
                                            } else {
                                                xsVar2 = new ws(readStrongBinder3);
                                            }
                                        }
                                        as v43 = zr.v4(parcel.readStrongBinder());
                                        qh.f(parcel);
                                        F2(readString5, readString6, z2Var3, v15, xsVar2, v43);
                                        parcel2.writeNoException();
                                        return true;
                                    case 17:
                                        oa.a v16 = oa.b.v1(parcel.readStrongBinder());
                                        qh.f(parcel);
                                        boolean Y = Y(v16);
                                        parcel2.writeNoException();
                                        parcel2.writeInt(Y ? 1 : 0);
                                        return true;
                                    case 18:
                                        String readString7 = parcel.readString();
                                        String readString8 = parcel.readString();
                                        g9.z2 z2Var4 = (g9.z2) qh.b(parcel, g9.z2.CREATOR);
                                        oa.a v17 = oa.b.v1(parcel.readStrongBinder());
                                        IBinder readStrongBinder4 = parcel.readStrongBinder();
                                        if (readStrongBinder4 != null) {
                                            IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
                                            if (queryLocalInterface4 instanceof vs) {
                                                vsVar2 = (vs) queryLocalInterface4;
                                            } else {
                                                vsVar2 = new us(readStrongBinder4);
                                            }
                                        }
                                        as v44 = zr.v4(parcel.readStrongBinder());
                                        qh.f(parcel);
                                        p4(readString7, readString8, z2Var4, v17, vsVar2, v44, null);
                                        parcel2.writeNoException();
                                        return true;
                                    case 19:
                                        String readString9 = parcel.readString();
                                        qh.f(parcel);
                                        this.f5493y = readString9;
                                        parcel2.writeNoException();
                                        return true;
                                    case 20:
                                        String readString10 = parcel.readString();
                                        String readString11 = parcel.readString();
                                        g9.z2 z2Var5 = (g9.z2) qh.b(parcel, g9.z2.CREATOR);
                                        oa.a v18 = oa.b.v1(parcel.readStrongBinder());
                                        IBinder readStrongBinder5 = parcel.readStrongBinder();
                                        if (readStrongBinder5 != null) {
                                            IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback");
                                            if (queryLocalInterface5 instanceof xs) {
                                                xsVar = (xs) queryLocalInterface5;
                                            } else {
                                                xsVar = new ws(readStrongBinder5);
                                            }
                                        }
                                        as v45 = zr.v4(parcel.readStrongBinder());
                                        qh.f(parcel);
                                        C0(readString10, readString11, z2Var5, v18, xsVar, v45);
                                        parcel2.writeNoException();
                                        return true;
                                    case gl.zzm /* 21 */:
                                        String readString12 = parcel.readString();
                                        String readString13 = parcel.readString();
                                        g9.z2 z2Var6 = (g9.z2) qh.b(parcel, g9.z2.CREATOR);
                                        oa.a v19 = oa.b.v1(parcel.readStrongBinder());
                                        IBinder readStrongBinder6 = parcel.readStrongBinder();
                                        if (readStrongBinder6 != null) {
                                            IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
                                            if (queryLocalInterface6 instanceof rs) {
                                                qsVar = (rs) queryLocalInterface6;
                                            } else {
                                                qsVar = new qs(readStrongBinder6);
                                            }
                                        }
                                        rs rsVar2 = qsVar;
                                        as v46 = zr.v4(parcel.readStrongBinder());
                                        g9.c3 c3Var2 = (g9.c3) qh.b(parcel, g9.c3.CREATOR);
                                        qh.f(parcel);
                                        m2(readString12, readString13, z2Var6, v19, rsVar2, v46, c3Var2);
                                        parcel2.writeNoException();
                                        return true;
                                    case 22:
                                        String readString14 = parcel.readString();
                                        String readString15 = parcel.readString();
                                        g9.z2 z2Var7 = (g9.z2) qh.b(parcel, g9.z2.CREATOR);
                                        oa.a v110 = oa.b.v1(parcel.readStrongBinder());
                                        IBinder readStrongBinder7 = parcel.readStrongBinder();
                                        if (readStrongBinder7 != null) {
                                            IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
                                            if (queryLocalInterface7 instanceof vs) {
                                                vsVar = (vs) queryLocalInterface7;
                                            } else {
                                                vsVar = new us(readStrongBinder7);
                                            }
                                        }
                                        as v47 = zr.v4(parcel.readStrongBinder());
                                        rn rnVar = (rn) qh.b(parcel, rn.CREATOR);
                                        qh.f(parcel);
                                        p4(readString14, readString15, z2Var7, v110, vsVar, v47, rnVar);
                                        parcel2.writeNoException();
                                        return true;
                                    case 23:
                                        String readString16 = parcel.readString();
                                        String readString17 = parcel.readString();
                                        g9.z2 z2Var8 = (g9.z2) qh.b(parcel, g9.z2.CREATOR);
                                        oa.a v111 = oa.b.v1(parcel.readStrongBinder());
                                        IBinder readStrongBinder8 = parcel.readStrongBinder();
                                        if (readStrongBinder8 != null) {
                                            IInterface queryLocalInterface8 = readStrongBinder8.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IAppOpenCallback");
                                            if (queryLocalInterface8 instanceof ps) {
                                                psVar = (ps) queryLocalInterface8;
                                            } else {
                                                psVar = new oh(readStrongBinder8, "com.google.android.gms.ads.internal.mediation.client.rtb.IAppOpenCallback", 0);
                                            }
                                        }
                                        as v48 = zr.v4(parcel.readStrongBinder());
                                        qh.f(parcel);
                                        q3(readString16, readString17, z2Var8, v111, psVar, v48);
                                        parcel2.writeNoException();
                                        return true;
                                    case 24:
                                        oa.a v112 = oa.b.v1(parcel.readStrongBinder());
                                        qh.f(parcel);
                                        boolean n02 = n0(v112);
                                        parcel2.writeNoException();
                                        parcel2.writeInt(n02 ? 1 : 0);
                                        return true;
                                    default:
                                        return false;
                                }
                            }
                            parcel.createStringArray();
                            qh.f(parcel);
                            parcel2.writeNoException();
                            return true;
                        }
                        oa.b.v1(parcel.readStrongBinder());
                        qh.f(parcel);
                        parcel2.writeNoException();
                        return true;
                    }
                    g9.z1 d2 = d();
                    parcel2.writeNoException();
                    qh.e(parcel2, d2);
                    return true;
                }
                ft e = e();
                parcel2.writeNoException();
                qh.d(parcel2, e);
                return true;
            }
            ft b10 = b();
            parcel2.writeNoException();
            qh.d(parcel2, b10);
            return true;
        }
        oa.a v113 = oa.b.v1(parcel.readStrongBinder());
        String readString18 = parcel.readString();
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle = (Bundle) qh.b(parcel, creator);
        Bundle bundle2 = (Bundle) qh.b(parcel, creator);
        g9.c3 c3Var3 = (g9.c3) qh.b(parcel, g9.c3.CREATOR);
        IBinder readStrongBinder9 = parcel.readStrongBinder();
        if (readStrongBinder9 != null) {
            IInterface queryLocalInterface9 = readStrongBinder9.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.ISignalsCallback");
            if (queryLocalInterface9 instanceof bt) {
                btVar = (bt) queryLocalInterface9;
            } else {
                btVar = new oh(readStrongBinder9, "com.google.android.gms.ads.internal.mediation.client.rtb.ISignalsCallback", 0);
            }
        }
        qh.f(parcel);
        N0(v113, readString18, bundle, bundle2, c3Var3, btVar);
        parcel2.writeNoException();
        return true;
    }

    public final Bundle v4(g9.z2 z2Var) {
        Bundle bundle;
        Bundle bundle2 = z2Var.G;
        if (bundle2 != null && (bundle = bundle2.getBundle(this.f5489u.getClass().getName())) != null) {
            return bundle;
        }
        return new Bundle();
    }
}
