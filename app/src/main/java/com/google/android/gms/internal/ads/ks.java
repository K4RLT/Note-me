package com.google.android.gms.internal.ads;
import g3.a;
import g9.c3;
import g9.p;
import g9.r;
import g9.z1;
import g9.z2;
import i0.m;
import i8.c;
import j6.c;
import j8.b;
import j8.f;
import l9.d;
import l9.i;
import n9.a;
import n9.d;
import n9.g;
import n9.h;
import n9.j;
import n9.m;
import n9.o;
import n9.p;
import n9.r;
import n9.u;
import n9.w;
import n9.y;
import n9.z;
import oa.a;
import oa.b;
import r.e;
import r6.a;
import s1.b;
import z8.a;
import z8.b;
import z8.h;
import z8.r;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import android.widget.FrameLayout;
import com.google.ads.mediation.AbstractAdViewAdapter;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class ks extends ph implements xr {
    public com.google.ads.mediation.a A;
    public n9.z B;
    public n9.w C;
    public n9.h D;
    public final String E;

    /* renamed from: u, reason: collision with root package name */
    public final Object f7860u;

    /* renamed from: v, reason: collision with root package name */
    public hq0 f7861v;

    /* renamed from: w, reason: collision with root package name */
    public pv f7862w;

    /* renamed from: x, reason: collision with root package name */
    public oa.a f7863x;

    /* renamed from: y, reason: collision with root package name */
    public FrameLayout f7864y;

    /* renamed from: z, reason: collision with root package name */
    public n9.p f7865z;

    public ks(n9.a aVar) {
        this();
        this.E = "";
        this.f7860u = aVar;
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

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0054, code lost:
    
        if (((java.lang.Boolean) g9.r.e.f17698c.a(com.google.android.gms.internal.ads.sl.f10861nd)).booleanValue() != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0056, code lost:
    
        r7 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005e, code lost:
    
        if (r5.equals("app_open") != false) goto L20;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:11:0x002a. Please report as an issue. */
    @Override // com.google.android.gms.internal.ads.xr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void G0(oa.a r10, com.google.android.gms.internal.ads.gq r11, java.util.ArrayList r12) {
        /*
            r9 = this;
            java.lang.Object r0 = r9.f7860u
            boolean r1 = r0 instanceof n9.a
            if (r1 == 0) goto Laf
            com.google.android.gms.internal.ads.lx0 r1 = new com.google.android.gms.internal.ads.lx0     // Catch: java.lang.Throwable -> L39
            r2 = 11
            r1.<init>(r9, r2, r11)     // Catch: java.lang.Throwable -> L39
            java.util.ArrayList r11 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L39
            r11.<init>()     // Catch: java.lang.Throwable -> L39
            int r2 = r12.size()     // Catch: java.lang.Throwable -> L39
            r3 = 0
        L17:
            if (r3 >= r2) goto L9a
            java.lang.Object r4 = r12.get(r3)     // Catch: java.lang.Throwable -> L39
            int r3 = r3 + 1
            com.google.android.gms.internal.ads.kq r4 = (com.google.android.gms.internal.ads.kq) r4     // Catch: java.lang.Throwable -> L39
            java.lang.String r5 = r4.f7841u     // Catch: java.lang.Throwable -> L39
            int r6 = r5.hashCode()     // Catch: java.lang.Throwable -> L39
            r7 = 0
            z8.b r8 = z8.b.APP_OPEN_AD
            switch(r6) {
                case -1396342996: goto L82;
                case -1052618729: goto L77;
                case -239580146: goto L6c;
                case 604727084: goto L61;
                case 1167692200: goto L58;
                case 1778294298: goto L3c;
                case 1911491517: goto L2e;
                default: goto L2d;
            }
        L2d:
            goto L8c
        L2e:
            java.lang.String r6 = "rewarded_interstitial"
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L8c
            z8.b r7 = z8.b.REWARDED_INTERSTITIAL     // Catch: java.lang.Throwable -> L39
            goto L8c
        L39:
            r11 = move-exception
            goto La6
        L3c:
            java.lang.String r6 = "app_open_ad"
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L8c
            com.google.android.gms.internal.ads.nl r5 = com.google.android.gms.internal.ads.sl.f10861nd     // Catch: java.lang.Throwable -> L39
            g9.r r6 = g9.r.e     // Catch: java.lang.Throwable -> L39
            com.google.android.gms.internal.ads.ql r6 = r6.f17698c     // Catch: java.lang.Throwable -> L39
            java.lang.Object r5 = r6.a(r5)     // Catch: java.lang.Throwable -> L39
            java.lang.Boolean r5 = (java.lang.Boolean) r5     // Catch: java.lang.Throwable -> L39
            boolean r5 = r5.booleanValue()     // Catch: java.lang.Throwable -> L39
            if (r5 == 0) goto L8c
        L56:
            r7 = r8
            goto L8c
        L58:
            java.lang.String r6 = "app_open"
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L8c
            goto L56
        L61:
            java.lang.String r6 = "interstitial"
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L8c
            z8.b r7 = z8.b.INTERSTITIAL     // Catch: java.lang.Throwable -> L39
            goto L8c
        L6c:
            java.lang.String r6 = "rewarded"
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L8c
            z8.b r7 = z8.b.REWARDED     // Catch: java.lang.Throwable -> L39
            goto L8c
        L77:
            java.lang.String r6 = "native"
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L8c
            z8.b r7 = z8.b.NATIVE     // Catch: java.lang.Throwable -> L39
            goto L8c
        L82:
            java.lang.String r6 = "banner"
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L8c
            z8.b r7 = z8.b.BANNER     // Catch: java.lang.Throwable -> L39
        L8c:
            if (r7 == 0) goto L17
            n9.o r5 = new n9.o     // Catch: java.lang.Throwable -> L39
            android.os.Bundle r4 = r4.f7842v     // Catch: java.lang.Throwable -> L39
            r5.<init>(r4)     // Catch: java.lang.Throwable -> L39
            r11.add(r5)     // Catch: java.lang.Throwable -> L39
            goto L17
        L9a:
            n9.a r0 = (n9.a) r0     // Catch: java.lang.Throwable -> L39
            java.lang.Object r12 = oa.b.z1(r10)     // Catch: java.lang.Throwable -> L39
            android.content.Context r12 = (android.content.Context) r12     // Catch: java.lang.Throwable -> L39
            r0.initialize(r12, r1, r11)     // Catch: java.lang.Throwable -> L39
            return
        La6:
            java.lang.String r12 = "adapter.initialize"
            com.google.android.gms.internal.ads.xy.w(r10, r11, r12)
            androidx.datastore.preferences.protobuf.s1.b()
            return
        Laf:
            androidx.datastore.preferences.protobuf.s1.b()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ks.G0(oa.a, com.google.android.gms.internal.ads.gq, java.util.ArrayList):void");
    }

    @Override // com.google.android.gms.internal.ads.xr
    public final boolean I() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.xr
    public final gs J() {
        com.google.ads.mediation.a aVar;
        Object obj = this.f7860u;
        if (obj instanceof MediationNativeAdapter) {
            hq0 hq0Var = this.f7861v;
            if (hq0Var != null && (aVar = (com.google.ads.mediation.a) hq0Var.f6873w) != null) {
                return new ms(1, aVar);
            }
            return null;
        }
        if (obj instanceof n9.a) {
            n9.z zVar = this.B;
            if (zVar != null) {
                return new ms(0, zVar);
            }
            com.google.ads.mediation.a aVar2 = this.A;
            if (aVar2 != null) {
                return new ms(1, aVar2);
            }
            return null;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.xr
    public final void L0(oa.a aVar, g9.c3 c3Var, g9.z2 z2Var, String str, String str2, as asVar) {
        z8.h hVar;
        HashSet hashSet;
        Object obj = this.f7860u;
        boolean z3 = obj instanceof MediationBannerAdapter;
        if (!z3 && !(obj instanceof n9.a)) {
            String canonicalName = MediationBannerAdapter.class.getCanonicalName();
            String canonicalName2 = n9.a.class.getCanonicalName();
            String canonicalName3 = obj.getClass().getCanonicalName();
            StringBuilder sb2 = new StringBuilder(String.valueOf(canonicalName).length() + 4 + String.valueOf(canonicalName2).length() + 22 + String.valueOf(canonicalName3).length());
            g3.a.t(sb2, canonicalName, " or ", canonicalName2, " #009 Class mismatch: ");
            sb2.append(canonicalName3);
            l9.i.f(sb2.toString());
            androidx.datastore.preferences.protobuf.s1.b();
            return;
        }
        l9.i.a("Requesting banner ad from adapter.");
        boolean z9 = c3Var.H;
        int i = c3Var.f17590v;
        int i10 = c3Var.f17593y;
        if (z9) {
            z8.h hVar2 = new z8.h(i10, i);
            hVar2.f31989d = true;
            hVar2.e = i;
            hVar = hVar2;
        } else {
            hVar = new z8.h(c3Var.f17589u, i10, i);
        }
        if (z3) {
            try {
                MediationBannerAdapter mediationBannerAdapter = (MediationBannerAdapter) obj;
                List list = z2Var.f17725y;
                Bundle bundle = null;
                if (list != null) {
                    hashSet = new HashSet(list);
                } else {
                    hashSet = null;
                }
                long j10 = z2Var.f17722v;
                if (j10 != -1) {
                    new Date(j10);
                }
                boolean x42 = x4(z2Var);
                int i11 = z2Var.A;
                boolean z10 = z2Var.L;
                y4(z2Var, str);
                js jsVar = new js(hashSet, x42, i11, z10);
                Bundle bundle2 = z2Var.G;
                if (bundle2 != null) {
                    bundle = bundle2.getBundle(mediationBannerAdapter.getClass().getName());
                }
                mediationBannerAdapter.requestBannerAd((Context) oa.b.z1(aVar), new hq0(asVar), v4(str, z2Var, str2), hVar, jsVar, bundle);
                return;
            } catch (Throwable th) {
                l9.i.d("", th);
                xy.w(aVar, th, "adapter.requestBannerAd");
                androidx.datastore.preferences.protobuf.s1.b();
                return;
            }
        }
        if (obj instanceof n9.a) {
            try {
                com.google.android.gms.internal.measurement.e4 e4Var = new com.google.android.gms.internal.measurement.e4(this, 4, asVar);
                Context context = (Context) oa.b.z1(aVar);
                Bundle v4 = v4(str, z2Var, str2);
                w4(z2Var);
                x4(z2Var);
                int i12 = z2Var.A;
                int i13 = z2Var.N;
                y4(z2Var, str);
                ((n9.a) obj).loadBannerAd(new n9.m(context, "", v4, i12, i13, hVar, this.E), e4Var);
            } catch (Throwable th2) {
                l9.i.d("", th2);
                xy.w(aVar, th2, "adapter.loadBannerAd");
                androidx.datastore.preferences.protobuf.s1.b();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.xr
    public final ds P() {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [n9.d, n9.j] */
    @Override // com.google.android.gms.internal.ads.xr
    public final void P2(oa.a aVar, g9.z2 z2Var, String str, as asVar) {
        Object obj = this.f7860u;
        if (obj instanceof n9.a) {
            l9.i.a("Requesting app open ad from adapter.");
            try {
                j6.c cVar = new j6.c(this, 4, asVar);
                Context context = (Context) oa.b.z1(aVar);
                Bundle v4 = v4(str, z2Var, null);
                w4(z2Var);
                x4(z2Var);
                int i = z2Var.A;
                int i10 = z2Var.N;
                y4(z2Var, str);
                ((n9.a) obj).loadAppOpenAd(new n9.d(context, "", v4, i, i10, ""), cVar);
                return;
            } catch (Exception e) {
                l9.i.d("", e);
                xy.w(aVar, e, "adapter.loadAppOpenAd");
                androidx.datastore.preferences.protobuf.s1.b();
                return;
            }
        }
        String canonicalName = n9.a.class.getCanonicalName();
        String canonicalName2 = obj.getClass().getCanonicalName();
        StringBuilder sb2 = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb2.append(canonicalName);
        sb2.append(" #009 Class mismatch: ");
        sb2.append(canonicalName2);
        l9.i.f(sb2.toString());
        androidx.datastore.preferences.protobuf.s1.b();
    }

    @Override // com.google.android.gms.internal.ads.xr
    public final void R3(oa.a aVar, pv pvVar, List list) {
        l9.i.f("Could not initialize rewarded video adapter.");
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.xr
    public final void S1(oa.a aVar, g9.c3 c3Var, g9.z2 z2Var, String str, String str2, as asVar) {
        Object obj = this.f7860u;
        if (obj instanceof n9.a) {
            l9.i.a("Requesting interscroller ad from adapter.");
            try {
                n9.a aVar2 = (n9.a) obj;
                z11 z11Var = new z11(this, asVar, aVar2, 4);
                v4(str, z2Var, str2);
                w4(z2Var);
                x4(z2Var);
                y4(z2Var, str);
                int i = c3Var.f17593y;
                int i10 = c3Var.f17590v;
                z8.h hVar = new z8.h(i, i10);
                hVar.f31990f = true;
                hVar.f31991g = i10;
                z11Var.z(new z8.a(7, aVar2.getClass().getSimpleName().concat(" does not support interscroller ads."), "com.google.android.gms.ads", null));
                return;
            } catch (Exception e) {
                l9.i.d("", e);
                xy.w(aVar, e, "adapter.loadInterscrollerAd");
                androidx.datastore.preferences.protobuf.s1.b();
                return;
            }
        }
        String canonicalName = n9.a.class.getCanonicalName();
        String canonicalName2 = obj.getClass().getCanonicalName();
        StringBuilder sb2 = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb2.append(canonicalName);
        sb2.append(" #009 Class mismatch: ");
        sb2.append(canonicalName2);
        l9.i.f(sb2.toString());
        androidx.datastore.preferences.protobuf.s1.b();
    }

    @Override // com.google.android.gms.internal.ads.xr
    public final void V(oa.a aVar) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [n9.d, n9.y] */
    @Override // com.google.android.gms.internal.ads.xr
    public final void V1(oa.a aVar, g9.z2 z2Var, String str, as asVar) {
        Object obj = this.f7860u;
        if (obj instanceof n9.a) {
            l9.i.a("Requesting rewarded interstitial ad from adapter.");
            try {
                i0.m mVar = new i0.m(this, 4, asVar);
                Context context = (Context) oa.b.z1(aVar);
                Bundle v4 = v4(str, z2Var, null);
                w4(z2Var);
                x4(z2Var);
                int i = z2Var.A;
                int i10 = z2Var.N;
                y4(z2Var, str);
                ((n9.a) obj).loadRewardedInterstitialAd(new n9.d(context, "", v4, i, i10, ""), mVar);
                return;
            } catch (Exception e) {
                xy.w(aVar, e, "adapter.loadRewardedInterstitialAd");
                androidx.datastore.preferences.protobuf.s1.b();
                return;
            }
        }
        String canonicalName = n9.a.class.getCanonicalName();
        String canonicalName2 = obj.getClass().getCanonicalName();
        StringBuilder sb2 = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb2.append(canonicalName);
        sb2.append(" #009 Class mismatch: ");
        sb2.append(canonicalName2);
        l9.i.f(sb2.toString());
        androidx.datastore.preferences.protobuf.s1.b();
    }

    @Override // com.google.android.gms.internal.ads.xr
    public final void W2(g9.z2 z2Var, String str) {
        z4(z2Var, str);
    }

    @Override // com.google.android.gms.internal.ads.xr
    public final void Y1(oa.a aVar) {
        Object obj = this.f7860u;
        if (obj instanceof n9.a) {
            l9.i.a("Show rewarded ad from adapter.");
            n9.w wVar = this.C;
            if (wVar != null) {
                try {
                    ((i8.c) wVar).c((Context) oa.b.z1(aVar));
                    return;
                } catch (RuntimeException e) {
                    xy.w(aVar, e, "adapter.rewarded.showAd");
                    throw e;
                }
            }
            l9.i.c("Can not show null mediation rewarded ad.");
            androidx.datastore.preferences.protobuf.s1.b();
            return;
        }
        String canonicalName = n9.a.class.getCanonicalName();
        String canonicalName2 = obj.getClass().getCanonicalName();
        StringBuilder sb2 = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb2.append(canonicalName);
        sb2.append(" #009 Class mismatch: ");
        sb2.append(canonicalName2);
        l9.i.f(sb2.toString());
        androidx.datastore.preferences.protobuf.s1.b();
    }

    @Override // com.google.android.gms.internal.ads.xr
    public final void Z1(oa.a aVar, g9.z2 z2Var, String str, String str2, as asVar, rn rnVar, ArrayList arrayList) {
        HashSet hashSet;
        Object obj;
        Object obj2 = this.f7860u;
        boolean z3 = obj2 instanceof MediationNativeAdapter;
        if (!z3 && !(obj2 instanceof n9.a)) {
            String canonicalName = MediationNativeAdapter.class.getCanonicalName();
            String canonicalName2 = n9.a.class.getCanonicalName();
            String canonicalName3 = obj2.getClass().getCanonicalName();
            StringBuilder sb2 = new StringBuilder(String.valueOf(canonicalName).length() + 4 + String.valueOf(canonicalName2).length() + 22 + String.valueOf(canonicalName3).length());
            g3.a.t(sb2, canonicalName, " or ", canonicalName2, " #009 Class mismatch: ");
            sb2.append(canonicalName3);
            l9.i.f(sb2.toString());
            androidx.datastore.preferences.protobuf.s1.b();
            return;
        }
        l9.i.a("Requesting native ad from adapter.");
        if (z3) {
            try {
                MediationNativeAdapter mediationNativeAdapter = (MediationNativeAdapter) obj2;
                List list = z2Var.f17725y;
                Bundle bundle = null;
                if (list != null) {
                    hashSet = new HashSet(list);
                } else {
                    hashSet = null;
                }
                long j10 = z2Var.f17722v;
                if (j10 != -1) {
                    new Date(j10);
                }
                boolean x42 = x4(z2Var);
                int i = z2Var.A;
                boolean z9 = z2Var.L;
                y4(z2Var, str);
                ns nsVar = new ns(hashSet, x42, i, rnVar, arrayList, z9);
                Bundle bundle2 = z2Var.G;
                if (bundle2 != null) {
                    bundle = bundle2.getBundle(mediationNativeAdapter.getClass().getName());
                }
                this.f7861v = new hq0(asVar);
                mediationNativeAdapter.requestNativeAd((Context) oa.b.z1(aVar), this.f7861v, v4(str, z2Var, str2), nsVar, bundle);
                return;
            } catch (Throwable th) {
                l9.i.d("", th);
                xy.w(aVar, th, "adapter.requestNativeAd");
                androidx.datastore.preferences.protobuf.s1.b();
                return;
            }
        }
        if (obj2 instanceof n9.a) {
            try {
                n9.a aVar2 = (n9.a) obj2;
                com.google.android.gms.internal.mlkit_vision_digital_ink.pw pwVar = new com.google.android.gms.internal.mlkit_vision_digital_ink.pw(4, this, asVar, false);
                Context context = (Context) oa.b.z1(aVar);
                Bundle v4 = v4(str, z2Var, str2);
                w4(z2Var);
                x4(z2Var);
                int i10 = z2Var.A;
                int i11 = z2Var.N;
                y4(z2Var, str);
                obj = obj2;
                try {
                    aVar2.loadNativeAdMapper(new n9.u(context, "", v4, i10, i11, this.E, rnVar), pwVar);
                } catch (Throwable th2) {
                    th = th2;
                    l9.i.d("", th);
                    xy.w(aVar, th, "adapter.loadNativeAdMapper");
                    String message = th.getMessage();
                    if (!TextUtils.isEmpty(message) && message.equals("Method is not found")) {
                        try {
                            com.google.android.gms.internal.mlkit_vision_digital_ink.iw iwVar = new com.google.android.gms.internal.mlkit_vision_digital_ink.iw(4, this, asVar, false);
                            Context context2 = (Context) oa.b.z1(aVar);
                            Bundle v42 = v4(str, z2Var, str2);
                            w4(z2Var);
                            x4(z2Var);
                            int i12 = z2Var.A;
                            int i13 = z2Var.N;
                            y4(z2Var, str);
                            ((n9.a) obj).loadNativeAd(new n9.u(context2, "", v42, i12, i13, this.E, rnVar), iwVar);
                            return;
                        } catch (Throwable th3) {
                            l9.i.d("", th3);
                            xy.w(aVar, th3, "adapter.loadNativeAd");
                            androidx.datastore.preferences.protobuf.s1.b();
                            return;
                        }
                    }
                    androidx.datastore.preferences.protobuf.s1.b();
                }
            } catch (Throwable th4) {
                th = th4;
                obj = obj2;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v3, types: [n9.d, n9.r] */
    @Override // com.google.android.gms.internal.ads.xr
    public final void Z3(oa.a aVar, g9.z2 z2Var, String str, String str2, as asVar) {
        HashSet hashSet;
        Object obj = this.f7860u;
        boolean z3 = obj instanceof MediationInterstitialAdapter;
        if (!z3 && !(obj instanceof n9.a)) {
            String canonicalName = MediationInterstitialAdapter.class.getCanonicalName();
            String canonicalName2 = n9.a.class.getCanonicalName();
            String canonicalName3 = obj.getClass().getCanonicalName();
            StringBuilder sb2 = new StringBuilder(String.valueOf(canonicalName).length() + 4 + String.valueOf(canonicalName2).length() + 22 + String.valueOf(canonicalName3).length());
            g3.a.t(sb2, canonicalName, " or ", canonicalName2, " #009 Class mismatch: ");
            sb2.append(canonicalName3);
            l9.i.f(sb2.toString());
            androidx.datastore.preferences.protobuf.s1.b();
            return;
        }
        l9.i.a("Requesting interstitial ad from adapter.");
        if (z3) {
            try {
                MediationInterstitialAdapter mediationInterstitialAdapter = (MediationInterstitialAdapter) obj;
                List list = z2Var.f17725y;
                Bundle bundle = null;
                if (list != null) {
                    hashSet = new HashSet(list);
                } else {
                    hashSet = null;
                }
                long j10 = z2Var.f17722v;
                if (j10 != -1) {
                    new Date(j10);
                }
                boolean x42 = x4(z2Var);
                int i = z2Var.A;
                boolean z9 = z2Var.L;
                y4(z2Var, str);
                js jsVar = new js(hashSet, x42, i, z9);
                Bundle bundle2 = z2Var.G;
                if (bundle2 != null) {
                    bundle = bundle2.getBundle(mediationInterstitialAdapter.getClass().getName());
                }
                mediationInterstitialAdapter.requestInterstitialAd((Context) oa.b.z1(aVar), new hq0(asVar), v4(str, z2Var, str2), jsVar, bundle);
                return;
            } catch (Throwable th) {
                l9.i.d("", th);
                xy.w(aVar, th, "adapter.requestInterstitialAd");
                androidx.datastore.preferences.protobuf.s1.b();
                return;
            }
        }
        if (obj instanceof n9.a) {
            try {
                com.google.android.gms.internal.mlkit_vision_digital_ink.gw gwVar = new com.google.android.gms.internal.mlkit_vision_digital_ink.gw(4, this, asVar, false);
                Context context = (Context) oa.b.z1(aVar);
                Bundle v4 = v4(str, z2Var, str2);
                w4(z2Var);
                x4(z2Var);
                int i10 = z2Var.A;
                int i11 = z2Var.N;
                y4(z2Var, str);
                ((n9.a) obj).loadInterstitialAd(new n9.d(context, "", v4, i10, i11, this.E), gwVar);
            } catch (Throwable th2) {
                l9.i.d("", th2);
                xy.w(aVar, th2, "adapter.loadInterstitialAd");
                androidx.datastore.preferences.protobuf.s1.b();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.xr
    public final oa.a b() {
        Object obj = this.f7860u;
        if (obj instanceof MediationBannerAdapter) {
            try {
                return new oa.b(((MediationBannerAdapter) obj).getBannerView());
            } catch (Throwable th) {
                l9.i.d("", th);
                androidx.datastore.preferences.protobuf.s1.b();
                return null;
            }
        }
        if (obj instanceof n9.a) {
            return new oa.b(this.f7864y);
        }
        String canonicalName = MediationBannerAdapter.class.getCanonicalName();
        String canonicalName2 = n9.a.class.getCanonicalName();
        String canonicalName3 = obj.getClass().getCanonicalName();
        int length = String.valueOf(canonicalName).length();
        StringBuilder sb2 = new StringBuilder(length + 4 + String.valueOf(canonicalName2).length() + 22 + String.valueOf(canonicalName3).length());
        g3.a.t(sb2, canonicalName, " or ", canonicalName2, " #009 Class mismatch: ");
        sb2.append(canonicalName3);
        l9.i.f(sb2.toString());
        androidx.datastore.preferences.protobuf.s1.b();
        return null;
    }

    @Override // com.google.android.gms.internal.ads.xr
    public final ft c4() {
        Object obj = this.f7860u;
        if (!(obj instanceof n9.a)) {
            return null;
        }
        z8.r sDKVersionInfo = ((n9.a) obj).getSDKVersionInfo();
        return new ft(sDKVersionInfo.f32000a, sDKVersionInfo.f32001b, sDKVersionInfo.f32002c);
    }

    @Override // com.google.android.gms.internal.ads.xr
    public final void d() {
        Object obj = this.f7860u;
        if (obj instanceof MediationInterstitialAdapter) {
            l9.i.a("Showing interstitial from adapter.");
            try {
                ((MediationInterstitialAdapter) obj).showInterstitial();
                return;
            } catch (Throwable th) {
                l9.i.d("", th);
                androidx.datastore.preferences.protobuf.s1.b();
                return;
            }
        }
        String canonicalName = MediationInterstitialAdapter.class.getCanonicalName();
        String canonicalName2 = obj.getClass().getCanonicalName();
        StringBuilder sb2 = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb2.append(canonicalName);
        sb2.append(" #009 Class mismatch: ");
        sb2.append(canonicalName2);
        l9.i.f(sb2.toString());
        androidx.datastore.preferences.protobuf.s1.b();
    }

    @Override // com.google.android.gms.internal.ads.xr
    public final g9.z1 d0() {
        Object obj = this.f7860u;
        if (obj instanceof AbstractAdViewAdapter) {
            try {
                return ((AbstractAdViewAdapter) obj).getVideoController();
            } catch (Throwable th) {
                l9.i.d("", th);
            }
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.xr
    public final void d1(oa.a aVar) {
        Object obj = this.f7860u;
        if (obj instanceof n9.a) {
            l9.i.a("Show app open ad from adapter.");
            n9.h hVar = this.D;
            if (hVar != null) {
                try {
                    ((j8.f) hVar).a((Context) oa.b.z1(aVar));
                    return;
                } catch (RuntimeException e) {
                    xy.w(aVar, e, "adapter.appOpen.showAd");
                    throw e;
                }
            }
            l9.i.c("Can not show null mediation app open ad.");
            androidx.datastore.preferences.protobuf.s1.b();
            return;
        }
        String canonicalName = n9.a.class.getCanonicalName();
        String canonicalName2 = obj.getClass().getCanonicalName();
        StringBuilder sb2 = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb2.append(canonicalName);
        sb2.append(" #009 Class mismatch: ");
        sb2.append(canonicalName2);
        l9.i.f(sb2.toString());
        androidx.datastore.preferences.protobuf.s1.b();
    }

    @Override // com.google.android.gms.internal.ads.xr
    public final void f0() {
        Object obj = this.f7860u;
        if (obj instanceof n9.a) {
            n9.w wVar = this.C;
            if (wVar != null) {
                try {
                    ((i8.c) wVar).c((Context) oa.b.z1(this.f7863x));
                    return;
                } catch (RuntimeException e) {
                    xy.w(this.f7863x, e, "adapter.showVideo");
                    throw e;
                }
            }
            l9.i.c("Can not show null mediated rewarded ad.");
            androidx.datastore.preferences.protobuf.s1.b();
            return;
        }
        String canonicalName = n9.a.class.getCanonicalName();
        String canonicalName2 = obj.getClass().getCanonicalName();
        StringBuilder sb2 = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb2.append(canonicalName);
        sb2.append(" #009 Class mismatch: ");
        sb2.append(canonicalName2);
        l9.i.f(sb2.toString());
        androidx.datastore.preferences.protobuf.s1.b();
    }

    @Override // com.google.android.gms.internal.ads.xr
    public final void g() {
        Object obj = this.f7860u;
        if (!(obj instanceof n9.g)) {
            return;
        }
        try {
            ((n9.g) obj).onDestroy();
        } catch (Throwable th) {
            l9.i.d("", th);
            androidx.datastore.preferences.protobuf.s1.b();
        }
    }

    @Override // com.google.android.gms.internal.ads.xr
    public final void h() {
        Object obj = this.f7860u;
        if (!(obj instanceof n9.g)) {
            return;
        }
        try {
            ((n9.g) obj).onPause();
        } catch (Throwable th) {
            l9.i.d("", th);
            androidx.datastore.preferences.protobuf.s1.b();
        }
    }

    @Override // com.google.android.gms.internal.ads.xr
    public final bs h0() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.xr
    public final boolean j() {
        Object obj = this.f7860u;
        if (!(obj instanceof n9.a) && !Objects.equals(obj.getClass().getCanonicalName(), "com.google.ads.mediation.admob.AdMobAdapter")) {
            String canonicalName = n9.a.class.getCanonicalName();
            String canonicalName2 = obj.getClass().getCanonicalName();
            StringBuilder sb2 = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb2.append(canonicalName);
            sb2.append(" #009 Class mismatch: ");
            sb2.append(canonicalName2);
            l9.i.f(sb2.toString());
            androidx.datastore.preferences.protobuf.s1.b();
            return false;
        }
        if (this.f7862w != null) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.xr
    public final es j0() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.xr
    public final void k2(oa.a aVar) {
        Object obj = this.f7860u;
        if (!(obj instanceof n9.a) && !(obj instanceof MediationInterstitialAdapter)) {
            String canonicalName = MediationInterstitialAdapter.class.getCanonicalName();
            String canonicalName2 = n9.a.class.getCanonicalName();
            String canonicalName3 = obj.getClass().getCanonicalName();
            int length = String.valueOf(canonicalName).length();
            StringBuilder sb2 = new StringBuilder(length + 4 + String.valueOf(canonicalName2).length() + 22 + String.valueOf(canonicalName3).length());
            g3.a.t(sb2, canonicalName, " or ", canonicalName2, " #009 Class mismatch: ");
            sb2.append(canonicalName3);
            l9.i.f(sb2.toString());
            androidx.datastore.preferences.protobuf.s1.b();
            return;
        }
        if (obj instanceof MediationInterstitialAdapter) {
            d();
            return;
        }
        l9.i.a("Show interstitial ad from adapter.");
        n9.p pVar = this.f7865z;
        if (pVar != null) {
            try {
                ((j8.b) pVar).a((Context) oa.b.z1(aVar));
                return;
            } catch (RuntimeException e) {
                xy.w(aVar, e, "adapter.interstitial.showAd");
                throw e;
            }
        }
        l9.i.c("Can not show null mediation interstitial ad.");
        androidx.datastore.preferences.protobuf.s1.b();
    }

    @Override // com.google.android.gms.internal.ads.xr
    public final ft l0() {
        Object obj = this.f7860u;
        if (!(obj instanceof n9.a)) {
            return null;
        }
        z8.r versionInfo = ((n9.a) obj).getVersionInfo();
        return new ft(versionInfo.f32000a, versionInfo.f32001b, versionInfo.f32002c);
    }

    @Override // com.google.android.gms.internal.ads.xr
    public final void t2(boolean z3) {
        Object obj = this.f7860u;
        if (obj instanceof AbstractAdViewAdapter) {
            try {
                ((AbstractAdViewAdapter) obj).onImmersiveModeUpdated(z3);
                return;
            } catch (Throwable th) {
                l9.i.d("", th);
                return;
            }
        }
        String canonicalName = AbstractAdViewAdapter.class.getCanonicalName();
        String canonicalName2 = obj.getClass().getCanonicalName();
        StringBuilder sb2 = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb2.append(canonicalName);
        sb2.append(" #009 Class mismatch: ");
        sb2.append(canonicalName2);
        l9.i.a(sb2.toString());
    }

    @Override // com.google.android.gms.internal.ads.xr
    public final void t3() {
        Object obj = this.f7860u;
        if (!(obj instanceof n9.g)) {
            return;
        }
        try {
            ((n9.g) obj).onResume();
        } catch (Throwable th) {
            l9.i.d("", th);
            androidx.datastore.preferences.protobuf.s1.b();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v11, types: [com.google.android.gms.internal.ads.oh] */
    /* JADX WARN: Type inference failed for: r6v17, types: [com.google.android.gms.internal.ads.oh] */
    /* JADX WARN: Type inference failed for: r6v21, types: [com.google.android.gms.internal.ads.oh] */
    @Override // com.google.android.gms.internal.ads.ph
    public final boolean u4(int i, Parcel parcel, Parcel parcel2) {
        as yrVar;
        as yrVar2;
        as yrVar3;
        as asVar;
        as yrVar4;
        pv ohVar;
        as yrVar5;
        pv pvVar;
        ko koVar;
        hx0 hx0Var;
        as yrVar6;
        gq ohVar2;
        as yrVar7;
        as yrVar8;
        as asVar2 = null;
        switch (i) {
            case 1:
                oa.a v12 = oa.b.v1(parcel.readStrongBinder());
                g9.c3 c3Var = (g9.c3) qh.b(parcel, g9.c3.CREATOR);
                g9.z2 z2Var = (g9.z2) qh.b(parcel, g9.z2.CREATOR);
                String readString = parcel.readString();
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    yrVar = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    if (queryLocalInterface instanceof as) {
                        yrVar = (as) queryLocalInterface;
                    } else {
                        yrVar = new yr(readStrongBinder);
                    }
                }
                qh.f(parcel);
                L0(v12, c3Var, z2Var, readString, null, yrVar);
                parcel2.writeNoException();
                return true;
            case 2:
                oa.a b10 = b();
                parcel2.writeNoException();
                qh.e(parcel2, b10);
                return true;
            case 3:
                oa.a v13 = oa.b.v1(parcel.readStrongBinder());
                g9.z2 z2Var2 = (g9.z2) qh.b(parcel, g9.z2.CREATOR);
                String readString2 = parcel.readString();
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 == null) {
                    yrVar2 = null;
                } else {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    if (queryLocalInterface2 instanceof as) {
                        yrVar2 = (as) queryLocalInterface2;
                    } else {
                        yrVar2 = new yr(readStrongBinder2);
                    }
                }
                qh.f(parcel);
                Z3(v13, z2Var2, readString2, null, yrVar2);
                parcel2.writeNoException();
                return true;
            case 4:
                d();
                parcel2.writeNoException();
                return true;
            case 5:
                g();
                parcel2.writeNoException();
                return true;
            case 6:
                oa.a v14 = oa.b.v1(parcel.readStrongBinder());
                g9.c3 c3Var2 = (g9.c3) qh.b(parcel, g9.c3.CREATOR);
                g9.z2 z2Var3 = (g9.z2) qh.b(parcel, g9.z2.CREATOR);
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 == null) {
                    asVar = null;
                } else {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    if (queryLocalInterface3 instanceof as) {
                        yrVar3 = (as) queryLocalInterface3;
                    } else {
                        yrVar3 = new yr(readStrongBinder3);
                    }
                    asVar = yrVar3;
                }
                qh.f(parcel);
                L0(v14, c3Var2, z2Var3, readString3, readString4, asVar);
                parcel2.writeNoException();
                return true;
            case 7:
                oa.a v15 = oa.b.v1(parcel.readStrongBinder());
                g9.z2 z2Var4 = (g9.z2) qh.b(parcel, g9.z2.CREATOR);
                String readString5 = parcel.readString();
                String readString6 = parcel.readString();
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 == null) {
                    yrVar4 = null;
                } else {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    if (queryLocalInterface4 instanceof as) {
                        yrVar4 = (as) queryLocalInterface4;
                    } else {
                        yrVar4 = new yr(readStrongBinder4);
                    }
                }
                qh.f(parcel);
                Z3(v15, z2Var4, readString5, readString6, yrVar4);
                parcel2.writeNoException();
                return true;
            case 8:
                h();
                parcel2.writeNoException();
                return true;
            case 9:
                t3();
                parcel2.writeNoException();
                return true;
            case 10:
                oa.a v16 = oa.b.v1(parcel.readStrongBinder());
                g9.z2 z2Var5 = (g9.z2) qh.b(parcel, g9.z2.CREATOR);
                parcel.readString();
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 == null) {
                    ohVar = null;
                } else {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
                    if (queryLocalInterface5 instanceof pv) {
                        ohVar = (pv) queryLocalInterface5;
                    } else {
                        ohVar = new oh(readStrongBinder5, "com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener", 0);
                    }
                }
                String readString7 = parcel.readString();
                qh.f(parcel);
                w2(v16, z2Var5, ohVar, readString7);
                parcel2.writeNoException();
                return true;
            case 11:
                g9.z2 z2Var6 = (g9.z2) qh.b(parcel, g9.z2.CREATOR);
                String readString8 = parcel.readString();
                qh.f(parcel);
                z4(z2Var6, readString8);
                parcel2.writeNoException();
                return true;
            case 12:
                f0();
                parcel2.writeNoException();
                return true;
            case 13:
                boolean j10 = j();
                parcel2.writeNoException();
                ClassLoader classLoader = qh.f9846a;
                parcel2.writeInt(j10 ? 1 : 0);
                return true;
            case 14:
                oa.a v17 = oa.b.v1(parcel.readStrongBinder());
                g9.z2 z2Var7 = (g9.z2) qh.b(parcel, g9.z2.CREATOR);
                String readString9 = parcel.readString();
                String readString10 = parcel.readString();
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 == null) {
                    yrVar5 = null;
                } else {
                    IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    if (queryLocalInterface6 instanceof as) {
                        yrVar5 = (as) queryLocalInterface6;
                    } else {
                        yrVar5 = new yr(readStrongBinder6);
                    }
                }
                rn rnVar = (rn) qh.b(parcel, rn.CREATOR);
                ArrayList<String> createStringArrayList = parcel.createStringArrayList();
                qh.f(parcel);
                Z1(v17, z2Var7, readString9, readString10, yrVar5, rnVar, createStringArrayList);
                parcel2.writeNoException();
                return true;
            case 15:
                parcel2.writeNoException();
                ClassLoader classLoader2 = qh.f9846a;
                parcel2.writeStrongBinder(null);
                return true;
            case 16:
                parcel2.writeNoException();
                ClassLoader classLoader3 = qh.f9846a;
                parcel2.writeStrongBinder(null);
                return true;
            case 17:
                Bundle bundle = new Bundle();
                parcel2.writeNoException();
                qh.d(parcel2, bundle);
                return true;
            case 18:
                Bundle bundle2 = new Bundle();
                parcel2.writeNoException();
                qh.d(parcel2, bundle2);
                return true;
            case 19:
                Bundle bundle3 = new Bundle();
                parcel2.writeNoException();
                qh.d(parcel2, bundle3);
                return true;
            case 20:
                g9.z2 z2Var8 = (g9.z2) qh.b(parcel, g9.z2.CREATOR);
                String readString11 = parcel.readString();
                parcel.readString();
                qh.f(parcel);
                z4(z2Var8, readString11);
                parcel2.writeNoException();
                return true;
            case gl.zzm /* 21 */:
                oa.a v18 = oa.b.v1(parcel.readStrongBinder());
                qh.f(parcel);
                V(v18);
                parcel2.writeNoException();
                return true;
            case 22:
                parcel2.writeNoException();
                ClassLoader classLoader4 = qh.f9846a;
                parcel2.writeInt(0);
                return true;
            case 23:
                oa.a v19 = oa.b.v1(parcel.readStrongBinder());
                IBinder readStrongBinder7 = parcel.readStrongBinder();
                if (readStrongBinder7 != null) {
                    IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
                    if (queryLocalInterface7 instanceof pv) {
                        pvVar = (pv) queryLocalInterface7;
                    } else {
                        pvVar = new oh(readStrongBinder7, "com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener", 0);
                    }
                } else {
                    pvVar = null;
                }
                ArrayList<String> createStringArrayList2 = parcel.createStringArrayList();
                qh.f(parcel);
                R3(v19, pvVar, createStringArrayList2);
                throw null;
            case 24:
                hq0 hq0Var = this.f7861v;
                if (hq0Var != null && (hx0Var = (hx0) hq0Var.f6874x) != null) {
                    koVar = (ko) hx0Var.f6914v;
                } else {
                    koVar = null;
                }
                parcel2.writeNoException();
                qh.e(parcel2, koVar);
                return true;
            case 25:
                boolean a10 = qh.a(parcel);
                qh.f(parcel);
                t2(a10);
                parcel2.writeNoException();
                return true;
            case 26:
                g9.z1 d02 = d0();
                parcel2.writeNoException();
                qh.e(parcel2, d02);
                return true;
            case 27:
                gs J = J();
                parcel2.writeNoException();
                qh.e(parcel2, J);
                return true;
            case 28:
                oa.a v110 = oa.b.v1(parcel.readStrongBinder());
                g9.z2 z2Var9 = (g9.z2) qh.b(parcel, g9.z2.CREATOR);
                String readString12 = parcel.readString();
                IBinder readStrongBinder8 = parcel.readStrongBinder();
                if (readStrongBinder8 == null) {
                    yrVar6 = null;
                } else {
                    IInterface queryLocalInterface8 = readStrongBinder8.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    if (queryLocalInterface8 instanceof as) {
                        yrVar6 = (as) queryLocalInterface8;
                    } else {
                        yrVar6 = new yr(readStrongBinder8);
                    }
                }
                qh.f(parcel);
                y3(v110, z2Var9, readString12, yrVar6);
                parcel2.writeNoException();
                return true;
            case 29:
            default:
                return false;
            case 30:
                oa.a v111 = oa.b.v1(parcel.readStrongBinder());
                qh.f(parcel);
                Y1(v111);
                parcel2.writeNoException();
                return true;
            case 31:
                oa.a v112 = oa.b.v1(parcel.readStrongBinder());
                IBinder readStrongBinder9 = parcel.readStrongBinder();
                if (readStrongBinder9 == null) {
                    ohVar2 = null;
                } else {
                    IInterface queryLocalInterface9 = readStrongBinder9.queryLocalInterface("com.google.android.gms.ads.internal.initialization.IAdapterInitializationCallback");
                    if (queryLocalInterface9 instanceof gq) {
                        ohVar2 = (gq) queryLocalInterface9;
                    } else {
                        ohVar2 = new oh(readStrongBinder9, "com.google.android.gms.ads.internal.initialization.IAdapterInitializationCallback", 0);
                    }
                }
                ArrayList createTypedArrayList = parcel.createTypedArrayList(kq.CREATOR);
                qh.f(parcel);
                G0(v112, ohVar2, createTypedArrayList);
                parcel2.writeNoException();
                return true;
            case 32:
                oa.a v113 = oa.b.v1(parcel.readStrongBinder());
                g9.z2 z2Var10 = (g9.z2) qh.b(parcel, g9.z2.CREATOR);
                String readString13 = parcel.readString();
                IBinder readStrongBinder10 = parcel.readStrongBinder();
                if (readStrongBinder10 == null) {
                    yrVar7 = null;
                } else {
                    IInterface queryLocalInterface10 = readStrongBinder10.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    if (queryLocalInterface10 instanceof as) {
                        yrVar7 = (as) queryLocalInterface10;
                    } else {
                        yrVar7 = new yr(readStrongBinder10);
                    }
                }
                qh.f(parcel);
                V1(v113, z2Var10, readString13, yrVar7);
                parcel2.writeNoException();
                return true;
            case 33:
                ft l0 = l0();
                parcel2.writeNoException();
                qh.d(parcel2, l0);
                return true;
            case 34:
                ft c42 = c4();
                parcel2.writeNoException();
                qh.d(parcel2, c42);
                return true;
            case 35:
                oa.a v114 = oa.b.v1(parcel.readStrongBinder());
                g9.c3 c3Var3 = (g9.c3) qh.b(parcel, g9.c3.CREATOR);
                g9.z2 z2Var11 = (g9.z2) qh.b(parcel, g9.z2.CREATOR);
                String readString14 = parcel.readString();
                String readString15 = parcel.readString();
                IBinder readStrongBinder11 = parcel.readStrongBinder();
                if (readStrongBinder11 == null) {
                    yrVar8 = null;
                } else {
                    IInterface queryLocalInterface11 = readStrongBinder11.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    if (queryLocalInterface11 instanceof as) {
                        yrVar8 = (as) queryLocalInterface11;
                    } else {
                        yrVar8 = new yr(readStrongBinder11);
                    }
                }
                qh.f(parcel);
                S1(v114, c3Var3, z2Var11, readString14, readString15, yrVar8);
                parcel2.writeNoException();
                return true;
            case 36:
                parcel2.writeNoException();
                ClassLoader classLoader5 = qh.f9846a;
                parcel2.writeStrongBinder(null);
                return true;
            case 37:
                oa.a v115 = oa.b.v1(parcel.readStrongBinder());
                qh.f(parcel);
                k2(v115);
                parcel2.writeNoException();
                return true;
            case 38:
                oa.a v116 = oa.b.v1(parcel.readStrongBinder());
                g9.z2 z2Var12 = (g9.z2) qh.b(parcel, g9.z2.CREATOR);
                String readString16 = parcel.readString();
                IBinder readStrongBinder12 = parcel.readStrongBinder();
                if (readStrongBinder12 != null) {
                    IInterface queryLocalInterface12 = readStrongBinder12.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    if (queryLocalInterface12 instanceof as) {
                        asVar2 = (as) queryLocalInterface12;
                    } else {
                        asVar2 = new yr(readStrongBinder12);
                    }
                }
                qh.f(parcel);
                P2(v116, z2Var12, readString16, asVar2);
                parcel2.writeNoException();
                return true;
            case 39:
                oa.a v117 = oa.b.v1(parcel.readStrongBinder());
                qh.f(parcel);
                d1(v117);
                parcel2.writeNoException();
                return true;
        }
    }

    public final Bundle v4(String str, g9.z2 z2Var, String str2) {
        l9.i.a("Server parameters: ".concat(String.valueOf(str)));
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
                bundle = bundle2;
            }
            if (this.f7860u instanceof AdMobAdapter) {
                bundle.putString("adJson", str2);
                if (z2Var != null) {
                    bundle.putInt("tagForChildDirectedTreatment", z2Var.A);
                }
            }
            bundle.remove("max_ad_content_rating");
            return bundle;
        } catch (Throwable th) {
            l9.i.d("", th);
            androidx.datastore.preferences.protobuf.s1.b();
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.xr
    public final void w2(oa.a aVar, g9.z2 z2Var, pv pvVar, String str) {
        Object obj = this.f7860u;
        if (!(obj instanceof n9.a) && !Objects.equals(obj.getClass().getCanonicalName(), "com.google.ads.mediation.admob.AdMobAdapter")) {
            String canonicalName = n9.a.class.getCanonicalName();
            String canonicalName2 = obj.getClass().getCanonicalName();
            StringBuilder sb2 = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb2.append(canonicalName);
            sb2.append(" #009 Class mismatch: ");
            sb2.append(canonicalName2);
            l9.i.f(sb2.toString());
            androidx.datastore.preferences.protobuf.s1.b();
            return;
        }
        this.f7863x = aVar;
        this.f7862w = pvVar;
        pvVar.c0(new oa.b(obj));
    }

    public final Bundle w4(g9.z2 z2Var) {
        Bundle bundle;
        Bundle bundle2 = z2Var.G;
        if (bundle2 != null && (bundle = bundle2.getBundle(this.f7860u.getClass().getName())) != null) {
            return bundle;
        }
        return new Bundle();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [n9.d, n9.y] */
    @Override // com.google.android.gms.internal.ads.xr
    public final void y3(oa.a aVar, g9.z2 z2Var, String str, as asVar) {
        Object obj = this.f7860u;
        if (obj instanceof n9.a) {
            l9.i.a("Requesting rewarded ad from adapter.");
            try {
                i0.m mVar = new i0.m(this, 4, asVar);
                Context context = (Context) oa.b.z1(aVar);
                Bundle v4 = v4(str, z2Var, null);
                w4(z2Var);
                x4(z2Var);
                int i = z2Var.A;
                int i10 = z2Var.N;
                y4(z2Var, str);
                ((n9.a) obj).loadRewardedAd(new n9.d(context, "", v4, i, i10, ""), mVar);
                return;
            } catch (Exception e) {
                l9.i.d("", e);
                xy.w(aVar, e, "adapter.loadRewardedAd");
                androidx.datastore.preferences.protobuf.s1.b();
                return;
            }
        }
        String canonicalName = n9.a.class.getCanonicalName();
        String canonicalName2 = obj.getClass().getCanonicalName();
        StringBuilder sb2 = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb2.append(canonicalName);
        sb2.append(" #009 Class mismatch: ");
        sb2.append(canonicalName2);
        l9.i.f(sb2.toString());
        androidx.datastore.preferences.protobuf.s1.b();
    }

    public final void z4(g9.z2 z2Var, String str) {
        Object obj = this.f7860u;
        if (obj instanceof n9.a) {
            y3(this.f7863x, z2Var, str, new ls((n9.a) obj, this.f7862w));
            return;
        }
        String canonicalName = n9.a.class.getCanonicalName();
        String canonicalName2 = obj.getClass().getCanonicalName();
        StringBuilder sb2 = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb2.append(canonicalName);
        sb2.append(" #009 Class mismatch: ");
        sb2.append(canonicalName2);
        l9.i.f(sb2.toString());
        androidx.datastore.preferences.protobuf.s1.b();
    }

    public ks() {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
    }

    public ks(n9.g gVar) {
        this();
        this.E = "";
        this.f7860u = gVar;
    }
}
