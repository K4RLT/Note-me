package w6;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f27749a;

    /* renamed from: b, reason: collision with root package name */
    public PointF f27750b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f27751c;

    public k(PointF pointF, boolean z3, List list) {
        this.f27750b = pointF;
        this.f27751c = z3;
        this.f27749a = new ArrayList(list);
    }

    public final void a(float f10, float f11) {
        if (this.f27750b == null) {
            this.f27750b = new PointF();
        }
        this.f27750b.set(f10, f11);
    }

    public final String toString() {
        return "ShapeData{numCurves=" + this.f27749a.size() + "closed=" + this.f27751c + '}';
    }

    public k() {
        this.f27749a = new ArrayList();
    }
}
