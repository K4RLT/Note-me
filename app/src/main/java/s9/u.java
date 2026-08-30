package s9;
import r.e;

import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.internal.ads.fe0;
import com.google.android.gms.internal.ads.nl;
import com.google.android.gms.internal.ads.ql;
import com.google.android.gms.internal.ads.sl;
import com.google.android.gms.internal.ads.xx;
import com.google.android.gms.internal.ads.zd0;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;
import ya.zb;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final int f25112a;

    /* renamed from: b, reason: collision with root package name */
    public final long f25113b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f25114c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f25115d;
    public final Map e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayDeque f25116f = new ArrayDeque();

    /* renamed from: g, reason: collision with root package name */
    public final ArrayDeque f25117g = new ArrayDeque();

    /* renamed from: h, reason: collision with root package name */
    public final fe0 f25118h;
    public ConcurrentHashMap i;

    public u(fe0 fe0Var) {
        this.f25118h = fe0Var;
        nl nlVar = sl.O7;
        g9.r rVar = g9.e;
        this.f25112a = ((Integer) rVar.f17698c.a(nlVar)).intValue();
        nl nlVar2 = sl.P7;
        ql qlVar = rVar.f17698c;
        this.f25113b = ((Long) qlVar.a(nlVar2)).longValue();
        this.f25114c = ((Boolean) qlVar.a(sl.T7)).booleanValue();
        this.f25115d = ((Boolean) qlVar.a(sl.S7)).booleanValue();
        this.e = Collections.synchronizedMap(new s(this));
    }

    public final synchronized String a(String str, zd0 zd0Var) {
        t tVar = (t) this.e.get(str);
        zd0Var.f13137a.put("request_id", str);
        ConcurrentHashMap concurrentHashMap = zd0Var.f13137a;
        if (tVar != null) {
            concurrentHashMap.put("mhit", "true");
            return tVar.f25110b;
        }
        concurrentHashMap.put("mhit", "false");
        return null;
    }

    public final synchronized void b() {
        f9.k.C.f16819k.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        try {
            Iterator it = this.e.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (currentTimeMillis - ((t) entry.getValue()).f25109a.longValue() <= this.f25113b) {
                    break;
                }
                this.f25117g.add(new Pair((String) entry.getKey(), ((t) entry.getValue()).f25110b));
                it.remove();
            }
        } catch (ConcurrentModificationException e) {
            f9.k.C.f16817h.d("QueryJsonMap.removeExpiredEntries", e);
        }
    }

    public final synchronized void c(zd0 zd0Var) {
        try {
            try {
                if (!this.f25114c) {
                    return;
                }
                ArrayDeque arrayDeque = this.f25117g;
                ArrayDeque clone = arrayDeque.clone();
                arrayDeque.clear();
                ArrayDeque arrayDeque2 = this.f25116f;
                ArrayDeque clone2 = arrayDeque2.clone();
                arrayDeque2.clear();
                xx.f12651a.execute(new b9.a(this, zd0Var, clone, clone2, 13));
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    public final void d(zd0 zd0Var, ArrayDeque arrayDeque, String str) {
        Pair pair;
        while (!arrayDeque.isEmpty()) {
            Pair pair2 = (Pair) arrayDeque.poll();
            ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(zd0Var.f13137a);
            this.i = concurrentHashMap;
            concurrentHashMap.put("action", "ev");
            this.i.put("e_r", str);
            this.i.put("e_id", (String) pair2.first);
            if (this.f25115d) {
                try {
                    JSONObject jSONObject = new JSONObject((String) pair2.second);
                    pair = new Pair(zb.a(jSONObject.getJSONObject("extras").getString("query_info_type")), jSONObject.getString("request_agent"));
                } catch (JSONException unused) {
                    pair = new Pair("", "");
                }
                ConcurrentHashMap concurrentHashMap2 = this.i;
                String str2 = (String) pair.first;
                if (!TextUtils.isEmpty(str2)) {
                    concurrentHashMap2.put("e_type", str2);
                }
                ConcurrentHashMap concurrentHashMap3 = this.i;
                String str3 = (String) pair.second;
                if (!TextUtils.isEmpty(str3)) {
                    concurrentHashMap3.put("e_agent", str3);
                }
            }
            this.f25118h.b(this.i);
        }
    }
}
