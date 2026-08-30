package a1;
import k.a;
import m.h;
import p.i;
import r.c;

import androidx.ink.authoring.compose.InProgressShapesKt;
import androidx.ink.authoring.compose.InProgressStrokesKt;
import b8.a2;
import b8.b2;
import b8.c2;
import b8.g0;
import b8.o1;
import b8.q0;
import b8.q1;
import b8.r1;
import b8.r4;
import b8.s1;
import b8.t1;
import b8.v1;
import b8.x1;
import com.daren.scraply.R;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.android.gms.internal.ads.gl;
import eb.w;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import k1.c0;
import k1.m0;
import pe.z;
import r0.j0;
import z1.h1;
import z1.x;

/* loaded from: classes.dex */
public final /* synthetic */ class j implements df.l {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f205u;

    public /* synthetic */ j(int i) {
        this.f205u = i;
    }

    /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.jvm.internal.w] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.List, java.lang.Object] */
    @Override // df.l
    public final Object invoke(Object obj) {
        z InProgressShapesImpl$lambda$2$0;
        z InProgressStrokesImpl$lambda$3$0;
        int i = 10;
        int i10 = 16;
        int i11 = 3;
        int i12 = 6;
        int i13 = 11;
        int i14 = 8;
        int i15 = 5;
        int i16 = 7;
        int i17 = 2;
        switch (this.f205u) {
            case 0:
                return new l((Map) obj);
            case 1:
                return obj;
            case 2:
                InProgressShapesImpl$lambda$2$0 = InProgressShapesKt.InProgressShapesImpl$lambda$2$0((df.p) obj);
                return InProgressShapesImpl$lambda$2$0;
            case 3:
                InProgressStrokesImpl$lambda$3$0 = InProgressStrokesKt.InProgressStrokesImpl$lambda$3$0((df.p) obj);
                return InProgressStrokesImpl$lambda$3$0;
            case 4:
                synchronized (b1.p.f1387c) {
                    Object r22 = b1.i;
                    int size = ((Collection) r22).size();
                    for (int i18 = 0; i18 < size; i18++) {
                        ((df.l) r22.get(i18)).invoke(obj);
                    }
                }
                return z.f22715a;
            case 5:
                j jVar = b1.p.f1385a;
                return z.f22715a;
            case 6:
                m1.d dVar = (m1.d) obj;
                dVar.getClass();
                float intBitsToFloat = Float.intBitsToFloat((int) (dVar.e() & 4294967295L)) - 0.5f;
                m1.d.n0(dVar, k1.c(k1.r.f19515d, 0.08f), (Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(intBitsToFloat) & 4294967295L), (Float.floatToRawIntBits(Float.intBitsToFloat((int) (dVar.e() >> 32))) << 32) | (Float.floatToRawIntBits(intBitsToFloat) & 4294967295L), 1.0f, 0, null, 496);
                return z.f22715a;
            case 7:
                m1.d dVar2 = (m1.d) obj;
                dVar2.getClass();
                m1.d.n0(dVar2, b8.o.f2470d, (Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(1.0f) & 4294967295L), (Float.floatToRawIntBits(Float.intBitsToFloat((int) (dVar2.e() >> 32))) << 32) | (Float.floatToRawIntBits(1.0f) & 4294967295L), 0.8f, 0, null, 496);
                m1.d.n0(dVar2, b8.o.f2469c, (Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L), (Float.floatToRawIntBits(Float.intBitsToFloat((int) (dVar2.e() >> 32))) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L), 0.8f, 0, null, 496);
                return z.f22715a;
            case 8:
                m1.d dVar3 = (m1.d) obj;
                dVar3.getClass();
                float intBitsToFloat2 = Float.intBitsToFloat((int) (dVar3.e() & 4294967295L)) / 2.0f;
                float intBitsToFloat3 = Float.intBitsToFloat((int) (dVar3.e() >> 32)) / 2.0f;
                float l0 = dVar3.l0(13);
                float l02 = dVar3.l0((float) 3.2d);
                float l03 = dVar3.l0((float) 0.65d) + intBitsToFloat2;
                long j10 = b8.o.f2470d;
                float f10 = 16;
                float f11 = intBitsToFloat3 - l0;
                m1.d.n0(dVar3, j10, (Float.floatToRawIntBits(dVar3.l0(f10)) << 32) | (Float.floatToRawIntBits(l03) & 4294967295L), (Float.floatToRawIntBits(f11) << 32) | (Float.floatToRawIntBits(l03) & 4294967295L), 0.9f, 0, null, 496);
                float f12 = l0 + intBitsToFloat3;
                m1.d.n0(dVar3, j10, (Float.floatToRawIntBits(f12) << 32) | (Float.floatToRawIntBits(l03) & 4294967295L), (Float.floatToRawIntBits(Float.intBitsToFloat((int) (dVar3.e() >> 32)) - dVar3.l0(f10)) << 32) | (Float.floatToRawIntBits(l03) & 4294967295L), 0.9f, 0, null, 496);
                long j11 = b8.o.f2469c;
                m1.d.n0(dVar3, j11, (Float.floatToRawIntBits(dVar3.l0(f10)) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L), (Float.floatToRawIntBits(f11) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L), 0.9f, 0, null, 496);
                m1.d.n0(dVar3, j11, (Float.floatToRawIntBits(f12) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L), (Float.floatToRawIntBits(Float.intBitsToFloat((int) (dVar3.e() >> 32)) - dVar3.l0(f10)) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L), 0.9f, 0, null, 496);
                k1.h a10 = k1.a();
                a10.h(intBitsToFloat3, intBitsToFloat2 - l02);
                a10.g(intBitsToFloat3 + l02, intBitsToFloat2);
                a10.g(intBitsToFloat3, intBitsToFloat2 + l02);
                a10.g(intBitsToFloat3 - l02, intBitsToFloat2);
                a10.d();
                m1.d.o0(dVar3, a10, j11, null, 60);
                float f13 = (float) 1.1d;
                float f14 = 7;
                m1.d.D(dVar3, j11, dVar3.l0(f13), (Float.floatToRawIntBits(intBitsToFloat3 - dVar3.l0(f14)) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L), null, 120);
                m1.d.D(dVar3, j11, dVar3.l0(f13), (Float.floatToRawIntBits(dVar3.l0(f14) + intBitsToFloat3) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L), null, 120);
                return z.f22715a;
            case 9:
                h1.d dVar4 = (h1.d) obj;
                dVar4.getClass();
                final c0 k3 = w.k(qe.h(new k1.r(r4.f2643k), new k1.r(r4.f2644l), new k1.r(r4.f2645m)), 0.0f, Float.intBitsToFloat((int) (dVar4.f17824u.e() & 4294967295L)), 8);
                Object obj2 = new Object();
                obj2.f19785u = 32493;
                final ArrayList arrayList = new ArrayList(380);
                for (int i19 = 0; i19 < 380; i19++) {
                    float intBitsToFloat4 = Float.intBitsToFloat((int) (dVar4.f17824u.e() >> 32)) * b8.o.g(obj2);
                    arrayList.add(new pe.o(new j1.b((Float.floatToRawIntBits(Float.intBitsToFloat((int) (dVar4.f17824u.e() & 4294967295L)) * b8.o.g(obj2)) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat4) << 32)), Float.valueOf((b8.o.g(obj2) * 1.8f) + 0.4f), Float.valueOf((b8.o.g(obj2) * 0.12f) + 0.04f)));
                }
                int i20 = 90;
                final ArrayList arrayList2 = new ArrayList(90);
                int i21 = 0;
                while (true) {
                    float f15 = 4.0f;
                    if (i21 < i20) {
                        float intBitsToFloat5 = Float.intBitsToFloat((int) (dVar4.f17824u.e() >> 32)) * b8.o.g(obj2);
                        float intBitsToFloat6 = Float.intBitsToFloat((int) (dVar4.f17824u.e() & 4294967295L)) * b8.o.g(obj2);
                        float g8 = (b8.o.g(obj2) * 18.0f) + 5.0f;
                        float g10 = (b8.o.g(obj2) - 0.5f) * 4.0f;
                        arrayList2.add(new pe.j(new j1.b((Float.floatToRawIntBits(intBitsToFloat6) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat5) << 32)), new j1.b((Float.floatToRawIntBits(intBitsToFloat5 + g8) << 32) | (Float.floatToRawIntBits(intBitsToFloat6 + g10) & 4294967295L))));
                        i21++;
                        i20 = 90;
                    } else {
                        int i22 = 70;
                        final ArrayList arrayList3 = new ArrayList(70);
                        int i23 = 0;
                        while (i23 < i22) {
                            float intBitsToFloat7 = Float.intBitsToFloat((int) (dVar4.f17824u.e() >> 32)) * b8.o.g(obj2);
                            float intBitsToFloat8 = Float.intBitsToFloat((int) (dVar4.f17824u.e() & 4294967295L)) * b8.o.g(obj2);
                            float g11 = (b8.o.g(obj2) * 14.0f) + f15;
                            float g12 = (b8.o.g(obj2) - 0.5f) * 3.0f;
                            arrayList3.add(new pe.j(new j1.b((Float.floatToRawIntBits(intBitsToFloat8) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat7) << 32)), new j1.b((Float.floatToRawIntBits(intBitsToFloat7 + g11) << 32) | (Float.floatToRawIntBits(intBitsToFloat8 + g12) & 4294967295L))));
                            i23++;
                            i22 = 70;
                            f15 = 4.0f;
                        }
                        final float a11 = dVar4.a() * 8;
                        final float a12 = dVar4.a() * 4;
                        return dVar4.b(new h1.c(0, new df.l() { // from class: b8.i
                            @Override // df.l
                            public final Object invoke(Object obj3) {
                                m1.d dVar5 = (m1.d) obj3;
                                dVar5.getClass();
                                m1.d.q(dVar5, k1.c0.this, 0L, 0L, 0.0f, null, 0, 126);
                                float l04 = dVar5.l0((float) 3.5d);
                                for (float f16 = l04; f16 < Float.intBitsToFloat((int) (dVar5.e() & 4294967295L)); f16 += l04) {
                                    m1.d.n0(dVar5, k1.c(k1.l0.d(4294437596L), 0.07f), (Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(f16) & 4294967295L), (Float.floatToRawIntBits(Float.intBitsToFloat((int) (dVar5.e() >> 32))) << 32) | (Float.floatToRawIntBits(f16) & 4294967295L), 1.0f, 0, null, 496);
                                }
                                Iterator it = arrayList.iterator();
                                it.getClass();
                                while (it.hasNext()) {
                                    Object next = it.next();
                                    next.getClass();
                                    pe.o oVar = (pe.o) next;
                                    m1.d.D(dVar5, k1.c(k1.l0.d(4281869074L), ((Number) oVar.f22705w).floatValue()), ((Number) oVar.f22704v).floatValue(), ((j1.b) oVar.f22703u).f18762a, null, 120);
                                }
                                Iterator it2 = arrayList2.iterator();
                                it2.getClass();
                                while (it2.hasNext()) {
                                    Object next2 = it2.next();
                                    next2.getClass();
                                    pe.j jVar2 = (pe.j) next2;
                                    m1.d.n0(dVar5, k1.c(k1.l0.d(4294701800L), 0.22f), ((j1.b) jVar2.f22693u).f18762a, ((j1.b) jVar2.f22694v).f18762a, 1.0f, 0, null, 496);
                                }
                                Iterator it3 = arrayList3.iterator();
                                it3.getClass();
                                while (it3.hasNext()) {
                                    Object next3 = it3.next();
                                    next3.getClass();
                                    pe.j jVar3 = (pe.j) next3;
                                    m1.d.n0(dVar5, k1.c(k1.l0.d(4283051798L), 0.16f), ((j1.b) jVar3.f22693u).f18762a, ((j1.b) jVar3.f22694v).f18762a, 1.0f, 0, null, 496);
                                }
                                List h3 = qe.h(new k1.r(k1.r.f19520k), new k1.r(k1.l0.c(1042091264)));
                                float intBitsToFloat9 = Float.intBitsToFloat((int) (dVar5.e() >> 32)) / 2.0f;
                                float intBitsToFloat10 = Float.intBitsToFloat((int) (dVar5.e() & 4294967295L)) / 2.0f;
                                m1.d.q(dVar5, new k1.j0(h3, null, (Float.floatToRawIntBits(intBitsToFloat9) << 32) | (Float.floatToRawIntBits(intBitsToFloat10) & 4294967295L), j1.e.c(dVar5.e()) * 0.82f, 0), 0L, 0L, 0.0f, null, 0, 126);
                                float f17 = (float) 1.2d;
                                m1.d.n0(dVar5, k1.l0.c(956301311), (Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L), (Float.floatToRawIntBits(Float.intBitsToFloat((int) (dVar5.e() >> 32))) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L), dVar5.l0(f17), 0, null, 496);
                                float intBitsToFloat11 = Float.intBitsToFloat((int) (dVar5.e() & 4294967295L));
                                m1.d.n0(dVar5, k1.l0.c(956301311), (Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L), (Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(intBitsToFloat11) & 4294967295L), dVar5.l0(f17), 0, null, 496);
                                long c10 = k1.l0.c(1073741824);
                                float intBitsToFloat12 = Float.intBitsToFloat((int) (dVar5.e() & 4294967295L));
                                float intBitsToFloat13 = Float.intBitsToFloat((int) (dVar5.e() >> 32));
                                float intBitsToFloat14 = Float.intBitsToFloat((int) (dVar5.e() & 4294967295L));
                                m1.d.n0(dVar5, c10, (Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(intBitsToFloat12) & 4294967295L), (Float.floatToRawIntBits(intBitsToFloat14) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat13) << 32), dVar5.l0(f17), 0, null, 496);
                                float intBitsToFloat15 = Float.intBitsToFloat((int) (dVar5.e() >> 32));
                                float intBitsToFloat16 = Float.intBitsToFloat((int) (dVar5.e() & 4294967295L));
                                m1.d.n0(dVar5, k1.l0.c(1073741824), (Float.floatToRawIntBits(Float.intBitsToFloat((int) (dVar5.e() >> 32))) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L), (Float.floatToRawIntBits(intBitsToFloat16) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat15) << 32), dVar5.l0(f17), 0, null, 496);
                                long j12 = o.f2470d;
                                float l05 = dVar5.l0((float) 0.65d);
                                float f18 = 2 * a11;
                                float intBitsToFloat17 = Float.intBitsToFloat((int) (dVar5.e() >> 32)) - f18;
                                float intBitsToFloat18 = Float.intBitsToFloat((int) (dVar5.e() & 4294967295L)) - f18;
                                long floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat18) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat17) << 32);
                                float f19 = a12;
                                float f20 = (float) 0.75d;
                                m1.d.z0(dVar5, j12, (Float.floatToRawIntBits(r12) << 32) | (Float.floatToRawIntBits(l05 + r12) & 4294967295L), floatToRawIntBits, (Float.floatToRawIntBits(f19) << 32) | (Float.floatToRawIntBits(f19) & 4294967295L), new m1.h(dVar5.l0(f20), 0.0f, 0, 0, null, 30), 224);
                                float intBitsToFloat19 = Float.intBitsToFloat((int) (dVar5.e() >> 32)) - f18;
                                float intBitsToFloat20 = Float.intBitsToFloat((int) (dVar5.e() & 4294967295L)) - f18;
                                m1.d.z0(dVar5, o.f2469c, (Float.floatToRawIntBits(r12) << 32) | (Float.floatToRawIntBits(r12) & 4294967295L), (Float.floatToRawIntBits(intBitsToFloat20) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat19) << 32), (Float.floatToRawIntBits(f19) << 32) | (Float.floatToRawIntBits(f19) & 4294967295L), new m1.h(dVar5.l0(f20), 0.0f, 0, 0, null, 30), 224);
                                return pe.z.f22715a;
                            }
                        }));
                    }
                }
            case 10:
                m1.d dVar5 = (m1.d) obj;
                dVar5.getClass();
                float l04 = dVar5.l0(6);
                float l05 = dVar5.l0(7);
                int i24 = 0;
                for (int i25 = 3; i24 < i25; i25 = 3) {
                    float l06 = dVar5.l0((i24 * 8) + 5);
                    float f16 = -l06;
                    float f17 = l06 * 2.0f;
                    float f18 = l06 + l04;
                    m1.d.z0(dVar5, k1.c(k1.r.f19513b, 0.11f - (i24 * 0.03f)), (Float.floatToRawIntBits(f16 + l05) & 4294967295L) | (Float.floatToRawIntBits(f16) << 32), (Float.floatToRawIntBits(Float.intBitsToFloat((int) (dVar5.e() >> 32)) + f17) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (dVar5.e() & 4294967295L)) + f17) & 4294967295L), (Float.floatToRawIntBits(f18) << 32) | (Float.floatToRawIntBits(f18) & 4294967295L), null, 240);
                    i24++;
                }
                return z.f22715a;
            case 11:
                h1.d dVar6 = (h1.d) obj;
                dVar6.getClass();
                return dVar6.b(new h1.c(0, new j(7)));
            case 12:
                ((m0) obj).getClass();
                return z.f22715a;
            case 13:
                m1.d dVar7 = (m1.d) obj;
                dVar7.getClass();
                float intBitsToFloat9 = Float.intBitsToFloat((int) (dVar7.e() >> 32));
                float intBitsToFloat10 = Float.intBitsToFloat((int) (dVar7.e() & 4294967295L));
                long floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat9 / 2.0f) << 32) | (Float.floatToRawIntBits(0.4f * intBitsToFloat10) & 4294967295L);
                float f19 = intBitsToFloat9 * 0.28f;
                float f20 = 0.075f * intBitsToFloat9;
                for (int i26 = 0; i26 < 16; i26++) {
                    float f21 = 1.06f * f19;
                    double d2 = (i26 / 16) * 2.0f * 3.1415927f;
                    m1.d.D(dVar7, k1.r.f19515d, intBitsToFloat9 * 0.036f, (Float.floatToRawIntBits((((float) Math.cos(d2)) * f21) + Float.intBitsToFloat((int) (floatToRawIntBits >> 32))) << 32) | (Float.floatToRawIntBits((f21 * ((float) Math.sin(d2))) + Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L))) & 4294967295L), null, 120);
                }
                long j12 = k1.r.f19515d;
                float f22 = f20;
                m1.d.D(dVar7, j12, f19, floatToRawIntBits, new m1.h(f22, 0.0f, 0, 0, null, 30), FacebookMediationAdapter.ERROR_FACEBOOK_INITIALIZATION);
                float f23 = 0.42f;
                m1.d.D(dVar7, j12, f19 * 0.42f, floatToRawIntBits, null, 120);
                float intBitsToFloat11 = (f19 * 0.95f) + Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L));
                float f24 = intBitsToFloat10 * 0.94f;
                int[] iArr = {-1, 1};
                int i27 = 0;
                while (i27 < 2) {
                    float c10 = g3.a.c(iArr[i27], f19, f23, Float.intBitsToFloat((int) (floatToRawIntBits >> 32)));
                    float f25 = f22;
                    m1.d.n0(dVar7, k1.r.f19515d, (Float.floatToRawIntBits(c10) << 32) | (Float.floatToRawIntBits(intBitsToFloat11) & 4294967295L), (Float.floatToRawIntBits(((r8 * intBitsToFloat9) * 0.045f) + c10) << 32) | (Float.floatToRawIntBits(f24) & 4294967295L), f25, 0, null, 496);
                    f22 = f25;
                    i27++;
                    iArr = iArr;
                    f23 = 0.42f;
                }
                return z.f22715a;
            case 14:
                ((j0) obj).getClass();
                return new g0(1);
            case 15:
                ((j0) obj).getClass();
                q0 q0Var = q0.f2553a;
                q0.a();
                return new g0(2);
            case 16:
                ((j0) obj).getClass();
                return new g0(0);
            case 17:
                x xVar = (x) obj;
                xVar.getClass();
                q0 q0Var2 = q0.f2553a;
                q0.f2562l.j(h1.i(xVar).u(xVar, true));
                return z.f22715a;
            case 18:
                fg.h hVar = (fg.h) obj;
                hVar.getClass();
                hVar.f16978c = true;
                hVar.f16976a = true;
                return z.f22715a;
            case 19:
                fg.h hVar2 = (fg.h) obj;
                hVar2.getClass();
                hVar2.f16978c = true;
                hVar2.f16976a = true;
                return z.f22715a;
            case 20:
                return Integer.valueOf(((Integer) obj).intValue() + 1);
            case gl.zzm /* 21 */:
                File file = (File) obj;
                file.getClass();
                return Boolean.valueOf(file.exists());
            case 22:
                q1 q1Var = (q1) obj;
                q1Var.getClass();
                String a13 = q1Var.a(R.string.store_tut_try);
                String a14 = q1Var.a(R.string.store_tut_title);
                String a15 = q1Var.a(R.string.store_tut_sub);
                Set set = c2.f1906a;
                return qe.h(new v1(a14, a15, i13), new v1(q1Var.a(R.string.store_tut_open_t), q1Var.a(R.string.store_tut_open_b), 5), new t1(q1Var.a(R.string.store_tut_draw_t), 2, q1Var.a(R.string.store_tut_draw_b), a13), new x1(2, a13), new v1(q1Var.a(R.string.store_tut_photo_t), q1Var.a(R.string.store_tut_photo_b), 15), new s1(a13, 18), new t1(q1Var.a(R.string.store_tut_text_t), 1, q1Var.a(R.string.store_tut_text_b), q1Var.a(R.string.store_tut_drag)), new x1(4, a13), new v1(q1Var.a(R.string.store_tut_page_t), q1Var.a(R.string.store_tut_page_b), 6), new x1(5, a13), new v1(q1Var.a(R.string.store_tut_undo_t), q1Var.a(R.string.store_tut_undo_b), 12), new v1(q1Var.a(R.string.store_tut_done_t), q1Var.a(R.string.store_tut_done_b), 0));
            case 23:
                q1 q1Var2 = (q1) obj;
                q1Var2.getClass();
                String a16 = q1Var2.a(R.string.store_plants_title);
                String a17 = q1Var2.a(R.string.store_common_sub);
                Set set2 = c2.f1906a;
                v1 v1Var = new v1(a16, a17, i14);
                l7.b bVar = l7.b.ROUNDED;
                int i28 = 7;
                return qe.h(v1Var, c2.o(4, q1Var2.a(R.string.store_lbl_name), qe.h(bVar, bVar)), new x1(q1Var2.a(R.string.store_lbl_care), 8, 1), new a2(q1Var2.a(R.string.store_lbl_before), q1Var2.a(R.string.store_lbl_after), true), new b2(q1Var2.a(R.string.store_lbl_list), 14, q1Var2.a(R.string.store_lbl_name), q1Var2.a(R.string.store_lbl_date)), c2.n(l7.b.CIRCLE), new s1(q1Var2.a(R.string.store_lbl_notes), i28), new s1(q1Var2.a(R.string.store_lbl_notes), i28));
            case 24:
                ((q1) obj).getClass();
                ArrayList arrayList4 = new ArrayList(12);
                int i29 = 0;
                for (int i30 = 12; i29 < i30; i30 = 12) {
                    arrayList4.add(new o1(0));
                    i29++;
                }
                return arrayList4;
            case 25:
                switch (((Integer) obj).intValue()) {
                    case 0:
                    case 1:
                    case 10:
                    case 11:
                        return "plain";
                    case 2:
                    case 3:
                    case 8:
                    case 9:
                        return "dots";
                    case 4:
                    case 5:
                        return "kraft";
                    case 6:
                    case 7:
                        return "ruled_margin";
                    default:
                        return null;
                }
            case 26:
                q1 q1Var3 = (q1) obj;
                q1Var3.getClass();
                String a18 = q1Var3.a(R.string.store_pet_title);
                Set set3 = c2.f1906a;
                return qe.h(new s1(a18, i), new o1(1), new o1(i12), new o1(i10), new s1(q1Var3.a(R.string.store_lbl_memories), i10), new s1(q1Var3.a(R.string.store_lbl_care), i17), new s1(q1Var3.a(R.string.store_lbl_vet), 12), new s1(q1Var3.a(R.string.store_lbl_milestones), 0), new o1(i15), new s1(q1Var3.a(R.string.store_lbl_photos), 19), new o1(17), new o1(i));
            case 27:
                q1 q1Var4 = (q1) obj;
                q1Var4.getClass();
                String a19 = q1Var4.a(R.string.store_fitness_title);
                String a20 = q1Var4.a(R.string.store_common_sub);
                Set set4 = c2.f1906a;
                int i31 = 7;
                return qe.h(new v1(a19, a20, i14), new r1(8, q1Var4.a(R.string.store_lbl_goals), false), new b2(q1Var4.a(R.string.store_lbl_workout), 14, q1Var4.a(R.string.store_lbl_exercise), q1Var4.a(R.string.store_lbl_reps)), new b2(q1Var4.a(R.string.store_lbl_workout), 14, q1Var4.a(R.string.store_lbl_exercise), q1Var4.a(R.string.store_lbl_reps)), new x1(q1Var4.a(R.string.store_lbl_habits), 8, 1), new a2(q1Var4.a(R.string.store_lbl_before), q1Var4.a(R.string.store_lbl_after), true), new s1(q1Var4.a(R.string.store_lbl_notes), i31), new s1(q1Var4.a(R.string.store_lbl_notes), i31));
            case 28:
                q1 q1Var5 = (q1) obj;
                q1Var5.getClass();
                String a21 = q1Var5.a(R.string.store_budget_title);
                String a22 = q1Var5.a(R.string.store_common_sub);
                Set set5 = c2.f1906a;
                return qe.h(new v1(a21, a22, i14), new r1(8, q1Var5.a(R.string.store_lbl_goals), false), new b2(q1Var5.a(R.string.store_lbl_expenses), 16, q1Var5.a(R.string.store_lbl_concept), q1Var5.a(R.string.store_lbl_amount)), new b2(q1Var5.a(R.string.store_lbl_expenses), 16, q1Var5.a(R.string.store_lbl_concept), q1Var5.a(R.string.store_lbl_amount)), new b2(q1Var5.a(R.string.store_lbl_savings), 16, q1Var5.a(R.string.store_lbl_concept), q1Var5.a(R.string.store_lbl_amount)), new x1(q1Var5.a(R.string.store_lbl_habits), 6, 1), new s1(q1Var5.a(R.string.store_lbl_notes), i16), new s1(q1Var5.a(R.string.store_lbl_notes), i16));
            default:
                q1 q1Var6 = (q1) obj;
                q1Var6.getClass();
                String a23 = q1Var6.a(R.string.store_sketch_title);
                String a24 = q1Var6.a(R.string.store_common_sub);
                Set set6 = c2.f1906a;
                return qe.h(new v1(a23, a24, i14), new s1(q1Var6.a(R.string.store_quote_draw), i11), new s1(q1Var6.a(R.string.store_lbl_sketch), i16), new s1(q1Var6.a(R.string.store_lbl_sketch), i16), new s1(q1Var6.a(R.string.store_lbl_sketch), i16), new s1(q1Var6.a(R.string.store_lbl_sketch), i16), new a2(q1Var6.a(R.string.store_lbl_before), q1Var6.a(R.string.store_lbl_after), false), new s1(q1Var6.a(R.string.store_lbl_notes), i16));
        }
    }
}