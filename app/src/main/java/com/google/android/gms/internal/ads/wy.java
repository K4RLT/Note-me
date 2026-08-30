package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.SystemClock;
import java.io.InputStream;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public final class wy implements pf1 {
    public boolean A;
    public Uri B;
    public volatile dj C;
    public boolean D = false;
    public boolean E = false;
    public dj1 F;

    /* renamed from: u, reason: collision with root package name */
    public final Context f12364u;

    /* renamed from: v, reason: collision with root package name */
    public final tl1 f12365v;

    /* renamed from: w, reason: collision with root package name */
    public final String f12366w;

    /* renamed from: x, reason: collision with root package name */
    public final int f12367x;

    /* renamed from: y, reason: collision with root package name */
    public final boolean f12368y;

    /* renamed from: z, reason: collision with root package name */
    public InputStream f12369z;

    public wy(Context context, tl1 tl1Var, String str, int i) {
        this.f12364u = context;
        this.f12365v = tl1Var;
        this.f12366w = str;
        this.f12367x = i;
        new AtomicLong(-1L);
        this.f12368y = ((Boolean) g9.r.e.f17698c.a(sl.f11010x2)).booleanValue();
    }

    @Override // com.google.android.gms.internal.ads.pf1
    public final long a(dj1 dj1Var) {
        Long l10;
        if (!this.A) {
            this.A = true;
            Uri uri = dj1Var.f5444a;
            this.B = uri;
            this.F = dj1Var;
            this.C = dj.a(uri);
            nl nlVar = sl.f10791j5;
            g9.r rVar = g9.r.e;
            boolean booleanValue = ((Boolean) rVar.f17698c.a(nlVar)).booleanValue();
            dj djVar = this.C;
            aj ajVar = null;
            String str = "";
            if (booleanValue) {
                if (djVar != null) {
                    this.C.B = dj1Var.f5446c;
                    dj djVar2 = this.C;
                    String str2 = this.f12366w;
                    if (str2 != null) {
                        str = str2;
                    }
                    djVar2.C = str;
                    this.C.D = this.f12367x;
                    if (this.C.A) {
                        l10 = (Long) rVar.f17698c.a(sl.f10821l5);
                    } else {
                        l10 = (Long) rVar.f17698c.a(sl.f10806k5);
                    }
                    long longValue = l10.longValue();
                    f9.k.C.f16819k.getClass();
                    SystemClock.elapsedRealtime();
                    fj n10 = s6.n(this.f12364u, this.C);
                    try {
                        try {
                            try {
                                hj hjVar = (hj) n10.f12998u.get(longValue, TimeUnit.MILLISECONDS);
                                hjVar.getClass();
                                this.D = hjVar.f6826c;
                                this.E = hjVar.e;
                                if (!d()) {
                                    this.f12369z = hjVar.f6824a;
                                }
                            } catch (InterruptedException unused) {
                                n10.cancel(false);
                                Thread.currentThread().interrupt();
                            }
                        } catch (ExecutionException | TimeoutException unused2) {
                            n10.cancel(false);
                        }
                    } catch (Throwable unused3) {
                    }
                    f9.k.C.f16819k.getClass();
                    SystemClock.elapsedRealtime();
                    throw null;
                }
            } else {
                if (djVar != null) {
                    this.C.B = dj1Var.f5446c;
                    dj djVar3 = this.C;
                    String str3 = this.f12366w;
                    if (str3 != null) {
                        str = str3;
                    }
                    djVar3.C = str;
                    this.C.D = this.f12367x;
                    ajVar = f9.k.C.f16818j.f(this.C);
                }
                if (ajVar != null && ajVar.a()) {
                    this.D = ajVar.g();
                    this.E = ajVar.d();
                    if (!d()) {
                        this.f12369z = ajVar.b();
                        return -1L;
                    }
                }
            }
            if (this.C != null) {
                Map map = dj1Var.f5445b;
                long j10 = dj1Var.f5446c;
                long j11 = dj1Var.f5447d;
                int i = dj1Var.e;
                Uri parse = Uri.parse(this.C.f5436u);
                b80.M(parse, "The uri must be set.");
                this.F = new dj1(parse, map, j10, j11, i);
            }
            return this.f12365v.a(this.F);
        }
        q.x.p("Attempt to open an already open CacheDataSource.");
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.pf1
    public final void b(as1 as1Var) {
    }

    @Override // com.google.android.gms.internal.ads.pf1
    public final Uri c() {
        return this.B;
    }

    public final boolean d() {
        if (this.f12368y) {
            nl nlVar = sl.f10836m5;
            g9.r rVar = g9.r.e;
            if (!((Boolean) rVar.f17698c.a(nlVar)).booleanValue() || this.D) {
                if (((Boolean) rVar.f17698c.a(sl.f10853n5)).booleanValue() && !this.E) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.fs1
    public final int e(byte[] bArr, int i, int i10) {
        if (this.A) {
            InputStream inputStream = this.f12369z;
            if (inputStream != null) {
                return inputStream.read(bArr, i, i10);
            }
            return this.f12365v.e(bArr, i, i10);
        }
        q.x.p("Attempt to read closed CacheDataSource.");
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.pf1
    public final void k() {
        if (this.A) {
            this.A = false;
            this.B = null;
            InputStream inputStream = this.f12369z;
            if (inputStream != null) {
                la.b.d(inputStream);
                this.f12369z = null;
                return;
            } else {
                this.f12365v.k();
                return;
            }
        }
        q.x.p("Attempt to close an already closed CacheDataSource.");
    }
}
