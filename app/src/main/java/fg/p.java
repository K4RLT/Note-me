package fg;
import x.n;
import q.x;

import b8.b7;
import wa.o6;

/* loaded from: classes.dex */
public final class p implements ag.a {

    /* renamed from: a, reason: collision with root package name */
    public static final p f16992a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final cg.e f16993b;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, fg.p] */
    static {
        cg.e eVar;
        cg.d[] dVarArr = new cg.d[0];
        b7 b7Var = new b7(17);
        if (!mf.f.u("kotlinx.serialization.json.JsonElement")) {
            cg.i iVar = cg.i.f4134b;
            cg.b bVar = cg.b.f4110b;
            if (!bVar.equals(iVar)) {
                cg.a aVar = new cg.a("kotlinx.serialization.json.JsonElement");
                b7Var.invoke(aVar);
                eVar = new cg.e("kotlinx.serialization.json.JsonElement", bVar, aVar.f4106b.size(), qe.k.t(dVarArr), aVar);
                f16993b = eVar;
            }
            x.n("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
        } else {
            x.n("Blank serial names are prohibited");
        }
        eVar = null;
        f16993b = eVar;
    }

    @Override // ag.a
    public final void a(gg.t tVar, Object obj) {
        m mVar = (m) obj;
        mVar.getClass();
        o6.a(tVar);
        if (mVar instanceof d0) {
            tVar.s(e0.f16969a, mVar);
            return;
        }
        if (mVar instanceof z) {
            tVar.s(b0.f16962a, mVar);
        } else if (mVar instanceof e) {
            tVar.s(g.f16974a, mVar);
        } else {
            l4.a.o();
        }
    }

    @Override // ag.a
    public final Object b(dg.b bVar) {
        return o6.b(bVar).g();
    }

    @Override // ag.a
    public final cg.d d() {
        return f16993b;
    }
}
