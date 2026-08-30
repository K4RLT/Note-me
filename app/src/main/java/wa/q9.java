package wa;
import d.a;
import k1.r0;
import k1.r;
import q1.a0;
import q1.d;
import q1.e;
import q1.f;

/* loaded from: classes.dex */
public abstract class q9 {

    /* renamed from: a, reason: collision with root package name */
    public static e f29796a;

    public static final e a() {
        e eVar = f29796a;
        if (eVar != null) {
            return eVar;
        }
        d dVar = new d("Filled.Delete", 24.0f, 24.0f, 96);
        int i = a0.f23216a;
        r0 r0Var = new r0(r.f19513b);
        f fVar = new f();
        fVar.k(6.0f, 19.0f);
        fVar.f(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        fVar.h(8.0f);
        fVar.f(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        fVar.n(7.0f);
        fVar.g(6.0f);
        fVar.o(12.0f);
        fVar.a();
        fVar.k(19.0f, 4.0f);
        fVar.h(-3.5f);
        fVar.j(-1.0f, -1.0f);
        fVar.h(-5.0f);
        fVar.j(-1.0f, 1.0f);
        fVar.g(5.0f);
        fVar.o(2.0f);
        fVar.h(14.0f);
        fVar.n(4.0f);
        fVar.a();
        d.a(dVar, fVar.f23260u, 0, r0Var, null, 1.0f, 0, 2, 1.0f);
        e b10 = dVar.b();
        f29796a = b10;
        return b10;
    }
}
