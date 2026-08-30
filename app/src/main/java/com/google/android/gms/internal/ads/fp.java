package com.google.android.gms.internal.ads;
import a0.k;
import f9.g;
import f9.k;
import g9.a;
import j6.l;
import k9.a0;
import l9.a;

import android.content.Context;
import android.content.MutableContextWrapper;
import android.net.TrafficStats;
import android.os.StrictMode;
import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class fp implements zx, ay, gr, hr, qu, q2, s81, n80 {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f6143u;

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ fp f6138v = new fp(1);

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ fp f6139w = new fp(5);

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ fp f6140x = new fp(21);

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ fp f6141y = new fp(22);

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ fp f6142z = new fp(26);
    public static final /* synthetic */ fp A = new fp(27);
    public static final /* synthetic */ fp B = new fp(28);
    public static final /* synthetic */ fp C = new fp(29);

    public /* synthetic */ fp(int i) {
        this.f6143u = i;
    }

    public static final h00 e(final Context context, final x0 x0Var, final String str, final boolean z3, final boolean z9, final of ofVar, final hm hmVar, final l9.a aVar, final jk0 jk0Var, final j6.l lVar, final jj jjVar, final qp0 qp0Var, final sp0 sp0Var, final wh0 wh0Var, final cq0 cq0Var, final be0 be0Var) {
        sl.a(context);
        try {
            r31 r31Var = new r31() { // from class: com.google.android.gms.internal.ads.l00
                /* JADX WARN: Type inference failed for: r3v1, types: [com.google.android.gms.internal.ads.d10, android.content.MutableContextWrapper] */
                @Override // com.google.android.gms.internal.ads.r31
                public final Object zza() {
                    x0 x0Var2 = x0Var;
                    String str2 = str;
                    boolean z10 = z3;
                    boolean z11 = z9;
                    wh0 wh0Var2 = wh0Var;
                    be0 be0Var2 = be0Var;
                    f9.g gVar = jk0Var;
                    j6.l lVar2 = lVar;
                    jj jjVar2 = jjVar;
                    qp0 qp0Var2 = qp0Var;
                    sp0 sp0Var2 = sp0Var;
                    cq0 cq0Var2 = cq0Var;
                    of ofVar2 = ofVar;
                    hm hmVar2 = hmVar;
                    l9.a aVar2 = aVar;
                    Context context2 = context;
                    try {
                        TrafficStats.setThreadStatsTag(264);
                        int i = s00.f10415w0;
                        MutableContextWrapper mutableContextWrapper = new MutableContextWrapper(context2);
                        mutableContextWrapper.setBaseContext(context2);
                        q00 q00Var = new q00(new s00(mutableContextWrapper, x0Var2, str2, z10, ofVar2, hmVar2, aVar2, gVar, lVar2, jjVar2, qp0Var2, sp0Var2, cq0Var2), be0Var2);
                        q00Var.setWebViewClient(f9.k.C.f16815f.f(q00Var, jjVar2, z11, wh0Var2));
                        q00Var.setWebChromeClient(new g00(q00Var));
                        return q00Var;
                    } finally {
                        TrafficStats.clearThreadStatsTag();
                    }
                }
            };
            StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
            try {
                StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
                Object zza = r31Var.zza();
                StrictMode.setThreadPolicy(threadPolicy);
                return (h00) zza;
            } catch (Throwable th) {
                StrictMode.setThreadPolicy(threadPolicy);
                throw th;
            }
        } catch (Throwable th2) {
            throw new Exception("Webview initialization failed.", th2);
        }
    }

    public static final void f(String str, JSONObject jSONObject) {
        JSONArray optJSONArray = jSONObject.optJSONArray(str);
        if (optJSONArray != null) {
            ArrayList arrayList = new ArrayList(optJSONArray.length());
            for (int i = 0; i < optJSONArray.length(); i++) {
                arrayList.add(optJSONArray.getString(i));
            }
            Collections.unmodifiableList(arrayList);
        }
    }

    @Override // com.google.android.gms.internal.ads.gr
    public /* synthetic */ Object a(JSONObject jSONObject) {
        switch (this.f6143u) {
            case 4:
                return jSONObject;
            default:
                return new ByteArrayInputStream(jSONObject.toString().getBytes(StandardCharsets.UTF_8));
        }
    }

    @Override // com.google.android.gms.internal.ads.ay, com.google.android.gms.internal.ads.n80, com.google.android.gms.internal.ads.ie0
    /* renamed from: l */
    public void mo205l(Object obj) {
        switch (this.f6143u) {
            case 2:
                k9.a0.k("Ending javascript session.");
                fr frVar = (fr) ((er) obj);
                HashSet hashSet = frVar.f6152v;
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    AbstractMap.SimpleEntry simpleEntry = (AbstractMap.SimpleEntry) it.next();
                    k9.a0.k("Unregistering eventhandler: ".concat(String.valueOf(((mp) simpleEntry.getValue()).toString())));
                    frVar.f6151u.e((String) simpleEntry.getKey(), (mp) simpleEntry.getValue());
                }
                hashSet.clear();
                return;
            case 3:
                xx.f12655f.execute(new yq((uq) obj, 2));
                return;
            case 26:
                ((g9.a) obj).L();
                return;
            case 27:
                ((w60) obj).a();
                return;
            case 28:
                ((z60) obj).o(x21.J(11, null, null));
                return;
            default:
                ((b70) obj).y();
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.s81
    /* renamed from: r, reason: collision with other method in class */
    public /* synthetic */ void mo202r(Object obj) {
        ((z40) obj).m();
    }

    @Override // com.google.android.gms.internal.ads.q2
    /* renamed from: zza, reason: collision with other method in class */
    public n2[] mo203zza() {
        switch (this.f6143u) {
            case gl.zzm /* 21 */:
                AtomicInteger atomicInteger = wz.O;
                return new n2[]{new r6(), new p5()};
            default:
                AtomicInteger atomicInteger2 = wz.O;
                return new n2[]{new r6(), new p5(), new n6(o7.f8995g, 32, y51.f12781y)};
        }
    }

    @Override // com.google.android.gms.internal.ads.hr
    public /* bridge */ /* synthetic */ JSONObject r(Object obj) {
        return (JSONObject) obj;
    }

    private final /* synthetic */ void g() {
    }

    private final void h() {
    }

    @Override // com.google.android.gms.internal.ads.s81
    public void t(Throwable th) {
    }

    @Override // com.google.android.gms.internal.ads.qu
    public void c(String str, Throwable th) {
    }

    @Override // com.google.android.gms.internal.ads.zx
    /* renamed from: zza */
    public void mo212zza() {
        int i = this.f6143u;
    }

    @Override // com.google.android.gms.internal.ads.qu
    public void d(Throwable th, String str, float f10) {
    }
}
