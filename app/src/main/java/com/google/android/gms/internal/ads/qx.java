package com.google.android.gms.internal.ads;
import f9.k;
import g9.r;
import g9.z2;
import k9.c0;
import r.e;

import android.os.Bundle;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class qx {

    /* renamed from: h, reason: collision with root package name */
    public final String f10017h;
    public final k9.c0 i;

    /* renamed from: a, reason: collision with root package name */
    public long f10011a = -1;

    /* renamed from: b, reason: collision with root package name */
    public long f10012b = -1;

    /* renamed from: c, reason: collision with root package name */
    public int f10013c = -1;

    /* renamed from: d, reason: collision with root package name */
    public int f10014d = -1;
    public long e = 0;

    /* renamed from: f, reason: collision with root package name */
    public final Object f10015f = new Object();

    /* renamed from: g, reason: collision with root package name */
    public final Object f10016g = new Object();

    /* renamed from: j, reason: collision with root package name */
    public int f10018j = 0;

    /* renamed from: k, reason: collision with root package name */
    public int f10019k = 0;

    /* renamed from: l, reason: collision with root package name */
    public int f10020l = 0;

    /* renamed from: m, reason: collision with root package name */
    public int f10021m = 0;

    /* renamed from: n, reason: collision with root package name */
    public final HashMap f10022n = new HashMap();

    /* renamed from: o, reason: collision with root package name */
    public final HashMap f10023o = new HashMap();

    public qx(String str, k9.c0 c0Var) {
        this.f10017h = str;
        this.i = c0Var;
    }

    public final void a(g9.z2 z2Var, long j10) {
        long j11;
        long j12;
        Bundle bundle;
        int i;
        synchronized (this.f10015f) {
            try {
                k9.c0 c0Var = this.i;
                c0Var.i();
                synchronized (c0Var.f19642a) {
                    j11 = c0Var.f19654o;
                }
                f9.k.C.f16819k.getClass();
                long currentTimeMillis = System.currentTimeMillis();
                if (this.f10012b == -1) {
                    if (currentTimeMillis - j11 > ((Long) g9.r.e.f17698c.a(sl.C1)).longValue()) {
                        this.f10014d = -1;
                    } else {
                        c0Var.i();
                        synchronized (c0Var.f19642a) {
                            i = c0Var.f19656q;
                        }
                        this.f10014d = i;
                    }
                    this.f10012b = j10;
                    this.f10011a = j10;
                } else {
                    this.f10011a = j10;
                }
                if (!((Boolean) g9.r.e.f17698c.a(sl.f10995w4)).booleanValue() && (bundle = z2Var.f17723w) != null && bundle.getInt("gw", 2) == 1) {
                    return;
                }
                this.f10013c++;
                int i10 = this.f10014d + 1;
                this.f10014d = i10;
                if (i10 == 0) {
                    this.e = 0L;
                    c0Var.o(currentTimeMillis);
                } else {
                    c0Var.i();
                    synchronized (c0Var.f19642a) {
                        j12 = c0Var.f19655p;
                    }
                    this.e = currentTimeMillis - j12;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b() {
        if (((Boolean) dn.f5463a.p()).booleanValue()) {
            synchronized (this.f10015f) {
                this.f10013c--;
                this.f10014d--;
            }
        }
    }
}
