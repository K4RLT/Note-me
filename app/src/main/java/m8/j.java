package m8;
import c.b;

/* loaded from: classes.dex */
public final class j implements zc.d {

    /* renamed from: a, reason: collision with root package name */
    public static final j f20712a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final zc.c f20713b = zc.b("requestTimeMs");

    /* renamed from: c, reason: collision with root package name */
    public static final zc.c f20714c = zc.b("requestUptimeMs");

    /* renamed from: d, reason: collision with root package name */
    public static final zc.c f20715d = zc.b("clientInfo");
    public static final zc.c e = zc.b("logSource");

    /* renamed from: f, reason: collision with root package name */
    public static final zc.c f20716f = zc.b("logSourceName");

    /* renamed from: g, reason: collision with root package name */
    public static final zc.c f20717g = zc.b("logEvent");

    /* renamed from: h, reason: collision with root package name */
    public static final zc.c f20718h = zc.b("qosTier");

    @Override // zc.a
    public final void a(Object obj, Object obj2) {
        zc.e eVar = (zc.e) obj2;
        t tVar = (t) ((f0) obj);
        eVar.d(f20713b, tVar.f20748a);
        eVar.d(f20714c, tVar.f20749b);
        eVar.a(f20715d, tVar.f20750c);
        eVar.a(e, tVar.f20751d);
        eVar.a(f20716f, tVar.e);
        eVar.a(f20717g, tVar.f20752f);
        eVar.a(f20718h, j0.f20719u);
    }
}
