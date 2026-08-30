package ya;
import k1.r0;
import k1.r;
import q1.a0;
import q1.d;
import q1.e;
import q1.f;

/* loaded from: classes.dex */
public abstract class n0 {

    /* renamed from: a, reason: collision with root package name */
    public static e f31379a;

    public static final e a() {
        e eVar = f31379a;
        if (eVar != null) {
            return eVar;
        }
        d dVar = new d("Outlined.Refresh", 24.0f, 24.0f, 96);
        int i = a0.f23216a;
        r0 r0Var = new r0(r.f19513b);
        f fVar = new f();
        fVar.k(17.65f, 6.35f);
        fVar.e(16.2f, 4.9f, 14.21f, 4.0f, 12.0f, 4.0f);
        fVar.f(-4.42f, 0.0f, -7.99f, 3.58f, -7.99f, 8.0f);
        fVar.m(3.57f, 8.0f, 7.99f, 8.0f);
        fVar.f(3.73f, 0.0f, 6.84f, -2.55f, 7.73f, -6.0f);
        fVar.h(-2.08f);
        fVar.f(-0.82f, 2.33f, -3.04f, 4.0f, -5.65f, 4.0f);
        fVar.f(-3.31f, 0.0f, -6.0f, -2.69f, -6.0f, -6.0f);
        fVar.m(2.69f, -6.0f, 6.0f, -6.0f);
        fVar.f(1.66f, 0.0f, 3.14f, 0.69f, 4.22f, 1.78f);
        fVar.i(13.0f, 11.0f);
        fVar.h(7.0f);
        fVar.n(4.0f);
        fVar.j(-2.35f, 2.35f);
        fVar.a();
        d.a(dVar, fVar.f23260u, 0, r0Var, null, 1.0f, 0, 2, 1.0f);
        e b10 = dVar.b();
        f31379a = b10;
        return b10;
    }
}
