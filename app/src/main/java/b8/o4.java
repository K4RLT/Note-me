package b8;
import b2.l0;
import eb.w;
import k1.h;
import k1.k;
import k1.m0;
import k1.r;
import m1.b;
import m1.d;
import r0.j0;
import u7.e;
import u7.t0;

import android.graphics.Path;
import android.graphics.RectF;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.util.List;

/* loaded from: classes.dex */
public final /* synthetic */ class o4 implements df.l {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f2480u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ boolean f2481v;

    public /* synthetic */ o4(int i, boolean z3) {
        this.f2480u = i;
        this.f2481v = z3;
    }

    @Override // df.l
    public final Object invoke(Object obj) {
        char c10;
        float f10;
        long j10;
        float f11;
        double d2;
        int i;
        int i10;
        float f12;
        float f13;
        switch (this.f2480u) {
            case 0:
                boolean z3 = this.f2481v;
                d dVar = (d) obj;
                dVar.getClass();
                float intBitsToFloat = Float.intBitsToFloat((int) (dVar.e() >> 32));
                float intBitsToFloat2 = Float.intBitsToFloat((int) (dVar.e() & 4294967295L));
                float f14 = intBitsToFloat / 2.0f;
                float l0 = dVar.l0(r4.f2641h);
                float l02 = dVar.l0(r4.i);
                float l03 = dVar.l0(r4.f2642j);
                if (z3) {
                    long c11 = l0.c(352321536);
                    long floatToRawIntBits = Float.floatToRawIntBits(0.22f * intBitsToFloat);
                    c10 = ' ';
                    f10 = intBitsToFloat;
                    float f15 = (float) 0.5d;
                    f11 = intBitsToFloat2;
                    j10 = 4294967295L;
                    d2 = 0.5d;
                    d.n0(dVar, c11, (Float.floatToRawIntBits(intBitsToFloat2 * 0.32f) & 4294967295L) | (floatToRawIntBits << 32), (Float.floatToRawIntBits(intBitsToFloat * 0.32f) << 32) | (Float.floatToRawIntBits(0.34f * intBitsToFloat2) & 4294967295L), dVar.l0(f15), 0, null, 496);
                    d.n0(dVar, l0.c(419430399), (Float.floatToRawIntBits(0.4f * f11) & 4294967295L) | (Float.floatToRawIntBits(0.68f * f10) << 32), (Float.floatToRawIntBits(0.38f * f11) & 4294967295L) | (Float.floatToRawIntBits(0.78f * f10) << 32), dVar.l0((float) 0.45d), 0, null, 496);
                    d.n0(dVar, l0.c(301989888), (Float.floatToRawIntBits(0.85f * f11) & 4294967295L) | (Float.floatToRawIntBits(0.3f * f10) << 32), (Float.floatToRawIntBits(0.86f * f11) & 4294967295L) | (Float.floatToRawIntBits(0.42f * f10) << 32), dVar.l0(f15), 0, null, 496);
                } else {
                    c10 = ' ';
                    f10 = intBitsToFloat;
                    j10 = 4294967295L;
                    f11 = intBitsToFloat2;
                    d2 = 0.5d;
                }
                long c12 = l0.c(620756992);
                float f16 = (float) 0.35d;
                float l04 = dVar.l0(f16) + l02;
                float l05 = dVar.l0(f16) + l0;
                d.D(dVar, c12, l04, (Float.floatToRawIntBits(f14) << c10) | (Float.floatToRawIntBits(l05) & j10), null, 120);
                d.y0(dVar, r4.f2647o, l02, (Float.floatToRawIntBits(f14) << c10) | (Float.floatToRawIntBits(l0) & j10), 0.0f, null, 120);
                float f17 = (float) d2;
                d.D(dVar, l0.c(620756992), l02, (Float.floatToRawIntBits(f14) << c10) | (Float.floatToRawIntBits(l0) & j10), new h(dVar.l0(f17), 0.0f, 0, 0, null, 30), FacebookMediationAdapter.ERROR_FACEBOOK_INITIALIZATION);
                dVar.N(l0.c(905969663), 180.0f, 180.0f, (Float.floatToRawIntBits(f14 - l02) << c10) | (Float.floatToRawIntBits(l0 - l02) & j10), (Float.floatToRawIntBits(r20) & j10) | (Float.floatToRawIntBits(l02 * 2.0f) << c10), new h(dVar.l0(f17), 0.0f, 1, 0, null, 26));
                d.D(dVar, l0.d(4279504134L), l03, (Float.floatToRawIntBits(f14) << c10) | (Float.floatToRawIntBits(l0) & j10), null, 120);
                float f18 = f14 - l03;
                float f19 = l0 - l03;
                float f20 = l03 * 2.0f;
                dVar.N(l0.d(2281701376L), 180.0f, 180.0f, (Float.floatToRawIntBits(f18) << c10) | (Float.floatToRawIntBits(f19) & j10), (Float.floatToRawIntBits(f20) & j10) | (Float.floatToRawIntBits(f20) << c10), new h(dVar.l0(f17), 0.0f, 1, 0, null, 26));
                dVar.N(l0.c(822083583), 0.0f, 180.0f, (Float.floatToRawIntBits(f19) & j10) | (Float.floatToRawIntBits(f18) << c10), (Float.floatToRawIntBits(f20) & j10) | (Float.floatToRawIntBits(f20) << c10), new h(dVar.l0((float) 0.4d), 0.0f, 1, 0, null, 26));
                float l06 = dVar.l0(r4.f2639f);
                float l07 = dVar.l0(r4.e / 2.0f);
                float l08 = dVar.l0(r4.f2640g);
                h a10 = k.a();
                Path path = a10.f19481a;
                a10.h(f14 - l07, 0.0f);
                a10.g(f14 + l07, 0.0f);
                float f21 = f10;
                a10.g(f21, l06);
                a10.g(f21, f11 - l08);
                if (l08 > 0.0f) {
                    float f22 = l08 * 2.0f;
                    float f23 = f21 - f22;
                    float f24 = f11 - f22;
                    if (a10.f19482b == null) {
                        a10.f19482b = new RectF();
                    }
                    RectF rectF = a10.f19482b;
                    rectF.getClass();
                    rectF.set(f23, f24, f21, f11);
                    RectF rectF2 = a10.f19482b;
                    rectF2.getClass();
                    path.arcTo(rectF2, 0.0f, 90.0f, false);
                }
                a10.g(l08, f11);
                if (l08 > 0.0f) {
                    float f25 = l08 * 2.0f;
                    float f26 = f11 - f25;
                    if (a10.f19482b == null) {
                        a10.f19482b = new RectF();
                    }
                    RectF rectF3 = a10.f19482b;
                    rectF3.getClass();
                    rectF3.set(0.0f, f26, f25, f11);
                    RectF rectF4 = a10.f19482b;
                    rectF4.getClass();
                    path.arcTo(rectF4, 90.0f, 90.0f, false);
                }
                a10.g(0.0f, l06);
                a10.d();
                d.o0(dVar, a10, l0.c(570425344), new h(dVar.l0((float) 0.7d), 0.0f, 0, 0, null, 30), 52);
                return pe.z.f22715a;
            case 1:
                boolean z9 = this.f2481v;
                ((j0) obj).getClass();
                if (!z9) {
                    e.f26111b = 0.0f;
                }
                return new t0(0);
            case 2:
                boolean z10 = this.f2481v;
                l0 l0Var = (l0) obj;
                l0Var.getClass();
                l0Var.b();
                Float valueOf = Float.valueOf(0.4f);
                long j11 = r.f19520k;
                pe.j jVar = new pe.j(valueOf, new r(j11));
                Float valueOf2 = Float.valueOf(1.0f);
                long j12 = r.f19513b;
                pe.j[] jVarArr = {jVar, new pe.j(valueOf2, new r(r.c(j12, 0.85f)))};
                b bVar = l0Var.f1533u;
                d.y0(l0Var, w.j(jVarArr, 0L, Float.intBitsToFloat((int) (bVar.e() >> 32)) / 2.0f, 10), 0.0f, 0L, 0.0f, null, 126);
                if (z10) {
                    i = 2;
                    d.D(l0Var, r.c(r.f19515d, 0.9f), (Float.intBitsToFloat((int) (bVar.e() >> 32)) / 2.0f) - l0Var.l0(3), 0L, new h(l0Var.l0(2), 0.0f, 0, 0, null, 30), FacebookMediationAdapter.ERROR_MAPPING_NATIVE_ASSETS);
                } else {
                    i = 2;
                }
                float intBitsToFloat3 = Float.intBitsToFloat((int) (bVar.e() & 4294967295L)) / 1.5f;
                d.y0(l0Var, w.h(qe.h(new r(r.c(j12, 0.8f)), new r(j11)), (Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L), (Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(intBitsToFloat3) & 4294967295L), 8), 0.0f, 0L, 0.0f, new h(l0Var.l0((float) 2.5d), 0.0f, 0, 0, null, 30), FacebookMediationAdapter.ERROR_FAILED_TO_PRESENT_AD);
                List h3 = qe.h(new r(j11), new r(r.c(r.f19515d, 0.6f)));
                float intBitsToFloat4 = Float.intBitsToFloat((int) (bVar.e() & 4294967295L)) / 3.0f;
                long floatToRawIntBits2 = (Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(intBitsToFloat4) & 4294967295L);
                float intBitsToFloat5 = Float.intBitsToFloat((int) (bVar.e() & 4294967295L));
                d.y0(l0Var, w.h(h3, floatToRawIntBits2, (Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(intBitsToFloat5) & 4294967295L), 8), 0.0f, 0L, 0.0f, new h(l0Var.l0(i), 0.0f, 0, 0, null, 30), FacebookMediationAdapter.ERROR_FAILED_TO_PRESENT_AD);
                return pe.z.f22715a;
            case 3:
                boolean z11 = this.f2481v;
                l0 l0Var2 = (l0) obj;
                l0Var2.getClass();
                l0Var2.b();
                Float valueOf3 = Float.valueOf(0.4f);
                long j13 = r.f19520k;
                pe.j jVar2 = new pe.j(valueOf3, new r(j13));
                Float valueOf4 = Float.valueOf(1.0f);
                long j14 = r.f19513b;
                pe.j[] jVarArr2 = {jVar2, new pe.j(valueOf4, new r(r.c(j14, 0.85f)))};
                b bVar2 = l0Var2.f1533u;
                d.y0(l0Var2, w.j(jVarArr2, 0L, Float.intBitsToFloat((int) (bVar2.e() >> 32)) / 2.0f, 10), 0.0f, 0L, 0.0f, null, 126);
                if (z11) {
                    i10 = 2;
                    d.D(l0Var2, r.c(r.f19515d, 0.9f), (Float.intBitsToFloat((int) (bVar2.e() >> 32)) / 2.0f) - l0Var2.l0(3), 0L, new h(l0Var2.l0(2), 0.0f, 0, 0, null, 30), FacebookMediationAdapter.ERROR_MAPPING_NATIVE_ASSETS);
                } else {
                    i10 = 2;
                }
                float intBitsToFloat6 = Float.intBitsToFloat((int) (bVar2.e() & 4294967295L)) / 1.5f;
                d.y0(l0Var2, w.h(qe.h(new r(r.c(j14, 0.8f)), new r(j13)), (Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L), (Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(intBitsToFloat6) & 4294967295L), 8), 0.0f, 0L, 0.0f, new h(l0Var2.l0((float) 2.5d), 0.0f, 0, 0, null, 30), FacebookMediationAdapter.ERROR_FAILED_TO_PRESENT_AD);
                List h10 = qe.h(new r(j13), new r(r.c(r.f19515d, 0.6f)));
                float intBitsToFloat7 = Float.intBitsToFloat((int) (bVar2.e() & 4294967295L)) / 3.0f;
                long floatToRawIntBits3 = (Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(intBitsToFloat7) & 4294967295L);
                float intBitsToFloat8 = Float.intBitsToFloat((int) (bVar2.e() & 4294967295L));
                d.y0(l0Var2, w.h(h10, floatToRawIntBits3, (Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(intBitsToFloat8) & 4294967295L), 8), 0.0f, 0L, 0.0f, new h(l0Var2.l0(i10), 0.0f, 0, 0, null, 30), FacebookMediationAdapter.ERROR_FAILED_TO_PRESENT_AD);
                return pe.z.f22715a;
            case 4:
                boolean z12 = this.f2481v;
                m0 m0Var = (m0) obj;
                m0Var.getClass();
                if (z12) {
                    f12 = 0.35f;
                } else {
                    f12 = 1.0f;
                }
                m0Var.b(f12);
                return pe.z.f22715a;
            case 5:
                boolean z13 = this.f2481v;
                m0 m0Var2 = (m0) obj;
                m0Var2.getClass();
                if (z13) {
                    f13 = 1.0f;
                } else {
                    f13 = 0.3f;
                }
                m0Var2.b(f13);
                return pe.z.f22715a;
            default:
                boolean z14 = this.f2481v;
                d dVar2 = (d) obj;
                dVar2.getClass();
                float intBitsToFloat9 = Float.intBitsToFloat((int) (dVar2.e() >> 32));
                float intBitsToFloat10 = Float.intBitsToFloat((int) (dVar2.e() & 4294967295L));
                float f27 = intBitsToFloat9 * 0.085f;
                long j15 = r.f19515d;
                long c13 = r.c(j15, 0.95f);
                long c14 = r.c(j15, 0.4f);
                float f28 = intBitsToFloat9 / 2.0f;
                if (z14) {
                    w7.n4.p0(dVar2, c13, c14, f27, f28, intBitsToFloat10, intBitsToFloat9, intBitsToFloat10 * 0.74f, false);
                    w7.n4.p0(dVar2, c13, c14, f27, f28, intBitsToFloat10, intBitsToFloat9, intBitsToFloat10 * 0.52f, true);
                    h a11 = k.a();
                    a11.h(f28, 0.55f * intBitsToFloat10);
                    float f29 = 0.1f * intBitsToFloat10;
                    a11.g(f28, f29);
                    float f30 = intBitsToFloat9 * 0.16f;
                    float f31 = intBitsToFloat10 * 0.24f;
                    a11.h(f28 - f30, f31);
                    a11.g(f28, f29);
                    a11.g(f28 + f30, f31);
                    d.o0(dVar2, a11, c13, new h(f27 * 1.15f, 0.0f, 1, 1, null, 18), 52);
                } else {
                    w7.n4.p0(dVar2, c13, c14, f27, f28, intBitsToFloat10, intBitsToFloat9, intBitsToFloat10 * 0.26f, false);
                    w7.n4.p0(dVar2, c13, c14, f27, f28, intBitsToFloat10, intBitsToFloat9, intBitsToFloat10 * 0.48f, true);
                    h a12 = k.a();
                    a12.h(f28, 0.45f * intBitsToFloat10);
                    float f32 = 0.9f * intBitsToFloat10;
                    a12.g(f28, f32);
                    float f33 = intBitsToFloat9 * 0.16f;
                    float f34 = intBitsToFloat10 * 0.76f;
                    a12.h(f28 - f33, f34);
                    a12.g(f28, f32);
                    a12.g(f28 + f33, f34);
                    d.o0(dVar2, a12, c13, new h(f27 * 1.15f, 0.0f, 1, 1, null, 18), 52);
                }
                return pe.z.f22715a;
        }
    }
}
