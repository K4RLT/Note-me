package com.google.android.gms.internal.mlkit_vision_digital_ink;

import android.content.SharedPreferences;
import android.net.Uri;
import android.os.SystemClock;
import com.google.mlkit.vision.digitalink.common.downloading.DigitalInkManifestParser$Pack;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final /* synthetic */ class rl implements m2 {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f14924u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f14925v;

    public /* synthetic */ rl(int i, Object obj) {
        this.f14924u = i;
        this.f14925v = obj;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.m2
    public final Object l(Object obj) {
        ej ejVar;
        long elapsedRealtime;
        int i = this.f14924u;
        int i10 = 0;
        Object obj2 = this.f14925v;
        switch (i) {
            case 0:
                sl slVar = (sl) obj2;
                String str = (String) obj;
                j6.n nVar = slVar.f14976d;
                HashMap hashMap = (HashMap) nVar.f18941y;
                if (hashMap.containsKey(str)) {
                    ev evVar = (ev) hashMap.get(str);
                    fa.y.h(evVar);
                    fi w10 = ej.w();
                    String t3 = evVar.t();
                    fa.y.h(t3);
                    w10.b();
                    ej.C((ej) w10.f14430v, t3);
                    DigitalInkManifestParser$Pack digitalInkManifestParser$Pack = (DigitalInkManifestParser$Pack) ((HashMap) nVar.f18940x).get(evVar.w());
                    fa.y.h(digitalInkManifestParser$Pack);
                    fh z3 = j6.n.z(digitalInkManifestParser$Pack);
                    w10.b();
                    ej.B((ej) w10.f14430v, z3);
                    DigitalInkManifestParser$Pack digitalInkManifestParser$Pack2 = (DigitalInkManifestParser$Pack) ((HashMap) nVar.f18940x).get(evVar.v());
                    fa.y.h(digitalInkManifestParser$Pack2);
                    fh z9 = j6.n.z(digitalInkManifestParser$Pack2);
                    w10.b();
                    ej.B((ej) w10.f14430v, z9);
                    if (!evVar.u().isEmpty()) {
                        DigitalInkManifestParser$Pack digitalInkManifestParser$Pack3 = (DigitalInkManifestParser$Pack) ((HashMap) nVar.f18940x).get(evVar.u());
                        fa.y.h(digitalInkManifestParser$Pack3);
                        fh z10 = j6.n.z(digitalInkManifestParser$Pack3);
                        w10.b();
                        ej.B((ej) w10.f14430v, z10);
                    }
                    ejVar = (ej) w10.i();
                } else {
                    ejVar = null;
                }
                if (ejVar != null) {
                    u3 u3Var = new u3(ejVar);
                    dt dtVar = slVar.f14973a;
                    dtVar.getClass();
                    if (tv.f15034a) {
                        elapsedRealtime = SystemClock.elapsedRealtimeNanos();
                    } else {
                        elapsedRealtime = SystemClock.elapsedRealtime() * 1000000;
                    }
                    long j10 = elapsedRealtime;
                    ya i11 = dtVar.f14219h.i(new com.google.android.gms.internal.ads.mu(dtVar, 13, u3Var), dtVar.f14218g);
                    q8 t10 = r8.t();
                    t10.m(ejVar.x());
                    t10.l(ejVar.v());
                    t10.p(ejVar.z());
                    t10.b();
                    r8.y((r8) t10.f14430v);
                    t10.b();
                    r8.z((r8) t10.f14430v);
                    t10.n(ejVar.u());
                    t10.o(ejVar.y());
                    int t11 = ejVar.t();
                    t10.b();
                    r8.v((r8) t10.f14430v, t11);
                    r8 r8Var = (r8) t10.i();
                    ws wsVar = new ws(dtVar, j10, r8Var, i11, new jm(25), new s5(15, r8Var), 3);
                    int i12 = g2.f14354a;
                    i11.g(new ba.j(8, new Object(), q1.b(), wsVar), ia.f14473u);
                    return i11;
                }
                g5.q.h("Null dataFileGroup");
                return null;
            case 1:
                return (m) ((gx) obj2).i();
            case 2:
                return (pu) obj2;
            case 3:
                ((Boolean) obj).getClass();
                return (q2) obj2;
            case 4:
                ((SharedPreferences) obj2).edit().putBoolean("mdd_migrated_to_offroad", true).commit();
                return null;
            case 5:
                b6.u uVar = (b6.u) obj2;
                j4 j4Var = new j4(4);
                k5 k3 = ((e5) obj).entrySet().k();
                while (k3.hasNext()) {
                    Map.Entry entry = (Map.Entry) k3.next();
                    or orVar = (or) entry.getKey();
                    if (entry.getValue() != null) {
                        if (orVar.P()) {
                            Uri uri = (Uri) entry.getValue();
                            qq z11 = orVar.z();
                            ((ss) uVar.B).getClass();
                            if (z11.t() != 0) {
                                uri = uri.buildUpon().encodedFragment(l0.a(z11)).build();
                            }
                            j4Var.a(orVar, uri);
                        } else {
                            j4Var.a(entry.getKey(), entry.getValue());
                        }
                    }
                }
                return j4Var.c(false);
            case 6:
                zr zrVar = (zr) ((cs) obj).g();
                zrVar.b();
                cs.y((cs) zrVar.f14430v, (ArrayList) obj2);
                return (cs) zrVar.i();
            case 7:
                ((tr) obj).getClass();
                ((ss) ((j6.l) obj2).f18933v).getClass();
                return va.f15125v;
            default:
                js jsVar = (js) obj;
                int i13 = ex.f14284c;
                yr yrVar = (yr) obj2;
                Iterator<E> it = jsVar.v().iterator();
                while (true) {
                    if (it.hasNext()) {
                        yr yrVar2 = (yr) it.next();
                        int i14 = ex.f14284c;
                        if (!yrVar.y().equals(yrVar2.y()) || yrVar.t() != yrVar2.t() || yrVar.u() != yrVar2.u()) {
                            i10++;
                        }
                    } else {
                        i10 = -1;
                    }
                }
                if (i10 == -1) {
                    hs hsVar = (hs) jsVar.g();
                    hsVar.b();
                    js.w((js) hsVar.f14430v, yrVar);
                    return (js) hsVar.i();
                }
                yr t12 = jsVar.t(i10);
                xr xrVar = (xr) t12.g();
                long v2 = yrVar.v() + t12.v();
                xrVar.b();
                yr.A((yr) xrVar.f14430v, v2);
                long w11 = yrVar.w() + t12.w();
                xrVar.b();
                yr.E((yr) xrVar.f14430v, w11);
                yr yrVar3 = (yr) xrVar.i();
                hs hsVar2 = (hs) jsVar.g();
                hsVar2.b();
                js.x((js) hsVar2.f14430v, i10, yrVar3);
                return (js) hsVar2.i();
        }
    }
}
