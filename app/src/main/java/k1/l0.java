package k1;
import x.n;
import a0.f0;
import b.a;
import b.b;
import d.e;
import m.f;
import q.x;
import r.c;
import r.d;
import r.g;
import r.h;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Build;
import android.util.DisplayMetrics;
import androidx.datastore.preferences.protobuf.s1;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

/* loaded from: classes.dex */
public abstract class l0 {

    /* renamed from: a, reason: collision with root package name */
    public static final k0 f19495a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static Method f19496b;

    /* renamed from: c, reason: collision with root package name */
    public static Method f19497c;

    /* renamed from: d, reason: collision with root package name */
    public static boolean f19498d;

    public static final BlendMode A(int i) {
        BlendMode blendMode;
        BlendMode blendMode2;
        BlendMode blendMode3;
        BlendMode blendMode4;
        BlendMode blendMode5;
        BlendMode blendMode6;
        BlendMode blendMode7;
        BlendMode blendMode8;
        BlendMode blendMode9;
        BlendMode blendMode10;
        BlendMode blendMode11;
        BlendMode blendMode12;
        BlendMode blendMode13;
        BlendMode blendMode14;
        BlendMode blendMode15;
        BlendMode blendMode16;
        BlendMode blendMode17;
        BlendMode blendMode18;
        BlendMode blendMode19;
        BlendMode blendMode20;
        BlendMode blendMode21;
        BlendMode blendMode22;
        BlendMode blendMode23;
        BlendMode blendMode24;
        BlendMode blendMode25;
        BlendMode blendMode26;
        BlendMode blendMode27;
        BlendMode blendMode28;
        BlendMode blendMode29;
        BlendMode blendMode30;
        if (i == 0) {
            blendMode30 = BlendMode.CLEAR;
            return blendMode30;
        }
        if (i == 1) {
            blendMode29 = BlendMode.SRC;
            return blendMode29;
        }
        if (i == 2) {
            blendMode28 = BlendMode.DST;
            return blendMode28;
        }
        if (i == 3) {
            blendMode27 = BlendMode.SRC_OVER;
            return blendMode27;
        }
        if (i == 4) {
            blendMode26 = BlendMode.DST_OVER;
            return blendMode26;
        }
        if (i == 5) {
            blendMode25 = BlendMode.SRC_IN;
            return blendMode25;
        }
        if (i == 6) {
            blendMode24 = BlendMode.DST_IN;
            return blendMode24;
        }
        if (i == 7) {
            blendMode23 = BlendMode.SRC_OUT;
            return blendMode23;
        }
        if (i == 8) {
            blendMode22 = BlendMode.DST_OUT;
            return blendMode22;
        }
        if (i == 9) {
            blendMode21 = BlendMode.SRC_ATOP;
            return blendMode21;
        }
        if (i == 10) {
            blendMode20 = BlendMode.DST_ATOP;
            return blendMode20;
        }
        if (i == 11) {
            blendMode19 = BlendMode.XOR;
            return blendMode19;
        }
        if (i == 12) {
            blendMode18 = BlendMode.PLUS;
            return blendMode18;
        }
        if (i == 13) {
            blendMode17 = BlendMode.MODULATE;
            return blendMode17;
        }
        if (i == 14) {
            blendMode16 = BlendMode.SCREEN;
            return blendMode16;
        }
        if (i == 15) {
            blendMode15 = BlendMode.OVERLAY;
            return blendMode15;
        }
        if (i == 16) {
            blendMode14 = BlendMode.DARKEN;
            return blendMode14;
        }
        if (i == 17) {
            blendMode13 = BlendMode.LIGHTEN;
            return blendMode13;
        }
        if (i == 18) {
            blendMode12 = BlendMode.COLOR_DODGE;
            return blendMode12;
        }
        if (i == 19) {
            blendMode11 = BlendMode.COLOR_BURN;
            return blendMode11;
        }
        if (i == 20) {
            blendMode10 = BlendMode.HARD_LIGHT;
            return blendMode10;
        }
        if (i == 21) {
            blendMode9 = BlendMode.SOFT_LIGHT;
            return blendMode9;
        }
        if (i == 22) {
            blendMode8 = BlendMode.DIFFERENCE;
            return blendMode8;
        }
        if (i == 23) {
            blendMode7 = BlendMode.EXCLUSION;
            return blendMode7;
        }
        if (i == 24) {
            blendMode6 = BlendMode.MULTIPLY;
            return blendMode6;
        }
        if (i == 25) {
            blendMode5 = BlendMode.HUE;
            return blendMode5;
        }
        if (i == 26) {
            blendMode4 = BlendMode.SATURATION;
            return blendMode4;
        }
        if (i == 27) {
            blendMode3 = BlendMode.COLOR;
            return blendMode3;
        }
        if (i == 28) {
            blendMode2 = BlendMode.LUMINOSITY;
            return blendMode2;
        }
        blendMode = BlendMode.SRC_OVER;
        return blendMode;
    }

    public static final Rect B(j1.c cVar) {
        return new Rect((int) cVar.f18763a, (int) cVar.f18764b, (int) cVar.f18765c, (int) cVar.f18766d);
    }

    public static final Rect C(y2.k kVar) {
        return new Rect(kVar.f30809a, kVar.f30810b, kVar.f30811c, kVar.f30812d);
    }

    public static final RectF D(j1.c cVar) {
        return new RectF(cVar.f18763a, cVar.f18764b, cVar.f18765c, cVar.f18766d);
    }

    public static final Shader.TileMode E(int i) {
        if (i == 0) {
            return Shader.TileMode.CLAMP;
        }
        if (i == 1) {
            return Shader.TileMode.REPEAT;
        }
        if (i == 2) {
            return Shader.TileMode.MIRROR;
        }
        if (i == 3) {
            if (Build.VERSION.SDK_INT >= 31) {
                return f1.b();
            }
            return Shader.TileMode.CLAMP;
        }
        return Shader.TileMode.CLAMP;
    }

    public static final int F(long j10) {
        float[] fArr = l1.d.f19813a;
        return (int) (b(j10, l1.e) >>> 32);
    }

    public static final Bitmap.Config G(int i) {
        if (i == 0) {
            return Bitmap.Config.ARGB_8888;
        }
        if (i == 1) {
            return Bitmap.Config.ALPHA_8;
        }
        if (i == 2) {
            return Bitmap.Config.RGB_565;
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 26 && i == 3) {
            return ed.h.A();
        }
        if (i10 >= 26 && i == 4) {
            return ed.h.e();
        }
        return Bitmap.Config.ARGB_8888;
    }

    public static final j1.c H(Rect rect) {
        return new j1.c(rect.left, rect.top, rect.right, rect.bottom);
    }

    public static final j1.c I(RectF rectF) {
        return new j1.c(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    public static final PorterDuff.Mode J(int i) {
        if (i == 0) {
            return PorterDuff.Mode.CLEAR;
        }
        if (i == 1) {
            return PorterDuff.Mode.SRC;
        }
        if (i == 2) {
            return PorterDuff.Mode.DST;
        }
        if (i == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i == 4) {
            return PorterDuff.Mode.DST_OVER;
        }
        if (i == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i == 6) {
            return PorterDuff.Mode.DST_IN;
        }
        if (i == 7) {
            return PorterDuff.Mode.SRC_OUT;
        }
        if (i == 8) {
            return PorterDuff.Mode.DST_OUT;
        }
        if (i == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        if (i == 10) {
            return PorterDuff.Mode.DST_ATOP;
        }
        if (i == 11) {
            return PorterDuff.Mode.XOR;
        }
        if (i == 12) {
            return PorterDuff.Mode.ADD;
        }
        if (i == 14) {
            return PorterDuff.Mode.SCREEN;
        }
        if (i == 15) {
            return PorterDuff.Mode.OVERLAY;
        }
        if (i == 16) {
            return PorterDuff.Mode.DARKEN;
        }
        if (i == 17) {
            return PorterDuff.Mode.LIGHTEN;
        }
        if (i == 13) {
            return PorterDuff.Mode.MULTIPLY;
        }
        return PorterDuff.Mode.SRC_OVER;
    }

    public static String K(int i) {
        if (i == 0) {
            return "Clear";
        }
        if (i == 1) {
            return "Src";
        }
        if (i == 2) {
            return "Dst";
        }
        if (i == 3) {
            return "SrcOver";
        }
        if (i == 4) {
            return "DstOver";
        }
        if (i == 5) {
            return "SrcIn";
        }
        if (i == 6) {
            return "DstIn";
        }
        if (i == 7) {
            return "SrcOut";
        }
        if (i == 8) {
            return "DstOut";
        }
        if (i == 9) {
            return "SrcAtop";
        }
        if (i == 10) {
            return "DstAtop";
        }
        if (i == 11) {
            return "Xor";
        }
        if (i == 12) {
            return "Plus";
        }
        if (i == 13) {
            return "Modulate";
        }
        if (i == 14) {
            return "Screen";
        }
        if (i == 15) {
            return "Overlay";
        }
        if (i == 16) {
            return "Darken";
        }
        if (i == 17) {
            return "Lighten";
        }
        if (i == 18) {
            return "ColorDodge";
        }
        if (i == 19) {
            return "ColorBurn";
        }
        if (i == 20) {
            return "HardLight";
        }
        if (i == 21) {
            return "Softlight";
        }
        if (i == 22) {
            return "Difference";
        }
        if (i == 23) {
            return "Exclusion";
        }
        if (i == 24) {
            return "Multiply";
        }
        if (i == 25) {
            return "Hue";
        }
        if (i == 26) {
            return "Saturation";
        }
        if (i == 27) {
            return "Color";
        }
        if (i == 28) {
            return "Luminosity";
        }
        return "Unknown";
    }

    public static final void L(List list, List list2) {
        if (list2 == null) {
            if (list.size() < 2) {
                x.n("colors must have length of at least 2 if colorStops is omitted.");
            }
        } else {
            if (list.size() == list2.size()) {
                return;
            }
            x.n("colors and colorStops arguments must have equal length.");
        }
    }

    public static final int M(float f10, float[] fArr, int i) {
        float f11 = 0.0f;
        if (f10 >= 0.0f) {
            f11 = f10;
        }
        if (f11 > 1.0f) {
            f11 = 1.0f;
        }
        if (Math.abs(f11 - f10) > 1.05E-6f) {
            f11 = Float.NaN;
        }
        fArr[i] = f11;
        return !Float.isNaN(f11) ? 1 : 0;
    }

    public static final a a(f fVar) {
        Canvas canvas = b.f19467a;
        a aVar = new a();
        aVar.f19463a = new Canvas(m(fVar));
        return aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0179  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long b(float r21, float r22, float r23, float r24, l1.c r25) {
        /*
            Method dump skipped, instructions count: 482
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k1.l0.b(float, float, float, float, l1.c):long");
    }

    public static final long c(int i) {
        long j10 = i << 32;
        int i10 = r.f19522m;
        return j10;
    }

    public static final long d(long j10) {
        long j11 = j10 << 32;
        int i = r.f19522m;
        return j11;
    }

    public static long e(float f10, float f11, float f12, l1.c cVar, int i) {
        if ((i & 16) != 0) {
            cVar = l1.e;
        }
        return b(f10, f11, f12, 1.0f, cVar);
    }

    public static long f(int i, int i10, int i11) {
        return c(((i & 255) << 16) | (-16777216) | ((i10 & 255) << 8) | (i11 & 255));
    }

    public static f g(int i, int i10, int i11, int i12) {
        Bitmap createBitmap;
        if ((i12 & 4) != 0) {
            i11 = 0;
        }
        l1.q qVar = l1.e;
        Bitmap.Config G = G(i11);
        if (Build.VERSION.SDK_INT >= 26) {
            createBitmap = ed.h.f(i, i10, G(i11), a(qVar));
        } else {
            createBitmap = Bitmap.createBitmap((DisplayMetrics) null, i, i10, G);
            createBitmap.setHasAlpha(true);
        }
        return new f(createBitmap);
    }

    public static final LinearGradient h(long j10, long j11, List list, List list2) {
        L(list, list2);
        int o10 = o(list);
        return new LinearGradient(Float.intBitsToFloat((int) (j10 >> 32)), Float.intBitsToFloat((int) (j10 & 4294967295L)), Float.intBitsToFloat((int) (j11 >> 32)), Float.intBitsToFloat((int) (j11 & 4294967295L)), v(o10, list), w(list2, list, o10), E(0));
    }

    public static final f0 i() {
        return new f0(new Paint(7));
    }

    public static final o j(BitmapShader bitmapShader) {
        return new o(bitmapShader);
    }

    public static final long k(float f10, float f11) {
        long floatToRawIntBits = (Float.floatToRawIntBits(f11) & 4294967295L) | (Float.floatToRawIntBits(f10) << 32);
        int i = t0.f19530c;
        return floatToRawIntBits;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x009a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long l(float r17, float r18, float r19, float r20, l1.c r21) {
        /*
            Method dump skipped, instructions count: 337
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k1.l0.l(float, float, float, float, l1.c):long");
    }

    public static final Bitmap m(f fVar) {
        if (fVar instanceof f) {
            return fVar.f19477a;
        }
        s1.k("Unable to obtain android.graphics.Bitmap");
        return null;
    }

    public static final long n(long j10, long j11) {
        float f10;
        float f11;
        long b10 = b(j10, f(j11));
        float d2 = d(j11);
        float d10 = d(b10);
        float f12 = 1.0f - d10;
        float f13 = (d2 * f12) + d10;
        float h3 = h(b10);
        float h10 = h(j11);
        float f14 = 0.0f;
        if (f13 == 0.0f) {
            f10 = 0.0f;
        } else {
            f10 = (((h10 * d2) * f12) + (h3 * d10)) / f13;
        }
        float g8 = g(b10);
        float g10 = g(j11);
        if (f13 == 0.0f) {
            f11 = 0.0f;
        } else {
            f11 = (((g10 * d2) * f12) + (g8 * d10)) / f13;
        }
        float e = e(b10);
        float e8 = e(j11);
        if (f13 != 0.0f) {
            f14 = (((e8 * d2) * f12) + (e * d10)) / f13;
        }
        return l(f10, f11, f14, f13, f(j11));
    }

    public static final int o(List list) {
        int i = 0;
        if (Build.VERSION.SDK_INT >= 26) {
            return 0;
        }
        int f10 = qe.f(list);
        for (int i10 = 1; i10 < f10; i10++) {
            if (d(((r) list.get(i10)).f19523a) == 0.0f) {
                i++;
            }
        }
        return i;
    }

    public static void p(m1.d dVar, l0 l0Var, long j10) {
        boolean z3 = l0Var instanceof f0;
        m1.g gVar = m1.g.f20429a;
        if (z3) {
            j1.c cVar = ((f0) l0Var).e;
            float f10 = cVar.f18763a;
            float f11 = cVar.f18764b;
            dVar.k0(j10, (Float.floatToRawIntBits(f10) << 32) | (Float.floatToRawIntBits(f11) & 4294967295L), z(cVar), 1.0f, gVar, 3);
            return;
        }
        if (l0Var instanceof g0) {
            g0 g0Var = (g0) l0Var;
            h hVar = g0Var.f19480f;
            if (hVar != null) {
                dVar.J0(hVar, j10, gVar);
                return;
            }
            j1.d dVar2 = g0Var.e;
            float f12 = dVar2.f18768b;
            float f13 = dVar2.f18767a;
            float intBitsToFloat = Float.intBitsToFloat((int) (dVar2.f18773h >> 32));
            float f14 = dVar2.f18769c - f13;
            float f15 = dVar2.f18770d - f12;
            dVar.G(j10, (Float.floatToRawIntBits(f13) << 32) | (Float.floatToRawIntBits(f12) & 4294967295L), (Float.floatToRawIntBits(f15) & 4294967295L) | (Float.floatToRawIntBits(f14) << 32), (Float.floatToRawIntBits(intBitsToFloat) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32), gVar);
            return;
        }
        if (l0Var instanceof e0) {
            dVar.J0(((e0) l0Var).e, j10, gVar);
        } else {
            l4.a.o();
        }
    }

    public static void q(Canvas canvas, boolean z3) {
        Method method;
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            if (z3) {
                e(canvas);
                return;
            } else {
                d.p(canvas);
                return;
            }
        }
        if (!f19498d) {
            try {
                if (i == 28) {
                    Method declaredMethod = Class.class.getDeclaredMethod("getDeclaredMethod", String.class, new Class[0].getClass());
                    f19496b = (Method) declaredMethod.invoke(Canvas.class, "insertReorderBarrier", new Class[0]);
                    f19497c = (Method) declaredMethod.invoke(Canvas.class, "insertInorderBarrier", new Class[0]);
                } else {
                    f19496b = Canvas.class.getDeclaredMethod("insertReorderBarrier", null);
                    f19497c = Canvas.class.getDeclaredMethod("insertInorderBarrier", null);
                }
                Method method2 = f19496b;
                if (method2 != null) {
                    method2.setAccessible(true);
                }
                Method method3 = f19497c;
                if (method3 != null) {
                    method3.setAccessible(true);
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
            f19498d = true;
        }
        if (z3) {
            try {
                Method method4 = f19496b;
                if (method4 != null) {
                    method4.invoke(canvas, null);
                }
            } catch (IllegalAccessException | InvocationTargetException unused2) {
                return;
            }
        }
        if (!z3 && (method = f19497c) != null) {
            method.invoke(canvas, null);
        }
    }

    public static final boolean s(float[] fArr) {
        if (fArr.length < 16 || fArr[0] != 1.0f || fArr[1] != 0.0f || fArr[2] != 0.0f || fArr[3] != 0.0f || fArr[4] != 0.0f || fArr[5] != 1.0f || fArr[6] != 0.0f || fArr[7] != 0.0f || fArr[8] != 0.0f || fArr[9] != 0.0f || fArr[10] != 1.0f || fArr[11] != 0.0f || fArr[12] != 0.0f || fArr[13] != 0.0f || fArr[14] != 0.0f || fArr[15] != 1.0f) {
            return false;
        }
        return true;
    }

    public static final long t(long j10, long j11, float f10) {
        l1.l lVar = l1.d.f19834x;
        long b10 = b(j10, lVar);
        long b11 = b(j11, lVar);
        float d2 = d(b10);
        float h3 = h(b10);
        float g8 = g(b10);
        float e = e(b10);
        float d10 = d(b11);
        float h10 = h(b11);
        float g10 = g(b11);
        float e8 = e(b11);
        if (f10 < 0.0f) {
            f10 = 0.0f;
        }
        if (f10 > 1.0f) {
            f10 = 1.0f;
        }
        return b(l(c7.b(h3, h10, f10), c7.b(g8, g10, f10), c7.b(e, e8, f10), c7.b(d2, d10, f10), lVar), f(j11));
    }

    public static final float u(long j10) {
        l1.c f10 = f(j10);
        if (!l1.a(f10.f19811b, l1.b.f19806a)) {
            a("The specified color must be encoded in an RGB color space. The supplied color space is " + ((Object) l1.b(f10.f19811b)));
        }
        l1.m mVar = ((l1.q) f10).f19870p;
        double invoke = mVar.invoke(h(j10));
        float invoke2 = (float) ((mVar.invoke(e(j10)) * 0.0722d) + (mVar.invoke(g(j10)) * 0.7152d) + (invoke * 0.2126d));
        if (invoke2 < 0.0f) {
            invoke2 = 0.0f;
        }
        if (invoke2 > 1.0f) {
            return 1.0f;
        }
        return invoke2;
    }

    public static final int[] v(int i, List list) {
        int i10;
        int i11 = 0;
        if (Build.VERSION.SDK_INT >= 26) {
            int size = list.size();
            int[] iArr = new int[size];
            while (i11 < size) {
                iArr[i11] = F(((r) list.get(i11)).f19523a);
                i11++;
            }
            return iArr;
        }
        int[] iArr2 = new int[list.size() + i];
        int size2 = list.size() - 1;
        int size3 = list.size();
        int i12 = 0;
        while (i11 < size3) {
            long j10 = ((r) list.get(i11)).f19523a;
            if (d(j10) == 0.0f) {
                if (i11 == 0) {
                    i10 = i12 + 1;
                    iArr2[i12] = F(c(((r) list.get(1)).f19523a, 0.0f));
                } else if (i11 == size2) {
                    i10 = i12 + 1;
                    iArr2[i12] = F(c(((r) list.get(i11 - 1)).f19523a, 0.0f));
                } else {
                    int i13 = i12 + 1;
                    iArr2[i12] = F(c(((r) list.get(i11 - 1)).f19523a, 0.0f));
                    i12 += 2;
                    iArr2[i13] = F(c(((r) list.get(i11 + 1)).f19523a, 0.0f));
                }
                i12 = i10;
            } else {
                iArr2[i12] = F(j10);
                i12++;
            }
            i11++;
        }
        return iArr2;
    }

    public static final float[] w(List list, List list2, int i) {
        float f10;
        float f11;
        float size;
        if (i == 0) {
            if (list != null) {
                return qe.l.N(list);
            }
            return null;
        }
        float[] fArr = new float[list2.size() + i];
        if (list != null) {
            f10 = ((Number) list.get(0)).floatValue();
        } else {
            f10 = 0.0f;
        }
        fArr[0] = f10;
        int size2 = list2.size() - 1;
        int i10 = 1;
        for (int i11 = 1; i11 < size2; i11++) {
            long j10 = ((r) list2.get(i11)).f19523a;
            if (list != null) {
                size = ((Number) list.get(i11)).floatValue();
            } else {
                size = i11 / (list2.size() - 1);
            }
            int i12 = i10 + 1;
            fArr[i10] = size;
            if (d(j10) == 0.0f) {
                i10 += 2;
                fArr[i12] = size;
            } else {
                i10 = i12;
            }
        }
        if (list != null) {
            f11 = ((Number) list.get(list2.size() - 1)).floatValue();
        } else {
            f11 = 1.0f;
        }
        fArr[i10] = f11;
        return fArr;
    }

    public static final void x(Matrix matrix, float[] fArr) {
        float f10 = fArr[0];
        float f11 = fArr[1];
        float f12 = fArr[2];
        float f13 = fArr[3];
        float f14 = fArr[4];
        float f15 = fArr[5];
        float f16 = fArr[6];
        float f17 = fArr[7];
        float f18 = fArr[8];
        float f19 = fArr[12];
        float f20 = fArr[13];
        float f21 = fArr[15];
        fArr[0] = f10;
        fArr[1] = f14;
        fArr[2] = f19;
        fArr[3] = f11;
        fArr[4] = f15;
        fArr[5] = f20;
        fArr[6] = f13;
        fArr[7] = f17;
        fArr[8] = f21;
        matrix.setValues(fArr);
        fArr[0] = f10;
        fArr[1] = f11;
        fArr[2] = f12;
        fArr[3] = f13;
        fArr[4] = f14;
        fArr[5] = f15;
        fArr[6] = f16;
        fArr[7] = f17;
        fArr[8] = f18;
    }

    public static final void y(Matrix matrix, float[] fArr) {
        matrix.getValues(fArr);
        float f10 = fArr[0];
        float f11 = fArr[1];
        float f12 = fArr[2];
        float f13 = fArr[3];
        float f14 = fArr[4];
        float f15 = fArr[5];
        float f16 = fArr[6];
        float f17 = fArr[7];
        float f18 = fArr[8];
        fArr[0] = f10;
        fArr[1] = f13;
        fArr[2] = 0.0f;
        fArr[3] = f16;
        fArr[4] = f11;
        fArr[5] = f14;
        fArr[6] = 0.0f;
        fArr[7] = f17;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = 1.0f;
        fArr[11] = 0.0f;
        fArr[12] = f12;
        fArr[13] = f15;
        fArr[14] = 0.0f;
        fArr[15] = f18;
    }

    public static final long z(j1.c cVar) {
        float f10 = cVar.f18765c - cVar.f18763a;
        float f11 = cVar.f18766d - cVar.f18764b;
        return (Float.floatToRawIntBits(f11) & 4294967295L) | (Float.floatToRawIntBits(f10) << 32);
    }

    public abstract j1.c r();
}
