package o0;
import b0.d1;
import k1.r;
import r0.c0;
import r0.m;
import r0.r;
import r0.y;
import z0.c;
import z0.h;

/* loaded from: classes.dex */
public final class d0 extends kotlin.jvm.internal.m implements df.p {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ c0 f21444u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ boolean f21445v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ c f21446w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(c0 c0Var, boolean z3, c cVar) {
        super(2);
        this.f21444u = c0Var;
        this.f21445v = z3;
        this.f21446w = cVar;
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        long j10;
        m mVar = (m) obj;
        if ((((Number) obj2).intValue() & 3) == 2) {
            r rVar = (r) mVar;
            if (rVar.D()) {
                rVar.U();
                return pe.z.f22715a;
            }
        }
        r rVar2 = (r) mVar;
        rVar2.a0(1264683960);
        rVar2.p(false);
        c0 c0Var = q.f21634a;
        boolean z3 = this.f21445v;
        c0 c0Var2 = this.f21444u;
        if (z3) {
            j10 = c0Var2.f21435a;
        } else {
            j10 = c0Var2.f21438d;
        }
        y.a(c0Var.a(new r(j10)), h.d(-1728894036, new d1(this.f21446w), rVar2), rVar2, 56);
        return pe.z.f22715a;
    }
}
