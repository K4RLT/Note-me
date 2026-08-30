package r0;
import b1.j0;

/* loaded from: classes.dex */
public final class f2 extends j0 {

    /* renamed from: c, reason: collision with root package name */
    public float f24251c;

    public f2(long j10, float f10) {
        super(j10);
        this.f24251c = f10;
    }

    @Override // j0
    public final void a(j0 j0Var) {
        j0Var.getClass();
        this.f24251c = ((f2) j0Var).f24251c;
    }

    @Override // j0
    public final j0 b(long j10) {
        return new f2(j10, this.f24251c);
    }
}
