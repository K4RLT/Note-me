package qc;
import c.b;

/* loaded from: classes.dex */
public final class j implements zc.d {

    /* renamed from: a, reason: collision with root package name */
    public static final j f23806a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final zc.c f23807b = zc.b("generator");

    /* renamed from: c, reason: collision with root package name */
    public static final zc.c f23808c = zc.b("identifier");

    /* renamed from: d, reason: collision with root package name */
    public static final zc.c f23809d = zc.b("appQualitySessionId");
    public static final zc.c e = zc.b("startedAt");

    /* renamed from: f, reason: collision with root package name */
    public static final zc.c f23810f = zc.b("endedAt");

    /* renamed from: g, reason: collision with root package name */
    public static final zc.c f23811g = zc.b("crashed");

    /* renamed from: h, reason: collision with root package name */
    public static final zc.c f23812h = zc.b("app");
    public static final zc.c i = zc.b("user");

    /* renamed from: j, reason: collision with root package name */
    public static final zc.c f23813j = zc.b("os");

    /* renamed from: k, reason: collision with root package name */
    public static final zc.c f23814k = zc.b("device");

    /* renamed from: l, reason: collision with root package name */
    public static final zc.c f23815l = zc.b("events");

    /* renamed from: m, reason: collision with root package name */
    public static final zc.c f23816m = zc.b("generatorType");

    @Override // zc.a
    public final void a(Object obj, Object obj2) {
        zc.e eVar = (zc.e) obj2;
        j0 j0Var = (j0) ((l2) obj);
        eVar.a(f23807b, j0Var.f23817a);
        eVar.a(f23808c, j0Var.f23818b.getBytes(m2.f23870a));
        eVar.a(f23809d, j0Var.f23819c);
        eVar.d(e, j0Var.f23820d);
        eVar.a(f23810f, j0Var.e);
        eVar.g(f23811g, j0Var.f23821f);
        eVar.a(f23812h, j0Var.f23822g);
        eVar.a(i, j0Var.f23823h);
        eVar.a(f23813j, j0Var.i);
        eVar.a(f23814k, j0Var.f23824j);
        eVar.a(f23815l, j0Var.f23825k);
        eVar.f(f23816m, j0Var.f23826l);
    }
}
