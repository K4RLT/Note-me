package com.google.android.gms.internal.ads;
import f9.k;
import g9.e3;
import g9.r;
import g9.y1;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class ii0 {

    /* renamed from: c, reason: collision with root package name */
    public final String f7145c;

    /* renamed from: d, reason: collision with root package name */
    public sp0 f7146d = null;
    public qp0 e = null;

    /* renamed from: f, reason: collision with root package name */
    public e3 f7147f = null;

    /* renamed from: b, reason: collision with root package name */
    public final Map f7144b = Collections.synchronizedMap(new HashMap());

    /* renamed from: a, reason: collision with root package name */
    public final List f7143a = Collections.synchronizedList(new ArrayList());

    public ii0(String str) {
        this.f7145c = str;
    }

    public static String d(qp0 qp0Var) {
        if (((Boolean) r.e.f17698c.a(sl.v4)).booleanValue()) {
            return qp0Var.f9951p0;
        }
        return qp0Var.f9964w;
    }

    public final void a(qp0 qp0Var) {
        String d2 = d(qp0Var);
        Map map = this.f7144b;
        Object obj = map.get(d2);
        List list = this.f7143a;
        int indexOf = list.indexOf(obj);
        if (indexOf < 0 || indexOf >= map.size()) {
            indexOf = list.indexOf(this.f7147f);
        }
        if (indexOf >= 0 && indexOf < map.size()) {
            this.f7147f = (e3) list.get(indexOf);
            while (true) {
                indexOf++;
                if (indexOf < list.size()) {
                    e3 e3Var = (e3) list.get(indexOf);
                    e3Var.f17628v = 0L;
                    e3Var.f17629w = null;
                } else {
                    return;
                }
            }
        }
    }

    public final synchronized void b(qp0 qp0Var, int i) {
        Map map = this.f7144b;
        String d2 = d(qp0Var);
        if (map.containsKey(d2)) {
            return;
        }
        Bundle bundle = new Bundle();
        JSONObject jSONObject = qp0Var.f9962v;
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            try {
                bundle.putString(next, jSONObject.getString(next));
            } catch (JSONException unused) {
            }
        }
        e3 e3Var = new e3(qp0Var.E, 0L, null, bundle, qp0Var.F, qp0Var.G, qp0Var.H, qp0Var.I);
        try {
            this.f7143a.add(i, e3Var);
        } catch (IndexOutOfBoundsException e) {
            k.C.f16817h.d("AdapterResponseInfoCollector.addAdapterResponseInfoEntryAtLocation", e);
        }
        this.f7144b.put(d2, e3Var);
    }

    public final void c(qp0 qp0Var, long j10, y1 y1Var, boolean z3) {
        String d2 = d(qp0Var);
        Map map = this.f7144b;
        if (map.containsKey(d2)) {
            if (this.e == null) {
                this.e = qp0Var;
            }
            e3 e3Var = (e3) map.get(d2);
            e3Var.f17628v = j10;
            e3Var.f17629w = y1Var;
            if (((Boolean) r.e.f17698c.a(sl.G7)).booleanValue() && z3) {
                this.f7147f = e3Var;
            }
        }
    }
}
