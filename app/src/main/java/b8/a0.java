package b8;
import b0.u;
import j1.b;
import j1.c;
import k1.p;
import m1.d;
import r0.a1;
import r0.j0;
import r2.x;
import y2.l;

import android.graphics.Canvas;
import com.google.android.gms.internal.ads.gl;

/* loaded from: classes.dex */
public final /* synthetic */ class a0 implements df.l {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f1811u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ a1 f1812v;

    public /* synthetic */ a0(a1 a1Var, int i) {
        this.f1811u = i;
        this.f1812v = a1Var;
    }

    @Override // df.l
    public final Object invoke(Object obj) {
        int i = this.f1811u;
        pe.z zVar = pe.z.f22715a;
        a1 a1Var = this.f1812v;
        switch (i) {
            case 0:
                z1.x xVar = (z1.x) obj;
                xVar.getClass();
                a1Var.setValue(z1.h1.i(xVar).u(xVar, true));
                return zVar;
            case 1:
                a1Var.setValue(new l(((l) obj).f30813a));
                return zVar;
            case 2:
                z1.x xVar2 = (z1.x) obj;
                xVar2.getClass();
                long f10 = xVar2.f(0L);
                float k3 = (int) (xVar2.k() >> 32);
                float k4 = (int) (xVar2.k() & 4294967295L);
                c a10 = wa.s8.a(f10, (Float.floatToRawIntBits(k4) & 4294967295L) | (Float.floatToRawIntBits(k3) << 32));
                if (!a10.equals((c) a1Var.getValue())) {
                    a1Var.setValue(a10);
                }
                return zVar;
            case 3:
                Boolean bool = (Boolean) obj;
                bool.getClass();
                a1Var.setValue(bool);
                return zVar;
            case 4:
                a1Var.setValue((String) obj);
                return zVar;
            case 5:
                f fVar = (f) obj;
                fVar.getClass();
                a1Var.setValue(fVar);
                return zVar;
            case 6:
                o5 o5Var = (o5) obj;
                o5Var.getClass();
                a1Var.setValue(o5Var);
                return zVar;
            case 7:
                String str = (String) obj;
                str.getClass();
                a1Var.setValue(str);
                return zVar;
            case 8:
                String str2 = (String) obj;
                str2.getClass();
                a1Var.setValue(str2);
                return zVar;
            case 9:
                a1Var.setValue((String) obj);
                return zVar;
            case 10:
                x xVar3 = (x) obj;
                xVar3.getClass();
                if (xVar3.f24515a.f20477v.length() <= 36) {
                    a1Var.setValue(xVar3);
                }
                return zVar;
            case 11:
                z1.x xVar4 = (z1.x) obj;
                xVar4.getClass();
                a1Var.setValue(xVar4);
                return zVar;
            case 12:
                z1.x xVar5 = (z1.x) obj;
                xVar5.getClass();
                a1Var.setValue(xVar5);
                return zVar;
            case 13:
                z1.x xVar6 = (z1.x) obj;
                xVar6.getClass();
                a1Var.setValue(xVar6);
                return zVar;
            case 14:
                d dVar = (d) obj;
                dVar.getClass();
                a1Var.setValue(dVar.f26033a);
                return zVar;
            case 15:
                z1.x xVar7 = (z1.x) obj;
                xVar7.getClass();
                a1Var.setValue(xVar7);
                return zVar;
            case 16:
                a1Var.setValue(Boolean.TRUE);
                return zVar;
            case 17:
                ((j0) obj).getClass();
                return new u(12, a1Var);
            case 18:
                z1.x xVar8 = (z1.x) obj;
                xVar8.getClass();
                a1Var.setValue(new b(xVar8.f(0L)));
                return zVar;
            case 19:
                z1.x xVar9 = (z1.x) obj;
                xVar9.getClass();
                a1Var.setValue(new b(xVar9.f(0L)));
                return zVar;
            case 20:
                z1.x xVar10 = (z1.x) obj;
                xVar10.getClass();
                a1Var.setValue(new b(xVar10.f(0L)));
                return zVar;
            case gl.zzm /* 21 */:
                a1Var.setValue(Boolean.TRUE);
                return zVar;
            case 22:
                a1Var.setValue(Boolean.TRUE);
                return zVar;
            case 23:
                a1Var.setValue(Boolean.TRUE);
                return zVar;
            case 24:
                x xVar11 = (x) obj;
                xVar11.getClass();
                if (xVar11.f24515a.f20477v.length() <= 24) {
                    a1Var.setValue(xVar11);
                }
                return zVar;
            case 25:
                a1Var.setValue((String) obj);
                return zVar;
            case 26:
                a1Var.setValue((w7.q4) obj);
                return zVar;
            case 27:
                z1.x xVar12 = (z1.x) obj;
                xVar12.getClass();
                a1Var.setValue(new b(xVar12.f(0L)));
                return zVar;
            case 28:
                z1.x xVar13 = (z1.x) obj;
                xVar13.getClass();
                a1Var.setValue(new b(xVar13.f(0L)));
                return zVar;
            default:
                d dVar2 = (d) obj;
                dVar2.getClass();
                p j10 = dVar2.p0().j();
                w7.p9 p9Var = w7.p9.f28915a;
                Canvas a11 = b.a(j10);
                w7.l9 l9Var = (w7.l9) a1Var.getValue();
                l9Var.getClass();
                w7.p9.q(a11, l9Var, Float.intBitsToFloat((int) (dVar2.e() >> 32)), Float.intBitsToFloat((int) (4294967295L & dVar2.e())));
                return zVar;
        }
    }
}
