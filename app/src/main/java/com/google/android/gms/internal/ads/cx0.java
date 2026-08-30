package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class cx0 extends ve.c {

    /* renamed from: u, reason: collision with root package name */
    public Object f5212u;

    /* renamed from: v, reason: collision with root package name */
    public long f5213v;

    /* renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f5214w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ gx0 f5215x;

    /* renamed from: y, reason: collision with root package name */
    public int f5216y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cx0(gx0 gx0Var, ve.c cVar) {
        super(cVar);
        this.f5215x = gx0Var;
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        this.f5214w = obj;
        this.f5216y |= Integer.MIN_VALUE;
        return gx0.h(this.f5215x, this);
    }
}
