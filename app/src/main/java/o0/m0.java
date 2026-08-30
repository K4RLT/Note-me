package o0;
import k1.p0;
import r0.m;
import r0.r;
import v.i;
import z0.h;

/* loaded from: classes.dex */
public final class m0 extends kotlin.jvm.internal.m implements df.q {
    public final /* synthetic */ s1 A;
    public final /* synthetic */ p0 B;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ String f21579u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ boolean f21580v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ boolean f21581w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ r2.e0 f21582x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ i f21583y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ df.p f21584z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(String str, boolean z3, boolean z9, r2.e0 e0Var, i iVar, df.p pVar, s1 s1Var, p0 p0Var) {
        super(3);
        this.f21579u = str;
        this.f21580v = z3;
        this.f21581w = z9;
        this.f21582x = e0Var;
        this.f21583y = iVar;
        this.f21584z = pVar;
        this.A = s1Var;
        this.B = p0Var;
    }

    @Override // df.q
    public final Object b(Object obj, Object obj2, Object obj3) {
        int i;
        df.p pVar = (df.p) obj;
        m mVar = (m) obj2;
        int intValue = ((Number) obj3).intValue();
        if ((intValue & 6) == 0) {
            if (((r) mVar).h(pVar)) {
                i = 4;
            } else {
                i = 2;
            }
            intValue |= i;
        }
        if ((intValue & 19) == 18) {
            r rVar = (r) mVar;
            if (rVar.D()) {
                rVar.U();
                return pe.z.f22715a;
            }
        }
        j0 j0Var = j0.f21526a;
        p0 p0Var = this.B;
        boolean z3 = this.f21580v;
        i iVar = this.f21583y;
        s1 s1Var = this.A;
        j0Var.b(this.f21579u, pVar, z3, this.f21581w, this.f21582x, iVar, this.f21584z, s1Var, null, h.d(2108828640, new l0(z3, iVar, s1Var, p0Var), mVar), mVar, (intValue << 3) & 112);
        return pe.z.f22715a;
    }
}
