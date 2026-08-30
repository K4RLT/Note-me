package n;
import x.o;
import q.x;

/* loaded from: classes.dex */
public final class g0 extends ve.h implements df.p {
    public final /* synthetic */ h0 A;
    public final /* synthetic */ lf.c B;

    /* renamed from: u, reason: collision with root package name */
    public lf.c f20881u;

    /* renamed from: v, reason: collision with root package name */
    public h0 f20882v;

    /* renamed from: w, reason: collision with root package name */
    public long[] f20883w;

    /* renamed from: x, reason: collision with root package name */
    public int f20884x;

    /* renamed from: y, reason: collision with root package name */
    public int f20885y;

    /* renamed from: z, reason: collision with root package name */
    public /* synthetic */ Object f20886z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(h0 h0Var, lf.c cVar, te.c cVar2) {
        super(2, cVar2);
        this.A = h0Var;
        this.B = cVar;
    }

    @Override // ve.a
    public final te.c create(Object obj, te.c cVar) {
        g0 g0Var = new g0(this.A, this.B, cVar);
        g0Var.f20886z = obj;
        return g0Var;
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        return ((g0) create((lf.e) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        lf.e eVar;
        h0 h0Var;
        long[] jArr;
        int i;
        lf.c cVar;
        int i10 = this.f20885y;
        if (i10 != 0) {
            if (i10 == 1) {
                i = this.f20884x;
                jArr = this.f20883w;
                h0Var = this.f20882v;
                cVar = this.f20881u;
                eVar = (lf.e) this.f20886z;
                pe.a.e(obj);
            } else {
                x.o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            pe.a.e(obj);
            eVar = (lf.e) this.f20886z;
            h0Var = this.A;
            f0 f0Var = h0Var.f20890v;
            jArr = f0Var.f20870c;
            i = f0Var.e;
            cVar = this.B;
        }
        if (i != Integer.MAX_VALUE) {
            int i11 = (int) ((jArr[i] >> 31) & 2147483647L);
            cVar.f20357v = i;
            Object obj2 = h0Var.f20890v.f20869b[i];
            this.f20886z = eVar;
            this.f20881u = cVar;
            this.f20882v = h0Var;
            this.f20883w = jArr;
            this.f20884x = i11;
            this.f20885y = 1;
            eVar.b(obj2, this);
            return ue.a.f27192u;
        }
        return pe.z.f22715a;
    }
}
