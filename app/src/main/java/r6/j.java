package r6;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;

/* loaded from: classes.dex */
public final class j extends b7.a {

    /* renamed from: q, reason: collision with root package name */
    public Path f24600q;

    /* renamed from: r, reason: collision with root package name */
    public final b7.a f24601r;

    public j(o6.a aVar, b7.a aVar2) {
        super(aVar, (PointF) aVar2.f1794b, (PointF) aVar2.f1795c, aVar2.f1796d, aVar2.e, aVar2.f1797f, aVar2.f1798g, aVar2.f1799h);
        this.f24601r = aVar2;
        d();
    }

    public final void d() {
        boolean z3;
        Object obj;
        Object obj2 = this.f1795c;
        Object obj3 = this.f1794b;
        if (obj2 != null && obj3 != null) {
            PointF pointF = (PointF) obj2;
            if (((PointF) obj3).equals(pointF.x, pointF.y)) {
                z3 = true;
                if (obj3 == null && (obj = this.f1795c) != null && !z3) {
                    PointF pointF2 = (PointF) obj3;
                    PointF pointF3 = (PointF) obj;
                    b7.a aVar = this.f24601r;
                    PointF pointF4 = aVar.f1805o;
                    PointF pointF5 = aVar.f1806p;
                    Matrix matrix = a7.l.f341a;
                    Path path = new Path();
                    path.moveTo(pointF2.x, pointF2.y);
                    if (pointF4 != null && pointF5 != null && (pointF4.length() != 0.0f || pointF5.length() != 0.0f)) {
                        float f10 = pointF4.x + pointF2.x;
                        float f11 = pointF2.y + pointF4.y;
                        float f12 = pointF3.x;
                        float f13 = f12 + pointF5.x;
                        float f14 = pointF3.y;
                        path.cubicTo(f10, f11, f13, f14 + pointF5.y, f12, f14);
                    } else {
                        path.lineTo(pointF3.x, pointF3.y);
                    }
                    this.f24600q = path;
                    return;
                }
                return;
            }
        }
        z3 = false;
        if (obj3 == null) {
        }
    }
}
