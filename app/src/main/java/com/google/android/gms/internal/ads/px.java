package com.google.android.gms.internal.ads;
import ac.b;
import f9.k;
import g9.p;
import g9.r;
import k9.a0;
import k9.c0;
import l9.a;
import l9.i;
import l9.j;
import la.b;
import ya.m0;

import android.content.Context;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class px {

    /* renamed from: a, reason: collision with root package name */
    public final Object f9632a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final c0 f9633b;

    /* renamed from: c, reason: collision with root package name */
    public final sx f9634c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f9635d;
    public Context e;

    /* renamed from: f, reason: collision with root package name */
    public a f9636f;

    /* renamed from: g, reason: collision with root package name */
    public String f9637g;

    /* renamed from: h, reason: collision with root package name */
    public com.google.android.gms.internal.consent_sdk.c f9638h;
    public be0 i;

    /* renamed from: j, reason: collision with root package name */
    public Boolean f9639j;

    /* renamed from: k, reason: collision with root package name */
    public final AtomicInteger f9640k;

    /* renamed from: l, reason: collision with root package name */
    public final AtomicInteger f9641l;

    /* renamed from: m, reason: collision with root package name */
    public final ox f9642m;

    /* renamed from: n, reason: collision with root package name */
    public final Object f9643n;

    /* renamed from: o, reason: collision with root package name */
    public b f9644o;

    /* renamed from: p, reason: collision with root package name */
    public final AtomicBoolean f9645p;

    /* renamed from: q, reason: collision with root package name */
    public final AtomicBoolean f9646q;

    public px() {
        c0 c0Var = new c0();
        this.f9633b = c0Var;
        this.f9634c = new sx(p.f17688g.f17693f, c0Var);
        this.f9635d = false;
        this.f9638h = null;
        this.i = null;
        this.f9639j = null;
        this.f9640k = new AtomicInteger(0);
        this.f9641l = new AtomicInteger(0);
        this.f9642m = new ox();
        this.f9643n = new Object();
        this.f9645p = new AtomicBoolean();
        this.f9646q = new AtomicBoolean(false);
    }

    public final com.google.android.gms.internal.consent_sdk.c a() {
        com.google.android.gms.internal.consent_sdk.c cVar;
        synchronized (this.f9632a) {
            cVar = this.f9638h;
        }
        return cVar;
    }

    public final void b(Context context, a aVar, be0 be0Var) {
        com.google.android.gms.internal.consent_sdk.c cVar;
        synchronized (this.f9632a) {
            try {
                if (!this.f9635d) {
                    this.e = context.getApplicationContext();
                    this.f9636f = aVar;
                    k.C.f16816g.g(this.f9634c);
                    this.f9633b.k(this.e);
                    pu.b(this.e, this.f9636f);
                    this.i = be0Var;
                    nl nlVar = sl.E2;
                    r rVar = r.e;
                    if (!((Boolean) rVar.f17698c.a(nlVar)).booleanValue()) {
                        a0.k("CsiReporterFactory: CSI is not enabled. No CSI reporter created.");
                        cVar = null;
                    } else {
                        cVar = new com.google.android.gms.internal.consent_sdk.c(1);
                    }
                    this.f9638h = cVar;
                    if (cVar != null) {
                        x21.i(new nx(this).r(), "AppState.registerCsiReporter", xx.f12657h);
                    }
                    Context context2 = this.e;
                    if (b.h()) {
                        if (((Boolean) rVar.f17698c.a(sl.C9)).booleanValue()) {
                            try {
                                ((ConnectivityManager) context2.getSystemService("connectivity")).registerDefaultNetworkCallback(new sf(this));
                            } catch (RuntimeException e) {
                                int i = a0.f19634b;
                                i.g("Failed to register network callback", e);
                                this.f9645p.set(true);
                            }
                        }
                    }
                    this.f9635d = true;
                    h();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!((Boolean) r.e.f17698c.a(sl.f11038yf)).booleanValue()) {
            k.C.f16813c.E(context, aVar.f20029u);
        }
    }

    public final Resources c() {
        if (this.f9636f.f20032x) {
            return this.e.getResources();
        }
        try {
            boolean booleanValue = ((Boolean) r.e.f17698c.a(sl.f10860nc)).booleanValue();
            Context context = this.e;
            if (booleanValue) {
                return m0.a(context).f22632a.getResources();
            }
            m0.a(context).f22632a.getResources();
            return null;
        } catch (j e) {
            int i = a0.f19634b;
            i.g("Cannot load resource from dynamite apk or local jar", e);
            return null;
        }
    }

    public final void d(String str, Throwable th) {
        pu.b(this.e, this.f9636f).c(str, th);
    }

    public final void e(String str, Throwable th) {
        pu.b(this.e, this.f9636f).d(th, str, ((Double) fn.f6131f.p()).floatValue());
    }

    public final void f(String str, Throwable th) {
        Context context = this.e;
        a aVar = this.f9636f;
        synchronized (pu.F) {
            try {
                if (pu.H == null) {
                    nl nlVar = sl.A8;
                    r rVar = r.e;
                    if (((Boolean) rVar.f17698c.a(nlVar)).booleanValue()) {
                        if (!((Boolean) rVar.f17698c.a(sl.f11047z8)).booleanValue()) {
                            pu.H = new pu(context, aVar);
                        }
                    }
                    pu.H = new fp(11);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        pu.H.c(str, th);
    }

    public final c0 g() {
        c0 c0Var;
        synchronized (this.f9632a) {
            c0Var = this.f9633b;
        }
        return c0Var;
    }

    public final b h() {
        if (this.e != null) {
            if (!((Boolean) r.e.f17698c.a(sl.M3)).booleanValue()) {
                synchronized (this.f9643n) {
                    try {
                        b bVar = this.f9644o;
                        if (bVar != null) {
                            return bVar;
                        }
                        b j10 = xx.f12651a.j(new qf(1, this));
                        this.f9644o = j10;
                        return j10;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
        return ed1.e(new ArrayList());
    }

    public final boolean i(Context context) {
        if (b.h()) {
            if (((Boolean) r.e.f17698c.a(sl.C9)).booleanValue()) {
                return this.f9645p.get();
            }
        }
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
            return true;
        }
        return false;
    }
}
