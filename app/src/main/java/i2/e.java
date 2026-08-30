package i2;

/* loaded from: classes.dex */
public final class e extends ve.c {

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f18158u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ f f18159v;

    /* renamed from: w, reason: collision with root package name */
    public int f18160w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, ve.c cVar) {
        super(cVar);
        this.f18159v = fVar;
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        this.f18158u = obj;
        this.f18160w |= Integer.MIN_VALUE;
        return this.f18159v.b(0.0f, this);
    }
}
