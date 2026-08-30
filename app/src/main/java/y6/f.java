package y6;
import x.n;
import n.b;
import n.d;
import q.x;

import android.graphics.Color;
import android.graphics.PointF;
import w7.i1;

/* loaded from: classes.dex */
public final class f implements d0 {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f30932u;

    /* renamed from: v, reason: collision with root package name */
    public static final f f30927v = new f(0);

    /* renamed from: w, reason: collision with root package name */
    public static final f f30928w = new f(1);

    /* renamed from: x, reason: collision with root package name */
    public static final f f30929x = new f(2);

    /* renamed from: y, reason: collision with root package name */
    public static final f f30930y = new f(3);

    /* renamed from: z, reason: collision with root package name */
    public static final f f30931z = new f(4);
    public static final f A = new f(5);

    public /* synthetic */ f(int i) {
        this.f30932u = i;
    }

    @Override // y6.d0
    public final Object d(z6.a aVar, float f10) {
        double d2;
        switch (this.f30932u) {
            case 0:
                boolean z3 = true;
                if (aVar.H() != 1) {
                    z3 = false;
                }
                if (z3) {
                    aVar.f();
                }
                double w10 = aVar.w();
                double w11 = aVar.w();
                double w12 = aVar.w();
                if (aVar.H() == 7) {
                    d2 = aVar.w();
                } else {
                    d2 = 1.0d;
                }
                if (z3) {
                    aVar.k();
                }
                if (w10 <= 1.0d && w11 <= 1.0d && w12 <= 1.0d) {
                    w10 *= 255.0d;
                    w11 *= 255.0d;
                    w12 *= 255.0d;
                    if (d2 <= 1.0d) {
                        d2 *= 255.0d;
                    }
                }
                return Integer.valueOf(Color.argb((int) d2, (int) w10, (int) w11, (int) w12));
            case 1:
                return Float.valueOf(d(aVar) * f10);
            case 2:
                return Integer.valueOf(Math.round(d(aVar) * f10));
            case 3:
                return b(aVar, f10);
            case 4:
                int H = aVar.H();
                if (H == 1) {
                    return b(aVar, f10);
                }
                if (H == 3) {
                    return b(aVar, f10);
                }
                if (H == 7) {
                    PointF pointF = new PointF(((float) aVar.w()) * f10, ((float) aVar.w()) * f10);
                    while (aVar.p()) {
                        aVar.N();
                    }
                    return pointF;
                }
                x.n("Cannot convert json to point. Next token is ".concat(i1.l(H)));
                return null;
            default:
                boolean z9 = true;
                if (aVar.H() != 1) {
                    z9 = false;
                }
                if (z9) {
                    aVar.f();
                }
                float w13 = (float) aVar.w();
                float w14 = (float) aVar.w();
                while (aVar.p()) {
                    aVar.N();
                }
                if (z9) {
                    aVar.k();
                }
                return new b7.b((w13 / 100.0f) * f10, (w14 / 100.0f) * f10);
        }
    }
}
