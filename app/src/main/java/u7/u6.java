package u7;
import u6.b;
import u6.c;
import g3.a;
import u7.n7;
import u7.s1;
import u7.u6;
import v1.i;

import wa.b9;

/* loaded from: classes.dex */
public abstract class u6 {

    /* renamed from: a, reason: collision with root package name */
    public static final pe.n f26935a = new pe.n(new c2(6));

    public static final float a(float f10, float f11) {
        if (f10 <= 0.0f) {
            return 0.0f;
        }
        if (f10 >= 1.0f) {
            return 1.0f;
        }
        float d2 = b9.d(f11, 0.0f, 6.0f);
        float k3 = 1.0f - k(6.0f);
        if (k3 < 0.2f) {
            k3 = 0.2f;
        }
        float d10 = b9.d((f10 - k(d2)) / k3, 0.0f, 1.0f);
        return a.w(d10, 2.0f, 3.0f, d10 * d10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:115:0x0040, code lost:
    
        if (r8 > 4) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0038, code lost:
    
        if (r8 > 4) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x003a, code lost:
    
        r8 = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x01ea, code lost:
    
        if (r1 < (-4)) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x01ec, code lost:
    
        r1 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x01f4, code lost:
    
        if (r9 > 4) goto L101;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final s1 b(int r31, int r32, float r33, int r34, float r35, float r36) {
        /*
            Method dump skipped, instructions count: 722
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u7.u6.b(int, int, float, int, float, float):s1");
    }

    /* JADX WARN: Code restructure failed: missing block: B:133:0x00a1, code lost:
    
        if (r43 == (r20 + 1)) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final n7 c(int r43, int r44, float r45, int r46, float r47, float r48, float r49) {
        /*
            Method dump skipped, instructions count: 1202
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u7.u6.c(int, int, float, int, float, float, float):n7");
    }

    public static final float d(int i, float f10, float f11, int i10) {
        int i11 = i - 4;
        int i12 = i + 4;
        int i13 = i10 - 1;
        if (i11 < 0) {
            i12 += -i11;
            i11 = 0;
        }
        if (i12 > i13) {
            i11 -= i12 - i13;
            i12 = i13;
        }
        return f10 * 0.005f * 2.0f * b9.d(f11, Math.max(0, i11) - i, Math.min(i13, i12) - i);
    }

    public static final float e(float f10) {
        if (f10 <= 1.0f) {
            return (i((f10 - 0.5f) / 0.5f) * l().f26056a[1]) + j(f10);
        }
        if (f10 > 4.0f) {
            f10 = 4.0f;
        }
        int i = (int) f10;
        if (i > 3) {
            i = 3;
        }
        return i(l().f26056a[i], l().f26056a[i + 1], i(f10 - i));
    }

    public static final float f(float f10) {
        float i;
        float max = Math.max(0.0f, f10 - 4.0f);
        if (f10 > 4.0f) {
            f10 = 4.0f;
        }
        if (f10 <= 1.0f) {
            i = i(f10) * l().f26057b[1];
        } else {
            int i10 = (int) f10;
            if (i10 > 3) {
                i10 = 3;
            }
            i = i(l().f26057b[i10], l().f26057b[i10 + 1], i(f10 - i10));
        }
        return i - ((max * 0.01f) + (i(max) * 0.015f));
    }

    public static final float g(float f10, float f11, float f12) {
        float f13 = 4;
        float f14 = 4.0f;
        if (f12 <= 4.0f) {
            f14 = f12;
        }
        return i(i(((f13 - f14) * 22.0f) / f13, 90.0f, a(f10, f12)), 0.0f, f11);
    }

    public static final float h(float f10, float f11, float f12) {
        if (f12 < 0.0f) {
            return g(f10, f11, -f12);
        }
        if (f12 > 1.0f) {
            if (f12 > 4.0f) {
                f12 = 4.0f;
            }
            if (f12 > 1.0f) {
                double d2 = 0.6f;
                f12 = (float) (((1.0d - Math.pow(d2, f12 - 1.0f)) / (1.0d - d2)) + 1.0d);
            }
            double d10 = 0.6f;
            return i(158.0f, 158.0f, b9.d((f12 - 1.0f) / (((float) (((1.0d - Math.pow(d10, 3.0f)) / (1.0d - d10)) + 1.0d)) - 1.0f), 0.0f, 1.0f));
        }
        if (f12 >= 0.5f) {
            return i(90.0f, 158.0f, (f12 - 0.5f) / 0.5f);
        }
        return i(22.0f, 90.0f, f12 / 0.5f);
    }

    public static final float i(float f10) {
        float d2 = b9.d(f10, 0.0f, 1.0f);
        return a.w(d2, 2.0f, 3.0f, d2 * d2);
    }

    public static final float j(float f10) {
        return ((float) Math.sin(Math.toRadians((Math.sin(b9.d(f10, 0.0f, 1.0f) * 3.141592653589793d) * 11.0f) / 2.0d))) * 1.0f;
    }

    public static final float k(float f10) {
        float min = Math.min(f10, 4.0f);
        float f11 = f10 - 4;
        if (f11 < 0.0f) {
            f11 = 0.0f;
        }
        return a.y(f11, 0.55f, min, 0.09f);
    }

    public static final d1 l() {
        return (d1) f26935a.getValue();
    }
}
