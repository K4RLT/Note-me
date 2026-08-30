package r6;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class k extends i {

    /* renamed from: h, reason: collision with root package name */
    public final PointF f24602h;
    public final float[] i;

    /* renamed from: j, reason: collision with root package name */
    public final float[] f24603j;

    /* renamed from: k, reason: collision with root package name */
    public final PathMeasure f24604k;

    /* renamed from: l, reason: collision with root package name */
    public j f24605l;

    public k(ArrayList arrayList) {
        super(arrayList);
        this.f24602h = new PointF();
        this.i = new float[2];
        this.f24603j = new float[2];
        this.f24604k = new PathMeasure();
    }

    @Override // r6.e
    public final Object e(b7.a aVar, float f10) {
        j jVar = (j) aVar;
        Path path = jVar.f24600q;
        if (path == null) {
            return (PointF) aVar.f1794b;
        }
        j jVar2 = this.f24605l;
        PathMeasure pathMeasure = this.f24604k;
        if (jVar2 != jVar) {
            pathMeasure.setPath(path, false);
            this.f24605l = jVar;
        }
        float length = pathMeasure.getLength();
        float f11 = f10 * length;
        float[] fArr = this.i;
        float[] fArr2 = this.f24603j;
        pathMeasure.getPosTan(f11, fArr, fArr2);
        float f12 = fArr[0];
        float f13 = fArr[1];
        PointF pointF = this.f24602h;
        pointF.set(f12, f13);
        if (f11 < 0.0f) {
            pointF.offset(fArr2[0] * f11, fArr2[1] * f11);
            return pointF;
        }
        if (f11 > length) {
            float f14 = f11 - length;
            pointF.offset(fArr2[0] * f14, fArr2[1] * f14);
        }
        return pointF;
    }
}
