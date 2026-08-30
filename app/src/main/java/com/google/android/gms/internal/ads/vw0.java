package com.google.android.gms.internal.ads;
import ve.a;
import ve.c;
import yf.a;

/* loaded from: classes.dex */
public final class vw0 extends c {

    /* renamed from: u, reason: collision with root package name */
    public a f12055u;

    /* renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f12056v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ gx0 f12057w;

    /* renamed from: x, reason: collision with root package name */
    public int f12058x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vw0(gx0 gx0Var, c cVar) {
        super(cVar);
        this.f12057w = gx0Var;
    }

    @Override // a
    public final Object invokeSuspend(Object obj) {
        this.f12056v = obj;
        this.f12058x |= Integer.MIN_VALUE;
        return this.f12057w.a(this);
    }
}
