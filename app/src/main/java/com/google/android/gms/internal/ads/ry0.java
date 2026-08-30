package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class ry0 implements ny0 {

    /* renamed from: u, reason: collision with root package name */
    public static final yg f10352u;

    /* renamed from: a, reason: collision with root package name */
    public final Context f10353a;

    /* renamed from: b, reason: collision with root package name */
    public final dy0 f10354b;

    /* renamed from: c, reason: collision with root package name */
    public final ExecutorService f10355c;

    /* renamed from: d, reason: collision with root package name */
    public final cy0 f10356d;
    public final boolean e;

    /* renamed from: f, reason: collision with root package name */
    public final String f10357f;

    /* renamed from: g, reason: collision with root package name */
    public final long f10358g;

    /* renamed from: h, reason: collision with root package name */
    public final long f10359h;
    public final double i;

    /* renamed from: j, reason: collision with root package name */
    public final String f10360j;

    /* renamed from: k, reason: collision with root package name */
    public final long f10361k;

    /* renamed from: l, reason: collision with root package name */
    public final AtomicBoolean f10362l = new AtomicBoolean(false);

    /* renamed from: m, reason: collision with root package name */
    public final Object f10363m = new Object();

    /* renamed from: n, reason: collision with root package name */
    public final Object f10364n = new Object();

    /* renamed from: o, reason: collision with root package name */
    public final Object f10365o = new Object();

    /* renamed from: p, reason: collision with root package name */
    public final ld f10366p = md.z();

    /* renamed from: q, reason: collision with root package name */
    public final ArrayList f10367q = new ArrayList();

    /* renamed from: r, reason: collision with root package name */
    public boolean f10368r = false;

    /* renamed from: s, reason: collision with root package name */
    public final HashMap f10369s = new HashMap();

    /* renamed from: t, reason: collision with root package name */
    public final int f10370t;

    static {
        xg z3 = yg.z();
        z3.b();
        ((yg) z3.f4845v).A(17);
        f10352u = (yg) z3.c();
    }

    public ry0(Context context, dy0 dy0Var, ExecutorService executorService, cy0 cy0Var, Random random, String str, long j10, long j11, double d2, String str2, int i, long j12) {
        this.f10353a = context;
        this.f10354b = dy0Var;
        this.f10355c = executorService;
        this.f10356d = cy0Var;
        this.f10357f = str;
        this.f10358g = j10;
        this.f10359h = j11;
        this.i = d2;
        this.f10360j = str2;
        this.f10370t = i;
        this.f10361k = j12;
        this.e = random.nextDouble() < d2;
    }

    public final void a(int i, long j10, Throwable th, String str) {
        long longValue;
        if (!this.e) {
            return;
        }
        synchronized (this.f10364n) {
            try {
                ArrayList arrayList = this.f10367q;
                synchronized (this.f10365o) {
                    try {
                        HashMap hashMap = this.f10369s;
                        Integer valueOf = Integer.valueOf(i);
                        Long l10 = (Long) hashMap.get(valueOf);
                        if (l10 == null) {
                            l10 = 0L;
                        }
                        longValue = 1 + l10.longValue();
                        hashMap.put(valueOf, Long.valueOf(longValue));
                    } finally {
                    }
                }
                arrayList.add(new py0(i, j10, th, str, longValue));
                if (!this.f10368r) {
                    this.f10368r = true;
                    this.f10354b.a(new qy0(1, this), this.f10359h);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void b(md mdVar) {
        try {
            fh z3 = gh.z();
            yg ygVar = f10352u;
            z3.b();
            ((gh) z3.f4845v).B(ygVar);
            dh z9 = eh.z();
            z9.b();
            ((eh) z9.f4845v).A(mdVar);
            eh ehVar = (eh) z9.c();
            z3.b();
            ((gh) z3.f4845v).A(ehVar);
            this.f10356d.a(this.f10357f, true, ((gh) z3.c()).b(), "application/x-protobuf");
        } catch (RuntimeException unused) {
        }
    }

    @Override // com.google.android.gms.internal.ads.ny0
    public final ac.b zza() {
        h91 h91Var = new h91(Executors.callable(new qy0(0, this), null));
        this.f10355c.execute(h91Var);
        return h91Var;
    }
}
