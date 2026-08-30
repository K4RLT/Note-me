package com.google.android.gms.internal.mlkit_vision_digital_ink;

/* loaded from: classes.dex */
public final /* synthetic */ class z9 implements Runnable {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f15331u = 1;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f15332v;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f15331u) {
            case 0:
                ((ha) this.f15332v).t();
                return;
            default:
                ((Runnable) this.f15332v).run();
                return;
        }
    }

    public String toString() {
        switch (this.f15331u) {
            case 1:
                return ((Runnable) this.f15332v).toString();
            default:
                return super.toString();
        }
    }

    public z9(eb ebVar, Runnable runnable) {
        this.f15332v = runnable;
    }
}
