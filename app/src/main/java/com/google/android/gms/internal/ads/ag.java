package com.google.android.gms.internal.ads;
import ib.o;

import android.net.NetworkCapabilities;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
public final class ag implements cw0 {

    /* renamed from: a, reason: collision with root package name */
    public final ev0 f4485a;

    /* renamed from: b, reason: collision with root package name */
    public final tw f4486b;

    /* renamed from: c, reason: collision with root package name */
    public final ig f4487c;

    /* renamed from: d, reason: collision with root package name */
    public final yf f4488d;
    public final tf e;

    /* renamed from: f, reason: collision with root package name */
    public final kg f4489f;

    /* renamed from: g, reason: collision with root package name */
    public final d2 f4490g;

    /* renamed from: h, reason: collision with root package name */
    public final g9 f4491h;

    public ag(ev0 ev0Var, tw twVar, ig igVar, yf yfVar, tf tfVar, kg kgVar, d2 d2Var, g9 g9Var) {
        this.f4485a = ev0Var;
        this.f4486b = twVar;
        this.f4487c = igVar;
        this.f4488d = yfVar;
        this.e = tfVar;
        this.f4489f = kgVar;
        this.f4490g = d2Var;
        this.f4491h = g9Var;
    }

    @Override // com.google.android.gms.internal.ads.cw0
    public final HashMap a() {
        HashMap hashMap = new HashMap();
        hashMap.put("t", new Throwable());
        return hashMap;
    }

    public final HashMap b() {
        long j10;
        long j11;
        HashMap hashMap = new HashMap();
        ev0 ev0Var = this.f4485a;
        o oVar = (o) this.f4486b.f11473y;
        je jeVar = hv0.f6900a;
        if (oVar.l()) {
            jeVar = (je) oVar.j();
        }
        hashMap.put("v", ev0Var.f5826a);
        hashMap.put("gms", Boolean.valueOf(ev0Var.f5828c));
        hashMap.put("gv", Long.valueOf(jeVar.w0()));
        hashMap.put("int", jeVar.u0());
        hashMap.put("attts", Long.valueOf(jeVar.z0().A()));
        hashMap.put("att", jeVar.z0().C());
        hashMap.put("attkid", jeVar.z0().B());
        hashMap.put("up", Boolean.valueOf(this.f4488d.f12863a));
        hashMap.put("t", new Throwable());
        d2 d2Var = this.f4490g;
        hashMap.put("tcq", Long.valueOf(d2Var.f5250a));
        hashMap.put("tpq", Long.valueOf(d2Var.f5251b));
        hashMap.put("tcv", Long.valueOf(d2Var.f5252c));
        hashMap.put("tpv", Long.valueOf(d2Var.f5253d));
        hashMap.put("tchv", Long.valueOf(d2Var.e));
        hashMap.put("tphv", Long.valueOf(d2Var.f5254f));
        hashMap.put("tcc", Long.valueOf(d2Var.f5255g));
        hashMap.put("tpc", Long.valueOf(d2Var.f5256h));
        tf tfVar = this.e;
        if (tfVar != null) {
            synchronized (tf.class) {
                try {
                    NetworkCapabilities networkCapabilities = (NetworkCapabilities) tfVar.f11339v;
                    if (networkCapabilities != null) {
                        if (networkCapabilities.hasTransport(4)) {
                            j11 = 2;
                        } else if (((NetworkCapabilities) tfVar.f11339v).hasTransport(1)) {
                            j11 = 1;
                        } else if (((NetworkCapabilities) tfVar.f11339v).hasTransport(0)) {
                            j11 = 0;
                        }
                    }
                    j11 = -1;
                } finally {
                }
            }
            hashMap.put("nt", Long.valueOf(j11));
        }
        kg kgVar = this.f4489f;
        if (kgVar.f7736d) {
            j10 = kgVar.f7734b - kgVar.f7733a;
        } else {
            j10 = -1;
        }
        hashMap.put("vs", Long.valueOf(j10));
        long j12 = kgVar.f7735c;
        kgVar.f7735c = -1L;
        hashMap.put("vf", Long.valueOf(j12));
        return hashMap;
    }

    @Override // com.google.android.gms.internal.ads.cw0
    public final HashMap c() {
        HashMap b10 = b();
        g9 g9Var = this.f4491h;
        List list = g9Var.f6330a;
        g9Var.f6330a = Collections.EMPTY_LIST;
        b10.put("vst", list);
        return b10;
    }

    @Override // com.google.android.gms.internal.ads.cw0
    public final HashMap k() {
        View view;
        HashMap b10 = b();
        ig igVar = this.f4487c;
        if (igVar.F <= -2) {
            WeakReference weakReference = igVar.B;
            if (weakReference != null) {
                view = (View) weakReference.get();
            } else {
                view = null;
            }
            if (view == null) {
                igVar.F = -3L;
            }
        }
        b10.put("lts", Long.valueOf(igVar.F));
        return b10;
    }

    @Override // com.google.android.gms.internal.ads.cw0
    public final HashMap zzb() {
        return b();
    }
}
