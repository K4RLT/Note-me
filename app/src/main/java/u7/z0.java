package u7;
import g3.a;
import m2.f0;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public abstract class z0 {

    /* renamed from: a, reason: collision with root package name */
    public static final int f27081a;

    /* renamed from: b, reason: collision with root package name */
    public static final List f27082b;

    static {
        int argb = Color.argb(255, 230, 194, 122);
        f27081a = argb;
        f27082b = qe.m.h(new u1(-1, false, false, 0.0f, 0.0f, null, 118), new u1(-16777216, false, false, 0.0f, 0.0f, new f0(15), 62), new u1(argb, false, false, 0.0f, 0.0f, new y0(2), 62), new u1(-16777216, false, false, 0.0f, 0.0f, new f0(16), 58), new u1(-1, false, false, 0.0f, 0.0f, new f0(17), 58), new u1(-16777216, false, false, 0.0f, 0.0f, new f0(18), 62), new u1(-16777216, false, false, 0.0f, 0.0f, new f0(19), 62), new u1(-1, false, false, 0.0f, 0.0f, new f0(20), 60), new u1(argb, false, false, 0.0f, 0.0f, new f0(21), 52), new u1(-16777216, false, false, 0.0f, 0.0f, new f0(22), 62), new u1(-16777216, false, false, 0.0f, 0.0f, new f0(23), 62), new u1(Color.argb(255, 122, 74, 87), false, false, 0.58f, 0.2f, new f0(24), 10), new u1(Color.argb(255, 62, 58, 52), false, false, 0.26f, 0.16f, new f0(25), 10), new u1(Color.argb(255, 122, 74, 46), false, false, 0.34f, 0.22f, new f0(26), 10), new u1(Color.argb(255, 140, 19, 57), false, false, 0.3f, 0.16f, new f0(27), 14), new u1(Color.argb(255, 122, 74, 51), false, false, 0.22f, 0.06f, new f0(28), 10), new u1(Color.argb(255, 35, 35, 35), true, true, 0.36f, 0.28f, new f0(29), 8), new u1(-16777216, false, true, 0.2f, 0.38f, new y0(0), 8), new u1(-16777216, true, true, 0.32f, 0.4f, new y0(1), 8));
    }

    public static final void a(Canvas canvas, float f10, float f11, String str, int i, float f12, float f13, boolean z3, Typeface typeface) {
        float f14;
        float f15;
        Typeface typeface2;
        float f16;
        List list;
        float f17;
        int i10;
        float f18;
        String str2;
        Iterator it;
        Typeface typeface3;
        String str3 = str;
        canvas.getClass();
        str3.getClass();
        List list2 = f27082b;
        u1 u1Var = (u1) qe.l.y(i, list2);
        int i11 = 0;
        if (u1Var == null) {
            u1Var = (u1) list2.get(0);
        }
        float f19 = f11 / 768.0f;
        float f20 = 0.0f;
        if (z3) {
            f14 = f13;
        } else {
            f14 = 0.0f;
        }
        if (!z3) {
            f15 = f10 - f13;
        } else {
            f15 = f10;
        }
        float f21 = (f14 + f15) / 2.0f;
        float f22 = f11 * f12;
        float f23 = f15 - f14;
        Paint paint = new Paint(1);
        int i12 = u1Var.f26909a;
        float f24 = u1Var.e;
        paint.setColor(i12);
        paint.setTextAlign(Paint.Align.CENTER);
        if (typeface == null) {
            if (u1Var.f26910b) {
                typeface3 = Typeface.SERIF;
            } else {
                typeface3 = Typeface.SANS_SERIF;
            }
            typeface2 = Typeface.create(typeface3, u1Var.f26911c ? 1 : 0);
        } else {
            typeface2 = typeface;
        }
        paint.setTypeface(typeface2);
        if (u1Var.f26912d) {
            f16 = 2.0f;
            paint.setShadowLayer(6.0f * f19, 0.0f, f19 * 2.0f, Color.argb(170, 0, 0, 0));
        } else {
            f16 = 2.0f;
        }
        float f25 = 0.045f * f11;
        float f26 = 1.5f * f19;
        float f27 = 0.0f;
        float f28 = 0.0f;
        float f29 = f24 * f11 * 0.22f;
        List g8 = qe.m.g(str3);
        float f30 = 0.0f;
        float f31 = 0.0f;
        while (i11 < 2) {
            float f32 = (0.86f * f23) - (f29 * f16);
            float f33 = f23 * 0.22f;
            if (f32 < f33) {
                f32 = f33;
            }
            float f34 = 0.6511628f * f32;
            paint.setTextSize(0.065f * f11);
            List d2 = d(str3, paint, f34);
            while (true) {
                list = d2;
                Iterator it2 = list.iterator();
                if (it2.hasNext()) {
                    f17 = f19;
                    float measureText = paint.measureText((String) it2.next());
                    while (it2.hasNext()) {
                        measureText = Math.max(measureText, paint.measureText((String) it2.next()));
                        i11 = i11;
                    }
                    i10 = i11;
                    if (measureText <= f32 || paint.getTextSize() - f26 < f25) {
                        break;
                    }
                    paint.setTextSize(paint.getTextSize() - f26);
                    d2 = d(str3, paint, f34);
                    i11 = i10;
                    f19 = f17;
                } else {
                    l4.a.c();
                    return;
                }
            }
            ArrayList arrayList = new ArrayList(qe.m.d(list, 10));
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                String str4 = (String) it3.next();
                if (paint.measureText(str4) <= f32) {
                    it = it3;
                } else {
                    int length = str4.length();
                    while (true) {
                        str2 = "…";
                        if (length > 0) {
                            length--;
                            it = it3;
                            str2 = a5.a.g(mf.f.J(mf.f.H(length, str4)).toString(), "…");
                            if (paint.measureText(str2) <= f32) {
                                break;
                            } else {
                                it3 = it;
                            }
                        } else {
                            it = it3;
                            break;
                        }
                    }
                    str4 = str2;
                }
                arrayList.add(str4);
                it3 = it;
            }
            Paint.FontMetrics fontMetrics = paint.getFontMetrics();
            float f35 = fontMetrics.descent;
            float f36 = fontMetrics.ascent;
            f28 = f35 - f36;
            if (arrayList.size() > 1) {
                f18 = 1.95f * f28;
            } else {
                f18 = f28;
            }
            Iterator it4 = arrayList.iterator();
            if (it4.hasNext()) {
                float measureText2 = paint.measureText((String) it4.next());
                while (it4.hasNext()) {
                    measureText2 = Math.max(measureText2, paint.measureText((String) it4.next()));
                }
                float f37 = f16;
                float max = Math.max(a.c(f10, 0.05f, f37, measureText2), 0.32f * f10);
                float max2 = Math.max(a.c(f11, 0.025f, f37, f18), 0.09f * f11);
                f29 = f24 * max2;
                f27 = f36;
                g8 = arrayList;
                f31 = f18;
                i11 = i10 + 1;
                f19 = f17;
                f16 = 2.0f;
                str3 = str;
                f30 = max;
                f20 = max2;
            } else {
                l4.a.c();
                return;
            }
        }
        float f38 = f19;
        float f39 = u1Var.f26913f * f20;
        float f40 = (f29 * 2.0f) + f30;
        float f41 = f23 * 0.98f;
        if (f40 > f41) {
            f40 = f41;
        }
        float f42 = f40 / 2.0f;
        float f43 = ((f39 * 2.0f) + f20) / 2.0f;
        RectF rectF = new RectF(f21 - f42, f22 - f43, f21 + f42, f22 + f43);
        df.l lVar = u1Var.f26914g;
        Paint paint2 = new Paint(1);
        Paint paint3 = new Paint(1);
        paint3.setStyle(Paint.Style.STROKE);
        lVar.invoke(new r1(canvas, rectF, f21, f38, paint2, paint3));
        float centerY = (rectF.centerY() - (f31 / 2.0f)) - f27;
        Iterator it5 = g8.iterator();
        while (it5.hasNext()) {
            canvas.drawText((String) it5.next(), f21, centerY, paint);
            centerY += 0.95f * f28;
        }
    }

    public static final void b(Canvas canvas, float f10, float f11, String str, int i, Typeface typeface) {
        canvas.getClass();
        str.getClass();
        float f12 = f11 * 3.6f;
        float f13 = f12 * 0.67333335f;
        canvas.save();
        canvas.translate((f10 - f13) / 2.0f, (f11 / 2.0f) - (f12 / 2.0f));
        a(canvas, f13, f12, str, i, 0.5f, 0.0f, true, typeface);
        canvas.restore();
    }

    public static final RectF c(RectF rectF, float f10) {
        return new RectF(rectF.left + f10, rectF.top + f10, rectF.right - f10, rectF.bottom - f10);
    }

    public static final List d(String str, Paint paint, float f10) {
        List list;
        String obj = mf.f.I(str).toString();
        if (paint.measureText(obj) <= f10) {
            return qe.m.g(obj);
        }
        Pattern compile = Pattern.compile("\\s+");
        compile.getClass();
        obj.getClass();
        Matcher matcher = compile.matcher(obj);
        if (!matcher.find()) {
            list = qe.m.g(obj.toString());
        } else {
            ArrayList arrayList = new ArrayList(10);
            int i = 0;
            do {
                arrayList.add(obj.subSequence(i, matcher.start()).toString());
                i = matcher.end();
            } while (matcher.find());
            arrayList.add(obj.subSequence(i, obj.length()).toString());
            list = arrayList;
        }
        if (list.size() < 2) {
            return qe.m.g(obj);
        }
        int size = list.size();
        float f11 = Float.MAX_VALUE;
        int i10 = 1;
        for (int i11 = 1; i11 < size; i11++) {
            float abs = Math.abs(paint.measureText(qe.l.B(list.subList(0, i11), " ", null, null, null, 62)) - paint.measureText(qe.l.B(list.subList(i11, list.size()), " ", null, null, null, 62)));
            if (abs < f11) {
                i10 = i11;
                f11 = abs;
            }
        }
        return qe.m.h(qe.l.B(list.subList(0, i10), " ", null, null, null, 62), qe.l.B(list.subList(i10, list.size()), " ", null, null, null, 62));
    }
}
