package y3;

/* loaded from: classes.dex */
public final class t extends ve.c {

    /* renamed from: u, reason: collision with root package name */
    public z f30868u;

    /* renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f30869v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ z f30870w;

    /* renamed from: x, reason: collision with root package name */
    public int f30871x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(z zVar, ve.c cVar) {
        super(cVar);
        this.f30870w = zVar;
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        this.f30869v = obj;
        this.f30871x |= Integer.MIN_VALUE;
        return this.f30870w.e(this);
    }
}
