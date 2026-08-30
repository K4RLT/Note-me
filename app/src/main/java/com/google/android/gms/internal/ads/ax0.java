package com.google.android.gms.internal.ads;
import yf.c;
import ve.a;
import ve.c;

/* loaded from: classes.dex */
public final class ax0 extends ve.c {

    /* renamed from: u, reason: collision with root package name */
    public long f4624u;

    /* renamed from: v, reason: collision with root package name */
    public yf.c f4625v;

    /* renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f4626w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ gx0 f4627x;

    /* renamed from: y, reason: collision with root package name */
    public int f4628y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ax0(gx0 gx0Var, ve.c cVar) {
        super(cVar);
        this.f4627x = gx0Var;
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        this.f4626w = obj;
        this.f4628y |= Integer.MIN_VALUE;
        return gx0.j(this.f4627x, this);
    }
}
