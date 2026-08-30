package u1;

/* loaded from: classes.dex */
public final class b extends ve.c {

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f25803u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ d f25804v;

    /* renamed from: w, reason: collision with root package name */
    public int f25805w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, ve.c cVar) {
        super(cVar);
        this.f25804v = dVar;
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        this.f25803u = obj;
        this.f25805w |= Integer.MIN_VALUE;
        return this.f25804v.a(0L, 0L, this);
    }
}
