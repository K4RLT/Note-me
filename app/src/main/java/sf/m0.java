package sf;

import pf.d1;

/* loaded from: classes.dex */
public final class m0 extends ve.c {
    public final /* synthetic */ n0 A;
    public int B;

    /* renamed from: u, reason: collision with root package name */
    public n0 f25205u;

    /* renamed from: v, reason: collision with root package name */
    public h f25206v;

    /* renamed from: w, reason: collision with root package name */
    public o0 f25207w;

    /* renamed from: x, reason: collision with root package name */
    public d1 f25208x;

    /* renamed from: y, reason: collision with root package name */
    public Object f25209y;

    /* renamed from: z, reason: collision with root package name */
    public /* synthetic */ Object f25210z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(n0 n0Var, te.c cVar) {
        super(cVar);
        this.A = n0Var;
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        this.f25210z = obj;
        this.B |= Integer.MIN_VALUE;
        this.A.b(null, this);
        return ue.a.f27192u;
    }
}
