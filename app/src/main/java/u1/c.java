package u1;

/* loaded from: classes.dex */
public final class c extends ve.c {

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f25806u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ d f25807v;

    /* renamed from: w, reason: collision with root package name */
    public int f25808w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, ve.c cVar) {
        super(cVar);
        this.f25807v = dVar;
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        this.f25806u = obj;
        this.f25808w |= Integer.MIN_VALUE;
        return this.f25807v.b(0L, this);
    }
}
