package wa;
import k1.r0;
import k1.r;
import q1.a0;
import q1.d;
import q1.e;
import q1.f;

/* loaded from: classes.dex */
public abstract class t9 {

    /* renamed from: a, reason: collision with root package name */
    public static e f29822a;

    public static final e a() {
        e eVar = f29822a;
        if (eVar != null) {
            return eVar;
        }
        d dVar = new d("Filled.Info", 24.0f, 24.0f, 96);
        int i = a0.f23216a;
        r0 r0Var = new r0(r.f19513b);
        f fVar = new f();
        fVar.k(12.0f, 2.0f);
        fVar.e(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        fVar.m(4.48f, 10.0f, 10.0f, 10.0f);
        fVar.m(10.0f, -4.48f, 10.0f, -10.0f);
        fVar.l(17.52f, 2.0f, 12.0f, 2.0f);
        fVar.a();
        fVar.k(13.0f, 17.0f);
        fVar.h(-2.0f);
        fVar.o(-6.0f);
        fVar.h(2.0f);
        fVar.o(6.0f);
        fVar.a();
        fVar.k(13.0f, 9.0f);
        fVar.h(-2.0f);
        fVar.i(11.0f, 7.0f);
        fVar.h(2.0f);
        fVar.o(2.0f);
        fVar.a();
        d.a(dVar, fVar.f23260u, 0, r0Var, null, 1.0f, 0, 2, 1.0f);
        e b10 = dVar.b();
        f29822a = b10;
        return b10;
    }
}
