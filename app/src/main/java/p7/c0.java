package p7;
import l.a;
import n0.b;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.os.Build;
import android.util.Log;
import androidx.ink.brush.Brush;
import androidx.ink.brush.BrushCoat;
import androidx.ink.brush.BrushPaint;
import androidx.ink.brush.SelfOverlap;
import androidx.ink.rendering.android.canvas.CanvasStrokeRenderer;
import androidx.ink.strokes.Stroke;
import java.util.ArrayDeque;
import java.util.List;

/* loaded from: classes.dex */
public final /* synthetic */ class c0 implements df.l {
    public final /* synthetic */ CanvasStrokeRenderer A;
    public final /* synthetic */ d0 B;
    public final /* synthetic */ ArrayDeque C;
    public final /* synthetic */ a0 D;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ e0 f22435u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Stroke f22436v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ float f22437w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ float f22438x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Bitmap f22439y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ Matrix f22440z;

    public /* synthetic */ c0(e0 e0Var, Stroke stroke, float f10, float f11, Bitmap bitmap, Matrix matrix, CanvasStrokeRenderer canvasStrokeRenderer, d0 d0Var, ArrayDeque arrayDeque, a0 a0Var) {
        this.f22435u = e0Var;
        this.f22436v = stroke;
        this.f22437w = f10;
        this.f22438x = f11;
        this.f22439y = bitmap;
        this.f22440z = matrix;
        this.A = canvasStrokeRenderer;
        this.B = d0Var;
        this.C = arrayDeque;
        this.D = a0Var;
    }

    @Override // df.l
    public final Object invoke(Object obj) {
        boolean z3;
        d0 d0Var;
        ArrayDeque arrayDeque;
        a0 a0Var;
        CanvasStrokeRenderer canvasStrokeRenderer;
        List<BrushPaint> paintPreferences;
        BrushPaint brushPaint;
        e0 e0Var = this.f22435u;
        Stroke stroke = this.f22436v;
        float f10 = this.f22437w;
        float f11 = this.f22438x;
        Bitmap bitmap = this.f22439y;
        Matrix matrix = this.f22440z;
        CanvasStrokeRenderer canvasStrokeRenderer2 = this.A;
        d0 d0Var2 = this.B;
        ArrayDeque arrayDeque2 = this.C;
        a0 a0Var2 = this.D;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        BrushCoat brushCoat = (BrushCoat) qe.l.x(stroke.getBrush().getFamily().getCoats());
        if (brushCoat != null && (paintPreferences = brushCoat.getPaintPreferences()) != null && (brushPaint = (BrushPaint) qe.l.x(paintPreferences)) != null) {
            z3 = kotlin.jvm.internal.a(brushPaint.getSelfOverlap(), SelfOverlap.ACCUMULATE);
        } else {
            z3 = false;
        }
        int i = Build.VERSION.SDK_INT;
        boolean z9 = v.f22585a;
        boolean z10 = v.f22585a;
        a aVar = e0Var.f22451a;
        float f12 = e0Var.f22454d;
        float e = e0Var.e();
        float d2 = m0.d();
        StringBuilder sb2 = new StringBuilder("BAKE hw=");
        sb2.append(booleanValue);
        sb2.append(" accum=");
        sb2.append(z3);
        sb2.append(" sdk=");
        sb2.append(i);
        sb2.append(" hwAvail=");
        sb2.append(z10);
        sb2.append(" brush=");
        sb2.append(aVar);
        sb2.append(" grosorBitmap=");
        sb2.append(f12);
        sb2.append(" grosorVista=");
        a5.a.s(sb2, e, " pagina=", f10, "x");
        a5.a.s(sb2, f11, " bitmap=2048.0x", d2, " escala=");
        sb2.append(2048 / f10);
        Log.d("ScraplyDrawDbg", sb2.toString());
        if (!booleanValue && !bitmap.isRecycled()) {
            if (z3) {
                stroke = stroke.copy(Brush.copy$default(stroke.getBrush(), b(stroke.getBrush().getFamily()), 0.0f, 0.0f, 6, null));
            }
            Canvas canvas = new Canvas(bitmap);
            canvas.save();
            canvas.concat(matrix);
            canvasStrokeRenderer = canvasStrokeRenderer2;
            canvasStrokeRenderer.draw(canvas, stroke, matrix);
            canvas.restore();
            d0Var = d0Var2;
            arrayDeque = arrayDeque2;
            a0Var = a0Var2;
        } else {
            d0Var = d0Var2;
            arrayDeque = arrayDeque2;
            a0Var = a0Var2;
            canvasStrokeRenderer = canvasStrokeRenderer2;
        }
        d0Var.a(arrayDeque, bitmap, matrix, canvasStrokeRenderer, f10, f11, a0Var);
        return pe.z.f22715a;
    }
}
