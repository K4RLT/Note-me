package y3;

/* loaded from: classes.dex */
public final class w extends ve.c {

    /* renamed from: u, reason: collision with root package name */
    public Object f30881u;

    /* renamed from: v, reason: collision with root package name */
    public Object f30882v;

    /* renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f30883w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ z f30884x;

    /* renamed from: y, reason: collision with root package name */
    public int f30885y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(z zVar, ve.c cVar) {
        super(cVar);
        this.f30884x = zVar;
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        this.f30883w = obj;
        this.f30885y |= Integer.MIN_VALUE;
        return this.f30884x.h(this);
    }
}
