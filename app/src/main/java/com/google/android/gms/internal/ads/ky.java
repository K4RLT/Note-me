package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class ky implements Runnable {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f7900u;

    /* renamed from: v, reason: collision with root package name */
    public final ly f7901v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f7902w;

    public ky(ly lyVar) {
        this.f7900u = 2;
        this.f7902w = false;
        this.f7901v = lyVar;
    }

    public void a() {
        this.f7902w = true;
        this.f7901v.b();
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7900u) {
            case 0:
                this.f7901v.c("windowVisibilityChanged", "isVisible", String.valueOf(this.f7902w));
                return;
            case 1:
                this.f7901v.c("windowFocusChanged", "hasWindowFocus", String.valueOf(this.f7902w));
                return;
            default:
                if (!this.f7902w) {
                    this.f7901v.b();
                    k9.b0 b0Var = k9.f0.f19676l;
                    b0Var.removeCallbacks(this);
                    b0Var.postDelayed(this, 250L);
                    return;
                }
                return;
        }
    }

    public /* synthetic */ ky(ly lyVar, boolean z3, int i) {
        this.f7900u = i;
        this.f7902w = z3;
        this.f7901v = lyVar;
    }
}
