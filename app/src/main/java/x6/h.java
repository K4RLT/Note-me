package x6;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;

/* loaded from: classes.dex */
public final class h extends b {
    public final RectF B;
    public final p6.a C;
    public final float[] D;
    public final Path E;
    public final e F;

    public h(o6.j jVar, e eVar) {
        super(jVar, eVar);
        this.B = new RectF();
        p6.a aVar = new p6.a();
        this.C = aVar;
        this.D = new float[8];
        this.E = new Path();
        this.F = eVar;
        aVar.setAlpha(0);
        aVar.setStyle(Paint.Style.FILL);
        aVar.setColor(eVar.f30124l);
    }

    @Override // x6.b, q6.e
    public final void d(RectF rectF, Matrix matrix, boolean z3) {
        super.d(rectF, matrix, z3);
        e eVar = this.F;
        float f10 = eVar.f30122j;
        float f11 = eVar.f30123k;
        RectF rectF2 = this.B;
        rectF2.set(0.0f, 0.0f, f10, f11);
        this.f30102n.mapRect(rectF2);
        rectF.set(rectF2);
    }

    @Override // x6.b
    public final void i(Canvas canvas, Matrix matrix, int i, a7.b bVar) {
        int intValue;
        e eVar = this.F;
        int alpha = Color.alpha(eVar.f30124l);
        if (alpha != 0) {
            int i10 = eVar.f30124l;
            p6.a aVar = this.C;
            aVar.setColor(i10);
            r6.f fVar = (r6.f) this.f30111w.f17622k;
            if (fVar == null) {
                intValue = 100;
            } else {
                intValue = ((Integer) fVar.d()).intValue();
            }
            int i11 = (int) ((((alpha / 255.0f) * intValue) / 100.0f) * (i / 255.0f) * 255.0f);
            aVar.setAlpha(i11);
            if (bVar != null) {
                if (Color.alpha(bVar.f302d) > 0) {
                    aVar.setShadowLayer(Math.max(bVar.f299a, Float.MIN_VALUE), bVar.f300b, bVar.f301c, bVar.f302d);
                } else {
                    aVar.clearShadowLayer();
                }
            } else {
                aVar.clearShadowLayer();
            }
            if (i11 > 0) {
                float[] fArr = this.D;
                fArr[0] = 0.0f;
                fArr[1] = 0.0f;
                float f10 = eVar.f30122j;
                fArr[2] = f10;
                fArr[3] = 0.0f;
                fArr[4] = f10;
                float f11 = eVar.f30123k;
                fArr[5] = f11;
                fArr[6] = 0.0f;
                fArr[7] = f11;
                matrix.mapPoints(fArr);
                Path path = this.E;
                path.reset();
                path.moveTo(fArr[0], fArr[1]);
                path.lineTo(fArr[2], fArr[3]);
                path.lineTo(fArr[4], fArr[5]);
                path.lineTo(fArr[6], fArr[7]);
                path.lineTo(fArr[0], fArr[1]);
                path.close();
                canvas.drawPath(path, aVar);
            }
        }
    }
}
