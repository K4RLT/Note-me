package wa;
import d.a;
import k1.r0;
import k1.r;
import q1.a0;
import q1.d;
import q1.e;
import q1.f;

/* loaded from: classes.dex */
public abstract class m9 {

    /* renamed from: a, reason: collision with root package name */
    public static e f29751a;

    public static final e a() {
        e eVar = f29751a;
        if (eVar != null) {
            return eVar;
        }
        d dVar = new d("Filled.Add", 24.0f, 24.0f, 96);
        int i = a0.f23216a;
        r0 r0Var = new r0(r.f19513b);
        f fVar = new f();
        fVar.k(19.0f, 13.0f);
        fVar.h(-6.0f);
        fVar.o(6.0f);
        fVar.h(-2.0f);
        fVar.o(-6.0f);
        fVar.g(5.0f);
        fVar.o(-2.0f);
        fVar.h(6.0f);
        fVar.n(5.0f);
        fVar.h(2.0f);
        fVar.o(6.0f);
        fVar.h(6.0f);
        fVar.o(2.0f);
        fVar.a();
        d.a(dVar, fVar.f23260u, 0, r0Var, null, 1.0f, 0, 2, 1.0f);
        e b10 = dVar.b();
        f29751a = b10;
        return b10;
    }
}
