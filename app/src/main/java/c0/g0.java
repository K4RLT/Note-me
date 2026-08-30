package c0;
import i0.s;

import r.u0;

/* loaded from: classes.dex */
public final class g0 extends ve.c {

    /* renamed from: u, reason: collision with root package name */
    public i0 f3317u;

    /* renamed from: v, reason: collision with root package name */
    public u0 f3318v;

    /* renamed from: w, reason: collision with root package name */
    public ve.i f3319w;

    /* renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f3320x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ i0 f3321y;

    /* renamed from: z, reason: collision with root package name */
    public int f3322z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(i0 i0Var, te.c cVar) {
        super(cVar);
        this.f3321y = i0Var;
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        this.f3320x = obj;
        this.f3322z |= Integer.MIN_VALUE;
        return s(this.f3321y, null, null, this);
    }
}
