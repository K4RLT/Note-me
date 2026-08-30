package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final /* synthetic */ class mm0 implements Runnable {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f8378u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ nm0 f8379v;

    public /* synthetic */ mm0(nm0 nm0Var, int i) {
        this.f8378u = i;
        this.f8379v = nm0Var;
    }

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        switch (this.f8378u) {
            case 0:
                nm0 nm0Var = this.f8379v;
                nm0Var.f8764a.set(new lm0(nm0Var.e.zza(), nm0Var.f8768f, nm0Var.f8766c));
                return;
            default:
                nm0 nm0Var2 = this.f8379v;
                nm0Var2.f8767d.execute(new mm0(nm0Var2, 0));
                return;
        }
    }
}
