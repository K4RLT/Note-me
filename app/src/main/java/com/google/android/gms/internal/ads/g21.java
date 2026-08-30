package com.google.android.gms.internal.ads;
import q.x;

import android.os.SystemClock;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class g21 {

    /* renamed from: a, reason: collision with root package name */
    public long f6273a;

    /* renamed from: b, reason: collision with root package name */
    public int f6274b;

    /* renamed from: c, reason: collision with root package name */
    public long f6275c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f6276d;
    public final Serializable e;

    /* renamed from: f, reason: collision with root package name */
    public Serializable f6277f;

    public g21(int i, ry0 ry0Var) {
        this.e = new AtomicBoolean(false);
        this.f6273a = -1L;
        this.f6275c = -1L;
        this.f6277f = null;
        this.f6274b = i;
        this.f6276d = ry0Var;
    }

    public void a() {
        if (!((AtomicBoolean) this.e).get()) {
            this.f6273a = SystemClock.uptimeMillis();
        } else {
            x.o("Finished trace.");
        }
    }

    public void b(Throwable th) {
        if (!((AtomicBoolean) this.e).get()) {
            this.f6277f = th;
        } else {
            x.o("Finished trace.");
        }
    }

    public void c() {
        long j10;
        AtomicBoolean atomicBoolean = (AtomicBoolean) this.e;
        if (!atomicBoolean.getAndSet(true)) {
            this.f6275c = SystemClock.uptimeMillis();
            ry0 ry0Var = (ry0) this.f6276d;
            int i = this.f6274b;
            if (atomicBoolean.get()) {
                j10 = this.f6275c - this.f6273a;
            } else {
                j10 = -1;
            }
            ry0Var.a(i - 1, j10, (Throwable) this.f6277f, null);
            return;
        }
        x.o("Finished trace.");
    }

    public g21(String str, long j10, int i, long j11, ArrayList arrayList, String str2) {
        this.f6276d = str;
        this.f6273a = j10;
        this.f6274b = i;
        this.f6275c = j11;
        this.f6277f = arrayList;
        this.e = str2;
    }
}
