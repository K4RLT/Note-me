package sf;

/* loaded from: classes.dex */
public final class f0 extends tf.d {

    /* renamed from: a, reason: collision with root package name */
    public long f25169a;

    /* renamed from: b, reason: collision with root package name */
    public pf.l f25170b;

    @Override // tf.d
    public final boolean a(tf.b bVar) {
        d0 d0Var = (d0) bVar;
        if (this.f25169a >= 0) {
            return false;
        }
        long j10 = d0Var.C;
        if (j10 < d0Var.D) {
            d0Var.D = j10;
        }
        this.f25169a = j10;
        return true;
    }

    @Override // tf.d
    public final te.c[] b(tf.b bVar) {
        long j10 = this.f25169a;
        this.f25169a = -1L;
        this.f25170b = null;
        return ((d0) bVar).v(j10);
    }
}
