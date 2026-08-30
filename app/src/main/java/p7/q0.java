package p7;
import m.h;
import q0.f;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import com.daren.scraply.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import wa.b9;

/* loaded from: classes.dex */
public abstract class q0 {

    /* renamed from: a, reason: collision with root package name */
    public static final List f22559a = qe.h(new o0(R.string.magic_palette_custom, "custom", qe.h(-1689274, -12223587, -918802, -5711140)), new o0(R.string.magic_palette_unicorn, "unicornio", qe.h(-37987, -3772484, -8675585, -9443363, -11930)), new o0(R.string.magic_palette_rainbow, "arcoiris", qe.h(-1689274, -557312, -213175, -16329056, -15627598, -8177428)), new o0(R.string.magic_palette_sunset, "atardecer", qe.h(-25973, -38264, -26196, -19589)), new o0(R.string.magic_palette_ocean, "oceano", qe.h(-12006684, -16730920, -16738617, -7282449)), new o0(R.string.magic_palette_forest, "bosque", qe.h(-6957646, -11356280, -13800881, -2559012)), new o0(R.string.magic_palette_pastel, "pastel", qe.h(-14115, -4333314, -20532, -6106369, -3296037)), new o0(R.string.magic_palette_gold, "oro", qe.h(-2838729, -796805, -4684277, -5720)), new o0(R.string.magic_palette_bubblegum, "chicle", qe.h(-36698, -26768, -10640, -1441936)), new o0(R.string.magic_palette_love, "amor", qe.h(-2613669, -693639, -23125, -1527144)));

    /* renamed from: b, reason: collision with root package name */
    public static final List f22560b = qe.h(new p0("rainbow", R.string.magic_style_rainbow, 0.0f, 0.0f, 12), new p0("dotted", R.string.magic_style_dotted, 1.15f, 0.55f, 16), new p0("hearts", R.string.magic_style_hearts, 1.55f, 1.15f, 16), new p0("stars", R.string.magic_style_stars, 1.55f, 1.2f, 16), new p0("sparkle", R.string.magic_style_sparkle, 1.0f, 0.9f, 16), new p0("flowers", R.string.magic_style_flowers, 1.7f, 1.15f, 16), new p0("bubbles", R.string.magic_style_bubbles, 1.45f, 1.0f, 16), new p0("confetti", R.string.magic_style_confetti, 0.9f, 0.7f, 16), new p0("butterflies", R.string.magic_style_butterflies, 1.9f, 1.2f, 16), new p0("dashed", R.string.magic_style_dashed, 0.0f, 0.0f, 12), new p0("snow", R.string.magic_style_snow, 1.5f, 1.0f, 16), new p0("kisses", R.string.magic_style_kisses, 1.85f, 1.2f, 16));

    /* renamed from: c, reason: collision with root package name */
    public static final Path f22561c = new Path();

    public static int a(o0 o0Var, float f10) {
        List list = o0Var.f22547c;
        int size = list.size();
        if (size == 1) {
            return ((Number) list.get(0)).intValue();
        }
        float f11 = (((f10 % 1.0f) + 1.0f) % 1.0f) * size;
        int i = (int) f11;
        int i10 = i % size;
        return c(((Number) list.get(i10)).intValue(), ((Number) list.get((i10 + 1) % size)).intValue(), f11 - i);
    }

    public static float b(long j10) {
        long j11 = j10 * (-7046029254386353131L);
        long j12 = (j11 ^ (j11 >>> 32)) * (-4658895280553007687L);
        return (((int) ((j12 ^ (j12 >>> 29)) >>> 40)) & 65535) / 65535.0f;
    }

    public static int c(int i, int i10, float f10) {
        float d2 = b9.d(f10, 0.0f, 1.0f);
        return Color.argb((int) (((Color.alpha(i10) - Color.alpha(i)) * d2) + Color.alpha(i)), (int) (((Color.red(i10) - Color.red(i)) * d2) + Color.red(i)), (int) (((Color.green(i10) - Color.green(i)) * d2) + Color.green(i)), (int) (((Color.blue(i10) - Color.blue(i)) * d2) + Color.blue(i)));
    }

    public static o0 d(String str) {
        Object obj;
        str.getClass();
        List list = f22559a;
        Iterator it = list.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((o0) obj).f22545a.equals(str)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        o0 o0Var = (o0) obj;
        if (o0Var == null) {
            return (o0) qe.l.w(list);
        }
        return o0Var;
    }

    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, kotlin.jvm.internal.w] */
    public static float e(Canvas canvas, ArrayList arrayList, String str, String str2, float f10, List list, float f11) {
        Object obj;
        float f12;
        int i;
        kotlin.jvm.internal.w wVar;
        int i10;
        PointF pointF;
        float f13;
        float f14;
        float f15;
        String str3;
        int i11;
        int i12;
        String str4;
        int i13;
        int i14;
        List list2;
        ArrayList arrayList2 = arrayList;
        float f16 = f10;
        canvas.getClass();
        str.getClass();
        str2.getClass();
        if (!arrayList2.isEmpty()) {
            float f17 = 0.0f;
            if (f16 > 0.0f) {
                List list3 = f22560b;
                Iterator it = list3.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (((p0) obj).f22551a.equals(str)) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                p0 p0Var = (p0) obj;
                if (p0Var == null) {
                    p0Var = (p0) qe.l.w(list3);
                }
                p0 p0Var2 = p0Var;
                o0 d2 = d(str2);
                if (str2.equals("custom") && (list2 = list) != null && !list2.isEmpty()) {
                    String str5 = d2.f22545a;
                    int i15 = d2.f22546b;
                    list.getClass();
                    d2 = new o0(i15, str5, list);
                }
                boolean z3 = p0Var2.e;
                String str6 = p0Var2.f22551a;
                if (z3) {
                    Paint paint = new Paint(1);
                    paint.setStyle(Paint.Style.STROKE);
                    paint.setStrokeCap(Paint.Cap.ROUND);
                    paint.setStrokeJoin(Paint.Join.ROUND);
                    paint.setStrokeWidth(f16);
                    float f18 = 10.0f * f16;
                    boolean equals = str6.equals("ribbon");
                    float f19 = 2.2f * f16;
                    float f20 = f16 * 1.8f;
                    int size = arrayList2.size();
                    int i16 = 1;
                    while (i16 < size) {
                        PointF pointF2 = (PointF) arrayList2.get(i16 - 1);
                        PointF pointF3 = (PointF) arrayList2.get(i16);
                        float f21 = pointF3.x - pointF2.x;
                        float f22 = pointF3.y - pointF2.y;
                        boolean z9 = equals;
                        float f23 = f19;
                        float f24 = f17;
                        float hypot = (float) Math.hypot(f21, f22);
                        if (hypot > 0.01f) {
                            int e = b9.e((int) (hypot / (0.5f * f16)), 1, 24);
                            float f25 = (-f22) / hypot;
                            float f26 = f21 / hypot;
                            int i17 = 0;
                            while (i17 < e) {
                                float f27 = f18;
                                float f28 = i17;
                                int i18 = i17;
                                float f29 = e;
                                float f30 = f28 / f29;
                                int i19 = i18 + 1;
                                float f31 = i19 / f29;
                                float f32 = (hypot * f30) + f24;
                                if (str6.equals("dashed") && f32 % (f23 + f20) > f23) {
                                    str4 = str6;
                                    i13 = i16;
                                    i14 = size;
                                } else {
                                    float f33 = pointF2.x;
                                    float f34 = (f21 * f30) + f33;
                                    float f35 = pointF2.y;
                                    float f36 = (f30 * f22) + f35;
                                    float f37 = (f21 * f31) + f33;
                                    float f38 = (f22 * f31) + f35;
                                    if (z9) {
                                        float f39 = 0.75f * f10;
                                        float f40 = 3.2f * f10;
                                        str4 = str6;
                                        i13 = i16;
                                        float sin = ((float) Math.sin(f32 / f40)) * f39;
                                        float sin2 = ((float) Math.sin(((f31 * hypot) + f24) / f40)) * f39;
                                        f34 = (f25 * sin) + f34;
                                        f36 = (sin * f26) + f36;
                                        f37 = (f25 * sin2) + f37;
                                        f38 = (sin2 * f26) + f38;
                                    } else {
                                        str4 = str6;
                                        i13 = i16;
                                    }
                                    paint.setColor(a(d2, (f32 / f27) + f11));
                                    i14 = size;
                                    canvas.drawLine(f34, f36, f37, f38, paint);
                                }
                                size = i14;
                                f18 = f27;
                                i17 = i19;
                                str6 = str4;
                                i16 = i13;
                            }
                            f15 = f18;
                            str3 = str6;
                            i11 = i16;
                            i12 = size;
                            f17 = f24 + hypot;
                        } else {
                            f15 = f18;
                            str3 = str6;
                            i11 = i16;
                            i12 = size;
                            f17 = f24;
                        }
                        i16 = i11 + 1;
                        size = i12;
                        f19 = f23;
                        equals = z9;
                        f18 = f15;
                        str6 = str3;
                        f16 = f10;
                    }
                    float f41 = f18;
                    float f42 = f17;
                    if (arrayList2.size() == 1) {
                        paint.setStyle(Paint.Style.FILL);
                        paint.setColor(a(d2, f11));
                        canvas.drawCircle(((PointF) arrayList2.get(0)).x, ((PointF) arrayList2.get(0)).y, f10 / 2.0f, paint);
                        return f11 + 0.23f;
                    }
                    return (f42 / f41) + f11;
                }
                Paint paint2 = new Paint(1);
                float f43 = p0Var2.f22553c * f10;
                if (f43 < 2.0f) {
                    f12 = 2.0f;
                } else {
                    f12 = f43;
                }
                float f44 = f10 * 7.0f;
                Object obj2 = new Object();
                if (arrayList2.size() == 1) {
                    f(obj2, f10, p0Var2, paint2, d2, f11, f44, canvas, ((PointF) arrayList2.get(0)).x, ((PointF) arrayList2.get(0)).y, 0.0f, 0.0f);
                    return f11 + 0.23f;
                }
                Paint paint3 = paint2;
                kotlin.jvm.internal.w wVar2 = obj2;
                p0 p0Var3 = p0Var2;
                int size2 = arrayList2.size();
                int i20 = 1;
                float f45 = 0.0f;
                float f46 = 0.0f;
                while (i20 < size2) {
                    PointF pointF4 = (PointF) arrayList2.get(i20 - 1);
                    PointF pointF5 = (PointF) arrayList2.get(i20);
                    float f47 = pointF5.x - pointF4.x;
                    float f48 = pointF5.y - pointF4.y;
                    double d10 = f47;
                    float f49 = f17;
                    float f50 = f12;
                    double d11 = f48;
                    kotlin.jvm.internal.w wVar3 = wVar2;
                    float hypot2 = (float) Math.hypot(d10, d11);
                    if (hypot2 > 0.01f) {
                        float atan2 = (float) Math.atan2(d11, d10);
                        float f51 = f45 - f46;
                        while (f51 <= hypot2) {
                            if (f51 >= f49) {
                                float f52 = f51 / hypot2;
                                float f53 = (f47 * f52) + pointF4.x;
                                float f54 = (f52 * f48) + pointF4.y;
                                i10 = i20;
                                f13 = f48;
                                pointF = pointF4;
                                f14 = f47;
                                o0 o0Var = d2;
                                float f55 = f44;
                                wVar = wVar3;
                                Paint paint4 = paint3;
                                p0 p0Var4 = p0Var3;
                                f(wVar, f10, p0Var4, paint4, o0Var, f11, f55, canvas, f53, f54, atan2, f46 + f51);
                                p0Var3 = p0Var4;
                                paint3 = paint4;
                                d2 = o0Var;
                                f44 = f55;
                            } else {
                                wVar = wVar3;
                                i10 = i20;
                                pointF = pointF4;
                                f13 = f48;
                                f14 = f47;
                            }
                            f51 += f50;
                            wVar3 = wVar;
                            i20 = i10;
                            pointF4 = pointF;
                            f47 = f14;
                            f48 = f13;
                        }
                        wVar2 = wVar3;
                        i = i20;
                        f45 = f46 + f51;
                        f46 += hypot2;
                    } else {
                        wVar2 = wVar3;
                        i = i20;
                    }
                    i20 = i + 1;
                    arrayList2 = arrayList;
                    f12 = f50;
                    f17 = f49;
                }
                return (f46 / f44) + f11;
            }
        }
        return f11;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x007d, code lost:
    
        if (r1.equals("flowers") == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0099, code lost:
    
        r5 = r5 - 0.5f;
        r4 = 0.9f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0084, code lost:
    
        if (r1.equals("kisses") != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x008b, code lost:
    
        if (r1.equals("hearts") == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0092, code lost:
    
        if (r1.equals("butterflies") == false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void f(kotlin.jvm.internal.w r35, float r36, p7.p0 r37, android.graphics.Paint r38, p7.o0 r39, float r40, float r41, android.graphics.Canvas r42, float r43, float r44, float r45, float r46) {
        /*
            Method dump skipped, instructions count: 1236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p7.f(kotlin.jvm.internal.w, float, p7.p0, android.graphics.Paint, p7.o0, float, float, android.graphics.Canvas, float, float, float, float):void");
    }
}