package vd;
import c.b;

import android.os.Build;

/* loaded from: classes.dex */
public final class d implements zc.d {

    /* renamed from: a, reason: collision with root package name */
    public static final d f27558a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final zc.c f27559b = zc.b("appId");

    /* renamed from: c, reason: collision with root package name */
    public static final zc.c f27560c = zc.b("deviceModel");

    /* renamed from: d, reason: collision with root package name */
    public static final zc.c f27561d = zc.b("sessionSdkVersion");
    public static final zc.c e = zc.b("osVersion");

    /* renamed from: f, reason: collision with root package name */
    public static final zc.c f27562f = zc.b("logEnvironment");

    /* renamed from: g, reason: collision with root package name */
    public static final zc.c f27563g = zc.b("androidAppInfo");

    @Override // zc.a
    public final void a(Object obj, Object obj2) {
        b bVar = (b) obj;
        zc.e eVar = (zc.e) obj2;
        eVar.a(f27559b, bVar.f27546a);
        eVar.a(f27560c, Build.MODEL);
        eVar.a(f27561d, "2.0.3");
        eVar.a(e, Build.VERSION.RELEASE);
        eVar.a(f27562f, r.LOG_ENVIRONMENT_PROD);
        eVar.a(f27563g, bVar.f27547b);
    }
}
