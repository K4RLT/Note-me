package p;
import q.u;
import r0.l;
import r0.m;
import r0.r;

import android.view.ViewConfiguration;

/* loaded from: classes.dex */
public abstract class u1 {

    /* renamed from: a, reason: collision with root package name */
    public static final float f22268a = ViewConfiguration.getScrollFriction();

    public static final u a(m mVar) {
        r rVar = (r) mVar;
        y2.c cVar = (y2.c) rVar.j(c2.p1.f3606h);
        boolean c10 = rVar.c(cVar.a());
        Object O = rVar.O();
        if (c10 || O == l.f24285a) {
            O = new u(new k6.i(cVar));
            rVar.k0(O);
        }
        return (u) O;
    }
}
