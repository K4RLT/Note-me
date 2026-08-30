package s9;
import p.a;
import r.e;

import android.content.Context;
import android.graphics.Point;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.b81;
import com.google.android.gms.internal.ads.bn;
import com.google.android.gms.internal.ads.cq0;
import com.google.android.gms.internal.ads.cx;
import com.google.android.gms.internal.ads.d51;
import com.google.android.gms.internal.ads.ed1;
import com.google.android.gms.internal.ads.ex;
import com.google.android.gms.internal.ads.fe0;
import com.google.android.gms.internal.ads.fm;
import com.google.android.gms.internal.ads.iu;
import com.google.android.gms.internal.ads.iv1;
import com.google.android.gms.internal.ads.j81;
import com.google.android.gms.internal.ads.jq0;
import com.google.android.gms.internal.ads.jx;
import com.google.android.gms.internal.ads.k81;
import com.google.android.gms.internal.ads.ku;
import com.google.android.gms.internal.ads.l20;
import com.google.android.gms.internal.ads.nl;
import com.google.android.gms.internal.ads.nu;
import com.google.android.gms.internal.ads.of;
import com.google.android.gms.internal.ads.q81;
import com.google.android.gms.internal.ads.ql;
import com.google.android.gms.internal.ads.rc0;
import com.google.android.gms.internal.ads.rm;
import com.google.android.gms.internal.ads.rr0;
import com.google.android.gms.internal.ads.sl;
import com.google.android.gms.internal.ads.t81;
import com.google.android.gms.internal.ads.u81;
import com.google.android.gms.internal.ads.ur0;
import com.google.android.gms.internal.ads.v81;
import com.google.android.gms.internal.ads.vr0;
import com.google.android.gms.internal.ads.wx;
import com.google.android.gms.internal.ads.xs0;
import com.google.android.gms.internal.ads.xx;
import com.google.android.gms.internal.ads.xy;
import com.google.android.gms.internal.ads.y10;
import com.google.android.gms.internal.mlkit_vision_digital_ink.u0;
import g9.z2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import k9.a0;
import org.json.JSONObject;
import wa.h9;
import ya.zb;

/* loaded from: classes.dex */
public final class i extends ex {

    /* renamed from: b0, reason: collision with root package name */
    public static final ArrayList f25065b0 = new ArrayList(Arrays.asList("/aclk", "/pcs/click", "/dbm/clk"));

    /* renamed from: c0, reason: collision with root package name */
    public static final ArrayList f25066c0 = new ArrayList(Arrays.asList(".doubleclick.net", ".googleadservices.com"));

    /* renamed from: d0, reason: collision with root package name */
    public static final ArrayList f25067d0 = new ArrayList(Arrays.asList("/pagead/adview", "/pcs/view", "/pagead/conversion", "/dbm/ad"));

    /* renamed from: e0, reason: collision with root package name */
    public static final ArrayList f25068e0 = new ArrayList(Arrays.asList(".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"));
    public final wx A;
    public final ScheduledExecutorService B;
    public nu C;
    public Point D;
    public Point E;
    public final fe0 F;
    public final xs0 G;
    public final boolean H;
    public final boolean I;
    public final boolean J;
    public final boolean K;
    public final String L;
    public final String M;
    public final AtomicInteger N;
    public final l9.a O;
    public String P;
    public final String Q;
    public final ArrayList R;
    public final ArrayList S;
    public final ArrayList T;
    public final ArrayList U;
    public final AtomicBoolean V;
    public final AtomicBoolean W;
    public final AtomicInteger X;
    public final fm Y;
    public final p Z;

    /* renamed from: a0, reason: collision with root package name */
    public final b f25069a0;

    /* renamed from: v, reason: collision with root package name */
    public final y10 f25070v;

    /* renamed from: w, reason: collision with root package name */
    public Context f25071w;

    /* renamed from: x, reason: collision with root package name */
    public final of f25072x;

    /* renamed from: y, reason: collision with root package name */
    public final cq0 f25073y;

    /* renamed from: z, reason: collision with root package name */
    public final jq0 f25074z;

    public i(y10 y10Var, Context context, of ofVar, jq0 jq0Var, wx wxVar, ScheduledExecutorService scheduledExecutorService, fe0 fe0Var, xs0 xs0Var, l9.a aVar, fm fmVar, cq0 cq0Var, p pVar, b bVar) {
        super("com.google.android.gms.ads.internal.signals.ISignalGenerator");
        ArrayList arrayList;
        this.D = new Point();
        this.E = new Point();
        this.N = new AtomicInteger(0);
        this.V = new AtomicBoolean(false);
        this.W = new AtomicBoolean(false);
        this.X = new AtomicInteger(0);
        this.f25070v = y10Var;
        this.f25071w = context;
        this.f25072x = ofVar;
        this.f25073y = cq0Var;
        this.f25074z = jq0Var;
        this.A = wxVar;
        this.B = scheduledExecutorService;
        this.F = fe0Var;
        this.G = xs0Var;
        this.O = aVar;
        this.Y = fmVar;
        nl nlVar = sl.f10762h8;
        g9.r rVar = g9.e;
        this.H = ((Boolean) rVar.f17698c.a(nlVar)).booleanValue();
        nl nlVar2 = sl.g8;
        ql qlVar = rVar.f17698c;
        this.I = ((Boolean) qlVar.a(nlVar2)).booleanValue();
        this.J = ((Boolean) qlVar.a(sl.f10794j8)).booleanValue();
        this.K = ((Boolean) qlVar.a(sl.f10824l8)).booleanValue();
        this.L = (String) qlVar.a(sl.f10809k8);
        this.M = (String) qlVar.a(sl.f10839m8);
        this.Q = (String) qlVar.a(sl.f10856n8);
        this.Z = pVar;
        this.f25069a0 = bVar;
        if (((Boolean) qlVar.a(sl.f10873o8)).booleanValue()) {
            this.R = D4((String) qlVar.a(sl.f10890p8));
            this.S = D4((String) qlVar.a(sl.f10907q8));
            this.T = D4((String) qlVar.a(sl.r8));
            arrayList = D4((String) qlVar.a(sl.f10939s8));
        } else {
            this.R = f25065b0;
            this.S = f25066c0;
            this.T = f25067d0;
            arrayList = f25068e0;
        }
        this.U = arrayList;
    }

    public static final Uri C4(Uri uri, String str, String str2) {
        String uri2 = uri.toString();
        int indexOf = uri2.indexOf("&adurl=");
        if (indexOf == -1) {
            indexOf = uri2.indexOf("?adurl=");
        }
        if (indexOf != -1) {
            int i = indexOf + 1;
            StringBuilder sb2 = new StringBuilder(uri2.substring(0, i));
            g3.a.t(sb2, str, "=", str2, "&");
            sb2.append(uri2.substring(i));
            return Uri.parse(sb2.toString());
        }
        return uri.buildUpon().appendQueryParameter(str, str2).build();
    }

    public static final ArrayList D4(String str) {
        String[] split = TextUtils.split(str, ",");
        ArrayList arrayList = new ArrayList();
        for (String str2 : split) {
            if (!xy.y(str2)) {
                arrayList.add(str2);
            }
        }
        return arrayList;
    }

    public static ur0 E4(ac.b bVar, jx jxVar) {
        String str;
        if (vr0.a() && ((Boolean) rm.e.p()).booleanValue()) {
            try {
                ur0 ur0Var = (ur0) ((l20) ed1.j0(bVar)).f7922a.zzb();
                ur0Var.b(new ArrayList(Collections.singletonList(jxVar.f7558v)));
                z2 z2Var = jxVar.f7560x;
                if (z2Var == null) {
                    str = "";
                } else {
                    str = z2Var.J;
                }
                ur0Var.c(str);
                ur0Var.d(z2Var.G);
                return ur0Var;
            } catch (ExecutionException e) {
                f9.k.C.f16817h.d("SignalGeneratorImpl.getConfiguredCriticalUserJourney", e);
            }
        }
        return null;
    }

    public static boolean z4(Uri uri, List list, List list2) {
        String host = uri.getHost();
        String path = uri.getPath();
        if (host != null && path != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (path.contains((String) it.next())) {
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        if (host.endsWith((String) it2.next())) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00ae, code lost:
    
        if (r44.equals("REWARDED_INTERSTITIAL") != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00b7, code lost:
    
        r0 = new g9.c3("reward_mb", 0, 0, true, 0, 0, null, false, false, false, false, false, false, false, false, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00b5, code lost:
    
        if (r44.equals("REWARDED") != false) goto L30;
     */
    /* JADX WARN: Type inference failed for: r7v0, types: [com.google.android.gms.internal.ads.yd1, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.internal.ads.l20 A4(android.content.Context r42, java.lang.String r43, java.lang.String r44, g9.c3 r45, g9.z2 r46, android.os.Bundle r47) {
        /*
            Method dump skipped, instructions count: 384
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s9.i.A4(android.content.Context, java.lang.String, java.lang.String, g9.c3, g9.z2, android.os.Bundle):com.google.android.gms.internal.ads.l20");
    }

    public final q81 B4(final String str) {
        final rc0[] rc0VarArr = new rc0[1];
        ac.b b10 = this.f25074z.b();
        j81 j81Var = new j81() { // from class: s9.h
            @Override // com.google.android.gms.internal.ads.j81
            public final /* synthetic */ ac.b l(Object obj) {
                rc0 rc0Var = (rc0) obj;
                rc0VarArr[0] = rc0Var;
                i iVar = i.this;
                Context context = iVar.f25071w;
                nu nuVar = iVar.C;
                Map map = nuVar.f8866v;
                JSONObject e = h9.e(context, map, map, nuVar.f8865u, null);
                JSONObject b11 = h9.b(iVar.f25071w, iVar.C.f8865u);
                JSONObject c10 = h9.c(iVar.C.f8865u);
                JSONObject d2 = h9.d(iVar.f25071w, iVar.C.f8865u);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("asset_view_signal", e);
                jSONObject.put("ad_view_signal", b11);
                jSONObject.put("scroll_view_signal", c10);
                jSONObject.put("lock_screen_signal", d2);
                String str2 = str;
                if ("google.afma.nativeAds.getPublisherCustomRenderedClickSignals".equals(str2)) {
                    jSONObject.put("click_signal", h9.f(null, iVar.f25071w, iVar.E, iVar.D));
                }
                return rc0Var.a(str2, jSONObject);
            }
        };
        wx wxVar = this.A;
        b81 c02 = ed1.c0(b10, j81Var, wxVar);
        c02.a(new iv1(this, 27, rc0VarArr), wxVar);
        return ed1.S(ed1.d0((q81) ed1.Y(q81.t(c02), ((Integer) g9.e.f17698c.a(sl.f11032y8)).intValue(), TimeUnit.MILLISECONDS, this.B), g.f25059b, wxVar), Exception.class, g.f25060c, wxVar);
    }

    @Override // com.google.android.gms.internal.ads.fx
    public final void Q3(oa.a aVar, jx jxVar, cx cxVar) {
        ac.b A;
        ac.b bVar;
        ac.b bVar2;
        ac.b A2;
        Bundle bundle = new Bundle();
        nl nlVar = sl.J2;
        g9.r rVar = g9.e;
        ql qlVar = rVar.f17698c;
        ql qlVar2 = rVar.f17698c;
        if (((Boolean) qlVar.a(nlVar)).booleanValue()) {
            bundle.putLong("api-call", jxVar.f7560x.T);
            f9.k.C.f16819k.getClass();
            bundle.putLong("dynamite-enter", System.currentTimeMillis());
        }
        this.f25071w = (Context) oa.b.z1(aVar);
        if (((Boolean) qlVar2.a(sl.f10709e3)).booleanValue()) {
            g9.a();
        }
        rr0 d2 = rr0.d(this.f25071w, 22);
        d2.zza();
        if ("UNKNOWN".equals(jxVar.f7558v)) {
            List arrayList = new ArrayList();
            nl nlVar2 = sl.f10999w8;
            if (!((String) qlVar2.a(nlVar2)).isEmpty()) {
                arrayList = Arrays.asList(((String) qlVar2.a(nlVar2)).split(","));
            }
            if (arrayList.contains(zb.b(jxVar.f7560x))) {
                u81 A3 = ed1.A(new IllegalArgumentException("Unknown format is no longer supported."));
                bVar = ed1.A(new IllegalArgumentException("Unknown format is no longer supported."));
                bVar2 = A3;
                u0 u0Var = new u0(this, bVar2, jxVar, cxVar, d2);
                bVar.a(new t81(bVar, 0, u0Var), this.f25070v.b());
            }
        }
        if (((Boolean) qlVar2.a(sl.f11019xc)).booleanValue()) {
            wx wxVar = xx.f12651a;
            bVar2 = wxVar.j(new c7.r(9, this, jxVar, bundle));
            try {
                A2 = ed1.c0(bVar2, d.f25055a, wxVar);
            } catch (NullPointerException e) {
                A2 = ed1.A(e);
            }
            bVar = A2;
        } else {
            l20 A4 = A4(this.f25071w, jxVar.f7557u, jxVar.f7558v, jxVar.f7559w, jxVar.f7560x, bundle);
            v81 e8 = ed1.e(A4);
            try {
                A = (ac.b) A4.f7923b.zzb();
            } catch (NullPointerException e10) {
                A = ed1.A(e10);
            }
            bVar = A;
            bVar2 = e8;
        }
        u0 u0Var2 = new u0(this, bVar2, jxVar, cxVar, d2);
        bVar.a(new t81(bVar, 0, u0Var2), this.f25070v.b());
    }

    public final void v4(ArrayList arrayList, oa.a aVar, ku kuVar, boolean z3) {
        Map map;
        if (!((Boolean) g9.e.f17698c.a(sl.f11016x8)).booleanValue()) {
            try {
                iu iuVar = (iu) kuVar;
                Parcel g22 = iuVar.g2();
                g22.writeString("The updating URL feature is not enabled.");
                iuVar.v2(g22, 2);
                return;
            } catch (RemoteException e) {
                int i = a0.f19634b;
                l9.i.d("", e);
                return;
            }
        }
        c7.r rVar = new c7.r(7, this, arrayList, aVar);
        wx wxVar = this.A;
        ac.b j10 = wxVar.j(rVar);
        nu nuVar = this.C;
        int i10 = 0;
        if (nuVar != null && (map = nuVar.f8866v) != null && !map.isEmpty()) {
            j10 = ed1.c0(j10, new e(i10, this), wxVar);
        } else {
            int i11 = a0.f19634b;
            l9.i.e("Asset view map is empty.");
        }
        j10.a(new t81(j10, i10, new c(this, kuVar, z3, 1)), this.f25070v.b());
    }

    public final void w4(ArrayList arrayList, oa.a aVar, ku kuVar, boolean z3) {
        ArrayList arrayList2;
        ArrayList arrayList3;
        ac.b bVar;
        Map map;
        if (!((Boolean) g9.e.f17698c.a(sl.f11016x8)).booleanValue()) {
            int i = a0.f19634b;
            l9.i.f("The updating URL feature is not enabled.");
            try {
                iu iuVar = (iu) kuVar;
                Parcel g22 = iuVar.g2();
                g22.writeString("The updating URL feature is not enabled.");
                iuVar.v2(g22, 2);
                return;
            } catch (RemoteException e) {
                l9.i.d("", e);
                return;
            }
        }
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            arrayList2 = this.S;
            arrayList3 = this.R;
            if (i12 >= size) {
                break;
            }
            Object obj = arrayList.get(i12);
            i12++;
            if (z4((Uri) obj, arrayList3, arrayList2)) {
                i11++;
            }
        }
        int i13 = 1;
        if (i11 > 1) {
            String valueOf = String.valueOf(arrayList);
            int i14 = a0.f19634b;
            l9.i.f("Multiple google urls found: ".concat(valueOf));
        }
        ArrayList arrayList4 = new ArrayList();
        int size2 = arrayList.size();
        int i15 = 0;
        while (i15 < size2) {
            Object obj2 = arrayList.get(i15);
            i15++;
            Uri uri = (Uri) obj2;
            if (!z4(uri, arrayList3, arrayList2)) {
                String valueOf2 = String.valueOf(uri);
                int i16 = a0.f19634b;
                l9.i.f("Not a Google URL: ".concat(valueOf2));
                bVar = ed1.e(uri);
            } else {
                c7.r rVar = new c7.r(8, this, uri, aVar);
                wx wxVar = this.A;
                ac.b j10 = wxVar.j(rVar);
                nu nuVar = this.C;
                if (nuVar != null && (map = nuVar.f8866v) != null && !map.isEmpty()) {
                    bVar = ed1.c0(j10, new e(i13, this), wxVar);
                } else {
                    int i17 = a0.f19634b;
                    l9.i.e("Asset view map is empty.");
                    bVar = j10;
                }
            }
            arrayList4.add(bVar);
        }
        k81 k81Var = new k81(d51.u(arrayList4), true);
        k81Var.a(new t81(k81Var, i10, new c(this, kuVar, z3, i10)), this.f25070v.b());
    }

    public final void x4() {
        nl nlVar = sl.Xa;
        g9.r rVar = g9.e;
        ql qlVar = rVar.f17698c;
        ql qlVar2 = rVar.f17698c;
        if (((Boolean) qlVar.a(nlVar)).booleanValue() && !((Boolean) qlVar2.a(sl.f10654ab)).booleanValue()) {
            if (!((Boolean) qlVar2.a(sl.f10716eb)).booleanValue() || !this.V.getAndSet(true)) {
                y4();
            }
        }
    }

    public final void y4() {
        i iVar;
        ac.b A;
        if (((Boolean) bn.e.p()).booleanValue()) {
            p pVar = this.Z;
            synchronized (pVar) {
                pVar.c(true);
                pVar.c(false);
            }
            return;
        }
        if (((Boolean) g9.e.f17698c.a(sl.f11019xc)).booleanValue()) {
            A = ed1.O(new ic.c(29, this), xx.f12651a);
            iVar = this;
        } else {
            try {
                iVar = this;
            } catch (NullPointerException e) {
                e = e;
                iVar = this;
            }
            try {
                A = (ac.b) iVar.A4(this.f25071w, null, "BANNER", null, null, new Bundle()).f7923b.zzb();
            } catch (NullPointerException e8) {
                e = e8;
                A = ed1.A(e);
                k6.i iVar2 = new k6.i(27, this);
                A.a(new t81(A, 0, iVar2), iVar.f25070v.b());
            }
        }
        k6.i iVar22 = new k6.i(27, this);
        A.a(new t81(A, 0, iVar22), iVar.f25070v.b());
    }
}
