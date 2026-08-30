package x6;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import c7.x;
import com.google.android.gms.internal.mlkit_vision_digital_ink.u0;
import java.util.HashMap;
import o6.l;

/* loaded from: classes.dex */
public final class d extends b {
    public final p6.a B;
    public final Rect C;
    public final Rect D;
    public final RectF E;
    public final l F;
    public final r6.g G;
    public a7.j H;
    public x I;

    public d(o6.j jVar, e eVar) {
        super(jVar, eVar);
        l lVar;
        this.B = new p6.a(3, 0);
        this.C = new Rect();
        this.D = new Rect();
        this.E = new RectF();
        String str = eVar.f30120g;
        o6.a aVar = jVar.f21819u;
        if (aVar == null) {
            lVar = null;
        } else {
            lVar = (l) ((HashMap) aVar.c()).get(str);
        }
        this.F = lVar;
        u0 u0Var = this.f30104p.f30136x;
        if (u0Var != null) {
            this.G = new r6.g(this, this, u0Var);
        }
    }

    @Override // x6.b, q6.e
    public final void d(RectF rectF, Matrix matrix, boolean z3) {
        super.d(rectF, matrix, z3);
        if (this.F != null) {
            float c10 = a7.l.c();
            this.f30103o.getClass();
            rectF.set(0.0f, 0.0f, n().getWidth() * c10, n().getHeight() * c10);
            this.f30102n.mapRect(rectF);
        }
    }

    @Override // x6.b
    public final void i(Canvas canvas, Matrix matrix, int i, a7.b bVar) {
        Bitmap n10 = n();
        if (n10 != null && !n10.isRecycled() && this.F != null) {
            float c10 = a7.l.c();
            p6.a aVar = this.B;
            aVar.setAlpha(i);
            r6.g gVar = this.G;
            if (gVar != null) {
                bVar = gVar.b(matrix, i);
            }
            int width = n10.getWidth();
            int height = n10.getHeight();
            Rect rect = this.C;
            boolean z3 = false;
            rect.set(0, 0, width, height);
            this.f30103o.getClass();
            Rect rect2 = this.D;
            rect2.set(0, 0, (int) (n10.getWidth() * c10), (int) (n10.getHeight() * c10));
            if (bVar != null) {
                z3 = true;
            }
            if (z3) {
                if (this.H == null) {
                    this.H = new a7.j();
                }
                if (this.I == null) {
                    this.I = new x(1, (byte) 0);
                }
                x xVar = this.I;
                xVar.f4002v = 255;
                xVar.f4003w = null;
                bVar.getClass();
                a7.b bVar2 = new a7.b(bVar);
                xVar.f4003w = bVar2;
                bVar2.b(i);
                float f10 = rect2.left;
                float f11 = rect2.top;
                float f12 = rect2.right;
                float f13 = rect2.bottom;
                RectF rectF = this.E;
                rectF.set(f10, f11, f12, f13);
                matrix.mapRect(rectF);
                canvas = this.H.e(canvas, rectF, this.I);
            }
            canvas.save();
            canvas.concat(matrix);
            canvas.drawBitmap(n10, rect, rect2, aVar);
            if (z3) {
                this.H.c();
            }
            canvas.restore();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001e, code lost:
    
        if (r4 == r2) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
    
        if (r2 == null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0021, code lost:
    
        r1.f21823y = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0126 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0127  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.Bitmap n() {
        /*
            Method dump skipped, instructions count: 303
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x6.d.n():android.graphics.Bitmap");
    }
}
