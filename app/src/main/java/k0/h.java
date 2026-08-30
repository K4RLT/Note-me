package k0;
import d1.r;
import r0.l;
import r0.m;

/* loaded from: classes.dex */
public final class h extends kotlin.jvm.internal.m implements df.q {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ df.a f19294u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ boolean f19295v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(boolean z3, df.a aVar) {
        super(3);
        this.f19294u = aVar;
        this.f19295v = z3;
    }

    @Override // df.q
    public final Object b(Object obj, Object obj2, Object obj3) {
        r rVar = (r) obj;
        ((Number) obj3).intValue();
        r rVar2 = (r) ((m) obj2);
        rVar2.a0(-196777734);
        long j10 = ((o1) rVar2.j(p1.f19390a)).f19381a;
        boolean e = rVar2.e(j10);
        df.a aVar = this.f19294u;
        boolean f10 = e | rVar2.f(aVar);
        boolean z3 = this.f19295v;
        boolean g8 = f10 | rVar2.g(z3);
        Object O = rVar2.O();
        if (g8 || O == l.f24285a) {
            O = new g(j10, aVar, z3);
            rVar2.k0(O);
        }
        r b10 = androidx.compose.ui.draw.a.b(rVar, (df.l) O);
        rVar2.p(false);
        return b10;
    }
}
