package com.google.android.gms.internal.ads;
import yf.c;
import ve.a;
import ve.c;

/* loaded from: classes.dex */
public final class zw0 extends ve.c {

    /* renamed from: u, reason: collision with root package name */
    public yf.c f13288u;

    /* renamed from: v, reason: collision with root package name */
    public long f13289v;

    /* renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f13290w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ gx0 f13291x;

    /* renamed from: y, reason: collision with root package name */
    public int f13292y;

    /* renamed from: z, reason: collision with root package name */
    public String f13293z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zw0(gx0 gx0Var, ve.c cVar) {
        super(cVar);
        this.f13291x = gx0Var;
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        this.f13290w = obj;
        this.f13292y |= Integer.MIN_VALUE;
        return gx0.e(this.f13291x, null, this);
    }
}
