package pf;

/* loaded from: classes.dex */
public abstract class q0 extends v {

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ int f22780z = 0;

    /* renamed from: w, reason: collision with root package name */
    public long f22781w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f22782x;

    /* renamed from: y, reason: collision with root package name */
    public qe.j f22783y;

    public final void a0(boolean z3) {
        long j10;
        long j11 = this.f22781w;
        if (z3) {
            j10 = 4294967296L;
        } else {
            j10 = 1;
        }
        long j12 = j11 - j10;
        this.f22781w = j12;
        if (j12 <= 0 && this.f22782x) {
            shutdown();
        }
    }

    public final void b0(j0 j0Var) {
        qe.j jVar = this.f22783y;
        if (jVar == null) {
            jVar = new qe.j();
            this.f22783y = jVar;
        }
        jVar.addLast(j0Var);
    }

    public final void c0(boolean z3) {
        long j10;
        long j11 = this.f22781w;
        if (z3) {
            j10 = 4294967296L;
        } else {
            j10 = 1;
        }
        this.f22781w = j10 + j11;
        if (!z3) {
            this.f22782x = true;
        }
    }

    public abstract long d0();

    public final boolean e0() {
        j0 j0Var;
        qe.j jVar = this.f22783y;
        if (jVar == null || (j0Var = (j0) jVar.t()) == null) {
            return false;
        }
        j0Var.run();
        return true;
    }

    public abstract void shutdown();
}
