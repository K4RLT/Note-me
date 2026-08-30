package i5;

/* loaded from: classes.dex */
public final class i extends ve.c {

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f18249u;

    /* renamed from: v, reason: collision with root package name */
    public int f18250v;

    /* renamed from: w, reason: collision with root package name */
    public sf.h f18251w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ j f18252x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar, te.c cVar) {
        super(cVar);
        this.f18252x = jVar;
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        this.f18249u = obj;
        this.f18250v |= Integer.MIN_VALUE;
        return this.f18252x.e(null, this);
    }
}
