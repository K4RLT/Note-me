package b0;
import a0.g;
import a0.n;
import a1.e;
import l.a;
import n.i0;
import n.p0;
import z0.c;

/* loaded from: classes.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final e f1271a;

    /* renamed from: b, reason: collision with root package name */
    public final n f1272b;

    /* renamed from: c, reason: collision with root package name */
    public final i0 f1273c;

    public w(e eVar, n nVar) {
        this.f1271a = eVar;
        this.f1272b = nVar;
        long[] jArr = p0.f20923a;
        this.f1273c = new i0();
    }

    public final df.p a(Object obj, int i, Object obj2) {
        i0 i0Var = this.f1273c;
        v vVar = (v) i0Var.g(obj);
        if (vVar != null && vVar.f1269c == i && kotlin.jvm.internal.a(vVar.f1268b, obj2)) {
            c cVar = vVar.f1270d;
            if (cVar == null) {
                c cVar2 = new c(1403994769, new g(vVar.e, 1, vVar), true);
                vVar.f1270d = cVar2;
                return cVar2;
            }
            return cVar;
        }
        v vVar2 = new v(this, i, obj, obj2);
        i0Var.m(obj, vVar2);
        c cVar3 = vVar2.f1270d;
        if (cVar3 == null) {
            c cVar4 = new c(1403994769, new g(this, 1, vVar2), true);
            vVar2.f1270d = cVar4;
            return cVar4;
        }
        return cVar3;
    }

    public final Object b(Object obj) {
        if (obj != null) {
            v vVar = (v) this.f1273c.g(obj);
            if (vVar != null) {
                return vVar.f1268b;
            }
            z zVar = (z) this.f1272b.invoke();
            int d2 = zVar.d(obj);
            if (d2 != -1) {
                return zVar.c(d2);
            }
            return null;
        }
        return null;
    }
}
