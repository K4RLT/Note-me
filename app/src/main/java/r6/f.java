package r6;
import f.c;
import g.b;

import android.graphics.PointF;
import java.util.List;
import q.x;

/* loaded from: classes.dex */
public final class f extends i {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f24591h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(int i, List list) {
        super(list);
        this.f24591h = i;
    }

    public static float j(b7.a aVar, float f10) {
        Object obj = aVar.f1794b;
        if (obj != null && aVar.f1795c != null) {
            if (aVar.i == -3987645.8f) {
                aVar.i = ((Float) obj).floatValue();
            }
            float f11 = aVar.i;
            if (aVar.f1800j == -3987645.8f) {
                aVar.f1800j = ((Float) aVar.f1795c).floatValue();
            }
            return a7.g.e(f11, aVar.f1800j, f10);
        }
        x.o("Missing values for keyframe.");
        return 0.0f;
    }

    @Override // r6.e
    public final Object e(b7.a aVar, float f10) {
        int i;
        Object obj;
        switch (this.f24591h) {
            case 0:
                return Integer.valueOf(k(aVar, f10));
            case 1:
                return Float.valueOf(j(aVar, f10));
            case 2:
                Object obj2 = aVar.f1794b;
                if (obj2 != null) {
                    Object obj3 = aVar.f1795c;
                    if (obj3 == null) {
                        if (aVar.f1801k == 784923401) {
                            aVar.f1801k = ((Integer) obj2).intValue();
                        }
                        i = aVar.f1801k;
                    } else {
                        if (aVar.f1802l == 784923401) {
                            aVar.f1802l = ((Integer) obj3).intValue();
                        }
                        i = aVar.f1802l;
                    }
                    if (aVar.f1801k == 784923401) {
                        aVar.f1801k = ((Integer) obj2).intValue();
                    }
                    int i10 = aVar.f1801k;
                    PointF pointF = a7.g.f315a;
                    return Integer.valueOf((int) ((f10 * (i - i10)) + i10));
                }
                x.o("Missing values for keyframe.");
                return null;
            default:
                if (f10 == 1.0f && (obj = aVar.f1795c) != null) {
                    return (u6.b) obj;
                }
                return (u6.b) aVar.f1794b;
        }
    }

    public float i() {
        return j(this.f24587c.b(), b());
    }

    public int k(b7.a aVar, float f10) {
        if (aVar.f1794b != null && aVar.f1795c != null) {
            return j6.c(((Integer) aVar.f1794b).intValue(), ((Integer) aVar.f1795c).intValue(), a7.b(f10, 0.0f, 1.0f));
        }
        x.o("Missing values for keyframe.");
        return 0;
    }
}
