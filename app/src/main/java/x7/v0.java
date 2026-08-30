package x7;
import q.x;

import r0.a1;
import t.c1;
import wa.b9;

/* loaded from: classes.dex */
public final class v0 extends ve.i implements df.q {
    public final /* synthetic */ float A;
    public final /* synthetic */ a1 B;

    /* renamed from: u, reason: collision with root package name */
    public int f30313u;

    /* renamed from: v, reason: collision with root package name */
    public /* synthetic */ c1 f30314v;

    /* renamed from: w, reason: collision with root package name */
    public /* synthetic */ long f30315w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ v1.w f30316x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ df.l f30317y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ float f30318z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(v1.w wVar, df.l lVar, float f10, float f11, a1 a1Var, te.c cVar) {
        super(3, cVar);
        this.f30316x = wVar;
        this.f30317y = lVar;
        this.f30318z = f10;
        this.A = f11;
        this.B = a1Var;
    }

    @Override // df.q
    public final Object b(Object obj, Object obj2, Object obj3) {
        long j10 = ((j1.b) obj2).f18762a;
        float f10 = this.A;
        a1 a1Var = this.B;
        v0 v0Var = new v0(this.f30316x, this.f30317y, this.f30318z, f10, a1Var, (te.c) obj3);
        v0Var.f30314v = (c1) obj;
        v0Var.f30315w = j10;
        return v0Var.invokeSuspend(pe.z.f22715a);
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        c1 c1Var = this.f30314v;
        long j10 = this.f30315w;
        int i = this.f30313u;
        a1 a1Var = this.B;
        if (i != 0) {
            if (i == 1) {
                pe.a.e(obj);
            } else {
                x.o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            pe.a.e(obj);
            a1Var.setValue(Boolean.TRUE);
            float d2 = b9.d(Float.intBitsToFloat((int) (j10 >> 32)) / ((int) (((v1.h0) this.f30316x).S >> 32)), 0.0f, 1.0f);
            float f10 = this.f30318z;
            this.f30317y.invoke(new Float(g3.a.x(this.A, f10, d2, f10)));
            this.f30314v = null;
            this.f30315w = j10;
            this.f30313u = 1;
            Object f11 = c1Var.f(this);
            ue.a aVar = ue.a.f27192u;
            if (f11 == aVar) {
                return aVar;
            }
        }
        a1Var.setValue(Boolean.FALSE);
        return pe.z.f22715a;
    }
}
