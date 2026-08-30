package ne;

import i0.m;
import ya.pf;
import ya.qf;

/* loaded from: classes.dex */
public final class d extends c1.a {

    /* renamed from: w, reason: collision with root package name */
    public final de.f f21317w;

    public d(de.f fVar) {
        super(1);
        this.f21317w = fVar;
    }

    @Override // c1.a
    public final Object i(Object obj) {
        pf a10 = qf.a();
        de.f fVar = this.f21317w;
        return new f(fVar, (me.c) obj, a10, new m(fVar.b()));
    }
}
