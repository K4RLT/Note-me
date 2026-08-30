package vd;
import c.b;

/* loaded from: classes.dex */
public final class f implements zc.d {

    /* renamed from: a, reason: collision with root package name */
    public static final f f27572a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final zc.c f27573b = zc.b("processName");

    /* renamed from: c, reason: collision with root package name */
    public static final zc.c f27574c = zc.b("pid");

    /* renamed from: d, reason: collision with root package name */
    public static final zc.c f27575d = zc.b("importance");
    public static final zc.c e = zc.b("defaultProcess");

    @Override // zc.a
    public final void a(Object obj, Object obj2) {
        s sVar = (s) obj;
        zc.e eVar = (zc.e) obj2;
        eVar.a(f27573b, sVar.f27637a);
        eVar.f(f27574c, sVar.f27638b);
        eVar.f(f27575d, sVar.f27639c);
        eVar.g(e, sVar.f27640d);
    }
}
