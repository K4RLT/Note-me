package vd;
import c.b;

/* loaded from: classes.dex */
public final class g implements zc.d {

    /* renamed from: a, reason: collision with root package name */
    public static final g f27582a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final zc.c f27583b = zc.b("eventType");

    /* renamed from: c, reason: collision with root package name */
    public static final zc.c f27584c = zc.b("sessionData");

    /* renamed from: d, reason: collision with root package name */
    public static final zc.c f27585d = zc.b("applicationInfo");

    @Override // zc.a
    public final void a(Object obj, Object obj2) {
        b0 b0Var = (b0) obj;
        zc.e eVar = (zc.e) obj2;
        b0Var.getClass();
        eVar.a(f27583b, k.SESSION_START);
        eVar.a(f27584c, b0Var.f27548a);
        eVar.a(f27585d, b0Var.f27549b);
    }
}
