package c4;

import fa.l0;

/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public int f3833a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f3834b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f3835c;

    public g(j jVar) {
        this.f3833a = 0;
        this.f3835c = new d();
        this.f3834b = jVar;
    }

    public abstract void a(p5.a aVar);

    public abstract void b(p5.a aVar);

    public abstract void c(p5.a aVar);

    public abstract void d(p5.a aVar);

    public abstract void e(p5.a aVar);

    public abstract void f(p5.a aVar);

    public abstract l0 g(p5.a aVar);

    public g(String str, int i, String str2) {
        this.f3833a = i;
        this.f3834b = str;
        this.f3835c = str2;
    }
}
