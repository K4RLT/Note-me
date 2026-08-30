package n8;

/* loaded from: classes.dex */
public final class f implements zc.d {

    /* renamed from: a, reason: collision with root package name */
    public static final f f21167a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final zc.c f21168b = new zc.c("currentCacheSizeBytes", g3.a.p(g3.a.o(cd.e.class, new cd.a(1))));

    /* renamed from: c, reason: collision with root package name */
    public static final zc.c f21169c = new zc.c("maxCacheSizeBytes", g3.a.p(g3.a.o(cd.e.class, new cd.a(2))));

    @Override // zc.a
    public final void a(Object obj, Object obj2) {
        q8.f fVar = (q8.f) obj;
        zc.e eVar = (zc.e) obj2;
        eVar.d(f21168b, fVar.f23602a);
        eVar.d(f21169c, fVar.f23603b);
    }
}
