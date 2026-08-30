package w7;
import k1.r;
import r0.a1;
import x.o;

/* loaded from: classes.dex */
public final class w extends ve.i implements df.p {
    public final /* synthetic */ a1 A;
    public final /* synthetic */ a1 B;

    /* renamed from: u, reason: collision with root package name */
    public int f29319u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f29320v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Integer f29321w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ b1.v f29322x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ long f29323y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ long f29324z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(int i, Integer num, b1.v vVar, long j10, long j11, a1 a1Var, a1 a1Var2, te.c cVar) {
        super(2, cVar);
        this.f29320v = i;
        this.f29321w = num;
        this.f29322x = vVar;
        this.f29323y = j10;
        this.f29324z = j11;
        this.A = a1Var;
        this.B = a1Var2;
    }

    @Override // ve.a
    public final te.c create(Object obj, te.c cVar) {
        return new w(this.f29320v, this.f29321w, this.f29322x, this.f29323y, this.f29324z, this.A, this.B, cVar);
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        return ((w) create((pf.z) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        w wVar;
        int i = this.f29319u;
        if (i != 0) {
            if (i == 1) {
                pe.a.e(obj);
                wVar = this;
            } else {
                q.o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            pe.a.e(obj);
            q.r0 r8 = q.e.r(0.8f, 1500.0f, null, 4);
            final long j10 = this.f29323y;
            final long j11 = this.f29324z;
            final a1 a1Var = this.A;
            df.p pVar = new df.p() { // from class: w7.v
                @Override // df.p
                public final Object invoke(Object obj2, Object obj3) {
                    float floatValue = ((Float) obj2).floatValue();
                    ((Float) obj3).floatValue();
                    long j12 = j10;
                    int i10 = (int) (j12 >> 32);
                    float intBitsToFloat = Float.intBitsToFloat(i10);
                    long j13 = j11;
                    float intBitsToFloat2 = ((Float.intBitsToFloat((int) (j13 >> 32)) - Float.intBitsToFloat(i10)) * floatValue) + intBitsToFloat;
                    int i11 = (int) (j12 & 4294967295L);
                    float intBitsToFloat3 = ((Float.intBitsToFloat((int) (j13 & 4294967295L)) - Float.intBitsToFloat(i11)) * floatValue) + Float.intBitsToFloat(i11);
                    n4.S0(a1Var, (Float.floatToRawIntBits(intBitsToFloat2) << 32) | (Float.floatToRawIntBits(intBitsToFloat3) & 4294967295L));
                    return pe.z.f22715a;
                }
            };
            this.f29319u = 1;
            wVar = this;
            Object d2 = q.e.d(0.0f, 1.0f, r8, pVar, wVar, 4);
            ue.a aVar = ue.a.f27192u;
            if (d2 == aVar) {
                return aVar;
            }
        }
        Integer num = wVar.f29321w;
        int intValue = num.intValue();
        int i10 = wVar.f29320v;
        if (i10 != intValue) {
            int intValue2 = num.intValue();
            b1.v vVar = wVar.f29322x;
            vVar.add(i10, new r(((r) vVar.remove(intValue2)).f19523a));
        }
        wVar.B.setValue(null);
        n4.S0(wVar.A, 0L);
        return pe.z.f22715a;
    }
}
