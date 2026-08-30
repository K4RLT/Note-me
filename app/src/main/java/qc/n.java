package qc;
import c.b;

/* loaded from: classes.dex */
public final class n implements zc.d {

    /* renamed from: a, reason: collision with root package name */
    public static final n f23871a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final zc.c f23872b = zc.b("type");

    /* renamed from: c, reason: collision with root package name */
    public static final zc.c f23873c = zc.b("reason");

    /* renamed from: d, reason: collision with root package name */
    public static final zc.c f23874d = zc.b("frames");
    public static final zc.c e = zc.b("causedBy");

    /* renamed from: f, reason: collision with root package name */
    public static final zc.c f23875f = zc.b("overflowCount");

    @Override // zc.a
    public final void a(Object obj, Object obj2) {
        zc.e eVar = (zc.e) obj2;
        t0 t0Var = (t0) ((w1) obj);
        eVar.a(f23872b, t0Var.f23937a);
        eVar.a(f23873c, t0Var.f23938b);
        eVar.a(f23874d, t0Var.f23939c);
        eVar.a(e, t0Var.f23940d);
        eVar.f(f23875f, t0Var.e);
    }
}
