package o0;
import f0.b;
import f0.d;
import f0.e;
import k1.l0;
import k1.p0;
import q0.d;
import r0.m;
import r0.p1;
import r0.r;

import r0.o2;

/* loaded from: classes.dex */
public abstract class m1 {

    /* renamed from: a, reason: collision with root package name */
    public static final o2 f21585a = new p1(n.D);

    public static final p0 a(int i, m mVar) {
        l1 l1Var = (l1) ((r) mVar).j(f21585a);
        switch (d.b(i)) {
            case 0:
                return l1Var.e;
            case 1:
                return b(l1Var.e);
            case 2:
                return l1Var.f21551a;
            case 3:
                return b(l1Var.f21551a);
            case 4:
                return e.f16629a;
            case 5:
                return l1Var.f21554d;
            case 6:
                d dVar = l1Var.f21554d;
                float f10 = (float) 0.0d;
                return d.b(dVar, new b(f10), null, new b(f10), 6);
            case 7:
                return b(l1Var.f21554d);
            case 8:
                return l1Var.f21553c;
            case 9:
                return l0.f19495a;
            case 10:
                return l1Var.f21552b;
            default:
                l4.a.o();
                return null;
        }
    }

    public static final d b(d dVar) {
        float f10 = (float) 0.0d;
        return d.b(dVar, null, new b(f10), new b(f10), 3);
    }
}
