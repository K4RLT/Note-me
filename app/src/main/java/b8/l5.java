package b8;
import m5.e;
import r0.a1;
import r0.e1;

/* loaded from: classes.dex */
public final class l5 extends ve.i implements df.p {
    public final /* synthetic */ df.l A;
    public final /* synthetic */ e1 B;
    public final /* synthetic */ a1 C;
    public final /* synthetic */ a1 D;

    /* renamed from: u, reason: collision with root package name */
    public int f2362u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ float f2363v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ float f2364w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ long f2365x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ long f2366y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ boolean f2367z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l5(float f10, float f11, long j10, long j11, boolean z3, df.l lVar, e1 e1Var, a1 a1Var, a1 a1Var2, te.c cVar) {
        super(2, cVar);
        this.f2363v = f10;
        this.f2364w = f11;
        this.f2365x = j10;
        this.f2366y = j11;
        this.f2367z = z3;
        this.A = lVar;
        this.B = e1Var;
        this.C = a1Var;
        this.D = a1Var2;
    }

    @Override // ve.a
    public final te.c create(Object obj, te.c cVar) {
        return new l5(this.f2363v, this.f2364w, this.f2365x, this.f2366y, this.f2367z, this.A, this.B, this.C, this.D, cVar);
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        return ((l5) create((pf.z) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        int i = this.f2362u;
        if (i != 0) {
            if (i == 1) {
                pe.a.e(obj);
            } else {
                q.x.o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            pe.a.e(obj);
            q.k1 s10 = q.e.s(240, 0, q.y.f23031a, 2);
            final float f10 = this.f2363v;
            final float f11 = this.f2364w;
            final long j10 = this.f2365x;
            final long j11 = this.f2366y;
            final boolean z3 = this.f2367z;
            final df.l lVar = this.A;
            final e1 e1Var = this.B;
            final a1 a1Var = this.C;
            final a1 a1Var2 = this.D;
            df.p pVar = new df.p() { // from class: b8.k5
                @Override // df.p
                public final Object invoke(Object obj2, Object obj3) {
                    float floatValue = ((Float) obj2).floatValue();
                    ((Float) obj3).floatValue();
                    float f12 = f11;
                    float f13 = f10;
                    float f14 = ((f12 - f13) * floatValue) + f13;
                    long j12 = j10;
                    int i10 = (int) (j12 >> 32);
                    float intBitsToFloat = Float.intBitsToFloat(i10);
                    long j13 = j11;
                    float intBitsToFloat2 = ((Float.intBitsToFloat((int) (j13 >> 32)) - Float.intBitsToFloat(i10)) * floatValue) + intBitsToFloat;
                    int i11 = (int) (j12 & 4294967295L);
                    float intBitsToFloat3 = ((Float.intBitsToFloat((int) (j13 & 4294967295L)) - Float.intBitsToFloat(i11)) * floatValue) + Float.intBitsToFloat(i11);
                    e(z3, lVar, e1Var, a1Var, a1Var2, f14, (Float.floatToRawIntBits(intBitsToFloat2) << 32) | (Float.floatToRawIntBits(intBitsToFloat3) & 4294967295L));
                    return pe.z.f22715a;
                }
            };
            this.f2362u = 1;
            Object d2 = q.e.d(0.0f, 1.0f, s10, pVar, this, 4);
            ue.a aVar = ue.a.f27192u;
            if (d2 == aVar) {
                return aVar;
            }
        }
        return pe.z.f22715a;
    }
}
