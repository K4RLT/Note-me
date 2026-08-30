package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.List;

/* loaded from: classes.dex */
public final class vt1 {

    /* renamed from: t, reason: collision with root package name */
    public static final yx1 f11984t = new yx1(-1, new Object());

    /* renamed from: a, reason: collision with root package name */
    public final uh f11985a;

    /* renamed from: b, reason: collision with root package name */
    public final yx1 f11986b;

    /* renamed from: c, reason: collision with root package name */
    public final long f11987c;

    /* renamed from: d, reason: collision with root package name */
    public final long f11988d;
    public final int e;

    /* renamed from: f, reason: collision with root package name */
    public final ns1 f11989f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f11990g;

    /* renamed from: h, reason: collision with root package name */
    public final zy1 f11991h;
    public final u i;

    /* renamed from: j, reason: collision with root package name */
    public final List f11992j;

    /* renamed from: k, reason: collision with root package name */
    public final yx1 f11993k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f11994l;

    /* renamed from: m, reason: collision with root package name */
    public final int f11995m;

    /* renamed from: n, reason: collision with root package name */
    public final int f11996n;

    /* renamed from: o, reason: collision with root package name */
    public final vb f11997o;

    /* renamed from: p, reason: collision with root package name */
    public volatile long f11998p;

    /* renamed from: q, reason: collision with root package name */
    public volatile long f11999q;

    /* renamed from: r, reason: collision with root package name */
    public volatile long f12000r;

    /* renamed from: s, reason: collision with root package name */
    public volatile long f12001s;

    public vt1(uh uhVar, yx1 yx1Var, long j10, long j11, int i, ns1 ns1Var, boolean z3, zy1 zy1Var, u uVar, List list, yx1 yx1Var2, boolean z9, int i10, int i11, vb vbVar, long j12, long j13, long j14, long j15) {
        this.f11985a = uhVar;
        this.f11986b = yx1Var;
        this.f11987c = j10;
        this.f11988d = j11;
        this.e = i;
        this.f11989f = ns1Var;
        this.f11990g = z3;
        this.f11991h = zy1Var;
        this.i = uVar;
        this.f11992j = list;
        this.f11993k = yx1Var2;
        this.f11994l = z9;
        this.f11995m = i10;
        this.f11996n = i11;
        this.f11997o = vbVar;
        this.f11998p = j12;
        this.f11999q = j13;
        this.f12000r = j14;
        this.f12001s = j15;
    }

    public static vt1 a(u uVar) {
        zf zfVar = uh.f11636a;
        zy1 zy1Var = zy1.f13336d;
        y51 y51Var = y51.f12781y;
        vb vbVar = vb.f11869d;
        yx1 yx1Var = f11984t;
        return new vt1(zfVar, yx1Var, -9223372036854775807L, 0L, 1, null, false, zy1Var, uVar, y51Var, yx1Var, false, 1, 0, vbVar, 0L, 0L, 0L, 0L);
    }

    public final vt1 b(yx1 yx1Var, long j10, long j11, long j12, long j13, zy1 zy1Var, u uVar, List list) {
        yx1 yx1Var2 = this.f11993k;
        boolean z3 = this.f11994l;
        int i = this.f11995m;
        int i10 = this.f11996n;
        vb vbVar = this.f11997o;
        long j14 = this.f11998p;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        return new vt1(this.f11985a, yx1Var, j11, j12, this.e, this.f11989f, this.f11990g, zy1Var, uVar, list, yx1Var2, z3, i, i10, vbVar, j14, j13, j10, elapsedRealtime);
    }

    public final vt1 c(uh uhVar) {
        return new vt1(uhVar, this.f11986b, this.f11987c, this.f11988d, this.e, this.f11989f, this.f11990g, this.f11991h, this.i, this.f11992j, this.f11993k, this.f11994l, this.f11995m, this.f11996n, this.f11997o, this.f11998p, this.f11999q, this.f12000r, this.f12001s);
    }

    public final vt1 d(int i) {
        return new vt1(this.f11985a, this.f11986b, this.f11987c, this.f11988d, i, this.f11989f, this.f11990g, this.f11991h, this.i, this.f11992j, this.f11993k, this.f11994l, this.f11995m, this.f11996n, this.f11997o, this.f11998p, this.f11999q, this.f12000r, this.f12001s);
    }

    public final vt1 e(ns1 ns1Var) {
        return new vt1(this.f11985a, this.f11986b, this.f11987c, this.f11988d, this.e, ns1Var, this.f11990g, this.f11991h, this.i, this.f11992j, this.f11993k, this.f11994l, this.f11995m, this.f11996n, this.f11997o, this.f11998p, this.f11999q, this.f12000r, this.f12001s);
    }

    public final vt1 f(boolean z3) {
        return new vt1(this.f11985a, this.f11986b, this.f11987c, this.f11988d, this.e, this.f11989f, z3, this.f11991h, this.i, this.f11992j, this.f11993k, this.f11994l, this.f11995m, this.f11996n, this.f11997o, this.f11998p, this.f11999q, this.f12000r, this.f12001s);
    }

    public final vt1 g(yx1 yx1Var) {
        return new vt1(this.f11985a, this.f11986b, this.f11987c, this.f11988d, this.e, this.f11989f, this.f11990g, this.f11991h, this.i, this.f11992j, yx1Var, this.f11994l, this.f11995m, this.f11996n, this.f11997o, this.f11998p, this.f11999q, this.f12000r, this.f12001s);
    }

    public final vt1 h(int i, int i10, boolean z3) {
        return new vt1(this.f11985a, this.f11986b, this.f11987c, this.f11988d, this.e, this.f11989f, this.f11990g, this.f11991h, this.i, this.f11992j, this.f11993k, z3, i, i10, this.f11997o, this.f11998p, this.f11999q, this.f12000r, this.f12001s);
    }

    public final boolean i() {
        return this.e == 3 && this.f11994l && this.f11996n == 0;
    }
}
