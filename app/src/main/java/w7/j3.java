package w7;
import k.a;
import j.i0;
import k1.h;
import k1.k;
import k1.r;
import m1.d;
import p.a;
import z1.x;

import android.graphics.Path;
import android.graphics.RectF;

/* loaded from: classes.dex */
public final /* synthetic */ class j3 implements df.l {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f28499u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ e3 f28500v;

    public /* synthetic */ j3(e3 e3Var, int i) {
        this.f28499u = i;
        this.f28500v = e3Var;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // df.l
    public final Object invoke(Object obj) {
        i0 p02;
        long r8;
        switch (this.f28499u) {
            case 0:
                d dVar = (d) obj;
                dVar.getClass();
                float intBitsToFloat = Float.intBitsToFloat((int) (dVar.e() >> 32)) / 2.0f;
                float l0 = dVar.l0(12);
                float f10 = -dVar.l0(1);
                float f11 = 2;
                float l02 = dVar.l0(f11);
                float f12 = (float) 4.5d;
                float l03 = intBitsToFloat - dVar.l0(f12);
                float l04 = dVar.l0(f12) + intBitsToFloat;
                h a10 = k.a();
                a10.h(l03, l0);
                float f13 = intBitsToFloat - l02;
                a10.g(f13, f10 + l02);
                float f14 = intBitsToFloat + l02;
                float f15 = (f11 * l02) + f10;
                if (a10.f19482b == null) {
                    a10.f19482b = new RectF();
                }
                RectF rectF = a10.f19482b;
                rectF.getClass();
                rectF.set(f13, f10, f14, f15);
                Path path = a10.f19481a;
                RectF rectF2 = a10.f19482b;
                rectF2.getClass();
                path.arcTo(rectF2, 180.0f, 180.0f, false);
                a10.g(l04, l0);
                a10.d();
                long j10 = ((r) this.f28500v.f28135m.getValue()).f19523a;
                float l05 = dVar.l0(j4.f28501a);
                p02 = dVar.p0();
                r8 = p02.r();
                p02.j().l();
                try {
                    ((ic.c) p02.f18636v).D(l05, 0.0f);
                    d.o0(dVar, a10, j4.f28502b, null, 60);
                    a.v(p02, r8);
                    d.o0(dVar, a10, j10, null, 60);
                    return pe.z.f22715a;
                } finally {
                }
            case 1:
                this.f28500v.D(((Float) obj).floatValue());
                return pe.z.f22715a;
            case 2:
                this.f28500v.f28146x.i(((Float) obj).floatValue());
                return pe.z.f22715a;
            case 3:
                d dVar2 = (d) obj;
                dVar2.getClass();
                float intBitsToFloat2 = Float.intBitsToFloat((int) (dVar2.e() >> 32)) / 2.0f;
                float l06 = dVar2.l0(16);
                float l07 = dVar2.l0(6);
                float l08 = dVar2.l0(7);
                h a11 = k.a();
                a11.h(intBitsToFloat2, -l08);
                float f16 = l06 - l08;
                a11.g(intBitsToFloat2 - l07, f16);
                a11.g(intBitsToFloat2 + l07, f16);
                a11.d();
                long j11 = ((r) this.f28500v.f28136n.getValue()).f19523a;
                float l09 = dVar2.l0(j4.f28501a);
                p02 = dVar2.p0();
                r8 = p02.r();
                p02.j().l();
                try {
                    ((ic.c) p02.f18636v).D(l09, 0.0f);
                    d.o0(dVar2, a11, j4.f28502b, null, 60);
                    a.v(p02, r8);
                    d.o0(dVar2, a11, j11, null, 60);
                    return pe.z.f22715a;
                } finally {
                }
            case 4:
                this.f28500v.D(((Float) obj).floatValue());
                return pe.z.f22715a;
            case 5:
                this.f28500v.f28145w.i(((Float) obj).floatValue());
                return pe.z.f22715a;
            case 6:
                d dVar3 = (d) obj;
                dVar3.getClass();
                float intBitsToFloat3 = Float.intBitsToFloat((int) (dVar3.e() >> 32)) / 2.0f;
                float l010 = dVar3.l0((float) 1.7d);
                float f17 = (float) 6.2d;
                float l011 = intBitsToFloat3 - dVar3.l0(f17);
                float l012 = dVar3.l0(f17) + intBitsToFloat3;
                float l013 = dVar3.l0(14);
                float l014 = dVar3.l0((float) 0.6d);
                float f18 = -dVar3.l0((float) 7.3d);
                h a12 = k.a();
                a12.h(l011, l013);
                a12.g(l011, l014 + l010);
                float f19 = 0.64f * l010;
                a12.j(l011, l014, l011 + l010, l014 - f19);
                a12.g(l012 - l010, f19 + f18);
                a12.j(l012, f18, l012, f18 + l010);
                a12.g(l012, l013);
                a12.d();
                long j12 = ((r) this.f28500v.f28137o.getValue()).f19523a;
                float l015 = dVar3.l0(j4.f28501a);
                p02 = dVar3.p0();
                r8 = p02.r();
                p02.j().l();
                try {
                    ((ic.c) p02.f18636v).D(l015, 0.0f);
                    d.o0(dVar3, a12, j4.f28502b, null, 60);
                    a.v(p02, r8);
                    d.o0(dVar3, a12, j12, null, 60);
                    return pe.z.f22715a;
                } finally {
                }
            case 7:
                this.f28500v.D(((Float) obj).floatValue());
                return pe.z.f22715a;
            case 8:
                x xVar = (x) obj;
                xVar.getClass();
                this.f28500v.H.setValue(Integer.valueOf((int) (xVar.k() & 4294967295L)));
                return pe.z.f22715a;
            case 9:
                Integer num = (Integer) obj;
                num.getClass();
                this.f28500v.I.setValue(num);
                return pe.z.f22715a;
            case 10:
                x xVar2 = (x) obj;
                xVar2.getClass();
                this.f28500v.J.setValue(Integer.valueOf((int) (xVar2.k() & 4294967295L)));
                return pe.z.f22715a;
            default:
                this.f28500v.f28147y.i(((Float) obj).floatValue());
                return pe.z.f22715a;
        }
    }
}
