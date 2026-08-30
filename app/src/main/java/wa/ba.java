package wa;
import k1.r0;
import k1.r;
import q1.a0;
import q1.d;
import q1.e;
import q1.f;

/* loaded from: classes.dex */
public abstract class ba {

    /* renamed from: a, reason: collision with root package name */
    public static e f29578a;

    public static final e a() {
        e eVar = f29578a;
        if (eVar != null) {
            return eVar;
        }
        d dVar = new d("Filled.Share", 24.0f, 24.0f, 96);
        int i = a0.f23216a;
        r0 r0Var = new r0(r.f19513b);
        f fVar = new f();
        fVar.k(18.0f, 16.08f);
        fVar.f(-0.76f, 0.0f, -1.44f, 0.3f, -1.96f, 0.77f);
        fVar.i(8.91f, 12.7f);
        fVar.f(0.05f, -0.23f, 0.09f, -0.46f, 0.09f, -0.7f);
        fVar.m(-0.04f, -0.47f, -0.09f, -0.7f);
        fVar.j(7.05f, -4.11f);
        fVar.f(0.54f, 0.5f, 1.25f, 0.81f, 2.04f, 0.81f);
        fVar.f(1.66f, 0.0f, 3.0f, -1.34f, 3.0f, -3.0f);
        fVar.m(-1.34f, -3.0f, -3.0f, -3.0f);
        fVar.m(-3.0f, 1.34f, -3.0f, 3.0f);
        fVar.f(0.0f, 0.24f, 0.04f, 0.47f, 0.09f, 0.7f);
        fVar.i(8.04f, 9.81f);
        fVar.e(7.5f, 9.31f, 6.79f, 9.0f, 6.0f, 9.0f);
        fVar.f(-1.66f, 0.0f, -3.0f, 1.34f, -3.0f, 3.0f);
        fVar.m(1.34f, 3.0f, 3.0f, 3.0f);
        fVar.f(0.79f, 0.0f, 1.5f, -0.31f, 2.04f, -0.81f);
        fVar.j(7.12f, 4.16f);
        fVar.f(-0.05f, 0.21f, -0.08f, 0.43f, -0.08f, 0.65f);
        fVar.f(0.0f, 1.61f, 1.31f, 2.92f, 2.92f, 2.92f);
        fVar.f(1.61f, 0.0f, 2.92f, -1.31f, 2.92f, -2.92f);
        fVar.m(-1.31f, -2.92f, -2.92f, -2.92f);
        fVar.a();
        d.a(dVar, fVar.f23260u, 0, r0Var, null, 1.0f, 0, 2, 1.0f);
        e b10 = dVar.b();
        f29578a = b10;
        return b10;
    }
}
