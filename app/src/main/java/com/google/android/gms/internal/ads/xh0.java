package com.google.android.gms.internal.ads;
import g9.r;
import r.e;

/* loaded from: classes.dex */
public final /* synthetic */ class xh0 implements Runnable {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f12569u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ tt0 f12570v;

    public /* synthetic */ xh0(tt0 tt0Var, int i) {
        this.f12569u = i;
        this.f12570v = tt0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f12569u) {
            case 0:
                this.f12570v.a();
                return;
            default:
                if (((Boolean) g9.r.e.f17698c.a(sl.f10760h6)).booleanValue() && ct.D.f8992v) {
                    this.f12570v.c();
                    return;
                }
                return;
        }
    }
}
