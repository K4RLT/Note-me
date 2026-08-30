package r;

/* loaded from: classes.dex */
public final class h0 extends ve.c {

    /* renamed from: u, reason: collision with root package name */
    public j0 f24086u;

    /* renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f24087v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ j0 f24088w;

    /* renamed from: x, reason: collision with root package name */
    public int f24089x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(j0 j0Var, ve.c cVar) {
        super(cVar);
        this.f24088w = j0Var;
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        this.f24087v = obj;
        this.f24089x |= Integer.MIN_VALUE;
        return j0.Z0(this.f24088w, this);
    }
}
