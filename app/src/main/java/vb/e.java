package vb;

/* loaded from: classes.dex */
public abstract class e implements Runnable {

    /* renamed from: u, reason: collision with root package name */
    public final ib.h f27514u;

    public e() {
        this.f27514u = null;
    }

    public abstract void a();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            a();
        } catch (Exception e) {
            ib.h hVar = this.f27514u;
            if (hVar != null) {
                hVar.c(e);
            }
        }
    }

    public e(ib.h hVar) {
        this.f27514u = hVar;
    }
}
