package fg;
import y.a;
import z.a;

import wa.o6;

/* loaded from: classes.dex */
public final class e0 implements ag.a {

    /* renamed from: a, reason: collision with root package name */
    public static final e0 f16969a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final cg.e f16970b = wa.a("kotlinx.serialization.json.JsonPrimitive", cg.c.f4117j, new cg.d[0]);

    @Override // ag.a
    public final void a(gg.t tVar, Object obj) {
        d0 d0Var = (d0) obj;
        d0Var.getClass();
        o6.a(tVar);
        if (d0Var instanceof w) {
            tVar.s(x.f16999a, w.INSTANCE);
        } else {
            tVar.s(u.f16997a, (t) d0Var);
        }
    }

    @Override // ag.a
    public final Object b(dg.b bVar) {
        m g8 = o6.b(bVar).g();
        if (g8 instanceof d0) {
            return (d0) g8;
        }
        throw gg.k.e(-1, "Unexpected JSON element, expected JsonPrimitive, had " + kotlin.jvm.internal.a(g8.getClass()), g8.toString());
    }

    @Override // ag.a
    public final cg.d d() {
        return f16970b;
    }
}
