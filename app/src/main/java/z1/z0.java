package z1;
import j.c;

/* loaded from: classes.dex */
public abstract class z0 implements y2.c {

    /* renamed from: u */
    public boolean f31904u;

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(z0 z0Var, a1 a1Var) {
        z0Var.getClass();
        if (a1Var instanceof b2.c1) {
            ((b2.c1) a1Var).O(z0Var.f31904u);
        }
    }

    public static /* synthetic */ void i(z0 z0Var, a1 a1Var, int i, int i10) {
        z0Var.h(a1Var, i, i10, 0.0f);
    }

    public static void j(z0 z0Var, a1 a1Var, long j10) {
        z0Var.getClass();
        b(z0Var, a1Var);
        a1Var.r0(y2.c(j10, a1Var.f31773y), 0.0f, null);
    }

    public static void k(z0 z0Var, a1 a1Var, int i, int i10) {
        long j10 = (i << 32) | (i10 & 4294967295L);
        if (z0Var.f() != y2.m.f30814u && z0Var.g() != 0) {
            int g8 = (z0Var.g() - a1Var.f31769u) - ((int) (j10 >> 32));
            b(z0Var, a1Var);
            a1Var.r0(y2.c((g8 << 32) | (((int) (j10 & 4294967295L)) & 4294967295L), a1Var.f31773y), 0.0f, null);
        } else {
            b(z0Var, a1Var);
            a1Var.r0(y2.c(j10, a1Var.f31773y), 0.0f, null);
        }
    }

    public static void l(z0 z0Var, a1 a1Var, int i, int i10) {
        int i11 = c1.f31789b;
        b1 b1Var = b1.f31777v;
        long j10 = (i << 32) | (i10 & 4294967295L);
        if (z0Var.f() != y2.m.f30814u && z0Var.g() != 0) {
            int g8 = (z0Var.g() - a1Var.f31769u) - ((int) (j10 >> 32));
            b(z0Var, a1Var);
            a1Var.r0(y2.c((g8 << 32) | (((int) (j10 & 4294967295L)) & 4294967295L), a1Var.f31773y), 0.0f, b1Var);
        } else {
            b(z0Var, a1Var);
            a1Var.r0(y2.c(j10, a1Var.f31773y), 0.0f, b1Var);
        }
    }

    public static void m(z0 z0Var, a1 a1Var, long j10) {
        int i = c1.f31789b;
        b1 b1Var = b1.f31777v;
        if (z0Var.f() != y2.m.f30814u && z0Var.g() != 0) {
            int g8 = (z0Var.g() - a1Var.f31769u) - ((int) (j10 >> 32));
            b(z0Var, a1Var);
            a1Var.r0(y2.c((((int) (j10 & 4294967295L)) & 4294967295L) | (g8 << 32), a1Var.f31773y), 0.0f, b1Var);
            return;
        }
        b(z0Var, a1Var);
        a1Var.r0(y2.c(j10, a1Var.f31773y), 0.0f, b1Var);
    }

    public static void n(z0 z0Var, a1 a1Var, int i, int i10, df.l lVar, int i11) {
        if ((i11 & 8) != 0) {
            int i12 = c1.f31789b;
            lVar = b1.f31777v;
        }
        z0Var.getClass();
        b(z0Var, a1Var);
        a1Var.r0(y2.c((i10 & 4294967295L) | (i << 32), a1Var.f31773y), 0.0f, lVar);
    }

    public static void r(z0 z0Var, a1 a1Var, long j10) {
        int i = c1.f31789b;
        b1 b1Var = b1.f31777v;
        z0Var.getClass();
        b(z0Var, a1Var);
        a1Var.r0(y2.c(j10, a1Var.f31773y), 0.0f, b1Var);
    }

    public float c(q qVar) {
        return Float.NaN;
    }

    public abstract x d();

    public abstract y2.m f();

    public abstract int g();

    public final void h(a1 a1Var, int i, int i10, float f10) {
        b(this, a1Var);
        a1Var.r0(y2.c((i10 & 4294967295L) | (i << 32), a1Var.f31773y), f10, null);
    }
}
