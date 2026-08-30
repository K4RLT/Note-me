package tf;

/* loaded from: classes.dex */
public final class l extends ve.c {

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f25734u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ m f25735v;

    /* renamed from: w, reason: collision with root package name */
    public int f25736w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(m mVar, te.c cVar) {
        super(cVar);
        this.f25735v = mVar;
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        this.f25734u = obj;
        this.f25736w |= Integer.MIN_VALUE;
        return this.f25735v.e(null, this);
    }
}
