package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class w70 implements Runnable {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f12165u;

    /* renamed from: v, reason: collision with root package name */
    public final WeakReference f12166v;

    public /* synthetic */ w70(x70 x70Var, int i) {
        this.f12165u = i;
        switch (i) {
            case 1:
                this.f12166v = new WeakReference(x70Var);
                return;
            default:
                this.f12166v = new WeakReference(x70Var);
                return;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f12165u) {
            case 0:
                x70 x70Var = (x70) this.f12166v.get();
                if (x70Var != null) {
                    x70Var.P1(f70.P);
                    return;
                }
                return;
            default:
                x70 x70Var2 = (x70) this.f12166v.get();
                if (x70Var2 != null) {
                    x70Var2.P1(f70.O);
                    return;
                }
                return;
        }
    }
}
