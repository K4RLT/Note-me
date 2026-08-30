package v1;

import pf.r1;

/* loaded from: classes.dex */
public final class e0 extends ve.c {

    /* renamed from: u, reason: collision with root package name */
    public r1 f27301u;

    /* renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f27302v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ g0 f27303w;

    /* renamed from: x, reason: collision with root package name */
    public int f27304x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(g0 g0Var, ve.c cVar) {
        super(cVar);
        this.f27303w = g0Var;
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        this.f27302v = obj;
        this.f27304x |= Integer.MIN_VALUE;
        return this.f27303w.f(0L, null, this);
    }
}
