package vd;
import c.b;

/* loaded from: classes.dex */
public final class e implements zc.d {

    /* renamed from: a, reason: collision with root package name */
    public static final e f27564a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final zc.c f27565b = zc.b("performance");

    /* renamed from: c, reason: collision with root package name */
    public static final zc.c f27566c = zc.b("crashlytics");

    /* renamed from: d, reason: collision with root package name */
    public static final zc.c f27567d = zc.b("sessionSamplingRate");

    @Override // zc.a
    public final void a(Object obj, Object obj2) {
        j jVar = (j) obj;
        zc.e eVar = (zc.e) obj2;
        eVar.a(f27565b, jVar.f27609a);
        eVar.a(f27566c, jVar.f27610b);
        eVar.e(f27567d, jVar.f27611c);
    }
}
