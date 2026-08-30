package gg;

import c7.f0;
import c7.x;

/* loaded from: classes.dex */
public final class g extends f0 {

    /* renamed from: w, reason: collision with root package name */
    public final fg.c f17768w;

    /* renamed from: x, reason: collision with root package name */
    public int f17769x;

    public g(x xVar, fg.c cVar) {
        super(xVar);
        this.f17768w = cVar;
    }

    @Override // c7.f0
    public final void b() {
        this.f3949u = true;
        this.f17769x++;
    }

    @Override // c7.f0
    public final void c() {
        this.f3949u = false;
        x xVar = (x) this.f3950v;
        xVar.m("\n");
        int i = this.f17769x;
        for (int i10 = 0; i10 < i; i10++) {
            String str = this.f17768w.f16965a.e;
            str.getClass();
            xVar.m(str);
        }
    }

    @Override // c7.f0
    public final void d() {
        if (this.f3949u) {
            this.f3949u = false;
        } else {
            c();
        }
    }

    @Override // c7.f0
    public final void m() {
        f(' ');
    }

    @Override // c7.f0
    public final void n() {
        this.f17769x--;
    }
}
