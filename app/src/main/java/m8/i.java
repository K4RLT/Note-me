package m8;
import c.b;

/* loaded from: classes.dex */
public final class i implements zc.d {

    /* renamed from: a, reason: collision with root package name */
    public static final i f20704a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final zc.c f20705b = zc.b("eventTimeMs");

    /* renamed from: c, reason: collision with root package name */
    public static final zc.c f20706c = zc.b("eventCode");

    /* renamed from: d, reason: collision with root package name */
    public static final zc.c f20707d = zc.b("complianceData");
    public static final zc.c e = zc.b("eventUptimeMs");

    /* renamed from: f, reason: collision with root package name */
    public static final zc.c f20708f = zc.b("sourceExtension");

    /* renamed from: g, reason: collision with root package name */
    public static final zc.c f20709g = zc.b("sourceExtensionJsonProto3");

    /* renamed from: h, reason: collision with root package name */
    public static final zc.c f20710h = zc.b("timezoneOffsetSeconds");
    public static final zc.c i = zc.b("networkConnectionInfo");

    /* renamed from: j, reason: collision with root package name */
    public static final zc.c f20711j = zc.b("experimentIds");

    @Override // zc.a
    public final void a(Object obj, Object obj2) {
        zc.e eVar = (zc.e) obj2;
        s sVar = (s) ((e0) obj);
        eVar.d(f20705b, sVar.f20741a);
        eVar.a(f20706c, sVar.f20742b);
        eVar.a(f20707d, sVar.f20743c);
        eVar.d(e, sVar.f20744d);
        eVar.a(f20708f, sVar.e);
        eVar.a(f20709g, sVar.f20745f);
        eVar.d(f20710h, sVar.f20746g);
        eVar.a(i, sVar.f20747h);
        eVar.a(f20711j, sVar.i);
    }
}
