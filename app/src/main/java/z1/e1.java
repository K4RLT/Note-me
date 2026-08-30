package z1;
import b.a;
import j.a;
import k0.m;
import k0.p;
import k0.r;
import n.a0;
import n.d0;
import n.i0;
import r0.a1;

import android.graphics.Rect;
import ya.td;

/* loaded from: classes.dex */
public final class e1 extends kotlin.jvm.internal.m implements df.l {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f31805u = 1;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f31806v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f31807w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(f1 f1Var, s sVar) {
        super(1);
        this.f31806v = f1Var;
        this.f31807w = sVar;
    }

    @Override // df.l
    public final Object invoke(Object obj) {
        switch (this.f31805u) {
            case 0:
                b2.o0 o0Var = (b2.o0) obj;
                f1 f1Var = (f1) this.f31806v;
                if (f1Var.I.A.h() > 0) {
                    o0Var.f1561u = true;
                    b2.r0 r0Var = o0Var.f1564x;
                    x M0 = r0Var.M0();
                    if (y2.a(o0Var.f1562v, 9223372034707292159L)) {
                        o0Var.f1562v = td.b(M0.v(0L));
                        o0Var.f1563w = M0.k();
                    }
                    r0Var.O0().f1478a0.b();
                    long k3 = M0.k();
                    i0 i0Var = ((s) this.f31807w).f31886z;
                    int i = (int) (k3 >> 32);
                    int i10 = (int) (k3 & 4294967295L);
                    for (p1 p1Var : androidx.compose.ui.layout.b.f638b) {
                        Object g8 = i0Var.g(p1Var);
                        g8.getClass();
                        r1 r1Var = (r1) g8;
                        q1 q1Var = (q1) p1Var;
                        androidx.compose.ui.layout.a(o0Var, q1Var.f31867c, r1Var.f31880h, i, i10);
                        if (((Boolean) r1Var.f31875b.getValue()).booleanValue()) {
                            androidx.compose.ui.layout.a(o0Var, r1Var.f31878f, r1Var.f31881j, i, i10);
                            androidx.compose.ui.layout.a(o0Var, r1Var.f31879g, r1Var.f31882k, i, i10);
                        }
                        androidx.compose.ui.layout.a(o0Var, q1Var.f31868d, r1Var.i, i, i10);
                    }
                    if (f1Var.I.B.h()) {
                        d0 d0Var = f1Var.I.B;
                        Object[] objArr = d0Var.f20855a;
                        int i11 = d0Var.f20856b;
                        for (int i12 = 0; i12 < i11; i12++) {
                            a1 a1Var = (a1) objArr[i12];
                            r rVar = (r) f1Var.I.C.get(i12);
                            Rect rect = (Rect) a1Var.getValue();
                            o0Var.b(rVar.b(), rect.left);
                            o0Var.b(rVar.d(), rect.top);
                            o0Var.b(rVar.c(), rect.right);
                            o0Var.b(rVar.a(), rect.bottom);
                        }
                    }
                }
                return pe.z.f22715a;
            default:
                p pVar = (p) obj;
                m.n((a0) this.f31806v, (r) this.f31807w, pVar, 0, pVar.f19387f.f20524a.f20514a.f20477v.length());
                return pe.z.f22715a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(m mVar, a0 a0Var, r rVar) {
        super(1);
        this.f31806v = a0Var;
        this.f31807w = rVar;
    }
}
