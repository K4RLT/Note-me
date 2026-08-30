package com.google.android.gms.internal.ads;
import b8.u4;
import bc.i;
import c.a;
import c.c;
import h8.d;
import h8.e;
import ib.a;
import j6.s;
import rd.b;
import rd.f;
import tc.c;

import android.util.Log;
import com.google.android.gms.internal.ads.py1;
import ib.o;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import org.json.JSONArray;
import org.json.JSONObject;
import wa.h8;

/* loaded from: classes.dex */
public final /* synthetic */ class s1 implements Runnable {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f10446u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f10447v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ long f10448w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f10449x;

    public /* synthetic */ s1(Object obj, int i, long j10, int i10) {
        this.f10446u = i10;
        this.f10449x = obj;
        this.f10447v = i;
        this.f10448w = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f10446u) {
            case 0:
                s sVar = (s) this.f10449x;
                int i = this.f10447v;
                long j10 = this.f10448w;
                sVar.getClass();
                String str = bq0.f4860a;
                ku1 ku1Var = ((rs1) sVar.f18982w).f10282u.L;
                gu1 t3 = ku1Var.t((yx1) ku1Var.f7884d.e);
                ku1Var.p(t3, 1018, new u4(t3, i, j10));
                return;
            default:
                final c cVar = (c) this.f10449x;
                int i10 = this.f10447v;
                final long j11 = this.f10448w;
                synchronized (cVar) {
                    final int i11 = i10 - 1;
                    final o c10 = ((f) cVar.f25699w).c(3 - i11);
                    final o b10 = ((b) cVar.f25700x).b();
                    h8.g(c10, b10).h((ScheduledExecutorService) cVar.f25702z, new a() { // from class: rd.a
                        @Override // a
                        public final Object g(o oVar) {
                            Boolean valueOf;
                            c cVar2 = c.this;
                            o oVar2 = c10;
                            o oVar3 = b10;
                            long j12 = j11;
                            int i12 = i11;
                            if (!oVar2.l()) {
                                return d(new i("Failed to auto-fetch config update.", oVar2.i()));
                            }
                            if (!oVar3.l()) {
                                return d(new i("Failed to get activated config for auto-fetch", oVar3.i()));
                            }
                            e eVar = (e) oVar2.j();
                            c cVar3 = (c) oVar3.j();
                            c cVar4 = eVar.f24702b;
                            boolean z3 = false;
                            if (cVar4 != null) {
                                if (cVar4.f24694f >= j12) {
                                    z3 = true;
                                }
                                valueOf = Boolean.valueOf(z3);
                            } else {
                                if (eVar.f24701a == 1) {
                                    z3 = true;
                                }
                                valueOf = Boolean.valueOf(z3);
                            }
                            if (!valueOf.booleanValue()) {
                                Log.d("FirebaseRemoteConfig", "Fetched template version is the same as SDK's current version. Retrying fetch.");
                                cVar2.a(i12, j12);
                                return e(null);
                            }
                            if (eVar.f24702b == null) {
                                Log.d("FirebaseRemoteConfig", "The fetch succeeded, but the backend had no updates.");
                                return e(null);
                            }
                            if (cVar3 == null) {
                                py1 c11 = c();
                                cVar3 = new c((JSONObject) c11.f9668v, (Date) c11.f9669w, (JSONArray) c11.f9670x, (JSONObject) c11.f9671y, c11.f9667u, (JSONArray) c11.f9672z);
                            }
                            c cVar5 = eVar.f24702b;
                            JSONObject jSONObject = cVar3.e;
                            JSONObject jSONObject2 = cVar5.f24690a;
                            JSONObject jSONObject3 = cVar5.f24691b;
                            JSONObject jSONObject4 = cVar5.e;
                            JSONObject jSONObject5 = a(new JSONObject(jSONObject2.toString())).f24691b;
                            HashMap b11 = cVar3.b();
                            HashMap b12 = cVar5.b();
                            HashSet hashSet = new HashSet();
                            JSONObject jSONObject6 = cVar3.f24691b;
                            Iterator<String> keys = jSONObject6.keys();
                            while (keys.hasNext()) {
                                String next = keys.next();
                                if (!jSONObject3.has(next)) {
                                    hashSet.add(next);
                                } else if (!jSONObject6.get(next).equals(jSONObject3.get(next))) {
                                    hashSet.add(next);
                                } else if ((jSONObject.has(next) && !jSONObject4.has(next)) || (!jSONObject.has(next) && jSONObject4.has(next))) {
                                    hashSet.add(next);
                                } else if (jSONObject.has(next) && jSONObject4.has(next) && !jSONObject.getJSONObject(next).toString().equals(jSONObject4.getJSONObject(next).toString())) {
                                    hashSet.add(next);
                                } else if (b11.containsKey(next) != b12.containsKey(next)) {
                                    hashSet.add(next);
                                } else if (b11.containsKey(next) && b12.containsKey(next) && !((Map) b11.get(next)).equals(b12.get(next))) {
                                    hashSet.add(next);
                                } else {
                                    jSONObject5.remove(next);
                                }
                            }
                            Iterator<String> keys2 = jSONObject5.keys();
                            while (keys2.hasNext()) {
                                hashSet.add(keys2.next());
                            }
                            if (hashSet.isEmpty()) {
                                Log.d("FirebaseRemoteConfig", "Config was fetched, but no params changed.");
                                return e(null);
                            }
                            synchronized (cVar2) {
                                Iterator it = ((LinkedHashSet) cVar2.f25697u).iterator();
                                while (it.hasNext()) {
                                    ((j) it.next()).getClass();
                                }
                            }
                            return e(null);
                        }
                    });
                }
                return;
        }
    }
}
