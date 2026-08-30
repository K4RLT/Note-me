package q;
import k1.l0;
import n0.a;
import q.t;
import q.w;

/* loaded from: classes.dex */
public final class t implements w {

    /* renamed from: u, reason: collision with root package name */
    public final float f23003u;

    /* renamed from: v, reason: collision with root package name */
    public final float f23004v;

    /* renamed from: w, reason: collision with root package name */
    public final float f23005w;

    /* renamed from: x, reason: collision with root package name */
    public final float f23006x;

    /* renamed from: y, reason: collision with root package name */
    public final float f23007y;

    /* renamed from: z, reason: collision with root package name */
    public final float f23008z;

    public t(float f10, float f11, float f12, float f13) {
        boolean z3;
        int i;
        this.f23003u = f10;
        this.f23004v = f11;
        this.f23005w = f12;
        this.f23006x = f13;
        if (!Float.isNaN(f10) && !Float.isNaN(f11) && !Float.isNaN(f12) && !Float.isNaN(f13)) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!z3) {
            a("Parameters to CubicBezierEasing cannot be NaN. Actual parameters are: " + f10 + ", " + f11 + ", " + f12 + ", " + f13 + '.');
        }
        float[] fArr = new float[5];
        float f14 = (f11 - 0.0f) * 3.0f;
        float f15 = (f13 - f11) * 3.0f;
        float f16 = (1.0f - f13) * 3.0f;
        double d2 = f14;
        double d10 = f15;
        double d11 = f16;
        double d12 = d10 * 2.0d;
        double d13 = (d2 - d12) + d11;
        if (d13 == 0.0d) {
            if (d10 == d11) {
                i = 0;
            } else {
                i = l0.M((float) ((d12 - d11) / (d12 - (d11 * 2.0d))), fArr, 0);
            }
        } else {
            double d14 = -Math.sqrt((d10 * d10) - (d11 * d2));
            double d15 = (-d2) + d10;
            int M = l0.M((float) ((-(d14 + d15)) / d13), fArr, 0);
            int M2 = l0.M((float) ((d14 - d15) / d13), fArr, M) + M;
            if (M2 > 1) {
                float f17 = fArr[0];
                float f18 = fArr[1];
                if (f17 > f18) {
                    fArr[0] = f18;
                    fArr[1] = f17;
                } else if (f17 == f18) {
                    i = M2 - 1;
                }
            }
            i = M2;
        }
        float f19 = (f15 - f14) * 2.0f;
        int M3 = l0.M((-f19) / (((f16 - f15) * 2.0f) - f19), fArr, i) + i;
        float min = Math.min(0.0f, 1.0f);
        float max = Math.max(0.0f, 1.0f);
        for (int i10 = 0; i10 < M3; i10++) {
            float f20 = fArr[i10];
            float f21 = (((((((((f11 - f13) * 3.0f) + 1.0f) - 0.0f) * f20) + (((f13 - (f11 * 2.0f)) + 0.0f) * 3.0f)) * f20) + f14) * f20) + 0.0f;
            min = Math.min(min, f21);
            max = Math.max(max, f21);
        }
        long floatToRawIntBits = (Float.floatToRawIntBits(min) << 32) | (Float.floatToRawIntBits(max) & 4294967295L);
        this.f23007y = Float.intBitsToFloat((int) (floatToRawIntBits >> 32));
        this.f23008z = Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L));
    }

    /* JADX WARN: Code restructure failed: missing block: B:117:0x0206, code lost:
    
        if (java.lang.Math.abs(r3 - r2) > 1.05E-6f) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0236, code lost:
    
        if (java.lang.Math.abs(r3 - r2) > 1.05E-6f) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x008e, code lost:
    
        if (java.lang.Math.abs(r3 - r2) > 1.05E-6f) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0092, code lost:
    
        r15 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00e5, code lost:
    
        if (java.lang.Math.abs(r3 - r2) > 1.05E-6f) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01bb, code lost:
    
        if (java.lang.Math.abs(r3 - r2) > 1.05E-6f) goto L129;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0261  */
    @Override // w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final float a(float r27) {
        /*
            Method dump skipped, instructions count: 658
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q.t.a(float):float");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof t) {
            t tVar = (t) obj;
            if (this.f23003u == tVar.f23003u && this.f23004v == tVar.f23004v && this.f23005w == tVar.f23005w && this.f23006x == tVar.f23006x) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f23006x) + a.a(a.a(Float.hashCode(this.f23003u) * 31, 31, this.f23004v), 31, this.f23005w);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CubicBezierEasing(a=");
        sb2.append(this.f23003u);
        sb2.append(", b=");
        sb2.append(this.f23004v);
        sb2.append(", c=");
        sb2.append(this.f23005w);
        sb2.append(", d=");
        return a.m(sb2, this.f23006x, ')');
    }
}
