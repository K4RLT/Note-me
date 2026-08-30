package k6;
import q.d;
import q.f;

import java.util.HashMap;

/* loaded from: classes.dex */
public final class u {
    public static final String e = a6.f("WorkTimer");

    /* renamed from: a, reason: collision with root package name */
    public final pd.c f19589a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f19590b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f19591c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final Object f19592d = new Object();

    public u(pd.c cVar) {
        this.f19589a = cVar;
    }

    public final void a(j6.j jVar) {
        synchronized (this.f19592d) {
            try {
                if (((t) this.f19590b.remove(jVar)) != null) {
                    a6.d().a(e, "Stopping timer for " + jVar);
                    this.f19591c.remove(jVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
