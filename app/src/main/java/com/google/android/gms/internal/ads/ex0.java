package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class ex0 extends ve.c {

    /* renamed from: u, reason: collision with root package name */
    public Object f5849u;

    /* renamed from: v, reason: collision with root package name */
    public long f5850v;

    /* renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f5851w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ gx0 f5852x;

    /* renamed from: y, reason: collision with root package name */
    public int f5853y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ex0(gx0 gx0Var, ve.c cVar) {
        super(cVar);
        this.f5852x = gx0Var;
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        this.f5851w = obj;
        this.f5853y |= Integer.MIN_VALUE;
        return gx0.i(this.f5852x, this);
    }
}
