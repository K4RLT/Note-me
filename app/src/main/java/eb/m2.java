package eb;

/* loaded from: classes.dex */
public final class m2 implements Runnable {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f16240u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ l2 f16241v;

    public /* synthetic */ m2(l2 l2Var, int i) {
        this.f16240u = i;
        this.f16241v = l2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f16240u) {
            case 0:
                l2 l2Var = this.f16241v;
                l2Var.f16224z = l2Var.E;
                return;
            default:
                this.f16241v.E = null;
                return;
        }
    }
}
