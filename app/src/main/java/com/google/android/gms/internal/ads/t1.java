package com.google.android.gms.internal.ads;
import de.m;
import eb.d1;
import eb.k2;
import eb.l2;
import eb.n2;
import eb.t1;
import g5.q;
import g9.v1;
import j6.s;
import q.f;
import q.x;
import qb.t;
import ya.bb;
import ya.d;
import ya.eg;
import ya.g1;
import ya.pf;

import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Objects;

/* loaded from: classes.dex */
public final /* synthetic */ class t1 implements Runnable {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f11224u;

    /* renamed from: v, reason: collision with root package name */
    public /* synthetic */ long f11225v;

    /* renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f11226w;

    /* renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f11227x;

    public t1(dt0 dt0Var, long j10, g9.v1 v1Var) {
        this.f11224u = 2;
        this.f11225v = j10;
        this.f11226w = v1Var;
        Objects.requireNonNull(dt0Var);
        this.f11227x = dt0Var;
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, ya.eg] */
    @Override // java.lang.Runnable
    public final void run() {
        boolean z3 = false;
        String str = null;
        switch (this.f11224u) {
            case 0:
                j6.s sVar = (j6.s) this.f11226w;
                Object obj = this.f11227x;
                long j10 = this.f11225v;
                String str2 = bq0.f4860a;
                ys1 ys1Var = ((rs1) sVar.f18982w).f10282u;
                ku1 ku1Var = ys1Var.L;
                gu1 u9 = ku1Var.u();
                ku1Var.p(u9, 26, new bl0(u9, obj, j10));
                if (ys1Var.f12944f0 == obj) {
                    ig0 ig0Var = ys1Var.H;
                    ig0Var.c(26, tn1.f11402w);
                    ig0Var.d();
                    return;
                }
                return;
            case 1:
                gb gbVar = (gb) this.f11227x;
                gbVar.f6353u.a(this.f11225v, (String) this.f11226w);
                gbVar.f6353u.b(gbVar.toString());
                return;
            case 2:
                dt0 dt0Var = (dt0) this.f11227x;
                if (dt0Var.f5508q != null) {
                    long j11 = this.f11225v;
                    g9.v1 v1Var = (g9.v1) this.f11226w;
                    if (v1Var instanceof p60) {
                        str = ((p60) v1Var).f9415x;
                    }
                    String str3 = str;
                    int s10 = dt0Var.s();
                    int t3 = dt0Var.t();
                    String g8 = dt0Var.g();
                    dt0Var.f5508q.n("paa", "pano_ts", j11, s10, t3, str3, dt0Var.f5510s, g8);
                    return;
                }
                return;
            case 3:
                eb.t1 t1Var = (eb.t1) this.f11226w;
                Bundle bundle = (Bundle) this.f11227x;
                long j12 = this.f11225v;
                if (TextUtils.isEmpty(((eb.d1) t1Var.f3443v).m().C())) {
                    t1Var.E(bundle, 0, j12);
                    return;
                } else {
                    t1Var.f().F.g("Using developer consent only; google app id found");
                    return;
                }
            case 4:
                eb.l2 l2Var = (eb.l2) this.f11227x;
                l2Var.G((eb.k2) this.f11226w, false, this.f11225v);
                l2Var.f16224z = null;
                eb.n2 p10 = ((eb.d1) l2Var.f3443v).p();
                p10.u();
                p10.y();
                p10.D(new iv1(12, p10, str, z3));
                return;
            default:
                ya.pf pfVar = (ya.pf) this.f11226w;
                ya.bb bbVar = ya.bb.AGGREGATED_ON_DEVICE_SUBJECT_SEGMENTATION_INFERENCE;
                ya.g1 g1Var = (ya.g1) this.f11227x;
                long j13 = this.f11225v;
                HashMap hashMap = pfVar.f31443j;
                if (!hashMap.containsKey(bbVar)) {
                    ya.d dVar = new ya.d();
                    Object obj2 = new Object();
                    if (dVar.isEmpty()) {
                        obj2.f31286w = dVar;
                        hashMap.put(bbVar, obj2);
                    } else {
                        q.x.m();
                        throw null;
                    }
                }
                ya.eg egVar = (ya.eg) hashMap.get(bbVar);
                Long valueOf = Long.valueOf(j13);
                ya.d dVar2 = egVar.f31286w;
                Collection collection = (Collection) dVar2.get(g1Var);
                if (collection == null) {
                    ArrayList arrayList = new ArrayList(3);
                    if (arrayList.add(valueOf)) {
                        dVar2.put(g1Var, arrayList);
                    } else {
                        g5.q.f("New Collection violated the Collection spec");
                        return;
                    }
                } else {
                    collection.add(valueOf);
                }
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (pfVar.d(bbVar, elapsedRealtime)) {
                    pfVar.i.put(bbVar, Long.valueOf(elapsedRealtime));
                    de.m.f15854u.execute(new qb.t(pfVar));
                    return;
                }
                return;
        }
    }

    public /* synthetic */ t1(j6.s sVar, Object obj, long j10) {
        this.f11224u = 0;
        this.f11226w = sVar;
        this.f11227x = obj;
        this.f11225v = j10;
    }

    public /* synthetic */ t1(Object obj, Object obj2, long j10, int i) {
        this.f11224u = i;
        this.f11226w = obj2;
        this.f11225v = j10;
        this.f11227x = obj;
    }

    public /* synthetic */ t1(ya.pf pfVar, ya.g1 g1Var, long j10) {
        this.f11224u = 5;
        ya.bb bbVar = ya.bb.UNKNOWN_EVENT;
        this.f11226w = pfVar;
        this.f11227x = g1Var;
        this.f11225v = j10;
    }

    public /* synthetic */ t1() {
        this.f11224u = 3;
    }
}
