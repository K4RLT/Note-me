package com.google.android.gms.internal.measurement;
import c.a;
import g3.a;
import j6.c;
import j6.e;
import j6.n;
import o0.a;
import o0.e;
import o0.f;
import o0.j;
import q.x;
import x.n;
import x.o;
import y4.d;
import z5.h;

import com.facebook.ads.AdError;
import com.google.android.gms.internal.mlkit_vision_digital_ink.pw;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes.dex */
public final class l5 extends j {

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f13834w = 1;

    /* renamed from: x, reason: collision with root package name */
    public Object f13835x;

    public l5(z5.h hVar) {
        super("internal.logger");
        this.f13835x = hVar;
        this.f13785v.put("log", new h8(this, false, true));
        this.f13785v.put("silent", new b("silent", 2));
        ((j) this.f13785v.get("silent")).g("log", new h8(this, true, true));
        this.f13785v.put("unmonitored", new b("unmonitored", 3));
        ((j) this.f13785v.get("unmonitored")).g("log", new h8(this, false, false));
    }

    @Override // com.google.android.gms.internal.measurement.j
    public final n e(j6.n nVar, List list) {
        HashMap hashMap;
        Object obj;
        String str;
        int i;
        TreeMap treeMap;
        switch (this.f13834w) {
            case 0:
                o0.f(3, this.f13784u, list);
                String b10 = ((j6.e) nVar.f18939w).k(nVar, (n) list.get(0)).b();
                n nVar2 = (n) list.get(1);
                j6.e eVar = (j6.e) nVar.f18939w;
                long a10 = (long) o0.a(eVar.k(nVar, nVar2).a().doubleValue());
                n k3 = eVar.k(nVar, (n) list.get(2));
                if (k3 instanceof m) {
                    hashMap = o0.e((m) k3);
                } else {
                    hashMap = new HashMap();
                }
                ra.e eVar2 = (ra.e) this.f13835x;
                eVar2.getClass();
                HashMap hashMap2 = new HashMap();
                for (String str2 : hashMap.keySet()) {
                    HashMap hashMap3 = ((c) eVar2.f24675v).f13666c;
                    if (hashMap3.containsKey(str2)) {
                        obj = hashMap3.get(str2);
                    } else {
                        obj = null;
                    }
                    hashMap2.put(str2, c.a(str2, obj, hashMap.get(str2)));
                }
                ((ArrayList) eVar2.f24677x).add(new c(b10, a10, hashMap2));
                return n.f13848h;
            case 1:
                o0.f(2, "getValue", list);
                n k4 = ((j6.e) nVar.f18939w).k(nVar, (n) list.get(0));
                n k10 = ((j6.e) nVar.f18939w).k(nVar, (n) list.get(1));
                String b11 = k4.b();
                pw pwVar = (pw) this.f13835x;
                Map map = (Map) ((eb.u0) pwVar.f14822w).f16384y.get((String) pwVar.f14821v);
                if (map != null && map.containsKey(b11)) {
                    str = (String) map.get(b11);
                } else {
                    str = null;
                }
                if (str != null) {
                    return new p(str);
                }
                return k10;
            case 2:
                return n.f13848h;
            case 3:
                o0.f(3, this.f13784u, list);
                ((j6.e) nVar.f18939w).k(nVar, (n) list.get(0)).b();
                n nVar3 = (n) list.get(1);
                j6.e eVar3 = (j6.e) nVar.f18939w;
                n k11 = eVar3.k(nVar, nVar3);
                if (k11 instanceof o) {
                    n k12 = eVar3.k(nVar, (n) list.get(2));
                    if (k12 instanceof m) {
                        m mVar = (m) k12;
                        HashMap hashMap4 = mVar.f13839u;
                        if (hashMap4.containsKey("type")) {
                            String b12 = mVar.o("type").b();
                            if (hashMap4.containsKey("priority")) {
                                i = o0.j(mVar.o("priority").a().doubleValue());
                            } else {
                                i = AdError.NETWORK_ERROR_CODE;
                            }
                            j6.c cVar = (j6.c) this.f13835x;
                            o oVar = (o) k11;
                            cVar.getClass();
                            if ("create".equals(b12)) {
                                treeMap = (TreeMap) cVar.f18915w;
                            } else if ("edit".equals(b12)) {
                                treeMap = (TreeMap) cVar.f18914v;
                            } else {
                                q.x.o(g3.a.k("Unknown callback type: ", b12));
                            }
                            if (treeMap.containsKey(Integer.valueOf(i))) {
                                i = ((Integer) treeMap.lastKey()).intValue() + 1;
                            }
                            treeMap.put(Integer.valueOf(i), oVar);
                            return n.f13848h;
                        }
                        q.x.n("Undefined rule type");
                    } else {
                        q.x.n("Invalid callback params");
                    }
                } else {
                    q.x.n("Invalid callback type");
                }
                return null;
            default:
                try {
                    return y4.d(((eb.v0) this.f13835x).call());
                } catch (Exception unused) {
                    return n.f13848h;
                }
        }
    }

    public /* synthetic */ l5(String str) {
        super(str);
    }

    public l5(eb.v0 v0Var) {
        super("internal.appMetadata");
        this.f13835x = v0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l5(pw pwVar) {
        super("getValue");
        this.f13835x = pwVar;
    }

    public l5(ra.e eVar) {
        super("internal.eventLogger");
        this.f13835x = eVar;
    }
}
