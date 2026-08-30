package a7;

import android.graphics.Color;
import android.graphics.Matrix;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public float f299a;

    /* renamed from: b, reason: collision with root package name */
    public float f300b;

    /* renamed from: c, reason: collision with root package name */
    public float f301c;

    /* renamed from: d, reason: collision with root package name */
    public int f302d;
    public float[] e = null;

    public b(b bVar) {
        this.f299a = 0.0f;
        this.f300b = 0.0f;
        this.f301c = 0.0f;
        this.f302d = 0;
        this.f299a = bVar.f299a;
        this.f300b = bVar.f300b;
        this.f301c = bVar.f301c;
        this.f302d = bVar.f302d;
    }

    public final void a(int i, p6.a aVar) {
        int alpha = Color.alpha(this.f302d);
        int c10 = g.c(i);
        Matrix matrix = l.f341a;
        int i10 = (int) ((((alpha / 255.0f) * c10) / 255.0f) * 255.0f);
        if (i10 > 0) {
            aVar.setShadowLayer(Math.max(this.f299a, Float.MIN_VALUE), this.f300b, this.f301c, Color.argb(i10, Color.red(this.f302d), Color.green(this.f302d), Color.blue(this.f302d)));
        } else {
            aVar.clearShadowLayer();
        }
    }

    public final void b(int i) {
        this.f302d = Color.argb(Math.round((g.c(i) * Color.alpha(this.f302d)) / 255.0f), Color.red(this.f302d), Color.green(this.f302d), Color.blue(this.f302d));
    }

    public final void c(Matrix matrix) {
        if (this.e == null) {
            this.e = new float[2];
        }
        float[] fArr = this.e;
        fArr[0] = this.f300b;
        fArr[1] = this.f301c;
        matrix.mapVectors(fArr);
        float[] fArr2 = this.e;
        this.f300b = fArr2[0];
        this.f301c = fArr2[1];
        this.f299a = matrix.mapRadius(this.f299a);
    }
}
