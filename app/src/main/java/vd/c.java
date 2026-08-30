package vd;
import c.b;

import android.os.Build;

/* loaded from: classes.dex */
public final class c implements zc.d {

    /* renamed from: a, reason: collision with root package name */
    public static final c f27550a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final zc.c f27551b = zc.b("packageName");

    /* renamed from: c, reason: collision with root package name */
    public static final zc.c f27552c = zc.b("versionName");

    /* renamed from: d, reason: collision with root package name */
    public static final zc.c f27553d = zc.b("appBuildVersion");
    public static final zc.c e = zc.b("deviceManufacturer");

    /* renamed from: f, reason: collision with root package name */
    public static final zc.c f27554f = zc.b("currentProcessDetails");

    /* renamed from: g, reason: collision with root package name */
    public static final zc.c f27555g = zc.b("appProcessDetails");

    @Override // zc.a
    public final void a(Object obj, Object obj2) {
        a aVar = (a) obj;
        zc.e eVar = (zc.e) obj2;
        eVar.a(f27551b, aVar.f27538a);
        eVar.a(f27552c, aVar.f27539b);
        eVar.a(f27553d, aVar.f27540c);
        eVar.a(e, Build.MANUFACTURER);
        eVar.a(f27554f, aVar.f27541d);
        eVar.a(f27555g, aVar.e);
    }
}
