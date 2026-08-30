package fg;

import eg.b1;
import eg.g0;
import java.util.Map;
import wa.o6;

/* loaded from: classes.dex */
public final class b0 implements ag.a {

    /* renamed from: a, reason: collision with root package name */
    public static final b0 f16962a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final a0 f16963b = a0.f16959b;

    @Override // ag.a
    public final void a(gg.t tVar, Object obj) {
        z zVar = (z) obj;
        zVar.getClass();
        o6.a(tVar);
        b1 b1Var = b1.f16494a;
        new g0(p.f16992a).a(tVar, zVar);
    }

    @Override // ag.a
    public final Object b(dg.b bVar) {
        o6.b(bVar);
        b1 b1Var = b1.f16494a;
        return new z((Map) new g0(p.f16992a).b(bVar));
    }

    @Override // ag.a
    public final cg.d d() {
        return f16963b;
    }
}
