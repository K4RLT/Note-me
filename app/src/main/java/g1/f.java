package g1;

import b2.j2;
import b2.k0;
import b2.l;
import b2.w;
import d1.q;
import wa.r6;
import wa.s6;
import z5.h;

/* loaded from: classes.dex */
public final class f extends q implements j2, w {
    public f I;
    public f J;
    public long K;

    @Override // d1.q
    public final void R0() {
        this.J = null;
        this.I = null;
    }

    public final boolean Y0() {
        f fVar = this.I;
        if (fVar == null) {
            f fVar2 = this.J;
            if (fVar2 != null) {
                return fVar2.Y0();
            }
            return false;
        }
        return fVar.Y0();
    }

    public final void Z0() {
        f fVar = this.J;
        if (fVar == null) {
            f fVar2 = this.I;
            if (fVar2 != null) {
                fVar2.Z0();
                return;
            }
            return;
        }
        fVar.Z0();
    }

    public final void a1() {
        f fVar = this.J;
        if (fVar != null) {
            fVar.a1();
        }
        f fVar2 = this.I;
        if (fVar2 != null) {
            fVar2.a1();
        }
        this.I = null;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.jvm.internal.y] */
    public final void b1(h hVar) {
        j2 j2Var;
        f fVar;
        f fVar2 = this.I;
        if (fVar2 != null && r6.a(fVar2, s6.a(hVar))) {
            fVar = fVar2;
        } else {
            if (!this.f15688u.H) {
                j2Var = null;
            } else {
                Object obj = new Object();
                l.y(this, new k0(8, (Object) obj, this, hVar));
                j2Var = (j2) obj.f19787u;
            }
            fVar = (f) j2Var;
        }
        if (fVar != null && fVar2 == null) {
            fVar.Z0();
            fVar.b1(hVar);
            f fVar3 = this.J;
            if (fVar3 != null) {
                fVar3.a1();
            }
        } else if (fVar == null && fVar2 != null) {
            f fVar4 = this.J;
            if (fVar4 != null) {
                fVar4.Z0();
                fVar4.b1(hVar);
            }
            fVar2.a1();
        } else if (!kotlin.jvm.internal.l.a(fVar, fVar2)) {
            if (fVar != null) {
                fVar.Z0();
                fVar.b1(hVar);
            }
            if (fVar2 != null) {
                fVar2.a1();
            }
        } else if (fVar != null) {
            fVar.b1(hVar);
        } else {
            f fVar5 = this.J;
            if (fVar5 != null) {
                fVar5.b1(hVar);
            }
        }
        this.I = fVar;
    }

    public final void c1() {
        f fVar = this.J;
        if (fVar == null) {
            f fVar2 = this.I;
            if (fVar2 != null) {
                fVar2.c1();
                return;
            }
            return;
        }
        fVar.c1();
    }

    @Override // b2.j2
    public final Object j() {
        return d.f17381a;
    }

    @Override // b2.w
    public final void m(long j10) {
        this.K = j10;
    }
}