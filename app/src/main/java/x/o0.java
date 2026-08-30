package x;
import l.a;
import r0.l;
import r0.m;
import r0.r;

/* loaded from: classes.dex */
public abstract class o0 {

    /* renamed from: a, reason: collision with root package name */
    public static final p0 f29991a = new p0(h.f29961a, d1.c.D);

    public static final p0 a(d dVar, d1.i iVar, m mVar, int i) {
        boolean z3;
        if (kotlin.jvm.internal.a(dVar, h.f29961a) && kotlin.jvm.internal.a(iVar, d1.c.D)) {
            r rVar = (r) mVar;
            rVar.a0(-848964613);
            rVar.p(false);
            return f29991a;
        }
        r rVar2 = (r) mVar;
        rVar2.a0(-848913742);
        boolean z9 = true;
        if ((((i & 14) ^ 6) > 4 && rVar2.f(dVar)) || (i & 6) == 4) {
            z3 = true;
        } else {
            z3 = false;
        }
        if ((((i & 112) ^ 48) <= 32 || !rVar2.f(iVar)) && (i & 48) != 32) {
            z9 = false;
        }
        boolean z10 = z3 | z9;
        Object O = rVar2.O();
        if (z10 || O == l.f24285a) {
            O = new p0(dVar, iVar);
            rVar2.k0(O);
        }
        p0 p0Var = (p0) O;
        rVar2.p(false);
        return p0Var;
    }
}
