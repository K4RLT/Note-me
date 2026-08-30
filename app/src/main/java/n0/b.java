package n0;
import b.a;
import f.a;

import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b2.l0;
import b2.w;
import d1.q;
import java.util.LinkedHashMap;
import n.d0;
import o0.r;
import o0.s;
import pf.b0;
import ya.a1;
import ya.vd;

/* loaded from: classes.dex */
public final class b extends q implements h, b2.i, b2.n, w {
    public final v.i I;
    public final boolean J;
    public final float K;
    public final r L;
    public final s M;
    public o N;
    public float O;
    public boolean Q;
    public g S;
    public i T;
    public long P = 0;
    public final d0 R = new d0();

    public b(v.i iVar, boolean z3, float f10, r rVar, s sVar) {
        this.I = iVar;
        this.J = z3;
        this.K = f10;
        this.L = rVar;
        this.M = sVar;
    }

    @Override // d1.q
    public final boolean N0() {
        return false;
    }

    @Override // n0.h
    public final void Q() {
        this.T = null;
        b2.l.k(this);
    }

    @Override // d1.q
    public final void Q0() {
        b0.x(M0(), null, new l5.a(this, null, 1), 3);
    }

    @Override // d1.q
    public final void R0() {
        g gVar = this.S;
        if (gVar != null) {
            Q();
            j6.l lVar = gVar.f20984x;
            i iVar = (i) ((LinkedHashMap) lVar.f18933v).get(this);
            if (iVar != null) {
                iVar.c();
                LinkedHashMap linkedHashMap = (LinkedHashMap) lVar.f18933v;
                i iVar2 = (i) linkedHashMap.get(this);
                if (iVar2 != null) {
                }
                linkedHashMap.remove(this);
                gVar.f20983w.add(iVar);
            }
        }
    }

    public final void Y0(v.m mVar) {
        i iVar;
        if (mVar instanceof v.k) {
            v.k kVar = (v.k) mVar;
            long j10 = this.P;
            float f10 = this.O;
            g gVar = this.S;
            if (gVar == null) {
                gVar = a1.a(a1.b((View) b2.l.h(this, AndroidCompositionLocals_androidKt.f645f)));
                this.S = gVar;
            }
            i a10 = gVar.a(this);
            int b10 = ff.a.b(f10);
            long a11 = this.L.a();
            this.M.invoke();
            a10.b(kVar, this.J, j10, b10, a11, 0.1f, new a2.c(22, this));
            this.T = a10;
            b2.l.k(this);
            return;
        }
        if (mVar instanceof v.l) {
            i iVar2 = this.T;
            if (iVar2 != null) {
                iVar2.d();
                return;
            }
            return;
        }
        if ((mVar instanceof v.j) && (iVar = this.T) != null) {
            iVar.d();
        }
    }

    @Override // b2.n
    public final void e0(l0 l0Var) {
        l0Var.b();
        o oVar = this.N;
        if (oVar != null) {
            oVar.a(l0Var, this.O, this.L.a());
        }
        k1.p j10 = l0Var.f1533u.f20424v.j();
        i iVar = this.T;
        if (iVar != null) {
            long j11 = this.P;
            int b10 = ff.a.b(this.O);
            long a10 = this.L.a();
            this.M.invoke();
            iVar.e(j11, a10, b10, 0.1f);
            iVar.draw(k1.a(j10));
        }
    }

    @Override // b2.w
    public final void m(long j10) {
        float l0;
        this.Q = true;
        y2.c cVar = b2.l.u(this).S;
        this.P = vd.c(j10);
        float f10 = this.K;
        if (Float.isNaN(f10)) {
            l0 = a(cVar, this.J, this.P);
        } else {
            l0 = cVar.l0(f10);
        }
        this.O = l0;
        d0 d0Var = this.R;
        Object[] objArr = d0Var.f20855a;
        int i = d0Var.f20856b;
        for (int i10 = 0; i10 < i; i10++) {
            Y0((v.m) objArr[i10]);
        }
        d0Var.c();
    }
}
