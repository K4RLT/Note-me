package g0;
import g0.a;
import a1.q;
import b.b;
import m.h;
import m2.a;
import m2.g0;
import m2.q0;

/* loaded from: classes.dex */
public abstract class s1 {

    /* renamed from: a */
    public static final String f17279a = mf.h(10, "H");

    public static final long a(q0 q0Var, y2.c cVar, q2.h hVar, String str, int i) {
        a a10 = g0.a(str, q0Var, y2.b(0, 0, 15), cVar, hVar, i, 64);
        return (q(((u2.c) a10.f20436c).c()) << 32) | (q(a10.h()) & 4294967295L);
    }

    public static /* synthetic */ long b(q0 q0Var, y2.c cVar, q2.h hVar) {
        return a(q0Var, cVar, hVar, f17279a, 1);
    }
}
