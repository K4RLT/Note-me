package com.google.android.gms.internal.ads;
import g9.r;
import g9.y1;
import ya.zb;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class ur0 implements Runnable {
    public y1 A;
    public ScheduledFuture B;

    /* renamed from: v, reason: collision with root package name */
    public final vr0 f11702v;

    /* renamed from: w, reason: collision with root package name */
    public String f11703w;

    /* renamed from: y, reason: collision with root package name */
    public String f11705y;

    /* renamed from: z, reason: collision with root package name */
    public tw f11706z;

    /* renamed from: u, reason: collision with root package name */
    public final ArrayList f11701u = new ArrayList();
    public int C = 2;

    /* renamed from: x, reason: collision with root package name */
    public int f11704x = 2;

    public ur0(vr0 vr0Var) {
        this.f11702v = vr0Var;
    }

    public final synchronized void a(rr0 rr0Var) {
        try {
            if (((Boolean) rm.f10240c.p()).booleanValue()) {
                ArrayList arrayList = this.f11701u;
                rr0Var.c();
                arrayList.add(rr0Var);
                ScheduledFuture scheduledFuture = this.B;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                }
                this.B = xx.f12654d.schedule(this, ((Integer) r.e.f17698c.a(sl.W9)).intValue(), TimeUnit.MILLISECONDS);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void b(ArrayList arrayList) {
        try {
            if (((Boolean) rm.f10240c.p()).booleanValue()) {
                if (!arrayList.contains("banner") && !arrayList.contains("BANNER")) {
                    if (!arrayList.contains("interstitial") && !arrayList.contains("INTERSTITIAL")) {
                        if (!arrayList.contains("native") && !arrayList.contains("NATIVE")) {
                            if (!arrayList.contains("rewarded") && !arrayList.contains("REWARDED")) {
                                if (arrayList.contains("app_open_ad")) {
                                    this.C = 7;
                                } else if (arrayList.contains("rewarded_interstitial") || arrayList.contains("REWARDED_INTERSTITIAL")) {
                                    this.C = 6;
                                }
                            }
                            this.C = 5;
                        }
                        this.C = 8;
                    }
                    this.C = 4;
                }
                this.C = 3;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void c(String str) {
        boolean matches;
        if (((Boolean) rm.f10240c.p()).booleanValue()) {
            if (TextUtils.isEmpty(str)) {
                matches = false;
            } else {
                matches = Pattern.matches((String) r.e.f17698c.a(sl.X9), str);
            }
            if (matches) {
                this.f11703w = str;
            }
        }
    }

    public final synchronized void d(Bundle bundle) {
        if (((Boolean) rm.f10240c.p()).booleanValue()) {
            this.f11704x = zb.c(bundle);
        }
    }

    public final synchronized void e(tw twVar) {
        if (((Boolean) rm.f10240c.p()).booleanValue()) {
            this.f11706z = twVar;
        }
    }

    public final synchronized void f(y1 y1Var) {
        if (((Boolean) rm.f10240c.p()).booleanValue()) {
            this.A = y1Var;
        }
    }

    public final synchronized void g(String str) {
        if (((Boolean) rm.f10240c.p()).booleanValue()) {
            this.f11705y = str;
        }
    }

    public final synchronized void h() {
        try {
            if (!((Boolean) rm.f10240c.p()).booleanValue()) {
                return;
            }
            ScheduledFuture scheduledFuture = this.B;
            int i = 0;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
            }
            ArrayList arrayList = this.f11701u;
            int size = arrayList.size();
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                rr0 rr0Var = (rr0) obj;
                int i10 = this.C;
                if (i10 != 2) {
                    rr0Var.i(i10);
                }
                if (!TextUtils.isEmpty(this.f11703w)) {
                    rr0Var.G(this.f11703w);
                }
                if (!TextUtils.isEmpty(this.f11705y) && !rr0Var.h()) {
                    rr0Var.j(this.f11705y);
                }
                tw twVar = this.f11706z;
                if (twVar != null) {
                    rr0Var.e(twVar);
                } else {
                    y1 y1Var = this.A;
                    if (y1Var != null) {
                        rr0Var.f(y1Var);
                    }
                }
                rr0Var.u(this.f11704x);
                this.f11702v.b(rr0Var.m());
            }
            arrayList.clear();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void i(int i) {
        if (((Boolean) rm.f10240c.p()).booleanValue()) {
            this.C = i;
        }
    }

    @Override // java.lang.Runnable
    public final synchronized void run() {
        h();
    }
}
