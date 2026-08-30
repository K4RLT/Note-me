package wa;
import k1.r0;
import k1.r;
import q1.a0;
import q1.d;
import q1.e;
import q1.f;

/* loaded from: classes.dex */
public abstract class y9 {

    /* renamed from: a, reason: collision with root package name */
    public static e f29870a;

    public static final e a() {
        e eVar = f29870a;
        if (eVar != null) {
            return eVar;
        }
        d dVar = new d("Filled.MoreVert", 24.0f, 24.0f, 96);
        int i = a0.f23216a;
        r0 r0Var = new r0(r.f19513b);
        f fVar = new f();
        fVar.k(12.0f, 8.0f);
        fVar.f(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        fVar.m(-0.9f, -2.0f, -2.0f, -2.0f);
        fVar.m(-2.0f, 0.9f, -2.0f, 2.0f);
        fVar.m(0.9f, 2.0f, 2.0f, 2.0f);
        fVar.a();
        fVar.k(12.0f, 10.0f);
        fVar.f(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        fVar.m(0.9f, 2.0f, 2.0f, 2.0f);
        fVar.m(2.0f, -0.9f, 2.0f, -2.0f);
        fVar.m(-0.9f, -2.0f, -2.0f, -2.0f);
        fVar.a();
        fVar.k(12.0f, 16.0f);
        fVar.f(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        fVar.m(0.9f, 2.0f, 2.0f, 2.0f);
        fVar.m(2.0f, -0.9f, 2.0f, -2.0f);
        fVar.m(-0.9f, -2.0f, -2.0f, -2.0f);
        fVar.a();
        d.a(dVar, fVar.f23260u, 0, r0Var, null, 1.0f, 0, 2, 1.0f);
        e b10 = dVar.b();
        f29870a = b10;
        return b10;
    }
}
