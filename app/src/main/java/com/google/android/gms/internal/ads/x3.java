package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class x3 implements n2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12455a;

    /* renamed from: b, reason: collision with root package name */
    public final c3 f12456b;

    public x3(int i) {
        this.f12455a = i;
        switch (i) {
            case 1:
                this.f12456b = new c3("image/png", 35152, 2);
                return;
            default:
                this.f12456b = new c3("image/bmp", 16973, 2);
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.n2
    public final void b() {
        int i = this.f12455a;
    }

    @Override // com.google.android.gms.internal.ads.n2
    public final boolean e(o2 o2Var) {
        switch (this.f12455a) {
            case 0:
                return this.f12456b.e(o2Var);
            default:
                return this.f12456b.e(o2Var);
        }
    }

    @Override // com.google.android.gms.internal.ads.n2
    public final void f(p2 p2Var) {
        switch (this.f12455a) {
            case 0:
                this.f12456b.f(p2Var);
                return;
            default:
                this.f12456b.f(p2Var);
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.n2
    public final void g(long j10, long j11) {
        switch (this.f12455a) {
            case 0:
                this.f12456b.g(j10, j11);
                return;
            default:
                this.f12456b.g(j10, j11);
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.n2
    public final int h(o2 o2Var, b0.a aVar) {
        switch (this.f12455a) {
            case 0:
                return this.f12456b.h(o2Var, aVar);
            default:
                return this.f12456b.h(o2Var, aVar);
        }
    }

    private final void a() {
    }

    private final void c() {
    }
}
