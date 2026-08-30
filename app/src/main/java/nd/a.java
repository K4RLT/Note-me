package nd;

/* loaded from: classes.dex */
public final class a implements zc.d {

    /* renamed from: a, reason: collision with root package name */
    public static final a f21226a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final zc.c f21227b = new zc.c("projectNumber", g3.a.p(g3.a.o(cd.e.class, new cd.a(1))));

    /* renamed from: c, reason: collision with root package name */
    public static final zc.c f21228c = new zc.c("messageId", g3.a.p(g3.a.o(cd.e.class, new cd.a(2))));

    /* renamed from: d, reason: collision with root package name */
    public static final zc.c f21229d = new zc.c("instanceId", g3.a.p(g3.a.o(cd.e.class, new cd.a(3))));
    public static final zc.c e = new zc.c("messageType", g3.a.p(g3.a.o(cd.e.class, new cd.a(4))));

    /* renamed from: f, reason: collision with root package name */
    public static final zc.c f21230f = new zc.c("sdkPlatform", g3.a.p(g3.a.o(cd.e.class, new cd.a(5))));

    /* renamed from: g, reason: collision with root package name */
    public static final zc.c f21231g = new zc.c("packageName", g3.a.p(g3.a.o(cd.e.class, new cd.a(6))));

    /* renamed from: h, reason: collision with root package name */
    public static final zc.c f21232h = new zc.c("collapseKey", g3.a.p(g3.a.o(cd.e.class, new cd.a(7))));
    public static final zc.c i = new zc.c("priority", g3.a.p(g3.a.o(cd.e.class, new cd.a(8))));

    /* renamed from: j, reason: collision with root package name */
    public static final zc.c f21233j = new zc.c("ttl", g3.a.p(g3.a.o(cd.e.class, new cd.a(9))));

    /* renamed from: k, reason: collision with root package name */
    public static final zc.c f21234k = new zc.c("topic", g3.a.p(g3.a.o(cd.e.class, new cd.a(10))));

    /* renamed from: l, reason: collision with root package name */
    public static final zc.c f21235l = new zc.c("bulkId", g3.a.p(g3.a.o(cd.e.class, new cd.a(11))));

    /* renamed from: m, reason: collision with root package name */
    public static final zc.c f21236m = new zc.c("event", g3.a.p(g3.a.o(cd.e.class, new cd.a(12))));

    /* renamed from: n, reason: collision with root package name */
    public static final zc.c f21237n = new zc.c("analyticsLabel", g3.a.p(g3.a.o(cd.e.class, new cd.a(13))));

    /* renamed from: o, reason: collision with root package name */
    public static final zc.c f21238o = new zc.c("campaignId", g3.a.p(g3.a.o(cd.e.class, new cd.a(14))));

    /* renamed from: p, reason: collision with root package name */
    public static final zc.c f21239p = new zc.c("composerLabel", g3.a.p(g3.a.o(cd.e.class, new cd.a(15))));

    @Override // zc.a
    public final void a(Object obj, Object obj2) {
        od.d dVar = (od.d) obj;
        zc.e eVar = (zc.e) obj2;
        eVar.d(f21227b, dVar.f21966a);
        eVar.a(f21228c, dVar.f21967b);
        eVar.a(f21229d, dVar.f21968c);
        eVar.a(e, dVar.f21969d);
        eVar.a(f21230f, od.c.ANDROID);
        eVar.a(f21231g, dVar.e);
        eVar.a(f21232h, dVar.f21970f);
        eVar.f(i, 0);
        eVar.f(f21233j, dVar.f21971g);
        eVar.a(f21234k, dVar.f21972h);
        eVar.d(f21235l, 0L);
        eVar.a(f21236m, od.a.MESSAGE_DELIVERED);
        eVar.a(f21237n, dVar.i);
        eVar.d(f21238o, 0L);
        eVar.a(f21239p, dVar.f21973j);
    }
}
