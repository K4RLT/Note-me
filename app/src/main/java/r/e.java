package r;

/* loaded from: classes.dex */
public final class e extends ve.c {

    /* renamed from: u, reason: collision with root package name */
    public f f24056u;

    /* renamed from: v, reason: collision with root package name */
    public long f24057v;

    /* renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f24058w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ f f24059x;

    /* renamed from: y, reason: collision with root package name */
    public int f24060y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, ve.c cVar) {
        super(cVar);
        this.f24059x = fVar;
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        this.f24058w = obj;
        this.f24060y |= Integer.MIN_VALUE;
        return this.f24059x.b(0L, null, this);
    }
}
