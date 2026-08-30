package com.google.android.gms.internal.ads;
import ve.a;
import ve.c;
import yf.c;

/* loaded from: classes.dex */
public final class fx0 extends ve.c {

    /* renamed from: u, reason: collision with root package name */
    public yf.c f6201u;

    /* renamed from: v, reason: collision with root package name */
    public long f6202v;

    /* renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f6203w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ gx0 f6204x;

    /* renamed from: y, reason: collision with root package name */
    public int f6205y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fx0(gx0 gx0Var, ve.c cVar) {
        super(cVar);
        this.f6204x = gx0Var;
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        this.f6203w = obj;
        this.f6205y |= Integer.MIN_VALUE;
        return gx0.g(this.f6204x, this);
    }
}
