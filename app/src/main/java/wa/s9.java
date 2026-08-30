package wa;
import k1.r0;
import k1.r;
import q1.a0;
import q1.d;
import q1.e;
import q1.f;

/* loaded from: classes.dex */
public abstract class s9 {

    /* renamed from: a, reason: collision with root package name */
    public static e f29812a;

    public static final e a() {
        e eVar = f29812a;
        if (eVar != null) {
            return eVar;
        }
        d dVar = new d("Filled.Edit", 24.0f, 24.0f, 96);
        int i = a0.f23216a;
        r0 r0Var = new r0(r.f19513b);
        f fVar = new f();
        fVar.k(3.0f, 17.25f);
        fVar.n(21.0f);
        fVar.h(3.75f);
        fVar.i(17.81f, 9.94f);
        fVar.j(-3.75f, -3.75f);
        fVar.i(3.0f, 17.25f);
        fVar.a();
        fVar.k(20.71f, 7.04f);
        fVar.f(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f);
        fVar.j(-2.34f, -2.34f);
        fVar.f(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
        fVar.j(-1.83f, 1.83f);
        fVar.j(3.75f, 3.75f);
        fVar.j(1.83f, -1.83f);
        fVar.a();
        d.a(dVar, fVar.f23260u, 0, r0Var, null, 1.0f, 0, 2, 1.0f);
        e b10 = dVar.b();
        f29812a = b10;
        return b10;
    }
}
