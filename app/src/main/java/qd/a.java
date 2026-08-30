package qd;
import g.b;

import b8.y5;
import ib.o;
import j.i0;
import j6.n;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONObject;
import q.x;
import rd.i;
import rd.k;
import rd.m;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final cc.c f23981a;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f23982b;

    /* renamed from: c, reason: collision with root package name */
    public final rd.b f23983c;

    /* renamed from: d, reason: collision with root package name */
    public final rd.b f23984d;
    public final rd.f e;

    /* renamed from: f, reason: collision with root package name */
    public final rd.g f23985f;

    /* renamed from: g, reason: collision with root package name */
    public final i f23986g;

    /* renamed from: h, reason: collision with root package name */
    public final i0 f23987h;
    public final n i;

    public a(cc.c cVar, Executor executor, rd.b bVar, rd.b bVar2, rd.b bVar3, rd.f fVar, rd.g gVar, i iVar, i0 i0Var, n nVar) {
        this.f23981a = cVar;
        this.f23982b = executor;
        this.f23983c = bVar;
        this.f23984d = bVar2;
        this.e = fVar;
        this.f23985f = gVar;
        this.f23986g = iVar;
        this.f23987h = i0Var;
        this.i = nVar;
    }

    public static ArrayList e(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            HashMap hashMap = new HashMap();
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap.put(next, jSONObject.getString(next));
            }
            arrayList.add(hashMap);
        }
        return arrayList;
    }

    public final o a() {
        rd.f fVar = this.e;
        long j10 = fVar.f24709g.f24719a.getLong("minimum_fetch_interval_in_seconds", 43200L);
        HashMap hashMap = new HashMap(fVar.f24710h);
        hashMap.put("X-Firebase-RC-Fetch-Type", "BASE/1");
        return fVar.e.b().h(fVar.f24706c, new lc.a(fVar, j10, hashMap)).n(jc.i.f19147u, new x(1)).n(this.f23982b, new y5(this));
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long b(java.lang.String r7) {
        /*
            r6 = this;
            rd.g r0 = r6.f23985f
            rd.b r1 = r0.f24714c
            rd.c r2 = r1.c()
            r3 = 0
            if (r2 != 0) goto Lc
            goto L17
        Lc:
            org.json.JSONObject r2 = r2.f24691b     // Catch: org.json.JSONException -> L17
            long r4 = r2.getLong(r7)     // Catch: org.json.JSONException -> L17
            java.lang.Long r2 = java.lang.Long.valueOf(r4)     // Catch: org.json.JSONException -> L17
            goto L18
        L17:
            r2 = r3
        L18:
            if (r2 == 0) goto L26
            rd.c r1 = r1.c()
            r0.a(r7, r1)
            long r0 = r2.longValue()
            return r0
        L26:
            rd.b r0 = r0.f24715d
            rd.c r0 = r0.c()
            if (r0 != 0) goto L2f
            goto L39
        L2f:
            org.json.JSONObject r0 = r0.f24691b     // Catch: org.json.JSONException -> L39
            long r0 = r0.getLong(r7)     // Catch: org.json.JSONException -> L39
            java.lang.Long r3 = java.lang.Long.valueOf(r0)     // Catch: org.json.JSONException -> L39
        L39:
            if (r3 == 0) goto L40
            long r0 = r3.longValue()
            return r0
        L40:
            java.lang.String r0 = "Long"
            rd.g.c(r7, r0)
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: qd.a.b(java.lang.String):long");
    }

    public final m c(String str) {
        rd.g gVar = this.f23985f;
        rd.b bVar = gVar.f24714c;
        String b10 = rd.b(bVar, str);
        if (b10 != null) {
            gVar.a(str, bVar.c());
            return new m(b10, 2);
        }
        String b11 = rd.b(gVar.f24715d, str);
        if (b11 != null) {
            return new m(b11, 1);
        }
        rd.g.c(str, "FirebaseRemoteConfigValue");
        return new m("", 0);
    }

    public final void d(boolean z3) {
        i0 i0Var = this.f23987h;
        synchronized (i0Var) {
            ((k) i0Var.f18637w).e = z3;
            if (!z3) {
                synchronized (i0Var) {
                    if (!((LinkedHashSet) i0Var.f18636v).isEmpty()) {
                        ((k) i0Var.f18637w).e(0L);
                    }
                }
            }
        }
    }
}
