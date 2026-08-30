package xd;

/* loaded from: classes.dex */
public final class a extends ve.c {

    /* renamed from: u, reason: collision with root package name */
    public Object f30732u;

    /* renamed from: v, reason: collision with root package name */
    public yf.a f30733v;

    /* renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f30734w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ b f30735x;

    /* renamed from: y, reason: collision with root package name */
    public int f30736y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, ve.c cVar) {
        super(cVar);
        this.f30735x = bVar;
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        this.f30734w = obj;
        this.f30736y |= Integer.MIN_VALUE;
        return this.f30735x.d(this);
    }
}
