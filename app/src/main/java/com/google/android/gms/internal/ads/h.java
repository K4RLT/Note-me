package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class h implements Comparable {

    /* renamed from: u, reason: collision with root package name */
    public final boolean f6516u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f6517v;

    public h(mw1 mw1Var, int i) {
        this.f6516u = 1 == (mw1Var.e & 1);
        this.f6517v = zw1.K(i, false);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        h hVar = (h) obj;
        return w41.f12133a.d(this.f6517v, hVar.f6517v).d(this.f6516u, hVar.f6516u).e();
    }
}
