package k1;
import a0.f0;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.Region;
import androidx.datastore.preferences.protobuf.s1;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class a implements p {

    /* renamed from: a, reason: collision with root package name */
    public Canvas f19463a = b.f19467a;

    /* renamed from: b, reason: collision with root package name */
    public Rect f19464b;

    /* renamed from: c, reason: collision with root package name */
    public Rect f19465c;

    @Override // k1.p
    public final void a(f fVar, long j10, f0 f0Var) {
        this.f19463a.drawBitmap(l0.m(fVar), Float.intBitsToFloat((int) (j10 >> 32)), Float.intBitsToFloat((int) (j10 & 4294967295L)), (Paint) f0Var.f48c);
    }

    @Override // k1.p
    public final void b(f fVar, long j10, long j11, long j12, long j13, f0 f0Var) {
        if (this.f19464b == null) {
            this.f19464b = new Rect();
            this.f19465c = new Rect();
        }
        Canvas canvas = this.f19463a;
        Bitmap m4 = l0.m(fVar);
        Rect rect = this.f19464b;
        rect.getClass();
        int i = (int) (j10 >> 32);
        rect.left = i;
        int i10 = (int) (j10 & 4294967295L);
        rect.top = i10;
        rect.right = i + ((int) (j11 >> 32));
        rect.bottom = i10 + ((int) (j11 & 4294967295L));
        Rect rect2 = this.f19465c;
        rect2.getClass();
        int i11 = (int) (j12 >> 32);
        rect2.left = i11;
        int i12 = (int) (j12 & 4294967295L);
        rect2.top = i12;
        rect2.right = i11 + ((int) (j13 >> 32));
        rect2.bottom = i12 + ((int) (j13 & 4294967295L));
        canvas.drawBitmap(m4, rect, rect2, (Paint) f0Var.f48c);
    }

    @Override // k1.p
    public final void c(float f10, float f11, float f12, float f13, float f14, float f15, f0 f0Var) {
        this.f19463a.drawRoundRect(f10, f11, f12, f13, f14, f15, (Paint) f0Var.f48c);
    }

    @Override // k1.p
    public final void d(float f10, float f11) {
        this.f19463a.scale(f10, f11);
    }

    @Override // k1.p
    public final void e(j1.c cVar, f0 f0Var) {
        this.f19463a.saveLayer(cVar.f18763a, cVar.f18764b, cVar.f18765c, cVar.f18766d, (Paint) f0Var.f48c, 31);
    }

    @Override // k1.p
    public final void f(i0 i0Var, f0 f0Var) {
        Canvas canvas = this.f19463a;
        if (i0Var instanceof h) {
            canvas.drawPath(((h) i0Var).f19481a, (Paint) f0Var.f48c);
        } else {
            s1.k("Unable to obtain android.graphics.Path");
        }
    }

    @Override // k1.p
    public final void g(long j10, long j11, f0 f0Var) {
        this.f19463a.drawLine(Float.intBitsToFloat((int) (j10 >> 32)), Float.intBitsToFloat((int) (j10 & 4294967295L)), Float.intBitsToFloat((int) (j11 >> 32)), Float.intBitsToFloat((int) (j11 & 4294967295L)), (Paint) f0Var.f48c);
    }

    @Override // k1.p
    public final void h(float f10) {
        this.f19463a.rotate(f10);
    }

    @Override // k1.p
    public final void i(ArrayList arrayList, f0 f0Var) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            long j10 = ((j1.b) arrayList.get(i)).f18762a;
            this.f19463a.drawPoint(Float.intBitsToFloat((int) (j10 >> 32)), Float.intBitsToFloat((int) (j10 & 4294967295L)), (Paint) f0Var.f48c);
        }
    }

    @Override // k1.p
    public final void j(float f10, float f11, float f12, float f13, f0 f0Var) {
        this.f19463a.drawRect(f10, f11, f12, f13, (Paint) f0Var.f48c);
    }

    @Override // k1.p
    public final void k(float f10, float f11, float f12, float f13, float f14, float f15, f0 f0Var) {
        this.f19463a.drawArc(f10, f11, f12, f13, f14, f15, false, (Paint) f0Var.f48c);
    }

    @Override // k1.p
    public final void l() {
        this.f19463a.save();
    }

    @Override // k1.p
    public final void m() {
        l0.q(this.f19463a, false);
    }

    @Override // k1.p
    public final void n(float[] fArr) {
        if (!l0.s(fArr)) {
            Matrix matrix = new Matrix();
            l0.x(matrix, fArr);
            this.f19463a.concat(matrix);
        }
    }

    @Override // k1.p
    public final void o(i0 i0Var, int i) {
        Region.Op op;
        Canvas canvas = this.f19463a;
        if (i0Var instanceof h) {
            Path path = ((h) i0Var).f19481a;
            if (i == 0) {
                op = Region.Op.DIFFERENCE;
            } else {
                op = Region.Op.INTERSECT;
            }
            canvas.clipPath(path, op);
            return;
        }
        s1.k("Unable to obtain android.graphics.Path");
    }

    @Override // k1.p
    public final void p(float f10, float f11, float f12, float f13, int i) {
        Region.Op op;
        Canvas canvas = this.f19463a;
        if (i == 0) {
            op = Region.Op.DIFFERENCE;
        } else {
            op = Region.Op.INTERSECT;
        }
        canvas.clipRect(f10, f11, f12, f13, op);
    }

    @Override // k1.p
    public final void q(float f10, float f11) {
        this.f19463a.translate(f10, f11);
    }

    @Override // k1.p
    public final void r(float f10, float f11, float f12, float f13, f0 f0Var) {
        this.f19463a.drawOval(f10, f11, f12, f13, (Paint) f0Var.f48c);
    }

    @Override // k1.p
    public final void s() {
        this.f19463a.restore();
    }

    @Override // k1.p
    public final void u(float f10, long j10, f0 f0Var) {
        this.f19463a.drawCircle(Float.intBitsToFloat((int) (j10 >> 32)), Float.intBitsToFloat((int) (j10 & 4294967295L)), f10, (Paint) f0Var.f48c);
    }

    @Override // k1.p
    public final void v() {
        l0.q(this.f19463a, true);
    }
}
