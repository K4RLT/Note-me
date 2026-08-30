package a0;

import r.u0;

/* loaded from: classes.dex */
public final class i0 extends ve.c {

    /* renamed from: u, reason: collision with root package name */
    public l0 f66u;

    /* renamed from: v, reason: collision with root package name */
    public u0 f67v;

    /* renamed from: w, reason: collision with root package name */
    public ve.i f68w;

    /* renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f69x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ l0 f70y;

    /* renamed from: z, reason: collision with root package name */
    public int f71z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(l0 l0Var, te.c cVar) {
        super(cVar);
        this.f70y = l0Var;
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        this.f69x = obj;
        this.f71z |= Integer.MIN_VALUE;
        return this.f70y.e(null, null, this);
    }
}
