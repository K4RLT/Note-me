package o0;
import a0.g0;
import z1.a1;
import z1.o0;
import z1.r0;

/* loaded from: classes.dex */
public final class b1 extends kotlin.jvm.internal.m implements df.q {

    /* renamed from: u, reason: collision with root package name */
    public static final b1 f21415u = new kotlin.jvm.internal.m(3);

    @Override // df.q
    public final Object b(Object obj, Object obj2, Object obj3) {
        r0 r0Var = (r0) obj;
        long j10 = ((y2.a) obj3).f30799a;
        int t02 = r0Var.t0(f1.f21481a);
        int i = t02 * 2;
        a1 z3 = ((o0) obj2).z(y2.b.i(j10, 0, i));
        int i10 = z3.f31770v - i;
        return r0Var.u0(z3.f31769u, i10, qe.t.f24024u, new g0(z3, t02, 2));
    }
}
