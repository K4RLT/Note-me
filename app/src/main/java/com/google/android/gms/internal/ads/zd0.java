package com.google.android.gms.internal.ads;
import d.i;
import f9.e;
import f9.k;
import g9.r;
import g9.z2;
import l9.d;
import r9.a;
import r9.c;
import ya.zb;
import zb.b;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class zd0 {

    /* renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f13137a;

    /* renamed from: b, reason: collision with root package name */
    public final sx f13138b;

    /* renamed from: c, reason: collision with root package name */
    public final aq0 f13139c;

    /* renamed from: d, reason: collision with root package name */
    public final of f13140d;
    public final Bundle e;

    public zd0(Context context, fe0 fe0Var, sx sxVar, aq0 aq0Var, String str, String str2, of ofVar, r9.d dVar) {
        ActivityManager.MemoryInfo i;
        String str3;
        g9.z2 z2Var = aq0Var.f4581d;
        this.e = new Bundle();
        fe0Var.getClass();
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(fe0Var.f6045a);
        this.f13137a = concurrentHashMap;
        this.f13138b = sxVar;
        this.f13139c = aq0Var;
        this.f13140d = ofVar;
        concurrentHashMap.put("ad_format", str2.toUpperCase(Locale.ROOT));
        d();
        nl nlVar = sl.J2;
        g9.r rVar = g9.r.e;
        ql qlVar = rVar.f17698c;
        ql qlVar2 = rVar.f17698c;
        if (((Boolean) qlVar.a(nlVar)).booleanValue()) {
            Runtime runtime = Runtime.getRuntime();
            b("rt_f", String.valueOf(runtime.freeMemory()));
            b("rt_m", String.valueOf(runtime.maxMemory()));
            b("rt_t", String.valueOf(runtime.totalMemory()));
            b("wv_c", String.valueOf(f9.k.C.f16817h.f9640k.get()));
            if (((Boolean) qlVar2.a(sl.S2)).booleanValue() && (i = l9.d.i(context)) != null) {
                b("mem_avl", String.valueOf(i.availMem));
                b("mem_tt", String.valueOf(i.totalMem));
                if (true != i.lowMemory) {
                    str3 = "0";
                } else {
                    str3 = "1";
                }
                b("low_m", str3);
            }
        }
        if (((Boolean) qlVar2.a(sl.Z2)).booleanValue()) {
            b("ad_unit_id", aq0Var.f4583g);
        }
        if (((Boolean) qlVar2.a(sl.T2)).booleanValue()) {
            b("mem_tier", ((r9.a) dVar.f24669c.get()).name());
        }
        if (((Boolean) qlVar2.a(sl.U2)).booleanValue()) {
            b("proc_tier", ((r9.c) dVar.e.get()).name());
        }
        if (!((Boolean) qlVar2.a(sl.Q7)).booleanValue()) {
            return;
        }
        int e = ya.zb.e(aq0Var) - 1;
        if (e != 0) {
            if (e != 1) {
                if (e != 2) {
                    if (e != 3) {
                        concurrentHashMap.put("se", "r_both");
                    } else {
                        concurrentHashMap.put("se", "r_adstring");
                    }
                } else {
                    concurrentHashMap.put("se", "r_adinfo");
                }
            } else {
                concurrentHashMap.put("request_id", str);
                concurrentHashMap.put("se", "query_g");
            }
            concurrentHashMap.put("scar", "true");
            b("ragent", z2Var.J);
            b("rtype", ya.zb.a(ya.zb.b(z2Var)));
            return;
        }
        concurrentHashMap.put("request_id", str);
        concurrentHashMap.put("scar", "false");
    }

    public final void a(Bundle bundle) {
        if (bundle != null) {
            if (bundle.containsKey("cnt")) {
                b("network_coarse", Integer.toString(bundle.getInt("cnt")));
            }
            if (bundle.containsKey("gnt")) {
                b("network_fine", Integer.toString(bundle.getInt("gnt")));
            }
        }
    }

    public final void b(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            this.f13137a.put(str, str2);
        }
    }

    public final synchronized void c(long j10, String str) {
        this.e.putLong(str, j10);
    }

    public final void d() {
        int e;
        String str;
        String str2;
        if (!((Boolean) g9.r.e.f17698c.a(sl.Ra)).booleanValue()) {
            return;
        }
        lf lfVar = this.f13140d.f9103b;
        boolean z3 = lfVar instanceof f9.e;
        ConcurrentHashMap concurrentHashMap = this.f13137a;
        if (z3) {
            int i = ((f9.e) lfVar).I;
            int i10 = i - 1;
            if (i != 0) {
                if (i10 != 0) {
                    str2 = "2";
                } else {
                    str2 = "1";
                }
                concurrentHashMap.put("asv", str2);
                return;
            }
            throw null;
        }
        if (lfVar instanceof j10) {
            wy0 wy0Var = (wy0) ((px0) ((j10) lfVar).f7281v.f7466v).f9648b.f13335f.get();
            if (wy0Var == null) {
                e = 1;
            } else {
                e = wy0Var.e();
            }
            int i11 = e - 1;
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        str = "uns";
                    } else {
                        str = "3.0";
                    }
                } else {
                    str = "2.0";
                }
            } else {
                str = "1.0";
            }
            concurrentHashMap.put("asv", str);
            return;
        }
        concurrentHashMap.put("asv", "NA");
    }
}
