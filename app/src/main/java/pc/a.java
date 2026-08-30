package pc;
import c.b;

/* loaded from: classes.dex */
public final class a implements zc.d {

    /* renamed from: a, reason: collision with root package name */
    public static final a f22643a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final zc.c f22644b = zc.b("rolloutId");

    /* renamed from: c, reason: collision with root package name */
    public static final zc.c f22645c = zc.b("parameterKey");

    /* renamed from: d, reason: collision with root package name */
    public static final zc.c f22646d = zc.b("parameterValue");
    public static final zc.c e = zc.b("variantId");

    /* renamed from: f, reason: collision with root package name */
    public static final zc.c f22647f = zc.b("templateVersion");

    @Override // zc.a
    public final void a(Object obj, Object obj2) {
        zc.e eVar = (zc.e) obj2;
        b bVar = (b) ((m) obj);
        eVar.a(f22644b, bVar.f22648b);
        eVar.a(f22645c, bVar.f22649c);
        eVar.a(f22646d, bVar.f22650d);
        eVar.a(e, bVar.e);
        eVar.d(f22647f, bVar.f22651f);
    }
}
