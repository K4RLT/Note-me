package m1;

import a0.f0;
import android.graphics.Paint;
import android.graphics.Shader;
import j.i0;
import java.util.ArrayList;
import k1.i;
import k1.l0;
import k1.n;
import k1.n0;
import k1.p;
import k1.r;
import k1.s;
import kotlin.jvm.internal.l;
import pe.u;
import y2.m;

/* loaded from: classes.dex */
public final class b implements d {

    /* renamed from: u, reason: collision with root package name */
    public final a f20423u;

    /* renamed from: v, reason: collision with root package name */
    public final i0 f20424v;

    /* renamed from: w, reason: collision with root package name */
    public f0 f20425w;

    /* renamed from: x, reason: collision with root package name */
    public f0 f20426x;

    /* JADX WARN: Type inference failed for: r0v0, types: [m1.a, java.lang.Object] */
    public b() {
        Object obj = new Object();
        obj.f20419a = c.f20427a;
        obj.f20420b = m.f30814u;
        obj.f20421c = f.f20428a;
        obj.f20422d = 0L;
        this.f20423u = obj;
        this.f20424v = new i0(this);
    }

    public static f0 b(b bVar, long j10, e eVar, float f10, int i) {
        f0 f11 = bVar.f(eVar);
        if (f10 != 1.0f) {
            j10 = r.c(j10, r.d(j10) * f10);
        }
        Paint paint = (Paint) f11.f48c;
        long c10 = l0.c(paint.getColor());
        int i10 = r.f19522m;
        if (!u.a(c10, j10)) {
            f11.H(j10);
        }
        if (((Shader) f11.f49d) != null) {
            f11.L(null);
        }
        if (!l.a((s) f11.e, null)) {
            f11.I(null);
        }
        if (f11.f47b != i) {
            f11.G(i);
        }
        if (paint.isFilterBitmap()) {
            return f11;
        }
        f11.J(1);
        return f11;
    }

    public static f0 d(b bVar, long j10, float f10, int i, i iVar) {
        f0 f0Var = bVar.f20426x;
        if (f0Var == null) {
            f0Var = l0.i();
            f0Var.P(1);
            bVar.f20426x = f0Var;
        }
        Paint paint = (Paint) f0Var.f48c;
        long c10 = l0.c(paint.getColor());
        int i10 = r.f19522m;
        if (!u.a(c10, j10)) {
            f0Var.H(j10);
        }
        if (((Shader) f0Var.f49d) != null) {
            f0Var.L(null);
        }
        if (!l.a((s) f0Var.e, null)) {
            f0Var.I(null);
        }
        if (f0Var.f47b != 3) {
            f0Var.G(3);
        }
        if (paint.getStrokeWidth() != f10) {
            f0Var.O(f10);
        }
        if (paint.getStrokeMiter() != 4.0f) {
            paint.setStrokeMiter(4.0f);
        }
        if (f0Var.y() != i) {
            f0Var.M(i);
        }
        if (f0Var.z() != 0) {
            f0Var.N(0);
        }
        if (!l.a((i) f0Var.f50f, iVar)) {
            f0Var.K(iVar);
        }
        if (paint.isFilterBitmap()) {
            return f0Var;
        }
        f0Var.J(1);
        return f0Var;
    }

    @Override // m1.d
    public final void B(n nVar, long j10, long j11, long j12, float f10, e eVar) {
        int i = (int) (j10 >> 32);
        int i10 = (int) (j10 & 4294967295L);
        this.f20423u.f20421c.c(Float.intBitsToFloat(i), Float.intBitsToFloat(i10), Float.intBitsToFloat((int) (j11 >> 32)) + Float.intBitsToFloat(i), Float.intBitsToFloat((int) (j11 & 4294967295L)) + Float.intBitsToFloat(i10), Float.intBitsToFloat((int) (j12 >> 32)), Float.intBitsToFloat((int) (j12 & 4294967295L)), c(nVar, eVar, f10, null, 3, 1));
    }

    @Override // m1.d
    public final void E0(k1.f fVar, long j10, float f10, s sVar) {
        this.f20423u.f20421c.a(fVar, j10, c(null, g.f20429a, f10, sVar, 3, 1));
    }

    @Override // m1.d
    public final void G(long j10, long j11, long j12, long j13, e eVar) {
        int i = (int) (j11 >> 32);
        int i10 = (int) (j11 & 4294967295L);
        this.f20423u.f20421c.c(Float.intBitsToFloat(i), Float.intBitsToFloat(i10), Float.intBitsToFloat((int) (j12 >> 32)) + Float.intBitsToFloat(i), Float.intBitsToFloat((int) (j12 & 4294967295L)) + Float.intBitsToFloat(i10), Float.intBitsToFloat((int) (j13 >> 32)), Float.intBitsToFloat((int) (j13 & 4294967295L)), b(this, j10, eVar, 1.0f, 3));
    }

    @Override // m1.d
    public final void I(n nVar, long j10, long j11, float f10, int i, float f11, int i10) {
        p pVar = this.f20423u.f20421c;
        f0 f0Var = this.f20426x;
        if (f0Var == null) {
            f0Var = l0.i();
            f0Var.P(1);
            this.f20426x = f0Var;
        }
        Paint paint = (Paint) f0Var.f48c;
        nVar.a(f11, e(), f0Var);
        if (!l.a((s) f0Var.e, null)) {
            f0Var.I(null);
        }
        if (f0Var.f47b != i10) {
            f0Var.G(i10);
        }
        if (paint.getStrokeWidth() != f10) {
            f0Var.O(f10);
        }
        if (paint.getStrokeMiter() != 4.0f) {
            paint.setStrokeMiter(4.0f);
        }
        if (f0Var.y() != i) {
            f0Var.M(i);
        }
        if (f0Var.z() != 0) {
            f0Var.N(0);
        }
        if (!l.a((i) f0Var.f50f, null)) {
            f0Var.K(null);
        }
        if (!paint.isFilterBitmap()) {
            f0Var.J(1);
        }
        pVar.g(j10, j11, f0Var);
    }

    @Override // m1.d
    public final void J0(k1.i0 i0Var, long j10, e eVar) {
        this.f20423u.f20421c.f(i0Var, b(this, j10, eVar, 1.0f, 3));
    }

    @Override // m1.d
    public final void K(long j10, float f10, long j11, e eVar, int i) {
        this.f20423u.f20421c.u(f10, j11, b(this, j10, eVar, 1.0f, i));
    }

    @Override // m1.d
    public final void M(k1.i0 i0Var, n nVar, float f10, e eVar, int i) {
        this.f20423u.f20421c.f(i0Var, c(nVar, eVar, f10, null, i, 1));
    }

    @Override // m1.d
    public final void N(long j10, float f10, float f11, long j11, long j12, e eVar) {
        int i = (int) (j11 >> 32);
        int i10 = (int) (j11 & 4294967295L);
        this.f20423u.f20421c.k(Float.intBitsToFloat(i), Float.intBitsToFloat(i10), Float.intBitsToFloat((int) (j12 >> 32)) + Float.intBitsToFloat(i), Float.intBitsToFloat((int) (j12 & 4294967295L)) + Float.intBitsToFloat(i10), f10, f11, b(this, j10, eVar, 1.0f, 3));
    }

    @Override // m1.d
    public final void S(n nVar, long j10, long j11, float f10, e eVar, int i) {
        int i10 = (int) (j10 >> 32);
        int i11 = (int) (j10 & 4294967295L);
        this.f20423u.f20421c.j(Float.intBitsToFloat(i10), Float.intBitsToFloat(i11), Float.intBitsToFloat((int) (j11 >> 32)) + Float.intBitsToFloat(i10), Float.intBitsToFloat((int) (4294967295L & j11)) + Float.intBitsToFloat(i11), c(nVar, eVar, f10, null, i, 1));
    }

    @Override // m1.d
    public final void T(long j10, long j11, long j12, float f10, int i, i iVar) {
        this.f20423u.f20421c.g(j11, j12, d(this, j10, f10, i, iVar));
    }

    @Override // y2.c
    public final float a() {
        return this.f20423u.f20419a.a();
    }

    public final f0 c(n nVar, e eVar, float f10, s sVar, int i, int i10) {
        f0 f11 = f(eVar);
        if (nVar != null) {
            nVar.a(f10, e(), f11);
        } else {
            Paint paint = (Paint) f11.f48c;
            if (((Shader) f11.f49d) != null) {
                f11.L(null);
            }
            long c10 = l0.c(paint.getColor());
            long j10 = r.f19513b;
            if (!u.a(c10, j10)) {
                f11.H(j10);
            }
            if (paint.getAlpha() / 255.0f != f10) {
                f11.F(f10);
            }
        }
        if (!l.a((s) f11.e, sVar)) {
            f11.I(sVar);
        }
        if (f11.f47b != i) {
            f11.G(i);
        }
        if (((Paint) f11.f48c).isFilterBitmap() == i10) {
            return f11;
        }
        f11.J(i10);
        return f11;
    }

    @Override // m1.d
    public final void c0(k1.f fVar, long j10, long j11, long j12, long j13, float f10, s sVar, int i) {
        this.f20423u.f20421c.b(fVar, j10, j11, j12, j13, c(null, g.f20429a, f10, sVar, 3, i));
    }

    public final f0 f(e eVar) {
        if (l.a(eVar, g.f20429a)) {
            f0 f0Var = this.f20425w;
            if (f0Var == null) {
                f0 i = l0.i();
                i.P(0);
                this.f20425w = i;
                return i;
            }
            return f0Var;
        }
        if (eVar instanceof h) {
            f0 f0Var2 = this.f20426x;
            if (f0Var2 == null) {
                f0Var2 = l0.i();
                f0Var2.P(1);
                this.f20426x = f0Var2;
            }
            Paint paint = (Paint) f0Var2.f48c;
            float strokeWidth = paint.getStrokeWidth();
            h hVar = (h) eVar;
            i iVar = hVar.e;
            float f10 = hVar.f20430a;
            if (strokeWidth != f10) {
                f0Var2.O(f10);
            }
            int y10 = f0Var2.y();
            int i10 = hVar.f20432c;
            if (y10 != i10) {
                f0Var2.M(i10);
            }
            float strokeMiter = paint.getStrokeMiter();
            float f11 = hVar.f20431b;
            if (strokeMiter != f11) {
                paint.setStrokeMiter(f11);
            }
            int z3 = f0Var2.z();
            int i11 = hVar.f20433d;
            if (z3 != i11) {
                f0Var2.N(i11);
            }
            if (!l.a((i) f0Var2.f50f, iVar)) {
                f0Var2.K(iVar);
            }
            return f0Var2;
        }
        l4.a.o();
        return null;
    }

    @Override // m1.d
    public final m getLayoutDirection() {
        return this.f20423u.f20420b;
    }

    @Override // y2.c
    public final float i0() {
        return this.f20423u.f20419a.i0();
    }

    @Override // m1.d
    public final void k0(long j10, long j11, long j12, float f10, e eVar, int i) {
        int i10 = (int) (j11 >> 32);
        int i11 = (int) (j11 & 4294967295L);
        this.f20423u.f20421c.j(Float.intBitsToFloat(i10), Float.intBitsToFloat(i11), Float.intBitsToFloat((int) (j12 >> 32)) + Float.intBitsToFloat(i10), Float.intBitsToFloat((int) (4294967295L & j12)) + Float.intBitsToFloat(i11), b(this, j10, eVar, f10, i));
    }

    @Override // m1.d
    public final void m0(float f10, long j10, ArrayList arrayList) {
        this.f20423u.f20421c.i(arrayList, d(this, j10, f10, 1, null));
    }

    @Override // m1.d
    public final i0 p0() {
        return this.f20424v;
    }

    @Override // m1.d
    public final void s(n0 n0Var, long j10, long j11, e eVar) {
        int i = (int) (j10 >> 32);
        int i10 = (int) (j10 & 4294967295L);
        this.f20423u.f20421c.r(Float.intBitsToFloat(i), Float.intBitsToFloat(i10), Float.intBitsToFloat((int) (j11 >> 32)) + Float.intBitsToFloat(i), Float.intBitsToFloat((int) (j11 & 4294967295L)) + Float.intBitsToFloat(i10), c(n0Var, eVar, 1.0f, null, 3, 1));
    }

    @Override // m1.d
    public final void v0(long j10, long j11, long j12, e eVar) {
        int i = (int) (j11 >> 32);
        int i10 = (int) (j11 & 4294967295L);
        this.f20423u.f20421c.r(Float.intBitsToFloat(i), Float.intBitsToFloat(i10), Float.intBitsToFloat((int) (j12 >> 32)) + Float.intBitsToFloat(i), Float.intBitsToFloat((int) (4294967295L & j12)) + Float.intBitsToFloat(i10), b(this, j10, eVar, 1.0f, 3));
    }

    @Override // m1.d
    public final void w(n nVar, float f10, long j10, float f11, e eVar, int i) {
        this.f20423u.f20421c.u(f10, j10, c(nVar, eVar, f11, null, i, 1));
    }
}