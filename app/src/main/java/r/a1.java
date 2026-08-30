package r;
import r0.c0;
import r0.l;
import r0.m;
import r0.r;

/* loaded from: classes.dex */
public abstract class a1 {

    /* renamed from: a, reason: collision with root package name */
    public static final c0 f24045a = new c0(k.f24104y);

    public static final f a(m mVar) {
        r rVar = (r) mVar;
        rVar.a0(282942128);
        g gVar = (g) rVar.j(f24045a);
        if (gVar == null) {
            rVar.p(false);
            return null;
        }
        boolean f10 = rVar.f(gVar);
        Object O = rVar.O();
        if (f10 || O == l.f24285a) {
            f fVar = new f(gVar.f24074a, gVar.f24075b, gVar.f24076c, gVar.f24077d);
            rVar.k0(fVar);
            O = fVar;
        }
        f fVar2 = (f) O;
        rVar.p(false);
        return fVar2;
    }
}
