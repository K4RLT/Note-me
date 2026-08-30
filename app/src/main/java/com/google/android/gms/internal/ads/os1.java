package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.os.Looper;

/* loaded from: classes.dex */
public final class os1 {
    public static final /* synthetic */ int A = 0;

    /* renamed from: a, reason: collision with root package name */
    public final Context f9208a;

    /* renamed from: b, reason: collision with root package name */
    public final s6 f9209b;

    /* renamed from: c, reason: collision with root package name */
    public final lt0 f9210c;

    /* renamed from: d, reason: collision with root package name */
    public final ju0 f9211d;
    public r31 e;

    /* renamed from: f, reason: collision with root package name */
    public r31 f9212f;

    /* renamed from: g, reason: collision with root package name */
    public final ll f9213g;

    /* renamed from: h, reason: collision with root package name */
    public final Looper f9214h;
    public final int i;

    /* renamed from: j, reason: collision with root package name */
    public final l50 f9215j;

    /* renamed from: k, reason: collision with root package name */
    public final int f9216k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f9217l;

    /* renamed from: m, reason: collision with root package name */
    public final du1 f9218m;

    /* renamed from: n, reason: collision with root package name */
    public final cu1 f9219n;

    /* renamed from: o, reason: collision with root package name */
    public final long f9220o;

    /* renamed from: p, reason: collision with root package name */
    public final long f9221p;

    /* renamed from: q, reason: collision with root package name */
    public final int f9222q;

    /* renamed from: r, reason: collision with root package name */
    public final int f9223r;

    /* renamed from: s, reason: collision with root package name */
    public final int f9224s;

    /* renamed from: t, reason: collision with root package name */
    public final int f9225t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f9226u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f9227v;

    /* renamed from: w, reason: collision with root package name */
    public final String f9228w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f9229x;

    /* renamed from: y, reason: collision with root package name */
    public final boolean f9230y;

    /* renamed from: z, reason: collision with root package name */
    public final js1 f9231z;

    static {
        String str = bq0.f4860a;
        String h3 = ed1.h(Build.DEVICE);
        if (!h3.contains("emulator") && !h3.contains("emu64a") && !h3.contains("emu64x")) {
            h3.contains("generic");
        }
    }

    public os1(Context context, hx0 hx0Var) {
        lt0 lt0Var = new lt0(8, hx0Var);
        ju0 ju0Var = new ju0(context);
        d70 d70Var = new d70(context);
        tn1 tn1Var = tn1.f11401v;
        ll llVar = new ll(context, 3);
        context.getClass();
        this.f9208a = context;
        this.f9210c = lt0Var;
        this.f9211d = ju0Var;
        this.e = d70Var;
        this.f9212f = tn1Var;
        this.f9213g = llVar;
        String str = bq0.f4860a;
        Looper myLooper = Looper.myLooper();
        this.f9214h = myLooper == null ? Looper.getMainLooper() : myLooper;
        this.f9215j = l50.f7948b;
        this.f9216k = 1;
        this.f9217l = true;
        this.f9218m = du1.f5524c;
        this.f9219n = cu1.f5175b;
        this.f9231z = new js1(bq0.u(20L), bq0.u(500L));
        this.f9209b = s6.f10534z;
        this.f9220o = 500L;
        this.f9221p = 2000L;
        this.f9222q = 600000;
        this.f9223r = Integer.MAX_VALUE;
        this.f9224s = Integer.MAX_VALUE;
        this.f9225t = 600000;
        this.f9226u = true;
        this.f9228w = "";
        this.i = -1000;
        if (Build.VERSION.SDK_INT >= 35) {
            int i = ms1.f8408a;
        }
        this.f9229x = true;
        this.f9230y = true;
    }
}
