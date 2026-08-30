package k1;
import j.e;
import n.w;
import p.a;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: b, reason: collision with root package name */
    public static final long f19513b = l0.d(4278190080L);

    /* renamed from: c, reason: collision with root package name */
    public static final long f19514c;

    /* renamed from: d, reason: collision with root package name */
    public static final long f19515d;
    public static final long e;

    /* renamed from: f, reason: collision with root package name */
    public static final long f19516f;

    /* renamed from: g, reason: collision with root package name */
    public static final long f19517g;

    /* renamed from: h, reason: collision with root package name */
    public static final long f19518h;
    public static final long i;

    /* renamed from: j, reason: collision with root package name */
    public static final long f19519j;

    /* renamed from: k, reason: collision with root package name */
    public static final long f19520k;

    /* renamed from: l, reason: collision with root package name */
    public static final long f19521l;

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f19522m = 0;

    /* renamed from: a, reason: collision with root package name */
    public final long f19523a;

    static {
        l0.d(4282664004L);
        l0.d(4287137928L);
        f19514c = l0.d(4291611852L);
        f19515d = l0.d(4294967295L);
        e = l0.d(4294901760L);
        f19516f = l0.d(4278255360L);
        f19517g = l0.d(4278190335L);
        f19518h = l0.d(4294967040L);
        i = l0.d(4278255615L);
        f19519j = l0.d(4294902015L);
        f19520k = l0.c(0);
        float[] fArr = l1.d.f19813a;
        f19521l = l0.b(0.0f, 0.0f, 0.0f, 0.0f, l1.d.f19831u);
    }

    public /* synthetic */ r(long j10) {
        this.f19523a = j10;
    }

    public static final /* synthetic */ r a(long j10) {
        return new r(j10);
    }

    public static final long b(long j10, l1.c cVar) {
        l1.g gVar;
        l1.c f10 = f(j10);
        int i10 = f10.f19812c;
        int i11 = cVar.f19812c;
        if ((i10 | i11) < 0) {
            gVar = l1.e(f10, cVar);
        } else {
            w wVar = l1.h.f19842a;
            int i12 = i10 | (i11 << 6);
            Object b10 = wVar.b(i12);
            if (b10 == null) {
                b10 = l1.e(f10, cVar);
                wVar.i(i12, b10);
            }
            gVar = (l1.g) b10;
        }
        return gVar.a(j10);
    }

    public static long c(long j10, float f10) {
        return l0.b(h(j10), g(j10), e(j10), f10, f(j10));
    }

    public static final float d(long j10) {
        float g8;
        float f10;
        if ((63 & j10) == 0) {
            g8 = (float) pe.a.g((j10 >>> 56) & 255);
            f10 = 255.0f;
        } else {
            g8 = (float) pe.a.g((j10 >>> 6) & 1023);
            f10 = 1023.0f;
        }
        return g8 / f10;
    }

    public static final float e(long j10) {
        int i10;
        int i11;
        int i12;
        if ((63 & j10) == 0) {
            return ((float) pe.a.g((j10 >>> 32) & 255)) / 255.0f;
        }
        short s10 = (short) ((j10 >>> 16) & 65535);
        int i13 = 32768 & s10;
        int i14 = ((65535 & s10) >>> 10) & 31;
        int i15 = s10 & 1023;
        if (i14 == 0) {
            if (i15 != 0) {
                float intBitsToFloat = Float.intBitsToFloat(i15 + 1056964608) - x.f19534a;
                if (i13 == 0) {
                    return intBitsToFloat;
                }
                return -intBitsToFloat;
            }
            i12 = 0;
            i11 = 0;
        } else {
            int i16 = i15 << 13;
            if (i14 == 31) {
                i10 = 255;
                if (i16 != 0) {
                    i16 |= 4194304;
                }
            } else {
                i10 = i14 + 112;
            }
            int i17 = i10;
            i11 = i16;
            i12 = i17;
        }
        return Float.intBitsToFloat((i12 << 23) | (i13 << 16) | i11);
    }

    public static final l1.c f(long j10) {
        float[] fArr = l1.d.f19813a;
        return l1.d.f19835y[(int) (j10 & 63)];
    }

    public static final float g(long j10) {
        int i10;
        int i11;
        int i12;
        if ((63 & j10) == 0) {
            return ((float) pe.a.g((j10 >>> 40) & 255)) / 255.0f;
        }
        short s10 = (short) ((j10 >>> 32) & 65535);
        int i13 = 32768 & s10;
        int i14 = ((65535 & s10) >>> 10) & 31;
        int i15 = s10 & 1023;
        if (i14 == 0) {
            if (i15 != 0) {
                float intBitsToFloat = Float.intBitsToFloat(i15 + 1056964608) - x.f19534a;
                if (i13 == 0) {
                    return intBitsToFloat;
                }
                return -intBitsToFloat;
            }
            i12 = 0;
            i11 = 0;
        } else {
            int i16 = i15 << 13;
            if (i14 == 31) {
                i10 = 255;
                if (i16 != 0) {
                    i16 |= 4194304;
                }
            } else {
                i10 = i14 + 112;
            }
            int i17 = i10;
            i11 = i16;
            i12 = i17;
        }
        return Float.intBitsToFloat((i12 << 23) | (i13 << 16) | i11);
    }

    public static final float h(long j10) {
        int i10;
        int i11;
        int i12;
        if ((63 & j10) == 0) {
            return ((float) pe.a.g((j10 >>> 48) & 255)) / 255.0f;
        }
        short s10 = (short) ((j10 >>> 48) & 65535);
        int i13 = 32768 & s10;
        int i14 = ((65535 & s10) >>> 10) & 31;
        int i15 = s10 & 1023;
        if (i14 == 0) {
            if (i15 != 0) {
                float intBitsToFloat = Float.intBitsToFloat(i15 + 1056964608) - x.f19534a;
                if (i13 == 0) {
                    return intBitsToFloat;
                }
                return -intBitsToFloat;
            }
            i12 = 0;
            i11 = 0;
        } else {
            int i16 = i15 << 13;
            if (i14 == 31) {
                i10 = 255;
                if (i16 != 0) {
                    i16 |= 4194304;
                }
            } else {
                i10 = i14 + 112;
            }
            int i17 = i10;
            i11 = i16;
            i12 = i17;
        }
        return Float.intBitsToFloat((i12 << 23) | (i13 << 16) | i11);
    }

    public static String i(long j10) {
        StringBuilder sb2 = new StringBuilder("Color(");
        sb2.append(h(j10));
        sb2.append(", ");
        sb2.append(g(j10));
        sb2.append(", ");
        sb2.append(e(j10));
        sb2.append(", ");
        sb2.append(d(j10));
        sb2.append(", ");
        return a.n(sb2, f(j10).f19810a, ')');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof r) {
            if (this.f19523a != ((r) obj).f19523a) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f19523a);
    }

    public final String toString() {
        return i(this.f19523a);
    }
}
