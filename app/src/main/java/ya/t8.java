package ya;
import g3.a;
import w7.i1;
import zc.a;
import zc.c;
import zc.d;
import zc.e;

/* loaded from: classes.dex */
public final class t8 implements d {

    /* renamed from: a, reason: collision with root package name */
    public static final t8 f31515a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final c f31516b = new c("width", a.p(i1.f(v.class, new r(1))));

    /* renamed from: c, reason: collision with root package name */
    public static final c f31517c = new c("height", a.p(i1.f(v.class, new r(2))));

    /* renamed from: d, reason: collision with root package name */
    public static final c f31518d = new c("startX", a.p(i1.f(v.class, new r(3))));
    public static final c e = new c("startY", a.p(i1.f(v.class, new r(4))));

    @Override // a
    public final void a(Object obj, Object obj2) {
        ne neVar = (ne) obj;
        e eVar = (e) obj2;
        eVar.a(f31516b, neVar.f31394a);
        eVar.a(f31517c, neVar.f31395b);
        eVar.a(f31518d, neVar.f31396c);
        eVar.a(e, neVar.f31397d);
    }
}
