package y6;
import x.n;
import d.b;
import q.x;

import android.graphics.Color;
import android.graphics.PointF;
import java.util.ArrayList;
import w7.i1;

/* loaded from: classes.dex */
public abstract class n {

    /* renamed from: a, reason: collision with root package name */
    public static final j6.e f30950a = j6.e.j("x", "y");

    public static int a(z6.a aVar) {
        aVar.f();
        int w10 = (int) (aVar.w() * 255.0d);
        int w11 = (int) (aVar.w() * 255.0d);
        int w12 = (int) (aVar.w() * 255.0d);
        while (aVar.p()) {
            aVar.N();
        }
        aVar.k();
        return Color.argb(255, w10, w11, w12);
    }

    public static PointF b(z6.a aVar, float f10) {
        int b10 = q0.b(aVar.H());
        if (b10 != 0) {
            if (b10 != 2) {
                if (b10 == 6) {
                    float w10 = (float) aVar.w();
                    float w11 = (float) aVar.w();
                    while (aVar.p()) {
                        aVar.N();
                    }
                    return new PointF(w10 * f10, w11 * f10);
                }
                x.n("Unknown point starts with ".concat(i1.l(aVar.H())));
                return null;
            }
            aVar.j();
            float f11 = 0.0f;
            float f12 = 0.0f;
            while (aVar.p()) {
                int L = aVar.L(f30950a);
                if (L != 0) {
                    if (L != 1) {
                        aVar.M();
                        aVar.N();
                    } else {
                        f12 = d(aVar);
                    }
                } else {
                    f11 = d(aVar);
                }
            }
            aVar.m();
            return new PointF(f11 * f10, f12 * f10);
        }
        aVar.f();
        float w12 = (float) aVar.w();
        float w13 = (float) aVar.w();
        while (aVar.H() != 2) {
            aVar.N();
        }
        aVar.k();
        return new PointF(w12 * f10, w13 * f10);
    }

    public static ArrayList c(z6.a aVar, float f10) {
        ArrayList arrayList = new ArrayList();
        aVar.f();
        while (aVar.H() == 1) {
            aVar.f();
            arrayList.add(b(aVar, f10));
            aVar.k();
        }
        aVar.k();
        return arrayList;
    }

    public static float d(z6.a aVar) {
        int H = aVar.H();
        int b10 = q0.b(H);
        if (b10 != 0) {
            if (b10 == 6) {
                return (float) aVar.w();
            }
            x.n("Unknown value for token of type ".concat(i1.l(H)));
            return 0.0f;
        }
        aVar.f();
        float w10 = (float) aVar.w();
        while (aVar.p()) {
            aVar.N();
        }
        aVar.k();
        return w10;
    }
}
