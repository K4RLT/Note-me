package i5;

import g5.e0;

/* loaded from: classes.dex */
public final class y extends ve.c {

    /* renamed from: u, reason: collision with root package name */
    public e0 f18308u;

    /* renamed from: v, reason: collision with root package name */
    public h f18309v;

    /* renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f18310w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ c0 f18311x;

    /* renamed from: y, reason: collision with root package name */
    public int f18312y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(c0 c0Var, ve.c cVar) {
        super(cVar);
        this.f18311x = c0Var;
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        this.f18310w = obj;
        this.f18312y |= Integer.MIN_VALUE;
        return this.f18311x.e(null, this);
    }
}
