package w7;
import b2.l0;
import c.d;
import c.j;
import c.l;
import eb.w;
import g3.a;
import j.i0;
import j.k;
import j.l;
import j1.e;
import k1.c0;
import k1.h;
import k1.k;
import k1.l0;
import k1.m0;
import k1.p;
import k1.r;
import m1.b;
import m1.d;
import m1.h;
import m2.f0;
import p.a;
import p.d0;
import p.p0;
import p.p;
import p.q0;
import z7.m;

import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final /* synthetic */ class c9 implements df.l {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f28044u;

    public /* synthetic */ c9(int i) {
        this.f28044u = i;
    }

    @Override // df.l
    public final Object invoke(Object obj) {
        i0 i0Var;
        long j10;
        l0 l0Var;
        p pVar;
        Float f10;
        int i = this.f28044u;
        int i10 = 10;
        pe.z zVar = pe.z.f22715a;
        switch (i) {
            case 0:
                d dVar = (d) obj;
                dVar.getClass();
                float c10 = e.c(dVar.e()) * 0.26f;
                long d2 = l0.d(4293227379L);
                float intBitsToFloat = Float.intBitsToFloat((int) (dVar.e() & 4294967295L)) - c10;
                d.n0(dVar, d2, (Float.floatToRawIntBits(c10) << 32) | (Float.floatToRawIntBits(intBitsToFloat) & 4294967295L), (Float.floatToRawIntBits(Float.intBitsToFloat((int) (dVar.e() >> 32)) - c10) << 32) | (Float.floatToRawIntBits(c10) & 4294967295L), 0.075f * e.c(dVar.e()), 0, null, 496);
                return zVar;
            case 1:
                fg.h hVar = (fg.h) obj;
                hVar.getClass();
                hVar.f16978c = true;
                return zVar;
            case 2:
                d dVar2 = (d) obj;
                dVar2.getClass();
                float intBitsToFloat2 = Float.intBitsToFloat((int) (dVar2.e() >> 32));
                float intBitsToFloat3 = Float.intBitsToFloat((int) (dVar2.e() & 4294967295L));
                float l0 = dVar2.l0((float) 1.25d);
                h hVar2 = new h(l0, 0.0f, 1, 1, null, 18);
                long c11 = r.c(r.f19515d, 0.95f);
                h a10 = k.a();
                float f11 = 0.78f * intBitsToFloat3;
                a10.h(0.74f * intBitsToFloat2, f11);
                float f12 = intBitsToFloat2 * 0.9f;
                float f13 = intBitsToFloat3 * 0.62f;
                float f14 = intBitsToFloat3 * 0.48f;
                a10.e(f12, f11, intBitsToFloat2 * 0.98f, f13, f12, f14);
                float f15 = intBitsToFloat3 * 0.36f;
                float f16 = intBitsToFloat3 * 0.28f;
                float f17 = intBitsToFloat3 * 0.3f;
                a10.e(f12, f15, intBitsToFloat2 * 0.8f, f16, intBitsToFloat2 * 0.7f, f17);
                float f18 = intBitsToFloat3 * 0.08f;
                a10.e(intBitsToFloat2 * 0.64f, f18, intBitsToFloat2 * 0.36f, f18, intBitsToFloat2 * 0.3f, f17);
                float f19 = intBitsToFloat2 * 0.1f;
                a10.e(intBitsToFloat2 * 0.2f, f16, f19, f15, f19, f14);
                a10.e(intBitsToFloat2 * 0.02f, f13, f19, f11, intBitsToFloat2 * 0.26f, f11);
                d.o0(dVar2, a10, c11, hVar2, 52);
                float f20 = intBitsToFloat2 * 0.5f;
                d.n0(dVar2, c11, (Float.floatToRawIntBits(f20) << 32) | (Float.floatToRawIntBits(0.38f * intBitsToFloat3) & 4294967295L), (Float.floatToRawIntBits(f20) << 32) | (Float.floatToRawIntBits(r5) & 4294967295L), l0, 1, null, 480);
                float f21 = intBitsToFloat2 * 0.16f;
                float f22 = (0.88f * intBitsToFloat3) - (intBitsToFloat3 * 0.22f);
                d.n0(dVar2, c11, (Float.floatToRawIntBits(f20 - f21) << 32) | (Float.floatToRawIntBits(f22) & 4294967295L), (Float.floatToRawIntBits(f20) << 32) | (Float.floatToRawIntBits(r5) & 4294967295L), l0, 1, null, 480);
                d.n0(dVar2, c11, (Float.floatToRawIntBits(f21 + f20) << 32) | (Float.floatToRawIntBits(f22) & 4294967295L), (Float.floatToRawIntBits(f20) << 32) | (Float.floatToRawIntBits(r5) & 4294967295L), l0, 1, null, 480);
                return zVar;
            case 3:
                d dVar3 = (d) obj;
                dVar3.getClass();
                float l02 = dVar3.l0((float) 1.6d);
                long j11 = r.f19515d;
                float intBitsToFloat4 = Float.intBitsToFloat((int) (dVar3.e() >> 32));
                float intBitsToFloat5 = Float.intBitsToFloat((int) (dVar3.e() & 4294967295L));
                d.n0(dVar3, j11, (Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L), (Float.floatToRawIntBits(intBitsToFloat4) << 32) | (Float.floatToRawIntBits(intBitsToFloat5) & 4294967295L), l02, 1, null, 480);
                float intBitsToFloat6 = Float.intBitsToFloat((int) (dVar3.e() & 4294967295L));
                d.n0(dVar3, j11, (Float.floatToRawIntBits(Float.intBitsToFloat((int) (dVar3.e() >> 32))) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L), (Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(intBitsToFloat6) & 4294967295L), l02, 1, null, 480);
                return zVar;
            case 4:
                d dVar4 = (d) obj;
                dVar4.getClass();
                float c12 = e.c(dVar4.e());
                float f23 = c12 * 0.045f;
                h hVar3 = new h(f23, 0.0f, 1, 1, null, 18);
                long floatToRawIntBits = (Float.floatToRawIntBits(c12 * 0.26f) << 32) | (Float.floatToRawIntBits(c12 * 0.6f) & 4294967295L);
                float f24 = c12 * 0.74f;
                List h3 = qe.m.h(new r(l0.d(4281055474L)), new r(l0.d(4284116208L)), new r(l0.d(4287837162L)), new r(l0.d(4290782931L)));
                long floatToRawIntBits2 = (Float.floatToRawIntBits(0.88f * c12) << 32) | (Float.floatToRawIntBits(0.02f * c12) & 4294967295L);
                long floatToRawIntBits3 = (Float.floatToRawIntBits(0.14f * c12) << 32) | (Float.floatToRawIntBits(c12 * 0.98f) & 4294967295L);
                c0 h10 = w.h(h3, x7.l(floatToRawIntBits, floatToRawIntBits2), x7.l(floatToRawIntBits, floatToRawIntBits3), 8);
                c0 h11 = w.h(h3, floatToRawIntBits2, floatToRawIntBits3, 8);
                i0 p02 = dVar4.p0();
                long r8 = p02.r();
                p02.j().l();
                try {
                    ((ic.c) p02.f18636v).z(floatToRawIntBits, 45.0f);
                    h a11 = k.a();
                    long k3 = x7.k(floatToRawIntBits, f24, -0.082f, 0.6f);
                    a11.h(Float.intBitsToFloat((int) (k3 >> 32)), Float.intBitsToFloat((int) (k3 & 4294967295L)));
                    long k4 = x7.k(floatToRawIntBits, f24, -0.082f, 0.13f);
                    a11.g(Float.intBitsToFloat((int) (k4 >> 32)), Float.intBitsToFloat((int) (k4 & 4294967295L)));
                    long k10 = x7.k(floatToRawIntBits, f24, -0.024f, 0.035f);
                    a11.g(Float.intBitsToFloat((int) (k10 >> 32)), Float.intBitsToFloat((int) (k10 & 4294967295L)));
                    long k11 = x7.k(floatToRawIntBits, f24, 0.0f, 0.0f);
                    a11.g(Float.intBitsToFloat((int) (k11 >> 32)), Float.intBitsToFloat((int) (k11 & 4294967295L)));
                    long k12 = x7.k(floatToRawIntBits, f24, 0.024f, 0.035f);
                    a11.g(Float.intBitsToFloat((int) (k12 >> 32)), Float.intBitsToFloat((int) (k12 & 4294967295L)));
                    long k13 = x7.k(floatToRawIntBits, f24, 0.082f, 0.13f);
                    a11.g(Float.intBitsToFloat((int) (k13 >> 32)), Float.intBitsToFloat((int) (k13 & 4294967295L)));
                    long k14 = x7.k(floatToRawIntBits, f24, 0.082f, 0.6f);
                    a11.g(Float.intBitsToFloat((int) (k14 >> 32)), Float.intBitsToFloat((int) (k14 & 4294967295L)));
                    d.g0(dVar4, a11, h10, 0.0f, hVar3, 52);
                    d.s0(dVar4, h10, x7.k(floatToRawIntBits, f24, -0.082f, 0.34f), x7.k(floatToRawIntBits, f24, 0.082f, 0.47f), f23, 0.0f, 480);
                    float f25 = 0.05f * f24;
                    d.L(dVar4, h10, x7.k(floatToRawIntBits, f24, -0.175f, 0.72f), (Float.floatToRawIntBits(0.35f * f24) << 32) | (Float.floatToRawIntBits(0.12f * f24) & 4294967295L), (Float.floatToRawIntBits(f25) << 32) | (Float.floatToRawIntBits(f25) & 4294967295L), hVar3, 208);
                    j10 = r8;
                    i0Var = p02;
                    try {
                        d.L(dVar4, h10, x7.k(floatToRawIntBits, f24, -0.105f, 1.0f), (Float.floatToRawIntBits(f24 * 0.28f) & 4294967295L) | (Float.floatToRawIntBits(0.21f * f24) << 32), (Float.floatToRawIntBits(f25) << 32) | (Float.floatToRawIntBits(f25) & 4294967295L), hVar3, 208);
                        i0Var.j().s();
                        i0Var.I(j10);
                        float f26 = 0.076f * c12;
                        float f27 = 0.24f * c12;
                        float f28 = 0.872f * c12;
                        float acos = (float) Math.acos(0.43478262f);
                        float f29 = (180.0f * acos) / 3.1415927f;
                        h a12 = k.a();
                        a12.h(f27, f28 - (2.3f * f26));
                        double d10 = acos;
                        a12.g(f27 - (((float) Math.sin(d10)) * f26), f28 - (((float) Math.cos(d10)) * f26));
                        float f30 = f27 - f26;
                        float f31 = f28 - f26;
                        float f32 = f27 + f26;
                        float f33 = f26 + f28;
                        float f34 = 270.0f - f29;
                        float f35 = (f29 * 2.0f) - 360.0f;
                        if (a12.f19482b == null) {
                            a12.f19482b = new RectF();
                        }
                        RectF rectF = a12.f19482b;
                        rectF.getClass();
                        rectF.set(f30, f31, f32, f33);
                        Path path = a12.f19481a;
                        RectF rectF2 = a12.f19482b;
                        rectF2.getClass();
                        path.arcTo(rectF2, f34, f35, false);
                        a12.d();
                        d.g0(dVar4, a12, h11, 0.0f, hVar3, 52);
                        return zVar;
                    } catch (Throwable th) {
                        th = th;
                        a.v(i0Var, j10);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    i0Var = p02;
                    j10 = r8;
                }
            case 5:
                m0 m0Var = (m0) obj;
                m0Var.getClass();
                m0Var.b(0.0f);
                return zVar;
            case 6:
                l0 l0Var2 = (l0) obj;
                Float valueOf = Float.valueOf(1.0f);
                l0Var2.getClass();
                l0Var2.b();
                Float valueOf2 = Float.valueOf(0.0f);
                long j12 = r.f19515d;
                pe.j jVar = new pe.j(valueOf2, new r(r.c(j12, 0.07f)));
                Float valueOf3 = Float.valueOf(0.45f);
                float f36 = 1.0f;
                long j13 = r.f19520k;
                pe.j[] jVarArr = {jVar, new pe.j(valueOf3, new r(j13))};
                b bVar = l0Var2.f1533u;
                float intBitsToFloat7 = Float.intBitsToFloat((int) (bVar.e() >> 32)) * 0.95f;
                float intBitsToFloat8 = Float.intBitsToFloat((int) (bVar.e() & 4294967295L));
                d.q(l0Var2, w.f(jVarArr, (Float.floatToRawIntBits(Float.intBitsToFloat((int) (bVar.e() >> 32)) * 0.15f) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L), (Float.floatToRawIntBits(intBitsToFloat8) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat7) << 32)), 0L, 0L, 0.0f, null, 0, 126);
                float intBitsToFloat9 = Float.intBitsToFloat((int) (bVar.e() >> 32)) * 0.06930693f;
                float f37 = intBitsToFloat9 * 0.35f;
                float l03 = l0Var2.l0(x7.m0.f30239a);
                if (f37 < l03) {
                    f37 = l03;
                }
                float f38 = intBitsToFloat9 * 0.7f;
                if (f37 > f38) {
                    f37 = f38;
                }
                p j14 = bVar.f20424v.j();
                j14.e(wa.s8.a(0L, bVar.e()), l0.i());
                List h12 = qe.m.h(new pe.j(valueOf2, new r(j12)), new pe.j(valueOf, new r(j13)));
                float intBitsToFloat10 = Float.intBitsToFloat((int) (bVar.e() >> 32));
                float intBitsToFloat11 = Float.intBitsToFloat((int) (bVar.e() & 4294967295L));
                float f39 = (intBitsToFloat10 - intBitsToFloat9) - 0.0f;
                if (f37 > 0.0f && intBitsToFloat9 > 0.0f && f39 > 0.0f) {
                    if (intBitsToFloat11 > intBitsToFloat9 * 2.0f) {
                        List<pe.j> list = h12;
                        l0Var = l0Var2;
                        ArrayList arrayList = new ArrayList(qe.m.d(list, 10));
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            pe.j jVar2 = (pe.j) it.next();
                            arrayList.add(new pe.j(Float.valueOf(1.0f - ((Number) jVar2.f22693u).floatValue()), new r(((r) jVar2.f22694v).f19523a)));
                            it = it;
                            j14 = j14;
                        }
                        pVar = j14;
                        pe.j[] jVarArr2 = (pe.j[]) qe.l.H(arrayList).toArray(new pe.j[0]);
                        pe.j[] jVarArr3 = (pe.j[]) h12.toArray(new pe.j[0]);
                        f10 = valueOf;
                        d.q(l0Var, w.l((pe.j[]) Arrays.copyOf(jVarArr3, jVarArr3.length), 0.0f, f37, 8), (Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L), (Float.floatToRawIntBits(f39) << 32) | (Float.floatToRawIntBits(f37) & 4294967295L), 0.0f, null, 0, 120);
                        d.q(l0Var, w.l((pe.j[]) Arrays.copyOf(jVarArr2, jVarArr2.length), intBitsToFloat11 - f37, intBitsToFloat11, 8), (Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(r3) & 4294967295L), (Float.floatToRawIntBits(f39) << 32) | (Float.floatToRawIntBits(f37) & 4294967295L), 0.0f, null, 0, 120);
                        d.q(l0Var, w.d((pe.j[]) Arrays.copyOf(jVarArr2, jVarArr2.length), intBitsToFloat10 - f37, intBitsToFloat10), (Float.floatToRawIntBits(r1) << 32) | (Float.floatToRawIntBits(intBitsToFloat9) & 4294967295L), (Float.floatToRawIntBits(f37) << 32) | (Float.floatToRawIntBits(intBitsToFloat11 - r12) & 4294967295L), 0.0f, null, 0, 120);
                        ArrayList arrayList2 = new ArrayList(qe.m.d(list, 10));
                        for (pe.j jVar3 : list) {
                            arrayList2.add(new pe.j(Float.valueOf(wa.b9.d(a.u(f37, ((Number) jVar3.f22693u).floatValue(), intBitsToFloat9, intBitsToFloat9), 0.0f, f36)), new r(((r) jVar3.f22694v).f19523a)));
                            f36 = 1.0f;
                        }
                        pe.j[] jVarArr4 = (pe.j[]) qe.l.H(arrayList2).toArray(new pe.j[0]);
                        d.q(l0Var, w.j((pe.j[]) Arrays.copyOf(jVarArr4, jVarArr4.length), (Float.floatToRawIntBits(r9) << 32) | (Float.floatToRawIntBits(intBitsToFloat9) & 4294967295L), intBitsToFloat9, 8), (Float.floatToRawIntBits(r9) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L), (Float.floatToRawIntBits(intBitsToFloat9) << 32) | (Float.floatToRawIntBits(intBitsToFloat9) & 4294967295L), 0.0f, null, 0, 120);
                        float f40 = intBitsToFloat11 - intBitsToFloat9;
                        d.q(l0Var, w.j((pe.j[]) Arrays.copyOf(jVarArr4, jVarArr4.length), (Float.floatToRawIntBits(r9) << 32) | (Float.floatToRawIntBits(f40) & 4294967295L), intBitsToFloat9, 8), (Float.floatToRawIntBits(r9) << 32) | (Float.floatToRawIntBits(f40) & 4294967295L), (Float.floatToRawIntBits(intBitsToFloat9) << 32) | (Float.floatToRawIntBits(intBitsToFloat9) & 4294967295L), 0.0f, null, 0, 120);
                        long j15 = r.f19515d;
                        d.q(l0Var, w.l(new pe.j[]{new pe.j(valueOf2, new r(r.c(j15, 0.26f))), new pe.j(Float.valueOf(0.5f), new r(r.c(j15, 0.26f))), new pe.j(f10, new r(r.c(j15, 0.26f)))}, 0.0f, 0.0f, 14), 0L, 0L, 0.0f, null, 6, 62);
                        pVar.s();
                        return zVar;
                    }
                }
                l0Var = l0Var2;
                pVar = j14;
                f10 = valueOf;
                long j152 = r.f19515d;
                d.q(l0Var, w.l(new pe.j[]{new pe.j(valueOf2, new r(r.c(j152, 0.26f))), new pe.j(Float.valueOf(0.5f), new r(r.c(j152, 0.26f))), new pe.j(f10, new r(r.c(j152, 0.26f)))}, 0.0f, 0.0f, 14), 0L, 0L, 0.0f, null, 6, 62);
                pVar.s();
                return zVar;
            case 7:
                l0 l0Var3 = (l0) obj;
                l0Var3.getClass();
                l0Var3.b();
                float l04 = l0Var3.l0(1);
                float l05 = l0Var3.l0(16);
                h a13 = k.a();
                b bVar2 = l0Var3.f1533u;
                a13.h(0.0f, Float.intBitsToFloat((int) (bVar2.e() & 4294967295L)));
                a13.g(0.0f, l05);
                a13.j(0.0f, 0.0f, l05, 0.0f);
                a13.g(Float.intBitsToFloat((int) (bVar2.e() >> 32)) - l05, 0.0f);
                a13.j(Float.intBitsToFloat((int) (bVar2.e() >> 32)), 0.0f, Float.intBitsToFloat((int) (bVar2.e() >> 32)), l05);
                a13.g(Float.intBitsToFloat((int) (bVar2.e() >> 32)), Float.intBitsToFloat((int) (bVar2.e() & 4294967295L)));
                d.o0(l0Var3, a13, l0.c(587202559), new h(l04, 0.0f, 0, 0, null, 30), 52);
                return zVar;
            case 8:
                p pVar2 = (p) obj;
                pVar2.getClass();
                int i11 = 13;
                if (pVar2.c() == m.QUICK_START) {
                    p0 a14 = androidx.compose.animation.j(new f0(i11)).a(androidx.compose.animation.d(null, 3));
                    q0 a15 = androidx.compose.animation.l(new c9(9)).a(androidx.compose.animation.c.e(null, 3));
                    int i12 = androidx.compose.animation.a.f423b;
                    return new d0(a14, a15);
                }
                p0 a16 = androidx.compose.animation.j(new c9(i10)).a(androidx.compose.animation.d(null, 3));
                q0 a17 = androidx.compose.animation.l(new f0(i11)).a(androidx.compose.animation.c.e(null, 3));
                int i13 = androidx.compose.animation.a.f423b;
                return new d0(a16, a17);
            case 9:
            default:
                return Integer.valueOf(-((Integer) obj).intValue());
        }
    }
}
