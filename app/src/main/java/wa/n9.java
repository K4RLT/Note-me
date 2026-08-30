package wa;
import d.a;
import k1.r0;
import k1.r;
import q1.a0;
import q1.d;
import q1.e;
import q1.f;

/* loaded from: classes.dex */
public abstract class n9 {

    /* renamed from: a, reason: collision with root package name */
    public static e f29764a;

    public static final e a() {
        e eVar = f29764a;
        if (eVar != null) {
            return eVar;
        }
        d dVar = new d("Filled.ArrowBack", 24.0f, 24.0f, 96);
        int i = a0.f23216a;
        r0 r0Var = new r0(r.f19513b);
        f fVar = new f();
        fVar.k(20.0f, 11.0f);
        fVar.g(7.83f);
        fVar.j(5.59f, -5.59f);
        fVar.i(12.0f, 4.0f);
        fVar.j(-8.0f, 8.0f);
        fVar.j(8.0f, 8.0f);
        fVar.j(1.41f, -1.41f);
        fVar.i(7.83f, 13.0f);
        fVar.g(20.0f);
        fVar.o(-2.0f);
        fVar.a();
        d.a(dVar, fVar.f23260u, 0, r0Var, null, 1.0f, 0, 2, 1.0f);
        e b10 = dVar.b();
        f29764a = b10;
        return b10;
    }
}
