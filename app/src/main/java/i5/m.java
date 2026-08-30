package i5;

/* loaded from: classes.dex */
public final class m extends ve.c {

    /* renamed from: u, reason: collision with root package name */
    public int f18262u;

    /* renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f18263v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ q f18264w;

    /* renamed from: x, reason: collision with root package name */
    public int f18265x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(q qVar, ve.c cVar) {
        super(cVar);
        this.f18264w = qVar;
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        this.f18263v = obj;
        this.f18265x |= Integer.MIN_VALUE;
        return this.f18264w.e(null, null, this);
    }
}
