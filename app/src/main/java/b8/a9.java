package b8;

/* loaded from: classes.dex */
public final class a9 extends ve.i implements df.p {
    public final /* synthetic */ df.l A;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ boolean f1848u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ o5 f1849v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ boolean f1850w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ boolean f1851x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ boolean f1852y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ boolean f1853z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a9(boolean z3, o5 o5Var, boolean z9, boolean z10, boolean z11, boolean z12, df.l lVar, te.c cVar) {
        super(2, cVar);
        this.f1848u = z3;
        this.f1849v = o5Var;
        this.f1850w = z9;
        this.f1851x = z10;
        this.f1852y = z11;
        this.f1853z = z12;
        this.A = lVar;
    }

    @Override // ve.a
    public final te.c create(Object obj, te.c cVar) {
        return new a9(this.f1848u, this.f1849v, this.f1850w, this.f1851x, this.f1852y, this.f1853z, this.A, cVar);
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        return ((a9) create((pf.z) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        pe.a.e(obj);
        boolean z3 = this.f1848u;
        pe.z zVar = pe.z.f22715a;
        if (z3) {
            return zVar;
        }
        o5 o5Var = o5.TAPES;
        o5 o5Var2 = this.f1849v;
        if ((o5Var2 == o5Var && !this.f1850w) || ((o5Var2 == o5.STICKERS && !this.f1851x) || ((o5Var2 == o5.FRAMES && !this.f1852y) || (o5Var2 == o5.ACCESSORIES && !this.f1853z)))) {
            this.A.invoke(o5.NOTEBOOKS);
        }
        return zVar;
    }
}
