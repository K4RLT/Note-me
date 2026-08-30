package c0;

import r0.f1;

/* loaded from: classes.dex */
public final class h0 extends kotlin.jvm.internal.m implements df.a {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f3327u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ i0 f3328v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h0(i0 i0Var, int i) {
        super(0);
        this.f3327u = i;
        this.f3328v = i0Var;
    }

    @Override // df.a
    public final Object invoke() {
        int j10;
        int j11;
        switch (this.f3327u) {
            case 0:
                i0 i0Var = this.f3328v;
                if (i0Var.f3340k.a()) {
                    j10 = i0Var.f3349t.h();
                } else {
                    j10 = i0Var.j();
                }
                return Integer.valueOf(j10);
            default:
                i0 i0Var2 = this.f3328v;
                boolean a10 = i0Var2.f3340k.a();
                f1 f1Var = i0Var2.f3348s;
                if (!a10) {
                    j11 = i0Var2.j();
                } else if (f1Var.h() != -1) {
                    j11 = f1Var.h();
                } else if (Math.abs(i0Var2.k()) >= Math.abs(Math.min(i0Var2.f3346q.l0(m0.f3374a), i0Var2.n() / 2.0f) / i0Var2.n())) {
                    boolean booleanValue = ((Boolean) i0Var2.G.getValue()).booleanValue();
                    int i = i0Var2.e;
                    if (booleanValue) {
                        j11 = i + 1;
                    } else {
                        j11 = i;
                    }
                } else {
                    j11 = i0Var2.j();
                }
                return Integer.valueOf(i0Var2.i(j11));
        }
    }
}
