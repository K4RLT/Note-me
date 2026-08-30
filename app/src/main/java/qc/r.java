package qc;
import c.b;

/* loaded from: classes.dex */
public final class r implements zc.d {

    /* renamed from: a, reason: collision with root package name */
    public static final r f23913a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final zc.c f23914b = zc.b("processName");

    /* renamed from: c, reason: collision with root package name */
    public static final zc.c f23915c = zc.b("pid");

    /* renamed from: d, reason: collision with root package name */
    public static final zc.c f23916d = zc.b("importance");
    public static final zc.c e = zc.b("defaultProcess");

    @Override // zc.a
    public final void a(Object obj, Object obj2) {
        zc.e eVar = (zc.e) obj2;
        z0 z0Var = (z0) ((b2) obj);
        eVar.a(f23914b, z0Var.f23977a);
        eVar.f(f23915c, z0Var.f23978b);
        eVar.f(f23916d, z0Var.f23979c);
        eVar.g(e, z0Var.f23980d);
    }
}
