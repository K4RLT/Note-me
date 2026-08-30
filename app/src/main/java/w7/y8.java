package w7;
import g3.a;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.daren.scraply.R;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class y8 {

    /* renamed from: a, reason: collision with root package name */
    public static final List f29503a = qe.m.h(new pe.j("rect", Integer.valueOf(R.string.shape_rect)), new pe.j("ellipse", Integer.valueOf(R.string.shape_ellipse)), new pe.j("triangle", Integer.valueOf(R.string.shape_triangle)), new pe.j("line", Integer.valueOf(R.string.shape_line)), new pe.j("star", Integer.valueOf(R.string.shape_star)), new pe.j("heart", Integer.valueOf(R.string.shape_heart)));

    /* renamed from: b, reason: collision with root package name */
    public static final float[] f29504b = {-0.3943f, -0.5f, -0.3499f, -0.4961f, -0.2742f, -0.4596f, -0.158f, -0.3644f, -0.0627f, -0.2275f, -0.0013f, -0.0645f, 0.0326f, -0.1688f, 0.0757f, -0.2562f, 0.1279f, -0.3331f, 0.1958f, -0.4035f, 0.265f, -0.4557f, 0.3512f, -0.4974f, 0.4217f, -0.4909f, 0.4687f, -0.4478f, 0.4909f, -0.3983f, 0.5f, -0.3123f, 0.4778f, -0.1949f, 0.4125f, -0.0932f, 0.436f, 0.0215f, 0.4295f, 0.1167f, 0.4125f, 0.1441f, 0.3838f, 0.1597f, 0.2807f, 0.1662f, 0.3094f, 0.1884f, 0.3368f, 0.234f, 0.3512f, 0.3123f, 0.3394f, 0.3422f, 0.2794f, 0.3983f, 0.2454f, 0.4726f, 0.2272f, 0.4909f, 0.1997f, 0.5f, 0.1371f, 0.4844f, 0.0535f, 0.4166f, 0.0235f, 0.3553f, -0.0013f, 0.2249f, -0.0261f, 0.3553f, -0.0509f, 0.41f, -0.0927f, 0.4544f, -0.1632f, 0.4935f, -0.2023f, 0.5f, -0.235f, 0.487f, -0.282f, 0.3983f, -0.3446f, 0.3383f, -0.3551f, 0.3005f, -0.346f, 0.2497f, -0.3251f, 0.2053f, -0.2833f, 0.1662f, -0.3786f, 0.1623f, -0.4099f, 0.148f, -0.4295f, 0.1245f, -0.4386f, 0.0215f, -0.4151f, -0.0932f, -0.4778f, -0.1884f, -0.5f, -0.2784f, -0.5f, -0.3605f, -0.4843f, -0.4231f, -0.4426f, -0.4791f};

    public static float a(float f10, float f11, float f12, float f13, float f14) {
        float f15 = 1.0f - f14;
        float f16 = f15 * f15 * f15 * f10;
        float f17 = 3.0f * f15;
        float f18 = (f15 * f17 * f14 * f11) + f16;
        return (f14 * f14 * f14 * f13) + (f17 * f14 * f14 * f12) + f18;
    }

    public static pe.j b(String str) {
        Float valueOf = Float.valueOf(0.2f);
        Float valueOf2 = Float.valueOf(0.42f);
        Float valueOf3 = Float.valueOf(0.34f);
        str.getClass();
        switch (str.hashCode()) {
            case -1656480802:
                if (str.equals("ellipse")) {
                    return new pe.j(valueOf2, Float.valueOf(0.32f));
                }
                break;
            case -1271629221:
                if (str.equals("flower")) {
                    return new pe.j(valueOf3, valueOf3);
                }
                break;
            case -218626508:
                if (str.equals("berries")) {
                    return new pe.j(valueOf, valueOf);
                }
                break;
            case 110758:
                if (str.equals("paw")) {
                    return new pe.j(valueOf3, Float.valueOf(0.296f));
                }
                break;
            case 2467443:
                if (str.equals("butterfly")) {
                    return new pe.j(valueOf3, valueOf3);
                }
                break;
            case 3321844:
                if (str.equals("line")) {
                    return new pe.j(Float.valueOf(0.52f), Float.valueOf(0.014f));
                }
                break;
            case 3540562:
                if (str.equals("star")) {
                    return new pe.j(valueOf2, valueOf2);
                }
                break;
            case 99151942:
                if (str.equals("heart")) {
                    return new pe.j(Float.valueOf(0.4f), Float.valueOf(0.38f));
                }
                break;
            case 109654419:
                if (str.equals("sprig")) {
                    return new pe.j(Float.valueOf(0.22f), valueOf3);
                }
                break;
            case 1497762312:
                if (str.equals("triangle")) {
                    return new pe.j(valueOf2, Float.valueOf(0.36f));
                }
                break;
        }
        return new pe.j(valueOf2, Float.valueOf(0.3f));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static void c(Canvas canvas, String str, float f10, float f11, Integer num, Integer num2, float f12, float f13) {
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        float f19;
        float f20;
        float f21;
        float f22;
        float f23;
        canvas.getClass();
        str.getClass();
        float f24 = f10 / 2.0f;
        float f25 = f11 / 2.0f;
        Path path = new Path();
        int i = 5;
        float f26 = 0.5f;
        switch (str.hashCode()) {
            case -1656480802:
                if (!str.equals("ellipse")) {
                    f14 = f13;
                    f15 = 0.5f;
                    f17 = 0.0f;
                    float min = Math.min(f10, f11) * wa.b9.d(f14, f17, f15);
                    path.addRoundRect(new RectF(-f24, -f25, f24, f25), min, min, Path.Direction.CW);
                    break;
                } else {
                    path.addOval(new RectF(-f24, -f25, f24, f25), Path.Direction.CW);
                    break;
                }
            case -1271629221:
                f16 = f11;
                if (str.equals("flower")) {
                    int i10 = 0;
                    while (i10 < 5) {
                        double radians = Math.toRadians((i10 * 72.0d) - 90.0d);
                        float cos = (float) Math.cos(radians);
                        float sin = (float) Math.sin(radians);
                        path.moveTo(d(cos, sin, f10, 0.0f, 0.0f), e(sin, cos, f16, 0.0f, 0.0f));
                        float f27 = f16;
                        path.cubicTo(d(cos, sin, f10, 0.06f, 0.27f), e(sin, cos, f16, 0.06f, 0.27f), d(cos, sin, f10, 0.38f, 0.31f), e(sin, cos, f16, 0.38f, 0.31f), d(cos, sin, f10, f26, 0.0f), e(sin, cos, f16, f26, 0.0f));
                        path.cubicTo(d(cos, sin, f10, 0.38f, -0.31f), e(sin, cos, f27, 0.38f, -0.31f), d(cos, sin, f10, 0.06f, -0.27f), e(sin, cos, f27, 0.06f, -0.27f), d(cos, sin, f10, 0.0f, 0.0f), e(sin, cos, f27, 0.0f, 0.0f));
                        path.close();
                        i10++;
                        f16 = f27;
                        f26 = 0.5f;
                    }
                    break;
                }
                f14 = f13;
                f15 = 0.5f;
                f17 = 0.0f;
                float min2 = Math.min(f10, f11) * wa.b9.d(f14, f17, f15);
                path.addRoundRect(new RectF(-f24, -f25, f24, f25), min2, min2, Path.Direction.CW);
                break;
            case -218626508:
                f16 = f11;
                if (str.equals("berries")) {
                    float[] fArr = {0.0f, -0.4f, 0.13f, -0.24f, -0.1f, 0.12f, 0.24f, -0.12f, 0.12f, -0.13f, 0.24f, 0.11f, 0.15f, 0.26f, 0.11f};
                    for (int i11 = 0; i11 < 15; i11 += 3) {
                        float f28 = fArr[i11] * f10;
                        float f29 = fArr[i11 + 1] * f16;
                        float f30 = fArr[i11 + 2];
                        float f31 = f30 * f10;
                        float f32 = f30 * f16;
                        path.addOval(new RectF(f28 - f31, f29 - f32, f28 + f31, f29 + f32), Path.Direction.CW);
                    }
                    break;
                }
                f14 = f13;
                f15 = 0.5f;
                f17 = 0.0f;
                float min22 = Math.min(f10, f11) * wa.b9.d(f14, f17, f15);
                path.addRoundRect(new RectF(-f24, -f25, f24, f25), min22, min22, Path.Direction.CW);
                break;
            case 110758:
                f18 = f11;
                f17 = 0.0f;
                if (str.equals("paw")) {
                    float f33 = f10 / 1.093f;
                    float f34 = f18 / 0.951f;
                    float f35 = (-0.0061f) * f34;
                    float f36 = 0.7f * f33;
                    float f37 = f34 * 0.44f;
                    float f38 = (0.255f * f34) + f35;
                    float f39 = f38 - (f37 / 2.0f);
                    path.moveTo(0.0f, f39);
                    float f40 = -f36;
                    float f41 = f38 - (f37 * 0.5f);
                    float f42 = f38 - (0.1f * f37);
                    float f43 = (0.18f * f37) + f38;
                    path.cubicTo(f40 * 0.4f, f41, f40 * 0.52f, f42, f40 * 0.5f, f43);
                    float f44 = (0.46f * f37) + f38;
                    float f45 = (0.54f * f37) + f38;
                    float f46 = (0.38f * f37) + f38;
                    path.cubicTo(f40 * 0.48f, f44, f40 * 0.28f, f45, f40 * 0.17f, f46);
                    float f47 = (f37 * 0.56f) + f38;
                    path.cubicTo(f40 * 0.08f, f47, 0.08f * f36, f47, f36 * 0.17f, f46);
                    path.cubicTo(f36 * 0.28f, f45, f36 * 0.48f, f44, f36 * 0.5f, f43);
                    path.cubicTo(f36 * 0.52f, f42, f36 * 0.4f, f41, 0.0f, f39);
                    path.close();
                    float f48 = 0.25f * f33;
                    float f49 = 0.33f * f34;
                    Matrix matrix = new Matrix();
                    Path path2 = new Path();
                    int i12 = 0;
                    while (i12 < 4) {
                        if (i12 < 2) {
                            f19 = 0.17f;
                        } else {
                            f19 = 0.405f;
                        }
                        int i13 = i12 % 2;
                        float f50 = -1.0f;
                        if (i13 == 0) {
                            f20 = -1.0f;
                        } else {
                            f20 = 1.0f;
                        }
                        float f51 = f19 * f20 * f33;
                        if (i12 < 2) {
                            f21 = -0.305f;
                        } else {
                            f21 = -0.08f;
                        }
                        float f52 = (f21 * f34) + f35;
                        if (i12 < 2) {
                            f22 = 8.0f;
                        } else {
                            f22 = 38.0f;
                        }
                        if (i13 != 0) {
                            f50 = 1.0f;
                        }
                        path2.reset();
                        path2.addOval(new RectF((-f48) / 2.0f, (-f49) / 2.0f, f48 / 2.0f, f49 / 2.0f), Path.Direction.CW);
                        matrix.setRotate(f22 * f50);
                        matrix.postTranslate(f51, f52);
                        path2.transform(matrix);
                        path.addPath(path2);
                        i12++;
                        f33 = f33;
                        f34 = f34;
                        f35 = f35;
                    }
                    break;
                }
                f14 = f13;
                f15 = 0.5f;
                float min222 = Math.min(f10, f11) * wa.b9.d(f14, f17, f15);
                path.addRoundRect(new RectF(-f24, -f25, f24, f25), min222, min222, Path.Direction.CW);
                break;
            case 2467443:
                f18 = f11;
                f17 = 0.0f;
                if (str.equals("butterfly")) {
                    int i14 = 0;
                    while (true) {
                        float[] fArr2 = f29504b;
                        if (i14 < fArr2.length) {
                            float f53 = fArr2[i14] * f10;
                            float f54 = fArr2[i14 + 1] * f18;
                            if (i14 == 0) {
                                path.moveTo(f53, f54);
                            } else {
                                path.lineTo(f53, f54);
                            }
                            i14 += 2;
                        } else {
                            path.close();
                            break;
                        }
                    }
                }
                f14 = f13;
                f15 = 0.5f;
                float min2222 = Math.min(f10, f11) * wa.b9.d(f14, f17, f15);
                path.addRoundRect(new RectF(-f24, -f25, f24, f25), min2222, min2222, Path.Direction.CW);
                break;
            case 3321844:
                f18 = f11;
                f17 = 0.0f;
                if (str.equals("line")) {
                    path.addRoundRect(new RectF(-f24, -f25, f24, f25), f25, f25, Path.Direction.CW);
                    break;
                }
                f14 = f13;
                f15 = 0.5f;
                float min22222 = Math.min(f10, f11) * wa.b9.d(f14, f17, f15);
                path.addRoundRect(new RectF(-f24, -f25, f24, f25), min22222, min22222, Path.Direction.CW);
                break;
            case 3540562:
                f18 = f11;
                f17 = 0.0f;
                if (str.equals("star")) {
                    int i15 = 0;
                    while (i15 < 10) {
                        double d2 = ((i15 * 3.141592653589793d) / i) - 1.5707963267948966d;
                        if (i15 % 2 == 0) {
                            f23 = 1.0f;
                        } else {
                            f23 = 0.42f;
                        }
                        double d10 = f23;
                        float cos2 = (float) (Math.cos(d2) * f24 * d10);
                        float sin2 = (float) (Math.sin(d2) * f25 * d10);
                        if (i15 == 0) {
                            path.moveTo(cos2, sin2);
                        } else {
                            path.lineTo(cos2, sin2);
                        }
                        i15++;
                        i = 5;
                    }
                    path.close();
                    break;
                }
                f14 = f13;
                f15 = 0.5f;
                float min222222 = Math.min(f10, f11) * wa.b9.d(f14, f17, f15);
                path.addRoundRect(new RectF(-f24, -f25, f24, f25), min222222, min222222, Path.Direction.CW);
                break;
            case 99151942:
                f18 = f11;
                if (!str.equals("heart")) {
                    f14 = f13;
                    f15 = 0.5f;
                    f17 = 0.0f;
                    float min2222222 = Math.min(f10, f11) * wa.b9.d(f14, f17, f15);
                    path.addRoundRect(new RectF(-f24, -f25, f24, f25), min2222222, min2222222, Path.Direction.CW);
                    break;
                } else {
                    float f55 = 0.9f * f25;
                    path.moveTo(0.0f, f55);
                    float f56 = -f24;
                    float f57 = f25 * 0.15f;
                    float f58 = -f25;
                    float f59 = 0.95f * f58;
                    path.cubicTo(f56 * 1.1f, f57, f56 * 0.85f, f59, 0.0f, f58 * 0.35f);
                    path.cubicTo(f24 * 0.85f, f59, f24 * 1.1f, f57, 0.0f, f55);
                    path.close();
                    break;
                }
            case 109654419:
                if (str.equals("sprig")) {
                    path.moveTo((j(0.0f) - 0.012f) * f10, k(0.0f) * f11);
                    int i16 = 1;
                    while (true) {
                        float f60 = 20;
                        float f61 = i16 / f60;
                        path.lineTo((j(f61) - 0.012f) * f10, k(f61) * f11);
                        if (i16 != 20) {
                            i16++;
                        } else {
                            for (int i17 = 20; -1 < i17; i17--) {
                                float f62 = i17 / f60;
                                path.lineTo((j(f62) + 0.012f) * f10, k(f62) * f11);
                            }
                            path.close();
                            float[] fArr3 = {0.2f, -1.0f, 0.3f, 0.34f, 1.0f, 0.29f, 0.48f, -1.0f, 0.26f, 0.62f, 1.0f, 0.23f, 0.76f, -1.0f, 0.19f};
                            for (int i18 = 0; i18 < 15; i18 += 3) {
                                float f63 = fArr3[i18];
                                float f64 = fArr3[i18 + 1];
                                float f65 = fArr3[i18 + 2];
                                g(path, j(f63), k(f63), f65, 0.3f * f65, (-90.0f) + (f64 * 52.0f), f10, f11);
                            }
                            g(path, j(1.0f), k(1.0f), 0.16f, 0.05f, -90.0f, f10, f11);
                            break;
                        }
                    }
                }
                f14 = f13;
                f15 = 0.5f;
                f17 = 0.0f;
                float min22222222 = Math.min(f10, f11) * wa.b9.d(f14, f17, f15);
                path.addRoundRect(new RectF(-f24, -f25, f24, f25), min22222222, min22222222, Path.Direction.CW);
                break;
            case 1497762312:
                if (str.equals("triangle")) {
                    path.moveTo(0.0f, -f25);
                    path.lineTo(f24, f25);
                    path.lineTo(-f24, f25);
                    path.close();
                    break;
                }
                f14 = f13;
                f15 = 0.5f;
                f17 = 0.0f;
                float min222222222 = Math.min(f10, f11) * wa.b9.d(f14, f17, f15);
                path.addRoundRect(new RectF(-f24, -f25, f24, f25), min222222222, min222222222, Path.Direction.CW);
                break;
            default:
                f14 = f13;
                f15 = 0.5f;
                f17 = 0.0f;
                float min2222222222 = Math.min(f10, f11) * wa.b9.d(f14, f17, f15);
                path.addRoundRect(new RectF(-f24, -f25, f24, f25), min2222222222, min2222222222, Path.Direction.CW);
                break;
        }
        if (num != null) {
            Paint paint = new Paint(1);
            paint.setStyle(Paint.Style.FILL);
            paint.setColor(num.intValue());
            canvas.drawPath(path, paint);
        }
        if (num2 != null && f12 > 0.0f) {
            Paint paint2 = new Paint(1);
            paint2.setStyle(Paint.Style.STROKE);
            paint2.setStrokeWidth(f12);
            paint2.setStrokeJoin(Paint.Join.ROUND);
            paint2.setStrokeCap(Paint.Cap.ROUND);
            paint2.setColor(num2.intValue());
            canvas.drawPath(path, paint2);
        }
    }

    public static final float d(float f10, float f11, float f12, float f13, float f14) {
        return a.w(f14, f11, f13 * f10, f12);
    }

    public static final float e(float f10, float f11, float f12, float f13, float f14) {
        return a.y(f14, f11, f13 * f10, f12);
    }

    public static int f(String str) {
        Object obj;
        str.getClass();
        Iterator it = f29503a.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (kotlin.jvm.internal.l.a(((pe.j) obj).f22693u, str)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        pe.j jVar = (pe.j) obj;
        if (jVar != null) {
            return ((Number) jVar.f22694v).intValue();
        }
        return R.string.layer_shape;
    }

    public static void g(Path path, float f10, float f11, float f12, float f13, float f14, float f15, float f16) {
        double radians = Math.toRadians(f14);
        float cos = (float) Math.cos(radians);
        float sin = (float) Math.sin(radians);
        path.moveTo(h(f10, cos, sin, f15, 0.0f, 0.0f), i(f11, sin, cos, f16, 0.0f, 0.0f));
        float f17 = f12 * 0.45f;
        path.quadTo(h(f10, cos, sin, f15, f17, f13), i(f11, sin, cos, f16, f17, f13), h(f10, cos, sin, f15, f12, 0.0f), i(f11, sin, cos, f16, f12, 0.0f));
        float f18 = -f13;
        path.quadTo(h(f10, cos, sin, f15, f17, f18), i(f11, sin, cos, f16, f17, f18), h(f10, cos, sin, f15, 0.0f, 0.0f), i(f11, sin, cos, f16, 0.0f, 0.0f));
        path.close();
    }

    public static final float h(float f10, float f11, float f12, float f13, float f14, float f15) {
        return a.w(f15, f12, (f14 * f11) + f10, f13);
    }

    public static final float i(float f10, float f11, float f12, float f13, float f14, float f15) {
        return a.y(f15, f12, (f14 * f11) + f10, f13);
    }

    public static final float j(float f10) {
        return a(0.0f, -0.06f, 0.1f, 0.05f, f10);
    }

    public static final float k(float f10) {
        return a(0.5f, 0.18f, -0.12f, -0.44f, f10);
    }
}
