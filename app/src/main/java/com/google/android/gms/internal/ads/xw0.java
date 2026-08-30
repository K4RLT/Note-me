package com.google.android.gms.internal.ads;
import yf.c;
import ve.a;
import ve.c;

/* loaded from: classes.dex */
public final class xw0 extends ve.c {

    /* renamed from: u, reason: collision with root package name */
    public yf.c f12643u;

    /* renamed from: v, reason: collision with root package name */
    public long f12644v;

    /* renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f12645w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ gx0 f12646x;

    /* renamed from: y, reason: collision with root package name */
    public int f12647y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xw0(gx0 gx0Var, ve.c cVar) {
        super(cVar);
        this.f12646x = gx0Var;
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        this.f12645w = obj;
        this.f12647y |= Integer.MIN_VALUE;
        return gx0.f(this.f12646x, this);
    }
}
