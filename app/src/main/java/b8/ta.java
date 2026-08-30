package b8;
import eb.w;
import j1.b;
import k1.l0;
import k1.r;
import m1.d;

import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class ta {

    /* renamed from: a, reason: collision with root package name */
    public static final long f2806a = kb.f2334a;

    /* renamed from: b, reason: collision with root package name */
    public static final long f2807b = l0.d(4278913568L);

    /* renamed from: c, reason: collision with root package name */
    public static final long f2808c = l0.d(4280966360L);

    /* renamed from: d, reason: collision with root package name */
    public static final long f2809d = l0.d(4286267364L);
    public static final long e = l0.d(4282068638L);

    /* renamed from: f, reason: collision with root package name */
    public static final long f2810f = l0.d(4289740926L);

    /* renamed from: g, reason: collision with root package name */
    public static final r[] f2811g;

    static {
        int i = r.f19522m;
        f2811g = new r[]{new r(r.f19515d), new r(l0.d(4291550463L)), new r(l0.d(4294961097L)), new r(l0.d(4293317375L))};
    }

    public static final void a(float f10, float f11, float[] fArr, ArrayList[] arrayListArr, kotlin.jvm.internal.x xVar, float[] fArr2, float f12, float f13, float f14) {
        int i;
        if (f12 >= 0.0f && f13 >= 0.0f && f12 <= f10 && f13 <= f11) {
            float b10 = b(xVar);
            float f15 = b10 * b10 * b10;
            int i10 = 2;
            int i11 = 0;
            if (f15 > 0.55f) {
                i = 2;
            } else if (f15 > 0.16f) {
                i = 1;
            } else {
                i = 0;
            }
            int e8 = wa.b9.e((int) (((f15 * 0.4f) + (b(xVar) * 0.6f) + f14) * fArr.length), 0, fArr.length - 1);
            if (b(xVar) > 0.86f) {
                int b11 = (int) (b(xVar) * 3.0f);
                if (b11 <= 2) {
                    i10 = b11;
                }
                i11 = i10 + 1;
            }
            arrayListArr[(((i11 * fArr2.length) + i) * fArr.length) + e8].add(new b((Float.floatToRawIntBits(f12) << 32) | (Float.floatToRawIntBits(f13) & 4294967295L)));
        }
    }

    public static final float b(kotlin.jvm.internal.x xVar) {
        long j10 = ((xVar.f19786u * 25214903917L) + 11) & 281474976710655L;
        xVar.f19786u = j10;
        return ((float) (j10 >>> 16)) / 4.2949673E9f;
    }

    public static final void c(d dVar, long j10, float f10, long j11, boolean z3) {
        float intBitsToFloat;
        float intBitsToFloat2;
        long floatToRawIntBits;
        int floatToRawIntBits2;
        if (z3) {
            intBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32)) - f10;
            intBitsToFloat2 = Float.intBitsToFloat((int) (j10 & 4294967295L));
        } else {
            intBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32));
            intBitsToFloat2 = Float.intBitsToFloat((int) (j10 & 4294967295L)) - f10;
        }
        long floatToRawIntBits3 = (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
        if (z3) {
            float intBitsToFloat3 = Float.intBitsToFloat((int) (j10 >> 32)) + f10;
            float intBitsToFloat4 = Float.intBitsToFloat((int) (j10 & 4294967295L));
            floatToRawIntBits = Float.floatToRawIntBits(intBitsToFloat3);
            floatToRawIntBits2 = Float.floatToRawIntBits(intBitsToFloat4);
        } else {
            float intBitsToFloat5 = Float.intBitsToFloat((int) (j10 >> 32));
            float intBitsToFloat6 = Float.intBitsToFloat((int) (j10 & 4294967295L)) + f10;
            floatToRawIntBits = Float.floatToRawIntBits(intBitsToFloat5);
            floatToRawIntBits2 = Float.floatToRawIntBits(intBitsToFloat6);
        }
        long j12 = (4294967295L & floatToRawIntBits2) | (floatToRawIntBits << 32);
        d.s0(dVar, w.f(new pe.j[]{new pe.j(Float.valueOf(0.0f), new r(r.c(j11, 0.0f))), new pe.j(Float.valueOf(0.5f), new r(j11)), new pe.j(Float.valueOf(1.0f), new r(r.c(j11, 0.0f)))}, floatToRawIntBits3, j12), floatToRawIntBits3, j12, Math.max(1.0f, 0.035f * f10), 0.0f, 240);
    }
}
