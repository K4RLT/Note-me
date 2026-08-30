package com.google.android.gms.internal.ads;
import l4.a;

/* loaded from: classes.dex */
public final class jm1 extends m61 {

    /* renamed from: v, reason: collision with root package name */
    public int f7482v;

    /* renamed from: w, reason: collision with root package name */
    public final int f7483w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ om1 f7484x;

    public jm1(om1 om1Var) {
        super(1);
        this.f7484x = om1Var;
        this.f7482v = 0;
        this.f7483w = om1Var.k();
    }

    @Override // com.google.android.gms.internal.ads.m61
    public final byte a() {
        int i = this.f7482v;
        if (i < this.f7483w) {
            this.f7482v = i + 1;
            return this.f7484x.g(i);
        }
        a.c();
        return (byte) 0;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f7482v < this.f7483w;
    }
}
