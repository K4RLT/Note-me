package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final /* synthetic */ class uy implements Runnable {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f11751u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ boolean f11752v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ long f11753w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f11754x;

    public /* synthetic */ uy(Object obj, boolean z3, long j10, int i) {
        this.f11751u = i;
        this.f11754x = obj;
        this.f11752v = z3;
        this.f11753w = j10;
    }

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        switch (this.f11751u) {
            case 0:
                vy vyVar = (vy) this.f11754x;
                vyVar.f12067w.N0(this.f11753w, this.f11752v);
                return;
            default:
                ((h00) this.f11754x).N0(this.f11753w, this.f11752v);
                return;
        }
    }
}
