package nf;
import c.g;
import d.a;
import d.d;

import android.content.Context;
import b8.u4;
import com.google.android.gms.internal.ads.f6;
import com.google.android.gms.internal.ads.x0;
import com.google.android.gms.internal.mlkit_vision_digital_ink.gw;
import com.google.android.gms.internal.play_billing.p;
import com.google.android.gms.internal.play_billing.r;
import com.google.android.gms.internal.play_billing.v;
import com.google.firebase.components.ComponentRegistrar;
import g5.q;
import ib.o;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import n8.m;
import org.json.JSONObject;
import q2.x;
import r7.n;

/* loaded from: classes.dex */
public final class a implements o9.b, ib.a, pa.b, pa.c, x, c7.d, p8.b, k8.e, vc.b, wc.a, ic.e {
    @Override // ic.e
    public List a(ComponentRegistrar componentRegistrar) {
        ArrayList arrayList = new ArrayList();
        for (ic.a aVar : componentRegistrar.getComponents()) {
            String str = aVar.f18386a;
            if (str != null) {
                aVar = new ic.a(str, aVar.f18387b, aVar.f18388c, aVar.f18389d, aVar.e, new e7.d(str, 14, aVar), aVar.f18391g);
            }
            arrayList.add(aVar);
        }
        return arrayList;
    }

    @Override // k8.e
    public Object apply(Object obj) {
        return (byte[]) obj;
    }

    @Override // pa.b
    public int b(Context context, String str, boolean z3) {
        return pa.d(context, str, z3);
    }

    @Override // pa.b
    public int c(Context context, String str) {
        return pa.d.a(context, str);
    }

    @Override // ib.a
    public /* bridge */ /* synthetic */ Object g(o oVar) {
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [w8.a, java.lang.Object] */
    @Override // oe.a
    public Object get() {
        Object obj = new Object();
        HashMap hashMap = new HashMap();
        Set set = Collections.EMPTY_SET;
        if (set != null) {
            hashMap.put(k8.d.f19626u, new t8.b(30000L, 86400000L, set));
            if (set != null) {
                hashMap.put(k8.d.f19628w, new t8.b(1000L, 86400000L, set));
                if (set != null) {
                    Set unmodifiableSet = Collections.unmodifiableSet(new HashSet(Arrays.asList(t8.c.f25669v)));
                    if (unmodifiableSet != null) {
                        hashMap.put(k8.d.f19627v, new t8.b(86400000L, 86400000L, unmodifiableSet));
                        if (hashMap.keySet().size() >= k8.d.values().length) {
                            new HashMap();
                            return new t8.a(obj, hashMap);
                        }
                        q.x.o("Not all priorities have been configured");
                        return null;
                    }
                    q.h("Null flags");
                    return null;
                }
                q.h("Null flags");
                return null;
            }
            q.h("Null flags");
            return null;
        }
        q.h("Null flags");
        return null;
    }

    @Override // wc.a
    public StackTraceElement[] h(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= 1024) {
            return stackTraceElementArr;
        }
        StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[1024];
        System.arraycopy(stackTraceElementArr, 0, stackTraceElementArr2, 0, 512);
        System.arraycopy(stackTraceElementArr, stackTraceElementArr.length - 512, stackTraceElementArr2, 512, 512);
        return stackTraceElementArr2;
    }

    @Override // vc.b
    public vc.a i(m mVar, JSONObject jSONObject) {
        u4 u4Var;
        long currentTimeMillis;
        jSONObject.optInt("settings_version", 0);
        int optInt = jSONObject.optInt("cache_duration", 3600);
        double optDouble = jSONObject.optDouble("on_demand_upload_rate_per_minute", 10.0d);
        double optDouble2 = jSONObject.optDouble("on_demand_backoff_base", 1.2d);
        int optInt2 = jSONObject.optInt("on_demand_backoff_step_duration_seconds", 60);
        if (jSONObject.has("session")) {
            u4Var = new u4(jSONObject.getJSONObject("session").optInt("max_custom_exception_events", 8), 12);
        } else {
            u4Var = new u4(new JSONObject().optInt("max_custom_exception_events", 8), 12);
        }
        u4 u4Var2 = u4Var;
        JSONObject jSONObject2 = jSONObject.getJSONObject("features");
        f6 f6Var = new f6(jSONObject2.optBoolean("collect_reports", true), jSONObject2.optBoolean("collect_anrs", false), jSONObject2.optBoolean("collect_build_ids", false));
        long j10 = optInt;
        if (jSONObject.has("expires_at")) {
            currentTimeMillis = jSONObject.optLong("expires_at");
        } else {
            currentTimeMillis = (j10 * 1000) + System.currentTimeMillis();
        }
        return new vc.a(currentTimeMillis, u4Var2, f6Var, optDouble, optDouble2, optInt2);
    }

    @Override // pa.c
    public x0 l(Context context, String str, pa.b bVar) {
        int b10;
        x0 x0Var = new x0();
        int c10 = bVar.c(context, str);
        x0Var.f12384a = c10;
        int i = 1;
        int i10 = 0;
        if (c10 != 0) {
            b10 = bVar.b(context, str, false);
            x0Var.f12385b = b10;
        } else {
            b10 = bVar.b(context, str, true);
            x0Var.f12385b = b10;
        }
        int i11 = x0Var.f12384a;
        if (i11 == 0) {
            if (b10 == 0) {
                i = 0;
                x0Var.f12386c = i;
                return x0Var;
            }
        } else {
            i10 = i11;
        }
        if (i10 >= b10) {
            i = -1;
        }
        x0Var.f12386c = i;
        return x0Var;
    }

    @Override // c7.d
    public void u(c7.f fVar) {
        fVar.getClass();
        if (fVar.f3946a == 0) {
            c7.c cVar = r7.h.f24635h;
            int i = 6;
            if (cVar != null) {
                z5.h hVar = new z5.h(6);
                we.a<n> entries = n.getEntries();
                ArrayList arrayList = new ArrayList(qe.m.d(entries, 10));
                for (n nVar : entries) {
                    gw gwVar = new gw(2);
                    gwVar.f14386v = nVar.getProductId();
                    gwVar.f14387w = "inapp";
                    arrayList.add(gwVar.g());
                }
                hVar.o(arrayList);
                if (((r) hVar.f31922v) != null) {
                    cVar.d(new pd.c(hVar), new q.x(5));
                } else {
                    q.x.n("Product list must be set to a non empty list.");
                    return;
                }
            }
            c7.c cVar2 = r7.h.f24635h;
            if (cVar2 == null) {
                return;
            }
            q.x xVar = new q.x(i);
            if (c7.g(new c7.r(cVar2, xVar, "inapp"), 30000L, new ac.a(cVar2, 4, xVar), cVar2.m(), cVar2.f()) == null) {
                c7.f p10 = cVar2.p();
                cVar2.B(25, 9, p10);
                p pVar = r.f15518v;
                xVar.c(p10, v.f15535y);
                return;
            }
            return;
        }
        r7.h.e();
    }

    @Override // c7.d
    public void y() {
    }
}