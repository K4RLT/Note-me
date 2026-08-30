package com.google.android.gms.internal.ads;
import ve.a;
import ve.c;
import yf.c;

/* loaded from: classes.dex */
public final class tw0 extends c {

    /* renamed from: u, reason: collision with root package name */
    public Object f11474u;

    /* renamed from: v, reason: collision with root package name */
    public c f11475v;

    /* renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f11476w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ gx0 f11477x;

    /* renamed from: y, reason: collision with root package name */
    public int f11478y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tw0(gx0 gx0Var, c cVar) {
        super(cVar);
        this.f11477x = gx0Var;
    }

    @Override // a
    public final Object invokeSuspend(Object obj) {
        this.f11476w = obj;
        this.f11478y |= Integer.MIN_VALUE;
        return this.f11477x.k(null, this);
    }
}
