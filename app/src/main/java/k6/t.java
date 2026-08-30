package k6;
import q.d;

/* loaded from: classes.dex */
public final class t implements Runnable {

    /* renamed from: u, reason: collision with root package name */
    public final u f19587u;

    /* renamed from: v, reason: collision with root package name */
    public final j6.j f19588v;

    public t(u uVar, j6.j jVar) {
        this.f19587u = uVar;
        this.f19588v = jVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f19587u.f19592d) {
            try {
                if (((t) this.f19587u.f19590b.remove(this.f19588v)) != null) {
                    d6.g gVar = (d6.g) this.f19587u.f19591c.remove(this.f19588v);
                    if (gVar != null) {
                        j6.j jVar = this.f19588v;
                        a6.d().a(d6.g.I, "Exceeded time limits on execution for " + jVar);
                        gVar.B.execute(new d6.f(gVar, 0));
                    }
                } else {
                    a6.d().a("WrkTimerRunnable", "Timer with " + this.f19588v + " is already marked as complete.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
