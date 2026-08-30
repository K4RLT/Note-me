package v1;

import b0.h1;
import b2.a2;
import b2.g1;
import b2.h2;
import b2.j2;
import java.util.Collection;

/* loaded from: classes.dex */
public abstract class g extends d1.q implements j2, a2, b2.i {
    public b2.m I;
    public a J;
    public boolean K;

    public g(a aVar, b2.m mVar) {
        this.I = mVar;
        this.J = aVar;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.List, java.lang.Object] */
    @Override // b2.a2
    public final void H(k kVar, l lVar, long j10) {
        if (lVar == l.f27332v) {
            Object r32 = kVar.f27327a;
            int size = ((Collection) r32).size();
            for (int i = 0; i < size; i++) {
                if (b1(((t) r32.get(i)).i)) {
                    int i10 = kVar.e;
                    if (i10 == 4) {
                        this.K = true;
                        a1();
                        return;
                    } else {
                        if (i10 == 5) {
                            c1();
                            return;
                        }
                        return;
                    }
                }
            }
        }
    }

    @Override // b2.a2
    public final void O() {
        c1();
    }

    @Override // d1.q
    public final void R0() {
        c1();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.jvm.internal.y] */
    /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.jvm.internal.m, df.l] */
    public final void Y0() {
        a aVar;
        Object obj = new Object();
        b2.l.x(this, new kotlin.jvm.internal.m(1));
        g gVar = (g) obj.f19787u;
        if (gVar == null || (aVar = gVar.J) == null) {
            aVar = this.J;
        }
        Z0(aVar);
    }

    public abstract void Z0(p pVar);

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.jvm.internal.u, java.lang.Object] */
    public final void a1() {
        Object obj = new Object();
        obj.f19783u = true;
        b2.l.y(this, new g1.e(obj, 3));
        if (obj.f19783u) {
            Y0();
        }
    }

    public abstract boolean b1(int i);

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.jvm.internal.y] */
    public final void c1() {
        if (this.K) {
            this.K = false;
            if (this.H) {
                Object obj = new Object();
                b2.l.x(this, new h1(obj, 3));
                g gVar = (g) obj.f19787u;
                if (gVar != null) {
                    gVar.Y0();
                } else {
                    Z0(null);
                }
            }
        }
    }

    @Override // b2.a2
    public final long l() {
        b2.m mVar = this.I;
        if (mVar != null) {
            y2.c cVar = b2.l.u(this).S;
            int i = h2.f1476b;
            return g1.c(cVar.t0(mVar.f1536a), cVar.t0(mVar.f1537b), cVar.t0(mVar.f1538c), cVar.t0(mVar.f1539d));
        }
        return h2.f1475a;
    }
}