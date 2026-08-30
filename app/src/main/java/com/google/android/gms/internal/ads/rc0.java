package com.google.android.gms.internal.ads;
import ac.b;
import j6.c;
import j6.e;
import j6.l;
import l9.a;

import android.content.Context;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class rc0 {

    /* renamed from: b, reason: collision with root package name */
    public final j6.l f10200b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f10201c;

    /* renamed from: d, reason: collision with root package name */
    public final be0 f10202d;
    public final Executor e;

    /* renamed from: f, reason: collision with root package name */
    public final of f10203f;

    /* renamed from: g, reason: collision with root package name */
    public final l9.a f10204g;
    public final rh0 i;

    /* renamed from: j, reason: collision with root package name */
    public final xs0 f10206j;

    /* renamed from: k, reason: collision with root package name */
    public final wh0 f10207k;

    /* renamed from: l, reason: collision with root package name */
    public final cq0 f10208l;

    /* renamed from: m, reason: collision with root package name */
    public final b60 f10209m;

    /* renamed from: n, reason: collision with root package name */
    public c81 f10210n;

    /* renamed from: a, reason: collision with root package name */
    public final nc0 f10199a = new Object();

    /* renamed from: h, reason: collision with root package name */
    public final jp f10205h = new jp();

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, com.google.android.gms.internal.ads.nc0] */
    public rc0(qc0 qc0Var) {
        this.f10201c = qc0Var.f9806b;
        this.e = qc0Var.e;
        this.f10203f = qc0Var.f9809f;
        this.f10204g = qc0Var.f9810g;
        this.f10200b = qc0Var.f9805a;
        this.i = qc0Var.f9808d;
        this.f10206j = qc0Var.f9811h;
        this.f10202d = qc0Var.f9807c;
        this.f10207k = qc0Var.i;
        this.f10208l = qc0Var.f9812j;
        this.f10209m = qc0Var.f9813k;
    }

    public final synchronized ac.b a(String str, JSONObject jSONObject) {
        c81 c81Var = this.f10210n;
        if (c81Var == null) {
            return v81.f11836v;
        }
        return ed1.c0(c81Var, new d50(2, this, str, jSONObject), this.e);
    }

    public final synchronized void b(String str, mp mpVar) {
        c81 c81Var = this.f10210n;
        if (c81Var == null) {
            return;
        }
        j6.c cVar = new j6.c(6, this, str, mpVar);
        c81Var.a(new t81(c81Var, 0, cVar), this.e);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [j6.e, java.lang.Object] */
    public final synchronized void c(String str, mp mpVar) {
        c81 c81Var = this.f10210n;
        if (c81Var == null) {
            return;
        }
        Object obj = new Object();
        obj.f18918u = str;
        obj.f18919v = mpVar;
        Objects.requireNonNull(this);
        c81Var.a(new t81(c81Var, 0, (Object) obj), this.e);
    }

    public final synchronized void d(Map map) {
        c81 c81Var = this.f10210n;
        if (c81Var == null) {
            return;
        }
        tf tfVar = new tf(this, map);
        c81Var.a(new t81(c81Var, 0, tfVar), this.e);
    }
}
