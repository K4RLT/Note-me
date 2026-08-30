package qc;
import c.b;

/* loaded from: classes.dex */
public final class b implements zc.d {

    /* renamed from: a, reason: collision with root package name */
    public static final b f23695a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final zc.c f23696b = zc.c.b("pid");

    /* renamed from: c, reason: collision with root package name */
    public static final zc.c f23697c = zc.c.b("processName");

    /* renamed from: d, reason: collision with root package name */
    public static final zc.c f23698d = zc.c.b("reasonCode");
    public static final zc.c e = zc.c.b("importance");

    /* renamed from: f, reason: collision with root package name */
    public static final zc.c f23699f = zc.c.b("pss");

    /* renamed from: g, reason: collision with root package name */
    public static final zc.c f23700g = zc.c.b("rss");

    /* renamed from: h, reason: collision with root package name */
    public static final zc.c f23701h = zc.c.b("timestamp");
    public static final zc.c i = zc.c.b("traceFile");

    /* renamed from: j, reason: collision with root package name */
    public static final zc.c f23702j = zc.c.b("buildIdMappingForArch");

    @Override // zc.a
    public final void a(Object obj, Object obj2) {
        zc.e eVar = (zc.e) obj2;
        d0 d0Var = (d0) ((o1) obj);
        eVar.f(f23696b, d0Var.f23741a);
        eVar.a(f23697c, d0Var.f23742b);
        eVar.f(f23698d, d0Var.f23743c);
        eVar.f(e, d0Var.f23744d);
        eVar.d(f23699f, d0Var.e);
        eVar.d(f23700g, d0Var.f23745f);
        eVar.d(f23701h, d0Var.f23746g);
        eVar.a(i, d0Var.f23747h);
        eVar.a(f23702j, d0Var.i);
    }
}
