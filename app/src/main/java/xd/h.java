package xd;

/* loaded from: classes.dex */
public final class h extends ve.c {

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f30755u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ i f30756v;

    /* renamed from: w, reason: collision with root package name */
    public int f30757w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, ve.c cVar) {
        super(cVar);
        this.f30756v = iVar;
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        this.f30755u = obj;
        this.f30757w |= Integer.MIN_VALUE;
        return this.f30756v.c(null, null, this);
    }
}
