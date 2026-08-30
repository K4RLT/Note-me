package i5;

/* loaded from: classes.dex */
public final class o extends ve.i implements df.l {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ q f18271u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ String f18272v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ df.l f18273w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(q qVar, String str, df.l lVar, te.c cVar) {
        super(1, cVar);
        this.f18271u = qVar;
        this.f18272v = str;
        this.f18273w = lVar;
    }

    @Override // ve.a
    public final te.c create(te.c cVar) {
        return new o(this.f18271u, this.f18272v, this.f18273w, cVar);
    }

    @Override // df.l
    public final Object invoke(Object obj) {
        return ((o) create((te.c) obj)).invokeSuspend(pe.z.f22715a);
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        pe.a.e(obj);
        p5.c T = this.f18271u.f18279b.T(this.f18272v);
        try {
            Object invoke = this.f18273w.invoke(T);
            ug.a.b(T, null);
            return invoke;
        } finally {
        }
    }
}
