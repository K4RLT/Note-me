package k1;
import l.a;
import t0.a;
import u.a;

/* loaded from: classes.dex */
public final class m0 implements y2.c {
    public float A;
    public long B;
    public long C;
    public float D;
    public float E;
    public long F;
    public p0 G;
    public boolean H;
    public long I;
    public y2.c J;
    public y2.m K;
    public int L;
    public l0 M;

    /* renamed from: u, reason: collision with root package name */
    public int f19499u;

    /* renamed from: v, reason: collision with root package name */
    public float f19500v;

    /* renamed from: w, reason: collision with root package name */
    public float f19501w;

    /* renamed from: x, reason: collision with root package name */
    public float f19502x;

    /* renamed from: y, reason: collision with root package name */
    public float f19503y;

    /* renamed from: z, reason: collision with root package name */
    public float f19504z;

    @Override // y2.c
    public final float a() {
        return this.J.a();
    }

    public final void b(float f10) {
        if (this.f19502x == f10) {
            return;
        }
        this.f19499u |= 4;
        this.f19502x = f10;
    }

    public final void c(long j10) {
        long j11 = this.B;
        int i = r.f19522m;
        if (!pe.a(j11, j10)) {
            this.f19499u |= 64;
            this.B = j10;
        }
    }

    public final void d(float f10) {
        if (this.E == f10) {
            return;
        }
        this.f19499u |= 2048;
        this.E = f10;
    }

    public final void f(boolean z3) {
        if (this.H != z3) {
            this.f19499u |= 16384;
            this.H = z3;
        }
    }

    public final void g(float f10) {
        if (this.D == f10) {
            return;
        }
        this.f19499u |= 1024;
        this.D = f10;
    }

    public final void h(float f10) {
        if (this.f19500v == f10) {
            return;
        }
        this.f19499u |= 1;
        this.f19500v = f10;
    }

    public final void i(float f10) {
        if (this.f19501w == f10) {
            return;
        }
        this.f19499u |= 2;
        this.f19501w = f10;
    }

    @Override // y2.c
    public final float i0() {
        return this.J.i0();
    }

    public final void j(float f10) {
        if (this.A == f10) {
            return;
        }
        this.f19499u |= 32;
        this.A = f10;
    }

    public final void k(p0 p0Var) {
        if (!kotlin.jvm.internal.a(this.G, p0Var)) {
            this.f19499u |= 8192;
            this.G = p0Var;
        }
    }

    public final void l(long j10) {
        long j11 = this.C;
        int i = r.f19522m;
        if (!pe.a(j11, j10)) {
            this.f19499u |= 128;
            this.C = j10;
        }
    }

    public final void m(long j10) {
        if (!a(this.F, j10)) {
            this.f19499u |= 4096;
            this.F = j10;
        }
    }

    public final void n(float f10) {
        if (this.f19503y == f10) {
            return;
        }
        this.f19499u |= 8;
        this.f19503y = f10;
    }

    public final void r(float f10) {
        if (this.f19504z == f10) {
            return;
        }
        this.f19499u |= 16;
        this.f19504z = f10;
    }
}
