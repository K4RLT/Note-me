package r6;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes.dex */
public final class m extends e {

    /* renamed from: h, reason: collision with root package name */
    public final PointF f24608h;
    public final PointF i;

    /* renamed from: j, reason: collision with root package name */
    public final f f24609j;

    /* renamed from: k, reason: collision with root package name */
    public final f f24610k;

    public m(f fVar, f fVar2) {
        super(Collections.EMPTY_LIST);
        this.f24608h = new PointF();
        this.i = new PointF();
        this.f24609j = fVar;
        this.f24610k = fVar2;
        g(this.f24588d);
    }

    @Override // r6.e
    public final Object d() {
        PointF pointF = this.f24608h;
        float f10 = pointF.x;
        PointF pointF2 = this.i;
        pointF2.set(f10, 0.0f);
        pointF2.set(pointF2.x, pointF.y);
        return pointF2;
    }

    @Override // r6.e
    public final Object e(b7.a aVar, float f10) {
        PointF pointF = this.f24608h;
        float f11 = pointF.x;
        PointF pointF2 = this.i;
        pointF2.set(f11, 0.0f);
        pointF2.set(pointF2.x, pointF.y);
        return pointF2;
    }

    @Override // r6.e
    public final void g(float f10) {
        f fVar = this.f24609j;
        fVar.g(f10);
        f fVar2 = this.f24610k;
        fVar2.g(f10);
        this.f24608h.set(((Float) fVar.d()).floatValue(), ((Float) fVar2.d()).floatValue());
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f24585a;
            if (i < arrayList.size()) {
                ((a) arrayList.get(i)).a();
                i++;
            } else {
                return;
            }
        }
    }
}
