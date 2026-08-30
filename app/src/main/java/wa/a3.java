package wa;
import g3.a;
import w7.i1;

/* loaded from: classes.dex */
public final class a3 implements zc.d {

    /* renamed from: a, reason: collision with root package name */
    public static final a3 f29560a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final zc.c f29561b = new zc.c("durationMs", a.p(i1.e(d.class, new a(1))));

    /* renamed from: c, reason: collision with root package name */
    public static final zc.c f29562c = new zc.c("imageSource", a.p(i1.e(d.class, new a(2))));

    /* renamed from: d, reason: collision with root package name */
    public static final zc.c f29563d = new zc.c("imageFormat", a.p(i1.e(d.class, new a(3))));
    public static final zc.c e = new zc.c("imageByteSize", a.p(i1.e(d.class, new a(4))));

    /* renamed from: f, reason: collision with root package name */
    public static final zc.c f29564f = new zc.c("imageWidth", a.p(i1.e(d.class, new a(5))));

    /* renamed from: g, reason: collision with root package name */
    public static final zc.c f29565g = new zc.c("imageHeight", a.p(i1.e(d.class, new a(6))));

    /* renamed from: h, reason: collision with root package name */
    public static final zc.c f29566h = new zc.c("rotationDegrees", a.p(i1.e(d.class, new a(7))));

    @Override // zc.a
    public final void a(Object obj, Object obj2) {
        c7 c7Var = (c7) obj;
        zc.e eVar = (zc.e) obj2;
        eVar.a(f29561b, c7Var.f29586a);
        eVar.a(f29562c, c7Var.f29587b);
        eVar.a(f29563d, c7Var.f29588c);
        eVar.a(e, c7Var.f29589d);
        eVar.a(f29564f, c7Var.e);
        eVar.a(f29565g, c7Var.f29590f);
        eVar.a(f29566h, c7Var.f29591g);
    }
}
