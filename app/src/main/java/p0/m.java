package p0;
import q.e;

import q.d1;
import q.k1;
import q.y;

/* loaded from: classes.dex */
public final class m extends kotlin.jvm.internal.m implements df.q {

    /* renamed from: u, reason: collision with root package name */
    public static final m f22341u = new kotlin.jvm.internal.m(3);

    @Override // df.q
    public final Object b(Object obj, Object obj2, Object obj3) {
        Object k1Var;
        d1 d1Var = (d1) obj;
        ((Number) obj3).intValue();
        r0.r rVar = (r0.r) ((r0.m) obj2);
        rVar.a0(-1154662212);
        e eVar = e.f22317u;
        e eVar2 = e.f22318v;
        if (d1Var.b(eVar, eVar2)) {
            k1Var = e.s(67, 0, y.f23034d, 2);
        } else if (!d1Var.b(eVar2, eVar) && !d1Var.b(e.f22319w, eVar2)) {
            k1Var = e.r(0.0f, 0.0f, null, 7);
        } else {
            k1Var = new k1(83, 67, y.f23034d);
        }
        rVar.p(false);
        return k1Var;
    }
}
