package wa;
import k1.r0;
import k1.r;
import q1.a0;
import q1.d;
import q1.e;
import q1.f;

/* loaded from: classes.dex */
public abstract class p9 {

    /* renamed from: a, reason: collision with root package name */
    public static e f29786a;

    public static final e a() {
        e eVar = f29786a;
        if (eVar != null) {
            return eVar;
        }
        d dVar = new d("Filled.Close", 24.0f, 24.0f, 96);
        int i = a0.f23216a;
        r0 r0Var = new r0(r.f19513b);
        f fVar = new f();
        fVar.k(19.0f, 6.41f);
        fVar.i(17.59f, 5.0f);
        fVar.i(12.0f, 10.59f);
        fVar.i(6.41f, 5.0f);
        fVar.i(5.0f, 6.41f);
        fVar.i(10.59f, 12.0f);
        fVar.i(5.0f, 17.59f);
        fVar.i(6.41f, 19.0f);
        fVar.i(12.0f, 13.41f);
        fVar.i(17.59f, 19.0f);
        fVar.i(19.0f, 17.59f);
        fVar.i(13.41f, 12.0f);
        fVar.a();
        d.a(dVar, fVar.f23260u, 0, r0Var, null, 1.0f, 0, 2, 1.0f);
        e b10 = dVar.b();
        f29786a = b10;
        return b10;
    }
}
