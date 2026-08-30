package sf;

/* loaded from: classes.dex */
public final class a extends ve.c {

    /* renamed from: u, reason: collision with root package name */
    public tf.s f25136u;

    /* renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f25137v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ f6.h f25138w;

    /* renamed from: x, reason: collision with root package name */
    public int f25139x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(f6.h hVar, te.c cVar) {
        super(cVar);
        this.f25138w = hVar;
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        this.f25137v = obj;
        this.f25139x |= Integer.MIN_VALUE;
        return this.f25138w.b(null, this);
    }
}
