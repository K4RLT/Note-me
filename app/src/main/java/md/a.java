package md;

import g9.n;
import hc.b;
import hc.c;
import ic.d;
import ic.r;
import java.util.concurrent.Executor;
import pf.b0;

/* loaded from: classes.dex */
public final class a implements d {

    /* renamed from: v, reason: collision with root package name */
    public static final a f20791v = new a(0);

    /* renamed from: w, reason: collision with root package name */
    public static final a f20792w = new a(1);

    /* renamed from: x, reason: collision with root package name */
    public static final a f20793x = new a(2);

    /* renamed from: y, reason: collision with root package name */
    public static final a f20794y = new a(3);

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f20795u;

    public /* synthetic */ a(int i) {
        this.f20795u = i;
    }

    @Override // ic.d
    public final Object e(n nVar) {
        switch (this.f20795u) {
            case 0:
                Object h3 = nVar.h(new r(hc.a.class, Executor.class));
                h3.getClass();
                return b0.m((Executor) h3);
            case 1:
                Object h10 = nVar.h(new r(c.class, Executor.class));
                h10.getClass();
                return b0.m((Executor) h10);
            case 2:
                Object h11 = nVar.h(new r(b.class, Executor.class));
                h11.getClass();
                return b0.m((Executor) h11);
            default:
                Object h12 = nVar.h(new r(hc.d.class, Executor.class));
                h12.getClass();
                return b0.m((Executor) h12);
        }
    }
}
