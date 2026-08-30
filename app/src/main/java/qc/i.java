package qc;
import c.b;

/* loaded from: classes.dex */
public final class i implements zc.d {

    /* renamed from: a, reason: collision with root package name */
    public static final i f23786a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final zc.c f23787b = zc.b("arch");

    /* renamed from: c, reason: collision with root package name */
    public static final zc.c f23788c = zc.b("model");

    /* renamed from: d, reason: collision with root package name */
    public static final zc.c f23789d = zc.b("cores");
    public static final zc.c e = zc.b("ram");

    /* renamed from: f, reason: collision with root package name */
    public static final zc.c f23790f = zc.b("diskSpace");

    /* renamed from: g, reason: collision with root package name */
    public static final zc.c f23791g = zc.b("simulator");

    /* renamed from: h, reason: collision with root package name */
    public static final zc.c f23792h = zc.b("state");
    public static final zc.c i = zc.b("manufacturer");

    /* renamed from: j, reason: collision with root package name */
    public static final zc.c f23793j = zc.b("modelClass");

    @Override // zc.a
    public final void a(Object obj, Object obj2) {
        zc.e eVar = (zc.e) obj2;
        n0 n0Var = (n0) ((u1) obj);
        eVar.f(f23787b, n0Var.f23876a);
        eVar.a(f23788c, n0Var.f23877b);
        eVar.f(f23789d, n0Var.f23878c);
        eVar.d(e, n0Var.f23879d);
        eVar.d(f23790f, n0Var.e);
        eVar.g(f23791g, n0Var.f23880f);
        eVar.f(f23792h, n0Var.f23881g);
        eVar.a(i, n0Var.f23882h);
        eVar.a(f23793j, n0Var.i);
    }
}
