package r0;
import b1.j0;

/* loaded from: classes.dex */
public final class g2 extends j0 {

    /* renamed from: c, reason: collision with root package name */
    public int f24257c;

    public g2(long j10, int i) {
        super(j10);
        this.f24257c = i;
    }

    @Override // j0
    public final void a(j0 j0Var) {
        j0Var.getClass();
        this.f24257c = ((g2) j0Var).f24257c;
    }

    @Override // j0
    public final j0 b(long j10) {
        return new g2(j10, this.f24257c);
    }
}
