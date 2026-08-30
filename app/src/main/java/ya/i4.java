package ya;
import g3.a;
import w7.i1;
import zc.a;
import zc.c;
import zc.d;
import zc.e;

/* loaded from: classes.dex */
public final class i4 implements d {

    /* renamed from: a, reason: collision with root package name */
    public static final i4 f31330a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final c f31331b = new c("maxMs", a.p(i1.f(v.class, new r(1))));

    /* renamed from: c, reason: collision with root package name */
    public static final c f31332c = new c("minMs", a.p(i1.f(v.class, new r(2))));

    /* renamed from: d, reason: collision with root package name */
    public static final c f31333d = new c("avgMs", a.p(i1.f(v.class, new r(3))));
    public static final c e = new c("firstQuartileMs", a.p(i1.f(v.class, new r(4))));

    /* renamed from: f, reason: collision with root package name */
    public static final c f31334f = new c("medianMs", a.p(i1.f(v.class, new r(5))));

    /* renamed from: g, reason: collision with root package name */
    public static final c f31335g = new c("thirdQuartileMs", a.p(i1.f(v.class, new r(6))));

    @Override // a
    public final void a(Object obj, Object obj2) {
        ja jaVar = (ja) obj;
        e eVar = (e) obj2;
        eVar.a(f31331b, jaVar.f31349a);
        eVar.a(f31332c, jaVar.f31350b);
        eVar.a(f31333d, jaVar.f31351c);
        eVar.a(e, jaVar.f31352d);
        eVar.a(f31334f, jaVar.e);
        eVar.a(f31335g, jaVar.f31353f);
    }
}
