package u7;
import v6.b;
import v6.c;
import v6.d;
import b8.j1;
import o0.h;
import q.x;
import u7.m3;
import u7.v6;
import y4.a;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import com.google.android.filament.Engine;
import com.google.android.filament.Texture;
import com.google.android.filament.android.TextureHelper;
import java.util.HashMap;
import wa.b9;

/* loaded from: classes.dex */
public abstract class v6 {

    /* renamed from: a, reason: collision with root package name */
    public static final pe.n f26967a = new pe.n(new c2(7));

    /* renamed from: b, reason: collision with root package name */
    public static final pe.n f26968b = new pe.n(new c2(8));

    /* renamed from: c, reason: collision with root package name */
    public static final pe.n f26969c = new pe.n(new c2(9));

    /* renamed from: d, reason: collision with root package name */
    public static final pe.n f26970d;
    public static final pe.n e;

    /* renamed from: f, reason: collision with root package name */
    public static final pe.n f26971f;

    /* renamed from: g, reason: collision with root package name */
    public static String f26972g;

    /* renamed from: h, reason: collision with root package name */
    public static Bitmap f26973h;
    public static final HashMap i;

    static {
        new pe.n(new c2(10));
        f26970d = new pe.n(new c2(11));
        e = new pe.n(new c2(12));
        f26971f = new pe.n(new c2(13));
        i = new HashMap();
    }

    public static final int a(int i10, float f10) {
        return b9.e((int) ((((((-527380) >> i10) & 255) - r0) * f10) + (((-395019) >> i10) & 255)), 0, 255);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00db  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final android.graphics.Bitmap b(java.lang.String r23, boolean r24, boolean r25, int r26, java.lang.String r27, boolean r28, java.lang.String r29, android.graphics.Bitmap r30, java.lang.Integer r31, int r32, float r33, android.graphics.Typeface r34, float r35, float r36, float r37, android.graphics.Bitmap r38, int r39, int r40, boolean r41) {
        /*
            Method dump skipped, instructions count: 383
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u7.v6.b(java.lang.String, boolean, boolean, int, java.lang.String, boolean, java.lang.String, android.graphics.Bitmap, java.lang.Integer, int, float, android.graphics.Typeface, float, float, float, android.graphics.Bitmap, int, int, boolean):android.graphics.Bitmap");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:(6:(21:182|(1:97)(1:181)|(3:154|155|(22:157|158|159|(4:162|(2:164|165)(2:167|168)|166|160)|169|100|(1:102)(1:153)|103|104|105|106|(1:108)|109|110|111|112|113|114|115|(1:117)|(1:119)|(3:121|(3:123|(3:125|126|127)(1:129)|128)|130)))|99|100|(0)(0)|103|104|105|106|(0)|109|110|111|112|113|114|115|(0)|(0)|(0))|114|115|(0)|(0)|(0))|105|106|(0)|109|110|111|112|113) */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x02b9, code lost:
    
        if (r18 != false) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x02a7, code lost:
    
        if (r18 != false) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x0217, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x00fd, code lost:
    
        if (r6 < 1) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0296, code lost:
    
        if (r18 != false) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0298, code lost:
    
        r1.restore();
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x018c A[Catch: all -> 0x0153, OutOfMemoryError -> 0x0158, Exception -> 0x0167, TryCatch #6 {all -> 0x0153, blocks: (B:72:0x00d1, B:84:0x00de, B:87:0x00ec, B:184:0x00f2, B:155:0x0129, B:157:0x012d, B:159:0x012f, B:160:0x0140, B:162:0x0146, B:164:0x014e, B:166:0x0178, B:100:0x0188, B:102:0x018c, B:103:0x0192, B:106:0x01b3, B:109:0x01c6, B:90:0x0109, B:190:0x00e8), top: B:71:0x00d1 }] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01f0 A[Catch: all -> 0x01f4, Exception -> 0x01f7, OutOfMemoryError -> 0x02a7, TryCatch #7 {all -> 0x01f4, blocks: (B:112:0x01e6, B:115:0x01eb, B:117:0x01f0, B:119:0x01fc, B:121:0x0201, B:123:0x0209, B:126:0x0213, B:134:0x02b6, B:75:0x0244, B:77:0x0256, B:80:0x0286), top: B:111:0x01e6 }] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01fc A[Catch: all -> 0x01f4, Exception -> 0x01f7, OutOfMemoryError -> 0x02a7, TryCatch #7 {all -> 0x01f4, blocks: (B:112:0x01e6, B:115:0x01eb, B:117:0x01f0, B:119:0x01fc, B:121:0x0201, B:123:0x0209, B:126:0x0213, B:134:0x02b6, B:75:0x0244, B:77:0x0256, B:80:0x0286), top: B:111:0x01e6 }] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0201 A[Catch: all -> 0x01f4, Exception -> 0x01f7, OutOfMemoryError -> 0x02a7, TryCatch #7 {all -> 0x01f4, blocks: (B:112:0x01e6, B:115:0x01eb, B:117:0x01f0, B:119:0x01fc, B:121:0x0201, B:123:0x0209, B:126:0x0213, B:134:0x02b6, B:75:0x0244, B:77:0x0256, B:80:0x0286), top: B:111:0x01e6 }] */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0129 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0123  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void c(android.graphics.Canvas r29, int r30, int r31, android.content.Context r32, int r33, int r34, m3 r35, int r36, android.graphics.ColorFilter r37, int r38) {
        /*
            Method dump skipped, instructions count: 981
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u7.v6.c(android.graphics.Canvas, int, int, android.content.Context, int, int, m3, int, android.graphics.ColorFilter, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0034, code lost:
    
        if (r2.isRecycled() == false) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final android.graphics.Bitmap d(int r14, android.content.Context r15, m3 r16) {
        /*
            r6 = r16
            r15.getClass()
            r6.getClass()
            r0 = -2
            int r10 = r6.l1(r14, r0)
            java.lang.String r11 = r6.C0(r14)
            r12 = 0
            if (r11 != 0) goto L15
            return r12
        L15:
            java.util.HashMap r1 = u7.v6.i
            monitor-enter(r1)
            java.lang.Object r2 = r1.get(r11)     // Catch: java.lang.Throwable -> L37
            pe.j r2 = (pe.j) r2     // Catch: java.lang.Throwable -> L37
            if (r2 == 0) goto L3c
            java.lang.Object r3 = r2.f22693u     // Catch: java.lang.Throwable -> L37
            java.lang.Number r3 = (java.lang.Number) r3     // Catch: java.lang.Throwable -> L37
            int r3 = r3.intValue()     // Catch: java.lang.Throwable -> L37
            java.lang.Object r2 = r2.f22694v     // Catch: java.lang.Throwable -> L37
            android.graphics.Bitmap r2 = (android.graphics.Bitmap) r2     // Catch: java.lang.Throwable -> L37
            if (r3 != r10) goto L3c
            if (r2 == 0) goto L3a
            boolean r3 = r2.isRecycled()     // Catch: java.lang.Throwable -> L37
            if (r3 != 0) goto L3c
            goto L3a
        L37:
            r0 = move-exception
            r14 = r0
            goto L9a
        L3a:
            monitor-exit(r1)
            return r2
        L3c:
            monitor-exit(r1)
            java.util.List r1 = r6.f1(r14, r0)
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L67
            java.util.List r1 = r6.k1(r14, r0)
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L67
            java.util.List r1 = r6.j1(r14, r0)
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L67
            boolean r0 = r6.l0(r14, r0, r15)
            if (r0 == 0) goto L85
        L67:
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888     // Catch: java.lang.Throwable -> L85
            r1 = 512(0x200, float:7.175E-43)
            r2 = 768(0x300, float:1.076E-42)
            android.graphics.Bitmap r13 = android.graphics.Bitmap.createBitmap(r1, r2, r0)     // Catch: java.lang.Throwable -> L85
            r13.getClass()     // Catch: java.lang.Throwable -> L85
            android.graphics.Canvas r0 = new android.graphics.Canvas     // Catch: java.lang.Throwable -> L85
            r0.<init>(r13)     // Catch: java.lang.Throwable -> L85
            r8 = 0
            r9 = 256(0x100, float:3.59E-43)
            r5 = -2
            r7 = 1024(0x400, float:1.435E-42)
            r4 = r14
            r3 = r15
            c(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L85
            r12 = r13
        L85:
            java.util.HashMap r14 = u7.v6.i
            monitor-enter(r14)
            java.lang.Integer r15 = java.lang.Integer.valueOf(r10)     // Catch: java.lang.Throwable -> L96
            pe.j r0 = new pe.j     // Catch: java.lang.Throwable -> L96
            r0.<init>(r15, r12)     // Catch: java.lang.Throwable -> L96
            r14.put(r11, r0)     // Catch: java.lang.Throwable -> L96
            monitor-exit(r14)
            return r12
        L96:
            r0 = move-exception
            r15 = r0
            monitor-exit(r14)
            throw r15
        L9a:
            monitor-exit(r1)
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: u7.v6.d(int, android.content.Context, m3):android.graphics.Bitmap");
    }

    /* JADX WARN: Type inference failed for: r10v0, types: [com.google.android.filament.Texture, java.lang.Object] */
    public static final Texture e(Engine engine, Context context, int i10, int i11, m3 m3Var, df.l lVar) {
        long nCreateBuilder;
        long nBuilderBuild;
        context.getClass();
        float[] fArr = v1.f26942a;
        int i12 = 1;
        l2.P0++;
        int max = Math.max(1024, 768);
        if (max >= 1) {
            i12 = max;
        }
        int numberOfLeadingZeros = 32 - Integer.numberOfLeadingZeros(i12);
        nCreateBuilder = Texture.nCreateBuilder();
        new b0.a(nCreateBuilder, 7);
        Texture.nBuilderWidth(nCreateBuilder, 1024);
        Texture.nBuilderHeight(nCreateBuilder, 768);
        Texture.nBuilderLevels(nCreateBuilder, numberOfLeadingZeros);
        Texture.nBuilderSampler(nCreateBuilder, 0);
        Texture.nBuilderFormat(nCreateBuilder, 31);
        nBuilderBuild = Texture.nBuilderBuild(nCreateBuilder, engine.getNativeObject());
        if (nBuilderBuild != 0) {
            Object obj = new Object();
            obj.f4233a = nBuilderBuild;
            a h3 = androidx.lifecycle.h(m3Var);
            wf.e eVar = pf.l0.f22767a;
            pf.b0.x(h3, wf.d.f29913w, new j1(m3Var, i10, 1024, 768, context, i11, engine, obj, lVar, null), 2);
            return obj;
        }
        x.o("Couldn't create Texture");
        return null;
    }

    /* JADX WARN: Type inference failed for: r12v4, types: [com.google.android.filament.Texture, java.lang.Object] */
    public static final Texture f(Engine engine, boolean z3) {
        long nCreateBuilder;
        long nBuilderBuild;
        Bitmap createBitmap = Bitmap.createBitmap(256, 384, Bitmap.Config.ARGB_8888);
        createBitmap.getClass();
        Canvas canvas = new Canvas(createBitmap);
        canvas.drawColor(0);
        Paint paint = new Paint(1);
        paint.setColor(Color.argb(255, 24, 24, 27));
        paint.setStyle(Paint.Style.FILL);
        float f10 = 256;
        float f11 = 0.12f * f10;
        if (z3) {
            canvas.drawRect(0.0f, 0.0f, f11, 384, paint);
        } else {
            canvas.drawRect(f10 - f11, 0.0f, f10, 384, paint);
        }
        nCreateBuilder = Texture.nCreateBuilder();
        new b0.a(nCreateBuilder, 7);
        Texture.nBuilderWidth(nCreateBuilder, 256);
        Texture.nBuilderHeight(nCreateBuilder, 384);
        Texture.nBuilderLevels(nCreateBuilder, 1);
        Texture.nBuilderSampler(nCreateBuilder, 0);
        Texture.nBuilderFormat(nCreateBuilder, 31);
        nBuilderBuild = Texture.nBuilderBuild(nCreateBuilder, engine.getNativeObject());
        if (nBuilderBuild != 0) {
            Object obj = new Object();
            obj.f4233a = nBuilderBuild;
            TextureHelper.a(engine, obj, createBitmap);
            createBitmap.recycle();
            return obj;
        }
        x.o("Couldn't create Texture");
        return null;
    }

    public static final Bitmap g(int i10, String str) {
        int i11;
        str.getClass();
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            int i12 = 1;
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(str, options);
            int i13 = options.outWidth;
            if (i13 > 0 && (i11 = options.outHeight) > 0) {
                int max = Math.max(i13, i11);
                while (true) {
                    int i14 = i12 * 2;
                    if (max / i14 >= i10) {
                        i12 = i14;
                    } else {
                        BitmapFactory.Options options2 = new BitmapFactory.Options();
                        options2.inSampleSize = i12;
                        return BitmapFactory.decodeFile(str, options2);
                    }
                }
            }
        } catch (Exception | OutOfMemoryError unused) {
        }
        return null;
    }

    public static final float[] h() {
        return (float[]) f26968b.getValue();
    }

    public static final int i(int i10) {
        return b9.e((int) ((i10 & 255) * h()[2]), 0, 255) | (((i10 >>> 24) & 255) << 24) | (b9.e((int) (((i10 >> 16) & 255) * h()[0]), 0, 255) << 16) | (b9.e((int) (((i10 >> 8) & 255) * h()[1]), 0, 255) << 8);
    }

    public static final float[] j() {
        return new float[]{h()[0], 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, h()[1], 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, h()[2], 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f};
    }
}