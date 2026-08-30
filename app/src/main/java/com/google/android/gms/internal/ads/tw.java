package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.JsonReader;
import android.view.View;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.io.File;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.zip.Inflater;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class tw implements l, p7, s81, ay, ij, s90 {

    /* renamed from: z, reason: collision with root package name */
    public static tw f11468z;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f11469u;

    /* renamed from: v, reason: collision with root package name */
    public Object f11470v;

    /* renamed from: w, reason: collision with root package name */
    public Object f11471w;

    /* renamed from: x, reason: collision with root package name */
    public Object f11472x;

    /* renamed from: y, reason: collision with root package name */
    public Object f11473y;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.util.ArrayList] */
    public tw(JsonReader jsonReader, Bundle bundle) {
        this.f11469u = 22;
        this.f11473y = bundle;
        if (((Boolean) g9.r.e.f17698c.a(sl.J2)).booleanValue() && bundle != null) {
            f9.k.C.f16819k.getClass();
            bundle.putLong("server-response-parse-start", System.currentTimeMillis());
        }
        ?? r02 = Collections.EMPTY_LIST;
        ArrayList arrayList = new ArrayList();
        jsonReader.beginObject();
        sp0 sp0Var = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if ("responses".equals(nextName)) {
                jsonReader.beginArray();
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String nextName2 = jsonReader.nextName();
                    if ("ad_configs".equals(nextName2)) {
                        r02 = new ArrayList();
                        jsonReader.beginArray();
                        while (jsonReader.hasNext()) {
                            r02.add(new qp0(jsonReader));
                        }
                        jsonReader.endArray();
                    } else if (nextName2.equals("common")) {
                        sp0Var = new sp0(jsonReader);
                        if (((Boolean) g9.r.e.f17698c.a(sl.K2)).booleanValue() && bundle != null) {
                            bundle.putLong("normalize-ad-response-start", sp0Var.f11106s);
                            bundle.putLong("normalize-ad-response-end", sp0Var.f11107t);
                        }
                    } else {
                        jsonReader.skipValue();
                    }
                }
                jsonReader.endObject();
                jsonReader.endArray();
            } else if (nextName.equals("actions")) {
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    jsonReader.beginObject();
                    String str = null;
                    JSONObject jSONObject = null;
                    while (jsonReader.hasNext()) {
                        String nextName3 = jsonReader.nextName();
                        if ("name".equals(nextName3)) {
                            str = jsonReader.nextString();
                        } else if ("info".equals(nextName3)) {
                            jSONObject = wa.g9.c(jsonReader);
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    if (str != null) {
                        arrayList.add(new vp0(str, jSONObject));
                    }
                    jsonReader.endObject();
                }
                jsonReader.endArray();
            }
        }
        this.f11472x = arrayList;
        this.f11470v = r02;
        this.f11471w = sp0Var == null ? new sp0(new JsonReader(new StringReader("{}"))) : sp0Var;
    }

    public static tw c(Reader reader, Bundle bundle) {
        try {
            try {
                return new tw(new JsonReader(reader), bundle);
            } finally {
                la.b.d(reader);
            }
        } catch (IOException | AssertionError | IllegalStateException | NumberFormatException | JSONException e) {
            throw new cg0("unable to parse ServerResponse", e);
        }
    }

    public static synchronized tw j(Context context) {
        synchronized (tw.class) {
            try {
                tw twVar = f11468z;
                if (twVar != null) {
                    return twVar;
                }
                Context applicationContext = context.getApplicationContext();
                sl.a(applicationContext);
                f9.k kVar = f9.k.C;
                k9.c0 g8 = kVar.f16817h.g();
                g8.k(applicationContext);
                applicationContext.getClass();
                la.a aVar = kVar.f16819k;
                aVar.getClass();
                ww wwVar = kVar.f16833y;
                lo1.c(wwVar, ww.class);
                tw twVar2 = new tw(applicationContext, aVar, g8, wwVar);
                f11468z = twVar2;
                ow owVar = (ow) ((rr1) twVar2.f11471w).zzb();
                SharedPreferences sharedPreferences = owVar.f9248b;
                sharedPreferences.registerOnSharedPreferenceChangeListener(owVar);
                owVar.onSharedPreferenceChanged(sharedPreferences, "gad_has_consent_for_cookies");
                nl nlVar = sl.f10756h1;
                g9.r rVar = g9.r.e;
                if (((Boolean) rVar.f17698c.a(nlVar)).booleanValue()) {
                    owVar.onSharedPreferenceChanged(sharedPreferences, "IABTCF_TCString");
                } else {
                    owVar.onSharedPreferenceChanged(sharedPreferences, "IABTCF_PurposeConsents");
                }
                zw zwVar = (zw) ((rr1) f11468z.f11473y).zzb();
                if (((Boolean) rVar.f17698c.a(sl.f10660b1)).booleanValue()) {
                    HashMap P = k9.f0.P((String) rVar.f17698c.a(sl.f10676c1));
                    Iterator it = P.keySet().iterator();
                    while (it.hasNext()) {
                        zwVar.a((String) it.next());
                    }
                    yw ywVar = new yw(zwVar, P);
                    synchronized (zwVar) {
                        zwVar.f13285b.add(ywVar);
                    }
                }
                return f11468z;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static final boolean y(Context context) {
        if (((Boolean) cn.f5128c.p()).booleanValue()) {
            return false;
        }
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        return k9.f0.I(context).f10553v.toLowerCase(Locale.ROOT).equals("ru");
    }

    @Override // com.google.android.gms.internal.ads.ij
    public void a(fl flVar) {
        lj ljVar = (lj) ((gl) flVar.f4845v).B().r();
        kj kjVar = (kj) this.f11470v;
        ljVar.b();
        ((mj) ljVar.f4845v).A(kjVar);
        flVar.b();
        ((gl) flVar.f4845v).G((mj) ljVar.c());
        cl clVar = (cl) ((gl) flVar.f4845v).z().r();
        String str = (String) this.f11471w;
        clVar.b();
        ((dl) clVar.f4845v).A(str);
        bk bkVar = (bk) this.f11472x;
        clVar.b();
        ((dl) clVar.f4845v).B(bkVar);
        flVar.b();
        ((gl) flVar.f4845v).F((dl) clVar.c());
        String str2 = (String) this.f11473y;
        flVar.b();
        ((gl) flVar.f4845v).A(str2);
    }

    public jr b(Context context, l9.a aVar, vr0 vr0Var) {
        jr jrVar;
        String str;
        synchronized (this.f11471w) {
            try {
                if (((jr) this.f11473y) == null) {
                    Context applicationContext = context.getApplicationContext();
                    if (applicationContext == null) {
                        applicationContext = context;
                    }
                    if (y(context)) {
                        str = (String) g9.r.e.f17698c.a(sl.f10674c);
                    } else {
                        str = (String) ed1.B.p();
                    }
                    this.f11473y = new jr(applicationContext, aVar, str, vr0Var);
                }
                jrVar = (jr) this.f11473y;
            } catch (Throwable th) {
                throw th;
            }
        }
        return jrVar;
    }

    /* JADX WARN: Type inference failed for: r14v1, types: [com.google.android.gms.internal.ads.n81, ac.b, com.google.android.gms.internal.ads.e81] */
    public n81 d(Bundle bundle, Object obj) {
        rr0 d2 = rr0.d((Context) this.f11470v, 8);
        d2.zza();
        Set<qn0> set = (Set) this.f11471w;
        ArrayList arrayList = new ArrayList(set.size());
        List arrayList2 = new ArrayList();
        nl nlVar = sl.f10767hd;
        g9.r rVar = g9.r.e;
        ql qlVar = rVar.f17698c;
        ql qlVar2 = rVar.f17698c;
        if (!((String) qlVar.a(nlVar)).isEmpty()) {
            arrayList2 = Arrays.asList(((String) qlVar2.a(nlVar)).split(","));
        }
        Bundle bundle2 = new Bundle();
        if (((Boolean) qlVar2.a(sl.J2)).booleanValue() && bundle != null) {
            f9.k.C.f16819k.getClass();
            long currentTimeMillis = System.currentTimeMillis();
            if (obj instanceof Bundle) {
                bundle.putLong("client-signals-start", currentTimeMillis);
            } else {
                bundle.putLong("gms-signals-start", currentTimeMillis);
            }
        }
        for (qn0 qn0Var : set) {
            if (!arrayList2.contains(String.valueOf(qn0Var.zzb()))) {
                f9.k.C.f16819k.getClass();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                ac.b zza = qn0Var.zza();
                zza.a(new hz(this, elapsedRealtime, qn0Var, bundle2), xx.f12657h);
                arrayList.add(zza);
            }
        }
        d51 u9 = d51.u(arrayList);
        vb0 vb0Var = new vb0(arrayList, obj, bundle, bundle2, 2);
        Executor executor = (Executor) this.f11472x;
        ?? e81Var = new e81(u9, true, false);
        e81Var.J = new m81(e81Var, vb0Var, executor);
        e81Var.x();
        if (vr0.a()) {
            ed1.V(e81Var, (ur0) this.f11473y, d2, false);
        }
        return e81Var;
    }

    @Override // com.google.android.gms.internal.ads.s90
    public void e(boolean z3, Context context, y60 y60Var) {
        boolean H3;
        zs zsVar = (zs) this.f11471w;
        try {
            int ordinal = ((z8.b) this.f11472x).ordinal();
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal == 5) {
                        H3 = zsVar.n0(new oa.b(context));
                    }
                    throw new Exception("Adapter failed to show.");
                }
                H3 = zsVar.Y(new oa.b(context));
            } else {
                H3 = zsVar.H3(new oa.b(context));
            }
            if (H3) {
                a70 a70Var = (a70) this.f11473y;
                if (a70Var != null) {
                    if (!((Boolean) g9.r.e.f17698c.a(sl.d2)).booleanValue() && ((qp0) this.f11470v).Y == 2) {
                        a70Var.l();
                        return;
                    }
                    return;
                }
                return;
            }
            throw new Exception("Adapter failed to show.");
        } catch (Throwable th) {
            throw new Exception(th);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x006a, code lost:
    
        if (r10 != false) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0181  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean f(com.google.android.gms.internal.ads.ih r9, com.google.android.gms.internal.ads.s6 r10) {
        /*
            Method dump skipped, instructions count: 413
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.tw.f(com.google.android.gms.internal.ads.ih, com.google.android.gms.internal.ads.s6):boolean");
    }

    public jr i(Context context, l9.a aVar, vr0 vr0Var) {
        jr jrVar;
        String str;
        synchronized (this.f11470v) {
            try {
                if (((jr) this.f11472x) == null) {
                    if (y(context)) {
                        str = (String) g9.r.e.f17698c.a(sl.f10674c);
                    } else if (((Boolean) cn.f5132h.p()).booleanValue()) {
                        str = (String) g9.r.e.f17698c.a(sl.f10642a);
                    } else {
                        str = (String) g9.r.e.f17698c.a(sl.f10658b);
                    }
                    Context applicationContext = context.getApplicationContext();
                    if (applicationContext != null) {
                        context = applicationContext;
                    }
                    this.f11472x = new jr(context, aVar, str, vr0Var);
                }
                jrVar = (jr) this.f11472x;
            } catch (Throwable th) {
                throw th;
            }
        }
        return jrVar;
    }

    public synchronized void k(gb gbVar) {
        try {
            HashMap hashMap = (HashMap) this.f11470v;
            String d2 = gbVar.d();
            List list = (List) hashMap.remove(d2);
            if (list != null && !list.isEmpty()) {
                if (mb.f8298a) {
                    mb.a("%d waiting requests for cacheKey=%s; resend to network", Integer.valueOf(list.size()), d2);
                }
                gb gbVar2 = (gb) list.remove(0);
                hashMap.put(d2, list);
                synchronized (gbVar2.f6357y) {
                    gbVar2.E = this;
                }
                try {
                    ((BlockingQueue) this.f11472x).put(gbVar2);
                } catch (InterruptedException e) {
                    mb.c("Couldn't add request to queue. %s", e.toString());
                    Thread.currentThread().interrupt();
                    ya yaVar = (ya) this.f11471w;
                    yaVar.f12826x = true;
                    yaVar.interrupt();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.ay, com.google.android.gms.internal.ads.n80, com.google.android.gms.internal.ads.ie0
    /* renamed from: l */
    public void mo205l(Object obj) {
        er erVar = (er) obj;
        k9.a0.k("callJs > getEngine: Promise fulfilled");
        Object obj2 = this.f11471w;
        yx yxVar = (yx) this.f11472x;
        lr lrVar = (lr) this.f11473y;
        br brVar = (br) this.f11470v;
        lrVar.getClass();
        try {
            k9.f0 f0Var = f9.k.C.f16813c;
            String uuid = UUID.randomUUID().toString();
            lp.f8083j.a(uuid, new kr(brVar, lrVar, yxVar));
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(FacebookMediationAdapter.KEY_ID, uuid);
            jSONObject.put("args", ((hr) lrVar.f8111d).r(obj2));
            String str = (String) lrVar.f8109b;
            rq rqVar = (rq) erVar;
            rqVar.getClass();
            rqVar.p(str, jSONObject.toString());
        } catch (Exception e) {
            try {
                yxVar.c(e);
                int i = k9.a0.f19634b;
                l9.i.d("Unable to invokeJavascript", e);
            } finally {
                brVar.l();
            }
        }
    }

    public mh m(int i) {
        String string;
        SharedPreferences sharedPreferences = (SharedPreferences) this.f11472x;
        if (i == 1) {
            string = sharedPreferences.getString(z(), null);
        } else {
            string = sharedPreferences.getString(v(), null);
        }
        if (!TextUtils.isEmpty(string)) {
            try {
                byte[] m4 = la.b.m(string);
                mh E = mh.E(om1.z(m4, 0, m4.length));
                String z3 = E.z();
                File c10 = ct.c(z3, "pcam.jar", o());
                if (!c10.exists()) {
                    c10 = ct.c(z3, "pcam", o());
                }
                File c11 = ct.c(z3, "pcbc", o());
                if (c10.exists()) {
                    if (c11.exists()) {
                        return E;
                    }
                }
            } catch (pn1 unused) {
            }
        }
        return null;
    }

    public synchronized boolean n(gb gbVar) {
        try {
            HashMap hashMap = (HashMap) this.f11470v;
            String d2 = gbVar.d();
            if (hashMap.containsKey(d2)) {
                List list = (List) hashMap.get(d2);
                if (list == null) {
                    list = new ArrayList();
                }
                gbVar.a("waiting-for-response");
                list.add(gbVar);
                hashMap.put(d2, list);
                if (mb.f8298a) {
                    mb.b("Request for cacheKey=%s is in flight, putting on hold.", d2);
                }
                return true;
            }
            hashMap.put(d2, null);
            synchronized (gbVar.f6357y) {
                gbVar.E = this;
            }
            if (mb.f8298a) {
                mb.b("new request, sending to network %s", d2);
            }
            return false;
        } catch (Throwable th) {
            throw th;
        }
    }

    public File o() {
        File file = new File((File) this.f11470v, Integer.toString(((hh) this.f11473y).f6816u));
        if (!file.exists()) {
            file.mkdir();
        }
        return file;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0064  */
    @Override // com.google.android.gms.internal.ads.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.google.android.gms.internal.ads.y51 p(int r17, com.google.android.gms.internal.ads.hi r18, int[] r19) {
        /*
            Method dump skipped, instructions count: 221
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.tw.p(int, com.google.android.gms.internal.ads.hi, int[]):com.google.android.gms.internal.ads.y51");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.ads.j70, com.google.android.gms.internal.ads.um1] */
    public j70 q(Set set) {
        return new um1(set);
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x00cc, code lost:
    
        if (r7.equals("PRECISE") != false) goto L60;
     */
    /* JADX WARN: Removed duplicated region for block: B:284:0x0679  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x07ef A[Catch: all -> 0x07bc, TryCatch #4 {all -> 0x07bc, blocks: (B:323:0x0779, B:327:0x07aa, B:336:0x07b0, B:330:0x07db, B:332:0x07ef, B:340:0x07bf, B:342:0x07cb, B:343:0x07d0, B:344:0x07fd), top: B:322:0x0779, inners: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:334:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:335:0x07b0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:352:0x0837  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x084f  */
    /* JADX WARN: Removed duplicated region for block: B:365:0x088b  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f2 A[Catch: JSONException -> 0x008e, TryCatch #7 {JSONException -> 0x008e, blocks: (B:18:0x004c, B:28:0x008a, B:30:0x00a8, B:40:0x00da, B:44:0x00f2, B:46:0x00f8, B:51:0x0101), top: B:17:0x004c }] */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ef  */
    @Override // com.google.android.gms.internal.ads.s81
    /* renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo202r(java.lang.Object r31) {
        /*
            Method dump skipped, instructions count: 2374
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.tw.mo202r(java.lang.Object):void");
    }

    public tq0 s() {
        aq0 zzb = ((j60) this.f11471w).zzb();
        g9.z2 z2Var = zzb.f4581d;
        String str = zzb.f4583g;
        g9.f3 f3Var = zzb.f4586k;
        qq0 qq0Var = (qq0) ((zd1) this.f11470v).f13143w;
        return new tq0(z2Var, str, new fv(qq0Var.f9972u).a().f6474j, qq0Var.A, f3Var);
    }

    @Override // com.google.android.gms.internal.ads.s81
    public void t(Throwable th) {
        ur0 ur0Var;
        int i;
        switch (this.f11469u) {
            case 6:
                f9.k.C.f16817h.d("OpenGmsgHandler.attributionReportingManager", th);
                return;
            case 9:
                String valueOf = String.valueOf((Uri) this.f11472x);
                int i10 = k9.a0.f19634b;
                l9.i.f("Failed to parse gmsg params for: ".concat(valueOf));
                return;
            case 10:
                ((g30) this.f11473y).e.f(new iz(this, th, (xs0) this.f11470v, (String) this.f11471w, (ic.c) this.f11472x));
                return;
            case 14:
                return;
            case 20:
                if (((Boolean) g9.r.e.f17698c.a(sl.I6)).booleanValue()) {
                    k9.a0.l("Banner ad failed to load", th);
                }
                oo0 oo0Var = (oo0) this.f11473y;
                synchronized (oo0Var) {
                    d20 d20Var = (d20) this.f11472x;
                    g9.y1 A = x21.A(th, ((i50) d20Var.f5283t.zzb()).f6997l);
                    oo0Var.f9183n = A;
                    ((u60) d20Var.f5276m.zzb()).x(A);
                    ay0.h(A.f17714u, "BannerAdLoader.onFailure", th);
                    if (oo0Var.f9182m) {
                        oo0Var.e();
                        x70 x70Var = oo0Var.f9178h;
                        i80 i80Var = oo0Var.f9179j;
                        synchronized (i80Var) {
                            i = i80Var.f7048u;
                        }
                        x70Var.U1(i);
                    }
                    if (((Boolean) rm.f10240c.p()).booleanValue() && (ur0Var = (ur0) this.f11470v) != null) {
                        ur0Var.f(A);
                        rr0 rr0Var = (rr0) this.f11471w;
                        rr0Var.b(th);
                        rr0Var.a(false);
                        ur0Var.a(rr0Var);
                        ur0Var.h();
                    } else {
                        vr0 vr0Var = oo0Var.i;
                        rr0 rr0Var2 = (rr0) this.f11471w;
                        rr0Var2.f(A);
                        rr0Var2.b(th);
                        rr0Var2.a(false);
                        vr0Var.b(rr0Var2.m());
                    }
                }
                return;
            case 23:
                return;
            default:
                rr0 rr0Var3 = (rr0) this.f11470v;
                if (rr0Var3 != null) {
                    rr0Var3.a(false);
                    ur0 ur0Var2 = (ur0) this.f11471w;
                    if (ur0Var2 == null) {
                        ((xs0) this.f11473y).f12617f.b(rr0Var3.m());
                        return;
                    } else {
                        ur0Var2.a(rr0Var3);
                        ur0Var2.h();
                        return;
                    }
                }
                return;
        }
    }

    public fa1 u() {
        bl0 bl0Var;
        gl1 b10;
        ka1 ka1Var = (ka1) this.f11470v;
        if (ka1Var != null) {
            bl0 bl0Var2 = (bl0) this.f11471w;
            if (bl0Var2 != null && (bl0Var = (bl0) this.f11472x) != null) {
                if (ka1Var.f7697a == ((gl1) bl0Var2.f4819v).f6427a.length) {
                    if (ka1Var.f7698b == ((gl1) bl0Var.f4819v).f6427a.length) {
                        if (ka1Var.a() && ((Integer) this.f11473y) == null) {
                            androidx.datastore.preferences.protobuf.s1.q("Cannot create key without ID requirement with parameters with ID requirement");
                            return null;
                        }
                        if (!((ka1) this.f11470v).a() && ((Integer) this.f11473y) != null) {
                            androidx.datastore.preferences.protobuf.s1.q("Cannot create key with ID requirement with parameters without ID requirement");
                            return null;
                        }
                        q91 q91Var = ((ka1) this.f11470v).e;
                        if (q91Var == q91.B) {
                            b10 = kd1.f7721a;
                        } else if (q91Var == q91.A) {
                            b10 = kd1.a(((Integer) this.f11473y).intValue());
                        } else if (q91Var == q91.f9790z) {
                            b10 = kd1.b(((Integer) this.f11473y).intValue());
                        } else {
                            q.x.o("Unknown AesCtrHmacAeadParameters.Variant: ".concat(String.valueOf(q91Var)));
                            return null;
                        }
                        return new fa1((ka1) this.f11470v, (bl0) this.f11471w, (bl0) this.f11472x, b10, (Integer) this.f11473y);
                    }
                    androidx.datastore.preferences.protobuf.s1.q("HMAC key size mismatch");
                    return null;
                }
                androidx.datastore.preferences.protobuf.s1.q("AES key size mismatch");
                return null;
            }
            androidx.datastore.preferences.protobuf.s1.q("Cannot build without key material");
            return null;
        }
        androidx.datastore.preferences.protobuf.s1.q("Cannot build without parameters");
        return null;
    }

    public String v() {
        int i = ((hh) this.f11473y).f6816u;
        return a5.a.f(i, "FBAMTD", new StringBuilder(String.valueOf(i).length() + 6));
    }

    @Override // com.google.android.gms.internal.ads.p7
    public void w(int i, int i10, r7 r7Var, byte[] bArr) {
        xk0 xk0Var;
        s40 s40Var;
        int i11;
        int i12;
        int i13;
        xk0 xk0Var2;
        int O;
        xk0 xk0Var3 = (xk0) this.f11470v;
        xk0Var3.z(bArr, i + i10);
        xk0Var3.E(i);
        if (((Inflater) this.f11473y) == null) {
            this.f11473y = new Inflater();
        }
        xk0 xk0Var4 = (xk0) this.f11471w;
        if (bq0.i(xk0Var3, xk0Var4, (Inflater) this.f11473y)) {
            xk0Var3.z(xk0Var4.f12580a, xk0Var4.f12582c);
        }
        b8 b8Var = (b8) this.f11472x;
        int i14 = 0;
        b8Var.f4732d = 0;
        xk0 xk0Var5 = b8Var.f4729a;
        b8Var.e = 0;
        b8Var.f4733f = 0;
        b8Var.f4734g = 0;
        b8Var.f4735h = 0;
        b8Var.i = 0;
        xk0Var5.y(0);
        b8Var.f4731c = false;
        int[] iArr = b8Var.f4730b;
        ArrayList arrayList = new ArrayList();
        while (xk0Var3.B() >= 3) {
            int i15 = xk0Var3.f12582c;
            int K = xk0Var3.K();
            int L = xk0Var3.L();
            int i16 = xk0Var3.f12581b + L;
            if (i16 > i15) {
                xk0Var3.E(i15);
                xk0Var = xk0Var5;
                s40Var = null;
                i11 = i14;
            } else {
                if (K != 128) {
                    switch (K) {
                        case 20:
                            if (L % 5 != 2) {
                                xk0Var2 = xk0Var3;
                                xk0Var = xk0Var5;
                            } else {
                                xk0Var3.G(2);
                                Arrays.fill(iArr, i14);
                                int i17 = L / 5;
                                int i18 = i14;
                                while (i18 < i17) {
                                    int K2 = xk0Var3.K();
                                    int K3 = xk0Var3.K();
                                    int K4 = xk0Var3.K();
                                    int K5 = xk0Var3.K();
                                    double d2 = K3;
                                    int K6 = xk0Var3.K() << 24;
                                    String str = bq0.f4860a;
                                    xk0 xk0Var6 = xk0Var3;
                                    double d10 = K4 - 128;
                                    double d11 = K5 - 128;
                                    iArr[K2] = (Math.max(0, Math.min((int) ((d2 - (0.34414d * d11)) - (d10 * 0.71414d)), 255)) << 8) | K6 | (Math.max(0, Math.min((int) ((1.402d * d10) + d2), 255)) << 16) | Math.max(0, Math.min((int) ((1.772d * d11) + d2), 255));
                                    i18++;
                                    xk0Var3 = xk0Var6;
                                    xk0Var5 = xk0Var5;
                                }
                                xk0Var2 = xk0Var3;
                                xk0Var = xk0Var5;
                                b8Var.f4731c = true;
                            }
                            xk0Var3 = xk0Var2;
                            i11 = 0;
                            s40Var = null;
                            break;
                        case gl.zzm /* 21 */:
                            if (L >= 4) {
                                xk0Var3.G(3);
                                int i19 = L - 4;
                                if ((128 & xk0Var3.K()) != 0) {
                                    if (i19 >= 7 && (O = xk0Var3.O()) >= 4) {
                                        b8Var.f4735h = xk0Var3.L();
                                        b8Var.i = xk0Var3.L();
                                        xk0Var5.y(O - 4);
                                        i19 = L - 11;
                                    }
                                }
                                int i20 = xk0Var5.f12581b;
                                int i21 = xk0Var5.f12582c;
                                if (i20 < i21 && i19 > 0) {
                                    int min = Math.min(i19, i21 - i20);
                                    xk0Var3.H(xk0Var5.f12580a, i20, min);
                                    xk0Var5.E(i20 + min);
                                    break;
                                }
                            }
                            break;
                        case 22:
                            if (L >= 19) {
                                b8Var.f4732d = xk0Var3.L();
                                b8Var.e = xk0Var3.L();
                                xk0Var3.G(11);
                                b8Var.f4733f = xk0Var3.L();
                                b8Var.f4734g = xk0Var3.L();
                                break;
                            }
                            break;
                    }
                    xk0Var = xk0Var5;
                    s40Var = null;
                    i11 = i14;
                } else {
                    xk0 xk0Var7 = xk0Var3;
                    xk0Var = xk0Var5;
                    if (b8Var.f4732d != 0 && b8Var.e != 0 && b8Var.f4735h != 0 && b8Var.i != 0 && (i12 = xk0Var.f12582c) != 0 && xk0Var.f12581b == i12 && b8Var.f4731c) {
                        xk0Var.E(0);
                        int i22 = b8Var.f4735h * b8Var.i;
                        int[] iArr2 = new int[i22];
                        int i23 = 0;
                        while (i23 < i22) {
                            int K7 = xk0Var.K();
                            if (K7 != 0) {
                                iArr2[i23] = iArr[K7];
                                i23++;
                            } else {
                                int K8 = xk0Var.K();
                                if (K8 != 0) {
                                    int i24 = K8 & 63;
                                    if ((K8 & 64) != 0) {
                                        i24 = (i24 << 8) | xk0Var.K();
                                    }
                                    if ((K8 & 128) == 0) {
                                        i13 = iArr[0];
                                    } else {
                                        i13 = iArr[xk0Var.K()];
                                    }
                                    int i25 = i23 + i24;
                                    Arrays.fill(iArr2, i23, i25, i13);
                                    i23 = i25;
                                }
                            }
                        }
                        Bitmap createBitmap = Bitmap.createBitmap(iArr2, b8Var.f4735h, b8Var.i, Bitmap.Config.ARGB_8888);
                        float f10 = b8Var.f4733f;
                        float f11 = b8Var.f4732d;
                        float f12 = f10 / f11;
                        float f13 = b8Var.f4734g;
                        float f14 = b8Var.e;
                        s40Var = new s40(null, null, null, createBitmap, f13 / f14, 0, 0, f12, 0, Integer.MIN_VALUE, -3.4028235E38f, b8Var.f4735h / f11, b8Var.i / f14, Integer.MIN_VALUE, 0.0f, 0);
                    } else {
                        s40Var = null;
                    }
                    i11 = 0;
                    b8Var.f4732d = 0;
                    b8Var.e = 0;
                    b8Var.f4733f = 0;
                    b8Var.f4734g = 0;
                    b8Var.f4735h = 0;
                    b8Var.i = 0;
                    xk0Var.y(0);
                    b8Var.f4731c = false;
                    xk0Var3 = xk0Var7;
                }
                xk0Var3.E(i16);
            }
            if (s40Var != null) {
                arrayList.add(s40Var);
            }
            i14 = i11;
            xk0Var5 = xk0Var;
        }
        r7Var.mo213l(new l7(arrayList, -9223372036854775807L, -9223372036854775807L));
    }

    public void x(int i, ac.b bVar) {
        if (((Boolean) g9.r.e.f17698c.a(sl.Q2)).booleanValue()) {
            c7.x xVar = new c7.x(this, i, 5);
            bVar.a(new t81(bVar, 0, xVar), (wx) this.f11470v);
        }
    }

    public String z() {
        int i = ((hh) this.f11473y).f6816u;
        return a5.a.f(i, "LATMTD", new StringBuilder(String.valueOf(i).length() + 6));
    }

    @Override // com.google.android.gms.internal.ads.s90
    public qp0 zzb() {
        return (qp0) this.f11470v;
    }

    private final void g(Throwable th) {
    }

    private final void h(Throwable th) {
    }

    public tw(Context context, Executor executor, cv0 cv0Var, hv0 hv0Var) {
        this.f11469u = 25;
        this.f11470v = context;
        this.f11471w = executor;
        this.f11472x = cv0Var;
    }

    public tw(Context context, la.a aVar, k9.c0 c0Var, ww wwVar) {
        this.f11469u = 0;
        this.f11470v = aVar;
        tr1 a10 = tr1.a(context);
        tr1 a11 = tr1.a(c0Var);
        int i = 0;
        this.f11471w = rr1.a(new pw(a10, a11, i));
        tr1 a12 = tr1.a(aVar);
        rr1 a13 = rr1.a(new rw(a12, a11, tr1.a(wwVar), i));
        this.f11472x = a13;
        this.f11473y = rr1.a(new ax(a10, new sw(a12, a13), 0));
    }

    public tw(View view, h00 h00Var, y40 y40Var, rp0 rp0Var) {
        this.f11469u = 11;
        this.f11471w = view;
        this.f11473y = h00Var;
        this.f11470v = y40Var;
        this.f11472x = rp0Var;
    }

    public tw(qp0 qp0Var, zs zsVar, z8.b bVar) {
        this.f11469u = 17;
        this.f11473y = null;
        this.f11470v = qp0Var;
        this.f11471w = zsVar;
        this.f11472x = bVar;
    }

    public tw(zd1 zd1Var, j60 j60Var, Executor executor) {
        this.f11469u = 21;
        this.f11470v = zd1Var;
        this.f11471w = j60Var;
        this.f11472x = executor;
    }

    public /* synthetic */ tw(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.f11469u = i;
        this.f11470v = obj;
        this.f11471w = obj2;
        this.f11472x = obj3;
        this.f11473y = obj4;
    }

    public /* synthetic */ tw(Object obj, Object obj2, Object obj3, Object obj4, int i, boolean z3) {
        this.f11469u = i;
        this.f11470v = obj2;
        this.f11471w = obj3;
        this.f11472x = obj4;
        this.f11473y = obj;
    }

    public tw(int i) {
        this.f11469u = i;
        switch (i) {
            case 7:
                this.f11470v = new Object();
                this.f11471w = new Object();
                return;
            case 29:
                this.f11470v = null;
                this.f11471w = null;
                this.f11472x = null;
                this.f11473y = null;
                return;
            default:
                this.f11470v = new xk0();
                this.f11471w = new xk0();
                this.f11472x = new b8();
                return;
        }
    }

    public tw(Context context, hh hhVar) {
        this.f11469u = 26;
        this.f11472x = context.getSharedPreferences("pcvmspf", 0);
        File dir = context.getDir("pccache", 0);
        ct.x(dir, false);
        this.f11470v = dir;
        File dir2 = context.getDir("tmppccache", 0);
        ct.x(dir2, true);
        this.f11471w = dir2;
        this.f11473y = hhVar;
    }

    public tw(Context context, String str) {
        String packageName;
        this.f11469u = 5;
        this.f11472x = context;
        this.f11473y = str;
        this.f11470v = (String) ay0.f4630v.p();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f11471w = linkedHashMap;
        linkedHashMap.put("s", "gmob_sdk");
        linkedHashMap.put("v", "3");
        linkedHashMap.put("os", Build.VERSION.RELEASE);
        linkedHashMap.put("api_v", Build.VERSION.SDK);
        f9.k kVar = f9.k.C;
        k9.f0 f0Var = kVar.f16813c;
        linkedHashMap.put("device", k9.f0.O());
        if (context.getApplicationContext() != null) {
            packageName = context.getApplicationContext().getPackageName();
        } else {
            packageName = context.getPackageName();
        }
        linkedHashMap.put("app", packageName);
        linkedHashMap.put("is_lite_sdk", true != k9.f0.f(context) ? "0" : "1");
        lx0 lx0Var = kVar.f16824p;
        lx0Var.getClass();
        ac.b j10 = xx.f12651a.j(new xe(lx0Var, context));
        try {
            linkedHashMap.put("network_coarse", Integer.toString(((gv) j10.get()).f6474j));
            linkedHashMap.put("network_fine", Integer.toString(((gv) j10.get()).f6475k));
        } catch (Exception e) {
            f9.k.C.f16817h.d("CsiConfiguration.CsiConfiguration", e);
        }
        nl nlVar = sl.Kc;
        g9.r rVar = g9.r.e;
        ql qlVar = rVar.f17698c;
        ql qlVar2 = rVar.f17698c;
        if (((Boolean) qlVar.a(nlVar)).booleanValue()) {
            LinkedHashMap linkedHashMap2 = (LinkedHashMap) this.f11471w;
            k9.f0 f0Var2 = f9.k.C.f16813c;
            linkedHashMap2.put("is_bstar", true != k9.f0.d(context) ? "0" : "1");
        }
        if (((Boolean) qlVar2.a(sl.La)).booleanValue() && ((Boolean) qlVar2.a(sl.f10678c3)).booleanValue()) {
            f9.k kVar2 = f9.k.C;
            if (xy.y(kVar2.f16817h.f9637g)) {
                return;
            }
            ((LinkedHashMap) this.f11471w).put("plugin", kVar2.f16817h.f9637g);
        }
    }

    public tw(Context context, wx wxVar, Set set, ur0 ur0Var) {
        this.f11469u = 19;
        this.f11470v = context;
        this.f11472x = wxVar;
        this.f11471w = set;
        this.f11473y = ur0Var;
    }

    public tw(ya yaVar, BlockingQueue blockingQueue, lx0 lx0Var) {
        this.f11469u = 4;
        this.f11470v = new HashMap();
        this.f11473y = lx0Var;
        this.f11471w = yaVar;
        this.f11472x = blockingQueue;
    }

    public tw(g30 g30Var, xs0 xs0Var, String str, ic.c cVar) {
        this.f11469u = 10;
        this.f11470v = xs0Var;
        this.f11471w = str;
        this.f11472x = cVar;
        Objects.requireNonNull(g30Var);
        this.f11473y = g30Var;
    }

    public tw(o80 o80Var) {
        this.f11469u = 27;
        this.f11473y = this;
        this.f11470v = o80Var;
        rr1 a10 = rr1.a(new w50((tr1) o80Var.f9021b, (tr1) o80Var.f9023d, (rr1) o80Var.f9029l, rr1.a(ay0.D), (rr1) o80Var.f9031n, (rr1) o80Var.i, (tr1) o80Var.e));
        this.f11471w = a10;
        this.f11472x = rr1.a(new w50((tr1) o80Var.f9023d, a10, (rr1) o80Var.f9029l, (rr1) o80Var.f9028k, rr1.a(x21.f12446f0), new sx0(3, this), (tr1) o80Var.e));
    }

    public tw(y51 y51Var, mu muVar, x90 x90Var, z11 z11Var) {
        Object obj;
        this.f11469u = 28;
        if (y51Var != null) {
            obj = d51.u(y51Var);
        } else {
            b51 b51Var = d51.f5314v;
            obj = y51.f12781y;
        }
        this.f11470v = obj;
        this.f11471w = muVar;
        this.f11472x = x90Var;
        this.f11473y = z11Var;
    }
}
