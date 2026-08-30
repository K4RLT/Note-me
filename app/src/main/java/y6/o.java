package y6;
import g.b;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.view.animation.BaseInterpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.PathInterpolator;

/* loaded from: classes.dex */
public abstract class o {

    /* renamed from: a, reason: collision with root package name */
    public static final LinearInterpolator f30951a = new LinearInterpolator();

    /* renamed from: b, reason: collision with root package name */
    public static final j6.e f30952b = j6.e.j("t", "s", "e", "o", "i", "h", "to", "ti");

    /* renamed from: c, reason: collision with root package name */
    public static final j6.e f30953c = j6.e.j("x", "y");

    public static BaseInterpolator a(PointF pointF, PointF pointF2) {
        pointF.x = a7.b(pointF.x, -1.0f, 1.0f);
        pointF.y = a7.b(pointF.y, -100.0f, 100.0f);
        pointF2.x = a7.b(pointF2.x, -1.0f, 1.0f);
        float b10 = a7.b(pointF2.y, -100.0f, 100.0f);
        pointF2.y = b10;
        Matrix matrix = a7.l.f341a;
        try {
            return new PathInterpolator(pointF.x, pointF.y, pointF2.x, b10);
        } catch (IllegalArgumentException e) {
            if ("The Path cannot loop back on itself.".equals(e.getMessage())) {
                return new PathInterpolator(Math.min(pointF.x, 1.0f), pointF.y, Math.max(pointF2.x, 0.0f), pointF2.y);
            }
            return new LinearInterpolator();
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:8:0x002d. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [android.view.animation.BaseInterpolator] */
    /* JADX WARN: Type inference failed for: r8v2, types: [android.view.animation.BaseInterpolator] */
    public static b7.a b(z6.a aVar, o6.a aVar2, float f10, d0 d0Var, boolean z3, boolean z9) {
        Object obj;
        LinearInterpolator a10;
        BaseInterpolator a11;
        BaseInterpolator a12;
        Object obj2;
        b7.a aVar3;
        j6.e eVar;
        j6.e eVar2;
        PointF pointF;
        j6.e eVar3 = f30952b;
        LinearInterpolator linearInterpolator = f30951a;
        if (z3 && z9) {
            aVar.j();
            PointF pointF2 = null;
            PointF pointF3 = null;
            PointF pointF4 = null;
            boolean z10 = false;
            PointF pointF5 = null;
            PointF pointF6 = null;
            PointF pointF7 = null;
            Object obj3 = null;
            PointF pointF8 = null;
            PointF pointF9 = null;
            float f11 = 0.0f;
            Object obj4 = null;
            while (aVar.p()) {
                int L = aVar.L(eVar3);
                j6.e eVar4 = f30953c;
                LinearInterpolator linearInterpolator2 = linearInterpolator;
                switch (L) {
                    case 0:
                        eVar = eVar3;
                        f11 = (float) aVar.w();
                        linearInterpolator = linearInterpolator2;
                        eVar3 = eVar;
                        break;
                    case 1:
                        eVar = eVar3;
                        obj3 = d0Var.d(aVar, f10);
                        linearInterpolator = linearInterpolator2;
                        eVar3 = eVar;
                        break;
                    case 2:
                        eVar = eVar3;
                        obj4 = d0Var.d(aVar, f10);
                        linearInterpolator = linearInterpolator2;
                        eVar3 = eVar;
                        break;
                    case 3:
                        eVar = eVar3;
                        boolean z11 = z10;
                        Object obj5 = obj3;
                        PointF pointF10 = pointF8;
                        if (aVar.H() == 3) {
                            aVar.j();
                            float f12 = 0.0f;
                            float f13 = 0.0f;
                            float f14 = 0.0f;
                            float f15 = 0.0f;
                            while (aVar.p()) {
                                int L2 = aVar.L(eVar4);
                                if (L2 != 0) {
                                    if (L2 != 1) {
                                        aVar.N();
                                    } else if (aVar.H() == 7) {
                                        f15 = (float) aVar.w();
                                        f13 = f15;
                                    } else {
                                        aVar.f();
                                        f13 = (float) aVar.w();
                                        if (aVar.H() == 7) {
                                            f15 = (float) aVar.w();
                                        } else {
                                            f15 = f13;
                                        }
                                        aVar.k();
                                    }
                                } else if (aVar.H() == 7) {
                                    f14 = (float) aVar.w();
                                    f12 = f14;
                                } else {
                                    aVar.f();
                                    f12 = (float) aVar.w();
                                    if (aVar.H() == 7) {
                                        f14 = (float) aVar.w();
                                    } else {
                                        f14 = f12;
                                    }
                                    aVar.k();
                                }
                            }
                            PointF pointF11 = new PointF(f12, f13);
                            pointF8 = new PointF(f14, f15);
                            aVar.m();
                            pointF7 = pointF11;
                        } else {
                            pointF5 = b(aVar, f10);
                            pointF8 = pointF10;
                        }
                        z10 = z11;
                        linearInterpolator = linearInterpolator2;
                        obj3 = obj5;
                        eVar3 = eVar;
                        break;
                    case 4:
                        boolean z12 = z10;
                        if (aVar.H() == 3) {
                            aVar.j();
                            float f16 = 0.0f;
                            float f17 = 0.0f;
                            float f18 = 0.0f;
                            float f19 = 0.0f;
                            while (aVar.p()) {
                                Object obj6 = obj3;
                                int L3 = aVar.L(eVar4);
                                if (L3 != 0) {
                                    eVar2 = eVar3;
                                    if (L3 != 1) {
                                        aVar.N();
                                    } else if (aVar.H() == 7) {
                                        f19 = (float) aVar.w();
                                        pointF8 = pointF8;
                                        f17 = f19;
                                    } else {
                                        pointF = pointF8;
                                        aVar.f();
                                        f17 = (float) aVar.w();
                                        if (aVar.H() == 7) {
                                            f19 = (float) aVar.w();
                                        } else {
                                            f19 = f17;
                                        }
                                        aVar.k();
                                        pointF8 = pointF;
                                    }
                                } else {
                                    eVar2 = eVar3;
                                    pointF = pointF8;
                                    if (aVar.H() == 7) {
                                        f18 = (float) aVar.w();
                                        pointF8 = pointF;
                                        f16 = f18;
                                    } else {
                                        aVar.f();
                                        f16 = (float) aVar.w();
                                        if (aVar.H() == 7) {
                                            f18 = (float) aVar.w();
                                        } else {
                                            f18 = f16;
                                        }
                                        aVar.k();
                                        pointF8 = pointF;
                                    }
                                }
                                obj3 = obj6;
                                eVar3 = eVar2;
                            }
                            eVar = eVar3;
                            PointF pointF12 = new PointF(f16, f17);
                            pointF2 = new PointF(f18, f19);
                            aVar.m();
                            pointF9 = pointF12;
                        } else {
                            eVar = eVar3;
                            pointF6 = b(aVar, f10);
                        }
                        z10 = z12;
                        linearInterpolator = linearInterpolator2;
                        eVar3 = eVar;
                        break;
                    case 5:
                        if (aVar.A() == 1) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        linearInterpolator = linearInterpolator2;
                        break;
                    case 6:
                        pointF3 = b(aVar, f10);
                        linearInterpolator = linearInterpolator2;
                        break;
                    case 7:
                        pointF4 = b(aVar, f10);
                        linearInterpolator = linearInterpolator2;
                        break;
                    default:
                        aVar.N();
                        linearInterpolator = linearInterpolator2;
                        break;
                }
            }
            LinearInterpolator linearInterpolator3 = linearInterpolator;
            boolean z13 = z10;
            Object obj7 = obj3;
            PointF pointF13 = pointF8;
            aVar.m();
            if (z13) {
                obj2 = obj7;
            } else {
                if (pointF5 != null && pointF6 != null) {
                    linearInterpolator3 = a(pointF5, pointF6);
                } else if (pointF7 != null && pointF13 != null && pointF9 != null && pointF2 != null) {
                    a11 = a(pointF7, pointF9);
                    a12 = a(pointF13, pointF2);
                    obj2 = obj4;
                    linearInterpolator3 = null;
                    if (a11 == null && a12 != null) {
                        aVar3 = new b7.a(aVar2, obj7, obj2, a11, a12, f11);
                    } else {
                        aVar3 = new b7.a(aVar2, obj7, obj2, linearInterpolator3, f11, (Float) null);
                    }
                    aVar3.f1805o = pointF3;
                    aVar3.f1806p = pointF4;
                    return aVar3;
                }
                obj2 = obj4;
            }
            a11 = null;
            a12 = null;
            if (a11 == null) {
            }
            aVar3 = new b7.a(aVar2, obj7, obj2, linearInterpolator3, f11, (Float) null);
            aVar3.f1805o = pointF3;
            aVar3.f1806p = pointF4;
            return aVar3;
        }
        j6.e eVar5 = eVar3;
        if (z3) {
            aVar.j();
            PointF pointF14 = null;
            PointF pointF15 = null;
            PointF pointF16 = null;
            PointF pointF17 = null;
            boolean z14 = false;
            Object obj8 = null;
            float f20 = 0.0f;
            Object obj9 = null;
            while (aVar.p()) {
                j6.e eVar6 = eVar5;
                switch (aVar.L(eVar6)) {
                    case 0:
                        eVar5 = eVar6;
                        f20 = (float) aVar.w();
                        continue;
                    case 1:
                        obj8 = d0Var.d(aVar, f10);
                        break;
                    case 2:
                        obj9 = d0Var.d(aVar, f10);
                        break;
                    case 3:
                        pointF17 = b(aVar, 1.0f);
                        break;
                    case 4:
                        pointF14 = b(aVar, 1.0f);
                        break;
                    case 5:
                        if (aVar.A() == 1) {
                            z14 = true;
                            break;
                        } else {
                            z14 = false;
                            break;
                        }
                    case 6:
                        pointF15 = b(aVar, f10);
                        break;
                    case 7:
                        pointF16 = b(aVar, f10);
                        break;
                    default:
                        aVar.N();
                        break;
                }
                eVar5 = eVar6;
            }
            aVar.m();
            if (z14) {
                obj = obj8;
            } else {
                if (pointF17 != null && pointF14 != null) {
                    a10 = a(pointF17, pointF14);
                    obj = obj9;
                    b7.a aVar4 = new b7.a(aVar2, obj8, obj, a10, f20, (Float) null);
                    aVar4.f1805o = pointF15;
                    aVar4.f1806p = pointF16;
                    return aVar4;
                }
                obj = obj9;
            }
            a10 = linearInterpolator;
            b7.a aVar42 = new b7.a(aVar2, obj8, obj, a10, f20, (Float) null);
            aVar42.f1805o = pointF15;
            aVar42.f1806p = pointF16;
            return aVar42;
        }
        return new b7.a(d0Var.d(aVar, f10));
    }
}
