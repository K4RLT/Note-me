package u7;
import r0.a1;
import u0.b;

/* loaded from: classes.dex */
public final class j0 extends ve.i implements df.p {
    public final /* synthetic */ a1 A;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ boolean f26349u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ a1 f26350v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ a1 f26351w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ a1 f26352x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ a1 f26353y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ a1 f26354z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(boolean z3, a1 a1Var, a1 a1Var2, a1 a1Var3, a1 a1Var4, a1 a1Var5, a1 a1Var6, te.c cVar) {
        super(2, cVar);
        this.f26349u = z3;
        this.f26350v = a1Var;
        this.f26351w = a1Var2;
        this.f26352x = a1Var3;
        this.f26353y = a1Var4;
        this.f26354z = a1Var5;
        this.A = a1Var6;
    }

    @Override // ve.a
    public final te.c create(Object obj, te.c cVar) {
        return new j0(this.f26349u, this.f26350v, this.f26351w, this.f26352x, this.f26353y, this.f26354z, this.A, cVar);
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        j0 j0Var = (j0) create((pf.z) obj, (te.c) obj2);
        pe.z zVar = pe.z.f22715a;
        j0Var.invokeSuspend(zVar);
        return zVar;
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        pe.a.e(obj);
        if (!this.f26349u) {
            u0.j(this.f26350v);
            b(this.f26351w);
            u0.f(this.f26352x, false);
            u0.h(this.f26353y);
            u0.i(this.f26354z);
            u0.d(this.A);
        }
        return pe.z.f22715a;
    }
}
