package m7;

/* loaded from: classes.dex */
public final class k extends ve.c {

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f20657u;

    /* renamed from: v, reason: collision with root package name */
    public int f20658v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ j f20659w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(j jVar, te.c cVar) {
        super(cVar);
        this.f20659w = jVar;
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        this.f20657u = obj;
        this.f20658v |= Integer.MIN_VALUE;
        return this.f20659w.e(null, this);
    }
}
