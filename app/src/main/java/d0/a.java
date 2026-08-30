package d0;

/* loaded from: classes.dex */
public final class a extends ve.c {
    public int A;

    /* renamed from: u, reason: collision with root package name */
    public j1.c f15649u;

    /* renamed from: v, reason: collision with root package name */
    public Object[] f15650v;

    /* renamed from: w, reason: collision with root package name */
    public int f15651w;

    /* renamed from: x, reason: collision with root package name */
    public int f15652x;

    /* renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f15653y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ b f15654z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, ve.c cVar) {
        super(cVar);
        this.f15654z = bVar;
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        this.f15653y = obj;
        this.A |= Integer.MIN_VALUE;
        return this.f15654z.a(null, this);
    }
}
