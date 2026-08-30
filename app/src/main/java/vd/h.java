package vd;
import c.b;

/* loaded from: classes.dex */
public final class h implements zc.d {

    /* renamed from: a, reason: collision with root package name */
    public static final h f27587a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final zc.c f27588b = zc.b("sessionId");

    /* renamed from: c, reason: collision with root package name */
    public static final zc.c f27589c = zc.b("firstSessionId");

    /* renamed from: d, reason: collision with root package name */
    public static final zc.c f27590d = zc.b("sessionIndex");
    public static final zc.c e = zc.b("eventTimestampUs");

    /* renamed from: f, reason: collision with root package name */
    public static final zc.c f27591f = zc.b("dataCollectionStatus");

    /* renamed from: g, reason: collision with root package name */
    public static final zc.c f27592g = zc.b("firebaseInstallationId");

    /* renamed from: h, reason: collision with root package name */
    public static final zc.c f27593h = zc.b("firebaseAuthenticationToken");

    @Override // zc.a
    public final void a(Object obj, Object obj2) {
        i0 i0Var = (i0) obj;
        zc.e eVar = (zc.e) obj2;
        eVar.a(f27588b, i0Var.f27603a);
        eVar.a(f27589c, i0Var.f27604b);
        eVar.f(f27590d, i0Var.f27605c);
        eVar.d(e, i0Var.f27606d);
        eVar.a(f27591f, i0Var.e);
        eVar.a(f27592g, i0Var.f27607f);
        eVar.a(f27593h, i0Var.f27608g);
    }
}
