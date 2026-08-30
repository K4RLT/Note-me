package wa;
import a.a;

/* loaded from: classes.dex */
public abstract class b9 {
    public static float a(float f10, float f11) {
        if (f10 < f11) {
            return f11;
        }
        return f10;
    }

    public static int b(int i, int i10) {
        if (i < i10) {
            return i10;
        }
        return i;
    }

    public static double c(double d2, double d10, double d11) {
        if (d10 <= d11) {
            if (d2 < d10) {
                return d10;
            }
            if (d2 > d11) {
                return d11;
            }
            return d2;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + d11 + " is less than minimum " + d10 + '.');
    }

    public static float d(float f10, float f11, float f12) {
        if (f11 <= f12) {
            if (f10 < f11) {
                return f11;
            }
            if (f10 > f12) {
                return f12;
            }
            return f10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + f12 + " is less than minimum " + f11 + '.');
    }

    public static int e(int i, int i10, int i11) {
        if (i10 <= i11) {
            if (i < i10) {
                return i10;
            }
            if (i > i11) {
                return i11;
            }
            return i;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i11 + " is less than minimum " + i10 + '.');
    }

    public static long f(long j10, long j11, long j12) {
        if (j11 <= j12) {
            if (j10 < j11) {
                return j11;
            }
            if (j10 > j12) {
                return j12;
            }
            return j10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + j12 + " is less than minimum " + j11 + '.');
    }

    public static Comparable g(Float f10, jf.a aVar) {
        float f11 = aVar.f19188b;
        float f12 = aVar.f19187a;
        if (f12 <= f11) {
            if (jf.a(f10, Float.valueOf(f12)) && !jf.a(Float.valueOf(f12), f10)) {
                return Float.valueOf(f12);
            }
            if (jf.a(Float.valueOf(f11), f10) && !jf.a(f10, Float.valueOf(f11))) {
                return Float.valueOf(f11);
            }
            return f10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + aVar + '.');
    }

    public static jf.b h(jf.d dVar, int i) {
        boolean z3;
        dVar.getClass();
        if (i > 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        Integer valueOf = Integer.valueOf(i);
        if (z3) {
            int i10 = dVar.f19189u;
            int i11 = dVar.f19190v;
            if (dVar.f19191w <= 0) {
                i = -i;
            }
            return new jf.b(i10, i11, i);
        }
        throw new IllegalArgumentException("Step must be positive, was: " + valueOf + '.');
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [jf.b, jf.d] */
    public static jf.d i(int i, int i10) {
        if (i10 <= Integer.MIN_VALUE) {
            jf.d dVar = jf.d.f19196x;
            return jf.d.f19196x;
        }
        return new jf.b(i, i10 - 1, 1);
    }
}
