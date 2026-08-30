package b8;
import b0.j;
import d.c;

/* loaded from: classes.dex */
public final class f9 extends ve.i implements df.p {
    public final /* synthetic */ int A;
    public final /* synthetic */ q.d B;

    /* renamed from: u, reason: collision with root package name */
    public int f2087u;

    /* renamed from: v, reason: collision with root package name */
    public int f2088v;

    /* renamed from: w, reason: collision with root package name */
    public long f2089w;

    /* renamed from: x, reason: collision with root package name */
    public int f2090x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ boolean f2091y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ int f2092z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f9(boolean z3, int i, int i10, q.d dVar, te.c cVar) {
        super(2, cVar);
        this.f2091y = z3;
        this.f2092z = i;
        this.A = i10;
        this.B = dVar;
    }

    @Override // ve.a
    public final te.c create(Object obj, te.c cVar) {
        return new f9(this.f2091y, this.f2092z, this.A, this.B, cVar);
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        return ((f9) create((pf.z) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        int i;
        int i10;
        long j10;
        int i11 = this.f2090x;
        pe.z zVar = pe.z.f22715a;
        ue.a aVar = ue.a.f27192u;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    pe.a.e(obj);
                    return zVar;
                }
                q.x.o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j10 = this.f2089w;
            i = this.f2088v;
            i10 = this.f2087u;
            pe.a.e(obj);
        } else {
            pe.a.e(obj);
            if (this.f2091y) {
                int i12 = this.f2092z;
                int i13 = this.A;
                int i14 = i12 % i13;
                i = i12 / i13;
                long j11 = (i14 * 30) + (i * 45);
                long j12 = 260;
                if (j11 <= 260) {
                    j12 = j11;
                }
                this.f2087u = i14;
                this.f2088v = i;
                this.f2089w = j12;
                this.f2090x = 1;
                if (pf.j(j12, this) != aVar) {
                    i10 = i14;
                    j10 = j12;
                }
                return aVar;
            }
            return zVar;
        }
        Float f10 = new Float(1.0f);
        q.r0 r8 = q.e.r(0.72f, 400.0f, null, 4);
        this.f2087u = i10;
        this.f2088v = i;
        this.f2089w = j10;
        this.f2090x = 2;
        if (q.c(this.B, f10, r8, this) == aVar) {
            return aVar;
        }
        return zVar;
    }
}
