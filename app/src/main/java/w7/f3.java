package w7;
import b.a;
import k.a;
import r.c;
import b2.l0;
import c.d;
import c.j;
import c.l;
import g3.a;
import k1.b;
import k1.h;
import k1.k;
import k1.p;
import k1.r;
import p.d0;
import p.p0;
import p.q0;
import y8.c;

import android.graphics.Canvas;
import com.google.android.gms.internal.ads.gl;
import com.google.android.gms.internal.ads.wd0;
import java.util.List;

/* loaded from: classes.dex */
public final /* synthetic */ class f3 implements df.l {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f28205u;

    public /* synthetic */ f3(int i) {
        this.f28205u = i;
    }

    @Override // df.l
    public final Object invoke(Object obj) {
        p0 a10;
        q0 a11;
        p0 a12;
        q0 a13;
        int i = this.f28205u;
        int i10 = 6;
        int i11 = 16;
        float f10 = 0.14f;
        float f11 = 0.24f;
        int i12 = 0;
        int i13 = 3;
        pe.z zVar = pe.z.f22715a;
        switch (i) {
            case 0:
                return String.valueOf(((Integer) obj).intValue());
            case 1:
                d dVar = (d) obj;
                dVar.getClass();
                p j10 = dVar.p0().j();
                b.a(j10).save();
                a aVar = (a) j10;
                aVar.f19463a.translate(Float.intBitsToFloat((int) (dVar.e() >> 32)) * 0.32f, Float.intBitsToFloat((int) (dVar.e() & 4294967295L)) * 0.34f);
                List list = y8.f29503a;
                c(aVar.f19463a, "star", Float.intBitsToFloat((int) (dVar.e() >> 32)) * 0.62f, Float.intBitsToFloat((int) (dVar.e() >> 32)) * 0.62f, Integer.valueOf(l0.F(r.c(l0.d(4294551589L), 0.9f))), null, 0.0f, 0.0f);
                aVar.f19463a.restore();
                aVar.f19463a.save();
                aVar.f19463a.translate(Float.intBitsToFloat((int) (dVar.e() >> 32)) * 0.68f, Float.intBitsToFloat((int) (dVar.e() & 4294967295L)) * 0.7f);
                c(aVar.f19463a, "ellipse", Float.intBitsToFloat((int) (dVar.e() >> 32)) * 0.52f, Float.intBitsToFloat((int) (dVar.e() >> 32)) * 0.52f, Integer.valueOf(l0.F(r.c(l0.d(4280723098L), 0.85f))), null, 0.0f, 0.0f);
                aVar.f19463a.restore();
                return zVar;
            case 2:
                d dVar2 = (d) obj;
                dVar2.getClass();
                long c10 = r.c(l0.d(4294951175L), 0.8f);
                float f12 = 12;
                float l0 = dVar2.l0(f12);
                float l02 = dVar2.l0(f12);
                float l03 = dVar2.l0(f12);
                d.D(dVar2, c10, l0, (Float.floatToRawIntBits(l02) << 32) | (Float.floatToRawIntBits(l03) & 4294967295L), null, 120);
                long c11 = r.c(l0.d(4293467747L), 0.8f);
                float f13 = 14;
                float l04 = dVar2.l0(f13);
                float l05 = dVar2.l0(f13);
                long floatToRawIntBits = (Float.floatToRawIntBits(l04) << 32) | (Float.floatToRawIntBits(l05) & 4294967295L);
                float f14 = 22;
                float l06 = dVar2.l0(f14);
                float l07 = dVar2.l0(f14);
                float l08 = dVar2.l0(4);
                d.z0(dVar2, c11, floatToRawIntBits, (Float.floatToRawIntBits(l06) << 32) | (Float.floatToRawIntBits(l07) & 4294967295L), (Float.floatToRawIntBits(l08) << 32) | (Float.floatToRawIntBits(l08) & 4294967295L), null, 240);
                return zVar;
            case 3:
                d dVar3 = (d) obj;
                dVar3.getClass();
                Canvas a14 = b.a(dVar3.p0().j());
                float intBitsToFloat = Float.intBitsToFloat((int) (dVar3.e() >> 32));
                float intBitsToFloat2 = Float.intBitsToFloat((int) (dVar3.e() & 4294967295L));
                float f15 = 0.85f * intBitsToFloat;
                float f16 = intBitsToFloat2 * 0.28f;
                a14.save();
                a14.translate(intBitsToFloat * 0.1f, intBitsToFloat2 * 0.25f);
                a14.rotate(-15.0f);
                p9 p9Var = p9.f28915a;
                p9.q(a14, new l9(255, 213, 79, k9.STARS), f15, f16);
                a14.restore();
                a14.save();
                a14.translate(0.05f * intBitsToFloat, 0.45f * intBitsToFloat2);
                a14.rotate(8.0f);
                p9.q(a14, new l9(240, 98, 146, k9.GRID), 0.95f * f15, f16);
                a14.restore();
                a14.save();
                a14.translate(intBitsToFloat * 0.15f, intBitsToFloat2 * 0.6f);
                a14.rotate(-22.0f);
                p9.q(a14, new l9(77, 208, 225, k9.WAVES), f15 * 0.8f, f16);
                a14.restore();
                return zVar;
            case 4:
                return Integer.valueOf(((Integer) obj).intValue() / 3);
            case 5:
                return Integer.valueOf((-((Integer) obj).intValue()) / 3);
            case 6:
                return Integer.valueOf((-((Integer) obj).intValue()) / 3);
            case 7:
                return Integer.valueOf(((Integer) obj).intValue() / 3);
            case 8:
                return a.g(((Integer) obj).intValue(), "sk_");
            case 9:
                l0 l0Var = (l0) obj;
                l0Var.getClass();
                l0Var.b();
                float l09 = l0Var.l0(1);
                float l010 = l0Var.l0(16);
                long c12 = l0.c(587202559);
                h a15 = k.a();
                b bVar = l0Var.f1533u;
                a15.h(0.0f, Float.intBitsToFloat((int) (bVar.e() & 4294967295L)));
                a15.g(0.0f, l010);
                a15.j(0.0f, 0.0f, l010, 0.0f);
                a15.g(Float.intBitsToFloat((int) (bVar.e() >> 32)) - l010, 0.0f);
                a15.j(Float.intBitsToFloat((int) (bVar.e() >> 32)), 0.0f, Float.intBitsToFloat((int) (bVar.e() >> 32)), l010);
                a15.g(Float.intBitsToFloat((int) (bVar.e() >> 32)), Float.intBitsToFloat((int) (bVar.e() & 4294967295L)));
                d.o0(l0Var, a15, c12, new h(l09, 0.0f, 0, 0, null, 30), 52);
                return zVar;
            case 10:
                p pVar = (p) obj;
                pVar.getClass();
                if (pVar.c() != null) {
                    a10 = androidx.compose.animation.j(new f3(4)).a(androidx.compose.animation.d(q.e.s(220, 0, null, 6), 2));
                } else {
                    a10 = androidx.compose.animation.j(new f3(5)).a(androidx.compose.animation.d(q.e.s(220, 0, null, 6), 2));
                }
                if (pVar.c() != null) {
                    a11 = androidx.compose.animation.l(new f3(i10)).a(androidx.compose.animation.c.e(q.e.s(160, 0, null, 6), 2));
                } else {
                    a11 = androidx.compose.animation.l(new f3(7)).a(androidx.compose.animation.c.e(q.e.s(160, 0, null, 6), 2));
                }
                int i14 = androidx.compose.animation.a.f423b;
                return new d0(a10, a11);
            case 11:
                d dVar4 = (d) obj;
                dVar4.getClass();
                float intBitsToFloat3 = Float.intBitsToFloat((int) (dVar4.e() >> 32));
                long j11 = r.f19515d;
                float f17 = 0.12f * intBitsToFloat3;
                d.z0(dVar4, r.c(j11, 0.5f), 0L, 0L, (Float.floatToRawIntBits(f17) << 32) | (Float.floatToRawIntBits(f17) & 4294967295L), new h(intBitsToFloat3 * 0.08f, 0.0f, 0, 0, null, 30), 230);
                float f18 = intBitsToFloat3 * 0.35f;
                d.D(dVar4, r.c(j11, 0.5f), f17, (Float.floatToRawIntBits(f18) << 32) | (Float.floatToRawIntBits(f18) & 4294967295L), null, 120);
                return zVar;
            case 12:
                d dVar5 = (d) obj;
                dVar5.getClass();
                float intBitsToFloat4 = Float.intBitsToFloat((int) (dVar5.e() >> 32)) / 5.0f;
                d.t(dVar5, l0.d(4293519852L), 0L, 0L, 0.0f, null, 126);
                float f19 = 0.0f;
                int i15 = 0;
                while (f19 < Float.intBitsToFloat((int) (dVar5.e() & 4294967295L))) {
                    float f20 = 0.0f;
                    int i16 = 0;
                    while (f20 < Float.intBitsToFloat((int) (dVar5.e() >> 32))) {
                        if ((i15 + i16) % 2 == 1) {
                            float min = Math.min(intBitsToFloat4, Float.intBitsToFloat((int) (dVar5.e() >> 32)) - f20);
                            float min2 = Math.min(intBitsToFloat4, Float.intBitsToFloat((int) (dVar5.e() & 4294967295L)) - f19);
                            d.t(dVar5, l0.d(4291414479L), (Float.floatToRawIntBits(f20) << 32) | (Float.floatToRawIntBits(f19) & 4294967295L), (Float.floatToRawIntBits(min) << 32) | (Float.floatToRawIntBits(min2) & 4294967295L), 0.0f, null, 120);
                        }
                        f20 += intBitsToFloat4;
                        i16++;
                    }
                    f19 += intBitsToFloat4;
                    i15++;
                }
                return zVar;
            case 13:
                d dVar6 = (d) obj;
                dVar6.getClass();
                float intBitsToFloat5 = Float.intBitsToFloat((int) (dVar6.e() >> 32));
                float intBitsToFloat6 = Float.intBitsToFloat((int) (dVar6.e() & 4294967295L));
                float f21 = intBitsToFloat5 * 0.25f;
                float f22 = 0.1f * intBitsToFloat5 * 2.2f;
                d.n0(dVar6, l0.d(4294951499L), (Float.floatToRawIntBits(f21) << 32) | (Float.floatToRawIntBits(0.75f * intBitsToFloat6) & 4294967295L), (Float.floatToRawIntBits(0.72f * intBitsToFloat5) << 32) | (Float.floatToRawIntBits(0.28f * intBitsToFloat6) & 4294967295L), f22, 1, null, 480);
                d.n0(dVar6, r.c(r.f19515d, 0.85f), (Float.floatToRawIntBits(0.7f * intBitsToFloat5) << 32) | (Float.floatToRawIntBits(0.3f * intBitsToFloat6) & 4294967295L), (Float.floatToRawIntBits(0.82f * intBitsToFloat5) << 32) | (Float.floatToRawIntBits(intBitsToFloat6 * 0.18f) & 4294967295L), f22, 1, null, 480);
                d.D(dVar6, l0.d(4281019182L), intBitsToFloat5 * 0.06f, (Float.floatToRawIntBits(f21) << 32) | (Float.floatToRawIntBits(intBitsToFloat6 * 0.76f) & 4294967295L), null, 120);
                return zVar;
            case 14:
                d dVar7 = (d) obj;
                dVar7.getClass();
                float intBitsToFloat7 = Float.intBitsToFloat((int) (dVar7.e() & 4294967295L)) * 0.11f;
                float intBitsToFloat8 = Float.intBitsToFloat((int) (dVar7.e() & 4294967295L)) * 0.15f;
                for (pe.j jVar : qe.m.h(new pe.j(Float.valueOf(0.22f), Float.valueOf(0.66f)), new pe.j(Float.valueOf(0.5f), Float.valueOf(0.34f)), new pe.j(Float.valueOf(0.78f), Float.valueOf(0.56f)))) {
                    float floatValue = ((Number) jVar.f22693u).floatValue();
                    float floatValue2 = ((Number) jVar.f22694v).floatValue();
                    float intBitsToFloat9 = Float.intBitsToFloat((int) (dVar7.e() & 4294967295L)) * floatValue;
                    long j12 = r.f19515d;
                    d.n0(dVar7, j12, (Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(intBitsToFloat9) & 4294967295L), (Float.floatToRawIntBits(Float.intBitsToFloat((int) (dVar7.e() >> 32))) << 32) | (Float.floatToRawIntBits(intBitsToFloat9) & 4294967295L), intBitsToFloat7, 1, null, 480);
                    d.D(dVar7, j12, intBitsToFloat8, (Float.floatToRawIntBits(Float.intBitsToFloat((int) (dVar7.e() >> 32)) * floatValue2) << 32) | (Float.floatToRawIntBits(intBitsToFloat9) & 4294967295L), null, 120);
                    intBitsToFloat7 = intBitsToFloat7;
                }
                return zVar;
            case 15:
                p pVar2 = (p) obj;
                pVar2.getClass();
                if (((Boolean) pVar2.c()).booleanValue()) {
                    a12 = androidx.compose.animation.j(new f3(i11)).a(androidx.compose.animation.d(q.e.s(220, 0, null, 6), 2));
                } else {
                    a12 = androidx.compose.animation.j(new f3(17)).a(androidx.compose.animation.d(q.e.s(220, 0, null, 6), 2));
                }
                if (((Boolean) pVar2.c()).booleanValue()) {
                    a13 = androidx.compose.animation.l(new f3(18)).a(androidx.compose.animation.c.e(q.e.s(160, 0, null, 6), 2));
                } else {
                    a13 = androidx.compose.animation.l(new f3(19)).a(androidx.compose.animation.c.e(q.e.s(160, 0, null, 6), 2));
                }
                int i17 = androidx.compose.animation.a.f423b;
                return new d0(a12, a13);
            case 16:
                return Integer.valueOf(((Integer) obj).intValue() / 3);
            case 17:
                return Integer.valueOf((-((Integer) obj).intValue()) / 3);
            case 18:
                return Integer.valueOf((-((Integer) obj).intValue()) / 3);
            case 19:
                return Integer.valueOf(((Integer) obj).intValue() / 3);
            case 20:
                u7.i7 i7Var = (u7.i7) obj;
                i7Var.getClass();
                return i7Var.f26339a;
            case gl.zzm /* 21 */:
                l0 l0Var2 = (l0) obj;
                l0Var2.getClass();
                l0Var2.b();
                float l011 = l0Var2.l0(1);
                float l012 = l0Var2.l0(16);
                h a16 = k.a();
                b bVar2 = l0Var2.f1533u;
                a16.h(0.0f, Float.intBitsToFloat((int) (bVar2.e() & 4294967295L)));
                a16.g(0.0f, l012);
                a16.j(0.0f, 0.0f, l012, 0.0f);
                a16.g(Float.intBitsToFloat((int) (bVar2.e() >> 32)) - l012, 0.0f);
                a16.j(Float.intBitsToFloat((int) (bVar2.e() >> 32)), 0.0f, Float.intBitsToFloat((int) (bVar2.e() >> 32)), l012);
                a16.g(Float.intBitsToFloat((int) (bVar2.e() >> 32)), Float.intBitsToFloat((int) (bVar2.e() & 4294967295L)));
                d.o0(l0Var2, a16, l0.c(587202559), new h(l011, 0.0f, 0, 0, null, 30), 52);
                return zVar;
            case 22:
                p8 p8Var = (p8) obj;
                p8Var.getClass();
                return wd0.n(p8Var.f28913a.name(), "|", p8Var.f28914b);
            case 23:
                p8 p8Var2 = (p8) obj;
                p8Var2.getClass();
                return wd0.n(p8Var2.f28913a.name(), "|", p8Var2.f28914b);
            case 24:
                d dVar8 = (d) obj;
                dVar8.getClass();
                float intBitsToFloat10 = Float.intBitsToFloat((int) (dVar8.e() >> 32));
                float intBitsToFloat11 = Float.intBitsToFloat((int) (dVar8.e() & 4294967295L));
                long c13 = r.c(r.f19515d, 0.95f);
                float f23 = intBitsToFloat10 * 0.09f;
                float f24 = 0.54f * intBitsToFloat10;
                float f25 = 0.46f * intBitsToFloat11;
                d.n0(dVar8, c13, (Float.floatToRawIntBits(0.16f * intBitsToFloat10) << 32) | (Float.floatToRawIntBits(0.84f * intBitsToFloat11) & 4294967295L), (Float.floatToRawIntBits(f24) << 32) | (Float.floatToRawIntBits(f25) & 4294967295L), f23, 1, null, 480);
                d.n0(dVar8, r.c(c13, 0.5f), (Float.floatToRawIntBits(0.56f * intBitsToFloat11) & 4294967295L) | (Float.floatToRawIntBits(0.44f * intBitsToFloat10) << 32), (Float.floatToRawIntBits(f24) << 32) | (Float.floatToRawIntBits(f25) & 4294967295L), f23 * 1.3f, 2, null, 480);
                n4.R0(dVar8, c13, intBitsToFloat10 * 0.68f, intBitsToFloat11 * 0.24f, intBitsToFloat10 * 0.18f, 0.98f);
                n4.R0(dVar8, c13, intBitsToFloat10 * 0.28f, intBitsToFloat11 * 0.22f, intBitsToFloat10 * 0.1f, 0.85f);
                n4.R0(dVar8, c13, intBitsToFloat10 * 0.82f, intBitsToFloat11 * 0.58f, f23, 0.85f);
                return zVar;
            case 25:
                d dVar9 = (d) obj;
                dVar9.getClass();
                float intBitsToFloat12 = Float.intBitsToFloat((int) (dVar9.e() >> 32));
                float f26 = intBitsToFloat12 * 0.09f;
                float f27 = intBitsToFloat12 * 0.14f;
                float f28 = intBitsToFloat12 * 0.5f;
                long j13 = r.f19515d;
                float f29 = 0.12f * intBitsToFloat12;
                d.z0(dVar9, r.c(j13, 0.55f), (Float.floatToRawIntBits(f29) << 32) | (Float.floatToRawIntBits(f29) & 4294967295L), (Float.floatToRawIntBits(f28) << 32) | (Float.floatToRawIntBits(f28) & 4294967295L), (Float.floatToRawIntBits(f27) << 32) | (Float.floatToRawIntBits(f27) & 4294967295L), new h(f26, 0.0f, 0, 0, null, 30), 224);
                float f30 = intBitsToFloat12 * 0.38f;
                d.z0(dVar9, j13, (Float.floatToRawIntBits(f30) << 32) | (Float.floatToRawIntBits(f30) & 4294967295L), (Float.floatToRawIntBits(f28) << 32) | (Float.floatToRawIntBits(f28) & 4294967295L), (Float.floatToRawIntBits(f27) & 4294967295L) | (Float.floatToRawIntBits(f27) << 32), new h(f26, 0.0f, 0, 0, null, 30), 224);
                return zVar;
            case 26:
                d dVar10 = (d) obj;
                dVar10.getClass();
                float intBitsToFloat13 = Float.intBitsToFloat((int) (dVar10.e() >> 32));
                float intBitsToFloat14 = Float.intBitsToFloat((int) (dVar10.e() & 4294967295L));
                float f31 = intBitsToFloat13 * 0.1f;
                long c14 = r.c(r.f19515d, 0.92f);
                float f32 = intBitsToFloat13 / 2.0f;
                h a17 = k.a();
                a17.h(f32, intBitsToFloat14 * 0.25f);
                float f33 = 0.6f * intBitsToFloat14;
                a17.g(intBitsToFloat13 * 0.75f, f33);
                a17.g(intBitsToFloat13 * 0.25f, f33);
                a17.d();
                d.o0(dVar10, a17, c14, new h(f31, 0.0f, 0, 1, null, 22), 52);
                float f34 = intBitsToFloat14 * 0.75f;
                d.n0(dVar10, c14, (Float.floatToRawIntBits(r11) << 32) | (Float.floatToRawIntBits(f34) & 4294967295L), (Float.floatToRawIntBits(r10) << 32) | (Float.floatToRawIntBits(f34) & 4294967295L), f31, 1, null, 480);
                return zVar;
            case 27:
                d dVar11 = (d) obj;
                dVar11.getClass();
                float intBitsToFloat15 = Float.intBitsToFloat((int) (dVar11.e() >> 32));
                float intBitsToFloat16 = Float.intBitsToFloat((int) (dVar11.e() & 4294967295L));
                float f35 = intBitsToFloat15 * 0.1f;
                long c15 = r.c(r.f19515d, 0.92f);
                float f36 = intBitsToFloat15 / 2.0f;
                float f37 = intBitsToFloat16 * 0.18f;
                float f38 = 0.1f * intBitsToFloat16;
                float f39 = f38;
                while (i12 < i13) {
                    long floatToRawIntBits2 = (Float.floatToRawIntBits(f36) << 32) | (Float.floatToRawIntBits(f39) & 4294967295L);
                    float f40 = f39 + f37;
                    float f41 = intBitsToFloat16 * 0.9f;
                    if (f40 > f41) {
                        f40 = f41;
                    }
                    d.n0(dVar11, c15, floatToRawIntBits2, (Float.floatToRawIntBits(f36) << 32) | (Float.floatToRawIntBits(f40) & 4294967295L), f35 * 0.9f, 1, null, 480);
                    i12++;
                    f11 = f11;
                    i13 = i13;
                    f10 = f10;
                    f39 = f37 + f38 + f39;
                }
                h a18 = k.a();
                float f42 = f10 * intBitsToFloat15;
                float f43 = intBitsToFloat16 * f11;
                a18.h(f42, f43);
                float f44 = 0.5f * intBitsToFloat16;
                a18.g(f36 - f35, f44);
                float f45 = intBitsToFloat16 * 0.76f;
                a18.g(f42, f45);
                a18.d();
                d.o0(dVar11, a18, c15, new h(f35, 0.0f, 1, 1, null, 18), 52);
                h a19 = k.a();
                float f46 = intBitsToFloat15 * 0.86f;
                a19.h(f46, f43);
                a19.g(f36 + f35, f44);
                a19.g(f46, f45);
                a19.d();
                d.o0(dVar11, a19, c15, new h(f35, 0.0f, 1, 1, null, 18), 52);
                return zVar;
            case 28:
                d dVar12 = (d) obj;
                dVar12.getClass();
                float intBitsToFloat17 = Float.intBitsToFloat((int) (dVar12.e() >> 32));
                float intBitsToFloat18 = Float.intBitsToFloat((int) (dVar12.e() & 4294967295L));
                float f47 = intBitsToFloat17 * 0.1f;
                long d2 = l0.d(4293216333L);
                float f48 = 0.24f * intBitsToFloat18;
                d.n0(dVar12, d2, (Float.floatToRawIntBits(0.15f * intBitsToFloat17) << 32) | (Float.floatToRawIntBits(f48) & 4294967295L), (Float.floatToRawIntBits(0.85f * intBitsToFloat17) << 32) | (Float.floatToRawIntBits(f48) & 4294967295L), f47, 1, null, 480);
                float f49 = 0.4f * intBitsToFloat17;
                float f50 = 0.14f * intBitsToFloat18;
                d.n0(dVar12, d2, (Float.floatToRawIntBits(f49) << 32) | (Float.floatToRawIntBits(f48) & 4294967295L), (Float.floatToRawIntBits(f49) << 32) | (Float.floatToRawIntBits(f50) & 4294967295L), f47, 1, null, 480);
                float f51 = 0.6f * intBitsToFloat17;
                d.n0(dVar12, d2, (Float.floatToRawIntBits(f48) & 4294967295L) | (Float.floatToRawIntBits(f51) << 32), (Float.floatToRawIntBits(f50) & 4294967295L) | (Float.floatToRawIntBits(f51) << 32), f47, 1, null, 480);
                h a20 = k.a();
                float f52 = intBitsToFloat18 * 0.28f;
                a20.h(intBitsToFloat17 * 0.22f, f52);
                float f53 = intBitsToFloat18 * 0.86f;
                a20.g(intBitsToFloat17 * 0.28f, f53);
                a20.g(0.72f * intBitsToFloat17, f53);
                a20.g(intBitsToFloat17 * 0.78f, f52);
                d.o0(dVar12, a20, d2, new h(f47, 0.0f, 1, 0, null, 26), 52);
                return zVar;
            default:
                d dVar13 = (d) obj;
                dVar13.getClass();
                float intBitsToFloat19 = Float.intBitsToFloat((int) (dVar13.e() >> 32));
                float intBitsToFloat20 = Float.intBitsToFloat((int) (dVar13.e() & 4294967295L));
                float f54 = intBitsToFloat19 * 0.11f;
                long c16 = r.c(r.f19515d, 0.92f);
                float f55 = intBitsToFloat19 * 0.26f;
                float f56 = intBitsToFloat20 * 0.74f;
                d.n0(dVar13, c16, (Float.floatToRawIntBits(f55) << 32) | (Float.floatToRawIntBits(intBitsToFloat20 * 0.06f) & 4294967295L), (Float.floatToRawIntBits(f55) << 32) | (Float.floatToRawIntBits(f56) & 4294967295L), f54, 1, null, 480);
                d.n0(dVar13, c16, (Float.floatToRawIntBits(f55) << 32) | (Float.floatToRawIntBits(f56) & 4294967295L), (Float.floatToRawIntBits(intBitsToFloat19 * 0.94f) << 32) | (Float.floatToRawIntBits(f56) & 4294967295L), f54, 1, null, 480);
                float f57 = 0.74f * intBitsToFloat19;
                long floatToRawIntBits3 = (Float.floatToRawIntBits(f57) << 32) | (Float.floatToRawIntBits(0.94f * intBitsToFloat20) & 4294967295L);
                float f58 = intBitsToFloat20 * 0.26f;
                d.n0(dVar13, c16, floatToRawIntBits3, (Float.floatToRawIntBits(f57) << 32) | (Float.floatToRawIntBits(f58) & 4294967295L), f54, 1, null, 480);
                d.n0(dVar13, c16, (Float.floatToRawIntBits(f57) << 32) | (Float.floatToRawIntBits(f58) & 4294967295L), (Float.floatToRawIntBits(intBitsToFloat19 * 0.06f) << 32) | (Float.floatToRawIntBits(f58) & 4294967295L), f54, 1, null, 480);
                return zVar;
        }
    }
}
