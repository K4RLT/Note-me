package k1;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import androidx.datastore.preferences.protobuf.s1;

/* loaded from: classes.dex */
public final class h implements i0 {

    /* renamed from: a, reason: collision with root package name */
    public final Path f19481a;

    /* renamed from: b, reason: collision with root package name */
    public RectF f19482b;

    /* renamed from: c, reason: collision with root package name */
    public float[] f19483c;

    /* renamed from: d, reason: collision with root package name */
    public Matrix f19484d;

    public h(Path path) {
        this.f19481a = path;
    }

    public static void m(j1.c cVar) {
        if (!Float.isNaN(cVar.f18763a) && !Float.isNaN(cVar.f18764b) && !Float.isNaN(cVar.f18765c) && !Float.isNaN(cVar.f18766d)) {
            return;
        }
        k.c("Invalid rectangle, make sure no value is NaN");
    }

    public final void c(j1.c cVar, float f10) {
        float f11 = f10 * 57.29578f;
        m(cVar);
        if (this.f19482b == null) {
            this.f19482b = new RectF();
        }
        RectF rectF = this.f19482b;
        rectF.getClass();
        rectF.set(cVar.f18763a, cVar.f18764b, cVar.f18765c, cVar.f18766d);
        RectF rectF2 = this.f19482b;
        rectF2.getClass();
        this.f19481a.addArc(rectF2, 180.0f, f11);
    }

    public final void d() {
        this.f19481a.close();
    }

    public final void e(float f10, float f11, float f12, float f13, float f14, float f15) {
        this.f19481a.cubicTo(f10, f11, f12, f13, f14, f15);
    }

    public final j1.c f() {
        if (this.f19482b == null) {
            this.f19482b = new RectF();
        }
        RectF rectF = this.f19482b;
        rectF.getClass();
        this.f19481a.computeBounds(rectF, true);
        return new j1.c(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    public final void g(float f10, float f11) {
        this.f19481a.lineTo(f10, f11);
    }

    public final void h(float f10, float f11) {
        this.f19481a.moveTo(f10, f11);
    }

    public final boolean i(i0 i0Var, i0 i0Var2, int i) {
        Path.Op op;
        if (i == 0) {
            op = Path.Op.DIFFERENCE;
        } else if (i == 1) {
            op = Path.Op.INTERSECT;
        } else if (i == 4) {
            op = Path.Op.REVERSE_DIFFERENCE;
        } else if (i == 2) {
            op = Path.Op.UNION;
        } else {
            op = Path.Op.XOR;
        }
        if (i0Var instanceof h) {
            Path path = ((h) i0Var).f19481a;
            if (i0Var2 instanceof h) {
                return this.f19481a.op(path, ((h) i0Var2).f19481a, op);
            }
            s1.k("Unable to obtain android.graphics.Path");
            return false;
        }
        s1.k("Unable to obtain android.graphics.Path");
        return false;
    }

    public final void j(float f10, float f11, float f12, float f13) {
        this.f19481a.quadTo(f10, f11, f12, f13);
    }

    public final void k() {
        this.f19481a.reset();
    }

    public final void l(int i) {
        Path.FillType fillType;
        if (i == 1) {
            fillType = Path.FillType.EVEN_ODD;
        } else {
            fillType = Path.FillType.WINDING;
        }
        this.f19481a.setFillType(fillType);
    }
}
