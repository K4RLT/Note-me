package pf;
import b0.n;

/* loaded from: classes.dex */
public final class w1 extends uf.q implements Runnable {

    /* renamed from: y, reason: collision with root package name */
    public final long f22804y;

    public w1(long j10, ve.c cVar) {
        super(cVar, cVar.getContext());
        this.f22804y = j10;
    }

    @Override // pf.k1
    public final String Y() {
        return super.Y() + "(timeMillis=" + this.f22804y + ')';
    }

    @Override // java.lang.Runnable
    public final void run() {
        n(this.f22716w);
        u(new v1("Timed out waiting for " + this.f22804y + " ms", this));
    }
}
