package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONArray;

/* loaded from: classes.dex */
public final class zp0 {

    /* renamed from: a, reason: collision with root package name */
    public g9.z2 f13226a;

    /* renamed from: b, reason: collision with root package name */
    public g9.c3 f13227b;

    /* renamed from: c, reason: collision with root package name */
    public String f13228c;

    /* renamed from: d, reason: collision with root package name */
    public g9.w2 f13229d;
    public boolean e;

    /* renamed from: f, reason: collision with root package name */
    public ArrayList f13230f;

    /* renamed from: g, reason: collision with root package name */
    public ArrayList f13231g;

    /* renamed from: h, reason: collision with root package name */
    public rn f13232h;
    public g9.f3 i;

    /* renamed from: j, reason: collision with root package name */
    public c9.a f13233j;

    /* renamed from: k, reason: collision with root package name */
    public c9.d f13234k;

    /* renamed from: l, reason: collision with root package name */
    public g9.u0 f13235l;

    /* renamed from: m, reason: collision with root package name */
    public int f13236m = 1;

    /* renamed from: n, reason: collision with root package name */
    public lq f13237n;

    /* renamed from: o, reason: collision with root package name */
    public final b8.u4 f13238o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f13239p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f13240q;

    /* renamed from: r, reason: collision with root package name */
    public yk0 f13241r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f13242s;

    /* renamed from: t, reason: collision with root package name */
    public Bundle f13243t;

    /* renamed from: u, reason: collision with root package name */
    public final AtomicLong f13244u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f13245v;

    /* renamed from: w, reason: collision with root package name */
    public JSONArray f13246w;

    /* renamed from: x, reason: collision with root package name */
    public g9.x0 f13247x;

    public zp0() {
        b8.u4 u4Var = new b8.u4(4);
        u4Var.f2825v = 2;
        this.f13238o = u4Var;
        this.f13239p = false;
        this.f13240q = false;
        this.f13242s = false;
        this.f13244u = new AtomicLong();
        this.f13245v = false;
    }

    public final aq0 a() {
        fa.y.i(this.f13228c, "ad unit must not be null");
        fa.y.i(this.f13227b, "ad size must not be null");
        fa.y.i(this.f13226a, "ad request must not be null");
        return new aq0(this);
    }
}
