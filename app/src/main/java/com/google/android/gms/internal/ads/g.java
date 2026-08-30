package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class g extends m implements Comparable {

    /* renamed from: y, reason: collision with root package name */
    public final int f6230y;

    /* renamed from: z, reason: collision with root package name */
    public final int f6231z;

    public g(int i, hi hiVar, int i10, j jVar, int i11) {
        super(i, hiVar, i10);
        int i12;
        this.f6230y = zw1.K(i11, jVar.B) ? 1 : 0;
        mw1 mw1Var = this.f8196x;
        int i13 = mw1Var.f8466v;
        int i14 = -1;
        if (i13 != -1 && (i12 = mw1Var.f8467w) != -1) {
            i14 = i13 * i12;
        }
        this.f6231z = i14;
    }

    @Override // com.google.android.gms.internal.ads.m
    public final int a() {
        return this.f6230y;
    }

    @Override // com.google.android.gms.internal.ads.m
    public final /* bridge */ /* synthetic */ boolean b(m mVar) {
        return false;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Integer.compare(this.f6231z, ((g) obj).f6231z);
    }
}
