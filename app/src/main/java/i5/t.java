package i5;

/* loaded from: classes.dex */
public final class t extends ve.c {

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f18288u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ v f18289v;

    /* renamed from: w, reason: collision with root package name */
    public int f18290w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(v vVar, ve.c cVar) {
        super(cVar);
        this.f18289v = vVar;
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        this.f18288u = obj;
        this.f18290w |= Integer.MIN_VALUE;
        return this.f18289v.a(this);
    }
}
