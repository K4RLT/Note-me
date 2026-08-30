package com.google.android.gms.internal.ads;
import j6.l;

/* loaded from: classes.dex */
public final /* synthetic */ class p0 implements Runnable {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f9300u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ j6.l f9301v;

    public /* synthetic */ p0(j6.l lVar, ir irVar) {
        this.f9300u = 2;
        this.f9301v = lVar;
    }

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        switch (this.f9300u) {
            case 0:
                ((q0) this.f9301v.f18934w).i.zzb();
                return;
            case 1:
                ((q0) this.f9301v.f18934w).i.c();
                return;
            default:
                ((q0) this.f9301v.f18934w).i.getClass();
                return;
        }
    }

    public /* synthetic */ p0(j6.l lVar, int i) {
        this.f9300u = i;
        this.f9301v = lVar;
    }
}
