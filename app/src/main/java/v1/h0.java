package v1;
import b0.x;
import p.c0;
import r.d;

import a0.j0;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import b2.a2;
import java.util.ArrayList;
import java.util.Collection;
import pf.r1;
import ya.rc;

/* loaded from: classes.dex */
public final class h0 extends d1.q implements w, y2.c, a2 {
    public Object I;
    public Object J;
    public Object[] K;
    public PointerInputEventHandler L;
    public r1 M;
    public k N = d0.f27293a;
    public final t0.e O;
    public final t0.e P;
    public final t0.e Q;
    public k R;
    public long S;

    public h0(Object obj, Object obj2, Object[] objArr, PointerInputEventHandler pointerInputEventHandler) {
        this.I = obj;
        this.J = obj2;
        this.K = objArr;
        this.L = pointerInputEventHandler;
        t0.e eVar = new t0.e(new g0[16]);
        this.O = eVar;
        this.P = eVar;
        this.Q = new t0.e(new g0[16]);
        this.S = 0L;
    }

    @Override // b2.a2
    public final void C0() {
        a1();
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.List, java.lang.Object] */
    @Override // b2.a2
    public final void H(k kVar, l lVar, long j10) {
        this.S = j10;
        if (lVar == l.f27331u) {
            this.N = kVar;
        }
        te.c cVar = null;
        if (this.M == null) {
            this.M = pf.x(M0(), null, new j0(this, cVar, 20), 1);
        }
        Z0(kVar, lVar);
        Object r42 = kVar.f27327a;
        int size = ((Collection) r42).size();
        int i = 0;
        while (true) {
            if (i < size) {
                if (!d((t) r42.get(i))) {
                    break;
                } else {
                    i++;
                }
            } else {
                kVar = null;
                break;
            }
        }
        this.R = kVar;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.List, java.lang.Object] */
    @Override // b2.a2
    public final void O() {
        k kVar = this.R;
        if (kVar != null) {
            Object r12 = kVar.f27327a;
            int size = ((Collection) r12).size();
            for (int i = 0; i < size; i++) {
                if (((t) r12.get(i)).f27344d) {
                    ArrayList arrayList = new ArrayList(r12.size());
                    int size2 = ((Collection) r12).size();
                    for (int i10 = 0; i10 < size2; i10++) {
                        t tVar = (t) r12.get(i10);
                        long j10 = tVar.f27341a;
                        long j11 = tVar.f27343c;
                        long j12 = tVar.f27342b;
                        float f10 = tVar.e;
                        boolean z3 = tVar.f27344d;
                        arrayList.add(new t(j10, j12, j11, false, f10, j12, j11, z3, z3, tVar.i, 0L));
                    }
                    k kVar2 = new k(arrayList, null);
                    this.N = kVar2;
                    Z0(kVar2, l.f27331u);
                    Z0(kVar2, l.f27332v);
                    Z0(kVar2, l.f27333w);
                    this.R = null;
                    return;
                }
            }
        }
    }

    @Override // d1.q
    public final void R0() {
        a1();
    }

    public final Object Y0(df.p pVar, te.c cVar) {
        pf.l lVar = new pf.l(1, rc.b(cVar));
        lVar.s();
        g0 g0Var = new g0(this, lVar);
        synchronized (this.P) {
            this.O.b(g0Var);
            new te.i(rc.b(rc.a(pVar, g0Var, g0Var))).resumeWith(pe.z.f22715a);
        }
        lVar.u(new c0(11, g0Var));
        return lVar.r();
    }

    public final void Z0(k kVar, l lVar) {
        pf.l lVar2;
        pf.l lVar3;
        synchronized (this.P) {
            t0.e eVar = this.Q;
            eVar.d(eVar.f25619w, this.O);
        }
        try {
            int ordinal = lVar.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        throw new ab.b(false);
                    }
                } else {
                    t0.e eVar2 = this.Q;
                    int i = eVar2.f25619w - 1;
                    Object[] objArr = eVar2.f25617u;
                    if (i < objArr.length) {
                        while (i >= 0) {
                            g0 g0Var = (g0) objArr[i];
                            if (lVar == g0Var.f27311x && (lVar3 = g0Var.f27310w) != null) {
                                g0Var.f27310w = null;
                                lVar3.resumeWith(kVar);
                            }
                            i--;
                        }
                    }
                    this.Q.j();
                }
            }
            t0.e eVar3 = this.Q;
            Object[] objArr2 = eVar3.f25617u;
            int i10 = eVar3.f25619w;
            for (int i11 = 0; i11 < i10; i11++) {
                g0 g0Var2 = (g0) objArr2[i11];
                if (lVar == g0Var2.f27311x && (lVar2 = g0Var2.f27310w) != null) {
                    g0Var2.f27310w = null;
                    lVar2.resumeWith(kVar);
                }
            }
            this.Q.j();
        } catch (Throwable th) {
            this.Q.j();
            throw th;
        }
    }

    @Override // y2.c
    public final float a() {
        return b2.l.u(this).S.a();
    }

    public final void a1() {
        r1 r1Var = this.M;
        if (r1Var != null) {
            r1Var.v(new y1.b("Pointer input was reset", 0));
            this.M = null;
        }
    }

    @Override // b2.j
    public final void d() {
        a1();
    }

    @Override // y2.c
    public final float i0() {
        return b2.l.u(this).S.i0();
    }
}