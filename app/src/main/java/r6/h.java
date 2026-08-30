package r6;
import f.c;

import android.graphics.PointF;
import java.util.List;
import q.x;

/* loaded from: classes.dex */
public final class h extends i {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f24599h;
    public final Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(int i, List list) {
        super(list);
        this.f24599h = i;
        switch (i) {
            case 1:
                super(list);
                this.i = new PointF();
                return;
            case 2:
                super(list);
                this.i = new b7.b(1.0f, 1.0f);
                return;
            default:
                int i10 = 0;
                for (int i11 = 0; i11 < list.size(); i11++) {
                    w6.c cVar = (w6.c) ((b7.a) list.get(i11)).f1794b;
                    if (cVar != null) {
                        i10 = Math.max(i10, cVar.f27713b.length);
                    }
                }
                this.i = new w6.c(new float[i10], new int[i10]);
                return;
        }
    }

    @Override // r6.e
    public final Object e(b7.a aVar, float f10) {
        Object obj;
        switch (this.f24599h) {
            case 0:
                w6.c cVar = (w6.c) this.i;
                w6.c cVar2 = (w6.c) aVar.f1794b;
                w6.c cVar3 = (w6.c) aVar.f1795c;
                int[] iArr = cVar.f27713b;
                float[] fArr = cVar.f27712a;
                boolean equals = cVar2.equals(cVar3);
                int[] iArr2 = cVar2.f27713b;
                if (equals) {
                    cVar.a(cVar2);
                    return cVar;
                }
                if (f10 <= 0.0f) {
                    cVar.a(cVar2);
                    return cVar;
                }
                if (f10 >= 1.0f) {
                    cVar.a(cVar3);
                    return cVar;
                }
                int length = iArr2.length;
                int[] iArr3 = cVar3.f27713b;
                if (length == iArr3.length) {
                    for (int i = 0; i < iArr2.length; i++) {
                        fArr[i] = a7.g.e(cVar2.f27712a[i], cVar3.f27712a[i], f10);
                        iArr[i] = j6.c(iArr2[i], iArr3[i], f10);
                    }
                    for (int length2 = iArr2.length; length2 < fArr.length; length2++) {
                        fArr[length2] = fArr[iArr2.length - 1];
                        iArr[length2] = iArr[iArr2.length - 1];
                    }
                    return cVar;
                }
                StringBuilder sb2 = new StringBuilder("Cannot interpolate between gradients. Lengths vary (");
                sb2.append(iArr2.length);
                sb2.append(" vs ");
                x.n(p.a.j(iArr3.length, ")", sb2));
                return null;
            case 1:
                return i(aVar, f10, f10);
            default:
                b7.b bVar = (b7.b) this.i;
                Object obj2 = aVar.f1794b;
                if (obj2 != null && (obj = aVar.f1795c) != null) {
                    b7.b bVar2 = (b7.b) obj2;
                    b7.b bVar3 = (b7.b) obj;
                    float e = a7.g.e(bVar2.f1807a, bVar3.f1807a, f10);
                    float e8 = a7.g.e(bVar2.f1808b, bVar3.f1808b, f10);
                    bVar.f1807a = e;
                    bVar.f1808b = e8;
                    return bVar;
                }
                x.o("Missing values for keyframe.");
                return null;
        }
    }

    @Override // r6.e
    public /* bridge */ /* synthetic */ Object f(b7.a aVar, float f10, float f11, float f12) {
        switch (this.f24599h) {
            case 1:
                return i(aVar, f11, f12);
            default:
                return super.f(aVar, f10, f11, f12);
        }
    }

    public PointF i(b7.a aVar, float f10, float f11) {
        Object obj;
        PointF pointF = (PointF) this.i;
        Object obj2 = aVar.f1794b;
        if (obj2 != null && (obj = aVar.f1795c) != null) {
            PointF pointF2 = (PointF) obj2;
            PointF pointF3 = (PointF) obj;
            float f12 = pointF2.x;
            float x9 = g3.a.x(pointF3.x, f12, f10, f12);
            float f13 = pointF2.y;
            pointF.set(x9, g3.a.x(pointF3.y, f13, f11, f13));
            return pointF;
        }
        x.o("Missing values for keyframe.");
        return null;
    }
}
