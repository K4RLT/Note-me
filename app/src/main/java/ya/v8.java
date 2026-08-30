package ya;
import i1.f;
import g3.a;
import w7.i1;
import zc.c;
import zc.d;
import zc.e;

/* loaded from: classes.dex */
public final class v8 implements d {

    /* renamed from: a, reason: collision with root package name */
    public static final v8 f31538a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final c f31539b = new c("isForegroundConfidenceMaskEnabled", a.p(i1.f(v.class, new r(1))));

    /* renamed from: c, reason: collision with root package name */
    public static final c f31540c = new c("isForegroundBitmapEnabled", a.p(i1.f(v.class, new r(2))));

    /* renamed from: d, reason: collision with root package name */
    public static final c f31541d = new c("isMultipleSubjectsEnabled", a.p(i1.f(v.class, new r(3))));
    public static final c e = new c("isSubjectConfidenceMaskEnabled", a.p(i1.f(v.class, new r(4))));

    /* renamed from: f, reason: collision with root package name */
    public static final c f31542f = new c("isSubjectBitmapEnabled", a.p(i1.f(v.class, new r(5))));

    @Override // a
    public final void a(Object obj, Object obj2) {
        pe peVar = (pe) obj;
        e eVar = (e) obj2;
        eVar.a(f31539b, peVar.f31430a);
        eVar.a(f31540c, peVar.f31431b);
        eVar.a(f31541d, peVar.f31432c);
        eVar.a(e, peVar.f31433d);
        eVar.a(f31542f, peVar.e);
    }
}
