package c0;

import q.r0;

/* loaded from: classes.dex */
public final class c0 extends ve.c {

    /* renamed from: u, reason: collision with root package name */
    public i0 f3287u;

    /* renamed from: v, reason: collision with root package name */
    public r0 f3288v;

    /* renamed from: w, reason: collision with root package name */
    public int f3289w;

    /* renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f3290x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ i0 f3291y;

    /* renamed from: z, reason: collision with root package name */
    public int f3292z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(i0 i0Var, ve.c cVar) {
        super(cVar);
        this.f3291y = i0Var;
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        this.f3290x = obj;
        this.f3292z |= Integer.MIN_VALUE;
        return this.f3291y.f(0, null, this);
    }
}
