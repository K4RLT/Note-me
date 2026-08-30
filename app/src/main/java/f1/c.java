package f1;

/* loaded from: classes.dex */
public final class c extends ve.c {

    /* renamed from: u, reason: collision with root package name */
    public rf.c f16633u;

    /* renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f16634v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ d f16635w;

    /* renamed from: x, reason: collision with root package name */
    public int f16636x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, ve.c cVar) {
        super(cVar);
        this.f16635w = dVar;
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        this.f16634v = obj;
        this.f16636x |= Integer.MIN_VALUE;
        return this.f16635w.a(this);
    }
}
