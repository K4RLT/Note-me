package com.google.android.gms.internal.measurement;
import c.a;
import j6.e;
import j6.n;
import n.i;
import o0.d;
import o0.f;
import q.x;
import x.n;
import y4.d;

import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class j6 extends m {

    /* renamed from: v, reason: collision with root package name */
    public final ra.e f13792v;

    public j6(ra.e eVar) {
        this.f13792v = eVar;
    }

    @Override // com.google.android.gms.internal.measurement.m, com.google.android.gms.internal.measurement.n
    public final n n(String str, j6.n nVar, ArrayList arrayList) {
        char c10 = 65535;
        switch (str.hashCode()) {
            case 21624207:
                if (str.equals("getEventName")) {
                    c10 = 0;
                    break;
                }
                break;
            case 45521504:
                if (str.equals("getTimestamp")) {
                    c10 = 1;
                    break;
                }
                break;
            case 146575578:
                if (str.equals("getParamValue")) {
                    c10 = 2;
                    break;
                }
                break;
            case 700587132:
                if (str.equals("getParams")) {
                    c10 = 3;
                    break;
                }
                break;
            case 920706790:
                if (str.equals("setParamValue")) {
                    c10 = 4;
                    break;
                }
                break;
            case 1570616835:
                if (str.equals("setEventName")) {
                    c10 = 5;
                    break;
                }
                break;
        }
        Object obj = null;
        ra.e eVar = this.f13792v;
        switch (c10) {
            case 0:
                o0.f(0, "getEventName", arrayList);
                return new p(((c) eVar.f24676w).f13664a);
            case 1:
                o0.f(0, "getTimestamp", arrayList);
                return new g(Double.valueOf(((c) eVar.f24676w).f13665b));
            case 2:
                o0.f(1, "getParamValue", arrayList);
                String b10 = ((j6.e) nVar.f18939w).k(nVar, (n) arrayList.get(0)).b();
                HashMap hashMap = ((c) eVar.f24676w).f13666c;
                if (hashMap.containsKey(b10)) {
                    obj = hashMap.get(b10);
                }
                return y4.d(obj);
            case 3:
                o0.f(0, "getParams", arrayList);
                HashMap hashMap2 = ((c) eVar.f24676w).f13666c;
                m mVar = new m();
                for (String str2 : hashMap2.keySet()) {
                    mVar.g(str2, y4.d(hashMap2.get(str2)));
                }
                return mVar;
            case 4:
                o0.f(2, "setParamValue", arrayList);
                String b11 = ((j6.e) nVar.f18939w).k(nVar, (n) arrayList.get(0)).b();
                n k3 = ((j6.e) nVar.f18939w).k(nVar, (n) arrayList.get(1));
                c cVar = (c) eVar.f24676w;
                Object d2 = o0.d(k3);
                HashMap hashMap3 = cVar.f13666c;
                if (d2 == null) {
                    hashMap3.remove(b11);
                    return k3;
                }
                hashMap3.put(b11, c.a(b11, hashMap3.get(b11), d2));
                return k3;
            case 5:
                o0.f(1, "setEventName", arrayList);
                n k4 = ((j6.e) nVar.f18939w).k(nVar, (n) arrayList.get(0));
                if (!n.f13848h.equals(k4) && !n.i.equals(k4)) {
                    ((c) eVar.f24676w).f13664a = k4.b();
                    return new p(k4.b());
                }
                q.x.n("Illegal event name");
                return null;
            default:
                return super.n(str, nVar, arrayList);
        }
    }
}
