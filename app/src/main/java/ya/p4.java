package ya;
import g3.a;
import w7.i1;
import zc.a;
import zc.c;
import zc.d;
import zc.e;

/* loaded from: classes.dex */
public final class p4 implements d {

    /* renamed from: a, reason: collision with root package name */
    public static final p4 f31422a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final c f31423b = new c("imageFormat", a.p(i1.f(v.class, new r(1))));

    /* renamed from: c, reason: collision with root package name */
    public static final c f31424c = new c("originalImageSize", a.p(i1.f(v.class, new r(2))));

    /* renamed from: d, reason: collision with root package name */
    public static final c f31425d = new c("compressedImageSize", a.p(i1.f(v.class, new r(3))));
    public static final c e = new c("isOdmlImage", a.p(i1.f(v.class, new r(4))));

    @Override // a
    public final void a(Object obj, Object obj2) {
        oa oaVar = (oa) obj;
        e eVar = (e) obj2;
        eVar.a(f31423b, oaVar.f31415a);
        eVar.a(f31424c, oaVar.f31416b);
        eVar.a(f31425d, null);
        eVar.a(e, null);
    }
}
