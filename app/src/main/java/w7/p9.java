package w7;
import f.h;
import f.i;
import g3.a;
import k1.f;
import lb.r1;
import lb.y;
import r2.c;
import r6.e;
import w7.k9;
import w7.ka;
import w7.l9;
import w7.la;
import w7.ma;
import w7.n9;
import w7.p9;
import w7.pa;
import w7.t9;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class p9 {

    /* renamed from: c, reason: collision with root package name */
    public static volatile ArrayList f28917c;

    /* renamed from: a, reason: collision with root package name */
    public static final p9 f28915a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final fg.s f28916b = wa.p6.a(new c9(1));

    /* renamed from: d, reason: collision with root package name */
    public static final ConcurrentHashMap f28918d = new ConcurrentHashMap();
    public static final ConcurrentHashMap e = new ConcurrentHashMap();

    /* renamed from: f, reason: collision with root package name */
    public static final ConcurrentHashMap f28919f = new ConcurrentHashMap();

    /* JADX WARN: Removed duplicated region for block: B:43:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0132 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, kotlin.jvm.internal.x] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final f a(android.content.Context r37, t9 r38) {
        /*
            Method dump skipped, instructions count: 1247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w7.p9.a(android.content.Context, t9):f");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00df A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v2, types: [n9] */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.util.Collection] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x00c2 -> B:10:0x00c9). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(android.content.Context r13, t9 r14, ve.c r15) {
        /*
            Method dump skipped, instructions count: 382
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w7.p9.b(android.content.Context, t9, ve.c):java.lang.Object");
    }

    public static final l9 c(Bitmap bitmap, k9 k9Var) {
        Object obj;
        int i;
        int i10;
        int i11;
        HashMap hashMap = new HashMap();
        int width = bitmap.getWidth() / 64;
        if (width < 1) {
            width = 1;
        }
        int height = bitmap.getHeight() / 64;
        if (height < 1) {
            height = 1;
        }
        for (int i12 = 0; i12 < bitmap.getHeight(); i12 += height) {
            for (int i13 = 0; i13 < bitmap.getWidth(); i13 += width) {
                int pixel = bitmap.getPixel(i13, i12);
                if (((pixel >>> 24) & 255) > 200) {
                    int i14 = (pixel >>> 16) & 255;
                    int i15 = (pixel >>> 8) & 255;
                    int i16 = pixel & 255;
                    if (i14 <= 230 || i15 <= 230 || i16 <= 230) {
                        int i17 = i16 | (i14 << 16) | (i15 << 8);
                        Integer valueOf = Integer.valueOf(i17);
                        Integer num = (Integer) hashMap.get(Integer.valueOf(i17));
                        if (num != null) {
                            i11 = num.intValue();
                        } else {
                            i11 = 0;
                        }
                        hashMap.put(valueOf, Integer.valueOf(i11 + 1));
                    }
                }
            }
        }
        if (hashMap.isEmpty()) {
            for (int i18 = 0; i18 < bitmap.getHeight(); i18 += height) {
                for (int i19 = 0; i19 < bitmap.getWidth(); i19 += width) {
                    int pixel2 = bitmap.getPixel(i19, i18);
                    if (((pixel2 >>> 24) & 255) > 200) {
                        int i20 = (pixel2 & 255) | (((pixel2 >>> 16) & 255) << 16) | (((pixel2 >>> 8) & 255) << 8);
                        Integer valueOf2 = Integer.valueOf(i20);
                        Integer num2 = (Integer) hashMap.get(Integer.valueOf(i20));
                        if (num2 != null) {
                            i10 = num2.intValue();
                        } else {
                            i10 = 0;
                        }
                        hashMap.put(valueOf2, Integer.valueOf(i10 + 1));
                    }
                }
            }
        }
        Iterator it = hashMap.entrySet().iterator();
        if (!it.hasNext()) {
            obj = null;
        } else {
            Object next = it.next();
            if (it.hasNext()) {
                int intValue = ((Number) ((Map.Entry) next).getValue()).intValue();
                do {
                    Object next2 = it.next();
                    int intValue2 = ((Number) ((Map.Entry) next2).getValue()).intValue();
                    if (intValue < intValue2) {
                        next = next2;
                        intValue = intValue2;
                    }
                } while (it.hasNext());
            }
            obj = next;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry != null) {
            i = ((Number) entry.getKey()).intValue();
        } else {
            i = 8421504;
        }
        return new l9((i >>> 16) & 255, (i >>> 8) & 255, i & 255, k9Var);
    }

    public static final f d(Context context, t9 t9Var) {
        Object obj;
        String str;
        Bitmap h3;
        fg.s sVar = d8.f.f15790a;
        String str2 = t9Var.f29155a.f29080a;
        context.getClass();
        str2.getClass();
        Iterator it = d8.f.m(context).iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (kotlin.jvm.internal.l.a(((d8.c) obj).f15772a, str2)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        d8.c cVar = (d8.c) obj;
        if (cVar != null) {
            str = cVar.f15779j;
        } else {
            str = null;
        }
        File o10 = d8.f.o(context, str2, str);
        if (!o10.exists()) {
            o10 = null;
        }
        if (o10 == null || (h3 = h(288, new m4(2, o10))) == null) {
            return null;
        }
        return new f(h3);
    }

    public static final float e(kotlin.jvm.internal.x xVar) {
        long j10 = ((xVar.f19786u * 1103515245) + 12345) & 2147483647L;
        xVar.f19786u = j10;
        return ((float) (j10 % 10000)) / 10000.0f;
    }

    public static final void f(RectF rectF, Canvas canvas, j9 j9Var, float f10, float f11, Paint paint) {
        float f12 = j9Var.f28526c;
        float f13 = j9Var.e / 2.0f;
        float f14 = j9Var.f28527d;
        float f15 = j9Var.f28528f / 2.0f;
        rectF.set(((f12 - f13) - f10) + 0.0f, ((f14 - f15) - f10) + f11, f13 + f12 + f10 + 0.0f, f15 + f14 + f10 + f11);
        canvas.drawBitmap(j9Var.f28524a, j9Var.f28525b, rectF, paint);
    }

    public static String g(Context context, ma maVar) {
        Object kVar;
        File file;
        InputStream n10;
        context.getClass();
        maVar.getClass();
        Object obj = null;
        try {
            File file2 = new File(context.getFilesDir(), "images");
            if (!file2.exists()) {
                file2.mkdirs();
            }
            file = new File(file2, "sticker_" + UUID.randomUUID() + ".png");
            n10 = n(context, maVar);
        } catch (Throwable th) {
            kVar = new pe.k(th);
        }
        if (n10 == null) {
            return null;
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                a.a(n10, fileOutputStream);
                fileOutputStream.close();
                n10.close();
                kVar = file.getAbsolutePath();
                if (!(kVar instanceof pe.k)) {
                    obj = kVar;
                }
                return (String) obj;
            } finally {
            }
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                f.a(n10, th2);
                throw th3;
            }
        }
    }

    public static Bitmap h(int i, df.a aVar) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        int i10 = 1;
        options.inJustDecodeBounds = true;
        InputStream inputStream = (InputStream) aVar.invoke();
        if (inputStream != null) {
            try {
                BitmapFactory.decodeStream(inputStream, null, options);
                inputStream.close();
                if (options.outWidth > 0 && options.outHeight > 0) {
                    while (true) {
                        if (options.outWidth / i10 <= i && options.outHeight / i10 <= i) {
                            break;
                        }
                        i10 *= 2;
                    }
                    BitmapFactory.Options options2 = new BitmapFactory.Options();
                    options2.inSampleSize = i10;
                    inputStream = (InputStream) aVar.invoke();
                    if (inputStream != null) {
                        try {
                            Bitmap decodeStream = BitmapFactory.decodeStream(inputStream, null, options2);
                            inputStream.close();
                            return decodeStream;
                        } finally {
                        }
                    }
                }
            } finally {
                try {
                    throw th;
                } finally {
                }
            }
        }
        return null;
    }

    public static boolean i(Context context, t9 t9Var) {
        InputStream n10;
        context.getClass();
        if (!t9Var.b()) {
            return true;
        }
        ma maVar = (ma) qe.l.x(t9Var.h());
        if (maVar != null && (n10 = n(context, maVar)) != null) {
            n10.close();
            return true;
        }
        return false;
    }

    public static Object k(Context context, t9 t9Var, ve.i iVar) {
        f fVar = (f) e.get(t9Var.f29155a.f29080a);
        if (fVar != null) {
            return fVar;
        }
        wf.e eVar = pf.l0.f22767a;
        return pf.b0.J(wf.d.f29913w, new b8.a1(t9Var, context, (te.c) null, 17), iVar);
    }

    public static Object l(Context context, ma maVar, ve.c cVar) {
        String l10;
        if (maVar instanceof ka) {
            l10 = a.k("asset:", ((ka) maVar).f28586a);
        } else if (maVar instanceof la) {
            la laVar = (la) maVar;
            l10 = a.l("remote:", laVar.f28657a, "/", laVar.f28658b);
        } else {
            l4.a.o();
            return null;
        }
        String str = l10;
        l9 l9Var = (l9) f28919f.get(str);
        if (l9Var != null) {
            return l9Var;
        }
        wf.e eVar = pf.l0.f22767a;
        return pf.b0.J(wf.d.f29913w, new o9(context, maVar, str, null, 0), cVar);
    }

    public static Object m(Context context, ma maVar, ve.i iVar) {
        String l10;
        if (maVar instanceof ka) {
            l10 = a.k("asset:", ((ka) maVar).f28586a);
        } else if (maVar instanceof la) {
            la laVar = (la) maVar;
            l10 = a.l("remote:", laVar.f28657a, "/", laVar.f28658b);
        } else {
            l4.a.o();
            return null;
        }
        String str = l10;
        f fVar = (f) f28918d.get(str);
        if (fVar != null) {
            return fVar;
        }
        wf.e eVar = pf.l0.f22767a;
        return pf.b0.J(wf.d.f29913w, new o9(context, maVar, str, null, 1), iVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x005c, code lost:
    
        if (r3.exists() != false) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.io.InputStream n(android.content.Context r5, ma r6) {
        /*
            r5.getClass()
            r6.getClass()
            boolean r0 = r6 instanceof ka
            r1 = 0
            if (r0 == 0) goto L29
            android.content.res.AssetManager r5 = r5.getAssets()     // Catch: java.lang.Throwable -> L18
            ka r6 = (ka) r6     // Catch: java.lang.Throwable -> L18
            java.lang.String r6 = r6.f28586a     // Catch: java.lang.Throwable -> L18
            java.io.InputStream r5 = r5.open(r6)     // Catch: java.lang.Throwable -> L18
            goto L1f
        L18:
            r5 = move-exception
            pe.k r6 = new pe.k
            r6.<init>(r5)
            r5 = r6
        L1f:
            boolean r6 = r5 instanceof pe.k
            if (r6 == 0) goto L25
            goto L26
        L25:
            r1 = r5
        L26:
            java.io.InputStream r1 = (java.io.InputStream) r1
            return r1
        L29:
            boolean r0 = r6 instanceof la
            if (r0 == 0) goto L75
            sf.n0 r0 = g7.i.f17566a
            la r6 = (la) r6
            java.lang.String r0 = r6.f28658b
            java.lang.String r6 = r6.f28657a
            r6.getClass()
            r0.getClass()
            r1 r2 = g7.i.e
            if (r2 != 0) goto L41
        L3f:
            r3 = r1
            goto L5e
        L41:
            y r2 = c(r6)
            if (r2 != 0) goto L48
            goto L3f
        L48:
            java.lang.String r2 = r2.f20307c
            if (r2 != 0) goto L4d
            goto L3f
        L4d:
            java.io.File r3 = new java.io.File
            java.lang.String r4 = "/"
            java.lang.String r4 = com.google.android.gms.internal.ads.wd0.n(r6, r4, r0)
            r3.<init>(r2, r4)
            boolean r2 = r3.exists()
            if (r2 == 0) goto L3f
        L5e:
            if (r3 == 0) goto L66
            java.io.FileInputStream r5 = new java.io.FileInputStream
            r5.<init>(r3)
            return r5
        L66:
            fg.s r2 = d8.f.f15790a
            java.io.File r5 = d8.i(r5, r6, r0)
            if (r5 == 0) goto L74
            java.io.FileInputStream r6 = new java.io.FileInputStream
            r6.<init>(r5)
            return r6
        L74:
            return r1
        L75:
            l4.a.o()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: w7.p9.n(android.content.Context, ma):java.io.InputStream");
    }

    public static String o(ma maVar) {
        maVar.getClass();
        if (maVar instanceof la) {
            return ((la) maVar).f28657a;
        }
        if (maVar instanceof ka) {
            String z3 = mf.f.z(((ka) maVar).f28586a, "stickers/");
            int r8 = mf.f.r(z3, '/', 0, 6);
            if (r8 == -1) {
                return z3;
            }
            return z3.substring(0, r8);
        }
        l4.a.o();
        return null;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x007c. Please report as an issue. */
    public static void q(Canvas canvas, l9 l9Var, float f10, float f11) {
        float f12;
        float f13;
        int i;
        canvas.getClass();
        l9Var.getClass();
        if (f10 > 0.0f && f11 > 0.0f) {
            float f14 = f11;
            int saveLayer = canvas.saveLayer(0.0f, 0.0f, f10, f14, null);
            Paint paint = new Paint(1);
            paint.setColor(Color.argb(216, l9Var.f28653a, l9Var.f28654b, l9Var.f28655c));
            Canvas canvas2 = canvas;
            canvas2.drawRect(0.0f, 0.0f, f10, f14, paint);
            Paint paint2 = new Paint(1);
            int save = canvas2.save();
            canvas2.clipRect(0.0f, 0.0f, f10, f14);
            switch (m9.f28739a[l9Var.f28656d.ordinal()]) {
                case 1:
                    f12 = f10;
                    Paint paint3 = paint2;
                    float f15 = f11 * 0.34f;
                    paint3.setColor(Color.argb(200, 255, 255, 255));
                    paint3.setStyle(Paint.Style.STROKE);
                    paint3.setStrokeWidth(0.11f * f11);
                    float abs = (Math.abs(-0.26f) * f11) + f15;
                    float f16 = -abs;
                    while (f16 < f12 + abs) {
                        Paint paint4 = paint3;
                        float f17 = f16;
                        canvas2.drawLine(f17, 0.0f, ((-0.26f) * f11) + f16, f11, paint4);
                        f16 = f17 + f15;
                        paint3 = paint4;
                    }
                    f14 = f11;
                    canvas2.restoreToCount(save);
                    Paint paint5 = new Paint(1);
                    paint5.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                    canvas2.drawPath(s(f12, f14, false), paint5);
                    canvas2.drawPath(s(f12, f14, true), paint5);
                    canvas2.restoreToCount(saveLayer);
                    return;
                case 2:
                    f12 = f10;
                    float f18 = 0.45f * f11;
                    float f19 = f11 * 0.1f;
                    paint2.setColor(Color.argb(200, 255, 255, 255));
                    paint2.setStyle(Paint.Style.FILL);
                    float f20 = f18 / 2.0f;
                    for (float f21 = f20; f21 < f12 + f18; f21 += f18) {
                        canvas2.drawCircle(f21, f11 * 0.25f, f19, paint2);
                        canvas2.drawCircle(f21 + f20, 0.75f * f11, f19, paint2);
                    }
                    f14 = f11;
                    canvas2.restoreToCount(save);
                    Paint paint52 = new Paint(1);
                    paint52.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                    canvas2.drawPath(s(f12, f14, false), paint52);
                    canvas2.drawPath(s(f12, f14, true), paint52);
                    canvas2.restoreToCount(saveLayer);
                    return;
                case 3:
                    float f22 = f11 * 0.25f;
                    paint2.setColor(Color.argb(200, 255, 255, 255));
                    paint2.setStyle(Paint.Style.STROKE);
                    paint2.setStrokeWidth(0.03f * f11);
                    float f23 = 0.0f;
                    while (f23 < f10) {
                        canvas2.drawLine(f23, 0.0f, f23, f11, paint2);
                        f23 += f22;
                        canvas2 = canvas;
                    }
                    for (float f24 = 0.0f; f24 < f11; f24 += f22) {
                        canvas.drawLine(0.0f, f24, f10, f24, paint2);
                    }
                    f12 = f10;
                    canvas2 = canvas;
                    f14 = f11;
                    canvas2.restoreToCount(save);
                    Paint paint522 = new Paint(1);
                    paint522.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                    canvas2.drawPath(s(f12, f14, false), paint522);
                    canvas2.drawPath(s(f12, f14, true), paint522);
                    canvas2.restoreToCount(saveLayer);
                    return;
                case 4:
                    float f25 = f11 * 0.6f;
                    paint2.setColor(Color.argb(220, 255, 255, 255));
                    paint2.setStyle(Paint.Style.FILL);
                    float f26 = f25 / 2.0f;
                    float f27 = f11 * 0.25f;
                    Path path = new Path();
                    while (f26 < f10 + f25) {
                        path.reset();
                        float f28 = f11 * 0.5f;
                        float f29 = f27 * 0.5f;
                        float f30 = f28 + f29;
                        path.moveTo(f26, f30);
                        float f31 = f28 - (f27 * 0.2f);
                        float f32 = f28 - (f27 * 1.2f);
                        float f33 = f26;
                        Path path2 = path;
                        path2.cubicTo(f26 - f27, f31, f26 - f29, f32, f33, f28 - (f27 * 0.4f));
                        path2.cubicTo(f33 + f29, f32, f33 + f27, f31, f33, f30);
                        canvas2.drawPath(path2, paint2);
                        path = path2;
                        f26 = f33 + f25;
                    }
                    f12 = f10;
                    f14 = f11;
                    canvas2.restoreToCount(save);
                    Paint paint5222 = new Paint(1);
                    paint5222.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                    canvas2.drawPath(s(f12, f14, false), paint5222);
                    canvas2.drawPath(s(f12, f14, true), paint5222);
                    canvas2.restoreToCount(saveLayer);
                    return;
                case 5:
                    float f34 = f11 * 0.6f;
                    paint2.setColor(Color.argb(220, 255, 255, 255));
                    paint2.setStyle(Paint.Style.FILL);
                    float f35 = f11 * 0.2f;
                    Path path3 = new Path();
                    for (float f36 = f34 / 2.0f; f36 < f10 + f34; f36 += f34) {
                        path3.reset();
                        int i10 = 0;
                        while (i10 < 5) {
                            double d2 = i10;
                            double d10 = 1.5707963267948966d - (((d2 * 2.0d) * 3.141592653589793d) / 5.0d);
                            float cos = (((float) Math.cos(d10)) * f35) + f36;
                            float f37 = f11 * 0.5f;
                            int i11 = i10;
                            float sin = f37 - (((float) Math.sin(d10)) * f35);
                            if (i11 == 0) {
                                path3.moveTo(cos, sin);
                            } else {
                                path3.lineTo(cos, sin);
                            }
                            double d11 = 1.5707963267948966d - ((((d2 + 0.5d) * 2.0d) * 3.141592653589793d) / 5.0d);
                            float f38 = f35 * 0.4f;
                            path3.lineTo((((float) Math.cos(d11)) * f38) + f36, f37 - (f38 * ((float) Math.sin(d11))));
                            i10 = i11 + 1;
                        }
                        path3.close();
                        canvas2.drawPath(path3, paint2);
                    }
                    f12 = f10;
                    f14 = f11;
                    canvas2.restoreToCount(save);
                    Paint paint52222 = new Paint(1);
                    paint52222.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                    canvas2.drawPath(s(f12, f14, false), paint52222);
                    canvas2.drawPath(s(f12, f14, true), paint52222);
                    canvas2.restoreToCount(saveLayer);
                    return;
                case 6:
                    float f39 = f11 * 0.5f;
                    paint2.setColor(Color.argb(180, 255, 255, 255));
                    paint2.setStyle(Paint.Style.STROKE);
                    float f40 = f11 * 0.15f;
                    paint2.setStrokeWidth(f40);
                    paint2.setStrokeJoin(Paint.Join.MITER);
                    float f41 = -f39;
                    Path path4 = new Path();
                    float f42 = 0.85f * f11;
                    while (f41 < f10 + f39) {
                        path4.reset();
                        path4.moveTo(f41, f40);
                        path4.lineTo((f39 / 2.0f) + f41, f42);
                        f41 += f39;
                        path4.lineTo(f41, f40);
                        canvas2.drawPath(path4, paint2);
                    }
                    f12 = f10;
                    f14 = f11;
                    canvas2.restoreToCount(save);
                    Paint paint522222 = new Paint(1);
                    paint522222.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                    canvas2.drawPath(s(f12, f14, false), paint522222);
                    canvas2.drawPath(s(f12, f14, true), paint522222);
                    canvas2.restoreToCount(saveLayer);
                    return;
                case 7:
                    float f43 = f14;
                    float f44 = f43 * 0.4f;
                    float f45 = f43 * 0.2f;
                    float f46 = f43 * 0.05f;
                    paint2.setStyle(Paint.Style.STROKE);
                    paint2.setColor(Color.argb(80, 255, 255, 255));
                    paint2.setStrokeWidth(f45);
                    float f47 = 0.0f;
                    while (true) {
                        float f48 = f10 + f44;
                        if (f47 < f48) {
                            canvas2.drawLine(f47, 0.0f, f47, f43, paint2);
                            f47 += f44;
                            canvas2 = canvas;
                            f43 = f11;
                        } else {
                            paint2.setColor(Color.argb(80, 255, 255, 255));
                            float f49 = f11 * 0.5f;
                            canvas.drawLine(0.0f, f49, f10, f49, paint2);
                            paint2.setColor(Color.argb(160, 255, 255, 255));
                            paint2.setStrokeWidth(f46);
                            for (float f50 = f44 / 2.0f; f50 < f48; f50 += f44) {
                                canvas.drawLine(f50, 0.0f, f50, f11, paint2);
                            }
                            canvas2 = canvas;
                            canvas2.drawLine(0.0f, f45, f10, f45, paint2);
                            float f51 = f11 * 0.8f;
                            canvas2.drawLine(0.0f, f51, f10, f51, paint2);
                            f12 = f10;
                            f14 = f11;
                            canvas2.restoreToCount(save);
                            Paint paint5222222 = new Paint(1);
                            paint5222222.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                            canvas2.drawPath(s(f12, f14, false), paint5222222);
                            canvas2.drawPath(s(f12, f14, true), paint5222222);
                            canvas2.restoreToCount(saveLayer);
                            return;
                        }
                    }
                case 8:
                    f13 = f14;
                    float f52 = f13 * 0.6f;
                    paint2.setColor(Color.argb(200, 255, 255, 255));
                    paint2.setStyle(Paint.Style.STROKE);
                    paint2.setStrokeWidth(f13 * 0.1f);
                    Path path5 = new Path();
                    Path path6 = new Path();
                    float f53 = -f52;
                    float f54 = f13 * 0.15f;
                    float f55 = f13 * 0.35f;
                    path5.moveTo(f53, f55);
                    float f56 = 0.65f * f13;
                    path6.moveTo(f53, f56);
                    while (f53 < f10 + f52) {
                        float f57 = f52 / 2.0f;
                        float f58 = f57 / 2.0f;
                        float f59 = f53 + f58;
                        float f60 = f55 - f54;
                        float f61 = f55 + f54;
                        float f62 = f53 + f57;
                        Path path7 = path5;
                        path7.cubicTo(f59, f60, f59, f61, f62, f55);
                        float f63 = f62 + f58;
                        float f64 = f53 + f52;
                        path7.cubicTo(f63, f60, f63, f61, f64, f55);
                        float f65 = f56 + f54;
                        float f66 = f56 - f54;
                        path6.cubicTo(f59, f65, f59, f66, f62, f56);
                        path6.cubicTo(f63, f65, f63, f66, f64, f56);
                        path5 = path7;
                        f53 = f64;
                    }
                    canvas2.drawPath(path5, paint2);
                    canvas2.drawPath(path6, paint2);
                    f12 = f10;
                    f14 = f13;
                    canvas2.restoreToCount(save);
                    Paint paint52222222 = new Paint(1);
                    paint52222222.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                    canvas2.drawPath(s(f12, f14, false), paint52222222);
                    canvas2.drawPath(s(f12, f14, true), paint52222222);
                    canvas2.restoreToCount(saveLayer);
                    return;
                case 9:
                    f13 = f14;
                    float f67 = f13 * 0.5f;
                    paint2.setColor(Color.argb(190, 255, 255, 255));
                    paint2.setStyle(Paint.Style.FILL);
                    float f68 = -f67;
                    Path path8 = new Path();
                    boolean z3 = true;
                    while (f68 < f10 + f67) {
                        path8.reset();
                        if (z3) {
                            float f69 = f13 * 0.8f;
                            path8.moveTo(f68, f69);
                            path8.lineTo((f67 / 2.0f) + f68, f13 * 0.2f);
                            path8.lineTo(f68 + f67, f69);
                        } else {
                            float f70 = f13 * 0.2f;
                            path8.moveTo(f68, f70);
                            path8.lineTo((f67 / 2.0f) + f68, f13 * 0.8f);
                            path8.lineTo(f68 + f67, f70);
                        }
                        path8.close();
                        canvas2.drawPath(path8, paint2);
                        f68 += f67 / 2.0f;
                        z3 = !z3;
                    }
                    f12 = f10;
                    f14 = f13;
                    canvas2.restoreToCount(save);
                    Paint paint522222222 = new Paint(1);
                    paint522222222.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                    canvas2.drawPath(s(f12, f14, false), paint522222222);
                    canvas2.drawPath(s(f12, f14, true), paint522222222);
                    canvas2.restoreToCount(saveLayer);
                    return;
                case 10:
                    Paint paint6 = new Paint(1);
                    paint6.setColor(-1);
                    canvas2.drawRect(0.0f, 0.0f, f10, f14, paint6);
                    f13 = f14;
                    int rgb = Color.rgb(220, 50, 50);
                    int rgb2 = Color.rgb(40, 80, 180);
                    float f71 = f13 * 1.2f;
                    paint2.setStyle(Paint.Style.STROKE);
                    paint2.setStrokeWidth(f13 * 0.35f);
                    float abs2 = (Math.abs(-0.4f) * f13) + f71;
                    float f72 = (-f13) * 0.5f;
                    float f73 = f13 * 1.5f;
                    float f74 = -abs2;
                    boolean z9 = true;
                    while (f74 < f10 + abs2) {
                        if (z9) {
                            i = rgb;
                        } else {
                            i = rgb2;
                        }
                        paint2.setColor(i);
                        Paint paint7 = paint2;
                        canvas.drawLine(((-0.4f) * f72) + f74, f72, ((-0.4f) * f73) + f74, f73, paint7);
                        f74 = (f71 / 2.0f) + f74;
                        z9 = !z9;
                        abs2 = abs2;
                        paint2 = paint7;
                    }
                    canvas2 = canvas;
                    f12 = f10;
                    f14 = f13;
                    canvas2.restoreToCount(save);
                    Paint paint5222222222 = new Paint(1);
                    paint5222222222.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                    canvas2.drawPath(s(f12, f14, false), paint5222222222);
                    canvas2.drawPath(s(f12, f14, true), paint5222222222);
                    canvas2.restoreToCount(saveLayer);
                    return;
                case 11:
                    f12 = f10;
                    canvas2.restoreToCount(save);
                    Paint paint52222222222 = new Paint(1);
                    paint52222222222.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                    canvas2.drawPath(s(f12, f14, false), paint52222222222);
                    canvas2.drawPath(s(f12, f14, true), paint52222222222);
                    canvas2.restoreToCount(saveLayer);
                    return;
                default:
                    l4.a.o();
                    return;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0059 A[EDGE_INSN: B:30:0x0059->B:19:0x0059 BREAK  A[LOOP:0: B:9:0x0037->B:25:?], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static l9 r(pa r6) {
        /*
            r6.getClass()
            java.lang.String r0 = r6.f28923d
            java.lang.CharSequence r0 = mf.f.I(r0)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "#"
            java.lang.String r0 = mf.f.z(r0, r1)
            r1 = 16
            java.lang.Integer r1 = mf.m.k(r1, r0)
            r2 = 0
            if (r1 == 0) goto L2c
            int r0 = r0.length()
            r3 = 6
            if (r0 != r3) goto L24
            goto L25
        L24:
            r1 = r2
        L25:
            if (r1 == 0) goto L2c
            int r0 = r1.intValue()
            goto L2f
        L2c:
            r0 = 10395294(0x9e9e9e, float:1.456691E-38)
        L2f:
            we.a r1 = k9.getEntries()
            java.util.Iterator r1 = r1.iterator()
        L37:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L59
            java.lang.Object r3 = r1.next()
            r4 = r3
            k9 r4 = (k9) r4
            java.lang.String r4 = r4.name()
            java.lang.String r5 = e
            if (r4 != 0) goto L52
            if (r5 != 0) goto L50
            r4 = 1
            goto L56
        L50:
            r4 = 0
            goto L56
        L52:
            boolean r4 = r4.equalsIgnoreCase(r5)
        L56:
            if (r4 == 0) goto L37
            r2 = r3
        L59:
            k9 r2 = (k9) r2
            if (r2 != 0) goto L5f
            k9 r2 = k9.STRIPES
        L5f:
            l9 r6 = new l9
            int r1 = r0 >>> 16
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r3 = r0 >>> 8
            r3 = r3 & 255(0xff, float:3.57E-43)
            r0 = r0 & 255(0xff, float:3.57E-43)
            r6.<init>(r1, r3, r0, r2)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: w7.p9.r(pa):l9");
    }

    public static Path s(float f10, float f11, boolean z3) {
        float f12;
        float f13;
        float f14 = 0.08f * f11;
        int i = (int) (f11 / (0.12f * f11));
        if (i < 3) {
            i = 3;
        }
        float f15 = f11 / i;
        if (!z3) {
            f10 = 0.0f;
        }
        if (z3) {
            f12 = -1.0f;
        } else {
            f12 = 1.0f;
        }
        float f16 = f10 - (f12 * 2.0f);
        Path path = new Path();
        path.moveTo(f16, -2.0f);
        path.lineTo(f16, f11 + 2.0f);
        while (i >= 0) {
            float f17 = i * f15;
            if (i % 2 == 0) {
                f13 = f14;
            } else {
                f13 = 0.0f;
            }
            path.lineTo((f13 * f12) + f10, f17);
            i--;
        }
        path.close();
        return path;
    }

    public final void j() {
        synchronized (this) {
            f28917c = null;
        }
        e.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [pe.k] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.util.ArrayList] */
    public final List p(Context context) {
        ArrayList arrayList;
        Object kVar;
        Object kVar2;
        boolean z3;
        context.getClass();
        ArrayList arrayList2 = f28917c;
        if (arrayList2 == null) {
            synchronized (this) {
                try {
                    arrayList = f28917c;
                    if (arrayList == null) {
                        try {
                            InputStream open = context.getAssets().open("stickers/packs.json");
                            open.getClass();
                            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(open, mf.a.f20798a), 8192);
                            try {
                                String a10 = qc.a(bufferedReader);
                                bufferedReader.close();
                                fg.s sVar = f28916b;
                                sVar.getClass();
                                kVar = (List) sVar.a(new eg.c(s9.Companion.serializer()), a10);
                            } finally {
                            }
                        } catch (Throwable th) {
                            kVar = new pe.k(th);
                        }
                        Object obj = qe.s.f24023u;
                        if (kVar instanceof pe.k) {
                            kVar = obj;
                        }
                        List list = (List) kVar;
                        int i = 0;
                        try {
                            fg.s sVar2 = d8.f.f15790a;
                            ArrayList h3 = d8.h(context);
                            kVar2 = new ArrayList();
                            int size = h3.size();
                            int i10 = 0;
                            while (i10 < size) {
                                Object obj2 = h3.get(i10);
                                i10++;
                                fg.s sVar3 = d8.f.f15790a;
                                String str = ((s9) obj2).f29080a;
                                str.getClass();
                                if (d8.f.j(context, str) != null) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                if (z3) {
                                    kVar2.add(obj2);
                                }
                            }
                        } catch (Throwable th2) {
                            kVar2 = new pe.k(th2);
                        }
                        qe.s sVar4 = qe.s.f24023u;
                        boolean z9 = kVar2 instanceof pe.k;
                        qe.s sVar5 = kVar2;
                        if (z9) {
                            sVar5 = sVar4;
                        }
                        qe.s sVar6 = sVar5;
                        List list2 = list;
                        ArrayList arrayList3 = new ArrayList(qe.m.d(list2, 10));
                        Iterator it = list2.iterator();
                        while (it.hasNext()) {
                            arrayList3.add(((s9) it.next()).f29080a);
                        }
                        Set U = qe.l.U(arrayList3);
                        List list3 = list;
                        ArrayList arrayList4 = new ArrayList();
                        for (Object obj3 : sVar6) {
                            if (!U.contains(((s9) obj3).f29080a)) {
                                arrayList4.add(obj3);
                            }
                        }
                        ArrayList E = qe.l.E(list3, arrayList4);
                        arrayList = new ArrayList(qe.m.d(E, 10));
                        int size2 = E.size();
                        while (i < size2) {
                            Object obj4 = E.get(i);
                            i++;
                            arrayList.add(new t9((s9) obj4));
                        }
                        f28917c = arrayList;
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            return arrayList;
        }
        return arrayList2;
    }
}