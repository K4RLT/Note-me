package p7;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import wa.b9;

/* loaded from: classes.dex */
public abstract class u0 {

    /* renamed from: a, reason: collision with root package name */
    public static final t0 f22581a = new t0(70, 0.1f, 0.15f, 0.45f, 0.18f, false);

    /* renamed from: b, reason: collision with root package name */
    public static final t0 f22582b = new t0(45, 0.06f, 0.0f, 0.12f, 0.05f, true);

    /* renamed from: c, reason: collision with root package name */
    public static final HashMap f22583c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public static Bitmap f22584d;

    public static float[] a(float[] fArr) {
        float[] fArr2 = new float[65536];
        for (int i = 0; i < 256; i++) {
            for (int i10 = 0; i10 < 256; i10++) {
                float f10 = 0.0f;
                for (int i11 = -1; i11 < 2; i11++) {
                    for (int i12 = -1; i12 < 2; i12++) {
                        f10 += fArr[(((((i + i11) % 256) + 256) % 256) * 256) + ((((i10 + i12) % 256) + 256) % 256)];
                    }
                }
                fArr2[(i * 256) + i10] = f10 / 9.0f;
            }
        }
        return fArr2;
    }

    public static void b(Canvas canvas, ArrayList arrayList, int i, float f10, float f11, t0 t0Var, List list) {
        boolean z3;
        int i10;
        Canvas canvas2;
        Bitmap bitmap;
        float f12;
        ArrayList arrayList2 = arrayList;
        float f13 = f10;
        int i11 = t0Var.f22572a;
        canvas.getClass();
        list.getClass();
        if (!arrayList2.isEmpty() && f13 > 0.0f) {
            float f14 = ((PointF) arrayList2.get(0)).x;
            float f15 = ((PointF) arrayList2.get(0)).x;
            float f16 = ((PointF) arrayList2.get(0)).y;
            float f17 = ((PointF) arrayList2.get(0)).y;
            int size = arrayList2.size();
            int i12 = 0;
            while (i12 < size) {
                Object obj = arrayList2.get(i12);
                i12++;
                PointF pointF = (PointF) obj;
                float f18 = pointF.x;
                if (f18 < f14) {
                    f14 = f18;
                }
                if (f18 > f15) {
                    f15 = f18;
                }
                float f19 = pointF.y;
                if (f19 < f16) {
                    f16 = f19;
                }
                if (f19 > f17) {
                    f17 = f19;
                }
            }
            float f20 = f14 - f13;
            float f21 = f16 - f13;
            float f22 = f13 * 2.0f;
            int e = b9.e((int) ((f15 - f14) + f22), 1, 4096);
            int e8 = b9.e((int) ((f17 - f16) + f22), 1, 4096);
            Bitmap createBitmap = Bitmap.createBitmap(e, e8, Bitmap.Config.ARGB_8888);
            createBitmap.getClass();
            Canvas canvas3 = new Canvas(createBitmap);
            float f23 = t0Var.f22574c;
            int i13 = (int) (100 * f23);
            Integer valueOf = Integer.valueOf(i13);
            HashMap hashMap = f22583c;
            Bitmap bitmap2 = (Bitmap) hashMap.get(valueOf);
            if (bitmap2 == null || bitmap2.isRecycled()) {
                float f24 = 1.0f;
                float f25 = 64 / 2.0f;
                int[] iArr = new int[4096];
                int i14 = 0;
                while (true) {
                    int i15 = 64;
                    if (i14 >= 64) {
                        break;
                    }
                    int[] iArr2 = iArr;
                    int i16 = 0;
                    while (i16 < i15) {
                        float f26 = ((i16 + 0.5f) - f25) / f25;
                        float f27 = ((i14 + 0.5f) - f25) / f25;
                        int i17 = i14;
                        float sqrt = (((float) Math.sqrt((f27 * f27) + (f26 * f26))) - f23) / (f24 - f23);
                        int i18 = i16;
                        float f28 = f24;
                        float d2 = b9.d(sqrt, 0.0f, f28);
                        iArr2[(i17 * 64) + i18] = (((int) (b9.d(f28 - ((3.0f - (d2 * 2.0f)) * (d2 * d2)), 0.0f, f28) * 255.0f)) << 24) | 16777215;
                        i16 = i18 + 1;
                        i14 = i17;
                        i15 = 64;
                        f24 = 1.0f;
                    }
                    i14++;
                    iArr = iArr2;
                    f24 = 1.0f;
                }
                Bitmap createBitmap2 = Bitmap.createBitmap(64, 64, Bitmap.Config.ARGB_8888);
                createBitmap2.setPixels(iArr, 0, 64, 0, 0, 64, 64);
                bitmap2 = createBitmap2;
                hashMap.put(Integer.valueOf(i13), bitmap2);
            }
            Paint paint = new Paint(1);
            paint.setFilterBitmap(true);
            new Random(12345L);
            if (list.size() >= arrayList2.size() && !arrayList2.isEmpty()) {
                z3 = true;
            } else {
                z3 = false;
            }
            float f29 = t0Var.f22573b * f13;
            if (f29 < 0.7f) {
                f29 = 0.7f;
            }
            if (arrayList2.size() == 1) {
                pe.j c10 = c(f13, t0Var, 0.0f, d(z3, list, 0, 0.0f));
                float floatValue = ((Number) c10.f22693u).floatValue();
                float floatValue2 = ((Number) c10.f22694v).floatValue();
                float f30 = ((PointF) arrayList2.get(0)).x;
                float f31 = ((PointF) arrayList2.get(0)).y;
                int i19 = (int) (i11 * floatValue2);
                if (floatValue > 0.0f) {
                    paint.setAlpha(b9.e(i19, 0, 255));
                    float f32 = floatValue / 64;
                    Matrix matrix = new Matrix();
                    matrix.setScale(f32, f32);
                    float f33 = floatValue / 2.0f;
                    matrix.postTranslate((f30 - f20) - f33, (f31 - f21) - f33);
                    canvas3.drawBitmap(bitmap2, matrix, paint);
                }
                i10 = e;
            } else {
                PointF pointF2 = (PointF) arrayList2.get(0);
                PointF pointF3 = (PointF) arrayList2.get(1);
                float f34 = f29;
                float f35 = pointF3.x - pointF2.x;
                float f36 = pointF3.y - pointF2.y;
                Math.sqrt((f36 * f36) + (f35 * f35));
                i10 = e;
                pe.j c11 = c(f13, t0Var, 0.0f, d(z3, list, 1, 0.0f));
                float floatValue3 = ((Number) c11.f22693u).floatValue();
                float floatValue4 = ((Number) c11.f22694v).floatValue();
                float f37 = pointF2.x;
                float f38 = pointF2.y;
                int i20 = (int) (i11 * floatValue4);
                if (floatValue3 > 0.0f) {
                    paint.setAlpha(b9.e(i20, 0, 255));
                    float f39 = floatValue3 / 64;
                    Matrix matrix2 = new Matrix();
                    matrix2.setScale(f39, f39);
                    float f40 = floatValue3 / 2.0f;
                    matrix2.postTranslate((f37 - f20) - f40, (f38 - f21) - f40);
                    canvas3.drawBitmap(bitmap2, matrix2, paint);
                }
                int size2 = arrayList2.size();
                int i21 = 1;
                float f41 = 0.0f;
                while (i21 < size2) {
                    PointF pointF4 = (PointF) arrayList2.get(i21 - 1);
                    PointF pointF5 = (PointF) arrayList2.get(i21);
                    int i22 = size2;
                    float f42 = pointF5.x - pointF4.x;
                    float f43 = pointF5.y - pointF4.y;
                    float f44 = f20;
                    float f45 = f21;
                    float sqrt2 = (float) Math.sqrt((f43 * f43) + (f42 * f42));
                    if (sqrt2 > 0.0f) {
                        float f46 = 0.6f * f13;
                        float d10 = b9.d((sqrt2 - f46) / ((4.0f * f13) - f46), 0.0f, 1.0f);
                        canvas2 = canvas3;
                        bitmap = bitmap2;
                        int ceil = (int) Math.ceil(sqrt2);
                        if (ceil < 1) {
                            ceil = 1;
                        }
                        if (1 <= ceil) {
                            float f47 = f41;
                            int i23 = 1;
                            while (true) {
                                float f48 = ceil;
                                f47 = (sqrt2 / f48) + f47;
                                if (f47 >= f34) {
                                    f12 = sqrt2;
                                    float f49 = i23 / f48;
                                    pe.j c12 = c(f13, t0Var, d10, d(z3, list, i21, f49));
                                    float floatValue5 = ((Number) c12.f22693u).floatValue();
                                    float floatValue6 = ((Number) c12.f22694v).floatValue();
                                    float f50 = (f42 * f49) + pointF4.x;
                                    float f51 = (f49 * f43) + pointF4.y;
                                    int i24 = (int) (i11 * floatValue6);
                                    if (floatValue5 > 0.0f) {
                                        paint.setAlpha(b9.e(i24, 0, 255));
                                        float f52 = floatValue5 / 64;
                                        Matrix matrix3 = new Matrix();
                                        matrix3.setScale(f52, f52);
                                        float f53 = floatValue5 / 2.0f;
                                        matrix3.postTranslate((f50 - f44) - f53, (f51 - f45) - f53);
                                        canvas2.drawBitmap(bitmap, matrix3, paint);
                                    }
                                    f47 = 0.0f;
                                } else {
                                    f12 = sqrt2;
                                }
                                if (i23 == ceil) {
                                    break;
                                }
                                i23++;
                                f13 = f10;
                                sqrt2 = f12;
                            }
                            f41 = f47;
                        }
                    } else {
                        canvas2 = canvas3;
                        bitmap = bitmap2;
                    }
                    i21++;
                    arrayList2 = arrayList;
                    f13 = f10;
                    canvas3 = canvas2;
                    bitmap2 = bitmap;
                    size2 = i22;
                    f20 = f44;
                    f21 = f45;
                }
            }
            float f54 = f20;
            float f55 = f21;
            Canvas canvas4 = canvas3;
            Paint paint2 = new Paint();
            Bitmap bitmap3 = f22584d;
            if (bitmap3 == null || bitmap3.isRecycled()) {
                Random random = new Random(2025L);
                float[] fArr = new float[65536];
                for (int i25 = 0; i25 < 65536; i25++) {
                    fArr[i25] = random.nextFloat();
                }
                float[] fArr2 = new float[65536];
                for (int i26 = 0; i26 < 65536; i26++) {
                    fArr2[i26] = random.nextFloat();
                }
                float[] a10 = a(a(fArr));
                float[] a11 = a(fArr2);
                int[] iArr3 = new int[65536];
                for (int i27 = 0; i27 < 65536; i27++) {
                    iArr3[i27] = (((int) ((b9.d(((((a11[i27] * 0.45f) + (a10[i27] * 0.55f)) - 0.5f) * 1.5f) + 0.5f, 0.0f, 1.0f) * 165) + 90)) << 24) | 16777215;
                }
                Bitmap createBitmap3 = Bitmap.createBitmap(256, 256, Bitmap.Config.ARGB_8888);
                createBitmap3.setPixels(iArr3, 0, 256, 0, 0, 256, 256);
                f22584d = createBitmap3;
                bitmap3 = createBitmap3;
            }
            Shader.TileMode tileMode = Shader.TileMode.REPEAT;
            BitmapShader bitmapShader = new BitmapShader(bitmap3, tileMode, tileMode);
            Matrix matrix4 = new Matrix();
            matrix4.setScale(f11, f11);
            matrix4.postTranslate(-f54, -f55);
            bitmapShader.setLocalMatrix(matrix4);
            paint2.setShader(bitmapShader);
            paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
            canvas4.drawRect(0.0f, 0.0f, i10, e8, paint2);
            Paint paint3 = new Paint();
            paint3.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN));
            canvas.drawBitmap(createBitmap, f54, f55, paint3);
            createBitmap.recycle();
        }
    }

    public static final pe.j c(float f10, t0 t0Var, float f11, float f12) {
        return new pe.j(Float.valueOf(g3.a.y(f12, 0.65f, 0.35f, g3.a.w(t0Var.f22575d, f11, 1.0f, f10))), Float.valueOf(g3.a.y(f12, 0.55f, 0.45f, 1.0f - (t0Var.e * f11))));
    }

    public static final float d(boolean z3, List list, int i, float f10) {
        if (!z3) {
            return 1.0f;
        }
        float floatValue = ((Number) list.get(b9.e(i - 1, 0, list.size() - 1))).floatValue();
        return b9.d(((((Number) list.get(b9.e(i, 0, list.size() - 1))).floatValue() - floatValue) * f10) + floatValue, 0.05f, 1.0f);
    }
}
