package ya;
import i1.f;
import g3.a;
import w7.i1;
import zc.c;
import zc.d;
import zc.e;

/* loaded from: classes.dex */
public final class x2 implements d {

    /* renamed from: a, reason: collision with root package name */
    public static final x2 f31579a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final c f31580b = new c("errorCode", a.p(i1.f(v.class, new r(1))));

    /* renamed from: c, reason: collision with root package name */
    public static final c f31581c = new c("isColdCall", a.p(i1.f(v.class, new r(2))));

    /* renamed from: d, reason: collision with root package name */
    public static final c f31582d = new c("imageInfo", a.p(i1.f(v.class, new r(3))));
    public static final c e = new c("subjectSegmenterOptions", a.p(i1.f(v.class, new r(4))));

    @Override // a
    public final void a(Object obj, Object obj2) {
        g1 g1Var = (g1) obj;
        e eVar = (e) obj2;
        eVar.a(f31580b, g1Var.f31300a);
        eVar.a(f31581c, g1Var.f31301b);
        eVar.a(f31582d, null);
        eVar.a(e, g1Var.f31302c);
    }
}
