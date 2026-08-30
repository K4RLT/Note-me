package w7;
import l7.b;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.CornerPathEffect;
import android.graphics.DashPathEffect;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class c5 {
    public static Path a(b bVar, float f10, float f11) {
        bVar.getClass();
        Path path = new Path();
        int i = b5.f27984a[bVar.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 10) {
                            return null;
                        }
                        Path path2 = new Path();
                        path2.addRect(new RectF(0.0f, 0.0f, f10, f11), Path.Direction.CW);
                        Path path3 = new Path();
                        float f12 = 0.025f * f10;
                        float f13 = 0.08f * f10;
                        for (float f14 = f13; f14 < f10; f14 += f13) {
                            float f15 = f14 - f12;
                            float f16 = f14 + f12;
                            RectF rectF = new RectF(f15, -f12, f16, f12);
                            Path.Direction direction = Path.Direction.CW;
                            path3.addOval(rectF, direction);
                            path3.addOval(new RectF(f15, f11 - f12, f16, f11 + f12), direction);
                        }
                        for (float f17 = f13; f17 < f11; f17 += f13) {
                            float f18 = f17 - f12;
                            float f19 = f17 + f12;
                            RectF rectF2 = new RectF(-f12, f18, f12, f19);
                            Path.Direction direction2 = Path.Direction.CW;
                            path3.addOval(rectF2, direction2);
                            path3.addOval(new RectF(f10 - f12, f18, f10 + f12, f19), direction2);
                        }
                        path.op(path2, path3, Path.Op.DIFFERENCE);
                    } else {
                        path.moveTo(0.0f, f11);
                        path.lineTo(0.0f, 0.5f * f10);
                        path.arcTo(new RectF(0.0f, 0.0f, f10, f10), 180.0f, 180.0f, false);
                        path.lineTo(f10, f11);
                        path.close();
                    }
                } else {
                    float f20 = f10 * 0.5f;
                    float f21 = f11 * 0.28f;
                    path.moveTo(f20, f21);
                    float f22 = f11 * 0.08f;
                    float f23 = 0.06f * f11;
                    float f24 = 0.3f * f11;
                    path.cubicTo(0.42f * f10, f22, 0.11f * f10, f23, 0.03f * f10, f24);
                    float f25 = f11 * 0.5f;
                    float f26 = 0.72f * f11;
                    path.cubicTo((-f10) * 0.05f, f25, 0.14f * f10, f26, f20, f11 * 0.97f);
                    path.cubicTo(0.86f * f10, f26, 1.05f * f10, f25, f10 * 0.97f, f24);
                    path.cubicTo(0.89f * f10, f23, f10 * 0.58f, f22, f20, f21);
                    path.close();
                }
            } else {
                path.addRect(new RectF(0.0f, 0.0f, f10, f11), Path.Direction.CW);
            }
        } else {
            path.addOval(new RectF(0.0f, 0.0f, f10, f11), Path.Direction.CW);
        }
        path.offset((-f10) / 2.0f, (-f11) / 2.0f);
        return path;
    }

    public static BitmapShader b(Bitmap bitmap, float f10, float f11) {
        float max = Math.max(f10 / bitmap.getWidth(), f11 / bitmap.getHeight());
        Matrix matrix = new Matrix();
        matrix.setScale(max, max);
        matrix.postTranslate(((-bitmap.getWidth()) * max) / 2.0f, ((-bitmap.getHeight()) * max) / 2.0f);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        bitmapShader.setLocalMatrix(matrix);
        return bitmapShader;
    }

    public static Paint c(float f10) {
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(0.018f * f10);
        paint.setColor(Color.argb(150, 120, 120, 128));
        float f11 = f10 * 0.05f;
        paint.setPathEffect(new DashPathEffect(new float[]{f11, f11}, 0.0f));
        return paint;
    }

    public static final void d(float f10, kotlin.jvm.internal.u uVar, Path path, float f11, float f12, float f13, float f14) {
        float f15;
        float f16 = f13 - f11;
        float f17 = f14 - f12;
        float hypot = (float) Math.hypot(f16, f17);
        int max = Math.max(3, Math.round(hypot / f10));
        float f18 = f16 / hypot;
        float f19 = f17 / hypot;
        float f20 = -f18;
        if (!uVar.f19783u) {
            path.moveTo(f11, f12);
            uVar.f19783u = true;
        }
        if (1 <= max) {
            int i = 1;
            while (true) {
                float f21 = i / max;
                float f22 = (f16 * f21) + f11;
                float f23 = (f21 * f17) + f12;
                if (i % 2 == 1) {
                    f15 = 0.5f * f10;
                } else {
                    f15 = 0.0f;
                }
                path.lineTo((f19 * f15) + f22, (f15 * f20) + f23);
                if (i != max) {
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v36, types: [kotlin.jvm.internal.u, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r22v1, types: [kotlin.jvm.internal.u, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v30, types: [java.lang.Object, kotlin.jvm.internal.w] */
    public static void e(Canvas canvas, d5 d5Var, Bitmap bitmap, float f10, float f11, boolean z3, Integer num, ColorFilter colorFilter, ArrayList arrayList, Bitmap bitmap2) {
        int argb;
        int i;
        int argb2;
        canvas.getClass();
        d5Var.getClass();
        Paint paint = new Paint(1);
        paint.setFilterBitmap(true);
        paint.setColorFilter(colorFilter);
        Paint paint2 = new Paint(1);
        paint2.setColor(Color.argb(255, 232, 232, 236));
        if (d5Var.a()) {
            List s10 = s(d5Var, f10, f11);
            n(canvas, s10, s10.size() > 1 ? arrayList : qe.m.g(bitmap), paint, z3);
            if (bitmap2 == null) {
                if (z3) {
                    canvas.drawRect(new RectF((-f10) / 2.0f, (-f11) / 2.0f, f10 / 2.0f, f11 / 2.0f), c(f10));
                    return;
                }
                return;
            } else {
                Paint paint3 = new Paint(1);
                paint3.setFilterBitmap(true);
                paint3.setColorFilter(colorFilter);
                canvas.drawBitmap(bitmap2, (Rect) null, new RectF((-f10) / 2.0f, (-f11) / 2.0f, f10 / 2.0f, f11 / 2.0f), paint3);
                return;
            }
        }
        b bVar = d5Var.f28080a;
        if (bVar == b.POLAROID) {
            float f12 = (-f10) / 2.0f;
            float f13 = (-f11) / 2.0f;
            float f14 = f10 / 2.0f;
            RectF rectF = new RectF(f12, f13, f14, f11 / 2.0f);
            Paint paint4 = new Paint(1);
            paint4.setColor(Color.argb(70, 0, 0, 0));
            paint4.setMaskFilter(new BlurMaskFilter(f10 * 0.03f, BlurMaskFilter.Blur.NORMAL));
            canvas.save();
            canvas.translate(0.0f, f11 * 0.02f);
            canvas.drawRoundRect(rectF, 0.0f, 0.0f, paint4);
            canvas.restore();
            Paint paint5 = new Paint(1);
            paint5.setColor(num != null ? num.intValue() : -1);
            canvas.drawRoundRect(rectF, 0.0f, 0.0f, paint5);
            float f15 = f10 * 0.06f;
            float f16 = f13 + (f11 * 0.05f);
            RectF rectF2 = new RectF(f12 + f15, f16, f14 - f15, (f10 - (2 * f15)) + f16);
            if (bitmap != null) {
                paint.setShader(b(bitmap, rectF2.width(), rectF2.height()));
                canvas.save();
                canvas.translate(rectF2.centerX(), rectF2.centerY());
                canvas.drawRect((-rectF2.width()) / 2.0f, (-rectF2.height()) / 2.0f, rectF2.width() / 2.0f, rectF2.height() / 2.0f, paint);
                canvas.restore();
            } else {
                canvas.drawRect(rectF2, paint2);
                if (z3) {
                    canvas.save();
                    canvas.translate(rectF2.centerX(), rectF2.centerY());
                    canvas.drawRect((-rectF2.width()) / 2.0f, (-rectF2.height()) / 2.0f, rectF2.width() / 2.0f, rectF2.height() / 2.0f, c(rectF2.width()));
                    canvas.restore();
                }
            }
            Paint paint6 = new Paint(1);
            paint6.setStyle(Paint.Style.STROKE);
            paint6.setStrokeWidth(f10 * 0.006f);
            paint6.setColor(Color.argb(28, 0, 0, 0));
            canvas.drawRect(rectF2, paint6);
            return;
        }
        if (bVar == b.SCRAP) {
            int intValue = num != null ? num.intValue() : -791593;
            float f17 = f10 * 0.045f;
            Path path = new Path();
            float f18 = (-f10) / 2.0f;
            float f19 = (-f11) / 2.0f;
            float f20 = f10 / 2.0f;
            float f21 = f11 / 2.0f;
            Object obj = new Object();
            d(f17, obj, path, f18, f19, f20, f19);
            d(f17, obj, path, f20, f19, f20, f21);
            d(f17, obj, path, f20, f21, f18, f21);
            d(f17, obj, path, f18, f21, f18, f19);
            path.close();
            Paint paint7 = new Paint(1);
            paint7.setColor(Color.argb(70, 0, 0, 0));
            paint7.setMaskFilter(new BlurMaskFilter(f10 * 0.03f, BlurMaskFilter.Blur.NORMAL));
            canvas.save();
            canvas.translate(0.0f, f11 * 0.02f);
            canvas.drawPath(path, paint7);
            canvas.restore();
            Paint paint8 = new Paint(1);
            paint8.setColor(intValue);
            canvas.drawPath(path, paint8);
            Paint paint9 = new Paint(1);
            Paint.Style style = Paint.Style.STROKE;
            paint9.setStyle(style);
            paint9.setStrokeWidth(f10 * 0.006f);
            paint9.setColor(Color.argb(40, 0, 0, 0));
            canvas.drawPath(path, paint9);
            float f22 = f10 * 0.74f;
            float f23 = 0.74f * f11;
            canvas.save();
            canvas.rotate(-4.0f);
            RectF rectF3 = new RectF((-f22) / 2.0f, (-f23) / 2.0f, f22 / 2.0f, f23 / 2.0f);
            float f24 = f10 * 0.012f;
            RectF rectF4 = new RectF(rectF3.left - f24, rectF3.top - f24, rectF3.right + f24, rectF3.bottom + f24);
            Paint paint10 = new Paint(1);
            paint10.setColor(-1);
            canvas.drawRect(rectF4, paint10);
            if (bitmap != null) {
                paint.setShader(b(bitmap, rectF3.width(), rectF3.height()));
                canvas.save();
                canvas.translate(rectF3.centerX(), rectF3.centerY());
                canvas.drawRect((-rectF3.width()) / 2.0f, (-rectF3.height()) / 2.0f, rectF3.width() / 2.0f, rectF3.height() / 2.0f, paint);
                canvas.restore();
            } else {
                canvas.drawRect(rectF3, paint2);
                if (z3) {
                    canvas.save();
                    canvas.translate(rectF3.centerX(), rectF3.centerY());
                    canvas.drawRect((-rectF3.width()) / 2.0f, (-rectF3.height()) / 2.0f, rectF3.width() / 2.0f, rectF3.height() / 2.0f, c(rectF3.width()));
                    canvas.restore();
                }
            }
            Paint paint11 = new Paint(1);
            paint11.setStyle(style);
            paint11.setStrokeWidth(f10 * 0.005f);
            paint11.setColor(Color.argb(30, 0, 0, 0));
            canvas.drawRect(rectF3, paint11);
            g(canvas, rectF4, Math.min(f22, f23) * 0.16f);
            canvas.restore();
            return;
        }
        if (bVar == b.SCRAP_PREMIUM) {
            if (num != null) {
                argb2 = num.intValue();
                i = 255;
            } else {
                i = 255;
                argb2 = Color.argb(255, 245, 240, 230);
            }
            int argb3 = Color.argb(i, 40, 45, 55);
            RectF rectF5 = new RectF((-f10) / 2.0f, (-f11) / 2.0f, f10 / 2.0f, f11 / 2.0f);
            Paint paint12 = new Paint(1);
            paint12.setColor(Color.argb(120, 0, 0, 0));
            BlurMaskFilter.Blur blur = BlurMaskFilter.Blur.NORMAL;
            paint12.setMaskFilter(new BlurMaskFilter(f10 * 0.04f, blur));
            canvas.save();
            canvas.translate(0.0f, f11 * 0.02f);
            canvas.drawRect(rectF5, paint12);
            canvas.restore();
            Paint paint13 = new Paint(1);
            paint13.setColor(argb2);
            canvas.drawRect(rectF5, paint13);
            Paint paint14 = new Paint();
            paint14.setColor(Color.argb(100, 255, 255, 255));
            Paint paint15 = new Paint();
            paint15.setColor(Color.argb(40, 0, 0, 0));
            float f25 = rectF5.left;
            float f26 = rectF5.top;
            float f27 = f10 * 0.01f;
            canvas.drawRect(f25, f26, rectF5.right, f26 + f27, paint14);
            float f28 = rectF5.left;
            canvas.drawRect(f28, rectF5.top, f28 + f27, rectF5.bottom, paint14);
            float f29 = rectF5.right;
            canvas.drawRect(f29 - f27, rectF5.top, f29, rectF5.bottom, paint15);
            float f30 = rectF5.left;
            float f31 = rectF5.bottom;
            canvas.drawRect(f30, f31 - f27, rectF5.right, f31, paint15);
            float f32 = f10 * 0.08f;
            RectF rectF6 = new RectF(rectF5.left + f32, rectF5.top + f32, rectF5.right - f32, rectF5.bottom - f32);
            canvas.save();
            canvas.translate(0.0f, f11 * 0.01f);
            Paint paint16 = new Paint(1);
            paint16.setColor(Color.argb(80, 0, 0, 0));
            paint16.setMaskFilter(new BlurMaskFilter(f10 * 0.02f, blur));
            canvas.drawRect(rectF6, paint16);
            canvas.restore();
            Paint paint17 = new Paint(1);
            paint17.setColor(argb3);
            canvas.drawRect(rectF6, paint17);
            Paint paint18 = new Paint(1);
            paint18.setColor(Color.argb(100, 0, 0, 0));
            paint18.setMaskFilter(new BlurMaskFilter(f10 * 0.008f, blur));
            Paint paint19 = new Paint(1);
            paint19.setColor(Color.argb(255, 210, 180, FacebookMediationAdapter.ERROR_FAILED_TO_PRESENT_AD));
            float f33 = f10 * 0.015f;
            float f34 = f10 * 0.035f;
            l(canvas, f33, paint18, paint19, rectF6.left + f34, rectF6.top + f34);
            l(canvas, f33, paint18, paint19, rectF6.right - f34, rectF6.top + f34);
            l(canvas, f33, paint18, paint19, rectF6.left + f34, rectF6.bottom - f34);
            l(canvas, f33, paint18, paint19, rectF6.right - f34, rectF6.bottom - f34);
            RectF rectF7 = new RectF(rectF6.left + f32, rectF6.top + f32, rectF6.right - f32, rectF6.bottom - f32);
            RectF rectF8 = new RectF(rectF7.left - f33, rectF7.top - f33, rectF7.right + f33, rectF7.bottom + f33);
            LinearGradient linearGradient = new LinearGradient(rectF8.left, rectF8.top, rectF8.right, rectF8.bottom, new int[]{-597382, -3433647, -593216, -3433647}, new float[]{0.0f, 0.3f, 0.7f, 1.0f}, Shader.TileMode.CLAMP);
            Paint paint20 = new Paint(1);
            paint20.setShader(linearGradient);
            canvas.drawRect(rectF8, paint20);
            float f35 = rectF7.left;
            float f36 = rectF7.top;
            float f37 = f10 * 0.005f;
            Paint paint21 = new Paint();
            paint21.setColor(Color.argb(120, 0, 0, 0));
            canvas.drawRect(f35, f36, rectF7.right, f36 + f37, paint21);
            float f38 = rectF7.left;
            float f39 = rectF7.bottom;
            Paint paint22 = new Paint();
            paint22.setColor(Color.argb(120, 0, 0, 0));
            canvas.drawRect(f38, rectF7.top, f38 + f37, f39, paint22);
            if (bitmap != null) {
                paint.setShader(b(bitmap, rectF7.width(), rectF7.height()));
                canvas.save();
                canvas.translate(rectF7.centerX(), rectF7.centerY());
                canvas.drawRect((-rectF7.width()) / 2.0f, (-rectF7.height()) / 2.0f, rectF7.width() / 2.0f, rectF7.height() / 2.0f, paint);
                canvas.restore();
                return;
            }
            canvas.drawRect(rectF7, paint2);
            if (z3) {
                canvas.save();
                canvas.translate(rectF7.centerX(), rectF7.centerY());
                canvas.drawRect((-rectF7.width()) / 2.0f, (-rectF7.height()) / 2.0f, rectF7.width() / 2.0f, rectF7.height() / 2.0f, c(rectF7.width()));
                canvas.restore();
                return;
            }
            return;
        }
        if (bVar == b.SCRAP_CAMEO) {
            int intValue2 = num != null ? num.intValue() : Color.argb(255, 230, 225, 215);
            float f40 = (-f10) / 2.0f;
            float f41 = (-f11) / 2.0f;
            float f42 = f10 / 2.0f;
            float f43 = f11 / 2.0f;
            RectF rectF9 = new RectF(f40, f41, f42, f43);
            Paint paint23 = new Paint(1);
            paint23.setColor(Color.argb(120, 0, 0, 0));
            BlurMaskFilter.Blur blur2 = BlurMaskFilter.Blur.NORMAL;
            paint23.setMaskFilter(new BlurMaskFilter(f10 * 0.04f, blur2));
            canvas.save();
            canvas.translate(0.0f, f11 * 0.02f);
            canvas.drawRect(rectF9, paint23);
            canvas.restore();
            Paint paint24 = new Paint(1);
            paint24.setColor(intValue2);
            canvas.drawRect(rectF9, paint24);
            float f44 = f10 * 0.15f;
            float f45 = f11 * 0.15f;
            RectF rectF10 = new RectF(f40 + f44, f41 + f45, f42 - f44, f43 - f45);
            canvas.save();
            canvas.translate(0.0f, f11 * 0.015f);
            Paint paint25 = new Paint(1);
            paint25.setColor(Color.argb(80, 0, 0, 0));
            paint25.setMaskFilter(new BlurMaskFilter(f10 * 0.03f, blur2));
            canvas.drawOval(rectF10, paint25);
            canvas.restore();
            float f46 = f10 * 0.015f;
            RectF rectF11 = new RectF(rectF10.left - f46, rectF10.top - f46, rectF10.right + f46, rectF10.bottom + f46);
            LinearGradient linearGradient2 = new LinearGradient(rectF11.left, rectF11.top, rectF11.right, rectF11.bottom, new int[]{-597382, -3433647, -593216, -3433647}, new float[]{0.0f, 0.3f, 0.7f, 1.0f}, Shader.TileMode.CLAMP);
            Paint paint26 = new Paint(1);
            paint26.setShader(linearGradient2);
            canvas.drawOval(rectF11, paint26);
            Paint paint27 = new Paint(1);
            Paint.Style style2 = Paint.Style.STROKE;
            paint27.setStyle(style2);
            paint27.setStrokeWidth(f10 * 0.005f);
            paint27.setColor(Color.argb(150, 0, 0, 0));
            canvas.drawOval(rectF10, paint27);
            Path path2 = new Path();
            path2.addOval(rectF10, Path.Direction.CW);
            if (bitmap != null) {
                paint.setShader(b(bitmap, rectF10.width(), rectF10.height()));
                canvas.drawPath(path2, paint);
            } else {
                canvas.drawPath(path2, paint2);
                if (z3) {
                    canvas.drawPath(path2, c(f10));
                }
            }
            Paint paint28 = new Paint(1);
            paint28.setStyle(style2);
            paint28.setStrokeWidth(f10 * 0.012f);
            paint28.setColor(Color.argb(40, 0, 0, 0));
            Paint paint29 = new Paint(1);
            paint29.setStyle(style2);
            paint29.setStrokeWidth(f10 * 0.006f);
            paint29.setColor(Color.argb(100, 255, 255, 255));
            float f47 = f10 * 0.12f;
            float f48 = f47 * 1.2f;
            k(f47, canvas, f10, paint29, paint28, rectF9.left + f48, rectF9.top + f48, -1.0f, -1.0f);
            k(f47, canvas, f10, paint29, paint28, rectF9.right - f48, rectF9.top + f48, 1.0f, -1.0f);
            k(f47, canvas, f10, paint29, paint28, rectF9.left + f48, rectF9.bottom - f48, -1.0f, 1.0f);
            k(f47, canvas, f10, paint29, paint28, rectF9.right - f48, rectF9.bottom - f48, 1.0f, 1.0f);
            return;
        }
        if (bVar == b.SCRAP_SLOTTED) {
            int intValue3 = num != null ? num.intValue() : Color.argb(255, 250, 250, 250);
            RectF rectF12 = new RectF((-f10) / 2.0f, (-f11) / 2.0f, f10 / 2.0f, f11 / 2.0f);
            Paint paint30 = new Paint(1);
            paint30.setColor(Color.argb(100, 0, 0, 0));
            BlurMaskFilter.Blur blur3 = BlurMaskFilter.Blur.NORMAL;
            paint30.setMaskFilter(new BlurMaskFilter(f10 * 0.04f, blur3));
            canvas.save();
            canvas.translate(0.0f, f11 * 0.02f);
            canvas.drawRect(rectF12, paint30);
            canvas.restore();
            Paint paint31 = new Paint(1);
            paint31.setColor(intValue3);
            canvas.drawRect(rectF12, paint31);
            float f49 = f10 * 0.12f;
            RectF rectF13 = new RectF(rectF12.left + f49, rectF12.top + f49, rectF12.right - f49, rectF12.bottom - f49);
            Paint paint32 = new Paint(1);
            paint32.setColor(Color.argb(60, 0, 0, 0));
            paint32.setMaskFilter(new BlurMaskFilter(f10 * 0.015f, blur3));
            float f50 = f10 * 0.05f;
            Path path3 = new Path();
            path3.moveTo(rectF13.left + f50, rectF13.top);
            path3.lineTo(rectF13.right - f50, rectF13.top);
            path3.lineTo(rectF13.right, rectF13.top + f50);
            path3.lineTo(rectF13.right, rectF13.bottom - f50);
            path3.lineTo(rectF13.right - f50, rectF13.bottom);
            path3.lineTo(rectF13.left + f50, rectF13.bottom);
            path3.lineTo(rectF13.left, rectF13.bottom - f50);
            path3.lineTo(rectF13.left, rectF13.top + f50);
            path3.close();
            canvas.save();
            canvas.translate(0.0f, f10 * 0.008f);
            canvas.drawPath(path3, paint32);
            canvas.restore();
            if (bitmap != null) {
                paint.setShader(b(bitmap, rectF13.width(), rectF13.height()));
                canvas.drawPath(path3, paint);
            } else {
                canvas.drawPath(path3, paint2);
                if (z3) {
                    canvas.drawPath(path3, c(f10));
                }
            }
            Paint paint33 = new Paint(1);
            Paint.Style style3 = Paint.Style.STROKE;
            paint33.setStyle(style3);
            float f51 = 0.004f * f10;
            paint33.setStrokeWidth(f51);
            paint33.setColor(Color.argb(120, 0, 0, 0));
            Paint paint34 = new Paint(1);
            paint34.setStyle(style3);
            paint34.setStrokeWidth(f51);
            paint34.setColor(Color.argb(255, 255, 255, 255));
            m(f50, canvas, f10, paint34, paint33, rectF13.left, rectF13.top, 1.0f, 1.0f);
            m(f50, canvas, f10, paint34, paint33, rectF13.right, rectF13.top, -1.0f, 1.0f);
            m(f50, canvas, f10, paint34, paint33, rectF13.left, rectF13.bottom, 1.0f, -1.0f);
            m(f50, canvas, f10, paint34, paint33, rectF13.right, rectF13.bottom, -1.0f, -1.0f);
            return;
        }
        if (bVar == b.MUSEUM) {
            int intValue4 = num != null ? num.intValue() : Color.argb(255, 30, 30, 30);
            RectF rectF14 = new RectF((-f10) / 2.0f, (-f11) / 2.0f, f10 / 2.0f, f11 / 2.0f);
            Paint paint35 = new Paint(1);
            paint35.setColor(Color.argb(100, 0, 0, 0));
            paint35.setMaskFilter(new BlurMaskFilter(f10 * 0.04f, BlurMaskFilter.Blur.NORMAL));
            canvas.save();
            canvas.translate(0.0f, f11 * 0.02f);
            canvas.drawRect(rectF14, paint35);
            canvas.restore();
            Paint paint36 = new Paint(1);
            paint36.setColor(intValue4);
            canvas.drawRect(rectF14, paint36);
            float f52 = f10 * 0.7f;
            float f53 = 0.7f * f11;
            RectF rectF15 = new RectF((-f52) / 2.0f, (-f53) / 2.0f, f52 / 2.0f, f53 / 2.0f);
            if (bitmap != null) {
                paint.setShader(b(bitmap, rectF15.width(), rectF15.height()));
                canvas.save();
                canvas.translate(rectF15.centerX(), rectF15.centerY());
                canvas.drawRect((-rectF15.width()) / 2.0f, (-rectF15.height()) / 2.0f, rectF15.width() / 2.0f, rectF15.height() / 2.0f, paint);
                canvas.restore();
            } else {
                canvas.drawRect(rectF15, paint2);
                if (z3) {
                    canvas.save();
                    canvas.translate(rectF15.centerX(), rectF15.centerY());
                    canvas.drawRect((-rectF15.width()) / 2.0f, (-rectF15.height()) / 2.0f, rectF15.width() / 2.0f, rectF15.height() / 2.0f, c(rectF15.width()));
                    canvas.restore();
                }
            }
            float f54 = rectF15.left;
            float f55 = rectF15.top;
            float f56 = f10 * 0.015f;
            Paint paint37 = new Paint();
            paint37.setColor(Color.argb(120, 0, 0, 0));
            canvas.drawRect(f54, f55, rectF15.right, f55 + f56, paint37);
            float f57 = rectF15.left;
            float f58 = rectF15.bottom;
            Paint paint38 = new Paint();
            paint38.setColor(Color.argb(120, 0, 0, 0));
            canvas.drawRect(f57, rectF15.top, f56 + f57, f58, paint38);
            float f59 = rectF15.right;
            float f60 = f10 * 0.01f;
            float f61 = rectF15.top;
            float f62 = rectF15.bottom;
            Paint paint39 = new Paint();
            paint39.setColor(Color.argb(40, 255, 255, 255));
            canvas.drawRect(f59 - f60, f61, f59, f62, paint39);
            float f63 = rectF15.left;
            float f64 = rectF15.bottom;
            float f65 = rectF15.right;
            Paint paint40 = new Paint();
            paint40.setColor(Color.argb(40, 255, 255, 255));
            canvas.drawRect(f63, f64 - f60, f65, f64, paint40);
            return;
        }
        if (bVar == b.GOLD) {
            RectF rectF16 = new RectF((-f10) / 2.0f, (-f11) / 2.0f, f10 / 2.0f, f11 / 2.0f);
            Path path4 = new Path();
            path4.addRect(rectF16, Path.Direction.CW);
            Paint paint41 = new Paint(1);
            paint41.setColor(Color.argb(60, 0, 0, 0));
            paint41.setMaskFilter(new BlurMaskFilter(f10 * 0.03f, BlurMaskFilter.Blur.NORMAL));
            canvas.save();
            canvas.translate(0.0f, f11 * 0.015f);
            canvas.drawPath(path4, paint41);
            canvas.restore();
            if (bitmap != null) {
                paint.setShader(b(bitmap, f10, f11));
                canvas.drawPath(path4, paint);
            } else {
                canvas.drawPath(path4, paint2);
                if (z3) {
                    canvas.drawPath(path4, c(f10));
                }
            }
            float f66 = f10 * 0.035f;
            LinearGradient linearGradient3 = new LinearGradient(rectF16.left, rectF16.top, rectF16.right, rectF16.bottom, new int[]{-597382, -3433647, -597382, -593216, -3433647}, new float[]{0.0f, 0.25f, 0.5f, 0.75f, 1.0f}, Shader.TileMode.CLAMP);
            Paint paint42 = new Paint(1);
            Paint.Style style4 = Paint.Style.STROKE;
            paint42.setStyle(style4);
            paint42.setStrokeWidth(f66);
            paint42.setShader(linearGradient3);
            float f67 = f66 / 2;
            canvas.drawRect(new RectF(rectF16.left + f67, rectF16.top + f67, rectF16.right - f67, rectF16.bottom - f67), paint42);
            Paint paint43 = new Paint(1);
            paint43.setStyle(style4);
            paint43.setStrokeWidth(f10 * 0.003f);
            paint43.setColor(Color.argb(100, 255, 255, 255));
            canvas.drawRect(new RectF(rectF16.left + f66, rectF16.top + f66, rectF16.right - f66, rectF16.bottom - f66), paint43);
            canvas.drawRect(rectF16, paint43);
            return;
        }
        if (bVar == b.TICKET) {
            q(canvas, bitmap, f10, f11, z3, paint, paint2, num);
            return;
        }
        if (bVar == b.TORN) {
            Path path5 = new Path();
            float f68 = (-f10) / 2.0f;
            float f69 = (-f11) / 2.0f;
            float f70 = f10 / 2.0f;
            float f71 = f11 / 2.0f;
            Object obj2 = new Object();
            Object obj3 = new Object();
            obj3.f19785u = 12345;
            z(f10, obj2, path5, obj3, f68, f69, f70, f69);
            z(f10, obj2, path5, obj3, f70, f69, f70, f71);
            z(f10, obj2, path5, obj3, f70, f71, f68, f71);
            z(f10, obj2, path5, obj3, f68, f71, f68, f69);
            path5.close();
            Paint paint44 = new Paint(1);
            paint44.setColor(Color.argb(50, 0, 0, 0));
            paint44.setMaskFilter(new BlurMaskFilter(f10 * 0.02f, BlurMaskFilter.Blur.NORMAL));
            canvas.save();
            canvas.translate(0.0f, f11 * 0.01f);
            canvas.drawPath(path5, paint44);
            canvas.restore();
            if (bitmap != null) {
                paint.setShader(b(bitmap, f10, f11));
                canvas.drawPath(path5, paint);
            } else {
                canvas.drawPath(path5, paint2);
            }
            Paint paint45 = new Paint(1);
            paint45.setStyle(Paint.Style.STROKE);
            paint45.setStrokeWidth(f10 * 0.025f);
            paint45.setColor(Color.argb(120, 255, 255, 255));
            canvas.drawPath(path5, paint45);
            if (bitmap == null && z3) {
                canvas.drawPath(path5, c(f10));
                return;
            }
            return;
        }
        b bVar2 = b.FILM;
        if (bVar == bVar2) {
            int intValue5 = num != null ? num.intValue() : Color.argb(255, 20, 20, 20);
            float f72 = (-f10) / 2.0f;
            float f73 = (-f11) / 2.0f;
            float f74 = f10 / 2.0f;
            float f75 = f11 / 2.0f;
            RectF rectF17 = new RectF(f72, f73, f74, f75);
            Paint paint46 = new Paint(1);
            paint46.setColor(Color.argb(100, 0, 0, 0));
            float f76 = f10 * 0.03f;
            paint46.setMaskFilter(new BlurMaskFilter(f76, BlurMaskFilter.Blur.NORMAL));
            canvas.save();
            canvas.translate(0.0f, f11 * 0.015f);
            canvas.drawRect(rectF17, paint46);
            canvas.restore();
            Path path6 = new Path();
            path6.addRect(rectF17, Path.Direction.CW);
            Path path7 = new Path();
            List y10 = y(u(bVar2), f10, f11);
            Iterator it = y10.iterator();
            while (it.hasNext()) {
                path7.addRect((RectF) it.next(), Path.Direction.CW);
            }
            float f77 = f10 * 0.04f;
            float f78 = f10 * 0.02f;
            float f79 = f73 + f77;
            while (f79 < f75 - f76) {
                float f80 = f72 + f78;
                float f81 = f78;
                float f82 = f72;
                float f83 = f79 + f76;
                RectF rectF18 = new RectF(f80, f79, f80 + f77, f83);
                Path.Direction direction = Path.Direction.CW;
                path7.addRect(rectF18, direction);
                float f84 = f74 - f81;
                path7.addRect(new RectF(f84 - f77, f79, f84, f83), direction);
                f79 += f77 + f76;
                f78 = f81;
                f72 = f82;
                f74 = f74;
            }
            Path path8 = new Path();
            path8.op(path6, path7, Path.Op.DIFFERENCE);
            n(canvas, y10, arrayList, paint, z3);
            Paint paint47 = new Paint(1);
            paint47.setColor(intValue5);
            canvas.drawPath(path8, paint47);
            return;
        }
        if (bVar == b.WASHI) {
            float f85 = (-f10) / 2.0f;
            float f86 = (-f11) / 2.0f;
            float f87 = f10 / 2.0f;
            float f88 = f11 / 2.0f;
            RectF rectF19 = new RectF(f85, f86, f87, f88);
            Paint paint48 = new Paint(1);
            paint48.setColor(Color.argb(50, 0, 0, 0));
            float f89 = f10 * 0.02f;
            BlurMaskFilter.Blur blur4 = BlurMaskFilter.Blur.NORMAL;
            paint48.setMaskFilter(new BlurMaskFilter(f89, blur4));
            canvas.save();
            canvas.translate(0.0f, f11 * 0.01f);
            canvas.drawRect(rectF19, paint48);
            canvas.restore();
            if (bitmap != null) {
                paint.setShader(b(bitmap, f10, f11));
                canvas.drawRect(rectF19, paint);
            } else {
                canvas.drawRect(rectF19, paint2);
                if (z3) {
                    canvas.drawRect(rectF19, c(f10));
                }
            }
            Paint paint49 = new Paint(1);
            paint49.setStyle(Paint.Style.STROKE);
            paint49.setStrokeWidth(f89);
            paint49.setColor(Color.argb(200, 255, 255, 255));
            canvas.drawRect(rectF19, paint49);
            int intValue6 = num != null ? num.intValue() : Color.argb(160, 240, 200, 150);
            Paint paint50 = new Paint(1);
            paint50.setColor(intValue6);
            Paint paint51 = new Paint(1);
            paint51.setColor(Color.argb(40, 0, 0, 0));
            paint51.setMaskFilter(new BlurMaskFilter(f10 * 0.01f, blur4));
            r(canvas, f10, paint51, paint50, f85, f86);
            r(canvas, f10, paint51, paint50, f87, f88);
            return;
        }
        if (bVar == b.SCALLOPED) {
            j(canvas, bitmap, f10, f11, z3, paint, paint2, num);
            return;
        }
        if (bVar == b.POLAROID_CAMERA) {
            i(canvas, f10, f11, z3, paint, arrayList);
            return;
        }
        if (bVar == b.FILM_SINGLE) {
            int intValue7 = num != null ? num.intValue() : Color.argb(255, 10, 10, 10);
            float f90 = f10 / 2.0f;
            float f91 = f11 / 2.0f;
            float f92 = -f90;
            float f93 = -f91;
            RectF rectF20 = new RectF(f92, f93, f90, f91);
            Paint paint52 = new Paint(1);
            paint52.setColor(Color.argb(100, 0, 0, 0));
            paint52.setMaskFilter(new BlurMaskFilter(f10 * 0.03f, BlurMaskFilter.Blur.NORMAL));
            canvas.save();
            canvas.translate(0.0f, f11 * 0.015f);
            canvas.drawRect(rectF20, paint52);
            canvas.restore();
            Path path9 = new Path();
            Path.Direction direction2 = Path.Direction.CW;
            path9.addRect(rectF20, direction2);
            Path path10 = new Path();
            float f94 = f10 * 0.15f;
            float f95 = 2;
            float f96 = f10 - (f95 * f94);
            float f97 = f11 - (f95 * (f11 * 0.08f));
            float f98 = (-f96) / 2.0f;
            float f99 = (-f97) / 2.0f;
            float f100 = f96 / 2.0f;
            float f101 = f97 / 2.0f;
            path10.addRect(f98, f99, f100, f101, direction2);
            float f102 = f10 * 0.04f;
            float f103 = f11 * 0.06f;
            float f104 = f94 / 2.0f;
            float f105 = f92 + f104;
            float f106 = f90 - f104;
            float f107 = f11 / 7;
            int i10 = 0;
            while (true) {
                float f108 = ((f107 - f103) / 2.0f) + (i10 * f107) + f93;
                float f109 = f102 / 2.0f;
                float f110 = f106;
                float f111 = f108 + f103;
                RectF rectF21 = new RectF(f105 - f109, f108, f105 + f109, f111);
                float f112 = f10 * 0.01f;
                Path.Direction direction3 = Path.Direction.CW;
                path10.addRoundRect(rectF21, f112, f112, direction3);
                float f113 = f105;
                path10.addRoundRect(new RectF(f110 - f109, f108, f110 + f109, f111), f112, f112, direction3);
                if (i10 == 7) {
                    break;
                }
                i10++;
                f105 = f113;
                f106 = f110;
            }
            Path path11 = new Path();
            path11.op(path9, path10, Path.Op.DIFFERENCE);
            Paint paint53 = new Paint(1);
            paint53.setColor(intValue7);
            canvas.drawPath(path11, paint53);
            if (bitmap == null && z3) {
                canvas.drawRect(f98, f99, f100, f101, c(f10));
                return;
            }
            return;
        }
        if (bVar == b.TAPED_CORNERS) {
            o(canvas, bitmap, f10, f11, z3, paint, paint2, num);
            return;
        }
        if (bVar == b.CLASSIC_CORNERS) {
            float f114 = f10 / 2.0f;
            float f115 = f11 / 2.0f;
            RectF rectF22 = new RectF(-f114, -f115, f114, f115);
            Paint paint54 = new Paint(1);
            paint54.setColor(Color.argb(70, 0, 0, 0));
            paint54.setMaskFilter(new BlurMaskFilter(f10 * 0.02f, BlurMaskFilter.Blur.NORMAL));
            canvas.save();
            canvas.translate(0.0f, f11 * 0.01f);
            canvas.drawRect(rectF22, paint54);
            canvas.restore();
            Paint paint55 = new Paint(1);
            paint55.setColor(-1);
            canvas.drawRect(rectF22, paint55);
            float f116 = f10 * 0.025f * 2;
            float f117 = f10 - f116;
            float f118 = f11 - f116;
            RectF rectF23 = new RectF((-f117) / 2.0f, (-f118) / 2.0f, f117 / 2.0f, f118 / 2.0f);
            if (bitmap != null) {
                paint.setShader(b(bitmap, f117, f118));
                canvas.drawRect(rectF23, paint);
            } else {
                canvas.drawRect(rectF23, paint2);
                if (z3) {
                    canvas.drawRect(rectF23, c(f10));
                }
            }
            g(canvas, rectF22, 0.14f * f10);
            return;
        }
        Path a10 = a(bVar, f10, f11);
        if (a10 == null) {
            if (bitmap != null) {
                paint.setShader(b(bitmap, f10, f11));
                canvas.drawRect((-f10) / 2.0f, (-f11) / 2.0f, f10 / 2.0f, f11 / 2.0f, paint);
                return;
            } else {
                canvas.drawRect((-f10) / 2.0f, (-f11) / 2.0f, f10 / 2.0f, f11 / 2.0f, paint2);
                return;
            }
        }
        Paint paint56 = new Paint(1);
        paint56.setColor(Color.argb(70, 0, 0, 0));
        paint56.setMaskFilter(new BlurMaskFilter(f10 * 0.03f, BlurMaskFilter.Blur.NORMAL));
        canvas.save();
        canvas.translate(0.0f, f11 * 0.02f);
        canvas.drawPath(a10, paint56);
        canvas.restore();
        if (bitmap != null) {
            paint.setShader(b(bitmap, f10, f11));
            canvas.drawPath(a10, paint);
        } else {
            canvas.drawPath(a10, paint2);
        }
        Paint paint57 = new Paint(1);
        paint57.setStyle(Paint.Style.STROKE);
        paint57.setStrokeWidth(Math.min(f10, f11) * (num != null ? 0.06f : 0.018f));
        if (num != null) {
            argb = num.intValue();
        } else {
            argb = Color.argb(bitmap != null ? 235 : 90, 255, 255, 255);
        }
        paint57.setColor(argb);
        canvas.drawPath(a10, paint57);
        if (bitmap == null && z3) {
            canvas.drawPath(a10, c(f10));
        }
    }

    public static void g(Canvas canvas, RectF rectF, float f10) {
        float f11 = 0.05f * f10;
        Paint paint = new Paint(1);
        paint.setColor(Color.argb(255, 20, 20, 20));
        paint.setPathEffect(new CornerPathEffect(f11));
        Paint paint2 = new Paint(1);
        paint2.setColor(Color.argb(120, 0, 0, 0));
        paint2.setMaskFilter(new BlurMaskFilter(0.15f * f10, BlurMaskFilter.Blur.NORMAL));
        paint2.setPathEffect(new CornerPathEffect(f11));
        float f12 = f10 * 0.1f;
        float f13 = f10 * 0.35f;
        h(f12, canvas, paint2, paint, f10, f13, rectF.left, rectF.top, 1.0f, 1.0f);
        h(f12, canvas, paint2, paint, f10, f13, rectF.right, rectF.top, -1.0f, 1.0f);
        h(f12, canvas, paint2, paint, f10, f13, rectF.right, rectF.bottom, -1.0f, -1.0f);
        h(f12, canvas, paint2, paint, f10, f13, rectF.left, rectF.bottom, 1.0f, -1.0f);
    }

    public static final void h(float f10, Canvas canvas, Paint paint, Paint paint2, float f11, float f12, float f13, float f14, float f15, float f16) {
        float f17 = f13 - (f15 * f10);
        float f18 = f14 - (f10 * f16);
        Path path = new Path();
        path.moveTo((f15 * f11) + f17, f18);
        path.lineTo(f17, f18);
        path.lineTo(f17, (f16 * f11) + f18);
        float f19 = (f15 * f12) + f17;
        float f20 = f11 - f12;
        path.lineTo(f19, (f16 * f20) + f18);
        float f21 = (f16 * f12) + f18;
        path.lineTo(f19, f21);
        path.lineTo((f15 * f20) + f17, f21);
        path.close();
        canvas.drawPath(path, paint);
        canvas.drawPath(path, paint2);
    }

    public static void i(Canvas canvas, float f10, float f11, boolean z3, Paint paint, List list) {
        Canvas canvas2 = canvas;
        float f12 = f10 / 2.0f;
        float f13 = f11 / 2.0f;
        float f14 = f10 * 0.8f;
        float f15 = f10 * 0.95f;
        float f16 = (-f14) / 2.0f;
        float f17 = -f13;
        float f18 = f14 / 2.0f;
        RectF rectF = new RectF(f16, (0.7f * f10) + f17, f18, f13);
        Paint paint2 = new Paint(1);
        paint2.setColor(Color.argb(80, 0, 0, 0));
        float f19 = f10 * 0.03f;
        paint2.setMaskFilter(new BlurMaskFilter(f19, BlurMaskFilter.Blur.NORMAL));
        canvas2.drawRect(new RectF(f16, f14 + f17, f18, f13 + 5.0f), paint2);
        Paint paint3 = new Paint(1);
        paint3.setColor(-1);
        Path path = new Path();
        List y10 = y(u(b.POLAROID_CAMERA), f10, f11);
        Iterator it = y10.iterator();
        while (it.hasNext()) {
            path.addRect((RectF) it.next(), Path.Direction.CW);
        }
        Path path2 = new Path();
        Path path3 = new Path();
        path3.addRect(rectF, Path.Direction.CW);
        path2.op(path3, path, Path.Op.DIFFERENCE);
        n(canvas2, y10, list, paint, z3);
        canvas2.drawPath(path2, paint3);
        float f20 = -f12;
        float f21 = f17 + f15;
        RectF rectF2 = new RectF(f20, f17, f12, f21);
        float f22 = f10 * 0.08f;
        canvas2.drawRoundRect(rectF2, f22, f22, paint2);
        Paint paint4 = new Paint(1);
        paint4.setColor(Color.parseColor("#EAEAEA"));
        canvas2.drawRoundRect(rectF2, f22, f22, paint4);
        Paint paint5 = new Paint(1);
        float f23 = 0.12f * f10;
        List h3 = qe.m.h("#E32B2B", "#F08119", "#F7D623", "#38A131", "#216DB0", "#4B2982");
        float size = f23 / h3.size();
        float f24 = f22 - (f23 / 2.0f);
        int size2 = h3.size();
        int i = 0;
        while (i < size2) {
            paint5.setColor(Color.parseColor((String) h3.get(i)));
            int i10 = i + 1;
            canvas2.drawRect((i * size) + f24, (0.4f * f15) + f17, (i10 * size) + f24, f21, paint5);
            canvas2 = canvas;
            size2 = size2;
            i = i10;
        }
        Paint paint6 = new Paint(1);
        paint6.setColor(Color.parseColor("#1C1C1C"));
        canvas.drawRect(f20, (f15 * 0.8f) + f17, f12, f21, paint6);
        float f25 = (0.45f * f15) + f17;
        canvas.drawCircle(f22, f25, f10 * 0.25f, paint6);
        Paint paint7 = new Paint(1);
        paint7.setColor(Color.parseColor("#2C2C2C"));
        canvas.drawCircle(f22, f25, 0.18f * f10, paint7);
        Paint paint8 = new Paint(1);
        paint8.setColor(-1);
        paint8.setAlpha(60);
        paint8.setStyle(Paint.Style.STROKE);
        paint8.setStrokeWidth(f19);
        float f26 = -f10;
        canvas.drawArc(new RectF(0.05f * f26, (0.32f * f15) + f17, 0.21f * f10, (0.58f * f15) + f17), -60.0f, 50.0f, false, paint8);
        Paint paint9 = new Paint(1);
        paint9.setColor(Color.parseColor("#D41C1C"));
        canvas.drawCircle(f26 * 0.25f, (f15 * 0.35f) + f17, 0.06f * f10, paint9);
        float f27 = (f15 * 0.15f) + f17;
        float f28 = 0.02f * f10;
        canvas.drawRoundRect(new RectF(f10 * 0.28f, f27, 0.42f * f10, (0.28f * f15) + f17), f28, f28, paint6);
        RectF rectF3 = new RectF(0.35f * f26, f27, f26 * 0.15f, (f15 * 0.25f) + f17);
        float f29 = 0.01f * f10;
        canvas.drawRoundRect(rectF3, f29, f29, paint6);
        Paint paint10 = new Paint(1);
        paint10.setColor(-1);
        paint10.setTextSize(0.04f * f10);
        paint10.setTextAlign(Paint.Align.CENTER);
        paint10.setTypeface(Typeface.DEFAULT_BOLD);
        canvas.drawText("Scraply", rectF3.centerX(), rectF3.centerY() - ((paint10.ascent() + paint10.descent()) / 2), paint10);
    }

    public static void j(Canvas canvas, Bitmap bitmap, float f10, float f11, boolean z3, Paint paint, Paint paint2, Integer num) {
        int i;
        float f12;
        int i10;
        float f13;
        float f14;
        if (num != null) {
            i = num.intValue();
        } else {
            i = -791593;
        }
        float f15 = 2.0f;
        float f16 = f10 / 2.0f;
        float f17 = f11 / 2.0f;
        Path path = new Path();
        float f18 = 0.02f * f10;
        float f19 = -f16;
        float f20 = f19 + f18;
        float f21 = -f17;
        path.moveTo(f20, f21);
        float f22 = f20;
        while (true) {
            f12 = f16 - f18;
            i10 = 2;
            f13 = f15;
            if (f22 >= f12) {
                break;
            }
            float f23 = (2 * f18) + f22;
            path.arcTo(new RectF(f22, f21 - f18, f23, f21 + f18), 180.0f, 180.0f, false);
            f15 = f13;
            f22 = f23;
            f16 = f16;
        }
        float f24 = f16;
        float f25 = f21 + f18;
        float f26 = f25;
        while (true) {
            f14 = f17 - f18;
            if (f26 >= f14) {
                break;
            }
            float f27 = (i10 * f18) + f26;
            path.arcTo(new RectF(f12, f26, f24 + f18, f27), -90.0f, 180.0f, false);
            f26 = f27;
            i10 = 2;
        }
        while (f12 > f20) {
            float f28 = f12 - (2 * f18);
            path.arcTo(new RectF(f28, f14, f12, f17 + f18), 0.0f, 180.0f, false);
            f12 = f28;
        }
        while (f14 > f25) {
            float f29 = f14 - (2 * f18);
            path.arcTo(new RectF(f19 - f18, f29, f20, f14), 90.0f, 180.0f, false);
            f14 = f29;
        }
        path.close();
        Paint paint3 = new Paint(1);
        paint3.setColor(Color.argb(80, 0, 0, 0));
        paint3.setMaskFilter(new BlurMaskFilter(0.025f * f10, BlurMaskFilter.Blur.NORMAL));
        canvas.save();
        canvas.translate(0.0f, 0.01f * f11);
        canvas.drawPath(path, paint3);
        canvas.restore();
        Paint paint4 = new Paint(1);
        paint4.setColor(i);
        canvas.drawPath(path, paint4);
        float f30 = f10 * 0.84f;
        float f31 = 0.84f * f11;
        RectF rectF = new RectF((-f30) / f13, (-f31) / f13, f30 / f13, f31 / f13);
        if (bitmap != null) {
            paint.setShader(b(bitmap, f30, f31));
            Path path2 = new Path();
            path2.addRect(rectF, Path.Direction.CW);
            canvas.drawPath(path2, paint);
        } else {
            canvas.drawRect(rectF, paint2);
            if (z3) {
                canvas.drawRect(rectF, c(f10));
            }
        }
        g(canvas, rectF, 0.12f * f10);
    }

    public static final void k(float f10, Canvas canvas, float f11, Paint paint, Paint paint2, float f12, float f13, float f14, float f15) {
        Path path = new Path();
        float f16 = f13 - (f15 * f10);
        path.moveTo(f12, f16);
        float f17 = f12 - (f14 * f10);
        path.quadTo(f17, f16, f17, f13);
        canvas.save();
        canvas.translate(0.0f, f11 * 0.003f);
        canvas.drawPath(path, paint);
        canvas.restore();
        canvas.drawPath(path, paint2);
    }

    public static final void l(Canvas canvas, float f10, Paint paint, Paint paint2, float f11, float f12) {
        canvas.drawCircle(f11, f12, f10, paint);
        canvas.drawCircle(f11, f12, f10, paint2);
        float f13 = 0.2f * f10;
        Paint paint3 = new Paint(1);
        paint3.setColor(Color.argb(150, 255, 255, 255));
        canvas.drawCircle(f11 - f13, f12 - f13, f10 * 0.3f, paint3);
    }

    public static final void m(float f10, Canvas canvas, float f11, Paint paint, Paint paint2, float f12, float f13, float f14, float f15) {
        float f16 = f10 * 1.3f;
        float f17 = (f14 * f16) + f12;
        float f18 = (f15 * f16) + f13;
        canvas.save();
        canvas.translate(0.0f, f11 * 0.004f);
        canvas.drawLine(f17, f13, f12, f18, paint);
        canvas.restore();
        canvas.drawLine(f17, f13, f12, f18, paint2);
    }

    public static void n(Canvas canvas, List list, List list2, Paint paint, boolean z3) {
        int size = list.size();
        int i = 0;
        while (true) {
            Bitmap bitmap = null;
            if (i < size) {
                RectF rectF = (RectF) list.get(i);
                if (list2 != null) {
                    bitmap = (Bitmap) qe.l.y(i, list2);
                }
                if (bitmap != null) {
                    paint.setShader(b(bitmap, rectF.width(), rectF.height()));
                    canvas.save();
                    canvas.translate(rectF.centerX(), rectF.centerY());
                    canvas.drawRect((-rectF.width()) / 2.0f, (-rectF.height()) / 2.0f, rectF.width() / 2.0f, rectF.height() / 2.0f, paint);
                    canvas.restore();
                } else if (z3) {
                    Paint paint2 = new Paint(1);
                    paint2.setColor(Color.argb(20, 0, 0, 0));
                    canvas.drawRect(rectF, paint2);
                    canvas.drawRect(rectF, c(rectF.width()));
                }
                i++;
            } else {
                paint.setShader(null);
                return;
            }
        }
    }

    public static void o(Canvas canvas, Bitmap bitmap, float f10, float f11, boolean z3, Paint paint, Paint paint2, Integer num) {
        int argb;
        float f12 = f10 / 2.0f;
        float f13 = f11 / 2.0f;
        float f14 = f10 * 0.04f;
        float f15 = 2 * f14;
        float f16 = f10 - f15;
        float f17 = f11 - f15;
        RectF rectF = new RectF((-f16) / 2.0f, (-f17) / 2.0f, f16 / 2.0f, f17 / 2.0f);
        Paint paint3 = new Paint(1);
        paint3.setColor(Color.argb(50, 0, 0, 0));
        BlurMaskFilter.Blur blur = BlurMaskFilter.Blur.NORMAL;
        paint3.setMaskFilter(new BlurMaskFilter(0.02f * f10, blur));
        float f18 = -f12;
        float f19 = -f13;
        canvas.drawRect(new RectF(f18, f19, f12, f13), paint3);
        RectF rectF2 = new RectF(f18, f19, f12, f13);
        Paint paint4 = new Paint(1);
        paint4.setColor(-1);
        canvas.drawRect(rectF2, paint4);
        if (bitmap != null) {
            paint.setShader(b(bitmap, f16, f17));
            canvas.drawRect(rectF, paint);
        } else {
            canvas.drawRect(rectF, paint2);
            if (z3) {
                canvas.drawRect(rectF, c(f10));
            }
        }
        if (num != null) {
            argb = num.intValue();
        } else {
            argb = Color.argb(160, 240, 200, 150);
        }
        Paint paint5 = new Paint(1);
        paint5.setColor(argb);
        Paint paint6 = new Paint(1);
        paint6.setColor(Color.argb(40, 0, 0, 0));
        paint6.setMaskFilter(new BlurMaskFilter(0.01f * f10, blur));
        float f20 = f18 + f14;
        float f21 = f19 + f14;
        p(canvas, f10, paint6, paint5, f20, f21, -45.0f);
        float f22 = f12 - f14;
        p(canvas, f10, paint6, paint5, f22, f21, 45.0f);
        float f23 = f13 - f14;
        p(canvas, f10, paint6, paint5, f20, f23, 45.0f);
        p(canvas, f10, paint6, paint5, f22, f23, -45.0f);
    }

    public static final void p(Canvas canvas, float f10, Paint paint, Paint paint2, float f11, float f12, float f13) {
        canvas.save();
        canvas.translate(f11, f12);
        canvas.rotate(f13);
        float f14 = 0.35f * f10;
        float f15 = f10 * 0.08f;
        Path path = new Path();
        float f16 = (-f14) / 2.0f;
        float f17 = (-f15) / 2.0f;
        path.moveTo(f16, f17);
        float f18 = f14 / 2.0f;
        path.lineTo(f18, f17);
        float f19 = 0.2f * f15;
        path.lineTo(f18 - f19, 0.0f);
        float f20 = f15 / 2.0f;
        path.lineTo(f18, f20);
        path.lineTo(f16, f20);
        path.lineTo(f16 + f19, 0.0f);
        path.close();
        canvas.drawPath(path, paint);
        canvas.drawPath(path, paint2);
        canvas.restore();
    }

    public static void q(Canvas canvas, Bitmap bitmap, float f10, float f11, boolean z3, Paint paint, Paint paint2, Integer num) {
        int argb;
        if (num != null) {
            argb = num.intValue();
        } else {
            argb = Color.argb(255, 245, 238, 220);
        }
        float f12 = f11 / 2.0f;
        float f13 = f12 - (0.5f * f10);
        Path path = new Path();
        float f14 = (-f10) / 2.0f;
        float f15 = (-f11) / 2.0f;
        float f16 = f10 / 2.0f;
        RectF rectF = new RectF(f14, f15, f16, f12);
        Path.Direction direction = Path.Direction.CW;
        path.addRect(rectF, direction);
        Path path2 = new Path();
        float min = Math.min(f10, f11) * 0.12f;
        float f17 = f14 - min;
        float f18 = f15 - min;
        float f19 = f14 + min;
        float f20 = f15 + min;
        path2.addOval(new RectF(f17, f18, f19, f20), direction);
        float f21 = f16 - min;
        float f22 = f16 + min;
        path2.addOval(new RectF(f21, f18, f22, f20), direction);
        float f23 = f12 - min;
        float f24 = f12 + min;
        path2.addOval(new RectF(f17, f23, f19, f24), direction);
        path2.addOval(new RectF(f21, f23, f22, f24), direction);
        float f25 = min * 0.6f;
        float f26 = f13 - f25;
        float f27 = f13 + f25;
        path2.addOval(new RectF(f14 - f25, f26, f14 + f25, f27), direction);
        path2.addOval(new RectF(f16 - f25, f26, f25 + f16, f27), direction);
        Path path3 = new Path();
        path3.op(path, path2, Path.Op.DIFFERENCE);
        Paint paint3 = new Paint(1);
        paint3.setColor(Color.argb(80, 0, 0, 0));
        float f28 = 0.03f * f10;
        paint3.setMaskFilter(new BlurMaskFilter(f28, BlurMaskFilter.Blur.NORMAL));
        canvas.save();
        canvas.translate(0.0f, 0.015f * f11);
        canvas.drawPath(path3, paint3);
        canvas.restore();
        Paint paint4 = new Paint(1);
        paint4.setColor(argb);
        canvas.drawPath(path3, paint4);
        float f29 = f10 * 0.05f;
        Paint paint5 = new Paint(1);
        Paint.Style style = Paint.Style.STROKE;
        paint5.setStyle(style);
        paint5.setStrokeWidth(0.006f * f10);
        paint5.setColor(Color.argb(60, 0, 0, 0));
        paint5.setPathEffect(new DashPathEffect(new float[]{f28, f10 * 0.02f}, 0.0f));
        float f30 = f14 + f29;
        float f31 = f15 + f29;
        float f32 = f16 - f29;
        float f33 = f12 - f29;
        float f34 = f10 * 0.04f;
        canvas.drawRoundRect(new RectF(f30, f31, f32, f33), f34, f34, paint5);
        canvas.drawLine(f30, f13, f32, f13, paint5);
        RectF rectF2 = new RectF(f30 + f34, f31 + f34, f32 - f34, f13 - f34);
        float f35 = 0.01f * f10;
        float f36 = rectF2.left - f35;
        float f37 = rectF2.top - f35;
        float f38 = rectF2.right + f35;
        float f39 = rectF2.bottom + f35;
        Paint paint6 = new Paint(1);
        paint6.setColor(-1);
        Canvas canvas2 = canvas;
        canvas2.drawRect(f36, f37, f38, f39, paint6);
        if (bitmap != null) {
            paint.setShader(b(bitmap, rectF2.width(), rectF2.height()));
            canvas2.save();
            canvas2.translate(rectF2.centerX(), rectF2.centerY());
            canvas2.drawRect((-rectF2.width()) / 2.0f, (-rectF2.height()) / 2.0f, rectF2.width() / 2.0f, rectF2.height() / 2.0f, paint);
            canvas2.restore();
        } else {
            canvas2.drawRect(rectF2, paint2);
            if (z3) {
                canvas2.save();
                canvas2.translate(rectF2.centerX(), rectF2.centerY());
                canvas2.drawRect((-rectF2.width()) / 2.0f, (-rectF2.height()) / 2.0f, rectF2.width() / 2.0f, rectF2.height() / 2.0f, c(rectF2.width()));
                canvas2.restore();
            }
        }
        Paint paint7 = new Paint(1);
        paint7.setStyle(style);
        paint7.setStrokeWidth(0.004f * f10);
        paint7.setColor(Color.argb(30, 0, 0, 0));
        canvas2.drawRect(rectF2, paint7);
        Paint paint8 = new Paint(1);
        paint8.setColor(Color.argb(160, 0, 0, 0));
        float f40 = f13 + f34;
        float f41 = (f33 - f34) - f40;
        float f42 = f29 * 3.0f;
        float f43 = f14 + f42;
        float f44 = f16 - f42;
        int i = 789;
        while (f43 < f44) {
            int i10 = ((i * 1103515245) + 12345) & Integer.MAX_VALUE;
            float f45 = 0.005f * f10;
            float f46 = ((i10 / 2.14748365E9f) * f10 * 0.025f) + f45;
            int i11 = Integer.MAX_VALUE & ((i10 * 1103515245) + 12345);
            float f47 = ((i11 / 2.14748365E9f) * f10 * 0.02f) + f45;
            float f48 = f43 + f46;
            if (f48 <= f44) {
                canvas2.drawRect(f43, f40, f48, f40 + f41, paint8);
                f43 += f46 + f47;
                canvas2 = canvas;
                i = i11;
            } else {
                return;
            }
        }
    }

    public static final void r(Canvas canvas, float f10, Paint paint, Paint paint2, float f11, float f12) {
        canvas.save();
        canvas.translate(f11, f12);
        canvas.rotate(-45.0f);
        float f13 = 0.35f * f10;
        float f14 = f10 * 0.08f;
        Path path = new Path();
        float f15 = (-f13) / 2.0f;
        float f16 = (-f14) / 2.0f;
        path.moveTo(f15, f16);
        float f17 = f13 / 2.0f;
        path.lineTo(f17, f16);
        float f18 = 0.2f * f14;
        path.lineTo(f17 - f18, 0.0f);
        float f19 = f14 / 2.0f;
        path.lineTo(f17, f19);
        path.lineTo(f15, f19);
        path.lineTo(f15 + f18, 0.0f);
        path.close();
        canvas.drawPath(path, paint);
        canvas.drawPath(path, paint2);
        canvas.restore();
    }

    public static List s(d5 d5Var, float f10, float f11) {
        List list = d5Var.f28083d;
        int size = list.size() / 4;
        if (size == 0) {
            return qe.m.g(new RectF((-f10) / 2.0f, (-f11) / 2.0f, f10 / 2.0f, f11 / 2.0f));
        }
        jf.d i = wa.b9.i(0, size);
        ArrayList arrayList = new ArrayList(qe.m.d(i, 10));
        Iterator it = i.iterator();
        while (true) {
            jf.c cVar = (jf.c) it;
            if (cVar.f19194w) {
                int nextInt = cVar.nextInt() * 4;
                float f12 = f10 / 2.0f;
                float f13 = f11 / 2.0f;
                arrayList.add(new RectF((((Number) list.get(nextInt)).floatValue() * f10) - f12, (((Number) list.get(nextInt + 1)).floatValue() * f11) - f13, (((Number) list.get(nextInt + 2)).floatValue() * f10) - f12, (((Number) list.get(nextInt + 3)).floatValue() * f11) - f13));
            } else {
                return arrayList;
            }
        }
    }

    public static boolean t(d5 d5Var) {
        if (d5Var != null && x(d5Var) > 1) {
            return true;
        }
        return false;
    }

    public static d5 u(b bVar) {
        if (bVar == null || bVar == b.NONE || bVar == b.REMOTE) {
            return null;
        }
        return new d5(bVar, null, 1.0f, qe.s.f24023u);
    }

    public static pe.j v(d5 d5Var) {
        int i;
        float f10;
        Float valueOf = Float.valueOf(300.0f);
        if (d5Var != null) {
            Float valueOf2 = Float.valueOf(600.0f);
            if (d5Var.a()) {
                f10 = d5Var.f28082c;
            } else {
                b bVar = d5Var.f28080a;
                if (bVar == null) {
                    i = -1;
                } else {
                    i = b5.f27984a[bVar.ordinal()];
                }
                switch (i) {
                    case 4:
                        f10 = 1.3f;
                        break;
                    case 5:
                    case 7:
                    case 10:
                    case 15:
                        f10 = 1.2f;
                        break;
                    case 6:
                        f10 = 0.8f;
                        break;
                    case 8:
                    case 13:
                    case 14:
                        f10 = 1.1f;
                        break;
                    case 9:
                    case 16:
                    case 17:
                    default:
                        f10 = 1.0f;
                        break;
                    case 11:
                        f10 = 2.7f;
                        break;
                    case 12:
                        f10 = 1.8f;
                        break;
                    case 18:
                        f10 = 3.35f;
                        break;
                    case 19:
                        f10 = 0.85f;
                        break;
                }
            }
            return new pe.j(valueOf2, Float.valueOf(f10 * 600.0f));
        }
        return new pe.j(valueOf, valueOf);
    }

    public static int w(d5 d5Var, float f10, float f11, float f12, float f13) {
        List y10 = y(d5Var, f10, f11);
        int size = y10.size();
        for (int i = 0; i < size; i++) {
            if (((RectF) y10.get(i)).contains(f12, f13)) {
                return i;
            }
        }
        return -1;
    }

    public static int x(d5 d5Var) {
        if (d5Var != null) {
            if (d5Var.a()) {
                int size = d5Var.f28083d.size() / 4;
                if (size >= 1) {
                    return size;
                }
            } else {
                int i = b5.f27984a[d5Var.f28080a.ordinal()];
                if (i == 11 || i == 18) {
                    return 3;
                }
            }
        }
        return 1;
    }

    public static List y(d5 d5Var, float f10, float f11) {
        if (d5Var != null) {
            if (d5Var.a()) {
                return s(d5Var, f10, f11);
            }
            b bVar = d5Var.f28080a;
            if (bVar == b.FILM) {
                float f12 = 0.05f * f10;
                float f13 = 2;
                float f14 = f10 - ((0.1f * f10) * f13);
                float f15 = ((-f11) / 2.0f) + ((f11 - ((f13 * f12) + (3 * f14))) / 2.0f);
                jf.d i = wa.b9.i(0, 3);
                ArrayList arrayList = new ArrayList(qe.m.d(i, 10));
                Iterator it = i.iterator();
                while (true) {
                    if (((jf.c) it).f19194w) {
                        float nextInt = ((f14 + f12) * r1.nextInt()) + f15;
                        arrayList.add(new RectF((-f14) / 2.0f, nextInt, f14 / 2.0f, nextInt + f14));
                    } else {
                        return arrayList;
                    }
                }
            } else if (bVar == b.POLAROID_CAMERA) {
                float f16 = f11 / 2.0f;
                float f17 = 0.8f * f10;
                RectF rectF = new RectF((-f17) / 2.0f, (f10 * 0.7f) + (-f16), f17 / 2.0f, f16);
                float f18 = 0.08f * f17;
                float f19 = f17 - (2 * f18);
                float height = (rectF.height() - (4 * f18)) / 3;
                jf.d i10 = wa.b9.i(0, 3);
                ArrayList arrayList2 = new ArrayList(qe.m.d(i10, 10));
                Iterator it2 = i10.iterator();
                while (true) {
                    if (((jf.c) it2).f19194w) {
                        float nextInt2 = ((height + f18) * r2.nextInt()) + rectF.top + f18;
                        arrayList2.add(new RectF((-f19) / 2.0f, nextInt2, f19 / 2.0f, nextInt2 + height));
                    } else {
                        return arrayList2;
                    }
                }
            }
        }
        return qe.s.f24023u;
    }

    public static final void z(float f10, kotlin.jvm.internal.u uVar, Path path, kotlin.jvm.internal.w wVar, float f11, float f12, float f13, float f14) {
        float f15 = f13 - f11;
        float f16 = f14 - f12;
        float hypot = (float) Math.hypot(f15, f16);
        int max = Math.max(3, Math.round(hypot / (0.02f * f10)));
        float f17 = f15 / hypot;
        float f18 = f16 / hypot;
        float f19 = -f17;
        int i = 1;
        if (!uVar.f19783u) {
            path.moveTo(f11, f12);
            uVar.f19783u = true;
        }
        if (1 > max) {
            return;
        }
        while (true) {
            float f20 = i / max;
            int i10 = ((wVar.f19785u * 1103515245) + 12345) & Integer.MAX_VALUE;
            wVar.f19785u = i10;
            float f21 = (((i10 / 2.14748365E9f) * 2.0f) - 1.0f) * f10 * 0.015f;
            path.lineTo((f18 * f21) + (f15 * f20) + f11, (f21 * f19) + (f20 * f16) + f12);
            if (i != max) {
                i++;
            } else {
                return;
            }
        }
    }
}