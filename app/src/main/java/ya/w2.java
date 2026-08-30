package ya;
import i1.f;
import g3.a;
import w7.i1;
import zc.c;
import zc.d;
import zc.e;

/* loaded from: classes.dex */
public final class w2 implements d {

    /* renamed from: a, reason: collision with root package name */
    public static final w2 f31547a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final c f31548b = new c("logEventKey", a.p(i1.f(v.class, new r(1))));

    /* renamed from: c, reason: collision with root package name */
    public static final c f31549c = new c("eventCount", a.p(i1.f(v.class, new r(2))));

    /* renamed from: d, reason: collision with root package name */
    public static final c f31550d = new c("inferenceDurationStats", a.p(i1.f(v.class, new r(3))));

    @Override // a
    public final void a(Object obj, Object obj2) {
        h1 h1Var = (h1) obj;
        e eVar = (e) obj2;
        eVar.a(f31548b, h1Var.f31315a);
        eVar.a(f31549c, h1Var.f31316b);
        eVar.a(f31550d, h1Var.f31317c);
    }
}
