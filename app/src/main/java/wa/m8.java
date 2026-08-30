package wa;
import j0.b;
import m2.g0;
import m2.q0;
import q2.h;
import y2.c;
import y2.d;
import y2.m;

/* loaded from: classes.dex */
public abstract class m8 {
    public static b a(b bVar, m mVar, q0 q0Var, c cVar, h hVar) {
        if (bVar != null && mVar == bVar.f18688a && g0.i(q0Var, mVar).equals(bVar.f18689b) && cVar.a() == bVar.f18690c.f30800u && hVar == bVar.f18691d) {
            return bVar;
        }
        b bVar2 = b.f18687h;
        if (bVar2 != null && mVar == bVar2.f18688a && g0.i(q0Var, mVar).equals(bVar2.f18689b) && cVar.a() == bVar2.f18690c.f30800u && hVar == bVar2.f18691d) {
            return bVar2;
        }
        b bVar3 = new b(mVar, g0.i(q0Var, mVar), new d(cVar.a(), cVar.i0()), hVar);
        b.f18687h = bVar3;
        return bVar3;
    }
}
