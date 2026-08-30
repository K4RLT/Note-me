package l1;
import b.a;

/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static final s f19843a = new s(0.31006f, 0.31616f);

    /* renamed from: b, reason: collision with root package name */
    public static final s f19844b = new s(0.34567f, 0.3585f);

    /* renamed from: c, reason: collision with root package name */
    public static final s f19845c = new s(0.32168f, 0.33767f);

    /* renamed from: d, reason: collision with root package name */
    public static final s f19846d = new s(0.31271f, 0.32902f);
    public static final float[] e = {0.964212f, 1.0f, 0.825188f};

    public static c a(c cVar) {
        if (a(cVar.f19811b, b.f19806a)) {
            q qVar = (q) cVar;
            s sVar = qVar.f19860d;
            s sVar2 = f19844b;
            if (!d(sVar, sVar2)) {
                return new q(qVar.f19810a, qVar.f19863h, sVar2, g(c(a.f19804b.f19805a, sVar.a(), sVar2.a()), qVar.i), qVar.f19865k, qVar.f19868n, qVar.e, qVar.f19861f, qVar.f19862g, -1);
            }
        }
        return cVar;
    }

    public static float b(float[] fArr) {
        if (fArr.length < 6) {
            return 0.0f;
        }
        float f10 = fArr[0];
        float f11 = fArr[1];
        float f12 = fArr[2];
        float f13 = fArr[3];
        float f14 = fArr[4];
        float f15 = fArr[5];
        float w10 = g3.a.w(f10, f15, (((f12 * f15) + ((f11 * f14) + (f10 * f13))) - (f13 * f14)) - (f11 * f12), 0.5f);
        if (w10 < 0.0f) {
            return -w10;
        }
        return w10;
    }

    public static final float[] c(float[] fArr, float[] fArr2, float[] fArr3) {
        h(fArr, fArr2);
        h(fArr, fArr3);
        float[] fArr4 = {fArr3[0] / fArr2[0], fArr3[1] / fArr2[1], fArr3[2] / fArr2[2]};
        float[] f10 = f(fArr);
        float f11 = fArr4[0];
        float f12 = fArr[0] * f11;
        float f13 = fArr4[1];
        float f14 = fArr[1] * f13;
        float f15 = fArr4[2];
        return g(f10, new float[]{f12, f14, fArr[2] * f15, fArr[3] * f11, fArr[4] * f13, fArr[5] * f15, f11 * fArr[6], f13 * fArr[7], f15 * fArr[8]});
    }

    public static final boolean d(s sVar, s sVar2) {
        if (sVar == sVar2) {
            return true;
        }
        if (Math.abs(sVar.f19878a - sVar2.f19878a) < 0.001f && Math.abs(sVar.f19879b - sVar2.f19879b) < 0.001f) {
            return true;
        }
        return false;
    }

    public static final g e(c cVar, c cVar2) {
        if (cVar == cVar2) {
            return new g(cVar, cVar, 1);
        }
        long j10 = cVar.f19811b;
        long j11 = b.f19806a;
        if (a(j10, j11) && a(cVar2.f19811b, j11)) {
            return new f((q) cVar, (q) cVar2);
        }
        return new g(cVar, cVar2, 0);
    }

    public static final float[] f(float[] fArr) {
        float f10 = fArr[0];
        float f11 = fArr[3];
        float f12 = fArr[6];
        float f13 = fArr[1];
        float f14 = fArr[4];
        float f15 = fArr[7];
        float f16 = fArr[2];
        float f17 = fArr[5];
        float f18 = fArr[8];
        float f19 = (f14 * f18) - (f15 * f17);
        float f20 = (f15 * f16) - (f13 * f18);
        float f21 = (f13 * f17) - (f14 * f16);
        float f22 = (f12 * f21) + (f11 * f20) + (f10 * f19);
        float[] fArr2 = new float[fArr.length];
        fArr2[0] = f19 / f22;
        fArr2[1] = f20 / f22;
        fArr2[2] = f21 / f22;
        fArr2[3] = g3.a.u(f11, f18, f12 * f17, f22);
        fArr2[4] = g3.a.u(f12, f16, f18 * f10, f22);
        fArr2[5] = g3.a.u(f10, f17, f16 * f11, f22);
        fArr2[6] = g3.a.u(f12, f14, f11 * f15, f22);
        fArr2[7] = g3.a.u(f10, f15, f12 * f13, f22);
        fArr2[8] = g3.a.u(f11, f13, f10 * f14, f22);
        return fArr2;
    }

    public static final float[] g(float[] fArr, float[] fArr2) {
        float[] fArr3 = new float[9];
        if (fArr.length < 9 || fArr2.length < 9) {
            return fArr3;
        }
        float f10 = fArr[0] * fArr2[0];
        float f11 = fArr[3];
        float f12 = fArr2[1];
        float f13 = fArr[6];
        float f14 = fArr2[2];
        fArr3[0] = (f13 * f14) + (f11 * f12) + f10;
        float f15 = fArr[1];
        float f16 = fArr2[0];
        float f17 = fArr[4];
        float f18 = fArr[7];
        float f19 = f18 * f14;
        fArr3[1] = f19 + (f12 * f17) + (f15 * f16);
        float f20 = fArr[2] * f16;
        float f21 = fArr[5];
        float f22 = (fArr2[1] * f21) + f20;
        float f23 = fArr[8];
        fArr3[2] = (f14 * f23) + f22;
        float f24 = fArr[0];
        float f25 = fArr2[3] * f24;
        float f26 = fArr2[4];
        float f27 = (f11 * f26) + f25;
        float f28 = fArr2[5];
        fArr3[3] = (f13 * f28) + f27;
        float f29 = fArr[1];
        float f30 = fArr2[3];
        float f31 = f17 * f26;
        fArr3[4] = (f18 * f28) + f31 + (f29 * f30);
        float f32 = fArr[2];
        float f33 = f28 * f23;
        fArr3[5] = f33 + (f21 * fArr2[4]) + (f30 * f32);
        float f34 = f24 * fArr2[6];
        float f35 = fArr[3];
        float f36 = fArr2[7];
        float f37 = (f35 * f36) + f34;
        float f38 = fArr2[8];
        fArr3[6] = (f13 * f38) + f37;
        float f39 = fArr2[6];
        float f40 = f18 * f38;
        fArr3[7] = f40 + (fArr[4] * f36) + (f29 * f39);
        float f41 = f23 * f38;
        fArr3[8] = f41 + (fArr[5] * fArr2[7]) + (f32 * f39);
        return fArr3;
    }

    public static final float[] h(float[] fArr, float[] fArr2) {
        if (fArr.length < 9 || fArr2.length < 3) {
            return fArr2;
        }
        float f10 = fArr2[0];
        float f11 = fArr2[1];
        float f12 = fArr2[2];
        fArr2[0] = (fArr[6] * f12) + (fArr[3] * f11) + (fArr[0] * f10);
        fArr2[1] = (fArr[7] * f12) + (fArr[4] * f11) + (fArr[1] * f10);
        fArr2[2] = (fArr[8] * f12) + (fArr[5] * f11) + (fArr[2] * f10);
        return fArr2;
    }
}
