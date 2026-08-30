package rd;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k f24723a;

    public j(k kVar) {
        this.f24723a = kVar;
    }

    public final void a() {
        k kVar = this.f24723a;
        synchronized (kVar) {
            kVar.f24729d = true;
        }
        this.f24723a.g();
    }
}
