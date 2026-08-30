package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class gy0 implements Comparable {

    /* renamed from: u, reason: collision with root package name */
    public final Runnable f6504u;

    /* renamed from: v, reason: collision with root package name */
    public final long f6505v;

    public gy0(Runnable runnable, long j10) {
        this.f6504u = runnable;
        this.f6505v = j10;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return Long.compare(this.f6505v, ((gy0) obj).f6505v);
    }
}
