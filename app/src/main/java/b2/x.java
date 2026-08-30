package b2;
import b.b;
import z1.o0;
import z1.q0;
import z1.r0;
import z1.w;

/* loaded from: classes.dex */
public interface x extends j {
    default int A(r0 r0Var, o0 o0Var, int i) {
        return c(new w(r0Var, r0Var.getLayoutDirection()), new m1(o0Var, o1.f1566v, p1.f1576v, 0), y2.b(i, 0, 13)).getHeight();
    }

    default int J(r0 r0Var, o0 o0Var, int i) {
        return c(new w(r0Var, r0Var.getLayoutDirection()), new m1(o0Var, o1.f1566v, p1.f1575u, 0), y2.b(0, i, 7)).getWidth();
    }

    q0 c(r0 r0Var, o0 o0Var, long j10);

    default int n(r0 r0Var, o0 o0Var, int i) {
        return c(new w(r0Var, r0Var.getLayoutDirection()), new m1(o0Var, o1.f1565u, p1.f1576v, 0), y2.b(i, 0, 13)).getHeight();
    }

    default int v(r0 r0Var, o0 o0Var, int i) {
        return c(new w(r0Var, r0Var.getLayoutDirection()), new m1(o0Var, o1.f1565u, p1.f1575u, 0), y2.b(0, i, 7)).getWidth();
    }
}
