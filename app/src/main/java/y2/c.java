package y2;
import b.a;

import ya.ae;
import ya.sd;

/* loaded from: classes.dex */
public interface c {
    default long B0(long j10) {
        if (j10 == 9205357640488583168L) {
            return 9205357640488583168L;
        }
        float l0 = l0(h.b(j10));
        float l02 = l0(a(j10));
        return (Float.floatToRawIntBits(l02) & 4294967295L) | (Float.floatToRawIntBits(l0) << 32);
    }

    default float D0(long j10) {
        if (!a(o.b(j10), 4294967296L)) {
            i.b("Only Sp can convert to Px");
        }
        return l0(x(j10));
    }

    default long R(float f10) {
        return o(a0(f10));
    }

    default float Y(int i) {
        return i / a();
    }

    float a();

    default float a0(float f10) {
        return f10 / a();
    }

    float i0();

    default float l0(float f10) {
        return a() * f10;
    }

    default long o(float f10) {
        float i02;
        float[] fArr = z2.b.f31905a;
        if (i0() >= 1.03f) {
            z2.a a10 = z2.a(i0());
            if (a10 != null) {
                i02 = a10.a(f10);
            } else {
                i02 = f10 / i0();
            }
            return ae.f(4294967296L, i02);
        }
        return ae.f(4294967296L, f10 / i0());
    }

    default long p(long j10) {
        if (j10 == 9205357640488583168L) {
            return 9205357640488583168L;
        }
        return sd.a(a0(Float.intBitsToFloat((int) (j10 >> 32))), a0(Float.intBitsToFloat((int) (j10 & 4294967295L))));
    }

    default int t0(float f10) {
        float l0 = l0(f10);
        if (Float.isInfinite(l0)) {
            return Integer.MAX_VALUE;
        }
        return Math.round(l0);
    }

    default float x(long j10) {
        float c10;
        float i02;
        if (!a(o.b(j10), 4294967296L)) {
            i.b("Only Sp can convert to Px");
        }
        float[] fArr = z2.b.f31905a;
        if (i0() >= 1.03f) {
            z2.a a10 = z2.a(i0());
            c10 = o.c(j10);
            if (a10 == null) {
                i02 = i0();
            } else {
                return a10.b(c10);
            }
        } else {
            c10 = o.c(j10);
            i02 = i0();
        }
        return i02 * c10;
    }
}
