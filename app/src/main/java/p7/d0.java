package p7;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.os.Build;
import android.os.Handler;
import android.util.Log;
import androidx.ink.authoring.InProgressStrokeId;
import androidx.ink.authoring.InProgressStrokesFinishedListener;
import androidx.ink.rendering.android.canvas.CanvasStrokeRenderer;
import androidx.ink.strokes.ImmutableStrokeInputBatch;
import androidx.ink.strokes.Stroke;
import androidx.ink.strokes.StrokeInput;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import wa.b9;

/* loaded from: classes.dex */
public final class d0 implements InProgressStrokesFinishedListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e0 f22443a;

    public d0(e0 e0Var) {
        this.f22443a = e0Var;
    }

    public final void a(ArrayDeque arrayDeque, Bitmap bitmap, Matrix matrix, CanvasStrokeRenderer canvasStrokeRenderer, float f10, float f11, a0 a0Var) {
        Stroke stroke = (Stroke) arrayDeque.pollFirst();
        if (stroke == null) {
            a0Var.invoke();
            return;
        }
        boolean z3 = v.f22585a;
        c0 c0Var = new c0(this.f22443a, stroke, f10, f11, bitmap, matrix, canvasStrokeRenderer, this, arrayDeque, a0Var);
        bitmap.getClass();
        if (Build.VERSION.SDK_INT >= 34 && v.f22585a) {
            ((Handler) v.f22588d.getValue()).post(new b6.l(bitmap, stroke, new Matrix(matrix), c0Var, 3));
        } else {
            c0Var.invoke(Boolean.FALSE);
        }
    }

    @Override // androidx.ink.authoring.InProgressStrokesFinishedListener
    public final void onStrokesFinished(Map map) {
        boolean z3;
        float f10;
        float f11;
        boolean z9;
        float f12;
        boolean z10;
        int i;
        a aVar;
        int i10;
        boolean z11;
        float f13;
        map.getClass();
        Log.d("ScraplyDrawDbg", "onStrokesFinished: " + map.size() + " trazo(s), raw=false");
        int size = map.size();
        int i11 = 0;
        while (true) {
            z3 = true;
            if (i11 >= size) {
                break;
            }
            synchronized (f7.b.f16774a) {
                f7.b.f16776c++;
            }
            i11++;
        }
        e0 e0Var = this.f22443a;
        float f14 = e0Var.f22469u;
        float f15 = 1.0f;
        if (f14 < 1.0f) {
            f10 = 1.0f;
        } else {
            f10 = f14;
        }
        float f16 = e0Var.f22470v;
        if (f16 < 1.0f) {
            f11 = 1.0f;
        } else {
            f11 = f16;
        }
        df.l lVar = e0Var.f22459k;
        if (e0Var.f22460l && lVar != m0.f22536b) {
            StrokeInput strokeInput = new StrokeInput();
            for (Map.Entry entry : map.entrySet()) {
                InProgressStrokeId inProgressStrokeId = (InProgressStrokeId) entry.getKey();
                Stroke stroke = (Stroke) entry.getValue();
                v0 v0Var = (v0) this.f22443a.f22467s.remove(inProgressStrokeId);
                ImmutableStrokeInputBatch inputs = stroke.getInputs();
                int size2 = inputs.getSize();
                if (size2 != 0) {
                    float[] fArr = new float[size2];
                    float[] fArr2 = new float[size2];
                    int[] iArr = new int[size2];
                    float[] fArr3 = new float[size2];
                    boolean z12 = z3;
                    int i12 = 0;
                    while (i12 < size2) {
                        inputs.populate(i12, strokeInput);
                        StrokeInput strokeInput2 = strokeInput;
                        float[] fArr4 = fArr3;
                        fArr[i12] = b9.d(strokeInput.getX() / f10, 0.0f, f15);
                        fArr2[i12] = b9.d(strokeInput2.getY() / f11, 0.0f, f15);
                        float f17 = f10;
                        iArr[i12] = (int) strokeInput2.getElapsedTimeMillis();
                        if (strokeInput2.hasPressure()) {
                            f13 = strokeInput2.getPressure();
                        } else {
                            f13 = 1.0f;
                        }
                        fArr4[i12] = f13;
                        i12++;
                        f10 = f17;
                        fArr3 = fArr4;
                        strokeInput = strokeInput2;
                        f15 = 1.0f;
                    }
                    StrokeInput strokeInput3 = strokeInput;
                    float[] fArr5 = fArr3;
                    float f18 = f10;
                    if (v0Var != null) {
                        i = v0Var.f22598a;
                    } else {
                        i = this.f22443a.f22474z;
                    }
                    if (v0Var == null || (aVar = v0Var.f22599b) == null) {
                        aVar = this.f22443a.f22451a;
                    }
                    if (v0Var != null) {
                        i10 = v0Var.f22600c;
                    } else {
                        i10 = this.f22443a.f22452b;
                    }
                    int i13 = i10;
                    float size3 = stroke.getBrush().getSize() / f18;
                    if (v0Var != null) {
                        z11 = v0Var.f22601d;
                    } else {
                        z11 = false;
                    }
                    lVar.invoke(new v7.n(i, aVar, i13, size3, z11, fArr, fArr2, iArr, fArr5));
                    f10 = f18;
                    z3 = z12;
                    strokeInput = strokeInput3;
                    f15 = 1.0f;
                }
            }
            z9 = z3;
            f12 = f10;
        } else {
            z9 = true;
            f12 = f10;
            Set keySet = map.keySet();
            e0 e0Var2 = this.f22443a;
            Iterator it = keySet.iterator();
            while (it.hasNext()) {
                e0Var2.f22467s.remove((InProgressStrokeId) it.next());
            }
        }
        Set U = qe.l.U(map.keySet());
        Set keySet2 = map.keySet();
        e0 e0Var3 = this.f22443a;
        if (!(keySet2 instanceof Collection) || !keySet2.isEmpty()) {
            Iterator it2 = keySet2.iterator();
            while (it2.hasNext()) {
                if (e0Var3.f22466r.remove((InProgressStrokeId) it2.next())) {
                    z10 = z9;
                    break;
                }
            }
        }
        z10 = false;
        e0 e0Var4 = this.f22443a;
        a0 a0Var = new a0(this, U, z10, e0Var4.f22474z);
        if (!e0Var4.f22460l) {
            Matrix matrix = new Matrix();
            float f19 = 2048 / f12;
            matrix.setScale(f19, m0.d() / f11);
            e0 e0Var5 = this.f22443a;
            Bitmap bitmap = (Bitmap) e0Var5.e.invoke(Integer.valueOf(e0Var5.f22474z));
            if (this.f22443a.f22457h != m0.f22535a) {
                StrokeInput strokeInput4 = new StrokeInput();
                Iterator it3 = map.values().iterator();
                float f20 = -3.4028235E38f;
                float f21 = Float.MAX_VALUE;
                float f22 = Float.MAX_VALUE;
                float f23 = -3.4028235E38f;
                while (it3.hasNext()) {
                    ImmutableStrokeInputBatch inputs2 = ((Stroke) it3.next()).getInputs();
                    int size4 = inputs2.getSize();
                    for (int i14 = 0; i14 < size4; i14++) {
                        inputs2.populate(i14, strokeInput4);
                        if (strokeInput4.getX() < f21) {
                            f21 = strokeInput4.getX();
                        }
                        if (strokeInput4.getX() > f20) {
                            f20 = strokeInput4.getX();
                        }
                        if (strokeInput4.getY() < f22) {
                            f22 = strokeInput4.getY();
                        }
                        if (strokeInput4.getY() > f23) {
                            f23 = strokeInput4.getY();
                        }
                    }
                }
                if (f21 <= f20 && f22 <= f23) {
                    float f24 = (this.f22443a.f22465q * 1.5f) + 8.0f;
                    float d2 = m0.d() / f11;
                    e0 e0Var6 = this.f22443a;
                    e0Var6.f22457h.c(Integer.valueOf(e0Var6.f22474z), Integer.valueOf((int) ((f21 - f24) * f19)), Integer.valueOf((int) ((f22 - f24) * d2)), Integer.valueOf(((int) ((f20 + f24) * f19)) + 1), Integer.valueOf(((int) ((f23 + f24) * d2)) + 1));
                }
            }
            float f25 = f12;
            ArrayDeque arrayDeque = new ArrayDeque();
            Iterator it4 = map.values().iterator();
            while (it4.hasNext()) {
                arrayDeque.add((Stroke) it4.next());
            }
            a(arrayDeque, bitmap, matrix, this.f22443a.f22471w, f25, f11, a0Var);
            return;
        }
        a0Var.invoke();
    }
}
