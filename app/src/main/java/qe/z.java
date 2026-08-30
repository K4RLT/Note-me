package qe;

/* loaded from: classes.dex */
public final class z extends b {

    /* renamed from: w, reason: collision with root package name */
    public int f24029w;

    /* renamed from: x, reason: collision with root package name */
    public int f24030x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ a0 f24031y;

    public z(a0 a0Var) {
        this.f24031y = a0Var;
        this.f24029w = a0Var.f24003x;
        this.f24030x = a0Var.f24002w;
    }

    @Override // qe.b
    public final void a() {
        int i = this.f24029w;
        if (i == 0) {
            this.f24004u = 2;
            return;
        }
        a0 a0Var = this.f24031y;
        Object[] objArr = a0Var.f24000u;
        int i10 = this.f24030x;
        this.f24005v = objArr[i10];
        this.f24004u = 1;
        this.f24030x = (i10 + 1) % a0Var.f24001v;
        this.f24029w = i - 1;
    }
}
