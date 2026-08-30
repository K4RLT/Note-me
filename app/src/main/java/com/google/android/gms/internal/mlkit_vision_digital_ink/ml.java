package com.google.android.gms.internal.mlkit_vision_digital_ink;
import b4.b;
import ba.j;
import de.c;
import eb.c0;
import eb.d1;
import eb.e;
import eb.k0;
import eb.l3;
import eb.q0;
import eb.v;
import eb.w2;
import ib.o;
import l3.c;
import l3.d;
import pa.b;
import pd.c;
import qb.c;
import qb.d;
import qb.i;
import z5.h;

import android.app.Service;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final /* synthetic */ class ml implements Runnable {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f14665u;

    /* renamed from: v, reason: collision with root package name */
    public /* synthetic */ int f14666v;

    /* renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f14667w;

    /* renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f14668x;

    /* renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f14669y;

    public /* synthetic */ ml(nl nlVar, s5 s5Var, int i, String str) {
        this.f14665u = 0;
        this.f14667w = nlVar;
        this.f14669y = s5Var;
        this.f14666v = i;
        this.f14668x = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        z4 z4Var;
        String a10;
        String str2;
        switch (this.f14665u) {
            case 0:
                nl nlVar = (nl) this.f14667w;
                s5 s5Var = (s5) this.f14669y;
                int i = this.f14666v;
                String str3 = (String) this.f14668x;
                lf lfVar = (lf) s5Var.f14961v;
                int b10 = b(i - 1);
                lfVar.b();
                mf.z((mf) lfVar.f14430v, b10);
                zk w10 = ((mf) ((lf) s5Var.f14961v).i()).w();
                if (!w10.v().isEmpty()) {
                    str = w10.v();
                } else {
                    str = "NA";
                }
                String str4 = nlVar.f14708a;
                String str5 = nlVar.f14709b;
                synchronized (nl.class) {
                    z4Var = nl.i;
                    if (z4Var == null) {
                        c cVar = new c(new d(Resources.getSystem().getConfiguration().getLocales()));
                        n5.d(4, "initialCapacity");
                        Object[] objArr = new Object[4];
                        int i10 = 0;
                        int i11 = 0;
                        while (i10 < cVar.f19885a.f19886a.size()) {
                            Locale locale = cVar.f19885a.f19886a.get(i10);
                            com.google.android.gms.internal.ads.vl vlVar = c.f15834a;
                            String languageTag = locale.toLanguageTag();
                            languageTag.getClass();
                            int length = objArr.length;
                            int i12 = i11 + 1;
                            int b11 = b(length, i12);
                            if (b11 > length) {
                                objArr = Arrays.copyOf(objArr, b11);
                            }
                            objArr[i11] = languageTag;
                            i10++;
                            i11 = i12;
                        }
                        z4Var = h4.r(objArr, i11);
                        nl.i = z4Var;
                    }
                }
                Boolean bool = Boolean.TRUE;
                o oVar = nlVar.f14712f;
                if (oVar.l()) {
                    a10 = (String) oVar.j();
                } else {
                    a10 = nlVar.f14711d.a();
                }
                int i13 = nlVar.f14714h;
                yk t3 = zk.t();
                if (str4 == null) {
                    str4 = "";
                }
                t3.b();
                zk.y((zk) t3.f14430v, str4);
                if (str5 == null) {
                    str5 = "";
                }
                t3.b();
                zk.z((zk) t3.f14430v, str5);
                t3.b();
                zk.B((zk) t3.f14430v);
                if (str3 == null) {
                    str3 = "";
                }
                t3.b();
                zk.G((zk) t3.f14430v, str3);
                if (str == null) {
                    str = "";
                }
                t3.b();
                zk.I((zk) t3.f14430v, str);
                t3.b();
                zk.C((zk) t3.f14430v);
                t3.b();
                zk.x((zk) t3.f14430v);
                if (a10 == null) {
                    a10 = "";
                }
                t3.b();
                zk.F((zk) t3.f14430v, a10);
                boolean equals = bool.equals(null);
                t3.b();
                zk.D((zk) t3.f14430v, equals);
                boolean equals2 = bool.equals(bool);
                t3.b();
                zk.E((zk) t3.f14430v, equals2);
                t3.b();
                zk.A((zk) t3.f14430v, 10);
                t3.b();
                zk.H((zk) t3.f14430v, i13);
                if (z4Var != null) {
                    t3.b();
                    zk.w((zk) t3.f14430v, z4Var);
                }
                lf lfVar2 = (lf) s5Var.f14961v;
                lfVar2.b();
                mf.x((mf) lfVar2.f14430v, (zk) t3.i());
                nlVar.f14710c.a(s5Var);
                return;
            case 1:
                j jVar = (j) this.f14667w;
                int i14 = this.f14666v;
                Exception exc = (Exception) this.f14668x;
                byte[] bArr = (byte[]) this.f14669y;
                d1 d1Var = (d1) ((c) jVar.f3135w).f22681u;
                l3 l3Var = d1Var.F;
                e eVar = d1Var.A;
                k0 k0Var = d1Var.C;
                if ((i14 == 200 || i14 == 204 || i14 == 304) && exc == null) {
                    q0 q0Var = d1Var.B;
                    d1.b(q0Var);
                    q0Var.P.a(true);
                    if (bArr != null && bArr.length != 0) {
                        try {
                            JSONObject jSONObject = new JSONObject(new String(bArr));
                            String optString = jSONObject.optString("deeplink", "");
                            if (TextUtils.isEmpty(optString)) {
                                d1.d(k0Var);
                                k0Var.H.g("Deferred Deep Link is empty.");
                                return;
                            }
                            String optString2 = jSONObject.optString("gclid", "");
                            String optString3 = jSONObject.optString("gbraid", "");
                            String optString4 = jSONObject.optString("gad_source", "");
                            double optDouble = jSONObject.optDouble("timestamp", 0.0d);
                            Bundle bundle = new Bundle();
                            com.google.android.gms.internal.measurement.g7.a();
                            c0 c0Var = v.K0;
                            if (eVar.F(null, c0Var)) {
                                d1.b(l3Var);
                                str2 = optString;
                                if (!l3Var.F0(str2)) {
                                    d1.d(k0Var);
                                    k0Var.D.i("Deferred Deep Link validation failed. gclid, gbraid, deep link", optString2, optString3, str2);
                                    return;
                                } else {
                                    if (!TextUtils.isEmpty(optString3)) {
                                        bundle.putString("gbraid", optString3);
                                    }
                                    if (!TextUtils.isEmpty(optString4)) {
                                        bundle.putString("gad_source", optString4);
                                    }
                                }
                            } else {
                                str2 = optString;
                                d1.b(l3Var);
                                if (!l3Var.F0(str2)) {
                                    d1.d(k0Var);
                                    k0Var.D.h("Deferred Deep Link validation failed. gclid, deep link", optString2, str2);
                                    return;
                                }
                            }
                            com.google.android.gms.internal.measurement.g7.a();
                            eVar.F(null, c0Var);
                            bundle.putString("gclid", optString2);
                            bundle.putString("_cis", "ddp");
                            d1Var.J.c0("auto", bundle, "_cmp");
                            d1.b(l3Var);
                            if (!TextUtils.isEmpty(str2) && l3Var.g0(str2, optDouble)) {
                                ((d1) l3Var.f3443v).f16102u.sendBroadcast(new Intent("android.google.analytics.action.DEEPLINK_ACTION"));
                                return;
                            }
                            return;
                        } catch (JSONException e) {
                            d1.d(k0Var);
                            k0Var.A.f(e, "Failed to parse the Deferred Deep Link response. exception");
                            return;
                        }
                    }
                    d1.d(k0Var);
                    k0Var.H.g("Deferred Deep Link response empty.");
                    return;
                }
                d1.d(k0Var);
                k0Var.D.h("Network Request for Deferred Deep Link failed. response, exception", Integer.valueOf(i14), exc);
                return;
            case 2:
                h hVar = (h) this.f14667w;
                int i15 = this.f14666v;
                k0 k0Var2 = (k0) this.f14668x;
                Intent intent = (Intent) this.f14669y;
                w2 w2Var = (w2) ((Service) hVar.f31922v);
                if (w2Var.e(i15)) {
                    k0Var2.I.f(Integer.valueOf(i15), "Local AppMeasurementService processed last upload request. StartId");
                    hVar.x().I.g("Completed wakeful intent.");
                    w2Var.a(intent);
                    return;
                }
                return;
            case 3:
                ConcurrentHashMap concurrentHashMap = ((d) ((c) this.f14667w).f23625x).f23628c;
                String str6 = (String) this.f14668x;
                i iVar = (i) concurrentHashMap.remove(str6);
                if (iVar == null) {
                    Log.w("HsdpClientImpl", "No active overlay for target package: " + str6 + ". Cannot report error.");
                    return;
                }
                String str7 = (String) this.f14669y;
                int i16 = this.f14666v;
                Bundle bundle2 = new Bundle();
                bundle2.putString("targetPackage", str6);
                bundle2.putInt("errorCode", i16);
                bundle2.putString("errorMessage", str7);
                iVar.f23643b.K(bundle2);
                return;
            default:
                d dVar = (d) this.f14667w;
                String str8 = (String) this.f14668x;
                int i17 = this.f14666v;
                Runnable runnable = (Runnable) this.f14669y;
                i iVar2 = (i) dVar.f23628c.get(str8);
                if (iVar2 != null && iVar2.a(i17) && runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }

    public /* synthetic */ ml(int i, int i10, Object obj, Object obj2, String str) {
        this.f14665u = i10;
        this.f14667w = obj;
        this.f14668x = str;
        this.f14666v = i;
        this.f14669y = obj2;
    }

    public /* synthetic */ ml(int i) {
        this.f14665u = i;
    }
}
