package kb;

/* loaded from: classes.dex */
public abstract class i implements Runnable {

    /* renamed from: u, reason: collision with root package name */
    public final ib.h f19747u;

    public i() {
        this.f19747u = null;
    }

    public abstract void a();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            a();
        } catch (Exception e) {
            ib.h hVar = this.f19747u;
            if (hVar != null) {
                hVar.c(e);
            }
        }
    }

    public i(ib.h hVar) {
        this.f19747u = hVar;
    }
}
