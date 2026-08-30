package com.google.android.gms.internal.ads;
import ve.a;
import ve.c;
import yf.c;

/* loaded from: classes.dex */
public final class uw0 extends ve.c {

    /* renamed from: u, reason: collision with root package name */
    public long f11737u;

    /* renamed from: v, reason: collision with root package name */
    public yf.c f11738v;

    /* renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f11739w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ gx0 f11740x;

    /* renamed from: y, reason: collision with root package name */
    public int f11741y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uw0(gx0 gx0Var, ve.c cVar) {
        super(cVar);
        this.f11740x = gx0Var;
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        this.f11739w = obj;
        this.f11741y |= Integer.MIN_VALUE;
        return this.f11740x.b(0L, this);
    }
}
