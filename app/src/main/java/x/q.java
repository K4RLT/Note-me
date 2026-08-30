package x;
import l.a;
import r0.l;
import r0.m;
import r0.r;

/* loaded from: classes.dex */
public abstract class q {

    /* renamed from: a, reason: collision with root package name */
    public static final r f29994a = new r(h.f29962b, d1.c.G);

    public static final r a(f fVar, d1.h hVar, m mVar, int i) {
        boolean z3;
        if (kotlin.jvm.internal.a(fVar, h.f29962b) && hVar.equals(d1.c.G)) {
            r rVar = (r) mVar;
            rVar.a0(346089448);
            rVar.p(false);
            return f29994a;
        }
        r rVar2 = (r) mVar;
        rVar2.a0(346143295);
        boolean z9 = true;
        if ((((i & 14) ^ 6) > 4 && rVar2.f(fVar)) || (i & 6) == 4) {
            z3 = true;
        } else {
            z3 = false;
        }
        if ((((i & 112) ^ 48) <= 32 || !rVar2.f(hVar)) && (i & 48) != 32) {
            z9 = false;
        }
        boolean z10 = z3 | z9;
        Object O = rVar2.O();
        if (z10 || O == l.f24285a) {
            O = new r(fVar, hVar);
            rVar2.k0(O);
        }
        r rVar3 = (r) O;
        rVar2.p(false);
        return rVar3;
    }
}
