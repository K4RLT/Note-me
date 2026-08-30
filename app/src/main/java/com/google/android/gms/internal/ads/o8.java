package com.google.android.gms.internal.ads;

import android.text.Layout;

/* loaded from: classes.dex */
public final class o8 {

    /* renamed from: a, reason: collision with root package name */
    public String f9000a;

    /* renamed from: b, reason: collision with root package name */
    public int f9001b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f9002c;

    /* renamed from: d, reason: collision with root package name */
    public int f9003d;
    public boolean e;

    /* renamed from: k, reason: collision with root package name */
    public float f9008k;

    /* renamed from: l, reason: collision with root package name */
    public String f9009l;

    /* renamed from: o, reason: collision with root package name */
    public Layout.Alignment f9012o;

    /* renamed from: p, reason: collision with root package name */
    public Layout.Alignment f9013p;

    /* renamed from: r, reason: collision with root package name */
    public i8 f9015r;

    /* renamed from: t, reason: collision with root package name */
    public String f9017t;

    /* renamed from: u, reason: collision with root package name */
    public String f9018u;

    /* renamed from: v, reason: collision with root package name */
    public String f9019v;

    /* renamed from: f, reason: collision with root package name */
    public int f9004f = -1;

    /* renamed from: g, reason: collision with root package name */
    public int f9005g = -1;

    /* renamed from: h, reason: collision with root package name */
    public int f9006h = -1;
    public int i = -1;

    /* renamed from: j, reason: collision with root package name */
    public int f9007j = -1;

    /* renamed from: m, reason: collision with root package name */
    public int f9010m = -1;

    /* renamed from: n, reason: collision with root package name */
    public int f9011n = -1;

    /* renamed from: q, reason: collision with root package name */
    public int f9014q = -1;

    /* renamed from: s, reason: collision with root package name */
    public float f9016s = Float.MAX_VALUE;

    public final String a() {
        return this.f9017t;
    }

    public final String b() {
        return this.f9018u;
    }

    public final String c() {
        return this.f9019v;
    }

    public final void d(o8 o8Var) {
        int i;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (o8Var != null) {
            if (!this.f9002c && o8Var.f9002c) {
                this.f9001b = o8Var.f9001b;
                this.f9002c = true;
            }
            if (this.f9006h == -1) {
                this.f9006h = o8Var.f9006h;
            }
            if (this.i == -1) {
                this.i = o8Var.i;
            }
            if (this.f9000a == null && (str = o8Var.f9000a) != null) {
                this.f9000a = str;
            }
            if (this.f9004f == -1) {
                this.f9004f = o8Var.f9004f;
            }
            if (this.f9005g == -1) {
                this.f9005g = o8Var.f9005g;
            }
            if (this.f9011n == -1) {
                this.f9011n = o8Var.f9011n;
            }
            if (this.f9012o == null && (alignment2 = o8Var.f9012o) != null) {
                this.f9012o = alignment2;
            }
            if (this.f9013p == null && (alignment = o8Var.f9013p) != null) {
                this.f9013p = alignment;
            }
            if (this.f9014q == -1) {
                this.f9014q = o8Var.f9014q;
            }
            if (this.f9007j == -1) {
                this.f9007j = o8Var.f9007j;
                this.f9008k = o8Var.f9008k;
            }
            if (this.f9015r == null) {
                this.f9015r = o8Var.f9015r;
            }
            if (this.f9016s == Float.MAX_VALUE) {
                this.f9016s = o8Var.f9016s;
            }
            if (this.f9017t == null) {
                this.f9017t = o8Var.f9017t;
            }
            if (this.f9018u == null) {
                this.f9018u = o8Var.f9018u;
            }
            if (this.f9019v == null) {
                this.f9019v = o8Var.f9019v;
            }
            if (!this.e && o8Var.e) {
                this.f9003d = o8Var.f9003d;
                this.e = true;
            }
            if (this.f9010m == -1 && (i = o8Var.f9010m) != -1) {
                this.f9010m = i;
            }
        }
    }

    public final String e() {
        return this.f9009l;
    }
}
