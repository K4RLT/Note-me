package r0;
import b1.j0;

/* loaded from: classes.dex */
public final class h2 extends j0 {

    /* renamed from: c, reason: collision with root package name */
    public long f24263c;

    public h2(long j10, long j11) {
        super(j10);
        this.f24263c = j11;
    }

    @Override // j0
    public final void a(j0 j0Var) {
        j0Var.getClass();
        this.f24263c = ((h2) j0Var).f24263c;
    }

    @Override // j0
    public final j0 b(long j10) {
        return new h2(j10, this.f24263c);
    }
}
