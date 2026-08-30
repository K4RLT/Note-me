package b8;
import b2.l0;
import eb.w;
import g3.a;
import k1.c0;
import k1.h;
import k1.k;
import k1.l0;
import k1.m0;
import k1.r;
import m.h;
import m1.b;
import m1.d;
import m1.h;

/* loaded from: classes.dex */
public final /* synthetic */ class w2 implements df.l {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f2915u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ q.d f2916v;

    public /* synthetic */ w2(q.d dVar, int i) {
        this.f2915u = i;
        this.f2916v = dVar;
    }

    @Override // df.l
    public final Object invoke(Object obj) {
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        l0 l0Var;
        float f18;
        float f19;
        float f20;
        float f21;
        float f22;
        float f23;
        float f24;
        float f25;
        float f26;
        float f27;
        float f28;
        float f29;
        float f30;
        float f31;
        float f32;
        float f33;
        l0 l0Var2;
        float f34;
        float f35;
        float f36;
        switch (this.f2915u) {
            case 0:
                m0 m0Var = (m0) obj;
                m0Var.getClass();
                q.d dVar = this.f2916v;
                m0Var.h(((Number) dVar.e()).floatValue());
                m0Var.i(((Number) dVar.e()).floatValue());
                break;
            case 1:
                l0 l0Var3 = (l0) obj;
                Float valueOf = Float.valueOf(-0.15f);
                Float valueOf2 = Float.valueOf(0.38f);
                Float valueOf3 = Float.valueOf(-0.35f);
                l0Var3.getClass();
                l0Var3.b();
                b bVar = l0Var3.f1533u;
                float intBitsToFloat = Float.intBitsToFloat((int) (bVar.e() >> 32));
                float intBitsToFloat2 = Float.intBitsToFloat((int) (bVar.e() & 4294967295L));
                float f37 = (float) 2.8d;
                float l0 = l0Var3.l0(15) - l0Var3.l0(f37);
                h a10 = k.a();
                a10.h(0.0f, l0);
                a10.g(intBitsToFloat, l0);
                a10.g(intBitsToFloat, intBitsToFloat2);
                a10.g(0.0f, intBitsToFloat2);
                a10.d();
                long j10 = r.f19515d;
                d.o0(l0Var3, a10, r.c(j10, 0.05f), null, 60);
                long j11 = r.f19520k;
                d.g0(l0Var3, a10, w.h(qe.h(new r(j11), new r(r.c(j10, 0.04f)), new r(r.c(j10, 0.35f)), new r(r.c(j10, 0.08f)), new r(j11)), (Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(l0) & 4294967295L), (Float.floatToRawIntBits(intBitsToFloat * 0.95f) << 32) | (Float.floatToRawIntBits(0.95f * intBitsToFloat2) & 4294967295L), 8), 0.0f, null, 60);
                long j12 = r.f19513b;
                d.n0(l0Var3, r.c(j12, 0.22f), (Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(l0) & 4294967295L), (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(l0) & 4294967295L), l0Var3.l0((float) 0.7d), 0, null, 496);
                long c10 = r.c(j10, 0.9f);
                float f38 = (float) 0.6d;
                float l02 = l0Var3.l0(f38) + l0;
                float l03 = l0Var3.l0(f38) + l0;
                d.n0(l0Var3, c10, (Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(l02) & 4294967295L), (Float.floatToRawIntBits(l03) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32), l0Var3.l0((float) 0.55d), 0, null, 496);
                float f39 = (float) 1.2d;
                float f40 = (float) 0.5d;
                d.n0(l0Var3, r.c(j10, 0.6f), (Float.floatToRawIntBits(l0Var3.l0(f39)) << 32) | (Float.floatToRawIntBits(l0) & 4294967295L), (Float.floatToRawIntBits(l0Var3.l0(f39)) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L), l0Var3.l0(f40), 0, null, 496);
                d.n0(l0Var3, r.c(j10, 0.6f), (Float.floatToRawIntBits(intBitsToFloat - l0Var3.l0(f39)) << 32) | (Float.floatToRawIntBits(l0) & 4294967295L), (Float.floatToRawIntBits(intBitsToFloat - l0Var3.l0(f39)) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L), l0Var3.l0(f40), 0, null, 496);
                float l04 = intBitsToFloat2 - l0Var3.l0(f37);
                d.n0(l0Var3, r.c(j12, 0.12f), (Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(l04) & 4294967295L), (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(l04) & 4294967295L), l0Var3.l0(f40), 0, null, 496);
                long c11 = r.c(j10, 0.55f);
                float l05 = l0Var3.l0(f40) + l04;
                float l06 = l0Var3.l0(f40) + l04;
                d.n0(l0Var3, c11, (Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(l05) & 4294967295L), (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(l06) & 4294967295L), l0Var3.l0((float) 0.45d), 0, null, 496);
                d.o0(l0Var3, a10, r.c(j10, 0.4f), new h(l0Var3.l0(f38), 0.0f, 0, 0, null, 30), 52);
                float floatValue = ((Number) this.f2916v.e()).floatValue();
                if (0.01f <= floatValue && floatValue <= 0.99f) {
                    float d2 = wa.b9.d(1.0f - floatValue, 0.0f, 1.0f);
                    float f41 = intBitsToFloat / 2.0f;
                    float f42 = intBitsToFloat2 / 2.0f;
                    float min = Math.min(intBitsToFloat, intBitsToFloat2);
                    if (floatValue < 0.45f) {
                        float d10 = wa.b9.d(((0.45f - floatValue) / 0.45f) * 0.32f, 0.0f, 0.32f);
                        float y10 = a.y(floatValue, 0.65f, 0.22f, min);
                        f10 = 0.4f;
                        f12 = 1.0f;
                        f13 = 0.12f;
                        f15 = min;
                        f14 = intBitsToFloat2;
                        f11 = intBitsToFloat;
                        d.y0(l0Var3, w.i(qe.h(new r(r.c(l0.d(4294959234L), d10)), new r(r.c(l0.d(4294956367L), d10 * 0.4f)), new r(j11)), (Float.floatToRawIntBits(f41) << 32) | (Float.floatToRawIntBits(f42) & 4294967295L), y10), y10, (Float.floatToRawIntBits(f41) << 32) | (Float.floatToRawIntBits(f42) & 4294967295L), 0.0f, null, 120);
                    } else {
                        f10 = 0.4f;
                        f11 = intBitsToFloat;
                        f12 = 1.0f;
                        f13 = 0.12f;
                        f14 = intBitsToFloat2;
                        f15 = min;
                    }
                    l0 l0Var4 = l0Var3;
                    int i = 0;
                    for (Object obj2 : qe.h(new pe.o(valueOf3, Float.valueOf(-0.38f), new r(l0.d(4294956800L))), new pe.o(valueOf2, valueOf3, new r(l0.d(4285458359L))), new pe.o(Float.valueOf(-0.42f), Float.valueOf(0.08f), new r(l0.d(4292728574L))), new pe.o(Float.valueOf(f10), Float.valueOf(f13), new r(l0.d(4294961831L))), new pe.o(Float.valueOf(-0.2f), Float.valueOf(-0.58f), new r(l0.d(4294966250L))), new pe.o(Float.valueOf(0.22f), Float.valueOf(-0.55f), new r(l0.d(4294956800L))), new pe.o(valueOf, valueOf2, new r(l0.d(4291081725L))), new pe.o(Float.valueOf(0.28f), Float.valueOf(0.36f), new r(l0.d(4289197008L))), new pe.o(Float.valueOf(-0.45f), valueOf, new r(l0.d(4294956367L))), new pe.o(Float.valueOf(0.44f), Float.valueOf(-0.12f), new r(l0.d(4288280292L))))) {
                        int i10 = i + 1;
                        if (i >= 0) {
                            pe.o oVar = (pe.o) obj2;
                            float floatValue2 = ((Number) oVar.f22703u).floatValue();
                            float floatValue3 = ((Number) oVar.f22704v).floatValue();
                            long j13 = ((r) oVar.f22705w).f19523a;
                            float f43 = floatValue * f15;
                            float f44 = f43 * 0.42f;
                            float c12 = (floatValue2 * f44) + a.c(floatValue2, f11, 0.42f, f41);
                            float c13 = ((floatValue3 * f44) + a.c(floatValue3, f14, 0.42f, f42)) - (f43 * 0.2f);
                            float f45 = f12 - (floatValue * 0.45f);
                            if (i % 2 == 0) {
                                f16 = 1.25f;
                            } else {
                                f16 = 0.9f;
                            }
                            float f46 = f45 * f16;
                            if (f46 < 0.0f) {
                                f46 = 0.0f;
                            }
                            int i11 = i % 3;
                            if (i11 == 0) {
                                float f47 = 0.082f * f15 * f46;
                                h a11 = k.a();
                                float f48 = c13 - f47;
                                a11.h(c12, f48);
                                f17 = f11;
                                a11.j(c12, c13, c12 + f47, c13);
                                a11.j(c12, c13, c12, c13 + f47);
                                a11.j(c12, c13, c12 - f47, c13);
                                a11.j(c12, c13, c12, f48);
                                a11.d();
                                l0Var = l0Var4;
                                d.o0(l0Var, a11, r.c(j13, d2), null, 60);
                                f18 = d2;
                                f19 = f41;
                                f20 = f42;
                                f21 = floatValue;
                                f22 = f15;
                            } else {
                                f17 = f11;
                                if (i11 == 1) {
                                    float f49 = f46 * 0.054f * f15;
                                    float f50 = 1.8f * f49;
                                    float f51 = 0.012f * f15;
                                    if (f51 < 1.2f) {
                                        f23 = 1.2f;
                                        f25 = c12;
                                        f24 = c13;
                                    } else {
                                        f23 = f51;
                                        f24 = c13;
                                        f25 = c12;
                                    }
                                    long c14 = r.c(j13, d2);
                                    float f52 = f25;
                                    long floatToRawIntBits = (Float.floatToRawIntBits(f25) << 32) | (Float.floatToRawIntBits(f24) & 4294967295L);
                                    float f53 = f24;
                                    l0 l0Var5 = l0Var4;
                                    d.D(l0Var5, c14, f49, floatToRawIntBits, null, 120);
                                    long j14 = r.f19515d;
                                    long c15 = r.c(j14, d2);
                                    long floatToRawIntBits2 = (Float.floatToRawIntBits(f53) & 4294967295L) | (Float.floatToRawIntBits(f52 - f50) << 32);
                                    long floatToRawIntBits3 = (Float.floatToRawIntBits(f52 + f50) << 32) | (Float.floatToRawIntBits(f53) & 4294967295L);
                                    float f54 = f23;
                                    f19 = f41;
                                    l0Var = l0Var5;
                                    f20 = f42;
                                    f18 = d2;
                                    f21 = floatValue;
                                    f22 = f15;
                                    d.n0(l0Var, c15, floatToRawIntBits2, floatToRawIntBits3, f54, 0, null, 496);
                                    d.n0(l0Var, r.c(j14, f18), (Float.floatToRawIntBits(f52) << 32) | (Float.floatToRawIntBits(f53 - f50) & 4294967295L), (Float.floatToRawIntBits(f53 + f50) & 4294967295L) | (Float.floatToRawIntBits(f52) << 32), f54, 0, null, 496);
                                } else {
                                    l0Var = l0Var4;
                                    f18 = d2;
                                    f19 = f41;
                                    f20 = f42;
                                    f21 = floatValue;
                                    f22 = f15;
                                    d.D(l0Var, r.c(j13, f18), f46 * 0.038f * f22, (Float.floatToRawIntBits(c12) << 32) | (Float.floatToRawIntBits(c13) & 4294967295L), null, 120);
                                }
                            }
                            d2 = f18;
                            l0Var4 = l0Var;
                            i = i10;
                            f41 = f19;
                            f42 = f20;
                            floatValue = f21;
                            f15 = f22;
                            f11 = f17;
                        } else {
                            qe.m.l();
                            throw null;
                        }
                    }
                }
                return pe.z.f22715a;
            case 2:
                d dVar2 = (d) obj;
                dVar2.getClass();
                d.t(dVar2, m5.f2417a, 0L, 0L, ((Number) this.f2916v.e()).floatValue(), null, 118);
                break;
            case 3:
                m0 m0Var2 = (m0) obj;
                m0Var2.getClass();
                q.d dVar3 = this.f2916v;
                m0Var2.h(((Number) dVar3.e()).floatValue());
                m0Var2.i(((Number) dVar3.e()).floatValue());
                break;
            case 4:
                m0 m0Var3 = (m0) obj;
                m0Var3.getClass();
                q.d dVar4 = this.f2916v;
                m0Var3.h(((Number) dVar4.e()).floatValue());
                m0Var3.i(((Number) dVar4.e()).floatValue());
                break;
            case 5:
                l0 l0Var6 = (l0) obj;
                Float valueOf4 = Float.valueOf(-0.15f);
                Float valueOf5 = Float.valueOf(0.38f);
                Float valueOf6 = Float.valueOf(-0.35f);
                l0Var6.getClass();
                l0Var6.b();
                b bVar2 = l0Var6.f1533u;
                float intBitsToFloat3 = Float.intBitsToFloat((int) (bVar2.e() >> 32));
                float intBitsToFloat4 = Float.intBitsToFloat((int) (bVar2.e() & 4294967295L));
                Float valueOf7 = Float.valueOf(0.0f);
                long j15 = r.f19515d;
                pe.j jVar = new pe.j(valueOf7, new r(r.c(j15, 0.26f)));
                pe.j jVar2 = new pe.j(Float.valueOf(0.15f), new r(r.c(j15, 0.08f)));
                Float valueOf8 = Float.valueOf(0.35f);
                long j16 = r.f19520k;
                c0 f55 = w.f(new pe.j[]{jVar, jVar2, new pe.j(valueOf8, new r(j16)), new pe.j(Float.valueOf(0.65f), new r(r.c(j15, 0.06f))), new pe.j(Float.valueOf(0.8f), new r(r.c(j15, 0.14f))), new pe.j(Float.valueOf(1.0f), new r(j16))}, (Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L), (Float.floatToRawIntBits(0.95f * intBitsToFloat4) & 4294967295L) | (Float.floatToRawIntBits(1.3f * intBitsToFloat3) << 32));
                l0 l0Var7 = l0Var6;
                d.q(l0Var7, f55, 0L, 0L, 0.0f, null, 0, 126);
                long j17 = r.f19513b;
                float f56 = intBitsToFloat3 * 0.08f;
                float f57 = intBitsToFloat4 * 0.35f;
                float f58 = (float) 0.8d;
                d.n0(l0Var7, r.c(j17, 0.2f), (Float.floatToRawIntBits(f56 + 1.0f) << 32) | (Float.floatToRawIntBits(1.0f) & 4294967295L), (Float.floatToRawIntBits(r20 + 1.0f) << 32) | (Float.floatToRawIntBits(f57 + 1.0f) & 4294967295L), l0Var7.l0(f58), 0, null, 496);
                d.n0(l0Var7, r.c(j15, 0.22f), (Float.floatToRawIntBits(f56) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L), (Float.floatToRawIntBits(f57) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat3 * 0.03f) << 32), l0Var7.l0(f58), 0, null, 496);
                float f59 = intBitsToFloat3 * 0.92f;
                float f60 = intBitsToFloat4 * 0.4f;
                d.n0(l0Var7, r.c(j17, 0.2f), (Float.floatToRawIntBits(f59 + 1.0f) << 32) | (Float.floatToRawIntBits(1.0f) & 4294967295L), (Float.floatToRawIntBits(f60 + 1.0f) & 4294967295L) | (Float.floatToRawIntBits((intBitsToFloat3 * 0.97f) + 1.0f) << 32), l0Var7.l0(f58), 0, null, 496);
                d.n0(l0Var7, r.c(j15, 0.22f), (Float.floatToRawIntBits(f59) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L), (Float.floatToRawIntBits(r20) << 32) | (Float.floatToRawIntBits(f60) & 4294967295L), l0Var7.l0(f58), 0, null, 496);
                float l07 = intBitsToFloat4 - l0Var7.l0((float) 3.5d);
                d.q(l0Var7, w.k(qe.h(new r(r.c(j15, 0.1f)), new r(r.c(j17, 0.15f)), new r(r.c(j15, 0.2f))), 0.0f, 0.0f, 14), (Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(l07) & 4294967295L), (Float.floatToRawIntBits(intBitsToFloat3) << 32) | (Float.floatToRawIntBits(r3) & 4294967295L), 0.0f, null, 0, 120);
                float l08 = l0Var7.l0((float) 3.2d);
                for (float f61 = l08; f61 < intBitsToFloat3 - (l08 / 2); f61 += l08) {
                    d.n0(l0Var7, r.c(r.f19515d, 0.18f), (Float.floatToRawIntBits(f61) << 32) | (Float.floatToRawIntBits(l07) & 4294967295L), (Float.floatToRawIntBits(f61) << 32) | (Float.floatToRawIntBits(intBitsToFloat4) & 4294967295L), l0Var7.l0((float) 0.6d), 0, null, 496);
                }
                long j18 = r.f19515d;
                r rVar = new r(r.c(j18, 0.18f));
                long j19 = r.f19520k;
                d.q(l0Var7, w.b(qe.h(rVar, new r(j19)), 0.0f, 0.0f, 14), (Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L), (Float.floatToRawIntBits(l0Var7.l0(r7)) << 32) | (Float.floatToRawIntBits(intBitsToFloat4) & 4294967295L), 0.0f, null, 0, 120);
                d.q(l0Var7, w.b(qe.h(new r(j19), new r(r.c(j18, 0.18f))), 0.0f, 0.0f, 14), (Float.floatToRawIntBits(intBitsToFloat3 - l0Var7.l0(r7)) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L), (Float.floatToRawIntBits(intBitsToFloat4) & 4294967295L) | (Float.floatToRawIntBits(l0Var7.l0((float) 1.5d)) << 32), 0.0f, null, 0, 120);
                float floatValue4 = ((Number) this.f2916v.e()).floatValue();
                if (0.01f <= floatValue4 && floatValue4 <= 0.99f) {
                    float d11 = wa.b9.d(1.0f - floatValue4, 0.0f, 1.0f);
                    float f62 = intBitsToFloat3 / 2.0f;
                    float f63 = intBitsToFloat4 / 2.0f;
                    float min2 = Math.min(intBitsToFloat3, intBitsToFloat4);
                    if (floatValue4 < 0.45f) {
                        float d12 = wa.b9.d(((0.45f - floatValue4) / 0.45f) * 0.32f, 0.0f, 0.32f);
                        float y11 = a.y(floatValue4, 0.65f, 0.22f, min2);
                        f26 = floatValue4;
                        f27 = intBitsToFloat3;
                        l0Var7 = l0Var7;
                        f29 = min2;
                        f28 = intBitsToFloat4;
                        d.y0(l0Var7, w.i(qe.h(new r(r.c(l0.d(4294959234L), d12)), new r(r.c(l0.d(4294956367L), d12 * 0.4f)), new r(j19)), (Float.floatToRawIntBits(f63) & 4294967295L) | (Float.floatToRawIntBits(f62) << 32), y11), y11, (Float.floatToRawIntBits(f62) << 32) | (Float.floatToRawIntBits(f63) & 4294967295L), 0.0f, null, 120);
                    } else {
                        f26 = floatValue4;
                        f27 = intBitsToFloat3;
                        f28 = intBitsToFloat4;
                        f29 = min2;
                    }
                    l0 l0Var8 = l0Var7;
                    int i12 = 0;
                    for (Object obj3 : qe.h(new pe.o(valueOf6, Float.valueOf(-0.38f), new r(l0.d(4294956800L))), new pe.o(valueOf5, valueOf6, new r(l0.d(4285458359L))), new pe.o(Float.valueOf(-0.42f), Float.valueOf(0.08f), new r(l0.d(4292728574L))), new pe.o(Float.valueOf(0.4f), Float.valueOf(0.12f), new r(l0.d(4294961831L))), new pe.o(Float.valueOf(-0.2f), Float.valueOf(-0.58f), new r(l0.d(4294966250L))), new pe.o(Float.valueOf(0.22f), Float.valueOf(-0.55f), new r(l0.d(4294956800L))), new pe.o(valueOf4, valueOf5, new r(l0.d(4291081725L))), new pe.o(Float.valueOf(0.28f), Float.valueOf(0.36f), new r(l0.d(4289197008L))), new pe.o(Float.valueOf(-0.45f), valueOf4, new r(l0.d(4294956367L))), new pe.o(Float.valueOf(0.44f), Float.valueOf(-0.12f), new r(l0.d(4288280292L))))) {
                        int i13 = i12 + 1;
                        if (i12 >= 0) {
                            pe.o oVar2 = (pe.o) obj3;
                            float floatValue5 = ((Number) oVar2.f22703u).floatValue();
                            float floatValue6 = ((Number) oVar2.f22704v).floatValue();
                            long j20 = ((r) oVar2.f22705w).f19523a;
                            float f64 = f26 * f29;
                            float f65 = f64 * 0.42f;
                            float c16 = (floatValue5 * f65) + a.c(floatValue5, f27, 0.42f, f62);
                            float c17 = ((floatValue6 * f65) + a.c(floatValue6, f28, 0.42f, f63)) - (f64 * 0.2f);
                            float f66 = 1.0f - (f26 * 0.45f);
                            if (i12 % 2 == 0) {
                                f30 = 1.25f;
                            } else {
                                f30 = 0.9f;
                            }
                            float f67 = f66 * f30;
                            if (f67 < 0.0f) {
                                f67 = 0.0f;
                            }
                            int i14 = i12 % 3;
                            if (i14 == 0) {
                                float f68 = 0.082f * f29 * f67;
                                h a12 = k.a();
                                float f69 = c17 - f68;
                                a12.h(c16, f69);
                                a12.j(c16, c17, c16 + f68, c17);
                                a12.j(c16, c17, c16, c17 + f68);
                                a12.j(c16, c17, c16 - f68, c17);
                                a12.j(c16, c17, c16, f69);
                                a12.d();
                                l0Var2 = l0Var8;
                                d.o0(l0Var2, a12, r.c(j20, d11), null, 60);
                                f31 = f27;
                                f32 = f62;
                                f33 = f63;
                            } else if (i14 == 1) {
                                float f70 = f67 * 0.054f * f29;
                                float f71 = f70 * 1.8f;
                                float f72 = 0.012f * f29;
                                if (f72 < 1.2f) {
                                    f34 = 1.2f;
                                    f36 = c16;
                                    f35 = c17;
                                } else {
                                    f34 = f72;
                                    f35 = c17;
                                    f36 = c16;
                                }
                                f31 = f27;
                                float f73 = f36;
                                float f74 = f35;
                                d.D(l0Var8, r.c(j20, d11), f70, (Float.floatToRawIntBits(f36) << 32) | (Float.floatToRawIntBits(f35) & 4294967295L), null, 120);
                                long j21 = r.f19515d;
                                l0Var2 = l0Var8;
                                float f75 = f34;
                                f33 = f63;
                                f32 = f62;
                                d.n0(l0Var2, r.c(j21, d11), (Float.floatToRawIntBits(f74) & 4294967295L) | (Float.floatToRawIntBits(f73 - f71) << 32), (Float.floatToRawIntBits(f73 + f71) << 32) | (Float.floatToRawIntBits(f74) & 4294967295L), f75, 0, null, 496);
                                d.n0(l0Var2, r.c(j21, d11), (Float.floatToRawIntBits(f73) << 32) | (Float.floatToRawIntBits(f74 - f71) & 4294967295L), (Float.floatToRawIntBits(f73) << 32) | (Float.floatToRawIntBits(f74 + f71) & 4294967295L), f75, 0, null, 496);
                            } else {
                                f31 = f27;
                                f32 = f62;
                                f33 = f63;
                                l0Var2 = l0Var8;
                                d.D(l0Var2, r.c(j20, d11), f67 * 0.038f * f29, (Float.floatToRawIntBits(c17) & 4294967295L) | (Float.floatToRawIntBits(c16) << 32), null, 120);
                            }
                            l0Var8 = l0Var2;
                            i12 = i13;
                            f63 = f33;
                            f27 = f31;
                            f62 = f32;
                        } else {
                            qe.m.l();
                            throw null;
                        }
                    }
                }
                return pe.z.f22715a;
            case 6:
                m0 m0Var4 = (m0) obj;
                m0Var4.getClass();
                m0Var4.b(((Number) this.f2916v.e()).floatValue());
                return pe.z.f22715a;
            default:
                m0 m0Var5 = (m0) obj;
                m0Var5.getClass();
                float floatValue7 = ((Number) this.f2916v.e()).floatValue();
                m0Var5.b(wa.b9.d(floatValue7, 0.0f, 1.0f));
                m0Var5.r(m0Var5.J.a() * 28 * (1.0f - floatValue7));
                float f76 = (floatValue7 * 0.05f) + 0.95f;
                m0Var5.h(f76);
                m0Var5.i(f76);
                return pe.z.f22715a;
        }
        return pe.z.f22715a;
    }
}
