package p;
import c.a;
import d1.r;
import r0.m;
import r0.r;

/* loaded from: classes.dex */
public final class w extends kotlin.jvm.internal.m implements df.q {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ x f22283u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ p0 f22284v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ q0 f22285w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(x xVar, p0 p0Var, q0 q0Var) {
        super(3);
        this.f22283u = xVar;
        this.f22284v = p0Var;
        this.f22285w = q0Var;
    }

    @Override // df.q
    public final Object b(Object obj, Object obj2, Object obj3) {
        ((Number) obj3).intValue();
        r rVar = (r) ((m) obj2);
        rVar.a0(1840112047);
        r d2 = ((r) obj).d(androidx.compose.animation.a(this.f22283u.b(), this.f22284v, this.f22285w, "animateEnterExit", rVar, 0));
        rVar.p(false);
        return d2;
    }
}
