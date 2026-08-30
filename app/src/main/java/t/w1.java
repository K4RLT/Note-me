package t;
import x.o;
import q.a;
import q.b;
import q.c;
import q.x;

/* loaded from: classes.dex */
public final class w1 extends ve.i implements df.p {
    public final /* synthetic */ kotlin.jvm.internal.x A;
    public final /* synthetic */ long B;

    /* renamed from: u, reason: collision with root package name */
    public z1 f25562u;

    /* renamed from: v, reason: collision with root package name */
    public kotlin.jvm.internal.x f25563v;

    /* renamed from: w, reason: collision with root package name */
    public long f25564w;

    /* renamed from: x, reason: collision with root package name */
    public int f25565x;

    /* renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f25566y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ z1 f25567z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1(z1 z1Var, kotlin.jvm.internal.x xVar, long j10, te.c cVar) {
        super(2, cVar);
        this.f25567z = z1Var;
        this.A = xVar;
        this.B = j10;
    }

    @Override // ve.a
    public final te.c create(Object obj, te.c cVar) {
        w1 w1Var = new w1(this.f25567z, this.A, this.B, cVar);
        w1Var.f25566y = obj;
        return w1Var;
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        return ((w1) create((x1) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        z1 z1Var;
        float c10;
        kotlin.jvm.internal.x xVar;
        long j10;
        z1 z1Var2;
        long a10;
        int i = this.f25565x;
        z0 z0Var = z0.f25598v;
        if (i != 0) {
            if (i == 1) {
                j10 = this.f25564w;
                xVar = this.f25563v;
                z1Var = this.f25562u;
                z1Var2 = (z1) this.f25566y;
                pe.a.e(obj);
            } else {
                x.o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            pe.a.e(obj);
            x1 x1Var = (x1) this.f25566y;
            z1Var = this.f25567z;
            v1 v1Var = new v1(z1Var, x1Var);
            n0 n0Var = z1Var.f25602c;
            kotlin.jvm.internal.x xVar2 = this.A;
            long j11 = xVar2.f19786u;
            z0 z0Var2 = z1Var.f25603d;
            long j12 = this.B;
            if (z0Var2 == z0Var) {
                c10 = y2.b(j12);
            } else {
                c10 = y2.c(j12);
            }
            float d2 = z1Var.d(c10);
            this.f25566y = z1Var;
            this.f25562u = z1Var;
            this.f25563v = xVar2;
            this.f25564w = j11;
            this.f25565x = 1;
            obj = n0Var.a(v1Var, d2, this);
            ue.a aVar = ue.a.f27192u;
            if (obj == aVar) {
                return aVar;
            }
            xVar = xVar2;
            j10 = j11;
            z1Var2 = z1Var;
        }
        float d10 = z1Var2.d(((Number) obj).floatValue());
        if (z1Var.f25603d == z0Var) {
            a10 = y2.a(j10, d10, 0.0f, 2);
        } else {
            a10 = y2.a(j10, 0.0f, d10, 1);
        }
        xVar.f19786u = a10;
        return pe.z.f22715a;
    }
}
