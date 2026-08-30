package n8;

/* loaded from: classes.dex */
public final class d implements zc.d {

    /* renamed from: a, reason: collision with root package name */
    public static final d f21163a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final zc.c f21164b = new zc.c("logSource", g3.a.p(g3.a.o(cd.e.class, new cd.a(1))));

    /* renamed from: c, reason: collision with root package name */
    public static final zc.c f21165c = new zc.c("logEventDropped", g3.a.p(g3.a.o(cd.e.class, new cd.a(2))));

    @Override // zc.a
    public final void a(Object obj, Object obj2) {
        q8.e eVar = (q8.e) obj;
        zc.e eVar2 = (zc.e) obj2;
        eVar2.a(f21164b, eVar.f23600a);
        eVar2.a(f21165c, eVar.f23601b);
    }
}
