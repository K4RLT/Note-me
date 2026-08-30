package l6;

/* loaded from: classes.dex */
public final class e implements Runnable {

    /* renamed from: u, reason: collision with root package name */
    public final j f19954u;

    /* renamed from: v, reason: collision with root package name */
    public final ac.b f19955v;

    public e(j jVar, ac.b bVar) {
        this.f19954u = jVar;
        this.f19955v = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f19954u.f19962u == this) {
            if (h.f19961z.b(this.f19954u, this, h.f(this.f19955v))) {
                h.c(this.f19954u);
            }
        }
    }
}
