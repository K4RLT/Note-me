package bc;

import g9.n;
import ic.r;
import java.util.concurrent.Executor;
import pf.b0;

/* loaded from: classes.dex */
public final class h implements ic.d {

    /* renamed from: v, reason: collision with root package name */
    public static final h f3185v = new h(0);

    /* renamed from: w, reason: collision with root package name */
    public static final h f3186w = new h(1);

    /* renamed from: x, reason: collision with root package name */
    public static final h f3187x = new h(2);

    /* renamed from: y, reason: collision with root package name */
    public static final h f3188y = new h(3);

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f3189u;

    public /* synthetic */ h(int i) {
        this.f3189u = i;
    }

    @Override // ic.d
    public final Object e(n nVar) {
        switch (this.f3189u) {
            case 0:
                Object h3 = nVar.h(new r(hc.a.class, Executor.class));
                h3.getClass();
                return b0.m((Executor) h3);
            case 1:
                Object h10 = nVar.h(new r(hc.c.class, Executor.class));
                h10.getClass();
                return b0.m((Executor) h10);
            case 2:
                Object h11 = nVar.h(new r(hc.b.class, Executor.class));
                h11.getClass();
                return b0.m((Executor) h11);
            default:
                Object h12 = nVar.h(new r(hc.d.class, Executor.class));
                h12.getClass();
                return b0.m((Executor) h12);
        }
    }
}
