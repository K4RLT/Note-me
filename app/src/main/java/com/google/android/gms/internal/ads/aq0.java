package com.google.android.gms.internal.ads;
import b8.u4;
import c9.a;
import c9.c;
import c9.d;
import g9.c3;
import g9.f3;
import g9.o0;
import g9.r;
import g9.u0;
import g9.v2;
import g9.w2;
import g9.x0;
import g9.z2;
import k9.f0;
import r.e;

import android.location.Location;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONArray;

/* loaded from: classes.dex */
public final class aq0 {

    /* renamed from: a, reason: collision with root package name */
    public final g9.w2 f4578a;

    /* renamed from: b, reason: collision with root package name */
    public final lq f4579b;

    /* renamed from: c, reason: collision with root package name */
    public final yk0 f4580c;

    /* renamed from: d, reason: collision with root package name */
    public final g9.z2 f4581d;
    public final Bundle e;

    /* renamed from: f, reason: collision with root package name */
    public final g9.c3 f4582f;

    /* renamed from: g, reason: collision with root package name */
    public final String f4583g;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f4584h;
    public final ArrayList i;

    /* renamed from: j, reason: collision with root package name */
    public final rn f4585j;

    /* renamed from: k, reason: collision with root package name */
    public final g9.f3 f4586k;

    /* renamed from: l, reason: collision with root package name */
    public final int f4587l;

    /* renamed from: m, reason: collision with root package name */
    public final c9.a f4588m;

    /* renamed from: n, reason: collision with root package name */
    public final c9.d f4589n;

    /* renamed from: o, reason: collision with root package name */
    public final g9.u0 f4590o;

    /* renamed from: p, reason: collision with root package name */
    public final b8.u4 f4591p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f4592q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f4593r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f4594s;

    /* renamed from: t, reason: collision with root package name */
    public final Bundle f4595t;

    /* renamed from: u, reason: collision with root package name */
    public final AtomicLong f4596u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f4597v;

    /* renamed from: w, reason: collision with root package name */
    public final JSONArray f4598w;

    /* renamed from: x, reason: collision with root package name */
    public final g9.x0 f4599x;

    public aq0(zp0 zp0Var) {
        AtomicLong atomicLong;
        this.f4582f = zp0Var.f13227b;
        this.f4583g = zp0Var.f13228c;
        this.f4599x = zp0Var.f13247x;
        g9.z2 z2Var = zp0Var.f13226a;
        this.e = z2Var.W;
        int i = z2Var.f17721u;
        long j10 = z2Var.f17722v;
        Bundle bundle = z2Var.f17723w;
        int i10 = z2Var.f17724x;
        List list = z2Var.f17725y;
        boolean z3 = z2Var.f17726z;
        int i11 = z2Var.A;
        boolean z9 = true;
        if (!z2Var.B && !zp0Var.e) {
            z9 = false;
        }
        String str = z2Var.C;
        g9.v2 v2Var = z2Var.D;
        Location location = z2Var.E;
        String str2 = z2Var.F;
        Bundle bundle2 = z2Var.G;
        Bundle bundle3 = z2Var.H;
        List list2 = z2Var.I;
        String str3 = z2Var.J;
        String str4 = z2Var.K;
        boolean z10 = z2Var.L;
        g9.o0 o0Var = z2Var.M;
        int i12 = z2Var.N;
        String str5 = z2Var.O;
        List list3 = z2Var.P;
        int u9 = k9.f0.u(z2Var.Q);
        g9.z2 z2Var2 = zp0Var.f13226a;
        g9.z2 z2Var3 = new g9.z2(i, j10, bundle, i10, list, z3, i11, z9, str, v2Var, location, str2, bundle2, bundle3, list2, str3, str4, z10, o0Var, i12, str5, list3, u9, z2Var2.R, z2Var2.S, z2Var2.T, z2Var2.U, z2Var2.V);
        this.f4581d = z2Var3;
        g9.w2 w2Var = zp0Var.f13229d;
        rn rnVar = null;
        if (w2Var == null) {
            rn rnVar2 = zp0Var.f13232h;
            if (rnVar2 != null) {
                w2Var = rnVar2.f10253z;
            } else {
                w2Var = null;
            }
        }
        this.f4578a = w2Var;
        ArrayList arrayList = zp0Var.f13230f;
        this.f4584h = arrayList;
        this.i = zp0Var.f13231g;
        if (arrayList != null && (rnVar = zp0Var.f13232h) == null) {
            rnVar = new rn(new c9.c(new c9.c()));
        }
        this.f4585j = rnVar;
        this.f4586k = zp0Var.i;
        this.f4587l = zp0Var.f13236m;
        this.f4588m = zp0Var.f13233j;
        this.f4589n = zp0Var.f13234k;
        this.f4590o = zp0Var.f13235l;
        this.f4579b = zp0Var.f13237n;
        this.f4591p = new b8.u4(zp0Var.f13238o);
        this.f4592q = zp0Var.f13239p;
        this.f4593r = zp0Var.f13240q;
        this.f4580c = zp0Var.f13241r;
        this.f4594s = zp0Var.f13242s;
        this.f4595t = zp0Var.f13243t;
        long j11 = z2Var3.U;
        if (j11 != 0) {
            atomicLong = new AtomicLong(j11);
        } else {
            atomicLong = zp0Var.f13244u;
        }
        this.f4596u = atomicLong;
        this.f4597v = zp0Var.f13245v;
        this.f4598w = zp0Var.f13246w;
    }

    public final boolean a() {
        return this.f4583g.matches((String) g9.r.e.f17698c.a(sl.f10695d4));
    }
}
