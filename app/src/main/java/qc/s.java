package qc;
import c.b;

/* loaded from: classes.dex */
public final class s implements zc.d {

    /* renamed from: a, reason: collision with root package name */
    public static final s f23921a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final zc.c f23922b = zc.b("batteryLevel");

    /* renamed from: c, reason: collision with root package name */
    public static final zc.c f23923c = zc.b("batteryVelocity");

    /* renamed from: d, reason: collision with root package name */
    public static final zc.c f23924d = zc.b("proximityOn");
    public static final zc.c e = zc.b("orientation");

    /* renamed from: f, reason: collision with root package name */
    public static final zc.c f23925f = zc.b("ramUsed");

    /* renamed from: g, reason: collision with root package name */
    public static final zc.c f23926g = zc.b("diskUsed");

    @Override // zc.a
    public final void a(Object obj, Object obj2) {
        zc.e eVar = (zc.e) obj2;
        b1 b1Var = (b1) ((d2) obj);
        eVar.a(f23922b, b1Var.f23713a);
        eVar.f(f23923c, b1Var.f23714b);
        eVar.g(f23924d, b1Var.f23715c);
        eVar.f(e, b1Var.f23716d);
        eVar.d(f23925f, b1Var.e);
        eVar.d(f23926g, b1Var.f23717f);
    }
}
