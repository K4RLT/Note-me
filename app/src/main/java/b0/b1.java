package b0;
import j.f;
import p.d;
import q.b1;
import q.c1;
import q.e0;
import q.f0;
import q.f1;
import q.g1;
import r0.a1;
import r0.i0;
import v.i;
import v.j;
import v.k;
import x.w0;

import android.content.Context;
import android.content.SharedPreferences;
import android.hardware.SensorManager;
import android.view.View;
import b8.ha;
import b8.l8;
import b8.ma;
import b8.z5;
import g0.i2;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class b1 implements i0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1157a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1158b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1159c;

    public /* synthetic */ b1(Object obj, int i, Object obj2) {
        this.f1157a = i;
        this.f1158b = obj;
        this.f1159c = obj2;
    }

    @Override // i0
    public final void a() {
        Map map;
        int i = this.f1157a;
        Object obj = this.f1159c;
        Object obj2 = this.f1158b;
        switch (i) {
            case 0:
                ((c1) obj2).f1168w.j(obj);
                return;
            case 1:
                SensorManager sensorManager = (SensorManager) obj2;
                if (sensorManager != null) {
                    sensorManager.unregisterListener((b8.t) obj);
                    return;
                }
                return;
            case 2:
                ConcurrentHashMap concurrentHashMap = ha.f2170a;
                Context context = (Context) obj2;
                ma maVar = (ma) obj;
                ConcurrentHashMap concurrentHashMap2 = ha.f2170a;
                context.getClass();
                maVar.getClass();
                ha.a(context);
                sf.n0 n0Var = ha.f2171b;
                Set set = (Set) ((Map) n0Var.getValue()).get(maVar);
                qe.u uVar = qe.u.f24025u;
                if (set == null) {
                    set = uVar;
                }
                if (!set.isEmpty()) {
                    Iterator it = set.iterator();
                    while (it.hasNext()) {
                        concurrentHashMap2.put((String) it.next(), Boolean.TRUE);
                    }
                    Map map2 = (Map) n0Var.getValue();
                    map2.getClass();
                    if (map2.isEmpty()) {
                        map = Collections.singletonMap(maVar, uVar);
                        map.getClass();
                    } else {
                        LinkedHashMap linkedHashMap = new LinkedHashMap(map2);
                        linkedHashMap.put(maVar, uVar);
                        map = linkedHashMap;
                    }
                    n0Var.k(null, map);
                    SharedPreferences.Editor edit = context.getSharedPreferences("scraply_universe_news", 0).edit();
                    Set keySet = concurrentHashMap2.keySet();
                    keySet.getClass();
                    edit.putStringSet("visto", qe.l.U(keySet)).apply();
                    return;
                }
                return;
            case 3:
                ((androidx.lifecycle.w) obj2).g().f((l8) obj);
                z5 z5Var = z5.f3075a;
                sf.n0 n0Var2 = z5.f3076b;
                Boolean bool = Boolean.TRUE;
                n0Var2.getClass();
                n0Var2.k(null, bool);
                return;
            case 4:
                ((Context) obj2).getApplicationContext().unregisterComponentCallbacks((c2.r0) obj);
                return;
            case 5:
                ((Context) obj2).getApplicationContext().unregisterComponentCallbacks((c2.s0) obj);
                return;
            case 6:
                a1 a1Var = (a1) obj2;
                k kVar = (k) a1Var.getValue();
                if (kVar != null) {
                    j jVar = new j(kVar);
                    i iVar = (i) obj;
                    if (iVar != null) {
                        iVar.b(jVar);
                    }
                    a1Var.setValue(null);
                    return;
                }
                return;
            case 7:
                ((i2) obj2).f17135c.remove((df.l) obj);
                return;
            case 8:
                ((androidx.lifecycle.w) obj2).g().f((o5.a) obj);
                return;
            case 9:
                ((f0) obj2).f22890a.m((e0) obj);
                return;
            case 10:
                ((g1) obj2).f22909j.remove((g1) obj);
                return;
            case 11:
                g1 g1Var = (g1) obj2;
                g1Var.getClass();
                q.b1 b1Var = (q.b1) ((c1) obj).f22861b.getValue();
                if (b1Var != null) {
                    g1Var.i.remove(b1Var.f22851u);
                    return;
                }
                return;
            case 12:
                ((g1) obj2).i.remove((f1) obj);
                return;
            case 13:
                ((androidx.lifecycle.w) obj2).g().f((o5.a) obj);
                return;
            default:
                w0 w0Var = (w0) obj2;
                View view = (View) obj;
                int i10 = w0Var.f30028s - 1;
                w0Var.f30028s = i10;
                if (i10 == 0) {
                    boolean z3 = q3.p.f23420a;
                    q3.f(view, null);
                    q3.d(view, null);
                    view.removeOnAttachStateChangeListener(w0Var.f30029t);
                    return;
                }
                return;
        }
    }
}
