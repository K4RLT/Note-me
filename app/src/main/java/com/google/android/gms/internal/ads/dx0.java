package com.google.android.gms.internal.ads;
import ve.a;
import ve.c;
import yf.a;

/* loaded from: classes.dex */
public final class dx0 extends c {

    /* renamed from: u, reason: collision with root package name */
    public a f5544u;

    /* renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f5545v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ gx0 f5546w;

    /* renamed from: x, reason: collision with root package name */
    public int f5547x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dx0(gx0 gx0Var, c cVar) {
        super(cVar);
        this.f5546w = gx0Var;
    }

    @Override // a
    public final Object invokeSuspend(Object obj) {
        this.f5545v = obj;
        this.f5547x |= Integer.MIN_VALUE;
        return gx0.d(this.f5546w, this);
    }
}
