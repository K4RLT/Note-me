package fg;
import y.a;

import wa.o6;

/* loaded from: classes.dex */
public final class x implements ag.a {

    /* renamed from: a, reason: collision with root package name */
    public static final x f16999a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final cg.e f17000b = wa.a("kotlinx.serialization.json.JsonNull", cg.h.f4133c, new cg.d[0]);

    @Override // ag.a
    public final void a(gg.t tVar, Object obj) {
        ((w) obj).getClass();
        o6.a(tVar);
        tVar.p();
    }

    @Override // ag.a
    public final Object b(dg.b bVar) {
        o6.b(bVar);
        if (!bVar.p()) {
            return w.INSTANCE;
        }
        throw new IllegalArgumentException("Expected 'null' literal");
    }

    @Override // ag.a
    public final cg.d d() {
        return f17000b;
    }
}
