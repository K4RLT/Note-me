package com.google.android.gms.internal.ads;
import ve.a;
import ve.c;
import yf.c;

/* loaded from: classes.dex */
public final class yw0 extends c {

    /* renamed from: u, reason: collision with root package name */
    public Object f12987u;

    /* renamed from: v, reason: collision with root package name */
    public c f12988v;

    /* renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f12989w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ gx0 f12990x;

    /* renamed from: y, reason: collision with root package name */
    public int f12991y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yw0(gx0 gx0Var, c cVar) {
        super(cVar);
        this.f12990x = gx0Var;
    }

    @Override // a
    public final Object invokeSuspend(Object obj) {
        this.f12989w = obj;
        this.f12991y |= Integer.MIN_VALUE;
        return this.f12990x.c(this);
    }
}
