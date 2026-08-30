package o0;
import k1.p0;
import r0.m;
import r0.r;
import v.i;

/* loaded from: classes.dex */
public final class l0 extends kotlin.jvm.internal.m implements df.p {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ boolean f21547u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ i f21548v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ s1 f21549w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ p0 f21550x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(boolean z3, i iVar, s1 s1Var, p0 p0Var) {
        super(2);
        this.f21547u = z3;
        this.f21548v = iVar;
        this.f21549w = s1Var;
        this.f21550x = p0Var;
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        m mVar = (m) obj;
        if ((((Number) obj2).intValue() & 3) == 2) {
            r rVar = (r) mVar;
            if (rVar.D()) {
                rVar.U();
                return pe.z.f22715a;
            }
        }
        j0.f21526a.a(this.f21547u, this.f21548v, null, this.f21549w, this.f21550x, 0.0f, 0.0f, mVar, 100663296, 200);
        return pe.z.f22715a;
    }
}
